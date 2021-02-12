/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.repository.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.usman.bank.constants.Constants;
import com.usman.bank.models.KNetTransferDTO;
import com.usman.bank.models.MasterTransactionDTO;
import com.usman.bank.models.TokenDTO;
import com.usman.bank.utils.Utility;
import com.usman.bank.utils.UtilityClass;
import com.usman.bank.transfer.exception.TransferException;
import com.usman.bank.transfer.repository.TransferRepository;
import com.usman.bank.transfer.request.InitKNetPaymentReq;
import com.usman.bank.transfer.utils.SQLConstants;

/**
 * Description: This class TransferRepositoryImpl.java
 *
 * @author vXebiau
 * @date Oct 27, 2019
 * @version 1.0
 *
 */
@Repository
public class TransferRepositoryImpl implements TransferRepository {

	private static final Logger LOG = LogManager.getLogger(TransferRepositoryImpl.class);

	@Autowired
	private NamedParameterJdbcTemplate namedJdbcTemplate;

	@Override
	public KNetTransferDTO createTransferEntry(KNetTransferDTO knetdto) throws TransferException {
		try {
			LOG.debug("TransferRepositoryImpl.createTransferEntry...:{}", knetdto.getCif());
			long bbynPaymentId = nextValue("CUSTS_KNET_PAYMENTS_SEQ");
			String rndNumber = UtilityClass.generateRandomNumber(8) + UtilityClass.getCurrentTimestamp();
			rndNumber = rndNumber.replaceAll("\\:", "").replaceAll(" ", "").replaceAll("\\.", "").trim();
			// used to allow using knet from different machines in UAT
			String bbynHostname = System.getProperty(Constants.BBYN_HOSTNAME);
			String bbynTrackId = null;
			if (UtilityClass.isEmpty(bbynHostname)) {
				bbynTrackId = String.valueOf(bbynPaymentId) + rndNumber;
			} else {
				bbynTrackId = bbynHostname.concat(String.valueOf(bbynPaymentId) + rndNumber);
			}
			MapSqlParameterSource mapParams = new MapSqlParameterSource();
			mapParams.addValue("PAYMENT_ID", bbynPaymentId);
			mapParams.addValue("BBYN_TRACK_ID", bbynTrackId);
			mapParams.addValue("CIF", knetdto.getCif());
			mapParams.addValue("CUST_ID", knetdto.getCustId());
			mapParams.addValue("CHANNEL_ID", knetdto.getChannelId());
			mapParams.addValue("LANG", knetdto.getLang());
			mapParams.addValue("SERVICE_ID", knetdto.getServiceId());
			mapParams.addValue("TRANSFER_TYPE_ID", knetdto.getTransferTypeId());
			mapParams.addValue("AMOUNT_IN_KWD", knetdto.getAmountInKwd());
			mapParams.addValue("FROM_ACCOUNT", knetdto.getFromAccount());
			mapParams.addValue("TO_ACCOUNT", knetdto.getToAccount());
			mapParams.addValue("CURRENCY_ID", knetdto.getCurrencyId());
			mapParams.addValue("USER_COMMENTS", knetdto.getComment());
			mapParams.addValue("APP_TRANS_DATE", knetdto.getAppTarnsDate());
			mapParams.addValue("DB_TRANS_DATE", knetdto.getDbTransDate());
			mapParams.addValue("STAGE", knetdto.getStage());
			mapParams.addValue("STATUS", knetdto.getStatus());
			mapParams.addValue("SESSION_ID", knetdto.getSessionId());
			mapParams.addValue("CHANNEL_KEY", knetdto.getChannelKey());
			mapParams.addValue("CUSTOMER_EMAIL", knetdto.getEmailId());

			mapParams.addValue("MOBILE_NO", knetdto.getMobileNo());
			mapParams.addValue("CONSIGNEE_NAME", knetdto.getConsigneeName());
			mapParams.addValue("EXPIRY_DATE", knetdto.getExpiryDate());
			mapParams.addValue("SMS_MSG", knetdto.getSmsMsg());
			mapParams.addValue("MSG_DELIVERY_TYPE", knetdto.getMsgDeliveryType());
			mapParams.addValue("IS_SMS_SENT", knetdto.getIsSmsSent());
			mapParams.addValue("EVENT_NAME", knetdto.getEventName());
			mapParams.addValue("NO_OF_PAYMENTS", knetdto.getNoOfPayments());
			mapParams.addValue("REMAINING_AMOUNT", knetdto.getRemainingAmount());
			mapParams.addValue("BBYN_REF_ID", knetdto.getBbynRefId());
			mapParams.addValue("SHOW_REMAINING", knetdto.getShowRemaining());
			mapParams.addValue("PARENT_ID", knetdto.getParentId());

			LOG.debug("TransferRepositoryImpl.CREATE_KNET_TRANSFER...:{}", SQLConstants.CREATE_KNET_TRANSFER);
			int count = namedJdbcTemplate.update(SQLConstants.CREATE_KNET_TRANSFER, mapParams);
			if (count != 0) {
				knetdto.setBbynPaymentId(bbynPaymentId);
				knetdto.setBbynTrackId(bbynTrackId);
				return knetdto;
			}

		} catch (Exception e) {
			LOG.error("TransferRepositoryImpl.createTransferEntry:" + e.getMessage());
			LOG.error(e);
			return null;
		}
		return null;
	}

	@Override
	public TokenDTO createKNetToken(TokenDTO tokendto) throws TransferException {
		try {
			LOG.debug("TransferRepositoryImpl.createKNetToken...:{}", tokendto.getToken());
			Timestamp currentTime = new Timestamp(new Date().getTime());
			MapSqlParameterSource mapParams = new MapSqlParameterSource();
			mapParams.addValue("SYS_GUID", nextGUID());
			mapParams.addValue("TOKEN", UtilityClass.hash(null, tokendto.getToken()));
			mapParams.addValue("TOKEN_TYPE", tokendto.getTokenType());
			mapParams.addValue("CUST_ID", tokendto.getCustId());
			mapParams.addValue("DB_CREATED_DATE", currentTime);
			mapParams.addValue("APP_CREATED_DATE", currentTime);
			mapParams.addValue("WRONG_ATTEMPTS", tokendto.getWrongAttempts());
			mapParams.addValue("LINK_TYPE", tokendto.getLinkType());

			int count = namedJdbcTemplate.update(SQLConstants.CREATE_NEW_TOKEN, mapParams);
			if (count != 0) {
				return tokendto;
			}
		} catch (Exception e) {
			LOG.error("TransferRepositoryImpl.createKNetToken:" + e.getMessage());
			LOG.error(e);
			return null;
		}
		return null;
	}

	@Override
	public KNetTransferDTO updateTransferEntry(KNetTransferDTO knetdto) throws TransferException {
		try {
			LOG.debug("TransferRepositoryImpl.updateTransferEntry...:{}", knetdto.getBbynPaymentId());
			MapSqlParameterSource mapParams = new MapSqlParameterSource();
			mapParams.addValue("SMS_MSG", knetdto.getSmsMsg());
			mapParams.addValue("PAYMENT_ID", knetdto.getBbynPaymentId());

			int count = namedJdbcTemplate.update(SQLConstants.UPDATE_KNET_TRANSFER, mapParams);
			if (count != 0) {
				return knetdto;
			}
		} catch (Exception e) {
			LOG.error("TransferRepositoryImpl.updateTransferEntry:" + e.getMessage());
			LOG.error(e);
			return null;
		}
		return null;
	}

	@Override
	public MasterTransactionDTO createTransactionMaster(MasterTransactionDTO masterdto) throws TransferException {
		try {
			LOG.debug("TransferRepositoryImpl.createTransactionMaster...:{}", masterdto.getTransferTypeId());
			Long custTransId = nextValue("CUST_TRANSACTION_ID_SEQ");
			Long confirmationNo = nextValue("CONFIRMATION_NUMBER_SEQ");

			MapSqlParameterSource mapParams = new MapSqlParameterSource();
			mapParams.addValue("CUST_TRANS_ID", custTransId);
			mapParams.addValue("BANK_ID", masterdto.getBankId());
			mapParams.addValue("CHANNEL_ID", masterdto.getChannelId());
			mapParams.addValue("CIF", masterdto.getCustomerCIF());
			mapParams.addValue("FROM_ACCOUNT_ID", masterdto.getFromAccountId());
			mapParams.addValue("TO_ACCOUNT_ID", masterdto.getToAccountId());
			mapParams.addValue("TRANSFER_AMOUNT_IN_KD", masterdto.getTransAmountInKwd());
			mapParams.addValue("TRANSFER_CURRENCY_ID", masterdto.getCurrencyId());
			mapParams.addValue("TRANSFER_TYPE_ID", masterdto.getTransferTypeId());
			mapParams.addValue("TRANSFER_STATUS_TYPE_ID", masterdto.getTransferStatusTypeId());
			mapParams.addValue("AMOUNT", masterdto.getTransAmount());
			mapParams.addValue("COMMENTS", masterdto.getComments());
			mapParams.addValue("CONFIRMATION_NUMBER", confirmationNo);
			mapParams.addValue("WS_CHANNEL_KEY", masterdto.getChannelKey());
			mapParams.addValue("COMMENTS2", masterdto.getComments2());
			mapParams.addValue("TRANSACTION_STAGE", masterdto.getTransactionStage());

			int count = namedJdbcTemplate.update(SQLConstants.CREATE_TRANSACTION_MASTER, mapParams);
			if (count != 0) {
				masterdto.setCustTransId(custTransId);
				masterdto.setConfirmationNumber(confirmationNo);
				return masterdto;
			}
		} catch (Exception e) {
			LOG.error("TransferRepositoryImpl.createTransactionMaster:" + e.getMessage());
			LOG.error(e);
			return null;
		}
		return null;
	}

	@Override
	public KNetTransferDTO updateKnetPayment(KNetTransferDTO knetdto) throws TransferException {
		try {
			LOG.debug("TransferRepositoryImpl.updateKnetPayment...:{}", knetdto.getBbynPaymentId());
			MapSqlParameterSource mapParams = new MapSqlParameterSource();
			mapParams.addValue("KNET_PAYMENT_ID", knetdto.getKnetPaymentId());
			mapParams.addValue("STAGE", knetdto.getStage());
			mapParams.addValue("STATUS", knetdto.getStatus());
			mapParams.addValue("KNET_PAYMENT_URL", knetdto.getKnetPaymentUrl());
			mapParams.addValue("KNET_INIT_DATE", knetdto.getKnetInitDate());
			mapParams.addValue("PAYMENT_ID", knetdto.getBbynPaymentId());

			int count = namedJdbcTemplate.update(SQLConstants.UPDATE_KNET_PAYMENT, mapParams);
			if (count != 0) {
				return knetdto;
			}
		} catch (Exception e) {
			LOG.error("TransferRepositoryImpl.updateKnetPayment:" + e.getMessage());
			LOG.error(e);
			return null;
		}
		return null;
	}
	//

	@Override
	public KNetTransferDTO updateKnetPaymentStatus(KNetTransferDTO knetdto) throws TransferException {
		try {
			LOG.debug("TransferRepositoryImpl.updateKnetPaymentFailure...:{}", knetdto.getBbynPaymentId());
			Timestamp currentTime = new Timestamp(new Date().getTime());
			MapSqlParameterSource mapParams = new MapSqlParameterSource();
			mapParams.addValue("STAGE", knetdto.getStage());
			mapParams.addValue("STATUS", knetdto.getStatus());
			mapParams.addValue("REMARKS", knetdto.getRemarks());
			mapParams.addValue("KNET_TRANS_ID", knetdto.getKnetTransId());
			mapParams.addValue("KNET_RESPONSE", knetdto.getKnetResponse());
			mapParams.addValue("KNET_AUTH_NUMBER", knetdto.getKnetAuthNumber());
			mapParams.addValue("KNET_REFERENCE_ID", knetdto.getKnetRefId());
			mapParams.addValue("DB_DATE_KNET_LAST_RESPONSE", currentTime);
			mapParams.addValue("APP_DATE_KNET_LAST_RESPONSE", currentTime);
			mapParams.addValue("KNET_PAYMENT_ID", knetdto.getKnetPaymentId());
			mapParams.addValue("PAYMENT_ID", knetdto.getBbynPaymentId());

			int count = namedJdbcTemplate.update(SQLConstants.UPDATE_KNET_PAYMENT_FAILURE, mapParams);
			if (count != 0) {
				return knetdto;
			}
		} catch (Exception e) {
			LOG.error("TransferRepositoryImpl.updateKnetPaymentFailure:" + e.getMessage());
			LOG.error(e);
			return null;
		}
		return null;
	}

	@Override
	public KNetTransferDTO selectKnetPayment(InitKNetPaymentReq knetReq) throws TransferException {
		try {

			LOG.debug("TransferRepositoryImpl.selectKnetPayment...");
			MapSqlParameterSource mapParams = new MapSqlParameterSource();
			mapParams.addValue("SMS_MSG", knetReq.getTransaction());
			mapParams.addValue("BBYN_TRACK_ID", knetReq.getEnvironment());
			List<KNetTransferDTO> histories = namedJdbcTemplate.query(SQLConstants.SELECT_KNET_PAYMENT_ENTRY, mapParams,
					new RowMapperKnetTransfer());
			if (!Utility.isEmpty(histories) && !Utility.isEmpty(histories.size())) {
				LOG.debug("TransferRepositoryImpl.selectKnetPayment...histories.size:" + histories.size());
				return histories.get(0);
			}
		} catch (Exception e) {
			LOG.error("TransferRepositoryImpl.selectKnetPayment:" + e.getMessage());
			LOG.error(e);
		}
		return null;
	}

	@Override
	public List<KNetTransferDTO> getKnetTransferHistory() throws TransferException {
		try {
			LOG.debug("TransferRepositoryImpl.getKnetTransferHistory...");
			List<KNetTransferDTO> histories = namedJdbcTemplate.query(SQLConstants.SELECT_KNET_TRANS_HISTORY,
					new RowMapperKnetTransfer());
			if (!Utility.isEmpty(histories) && !Utility.isEmpty(histories.size())) {
				LOG.debug("TransferRepositoryImpl.getKnetTransferHistory...histories.size:" + histories.size());
				return histories;
			}
		} catch (Exception e) {
			LOG.error("TransferRepositoryImpl.getKnetTransferHistory:" + e.getMessage());
			LOG.error(e);
		}
		return new ArrayList<>();
	}

	@Override
	public KNetTransferDTO getKNetTransactionByKNetTrackId(String knetTrackId) throws TransferException {
		try {

			LOG.debug("TransferRepositoryImpl.getKNetTransactionByKNetTrackId...");
			MapSqlParameterSource mapParams = new MapSqlParameterSource();
			mapParams.addValue("BBYN_TRACK_ID", knetTrackId);
			List<KNetTransferDTO> histories = namedJdbcTemplate.query(SQLConstants.SELECT_KNET_PAYMENT_RESPONSE, mapParams,
					new RowMapperKnetTransfer());
			if (!Utility.isEmpty(histories) && !Utility.isEmpty(histories.size())) {
				LOG.debug("TransferRepositoryImpl.getKNetTransactionByKNetTrackId...histories.size:" + histories.size());
				return histories.get(0);
			}
		} catch (Exception ex) {
			LOG.error("TransferRepositoryImpl.getKNetTransactionByKNetTrackId:" + ex.getMessage());
			LOG.error(ex);
		}
		return null;
	}

	@Override
	public Boolean createTmpTransaction(KNetTransferDTO knetdto) throws TransferException {
		try {
			LOG.debug("TransferRepositoryImpl.createTmpTransaction...:{}", knetdto.getKnetPaymentId());
			//.append(" (:KNET_PAYMENT_ID, :CIF, :AMOUNT) ")
			MapSqlParameterSource mapParams = new MapSqlParameterSource();
			mapParams.addValue("KNET_PAYMENT_ID", knetdto.getKnetPaymentId());
			mapParams.addValue("CIF", knetdto.getCif());
			mapParams.addValue("AMOUNT", knetdto.getAmountInKwd());

			int count = namedJdbcTemplate.update(SQLConstants.CREATE_TEMP_KNET_TRANSACTION, mapParams);
			if (count != 0) {
				return true;
			}
		} catch (Exception e) {
			LOG.error("TransferRepositoryImpl.createTransactionMaster:" + e.getMessage());
			LOG.error(e);
			return false;
		}
		return false;
	}
	
	/**
	 * Get Next value
	 * 
	 * @param sequenceName
	 * @return
	 */
	private Long nextValue(String sequenceName) {
		String nextvalSQL = new StringBuilder("SELECT ").append(sequenceName).append(".NEXTVAL from dual").toString();
		return namedJdbcTemplate.queryForObject(nextvalSQL, (HashMap<String, ?>) null, Long.class);
	}

	/**
	 * Get GUID from Oracle
	 * 
	 * @return
	 */
	private String nextGUID() {
		String guidIdSQL = "SELECT SYS_GUID() FROM DUAL";
		return namedJdbcTemplate.queryForObject(guidIdSQL, (HashMap<String, ?>) null, String.class);
	}

}
