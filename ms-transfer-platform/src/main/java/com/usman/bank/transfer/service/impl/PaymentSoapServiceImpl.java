/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.service.impl;

import javax.xml.bind.JAXBElement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.usman.bank.constants.UsmanBusinessConstants.CHANNELS;
import com.usman.bank.constants.UsmanDBConstants;
import com.usman.bank.constants.Constants;
import com.usman.bank.constants.TransferConstants;
import com.usman.bank.models.KNetTransferDTO;
import com.usman.bank.models.RequestDTO;
import com.usman.bank.payment.wsdl.InstantDeposit;
import com.usman.bank.payment.wsdl.InstantDepositResponse;
import com.usman.bank.payment.wsdl.ObjectFactory;
import com.usman.bank.payment.wsdl.WsApiUtilityPaymentInDTO;
import com.usman.bank.payment.wsdl.WsApiUtilityPaymentOutDTO;
import com.usman.bank.utils.Utility;
import com.usman.bank.utils.UtilityClass;
import com.usman.bank.transfer.config.MsgTranslator;
import com.usman.bank.transfer.exception.TransferException;
import com.usman.bank.transfer.service.PaymentSoapService;
import com.usman.bank.transfer.soap.config.PaymentSoapClient;

/**
 * Description: This class PaymentSoapServiceImpl.java
 *
 * @author vXebiau
 * @date Nov 6, 2019
 * @version 1.0
 *
 */
@Service
public class PaymentSoapServiceImpl implements PaymentSoapService {

	private static final Logger LOG = LogManager.getLogger(PaymentSoapServiceImpl.class);

	@Autowired
	private ApplicationContext applicationContext;

	@Override
	public WsApiUtilityPaymentOutDTO creditCustomerAccount(KNetTransferDTO transferDto, RequestDTO requestDTO)
			throws TransferException {
		LOG.debug("TransferSoapService.creditCustomerAccount...");
		return instantDeposit(transferDto, requestDTO);
	}

	/**
	 * 
	 * @param transferDto
	 * @param requestDTO
	 * @return
	 */
	private WsApiUtilityPaymentOutDTO instantDeposit(KNetTransferDTO transferDto, RequestDTO requestDTO) {

		WsApiUtilityPaymentOutDTO instantDepositResult = null;
		try {
			LOG.debug("TransferSoapService.instantDeposit by SOAP...");
			PaymentSoapClient paymentClient = applicationContext.getBean(PaymentSoapClient.class);
			LOG.debug("PaymentSoapClient bean created...");

			InstantDeposit instantDeposit = new InstantDeposit();
			JAXBElement<InstantDeposit> paymentReq = new ObjectFactory().createInstantDeposit(instantDeposit);
			instantDeposit.setWSApiUtilityPaymentInDTO(getWsApiUtilityPaymentInDTO(transferDto, requestDTO));
			paymentReq.setValue(instantDeposit);

			InstantDepositResponse instantDepositResponse = paymentClient.instantDeposit(paymentReq);
			LOG.debug("instantDepositResponse: {}", instantDepositResponse.toString());
			instantDepositResult = instantDepositResponse.getInstantDepositResult();
			String results = instantDepositResult.getResults();
			LOG.debug("instantDepositResponse.getResults: {}", results);
			if (!Utility.isEmpty(results)) {
				LOG.info("SOAP Response SUCCESS.Code:{}", instantDepositResult.getErrorCode());
				LOG.info("SOAP Response SUCCESS.Desc:{}", instantDepositResult.getErrorDesc());
				LOG.info("SOAP Response getOlTransactionId:{}", instantDepositResult.getOlTransactionId());
				LOG.info("SOAP Response getTransactionTrackingNumber:{}", instantDepositResult.getTransactionTrackingNumber());
			} else {
				LOG.info("SOAP Response ERROR.Code:{}", instantDepositResult.getErrorCode());
				LOG.info("SOAP Response ERROR.Desc:{}", instantDepositResult.getErrorDesc());
				LOG.info("SOAP Response getOlTransactionId:{}", instantDepositResult.getOlTransactionId());
				LOG.info("SOAP Response getTransactionTrackingNumber:{}", instantDepositResult.getTransactionTrackingNumber());
			}

		} catch (Exception e) {
			LOG.error("SOAP ERROR:" + e.getMessage());
		}
		return instantDepositResult;
	}

	/**
	 * 
	 * @param transferDTO
	 * @param requestDTO
	 * @return
	 * @throws Exception
	 */
	private WsApiUtilityPaymentInDTO getWsApiUtilityPaymentInDTO(KNetTransferDTO transferDTO, RequestDTO requestDTO)
			throws Exception {
		String alTeller = "";
		String userID = "";
		WsApiUtilityPaymentInDTO wsPaymentInDTO = new WsApiUtilityPaymentInDTO();
		try {
			LOG.debug("transferDTO:"+transferDTO.toString());
			if (requestDTO.getChannel() == CHANNELS.CHANNEL_IB_ID) {
				alTeller = UsmanDBConstants.BILL_PAYMENTS_API_CONSTANTS.IB_TELLER;
				userID = UsmanDBConstants.CHARITY_API_CONSTANTS.IB_USER;
			} else if (requestDTO.getChannel() == CHANNELS.CHANNEL_MB_ID) {
				alTeller = UsmanDBConstants.BILL_PAYMENTS_API_CONSTANTS.MB_TELLER;
				userID = UsmanDBConstants.CHARITY_API_CONSTANTS.MB_USER;
			}

			wsPaymentInDTO.setChannelId(requestDTO.getChannel());
			wsPaymentInDTO.setChannelKey(UtilityClass.getWSRequestKey(requestDTO));
			wsPaymentInDTO.setLimitCIF(String.valueOf(transferDTO.getCif()));//176915
			wsPaymentInDTO.setLimitCurrencyCode(TransferConstants.KNET_LIMIT_CURRENCY_CODE);
			// check if this value is correct one.
			wsPaymentInDTO.setLimitTransAmount(String.valueOf(transferDTO.getTransAmount()));
			wsPaymentInDTO.setLimitTransAmountInKwd(String.valueOf(transferDTO.getAmountInKwd()));
			// check if this transfer type is correct
			wsPaymentInDTO.setLimitTransactionType(String.valueOf(transferDTO.getTransferTypeId()));//122
			// need to be checked
			wsPaymentInDTO.setAdecAmount(String.valueOf(transferDTO.getAmountInKwd()));
			wsPaymentInDTO.setAdtValueDate(
					UtilityClass.formatDate(UtilityClass.getCurrentDate(), Constants.DATE_FORMAT.IMAL_DATE_FORMAT));
			wsPaymentInDTO.setAlAPICode(UsmanDBConstants.BILL_PAYMENTS_API_CONSTANTS.API_CODE);
			wsPaymentInDTO.setAlBranchCode(TransferConstants.KNET_BRANCH_CODE); //"992"
			wsPaymentInDTO.setAlChannelID(requestDTO.getChannel().toString()); // need to check this value //"1"
			wsPaymentInDTO.setAlCompany(Constants.CONFIG_GLOBAL_SETUP.COMPANY_CODE);
			wsPaymentInDTO.setAlTeller(alTeller);
			wsPaymentInDTO.setAlTrxType(TransferConstants.KNET_IMAL_TRX_TYPE); //809
			wsPaymentInDTO.setAlUseCardAccNo(TransferConstants.KNET_USE_CARD_ACC_NUM);
			wsPaymentInDTO.setAsAccount(TransferConstants.KNET_GLOB_ACCOUNT); //0150052001
			// Below line is used only for UAT in case there is an issue with iMAL
			if (UtilityClass.isDevOrUAT()) {
				wsPaymentInDTO.setAsAccount(TransferConstants.KNET_GLOB_ACCOUNT);//0150052001
			}
			wsPaymentInDTO.setAsApprovedTrx(UsmanDBConstants.BILL_PAYMENTS_API_CONSTANTS.APPROVED_TRX);
			wsPaymentInDTO.setAsCurrency(TransferConstants.KNET_CURRENCY_CODE);
			wsPaymentInDTO.setAsDateTime(
					UtilityClass.formatDate(UtilityClass.getCurrentDate(), Constants.DATE_FORMAT.IMAL_DATE_FORMAT));
			String bundleMsg = MsgTranslator.toLocale("knet_statement_desc");
			bundleMsg = String.format(bundleMsg, requestDTO.getChannelName(), transferDTO.getKnetRefId());
			wsPaymentInDTO.setAsDesc(bundleMsg);
			bundleMsg = MsgTranslator.toLocaleAr("knet_statement_desc");
			bundleMsg = String.format(bundleMsg, requestDTO.getChannelName(), transferDTO.getKnetRefId());
			wsPaymentInDTO.setAsDescArab(bundleMsg);

			wsPaymentInDTO.setAsMachineName(Constants.CONFIG_GLOBAL_SETUP.MACHINE_NAME);
			wsPaymentInDTO.setAsReference(UsmanDBConstants.BILL_PAYMENTS_API_CONSTANTS.REFERENCE);
			wsPaymentInDTO.setAsToAccount(transferDTO.getToAccount());
			wsPaymentInDTO.setAsUserID(userID);
			wsPaymentInDTO.setMetadataIn(TransferConstants.KNET_ALLOW_LIMIT_CHECK); //Give Error for global type if not 0

			// the user comment has a length limitation of 35 characters. So, cut user’s
			// comment into 4 smaller chunks
			if (transferDTO.getComment() != null) {
				String[] commentsArr = UtilityClass.getIMalComments(transferDTO.getComment());
				wsPaymentInDTO.setAsInstruction1(commentsArr[0]);
				wsPaymentInDTO.setAsInstruction2(commentsArr[1]);
				wsPaymentInDTO.setAsInstruction3(commentsArr[2]);
				wsPaymentInDTO.setAsInstruction4(commentsArr[3]);
			}
			
			LOG.debug("wsPaymentInDTO:"+wsPaymentInDTO.toString());
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return wsPaymentInDTO;
	}

}
