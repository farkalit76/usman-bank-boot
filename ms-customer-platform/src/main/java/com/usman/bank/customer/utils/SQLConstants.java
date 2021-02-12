/**
 * @Copyright reserved to bank
 */
package com.usman.bank.customer.utils;

/**
 * Description: This class CustomerSQL.java
 *
 * @author vXebiau
 * @date Sep 10, 2019
 * @version 1.0
 *
 */
public class SQLConstants {

	private SQLConstants() {
	}
	
	public static final String SELECT_CUST_BYUSER = "Select cif, cust_id, status_id, lock_reason_id, cust_id from custs_profiles where  user_name =:username";
	
	//public static final String SELECT_CUST_BYCIF = "Select cif, cust_id, status_id, lock_reason_id, cust_id from custs_profiles where  cif =:cif";
	
	public static final String SELECT_CUST_BYCIFNUMBER = "Select * from custs_profiles where  cif =:cif";
	
	public static final String UPDATE_CUST_STATUS = "update custs_profiles set status_id = :statusId, lock_reason_id = :lockReasonId where cust_id =:custId";
	
	public static final String SELECT_CUST_PROFILES = "SELECT customer_code, account_type from CUSTS_PROFILES cust where rownum <=10 order by cust.USER_NAME asc";
	
	public static final String SELECT_CUST_PROFILES_BYCUSTID = "SELECT * from CUSTS_PROFILES cust where cust.CUST_ID =:custId";

	public static String getCustomerByCif() {
		return new StringBuilder()
				.append(" SELECT custs_profiles.cust_id, user_name, civil_id, name_ar, name_en, DOB,PREFERRED_LANG,cust_TYPE_ID,\r\n")
				.append(" mobile_no,office_no,fax_no,last_login_date,gender,email, CARD_HOLDER_NAME, \r\n")
				.append(" cif,address_one,address_two,city,state,zip,country_id,\r\n")
				.append(" nationality_id,home_phone,marital_status_id,title_id, personal_banker_emp_id,sitekey_lang,\r\n")
				.append(" status_id,sitekey_flag,ALLOW_MOBILE_INQUIRY,\r\n")
				.append(" lock_reason_id,pwd_exp_period,pwd_exp_date,timeout,ranking_code,RM_OFFICER_ID, RM_OFFICER_NAME_EN, RM_OFFICER_MOBILE, RM_OFFICER_EMAIL, ranking_desc_en, ranking_desc_ar, \r\n")
				.append(" DEVICE_ID, NVL(DEVICE_STATUS, -1) DEVICE_STATUS, CUSTS_DEVICE.IS_DEFAULT DEVICE_IS_DEFAULT, OS_NAME, APP_VERSION, DEVICE_OS_VERSION, DEVICE_OS_TYPE_ID, DEVICE_MODEL, IS_ROOTED, 	\r\n")
				.append(" DEVICE_LANGUAGE, RECORD_CREATED_DATE_TIME, RECORD_UPDATED_DATE_TIME, DEVICE_NOTIFICATION_STATUS, NOTIFICATION_CENTER_STATUS, PN_TRANSACTION_STATUS,  \r\n")
				.append(" DEVICE_TOKEN, PN_UPDATED_DATE_TIME, NFC_DEBIT_ENABLED, NFC_CREDIT_ENABLED, EWATCH_STATUS, EWATCH_TOKEN, EWATCH_TOKEN_DATE_TIME, EWATCH_PASS_CODE, FCM_DEVICE_TOKEN, \r\n")
				.append(" EWATCH_IS_PASS_CODE_REQUIRED, EWATCH_WRONG_PASSCODE_COUNTER, EWATCH_UPDATED_DATE_TIME, FP_LOGIN_STATUS, FP_TRANSACTION_STATUS, \r\n")
				.append(" FP_UPDATED_DATE_TIME, FP_LOGIN_TOKEN, FP_TOKEN_DATE_TIME, FP_WRONG_LOGIN_COUNTER, FP_TRANSACTION_TOKEN, IS_CIVILID_UPLOADED,\r\n")
				.append(" VISA_CURRENT_DEVICE_ID, VISA_OLD_DEVICE_ID, IS_MIGRATED_USER, CREDIT_CARD_NOTIF_TYPE, MURABAHA_APPLICATION_STATUS, SET_PIN_WRONG_COUNTER,  \r\n")
				.append(" PASSPORT_FIRST_NAME, PASSPORT_LAST_NAME FROM custs_profiles \r\n")
				.append(" LEFT JOIN CUSTS_DEVICE ON custs_profiles.CUST_ID = CUSTS_DEVICE.CUST_ID \r\n")
				.append(" where custs_profiles.cif= :cif").toString();
	}

	public static String getCustomerByUser() {
		return new StringBuilder().append(" SELECT a.cust_id, user_name, civil_id, a.name_ar cust_name_ar, a.name_en cust_name_en, ")
				.append("    DOB,PREFERRED_LANG,CUST_TYPE_ID,a.LAST_VISITED_CHANNEL_ID,")
				.append("    mobile_no,office_no,fax_no,a.last_login_date,gender,email, NATIONAL_ID_EXP_DATE,")
				.append("    a.cif,address_one,address_two,city,state,zip,country_id,CARD_HOLDER_NAME,")
				.append("    nationality_id,home_phone,marital_status_id,title_id,							")
				.append("    personal_banker_emp_id,sitekey_flag,sitekey_lang,")
				.append("    a.status_id,lock_reason_id,pwd_exp_period,pwd_exp_date,timeout,ranking_code, ")
				.append("    RM_OFFICER_ID, RM_OFFICER_NAME_EN, RM_OFFICER_MOBILE, RM_OFFICER_EMAIL,")
				.append("    d.sp_id,d.sp_name_en,d.sp_name_ar, ")
				.append("    ranking_desc_en, ranking_desc_ar,b.STATUS_NAME_EN ,H.PASSWORD, ALLOW_MOBILE_INQUIRY, MURABAHA_APPLICATION_STATUS, ")
				.append("     DEVICE_ID, NVL(DEVICE_STATUS, -1) DEVICE_STATUS, CUSTS_DEVICE.IS_DEFAULT DEVICE_IS_DEFAULT, OS_NAME, APP_VERSION, ")
				.append("     DEVICE_OS_VERSION, DEVICE_OS_TYPE_ID, DEVICE_MODEL, IS_ROOTED, FCM_DEVICE_TOKEN, 	")
				.append("     DEVICE_LANGUAGE, RECORD_CREATED_DATE_TIME, RECORD_UPDATED_DATE_TIME, ")
				.append("     DEVICE_NOTIFICATION_STATUS, NOTIFICATION_CENTER_STATUS, PN_TRANSACTION_STATUS,  ")
				.append("     DEVICE_TOKEN, PN_UPDATED_DATE_TIME, NFC_DEBIT_ENABLED, NFC_CREDIT_ENABLED, ")
				.append("     EWATCH_STATUS, EWATCH_TOKEN, EWATCH_TOKEN_DATE_TIME, EWATCH_PASS_CODE, ")
				.append("     EWATCH_IS_PASS_CODE_REQUIRED, EWATCH_WRONG_PASSCODE_COUNTER, EWATCH_UPDATED_DATE_TIME, FP_LOGIN_STATUS, FP_TRANSACTION_STATUS, ")
				.append("     FP_UPDATED_DATE_TIME, FP_LOGIN_TOKEN, FP_TOKEN_DATE_TIME, FP_WRONG_LOGIN_COUNTER, FP_TRANSACTION_TOKEN, CREDIT_CARD_NOTIF_TYPE,")
				.append("     VISA_CURRENT_DEVICE_ID, VISA_OLD_DEVICE_ID, IS_MIGRATED_USER, IS_CIVILID_UPLOADED, SET_PIN_WRONG_COUNTER,")
				.append("     CUSTS_ORG_SALARIES.NAME_EN  ORG_NAME_EN,CUSTS_ORG_SALARIES.NAME_AR  ORG_NAME_AR,CUSTS_ORG_SALARIES.NEXT_SALARY_DATE,")
				.append("     IS_PRODUCTS_EXPANDED, PASSPORT_FIRST_NAME, PASSPORT_LAST_NAME , SHOW_REWARDS_ARTICLE")
				.append("     FROM custs_profiles a ").append("     LEFT JOIN LOOKUP_USER_STATUS b on a.status_id = b.status_id ")
				.append("     LEFT JOIN CUSTS_SERVICE_PACKAGES c on a.cif = c.cif ").append("     LEFT JOIN SERVICE_PACKAGES d on c.sp_id = d.sp_id ")
				.append("     LEFT JOIN BBYNIB.PASSWORDS_HISTORY H on a.cust_id = h.cust_id and H.PWD_TYPE_ID = 0 and H.PWD_CREATED_DATE  in (")
				.append("       select max(innerC.PWD_CREATED_DATE) from BBYNIB.PASSWORDS_HISTORY innerC  ")
				.append("       where innerC.PWD_TYPE_ID = 0  and innerC.cust_id= h.cust_id  ").append("     group by innerC.cust_id)  ")
				.append("     LEFT JOIN CUSTS_DEVICE ON a.CUST_ID = CUSTS_DEVICE.CUST_ID 	")
				.append("     LEFT JOIN CUSTS_ORG_SALARIES ON CUSTS_ORG_SALARIES.ROW_ID = a.SALARY_ORG_ID 	").append("     WHERE user_name=?1")
				.toString();

	}

}
