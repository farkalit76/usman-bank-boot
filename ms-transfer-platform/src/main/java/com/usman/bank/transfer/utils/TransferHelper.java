/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.utils;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.usman.bank.constants.Constants;
import com.usman.bank.constants.Constants.KNET_TRANSACTION;
import com.usman.bank.constants.Constants.LOG_TRANS_FIELDS;
import com.usman.bank.constants.Constants.TOKEN;
import com.usman.bank.constants.TransferConstants;
import com.usman.bank.models.CustomersDTO;
import com.usman.bank.models.GlobalConfigurationDTO;
import com.usman.bank.models.KNetTransferDTO;
import com.usman.bank.models.LogMasterDTO;
import com.usman.bank.models.MailDTO;
import com.usman.bank.models.MasterTransactionDTO;
import com.usman.bank.models.RequestDTO;
import com.usman.bank.models.TokenDTO;
import com.usman.bank.utils.UsmanRuntimeEnvironment;
import com.usman.bank.utils.CipherUtility;
import com.usman.bank.utils.Utility;
import com.usman.bank.utils.UtilityClass;
import com.usman.bank.transfer.config.MsgTranslator;
import com.usman.bank.transfer.request.TransferKNetReq;
import com.usman.bank.transfer.validations.LogAuditUtil;

/**
 * Description: This class AccountHelper.java
 *
 * @author vXebiau
 * @date Oct 22, 2019
 * @version 1.0
 *
 */
@Component
public class TransferHelper {

	private static final Logger LOG = LogManager.getLogger(TransferHelper.class);

	static SecureRandom randomGenerator = new SecureRandom();

	@Autowired
	private LogAuditUtil logAuditUtil;
	
	@Value("${knet.dev.hostport}")
	private String devHostport;
	
	@Value("${knet.uat.hostport}")
	private String uatHostport;
	

	/**
	 * Transform KNetTransferDTO object
	 * 
	 * @param knetReq
	 * @param customerDTO
	 * @param toAccountDTO
	 * @param currencyDto
	 * @param requestDTO
	 * @return
	 */
	public void transformKNetTransferDTO(TransferKNetReq knetReq, KNetTransferDTO knetdto, RequestDTO requestDTO) {

		LOG.debug("transformKNetTransferDTO...starterd...");

		Timestamp currentTime = new Timestamp(new Date().getTime());

		knetdto.setCif(knetReq.getCifNumber());
		knetdto.setCustId(Integer.parseInt(knetReq.getCustId()));
		knetdto.setMobileNo(knetReq.getMobileNo());
		// From & to Account Account Details
		knetdto.setToAccount(knetReq.getToAccount());
		if (Utility.isEmpty(knetReq.getFromAccount())) {
			knetdto.setFromAccount("199201003");
		} else {
			knetdto.setFromAccount(knetReq.getFromAccount());
		}
		knetdto.setAmountInKwd(new BigDecimal(knetReq.getTransactionAmount()));
		knetdto.setTransAmount(new BigDecimal(knetReq.getTransactionAmount()));
		knetdto.setComment(knetReq.getComment());

		knetdto.setChannelId(requestDTO.getChannel());
		knetdto.setServiceId(requestDTO.getServiceID());
		knetdto.setChannelKey(requestDTO.getChannelKey());

		knetdto.setTransferTypeId(Constants.TRANSFER_TYPES.PAY_ME);
		knetdto.setStage(KNET_TRANSACTION.TRANS_STAGE_VALUES.CREATE_KNET_PAYMENT);
		knetdto.setStatus(KNET_TRANSACTION.TRANS_STATUS_VALUES.SUCCESS);

		knetdto.setAppTarnsDate(currentTime);
		knetdto.setDbTransDate(currentTime);
		knetdto.setExpiryDate(currentTime);

		knetdto.setSmsMsg("");
		knetdto.setMsgDeliveryType(0);
		knetdto.setIsSmsSent(0);
		knetdto.setEventName(null);
		knetdto.setNoOfPayments(1);
		knetdto.setRemainingAmount(111);
		knetdto.setBbynRefId(generateRefId());
		knetdto.setShowRemaining(0);
		knetdto.setParentId(0);
		knetdto.setConsigneeName(knetReq.getConsigneeName());

		LOG.debug("transformKNetTransferDTO.knetDto:" + knetdto.toString());
	}

	/**
	 * Generate reference ID
	 * 
	 * @return
	 */
	public String generateRefId() {
		Timestamp currentDate = new Timestamp(new Date().getTime());
		Calendar cal = Calendar.getInstance();
		cal.setTime(currentDate);
		String dayofMonth = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
		return dayofMonth + String.valueOf(UtilityClass.generateRandomNumber(3));
	}

	/**
	 * Generate Token DTO
	 * 
	 * @param knetdto
	 * @throws Exception
	 * @return
	 */
	public TokenDTO generateTokenDto(KNetTransferDTO knetdto) throws Exception {
		TokenDTO tokenDto = new TokenDTO();
		int tokenType = Constants.TOKEN.TYPES.PAY_ME_TOKEN;
		if (knetdto.getNoOfPayments() > 1) {
			tokenType = Constants.TOKEN.TYPES.PAYME_MULTIPLE_PAYMENTS;
		}
		tokenDto.setTokenType(tokenType);
		tokenDto.setWrongAttempts(0);
		tokenDto.setCustId(knetdto.getCustId());
		tokenDto.setLinkType(getGlobalConfiguration().getPayMeURLType());
		return tokenDto;
	}

	/**
	 * Generate new token
	 * 
	 * @param tokenDto
	 * @throws Exception
	 * @return
	 */
	public String getNewTokenId(TokenDTO tokenDto) throws Exception {

		String token = null;
		String dayMonthYear;
		int minSeed = 100000000;
		int maxSeed = 900000000;
		Timestamp currentDate = new Timestamp(new Date().getTime());
		Calendar cal = Calendar.getInstance();
		cal.setTime(currentDate);
		dayMonthYear = String.valueOf(cal.get(Calendar.DAY_OF_MONTH)) + String.valueOf(cal.get(Calendar.MONTH))
				+ String.valueOf(cal.get(Calendar.YEAR));
		if (tokenDto.getTokenType() == Constants.TOKEN.TYPES.PAY_ME_TOKEN
				|| tokenDto.getTokenType() == Constants.TOKEN.TYPES.PAYME_MULTIPLE_PAYMENTS) {
			// Note that n will never be 11 digits (1000000000) since nextInt(900000000) can
			// at most return 89999999
			token = TransferConstants.STR_NINE + (minSeed + randomGenerator.nextInt(maxSeed));
		} else {
			UUID uuid = UUID.randomUUID();
			token = uuid.toString().substring(0, 8) + Constants.TOKEN.TOKEN_DELIMITER
					+ tokenDto.getTokenDetails().get(Constants.TOKEN.FIELDS.CREATED_BY_CIF)
					+ Constants.TOKEN.TOKEN_DELIMITER + dayMonthYear;
		}
		LOG.debug("New generated Token :" + token);
		return token;
	}

	/**
	 * Create a master data for each KNet transfer transaction.
	 * 
	 * @param kNetDTO
	 * @param requestDTO
	 * @throws Exception
	 * @return
	 */
	public MasterTransactionDTO generateMasterTransactionDTO(KNetTransferDTO kNetDTO, RequestDTO requestDTO)
			throws Exception {
		MasterTransactionDTO masterDTO = new MasterTransactionDTO();
		masterDTO.setBankId(1);
		masterDTO.setChannelId(requestDTO.getChannel());
		masterDTO.setChannelKey(requestDTO.getChannelKey());
		masterDTO.setCustomerCIF(kNetDTO.getCif());
		masterDTO.setFromAccountId(kNetDTO.getFromAccount());
		masterDTO.setToAccountId(kNetDTO.getToAccount());
		masterDTO.setTransAmount(kNetDTO.getTransAmount());
		masterDTO.setTransAmountInKwd(kNetDTO.getAmountInKwd());
		masterDTO.setComments(kNetDTO.getComment());
		masterDTO.setComments2(kNetDTO.getComment());
		masterDTO.setTransferTypeId(kNetDTO.getTransferTypeId());
		masterDTO.setTransferStatusTypeId(kNetDTO.getStatus());
		masterDTO.setTransactionStage(kNetDTO.getStage());
		masterDTO.setCurrencyId(1);
		return masterDTO;
	}

	/**
	 * Create SMS message with the KNet payment URL link.
	 * 
	 * @param knetDTO
	 * @param customerDTO
	 * @param tokenDTO
	 * @throws Exception
	 */
	public MailDTO generatePaymeSMSMsg(KNetTransferDTO knetDTO, CustomersDTO customerDTO, TokenDTO tokenDTO)
			throws Exception {
		String smsMsg = null;
		String link = null;
		String genderLabel = null;
		String cutomerBreifName = "";

		GlobalConfigurationDTO globalConfigurationDTO = getGlobalConfiguration();

		// define customer name based on language
		if (!UtilityClass.isEmpty(knetDTO.getLang()) && knetDTO.getLang().equals(Constants.BUNDLES.ARABIC_LANGUAGE)) {
			cutomerBreifName = customerDTO.getCustNameAr();
		} else {
			cutomerBreifName = customerDTO.getCustNameEn();
		}

		// Define the gender
		if (customerDTO.getGender().equalsIgnoreCase(Constants.GENDER.MALE)) {
			genderLabel = TransferConstants.STR_MR;
		} else {
			genderLabel = TransferConstants.STR_MRS;
		}

		if (tokenDTO.getTokenType() == Constants.PAY_ME.URL_TYPE.MOBILE_DEEP_LINK) {
			smsMsg = MsgTranslator.toLocale("payme_sms_msg_deep_link");
			smsMsg = String.format(smsMsg, genderLabel, cutomerBreifName, knetDTO.getAmountInKwd(), tokenDTO.getToken(),
					String.valueOf(globalConfigurationDTO.getPayMeExpirationPeriodHours().intValue()));
		} else if (tokenDTO.getTokenType() == Constants.PAY_ME.URL_TYPE.QUERY_STRING) {
			link = getUrlLink(knetDTO, tokenDTO);
			// SMS message
			String tmpMsg = MsgTranslator.toLocale("payme_sms_msg_web_link");
			smsMsg = String.format(tmpMsg, genderLabel, cutomerBreifName, knetDTO.getAmountInKwd(),
					String.valueOf(globalConfigurationDTO.getPayMeExpirationPeriodHours().intValue()), link);
		}
		// set KNet values
		knetDTO.setSmsLink(link);
		knetDTO.setKnetPaymentUrl(link);
		knetDTO.setSmsMsg(smsMsg);
		// send PN if UAT
		return sendEmailAndPNMsg(knetDTO, genderLabel, cutomerBreifName);
	}

	/**
	 * Create KNet Payment Link for URL.
	 * 
	 * @param knetDTO
	 * @param tokenDTO
	 * @return string
	 */
	public String getUrlLink(KNetTransferDTO knetDTO, TokenDTO tokenDTO) throws Exception {
		String link = "";
		String domain = "";
		String bbynEnv = System.getProperty(Constants.BBYN_ENV);
		if (Utility.isEmpty(bbynEnv) || bbynEnv.equals(Constants.DEV_ENV)) {
			domain = devHostport;
		} else {
			domain = uatHostport;
		}
		String bbynHostname = System.getProperty(Constants.BBYN_HOSTNAME);
		String base64Token = CipherUtility.encrypt(tokenDTO.getToken());
		base64Token = Utility.encodeStr(base64Token);
		if (!UtilityClass.isEmpty(bbynHostname)) {
			link = domain + "/knet/pay?env=" + bbynHostname + "&l=" + knetDTO.getLang().toLowerCase()
					+ "&t=" + base64Token;
		} else {
			link = domain + "/knet/pay?l=" + knetDTO.getLang().toLowerCase() + "&t=" + base64Token;
		}
		String linkFirstPart = link.substring(0, link.length() - 2);
		String linkSecondPart = link.substring(link.length() - 2, link.length());
		link = linkFirstPart + linkSecondPart;
		return link;
	}

	/**
	 * Send Email and push Notification
	 * 
	 * @param knetDTO
	 * @param genderLabel
	 * @param cutomerBreifName
	 * @throws Exception
	 */
	private MailDTO sendEmailAndPNMsg(KNetTransferDTO knetDTO, String genderLabel, String cutomerBreifName)
			throws Exception {

		MailDTO mailDTO = new MailDTO();
		GlobalConfigurationDTO globalConfigurationDTO = getGlobalConfiguration();
		String bbynEnv = System.getProperty(Constants.BBYN_ENV);
		if (Utility.isEmpty(bbynEnv) || bbynEnv.equals(Constants.DEV_ENV)) {
			// Send Email & PN if UAT
			String hrefLink = "<a href=\"" + knetDTO.getSmsLink() + "\">" + knetDTO.getSmsLink() + "</a>";
			String tmpMessage = MsgTranslator.toLocale("payme_sms_msg_web_link");
			String pnMsg = String.format(tmpMessage, genderLabel, cutomerBreifName, knetDTO.getAmountInKwd(),
					String.valueOf(globalConfigurationDTO.getPayMeExpirationPeriodHours().intValue()), hrefLink);
			String pnMessage = String.format(pnMsg, genderLabel, cutomerBreifName, knetDTO.getAmountInKwd(),
					String.valueOf(globalConfigurationDTO.getPayMeExpirationPeriodHours().intValue()),
					hrefLink + "<br/>" + knetDTO.getSmsLink());
			LOG.info("\n");
			LOG.info("**** Email & Push Notification Message **** ");
			LOG.info("pnMessage =" + pnMessage);
			LOG.info("link = " + knetDTO.getSmsLink());
			LOG.info("*************** End **************** \n");

			mailDTO.setTo(UsmanRuntimeEnvironment.getDomainConfigValue(Constants.XML_TAG_NAMES.ALTERNATIVE_EMAILS));
			mailDTO.setSubject("Pay Me - SMS: CIF " + knetDTO.getCif());
			mailDTO.setBody("Payment link : " + knetDTO.getKnetPaymentUrl());
			knetDTO.setIsSmsSent(1);

			// TODO - Push Notification with "message title 123456 title 12343"
		} else {
			LOG.info("\n It is DEV enviroment so will not send PN and Email. \n");
			return null;
		}
		return mailDTO;
	}

	/**
	 * Set some constants value
	 * 
	 * @return
	 * @throws Exception
	 */
	public GlobalConfigurationDTO getGlobalConfiguration() throws Exception {
		GlobalConfigurationDTO globalConfigurationDTO = new GlobalConfigurationDTO();
		globalConfigurationDTO.setPayMeURLType(1);
		globalConfigurationDTO.setPayMeExpirationPeriodHours(10.0);
		return globalConfigurationDTO;
	}

	/**
	 * Get the default language.
	 * 
	 * @return
	 */
	public String getLanguage() {
		return Constants.BUNDLES.DEFAULT_LANGUAGE;
	}

	/**
	 * Get dummy Request DTO
	 * 
	 * @param cifNumber
	 * @param sessionId
	 * @return
	 */
	public RequestDTO getRequestDTO(String cifNumber, String sessionId) {
		RequestDTO requestDto = new RequestDTO();
		requestDto.setChannel(TOKEN.FIELDS.CREATED_BY_CIF);
		requestDto.setChannelModule(Constants.CHANNEL_MODULE.DEFAULT);
		requestDto.setRemoteIPAddress(System.getProperty(Constants.BBYN_IP_ADDR));
		requestDto.setServiceID(Constants.Services.PAY_ME_IN_APP);
		HashMap<Integer, Object> requestDetailsMap = new HashMap<>();
		requestDetailsMap.put(LOG_TRANS_FIELDS.CIF_NUMBER, cifNumber);
		requestDto.setRequestDetailsMap(requestDetailsMap);
		requestDto.setChannelKey(Utility.getChannelKey(requestDto));
		requestDto.setSessionID(sessionId);
		requestDto.setChannelName("MB");
		return requestDto;
	}

	/**
	 * Create audit entry for every failure KNet transfer.
	 * 
	 * @param customerID
	 * @param serviceId
	 * @param actionId
	 * @param remarks
	 * @param requestDTO
	 */
	public LogMasterDTO audit(String customerID, Integer serviceId, Integer actionId, String remarks,
			RequestDTO requestDTO) {
		LogMasterDTO logMaster = new LogMasterDTO(null, Integer.parseInt(customerID), serviceId, actionId, remarks);
		logMaster = logAuditUtil.audit("" + customerID, logMaster, false, null, remarks, requestDTO);
		return logMaster;
	}

}
