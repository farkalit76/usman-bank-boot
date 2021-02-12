/**
 * @Copyright reserved to  bank
 */
package com.usman.bank.account.utils;

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

	public static final String SELECT_TRANS_HISTORY = "SELECT * from  V_CUST_TRANSFERS_HISTORY where CIF=:cif  AND CHANNEL_ID in (1,2) ORDER BY CREATED_DATE DESC";

	public static final String SELECT_ACC_SAVING = "SELECT * from CUSTS_ACCOUNT_SAVING cust where rownum <=10";

	public static final String SELECT_ACC_SAVING_BYID = "SELECT * from CUSTS_ACCOUNT_SAVING cust where cust.FROM_ACCOUNT_ID=:fromAccountId";

	// For KNET Transfer
	public static final String DELETE_KNET_BY_USERID = "DELETE FROM USERS_KNET_TRANS WHERE REF1 =:ref1 AND STAGE_ID = 1 AND USER_ID=:userId";

	public static final String UPDATE_KNET_BY_USERID = "UPDATE USERS_KNET_TRANS  SET AUTH =:auth, DB_CREATED_DATE =:createdDate,  PAYMENT_ID =:paymentId, "
			+ " POST_DATE =:postDate, REF  =:ref, RESULT  =:result,  STAGE_ID  =:stageId,  STATUS_ID  =:statusId, "
			+ " TRANS_ID =:transId, USER_TRANS_ID =:userTransId  WHERE TRACK_ID =:trackId ";

	public static final String CREATE_KNET_ENTRY = "INSERT INTO USERS_KNET_TRANS ("
			+ "AMOUNT, AUTH, DB_CREATED_DATE, PAYMENT_ID, POST_DATE, REF, RESULT, "
			+ "STAGE_ID, STATUS_ID, TRACK_ID, TRANS_ID, USER_RESULT_PAGE, USER_SECURE_TOKEN, "
			+ "REF1, TO_ACCOUNT_ID, REQUEST_ID, USER_ID "
			+ " ) VALUES (:amount, :auth, :dbCreatedDate, :paymentId, :postDate, :ref, :result, :stageId, :statusId,"
			+" :trackId, :transId, :userResultPage, :userSecureToken, :ref1, :toAccountId, :requestId, :userId)";

	public static final String SELECT_KNET_TRANS_HISTORY = "SELECT * FROM ( SELECT * FROM USERS_KNET_TRANS order by db_created_date asc) where  rownum<=10";
	
	public static final String SELECT_ACC_BY_ACCNUMBER = "SELECT * FROM V_USERS_ACCOUNTS WHERE  ACCOUNT_NUMBER =:accountNumber";
	
	public static final String SELECT_ACC_BY_ACCID = "SELECT * FROM V_USERS_ACCOUNTS WHERE  ACCOUNT_ID =:accountId";
	
	public static final String SELECT_ACC_BY_USERID = "SELECT * FROM V_USERS_ACCOUNTS WHERE  USER_ID =:userId AND IS_DEFAULT = 1";
	
	public static final String SELECT_ACC_BY_USERCODE = "SELECT * FROM V_USERS_ACCOUNTS WHERE  USER_CODE =:userCode AND IS_DEFAULT = 1";
	
	public static final String SELECT_ACC_BY_CIFNUMBER = "SELECT * FROM V_USERS_ACCOUNTS WHERE  ACCOUNT_NUMBER =:accountNumber";
	
	//Get From USER Table
	public static final String SELECT_USER_BY_USERCODE = "SELECT * FROM V_USERS_PROFILES  WHERE  USER_CODE =:userCode";
	
	
}
