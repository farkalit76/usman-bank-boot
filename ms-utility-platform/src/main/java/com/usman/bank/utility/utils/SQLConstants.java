/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.utils;

/**
 * Description: This class AuditSQL.java
 *
 * @author vXebiau
 * @date Sep 12, 2019
 * @version 1.0
 *
 */
public class SQLConstants {

	private SQLConstants() {}
	
	public static final String SELECT_LOGS = "Select * from ( Select * from LOG_MASTER  order by trans_date desc) where rownum<=10";
	
	public static final String COMMON_CURRENCIES = "Select * from CURRENCIES";
	
	public static String insertAuditLogs() {

		return new StringBuilder("INSERT INTO BBYNIB.LOG_MASTER ( TRANS_ID,CUST_ID,LOG_SERVICE_ID,TRANS_DATE,LOG_ACTION_ID,\r\n")
				.append("   LOG_STATUS_ID,REMARK,USER_TYPE,MANAGED_SERVER,\r\n")
				.append("   COOKIE,LOCAL_ADDRESS,LOCAL_SERVER,USER_AGENT,BROWSER_TYPE,\r\n")
				.append("   REMOTE_IP_ADDRESS,CIF_NUMBER,CHANNEL_ID,REQUEST_ACTION_ID,REMOTE_HOST,\r\n")
				.append("   IP_IN_NUM,IP_ROW_INDEX, REQUEST_TOKEN, DB_CREATED_DATE, CLIENT_TIMESTAMP, CHANNEL_KEY, SESSION_ID,\r\n")
				.append("   INTERFACE_LANG, OS_NAME, OS_VERSION, APP_VERSION, DEVICE_MODEL,GEOCODE_LATITUDE, GEOCODE_LONGITUDE, ")
				.append("   IS_DEVICE_ROOTED, EXTRA_INFO, CHANNEL_MODULE, SOA_REQ_ID) \r\n")
				.append("    VALUES ( :TRANS_ID,:CUST_ID,:LOG_SERVICE_ID,:TRANS_DATE,:LOG_ACTION_ID,\r\n")
				.append("  :LOG_STATUS_ID,:REMARK,:USER_TYPE,:MANAGED_SERVER,\r\n")
				.append("  :COOKIE,:LOCAL_ADDRESS,:LOCAL_SERVER,:USER_AGENT,:BROWSER_TYPE,\r\n")
				.append("  :REMOTE_IP_ADDRESS,:CIF_NUMBER,:CHANNEL_ID,:REQUEST_ACTION_ID,:REMOTE_HOST,\r\n")
				.append("  :IP_IN_NUM,:IP_ROW_INDEX,:REQUEST_TOKEN, :DB_CREATED_DATE, :CLIENT_TIMESTAMP, :CHANNEL_KEY,:SESSION_ID,\r\n")
				.append("  :INTERFACE_LANG, :OS_NAME, :OS_VERSION, :APP_VERSION, :DEVICE_MODEL,:GEOCODE_LATITUDE,\n\n ")
				.append("  :GEOCODE_LONGITUDE, :IS_DEVICE_ROOTED, :EXTRA_INFO, :CHANNEL_MODULE, :SOA_REQ_ID)").toString();
	}
	
}
