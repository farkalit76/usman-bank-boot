/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.utils;

/**
 * Description: This class AccountSQL.java
 *
 * @author vXebiau
 * @date Oct 27, 2019
 * @version 1.0
 *
 */
public class SQLConstants {

	private SQLConstants() {
	}

	public static final String SELECT_ACC_SAVING = "SELECT * from CUSTS_ACCOUNT_SAVING cust where rownum <=10";

	public static final String SELECT_ACC_SAVING_BYID = "SELECT * from CUSTS_ACCOUNT_SAVING cust where cust.FROM_ACCOUNT_ID=:fromAccountId";


	// For KNET Transfer
	public static final String CREATE_KNET_TRANSFER = new StringBuilder(" INSERT INTO CUSTS_KNET_PAYMENTS( ")
			.append("BBYN_PAYMENT_ID , BBYN_TRACK_ID, CIF, CUST_ID, CHANNEL_ID, LANG, SERVICE_ID, TRANSFER_TYPE_ID, ")
			.append("AMOUNT_IN_KWD, FROM_ACCOUNT, TO_ACCOUNT, CURRENCY_ID, USER_COMMENTS, APP_TRANS_DATE, DB_TRANS_DATE, ")
			.append("STAGE, STATUS, SESSION_ID, CHANNEL_KEY, CUSTOMER_EMAIL, MOBILE_NO, CONSIGNEE_NAME, EXPIRY_DATE, ")
			.append("SMS_MSG, MSG_DELIVERY_TYPE, IS_SMS_SENT, EVENT_NAME, NO_OF_PAYMENTS, REMAINING_AMOUNT, BBYN_REF_ID, SHOW_REMAINING, PARENT_ID  )")
			.append(" VALUES ")
			.append("(:PAYMENT_ID , :BBYN_TRACK_ID, :CIF, :CUST_ID, :CHANNEL_ID, :LANG, :SERVICE_ID, :TRANSFER_TYPE_ID,")
			.append(":AMOUNT_IN_KWD, :FROM_ACCOUNT, :TO_ACCOUNT, :CURRENCY_ID, :USER_COMMENTS, :APP_TRANS_DATE, :DB_TRANS_DATE,")
			.append(":STAGE, :STATUS,  :SESSION_ID, :CHANNEL_KEY, :CUSTOMER_EMAIL, :MOBILE_NO, :CONSIGNEE_NAME, :EXPIRY_DATE, ")
			.append(":SMS_MSG, :MSG_DELIVERY_TYPE, :IS_SMS_SENT, :EVENT_NAME, :NO_OF_PAYMENTS, :REMAINING_AMOUNT, :BBYN_REF_ID, :SHOW_REMAINING, :PARENT_ID) ")
			.toString();

	public static final String UPDATE_KNET_TRANSFER = new StringBuilder(
			"UPDATE CUSTS_KNET_PAYMENTS SET SMS_MSG = :SMS_MSG ").append("WHERE BBYN_PAYMENT_ID = :PAYMENT_ID")
					.toString();

	public static final String CREATE_NEW_TOKEN = new StringBuilder(
			" INSERT INTO CUSTS_TOKEN(TOKEN_ID, TOKEN, TOKEN_TYPE, ")
					.append("CUST_ID, DB_CREATED_DATE, APP_CREATED_DATE, WRONG_ATTEMPTS, LINK_TYPE)").append("VALUES ")
					.append(" ( :SYS_GUID, :TOKEN, :TOKEN_TYPE, ")
					.append(":CUST_ID, :DB_CREATED_DATE, :APP_CREATED_DATE, :WRONG_ATTEMPTS, :LINK_TYPE )").toString();

	public static final String CREATE_TRANSACTION_MASTER = new StringBuilder(
			"INSERT INTO  CUSTS_MASTER_TRANSACTIONS ( CUST_TRANS_ID, BANK_ID, CHANNEL_ID, CIF, FROM_ACCOUNT_ID,")
					.append("TO_ACCOUNT_ID, TRANSFER_AMOUNT_IN_KD, TRANSFER_CURRENCY_ID, TRANSFER_TYPE_ID, ")
					.append("TRANSFER_STATUS_TYPE_ID, AMOUNT, COMMENTS, CONFIRMATION_NUMBER, WS_CHANNEL_KEY, COMMENTS2, TRANSACTION_STAGE) ")
					.append("values ").append("( :CUST_TRANS_ID, :BANK_ID, :CHANNEL_ID, :CIF, :FROM_ACCOUNT_ID, ")
					.append(":TO_ACCOUNT_ID, :TRANSFER_AMOUNT_IN_KD, :TRANSFER_CURRENCY_ID, :TRANSFER_TYPE_ID,")
					.append(":TRANSFER_STATUS_TYPE_ID, :AMOUNT, :COMMENTS, :CONFIRMATION_NUMBER, :WS_CHANNEL_KEY,:COMMENTS2, :TRANSACTION_STAGE)")
					.toString();

	public static final String UPDATE_KNET_PAYMENT = new StringBuilder(
			"UPDATE CUSTS_KNET_PAYMENTS SET KNET_PAYMENT_ID = :KNET_PAYMENT_ID, ").append(" STAGE = :STAGE, ")
					.append(" STATUS = :STATUS, ").append(" KNET_PAYMENT_URL = :KNET_PAYMENT_URL, ")
					.append(" KNET_INIT_DATE = :KNET_INIT_DATE ").append(" WHERE BBYN_PAYMENT_ID = :PAYMENT_ID ")
					.toString();

	public static final String UPDATE_KNET_PAYMENT_FAILURE = new StringBuilder(
			"UPDATE CUSTS_KNET_PAYMENTS SET STAGE = :STAGE, ").append("STATUS = :STATUS,")
					.append("REMARKS = :REMARKS, ").append("KNET_TRANS_ID = :KNET_TRANS_ID, ")
					.append("KNET_RESPONSE = :KNET_RESPONSE, ").append("KNET_AUTH_NUMBER = :KNET_AUTH_NUMBER,")
					.append("KNET_REFERENCE_ID = :KNET_REFERENCE_ID,")
					.append("DB_DATE_KNET_LAST_RESPONSE = :DB_DATE_KNET_LAST_RESPONSE, ")
					.append("APP_DATE_KNET_LAST_RESPONSE = :APP_DATE_KNET_LAST_RESPONSE, ")
					.append("KNET_PAYMENT_ID = :KNET_PAYMENT_ID ").append("WHERE BBYN_PAYMENT_ID = :PAYMENT_ID")
					.toString();

	public static final String SELECT_KNET_PAYMENT_ENTRY = new StringBuilder("SELECT * FROM CUSTS_KNET_PAYMENTS ")
			.append(" WHERE SMS_MSG like '%'||:SMS_MSG||'%' ")
			.append(" AND BBYN_TRACK_ID like '%'||:BBYN_TRACK_ID||'%' ").toString();

	public static final String SELECT_KNET_PAYMENT_RESPONSE = new StringBuilder(
			"SELECT CUSTS_KNET_PAYMENTS.*, CUSTS_PROFILES.LAST_LOGIN_DATE LAST_LOGIN_DATE, CUSTS_PROFILES.NAME_EN, CUSTS_PROFILES.NAME_AR, ")
			.append(" NVL(CUSTS_PROFILES.SESSION_ID, '') LOGIN_SESSION_ID ")
			.append(" FROM CUSTS_KNET_PAYMENTS LEFT OUTER JOIN CUSTS_PROFILES ON CUSTS_KNET_PAYMENTS.CIF = CUSTS_PROFILES.CIF")
			.append(" WHERE BBYN_TRACK_ID = :BBYN_TRACK_ID").toString();
	
	public static final String SELECT_KNET_TRANS_HISTORY = "SELECT * FROM ( SELECT * FROM CUSTS_KNET_PAYMENTS order by APP_TRANS_DATE desc) where  rownum<=10";
	
	public static final String CREATE_TEMP_KNET_TRANSACTION = new StringBuilder("INSERT INTO CUSTS_KNET_TMP_TRANS (KNET_PAYMENT_ID, CIF, AMOUNT) VALUES ")
			.append(" (:KNET_PAYMENT_ID, :CIF, :AMOUNT) ").toString();		
	
	// Customer PL-SQL
	public static final String SELECT_CUST_BY_CIF_NUMBER = "Select * from custs_profiles where  cif =:cif";
	
	// Account SQL
	
	//Common SQL
	public static final String COMMON_CURRENCIES = "Select * from CURRENCIES";
}
