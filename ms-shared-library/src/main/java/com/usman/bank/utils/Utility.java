/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utils;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Base64;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.usman.bank.constants.Constants;
import com.usman.bank.constants.Constants.Environment;
import com.usman.bank.constants.Constants.LOG_TRANS_FIELDS;
import com.usman.bank.models.RequestDTO;

/**
 * Description: This class UtilityClass.java
 *
 * @author vXebiau
 * @date Sep 11, 2019
 * @version 1.0
 *
 */
public class Utility {

	private static final Logger LOG = LogManager.getLogger(Utility.class);

	private static SecureRandom random = new SecureRandom();

	private Utility() {
	}

	/**
	 * 
	 * @param pValue
	 * @return
	 */
	public static boolean isEmpty(long pValue) {

		if (pValue == 0)
			return true;

		return false;
	}

	/**
	 * 
	 * @param pValue
	 * @return
	 */
	public static boolean isEmpty(int pValue) {

		if (pValue == 0)
			return true;

		return false;
	}

	/**
	 * 
	 * @param pValue
	 * @return
	 */
	public static boolean isEmpty(Object pValue) {
		if (pValue == null || pValue.toString().trim().equals("") || pValue.toString().trim().equalsIgnoreCase("null"))
			return true;

		return false;
	}

	/**
	 * To get current date in (Type:sql.Time)
	 * 
	 * @return time
	 */
	public static Time getCurrentTime() {
		java.util.Date date = new java.util.Date();
		long t = date.getTime();
		return new java.sql.Time(t);
	}

	/**
	 * To get current date in (Type:sql.Timestamp)
	 * 
	 * @return timestamp
	 */
	public static Timestamp getCurrentTimestamp() {
		java.util.Date date = new java.util.Date();
		long t = date.getTime();
		return new java.sql.Timestamp(t);
	}

	/**
	 * 
	 * @param ex
	 */
	public static void logMe(Exception ex) {
		LOG.debug("Exception occurred at " + Thread.currentThread().getName(), ex);
		ex.printStackTrace();
	}

	/**
	 * 
	 * @param logger
	 * @param ex
	 */
	public static void logMe(Logger logger, Exception ex) {
		logger.debug("Exception occurred at " + Thread.currentThread().getName(), ex);
		ex.printStackTrace();
	}

	/**
	 * 
	 * @param size
	 * @return
	 */
	public static String getSecureRandomKey(int size) {
		return new BigInteger(130, random).toString(size);
	}
	
	public static boolean isDev()  {
		Environment env = getEnvironment();
		return env==null ||  env.toString().toLowerCase().contains("dev");
	}
	
	public static Environment getEnvironment()  {
		
		String env = System.getProperty("bbyn.environment");
		if(( (env!=null && !isEmpty(env) ) && env.equalsIgnoreCase("production"))){
		    return Constants.Environment.PRODUCTION;
		}else if ((env!=null && !isEmpty(env)) && env.equalsIgnoreCase("uat")) {
		    return Constants.Environment.UAT;
		}
		else if (( env!=null && !isEmpty(env)) && env.toLowerCase().contains("_dev")){
		    return Constants.Environment.DEV;
		}else {
			//by default
			return Constants.Environment.DEV;
		}
	}
	
	
	public static String getChannelKey(RequestDTO requestDTO) {
		String cif;
		String channelKey;
		String chatBotDelimiter = "";
		if (requestDTO != null) {
			if (requestDTO.getChannelModule() == Constants.CHANNEL_MODULE.BOT) {
				chatBotDelimiter = "-;CHAT-BOT;";
			}

			if (requestDTO.getRequestDetailsMap() != null
					&& requestDTO.getRequestDetailsMap().get(LOG_TRANS_FIELDS.CIF_NUMBER) != null)
				cif = requestDTO.getRequestDetailsMap().get(LOG_TRANS_FIELDS.CIF_NUMBER).toString();
			else
				cif = "cannot be identified";
			channelKey = requestDTO.getChannel() + "-" + cif + "-" + requestDTO.getRemoteIPAddress() + "-"
					+ UtilityClass.generateRandomNumber(8) + "-" + UtilityClass.getCurrentTimestamp()
					+ chatBotDelimiter;
			return channelKey;
		} else {
			return null;
		}
	}
	
	public static String encodeStr(String originalInput) {
		try {
			return Base64.getEncoder().withoutPadding()
					.encodeToString(originalInput.getBytes(StandardCharsets.UTF_8));
		} catch (Exception e) {
			LOG.error(e.getMessage());
			e.printStackTrace();
		}
		return originalInput;
	}

	public static String decodeStr(String encodedString) {
		try {
			byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
			return new String(decodedBytes);
		} catch (Exception e) {
			LOG.error(e.getMessage());
			e.printStackTrace();
		}
		return encodedString;
	}
}
