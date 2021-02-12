/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.web.resource;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.usman.bank.constants.Constants;
import com.usman.bank.constants.Constants.Actions;
import com.usman.bank.constants.Constants.KNET_TRANSACTION;
import com.usman.bank.constants.Constants.Services;
import com.usman.bank.constants.TransferConstants;
import com.usman.bank.models.AccountDTO;
import com.usman.bank.models.CurrencyDTO;
import com.usman.bank.models.CustomersDTO;
import com.usman.bank.models.ErrorDTO;
import com.usman.bank.models.KNetTransferDTO;
import com.usman.bank.models.LogMasterDTO;
import com.usman.bank.models.MailDTO;
import com.usman.bank.models.MasterTransactionDTO;
import com.usman.bank.models.RequestDTO;
import com.usman.bank.models.TokenDTO;
import com.usman.bank.payment.wsdl.WsApiUtilityPaymentOutDTO;
import com.usman.bank.response.CommonDTO;
import com.usman.bank.response.ResponseDTO;
import com.usman.bank.response.ResponseUtils;
import com.usman.bank.response.StatusDTO;
import com.usman.bank.utils.CipherUtility;
import com.usman.bank.utils.Utility;
import com.usman.bank.utils.UtilityClass;
import com.fss.plugin.iPayPipe;
import com.usman.bank.transfer.config.MsgTranslator;
import com.usman.bank.transfer.exception.TransferException;
import com.usman.bank.transfer.request.InitKNetPaymentReq;
import com.usman.bank.transfer.request.KNetPaymentReq;
import com.usman.bank.transfer.request.KNetPaymentResult;
import com.usman.bank.transfer.request.KnetResponseInfo;
import com.usman.bank.transfer.request.TransferInitReq;
import com.usman.bank.transfer.request.TransferKNetReq;
import com.usman.bank.transfer.response.KNetPaymentRes;
import com.usman.bank.transfer.response.KNetTransferRes;
import com.usman.bank.transfer.service.AccountSoapService;
import com.usman.bank.transfer.service.CommonService;
import com.usman.bank.transfer.service.CustomerService;
import com.usman.bank.transfer.service.PaymentSoapService;
import com.usman.bank.transfer.service.TransferService;
import com.usman.bank.transfer.utils.PaypipeHelper;
import com.usman.bank.transfer.utils.TransferHelper;
import com.usman.bank.transfer.validations.TransferValidation;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Description: This class TransferResource.java
 *
 * @author vXebiau
 * @date Oct 27, 2019
 * @version 1.0
 *
 */
@RestController
@RequestMapping(TransferConstants.RESOURCE_NAME)
@Api(value = "Amount Transfer Services", description = "Operations pertaining to amount transfer related services.")
public class TransferResource {

	private static final Logger LOG = LogManager.getLogger(TransferResource.class);

	@Autowired
	private TransferService transferService;

	@Autowired
	private CustomerService customerService;

	@Autowired
	private CommonService commonService;

	@Autowired
	private AccountSoapService accountSoapService;

	@Autowired
	private PaymentSoapService transferSoapService;

	@Autowired
	private HttpSession httpSession;

	@Autowired
	private TransferHelper helper;

	@Autowired
	private PaypipeHelper paypipe;

	/**
	 * Do load all the account for KNet transfer service.
	 * 
	 * @param transferReq
	 * @return
	 */
	@ApiOperation(value = "Load all accounts for transfer.", response = ResponseDTO.class)
	@PostMapping(value = TransferConstants.KNET_INITIATE, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ResponseDTO<CommonDTO>> initPayMeTransfer(@Valid @RequestBody TransferInitReq transferReq) {
		ResponseDTO<CommonDTO> responseDTO = new ResponseDTO<>();
		try {
			LOG.debug("TransferResource.initPayMeTransfer started....{}", transferReq.toString());
			RequestDTO requestDTO = helper.getRequestDTO(transferReq.getCifNumber(), httpSession.getId());
			List<AccountDTO> accountList = accountSoapService.getAccounts(transferReq, requestDTO);
			if (!Utility.isEmpty(accountList) && !accountList.isEmpty()) {
				LOG.debug("TransferResource.initPayMeTransfer accountList....{}", accountList.size());
				responseDTO.setStatus(
						new StatusDTO(true, TransferConstants.ALL_ACCOUNTS_LOADED, Constants.StatusCodes.SUCCESS));
				responseDTO.setResponse(new CommonDTO(accountList));
			} else {
				responseDTO.setStatus(new StatusDTO(false, TransferConstants.CUSTOMER_ACCOUNT_NOT_FOUND,
						Constants.StatusCodes.FAILED));
				responseDTO.setResponse(new CommonDTO(false));
				return ResponseUtils.failure(responseDTO);
			}
		} catch (Exception ex) {
			LOG.error(ex);
			responseDTO.setStatus(new StatusDTO(false, ex.getMessage(), Constants.StatusCodes.EXCEPTION));
			responseDTO.setResponse(new CommonDTO(false));
			return ResponseUtils.failure(responseDTO);
		}
		return ResponseUtils.success(responseDTO);
	}

	/**
	 * Validate request details before KNet transfer.
	 * 
	 * @param knetReq
	 * @return
	 */
	@ApiOperation(value = "Validate request details before KNet transfer.", response = ResponseDTO.class)
	@PostMapping(value = TransferConstants.KNET_VALIDATE, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ResponseDTO<CommonDTO>> validatePayMeTransfer(@Valid @RequestBody TransferKNetReq knetReq) {
		ResponseDTO<CommonDTO> responseDTO = new ResponseDTO<>();
		try {
			LOG.debug("TransferResource.validatePayMeTransfer started....{}", knetReq.toString());
			// Validate the input values
			ErrorDTO<String> validateInput = TransferValidation.validateInput(knetReq);
			if (!Utility.isEmpty(validateInput) && !Utility.isEmpty(validateInput.getErrorDescription())) {
				responseDTO.setStatus(new StatusDTO(false, TransferConstants.VALIDATION_INPUT_VALIDATION_FAILED,
						Constants.StatusCodes.FAILED));
				responseDTO.setResponse(new CommonDTO(validateInput));
				return ResponseUtils.failure(responseDTO);
			}
			// Next level validation
			String cifNumber = knetReq.getCifNumber();
			RequestDTO requestDTO = helper.getRequestDTO(cifNumber, httpSession.getId());
			CustomersDTO customerDTO = customerService.getCustomerByCIF(cifNumber);
			AccountDTO toAccountDTO = accountSoapService.getAccountByCIFAndAccount(knetReq.getToAccount(), cifNumber,
					requestDTO);
			LOG.debug("toAccountDTO:" + toAccountDTO.toString());
			CurrencyDTO currencyDTO = commonService.getCurrencies(knetReq.getCurrencyId());
			// Validate whether the customer, accounts and currency exists?
			ErrorDTO<String> validateCustomerAcc = TransferValidation.validateCustomerAccount(customerDTO, toAccountDTO,
					currencyDTO);
			if (!Utility.isEmpty(validateCustomerAcc) && !Utility.isEmpty(validateCustomerAcc.getErrorDescription())) {
				responseDTO.setStatus(
						new StatusDTO(false, TransferConstants.VALIDATION_CUSTOMER_OR_ACCOUNT_DOES_NOT_EXISTS,
								Constants.StatusCodes.FAILED));
				responseDTO.setResponse(new CommonDTO(validateCustomerAcc));
				return ResponseUtils.failure(responseDTO);
			}
			// Create transfer data object for DB
			KNetTransferDTO knetdto = new KNetTransferDTO();
			knetdto.setLang(helper.getLanguage());
			knetdto.setEmailId(customerDTO.getEmail());
			knetdto.setCurrencyId(currencyDTO.getCurrenyId());
			helper.transformKNetTransferDTO(knetReq, knetdto, requestDTO);
			// return success status
			responseDTO.setStatus(
					new StatusDTO(true, TransferConstants.VALIDATED_SUCCESSFULLY, Constants.StatusCodes.SUCCESS));
			responseDTO.setResponse(new CommonDTO(knetdto));

		} catch (Exception ex) {
			LOG.error(ex);
			responseDTO.setStatus(new StatusDTO(false, ex.getMessage(), Constants.StatusCodes.EXCEPTION));
			responseDTO.setResponse(new CommonDTO(false));
			return ResponseUtils.failure(responseDTO);
		}
		return ResponseUtils.success(responseDTO);
	}

	/**
	 * Payment transfer service, it creates a transaction data after all validation.
	 * 
	 * @param knetReq
	 * @return
	 */
	@ApiOperation(value = "Payment transfer service, it creates a transaction entry.", response = ResponseDTO.class)
	@PostMapping(value = TransferConstants.KNET_PAYMENT_SUBMIT, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ResponseDTO<CommonDTO>> confirmPayMeTransfer(@Valid @RequestBody TransferKNetReq knetReq) {
		ResponseDTO<CommonDTO> responseDTO = new ResponseDTO<>();
		try {
			LOG.debug("TransferResource.confirmPayMeTransfer started....{}", knetReq.toString());
			// Validate the input values
			ErrorDTO<String> validateInput = TransferValidation.validateInput(knetReq);
			if (!Utility.isEmpty(validateInput) && !Utility.isEmpty(validateInput.getErrorDescription())) {
				responseDTO.setStatus(new StatusDTO(false, TransferConstants.VALIDATION_INPUT_VALIDATION_FAILED,
						Constants.StatusCodes.FAILED));
				responseDTO.setResponse(new CommonDTO(validateInput));
				return ResponseUtils.failure(responseDTO);
			}
			// Next level validation
			String cifNumber = knetReq.getCifNumber();
			RequestDTO requestDTO = helper.getRequestDTO(cifNumber, httpSession.getId());
			CustomersDTO customerDTO = customerService.getCustomerByCIF(cifNumber);
			AccountDTO toAccountDTO = accountSoapService.getAccountByCIFAndAccount(knetReq.getToAccount(), cifNumber,
					requestDTO);
			CurrencyDTO currencyDTO = commonService.getCurrencies(knetReq.getCurrencyId());
			// Validate whether the customer, accounts and currency exists?
			ErrorDTO<String> validateCustomerAcc = TransferValidation.validateCustomerAccount(customerDTO, toAccountDTO,
					currencyDTO);
			if (!Utility.isEmpty(validateCustomerAcc) && !Utility.isEmpty(validateCustomerAcc.getErrorDescription())) {
				responseDTO.setStatus(
						new StatusDTO(false, TransferConstants.VALIDATION_CUSTOMER_OR_ACCOUNT_DOES_NOT_EXISTS,
								Constants.StatusCodes.FAILED));
				responseDTO.setResponse(new CommonDTO(validateCustomerAcc));
				return ResponseUtils.failure(responseDTO);
			}

			// Create KNet transfer data object
			KNetTransferDTO knetdto = new KNetTransferDTO();
			knetdto.setSessionId(requestDTO.getSessionID());
			knetdto.setLang(helper.getLanguage());
			knetdto.setEmailId(customerDTO.getEmail());
			knetdto.setCurrencyId(currencyDTO.getCurrenyId());
			helper.transformKNetTransferDTO(knetReq, knetdto, requestDTO);

			// Insert KNet transfer entry
			KNetTransferDTO kNetTransferDto = transferService.createTransferEntry(knetdto);
			if (Utility.isEmpty(kNetTransferDto)) {
				responseDTO.setStatus(new StatusDTO(false, TransferConstants.KNET_TRANSFER_CREATION_FAILED));
				responseDTO.setResponse(new CommonDTO(kNetTransferDto));
				return ResponseUtils.failure(responseDTO);
			} else {
				// Generate new token entry
				HashMap<Integer, String> tokenDetails;
				tokenDetails = new HashMap<>();
				tokenDetails.put(Constants.TOKEN.FIELDS.CREATED_BY_CIF, kNetTransferDto.getCif());
				TokenDTO tokendto = helper.generateTokenDto(knetdto);
				tokendto.setTokenDetails(tokenDetails);
				tokendto.setToken(helper.getNewTokenId(tokendto));
				TokenDTO createKNetToken = transferService.createKNetToken(tokendto);
				if (Utility.isEmpty(createKNetToken)) {
					responseDTO.setStatus(new StatusDTO(false, TransferConstants.NEW_TOKEN_CREATION_FAILED,
							Constants.StatusCodes.FAILED));
					responseDTO.setResponse(new CommonDTO(createKNetToken));
					return ResponseUtils.failure(responseDTO);
				}

				// Generate SMS Message & send email and push notification
				MailDTO mailDtoMsg = helper.generatePaymeSMSMsg(kNetTransferDto, customerDTO, createKNetToken);
				transferService.sendEmail(mailDtoMsg);
				// Update transfer status
				kNetTransferDto = transferService.updateTransferEntry(kNetTransferDto);
				if (Utility.isEmpty(kNetTransferDto)) {
					responseDTO.setStatus(new StatusDTO(false, TransferConstants.KNET_TRANSFER_UPDATION_FAILED,
							Constants.StatusCodes.FAILED));
					responseDTO.setResponse(new CommonDTO(kNetTransferDto));
					return ResponseUtils.failure(responseDTO);
				}

				// Create master transaction entry
				MasterTransactionDTO masterDTO = helper.generateMasterTransactionDTO(kNetTransferDto, requestDTO);
				MasterTransactionDTO createTransactionMaster = transferService.createTransactionMaster(masterDTO);
				if (Utility.isEmpty(createTransactionMaster)) {
					responseDTO.setStatus(new StatusDTO(false, TransferConstants.CREATE_MASTER_TRANSACTION_FAILED,
							Constants.StatusCodes.FAILED));
					responseDTO.setResponse(new CommonDTO(createTransactionMaster));
					return ResponseUtils.failure(responseDTO);
				}
				// return success response
				responseDTO.setStatus(new StatusDTO(true, TransferConstants.KNET_TRANSFER_ALL_DATA_CREATED_SUCCESSFULLY,
						Constants.StatusCodes.SUCCESS));
				responseDTO.setResponse(new CommonDTO(kNetTransferDto));
			}
		} catch (Exception ex) {
			LOG.error(ex);
			responseDTO.setStatus(new StatusDTO(false, ex.getMessage(), Constants.StatusCodes.EXCEPTION));
			responseDTO.setResponse(new CommonDTO(false));
			return ResponseUtils.failure(responseDTO);
		}
		return ResponseUtils.success(responseDTO);
	}

	/**
	 * Start the KNet payment confirmation to complete the transaction.
	 * 
	 * @param env
	 * @param lang
	 * @param trans
	 * @return
	 */
	@ApiOperation(value = "Start the KNet payment confirmation.", response = ResponseDTO.class)
	@GetMapping(value = TransferConstants.KNET_PAYMENT_PAY, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseDTO<KNetPaymentRes> initKnetPayment(@RequestParam(value = "env") String env,
			@RequestParam(value = "l") String lang, @RequestParam(value = "t") String trans) {
		ResponseDTO<KNetPaymentRes> responseDTO = new ResponseDTO<>();
		try {
			LOG.debug("TransferResource.initKnetPayment started...");
			InitKNetPaymentReq initReq = new InitKNetPaymentReq();
			if (!Utility.isEmpty(env)) {
				initReq.setEnvironment(env);
			} else {
				initReq.setEnvironment(Constants.Common.STR_EMPTY);
			}
			initReq.setLanguage(lang);
			initReq.setTransaction(trans);
			KNetTransferDTO knetPaymentDTO = transferService.selectKnetPayment(initReq);
			// return success response
			if (!Utility.isEmpty(knetPaymentDTO)) {
				KNetPaymentRes paymentRes = paypipe.transformKNetPaymentRes(knetPaymentDTO);
				responseDTO.setStatus(new StatusDTO(true, TransferConstants.KNET_PAY_INITIATED_SUCCESSFULLY,
						Constants.StatusCodes.SUCCESS));
				responseDTO.setResponse(paymentRes);
			} else {
				responseDTO.setStatus(
						new StatusDTO(false, TransferConstants.KNET_PAY_INIT_FAILED, Constants.StatusCodes.FAILED));
				responseDTO.setResponse(null);
				return responseDTO;
			}
		} catch (

		Exception ex) {
			LOG.error(ex);
			responseDTO.setStatus(new StatusDTO(false, ex.getMessage(), Constants.StatusCodes.EXCEPTION));
			responseDTO.setResponse(null);
			return responseDTO;
		}
		return responseDTO;
	}

	/**
	 * Do KNET transfer and complete the transaction.
	 * 
	 * @param knetReq
	 * @return
	 */
	@ApiOperation(value = "Do KNET transfer and complete the transaction.", response = ResponseDTO.class)
	@PostMapping(value = TransferConstants.KNET_PAYMENT_CONFIRM, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseDTO<KNetTransferDTO> startKnetPayment(@Valid @RequestBody KNetPaymentReq knetReq) {
		ResponseDTO<KNetTransferDTO> responseDTO = new ResponseDTO<>();
		KNetTransferDTO knetdto = new KNetTransferDTO();
		try {
			LOG.debug("TransferResource.startKnetPayment started....{}", knetReq.toString());
			RequestDTO requestDTO = helper.getRequestDTO(knetReq.getCif(), httpSession.getId());
			// get the basic values of pay-pipe
			iPayPipe pipe = paypipe.getPaymentPipe(knetReq);
			pipe.setTrackId(knetReq.getBbynTrackId());
			String language = helper.getLanguage();
			pipe.setLanguage(language.toUpperCase());
			pipe.setUdf2(String.valueOf(knetReq.getCustId()));
			pipe.setUdf3(language);

			// check the paypipe status
			if (pipe.performPaymentInitializationHTTP() != 0) {
				paypipe.updatePaymetFailureMessage(pipe, knetReq);
				// generate KNet values with failed message
				paypipe.generateKNetTransferFailureDTO(knetdto, knetReq, pipe);
				// Insert, update Transfer data
				knetdto = transferService.updateKnetPaymentStatus(knetdto);
				responseDTO.setStatus(new StatusDTO(false, TransferConstants.PAYMENT_CONFIRMATION_FAILED,
						Constants.StatusCodes.FAILED));
				responseDTO.setResponse(knetdto);
				// update audit log message
				LogMasterDTO logMaster = helper.audit(knetReq.getCif(), Services.PAY_ME_IN_APP, Actions.VERIFY,
						TransferConstants.PAYMENT_CONFIRMATION_FAILED, requestDTO);
				transferService.audit(logMaster);
				return responseDTO;
			} else {
				String paymentURL = pipe.getWebAddress();
				LOG.debug("pipe paymentURL:" + paymentURL);
				String tranData = UtilityClass.getParameterQueryMap(paymentURL).get("trandata");
				int result = pipe.parseEncryptedRequest(tranData);
				LOG.debug("pipe parseEncryptedRequest.result:" + result);
				String knetPaymentId = pipe.getPaymentId();
				knetdto.setKnetPaymentId(knetPaymentId);
				knetdto.setKnetPaymentUrl(paymentURL);
				paypipe.updatePaymentMessage(knetReq, knetPaymentId);
				// generate update KNet values
				paypipe.generateKNetTransferDTO(knetdto, knetReq);
				// Insert KNet Transfer data
				knetdto = transferService.updateKnetPayment(knetdto);
				if (!Utility.isEmpty(knetdto)) {
					responseDTO.setStatus(
							new StatusDTO(true, TransferConstants.PAYMENT_CONFIRMATION_PROCESSED_SUCCESSFULLY,
									Constants.StatusCodes.SUCCESS));
					responseDTO.setResponse(knetdto);
				} else {
					responseDTO.setStatus(new StatusDTO(false, TransferConstants.PAYMENT_CONFIRMATION_FAILED,
							Constants.StatusCodes.FAILED));
					responseDTO.setResponse(null);
					return responseDTO;
				}
			}

		} catch (Exception ex) {
			LOG.error(ex);
			responseDTO.setStatus(new StatusDTO(false, ex.getMessage(), Constants.StatusCodes.EXCEPTION));
			responseDTO.setResponse(null);
			return responseDTO;
		}
		return responseDTO;
	}

	@ApiOperation(value = "Response back the KNet payment confirmation.", response = ResponseDTO.class)
	@PostMapping(value = TransferConstants.KNET_PAYMENT_RESPONSE, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseDTO<KNetTransferDTO> knetTransferResponses(@RequestBody KnetResponseInfo knetinfo) {
		ResponseDTO<KNetTransferDTO> responseDTO = new ResponseDTO<>();
		String resultURL = "paymeResult";
		String remarks = "";
		String statusStr = "";
		boolean isValidPaymentDetails = false;
		KNetTransferDTO knetTransferDTO = new KNetTransferDTO();
		try {
			LOG.debug("Step-1:TransferResource.knetTransferResponse started...");
			LOG.debug("trackid....:" + knetinfo.getTrackid());
			LOG.debug("paymentid..:" + knetinfo.getPaymentid());
			LOG.debug("trandata...:" + knetinfo.getTrandata());

			// Get KNet response by track Id
			LOG.debug("Step-2: GetKNetTransferByKNetTrackId...");
			knetTransferDTO = transferService.getKNetTransactionByKNetTrackId(knetinfo.getTrackid());
			if (!Utility.isEmpty(knetTransferDTO)) {
				LOG.debug("getCustId:" + knetTransferDTO.getCustId());
				LOG.debug("getTransferTypeId:" + knetTransferDTO.getTransferTypeId());

				// Check the transaction stage and status to proceed
				LOG.debug("Step-3: Check the transaction stage and status to proceed...");
				if (knetTransferDTO.getStage() != Constants.KNET_TRANSACTION.TRANS_STAGE_VALUES.INITIALIZE_KNET_PAYMENT
						|| knetTransferDTO.getStatus() != Constants.KNET_TRANSACTION.TRANS_STATUS_VALUES.SUCCESS) {
					LOG.debug("**** Transaction stage:{} and status:{} not allowed to proceed:",
							knetTransferDTO.getStage(), knetTransferDTO.getStatus());
					// save audit report and return back
					responseDTO.setStatus(new StatusDTO(false, "KNet payment stage and status not allowed to proceed.",
							Constants.StatusCodes.FAILED));
					responseDTO.setResponse(knetTransferDTO);
					return responseDTO;
				}
				// Create iPaypipe object
				LOG.debug("Step-4: Create iPaypipe object and parseEncryptedRequest...");
				iPayPipe pipe = paypipe.getPipeObject(knetTransferDTO.getTransferTypeId());
				int pipeResult = pipe.parseEncryptedRequest(knetinfo.getTrandata());
				if (pipeResult != 0) {
					LOG.error("Paypipe Found Error:" + pipe.getError());
					responseDTO.setStatus(new StatusDTO(false, "KNet payment pipe object error." + pipe.getError(),
							Constants.StatusCodes.FAILED));
					responseDTO.setResponse(knetTransferDTO);
					return responseDTO;
				} else {
					LOG.info("Paypipe succeeded:....");
					statusStr = pipe.getResult();
					LOG.info("Paypipe statusStr:" + statusStr);
					if (!statusStr.equalsIgnoreCase("CAPTURED")) {
						LOG.info("Paypipe getError:" + pipe.getError());
						LOG.info("Paypipe getError_service_tag:" + pipe.getError_service_tag());
						LOG.info("Paypipe getError_text:" + pipe.getError_text());
						LOG.info("Paypipe getErrorURL:" + pipe.getErrorURL());
					}
					knetTransferDTO.setKnetResponse(statusStr);
					knetTransferDTO.setKnetRefId(pipe.getRef());
					knetTransferDTO.setKnetTrackId(pipe.getTrackId());
					knetTransferDTO.setKnetTransId(pipe.getTransId());
					knetTransferDTO.setKnetPaymentId(pipe.getPaymentId());
					String pDate = pipe.getDate();
					LOG.info("Paypipe pDate:" + pDate);
				}
				// Creating temporary record is just to prevent the duplicate transactions.
				// The primary key of the table will prevent the duplication of KNET_PAYMENT_ID
				LOG.debug("Step-5: Creating temporary record is just to prevent the duplicate transactions...");
				Boolean isValidKnetPayment = transferService.createTmpTransaction(knetTransferDTO,
						helper.getRequestDTO(knetTransferDTO.getCif(), httpSession.getId()));
				LOG.debug("isValidKnetPayment:" + isValidKnetPayment);
				if (!isValidKnetPayment) {
					LOG.debug("We have duplicate transaction for knetPaymentId : " + pipe.getPaymentId());
					paypipe.printDuplicateTransaction(pipe, resultURL, knetTransferDTO.getCif());
					// return with error message
					responseDTO.setStatus(new StatusDTO(false,
							"KNet payment not processed due to duplicate transaction.", Constants.StatusCodes.FAILED));
					responseDTO.setResponse(knetTransferDTO);
					return responseDTO;
				}

				if (statusStr.equalsIgnoreCase("CAPTURED")) {
					isValidPaymentDetails = true;
					remarks = "KNET Transfer Processed successfully";
					LOG.debug("********* We have success knet payment for transID ***:"
							+ knetTransferDTO.getKnetTransId());
					knetTransferDTO.setStatus(Constants.KNET_TRANSACTION.TRANS_STATUS_VALUES.SUCCESS);
				} else {
					LOG.debug("--- We have NOT fully succeeded knet payment for transId:"
							+ knetTransferDTO.getKnetTransId());
					remarks = paypipe.getRemarks(statusStr);
					knetTransferDTO.setStatus(Constants.KNET_TRANSACTION.TRANS_STATUS_VALUES.FAILURE);
				}
				knetTransferDTO.setStage(Constants.KNET_TRANSACTION.TRANS_STAGE_VALUES.PAYMENT_PROCESSING);
				knetTransferDTO.setRemarks(remarks);

				// Update Payment Stage & Status (Success/failure) and create audit report
				LOG.debug("Step-6: Update Payment Status (Success/failure) and create audit report...");
				KNetTransferDTO updateKnetPayment = transferService.updateKnetPaymentStatus(knetTransferDTO);
				LOG.debug("updateKnetPayment with success or false - stage-->:" + updateKnetPayment.getStage());
				LOG.debug("isValidPaymentDetails:" + isValidPaymentDetails);
				if (isValidPaymentDetails) {
					resultURL = creditCustomerAccount(knetinfo.getRef(), knetinfo.getTrackid(), knetinfo.getTrandata(),
							resultURL, knetTransferDTO);
					if (Utility.isEmpty(resultURL)) {
						LOG.debug("Step-SOAP Error***: Return FAILURE Page ...");
						responseDTO.setStatus(new StatusDTO(false, "KNet payment did not succeed SOAP Error.",
								Constants.StatusCodes.FAILED));
						responseDTO.setResponse(knetTransferDTO);
						return responseDTO;
					}
				} else {
					LOG.debug("Step-6***: Return FAILURE Page ...");
					responseDTO.setStatus(new StatusDTO(false,
							"KNet payment did not succeed due to not valid payment details by Paypipe.",
							Constants.StatusCodes.FAILED));
					responseDTO.setResponse(knetTransferDTO);
					return responseDTO;
				}
				// Return SUCCESS Page URL
				knetTransferDTO.setResponseUrl(resultURL);
				LOG.debug("Step-9: Return SUCCESS Page URL...");
				responseDTO.setStatus(
						new StatusDTO(true, "KNet payment response back successfully.", Constants.StatusCodes.SUCCESS));
				responseDTO.setResponse(knetTransferDTO);

			} else {
				LOG.debug("KNet payment response back transaction not found for tranckId :" + knetinfo.getTrackid());
				responseDTO.setStatus(new StatusDTO(false, "KNet payment response back transaction not found.",
						Constants.StatusCodes.FAILED));
				responseDTO.setResponse(knetTransferDTO);
				return responseDTO;
			}
		} catch (Exception ex) {
			LOG.error(ex);
			ex.printStackTrace();
			responseDTO.setStatus(new StatusDTO(false, ex.getMessage(), Constants.StatusCodes.EXCEPTION));
			responseDTO.setResponse(null);
			return responseDTO;
		}
		return responseDTO;
	}

	/**
	 * Response back the KNet payment confirmation to complete the process.
	 * 
	 * @param amt
	 * @param auth
	 * @param authRespCode
	 * @param avr
	 * @param kmsid
	 * @param paymentId
	 * @param postDate
	 * @param ref
	 * @param result
	 * @param trackid
	 * @param trandata
	 * @param udf1
	 * @param udf2
	 * @param udf3
	 * @param udf4
	 * @param udf5
	 * @return
	 */
	@ApiOperation(value = "Response back the KNet payment confirmation.", response = ResponseDTO.class)
	@PostMapping(value = "/knet/responses", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ResponseDTO<CommonDTO>> knetTransferResponse(@RequestParam(value = "amt") String amt,
			@RequestParam(value = "auth") String auth, @RequestParam(value = "authRespCode") String authRespCode,
			@RequestParam(value = "avr") String avr, @RequestParam(value = "kmsid") String kmsid,
			@RequestParam(value = "paymentid") String paymentid, @RequestParam(value = "postdate") String postdate,
			@RequestParam(value = "ref") String ref, @RequestParam(value = "result") String result,
			@RequestParam(value = "trackid") String trackid, @RequestParam(value = "trandata") String trandata,
			@RequestParam(value = "udf1") String udf1, @RequestParam(value = "udf2") String udf2,
			@RequestParam(value = "udf3") String udf3, @RequestParam(value = "udf4") String udf4,
			@RequestParam(value = "udf5") String udf5) {
		ResponseDTO<CommonDTO> responseDTO = new ResponseDTO<>();
		String resultURL = "paymeResult";
		String remarks = "";
		String statusStr = "";
		boolean isValidPaymentDetails = false;
		try {
			LOG.debug("Step-1:TransferResource.knetTransferResponse started...");
			LOG.debug("trackid....:" + trackid);
			LOG.debug("paymentid..:" + paymentid);
			LOG.debug("trandata...:" + trandata);

			// Get KNet response by track Id
			LOG.debug("Step-2: GetKNetTransferByKNetTrackId...");
			KNetTransferDTO knetTransferDTO = transferService.getKNetTransactionByKNetTrackId(trackid);
			if (!Utility.isEmpty(knetTransferDTO)) {
				LOG.debug("getCustId:" + knetTransferDTO.getCustId());
				LOG.debug("getTransferTypeId:" + knetTransferDTO.getTransferTypeId());

				// Check the transaction stage and status to proceed
				LOG.debug("Step-3: Check the transaction stage and status to proceed...");
				if (knetTransferDTO.getStage() != Constants.KNET_TRANSACTION.TRANS_STAGE_VALUES.INITIALIZE_KNET_PAYMENT
						|| knetTransferDTO.getStatus() != Constants.KNET_TRANSACTION.TRANS_STATUS_VALUES.SUCCESS) {
					LOG.debug("**** Transaction stage:{} and status:{} not allowed to proceed:",
							knetTransferDTO.getStage(), knetTransferDTO.getStatus());
					// save audit report and return back
					responseDTO.setStatus(new StatusDTO(false, "KNet payment stage and status not allowed to proceed.",
							Constants.StatusCodes.FAILED));
					responseDTO.setResponse(new CommonDTO(knetTransferDTO));
					return ResponseUtils.failure(responseDTO);
				}
				// Create iPaypipe object
				LOG.debug("Step-4: Create iPaypipe object and parseEncryptedRequest...");
				iPayPipe pipe = paypipe.getPipeObject(knetTransferDTO.getTransferTypeId());
				int pipeResult = pipe.parseEncryptedRequest(trandata);
				if (pipeResult != 0) {
					LOG.error("Paypipe Found Error:" + pipe.getError());
					responseDTO.setStatus(new StatusDTO(false, "KNet payment pipe object error." + pipe.getError(),
							Constants.StatusCodes.FAILED));
					responseDTO.setResponse(new CommonDTO(knetTransferDTO));
					return ResponseUtils.failure(responseDTO);
				} else {
					LOG.info("Paypipe succeeded:....");
					statusStr = pipe.getResult();
					LOG.info("Paypipe statusStr:" + statusStr);
					if (!statusStr.equalsIgnoreCase("CAPTURED")) {
						LOG.info("Paypipe getError:" + pipe.getError());
						LOG.info("Paypipe getError_service_tag:" + pipe.getError_service_tag());
						LOG.info("Paypipe getError_text:" + pipe.getError_text());
						LOG.info("Paypipe getErrorURL:" + pipe.getErrorURL());
					}
					knetTransferDTO.setKnetResponse(statusStr);
					knetTransferDTO.setKnetRefId(pipe.getRef());
					knetTransferDTO.setKnetTrackId(pipe.getTrackId());
					knetTransferDTO.setKnetTransId(pipe.getTransId());
					knetTransferDTO.setKnetPaymentId(pipe.getPaymentId());
					String pDate = pipe.getDate();
					LOG.info("Paypipe pDate:" + pDate);
				}
				// Creating temporary record is just to prevent the duplicate transactions.
				// The primary key of the table will prevent the duplication of KNET_PAYMENT_ID
				LOG.debug("Step-5: Creating temporary record is just to prevent the duplicate transactions...");
				Boolean isValidKnetPayment = transferService.createTmpTransaction(knetTransferDTO,
						helper.getRequestDTO(knetTransferDTO.getCif(), httpSession.getId()));
				LOG.debug("isValidKnetPayment:" + isValidKnetPayment);
				if (!isValidKnetPayment) {
					LOG.debug("We have duplicate transaction for knetPaymentId : " + pipe.getPaymentId());
					paypipe.printDuplicateTransaction(pipe, resultURL, knetTransferDTO.getCif());
					// return with error message
					responseDTO.setStatus(new StatusDTO(false,
							"KNet payment not processed due to duplicate transaction.", Constants.StatusCodes.FAILED));
					responseDTO.setResponse(new CommonDTO(knetTransferDTO));
					return ResponseUtils.failure(responseDTO);
				}

				if (statusStr.equalsIgnoreCase("CAPTURED")) {
					isValidPaymentDetails = true;
					remarks = "KNET Transfer Processed successfully";
					LOG.debug("********* We have success knet payment for transID ***:"
							+ knetTransferDTO.getKnetTransId());
					knetTransferDTO.setStatus(Constants.KNET_TRANSACTION.TRANS_STATUS_VALUES.SUCCESS);
				} else {
					LOG.debug("--- We have NOT fully succeeded knet payment for transId:"
							+ knetTransferDTO.getKnetTransId());
					remarks = paypipe.getRemarks(statusStr);
					knetTransferDTO.setStatus(Constants.KNET_TRANSACTION.TRANS_STATUS_VALUES.FAILURE);
				}
				knetTransferDTO.setStage(Constants.KNET_TRANSACTION.TRANS_STAGE_VALUES.PAYMENT_PROCESSING);
				knetTransferDTO.setRemarks(remarks);

				// Update Payment Stage & Status (Success/failure) and create audit report
				LOG.debug("Step-6: Update Payment Status (Success/failure) and create audit report...");
				KNetTransferDTO updateKnetPayment = transferService.updateKnetPaymentStatus(knetTransferDTO);
				LOG.debug("updateKnetPayment with success or false - stage-->:" + updateKnetPayment.getStage());
				LOG.debug("isValidPaymentDetails:" + isValidPaymentDetails);
				if (isValidPaymentDetails) {
					resultURL = creditCustomerAccount(ref, trackid, trandata, resultURL, knetTransferDTO);
					if (Utility.isEmpty(resultURL)) {
						LOG.debug("Step-SOAP Error***: Return FAILURE Page ...");
						responseDTO.setStatus(new StatusDTO(false, "KNet payment did not succeed SOAP Error.",
								Constants.StatusCodes.FAILED));
						responseDTO.setResponse(new CommonDTO(knetTransferDTO));
						return ResponseUtils.failure(responseDTO);
					}
				} else {
					LOG.debug("Step-6***: Return FAILURE Page ...");
					responseDTO.setStatus(new StatusDTO(false,
							"KNet payment did not succeed due to not valid payment details by Paypipe.",
							Constants.StatusCodes.FAILED));
					responseDTO.setResponse(new CommonDTO(knetTransferDTO));
					return ResponseUtils.failure(responseDTO);
				}
				// Return SUCCESS Page URL
				knetTransferDTO.setResponseUrl(resultURL);
				LOG.debug("Step-9: Return SUCCESS Page URL...");
				responseDTO.setStatus(
						new StatusDTO(true, "KNet payment response back successfully.", Constants.StatusCodes.SUCCESS));
				responseDTO.setResponse(new CommonDTO(knetTransferDTO));

			} else {
				LOG.debug("KNet payment response back transaction not found for tranckId :" + trackid);
				responseDTO.setStatus(new StatusDTO(false, "KNet payment response back transaction not found.",
						Constants.StatusCodes.FAILED));
				responseDTO.setResponse(new CommonDTO(knetTransferDTO));
				return ResponseUtils.failure(responseDTO);
			}
		} catch (Exception ex) {
			LOG.error(ex);
			responseDTO.setStatus(new StatusDTO(false, ex.getMessage(), Constants.StatusCodes.EXCEPTION));
			responseDTO.setResponse(new CommonDTO(false));
			return ResponseUtils.failure(responseDTO);
		}
		return ResponseUtils.success(responseDTO);
	}

	/**
	 * Do a SOAP payment against customer account.
	 * 
	 * @param ref
	 * @param trackid
	 * @param trandata
	 * @param resultURL
	 * @param knetTransferDTO
	 * @return
	 * @throws TransferException
	 */
	private String creditCustomerAccount(String ref, String trackid, String trandata, String resultURL,
			KNetTransferDTO knetTransferDTO) throws TransferException {
		String smsMsg;
		String udf1New;
		KNetTransferDTO updateKnetPayment;
		try {
			// Credit Customer account if captured, check success or partial success
			LOG.debug("Step-7: Credit Customer account if captured...");
			WsApiUtilityPaymentOutDTO wsCreditAccount = transferSoapService.creditCustomerAccount(knetTransferDTO,
					helper.getRequestDTO(knetTransferDTO.getCif(), httpSession.getId()));
			LOG.info("wsCreditAccount::{}", wsCreditAccount);
			if (!Utility.isEmpty(wsCreditAccount) && wsCreditAccount.getErrorCode().equals("0")) {
				LOG.debug("***Amount successfully credited to customer account****");
				LOG.info("wsCreditAccount:ErrorCode:{}, ErrorDesc:{}", wsCreditAccount.getErrorCode(),
						wsCreditAccount.getErrorDesc());
				udf1New = "SUCCESS";
				String msgBundle = MsgTranslator.toLocale("payme_payer_sms_success");
				smsMsg = String.format(msgBundle, knetTransferDTO.getAmountInKwd(), knetTransferDTO.getCif(), ref);
				LOG.debug("Log smsMsg :" + smsMsg);
				// Finally update the KNET Transaction with Status 4.
				knetTransferDTO.setStage(KNET_TRANSACTION.TRANS_STAGE_VALUES.FINALIZE_PAYMENT);
				knetTransferDTO.setRemarks("Settled successfully");
				updateKnetPayment = transferService.updateKnetPaymentStatus(knetTransferDTO);
				LOG.debug("updateKnetPayment with success all in all:" + updateKnetPayment);
			} else {
				LOG.debug("***Amount FAILED to credit to customer account****");
				udf1New = "PARTIAL_SUCCESS";
				LOG.debug("updateKnetPayment with Partial Success:" + udf1New);
				String msgBundle = MsgTranslator.toLocale("payme_payer_sms_partial_success");
				smsMsg = String.format(msgBundle, knetTransferDTO.getAmountInKwd(), knetTransferDTO.getCif(), ref);
				LOG.debug("Log smsMsg :" + smsMsg);
				knetTransferDTO.setStage(KNET_TRANSACTION.TRANS_STAGE_VALUES.PAYMENT_PROCESSING);
				knetTransferDTO.setRemarks("PARTIAL_SUCCESS + Failed to credit the customer account");
				updateKnetPayment = transferService.updateKnetPaymentStatus(knetTransferDTO);
				LOG.debug("updateKnetPayment with failed to credit:" + updateKnetPayment);
				return null;
			}
			// Send SMS to the payer
			LOG.debug("Step-8: Send SMS to the payer...");
			// Create Redirect URL
			resultURL = resultURL + "?trandata=" + trandata + "&udf1=" + CipherUtility.encrypt(udf1New) + "&udf2="
					+ CipherUtility.encrypt(knetTransferDTO.getCif()) + "&paymentId=" + trackid;
			LOG.debug("resultURL:" + resultURL);
		} catch (Exception ex) {
			LOG.error(ex);
			ex.printStackTrace();
			// Update the payment status
			knetTransferDTO.setStage(KNET_TRANSACTION.TRANS_STAGE_VALUES.PAYMENT_PROCESSING);
			knetTransferDTO.setStatus(KNET_TRANSACTION.TRANS_STATUS_VALUES.FAILURE);
			knetTransferDTO.setRemarks("SOAP Error during crediting to customer account.");
			updateKnetPayment = transferService.updateKnetPaymentStatus(knetTransferDTO);
			LOG.debug("updateKnetPayment with SOAP Error during crediting to customer account:" + updateKnetPayment);
			return null;
		}
		return resultURL;
	}

	/**
	 * Response back the KNet payment confirmation to complete the process.
	 * 
	 * @param trandata
	 * @param udf1
	 * @param udf2
	 * @param paymentId
	 * @return
	 */
	@ApiOperation(value = "Response back the KNet payment confirmation.", response = ResponseDTO.class)
	@GetMapping(value = TransferConstants.KNET_PAYMENT_RESULT, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ResponseDTO<CommonDTO>> getKNetTransferResult(
			@RequestParam(value = "trandata") String trandata, @RequestParam(value = "udf1") String udf1,
			@RequestParam(value = "udf2") String udf2, @RequestParam(value = "paymentId") String paymentId) {
		ResponseDTO<CommonDTO> responseDTO = new ResponseDTO<>();
		try {
			LOG.debug("TransferResource.getKNetTransferResult started...");
			LOG.debug("trandata:" + trandata);
			LOG.debug("paymentId(:trackId):" + paymentId);
			KNetPaymentResult knetPayment = new KNetPaymentResult();
			knetPayment.setPaymentId(paymentId);
			knetPayment.setTrandata(trandata);
			knetPayment.setUdf1(udf1);
			knetPayment.setUdf2(udf2);
			// return success response
			if (!Utility.isEmpty(trandata)) {
				KNetTransferDTO knetDto = transferService.getKNetTransactionByKNetTrackId(paymentId);
				responseDTO.setStatus(
						new StatusDTO(true, "KNet payment response success result.", Constants.StatusCodes.SUCCESS));
				responseDTO.setResponse(new CommonDTO(knetDto));
			} else {
				String errorMsg = "We apologize, but a temporary error may have occurred. If you were requesting a payment transaction, please do not re-submit the request before you check your account balance. For support please call 1 82 00 82.";
				responseDTO.setStatus(new StatusDTO(false, errorMsg, Constants.StatusCodes.FAILED));
				responseDTO.setResponse(new CommonDTO(knetPayment));
			}

		} catch (

		Exception ex) {
			LOG.error(ex);
			responseDTO.setStatus(new StatusDTO(false, ex.getMessage(), Constants.StatusCodes.EXCEPTION));
			responseDTO.setResponse(new CommonDTO(false));
			return ResponseUtils.failure(responseDTO);
		}
		return ResponseUtils.success(responseDTO);
	}

	/**
	 * Response back the KNet payment confirmation to complete the process.
	 * 
	 * @param trandata
	 * @param udf1
	 * @param udf2
	 * @param paymentId
	 * @return
	 */
	@ApiOperation(value = "Response back the KNet payment error.", response = ResponseDTO.class)
	@PostMapping(value = TransferConstants.KNET_PAYMENT_ERROR, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ResponseDTO<CommonDTO>> getKNetTransferResponseError() {
		// @RequestParam(value = "tranportalId") String tranportalId
		ResponseDTO<CommonDTO> responseDTO = new ResponseDTO<>();
		try {
			String tranportalId = "";
			LOG.debug("TransferResource.getKNetTransferResponseError started...");
			LOG.debug("tranportalId:" + tranportalId);

			// return success response
			if (!Utility.isEmpty(tranportalId)) {
				responseDTO.setStatus(
						new StatusDTO(true, "KNet payment response error resopnse.", Constants.StatusCodes.SUCCESS));
				responseDTO.setResponse(new CommonDTO("KNet payment response error resopnse."));
			} else {
				String errorMsg = "We apologize, but a temporary error may have occurred. If you were requesting a payment transaction, please do not re-submit the request before you check your account balance. For support please call 1 82 00 82.";
				responseDTO.setStatus(new StatusDTO(false, errorMsg, Constants.StatusCodes.FAILED));
				responseDTO.setResponse(new CommonDTO(tranportalId));
			}

		} catch (Exception ex) {
			LOG.error(ex);
			responseDTO.setStatus(new StatusDTO(false, ex.getMessage(), Constants.StatusCodes.EXCEPTION));
			responseDTO.setResponse(new CommonDTO(false));
			return ResponseUtils.failure(responseDTO);
		}
		return ResponseUtils.success(responseDTO);
	}

	/**
	 * Get the KNET transfer transaction history
	 * 
	 * @return
	 */
	@ApiOperation(value = "Get KNET transfer history from database", response = KNetTransferRes.class)
	@GetMapping(value = TransferConstants.KNET_TRANSFERS_HISTORY, produces = { MediaType.APPLICATION_JSON_VALUE })
	public KNetTransferRes getKnetTransferHistory() {
		KNetTransferRes transferRS = new KNetTransferRes();
		try {
			LOG.debug("TransferResource.getKnetTransferHistory...");
			List<KNetTransferDTO> transferList = transferService.getKnetTransferHistory();
			transferRS.setTransferList(transferList);
		} catch (Exception e) {
			LOG.error("getAccounts Error:" + e.getMessage());
		}
		return transferRS;
	}

	/**
	 * Test a SOAP payment against customer account.
	 * 
	 * @param paymentRes
	 * @return
	 */
	@ApiOperation(value = "KNet SOAP payment for testing only.", response = ResponseDTO.class)
	@PostMapping(value = TransferConstants.KNET_SOAP_PAYMENT, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ResponseDTO<CommonDTO>> createCustomerAccount(
			@Valid @RequestBody KNetPaymentResult paymentRes) {
		ResponseDTO<CommonDTO> responseDTO = new ResponseDTO<>();
		try {
			LOG.debug("TransferResource.createCustomerAccount started....{}", paymentRes.toString());
			KNetTransferDTO knetTransferDTO = transferService.getKNetTransactionByKNetTrackId(paymentRes.getTrackid());
			WsApiUtilityPaymentOutDTO wsCreditAccount = transferSoapService.creditCustomerAccount(knetTransferDTO,
					helper.getRequestDTO(knetTransferDTO.getCif(), httpSession.getId()));
			LOG.info("wsCreditAccount:ErrorCode:{}", wsCreditAccount);
			if (!Utility.isEmpty(wsCreditAccount) && wsCreditAccount.getErrorCode().equals("0")) {
				LOG.info("wsCreditAccount:ErrorCode:{}, ErrorDesc:{}", wsCreditAccount.getErrorCode(),
						wsCreditAccount.getErrorDesc());
				LOG.debug(" with success all in all:");
				responseDTO.setStatus(
						new StatusDTO(true, "KNet payment response success result.", Constants.StatusCodes.SUCCESS));
				responseDTO.setResponse(new CommonDTO(wsCreditAccount.getResults()));
			} else {
				LOG.debug("with NO success all in all:");
				responseDTO.setStatus(new StatusDTO(false,
						"KNet payment not succeeded due to not valid payment details.", Constants.StatusCodes.FAILED));
				responseDTO.setResponse(new CommonDTO(wsCreditAccount.getResults()));
				return ResponseUtils.failure(responseDTO);
			}
		} catch (Exception ex) {
			LOG.error(ex);
			ex.printStackTrace();
			responseDTO.setStatus(new StatusDTO(false, ex.getMessage(), Constants.StatusCodes.EXCEPTION));
			responseDTO.setResponse(new CommonDTO(false));
			return ResponseUtils.failure(responseDTO);
		}
		return ResponseUtils.success(responseDTO);
	}

}
