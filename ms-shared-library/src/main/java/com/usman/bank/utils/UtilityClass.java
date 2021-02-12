/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.usman.bank.constants.Constants;
import com.usman.bank.constants.Constants.Environment;
import com.usman.bank.constants.Constants.LOG_TRANS_FIELDS;
import com.usman.bank.constants.Constants.NFC;
import com.usman.bank.constants.Constants.RUNTIME_ENVIRONMENT;
import com.usman.bank.constants.Constants.WU_TRANSACTION_STATUS;
import com.usman.bank.constants.Constants.XML_TAG_NAMES;
import com.usman.bank.models.RequestDTO;

/**
 * Description: This class UtilityClass.java
 *
 * @author vXebiau
 * @date Jul 9, 2019
 * @version 1.0
 *
 */
public class UtilityClass {

	protected static SecureRandom rnd = new SecureRandom();
	private static final Logger utilLogger = LogManager.getLogger(UtilityClass.class);

//	private static Pattern[] sqlInjectionPatterns = new Pattern[] {
//			// SQL Injection words
//			Pattern.compile("create(?: |%20)table", Pattern.CASE_INSENSITIVE), // This regex takes care of encoding
//																				// value and literal value
//			Pattern.compile("alter(?: |%20)", Pattern.CASE_INSENSITIVE),
//			Pattern.compile("drop(?: |%20)", Pattern.CASE_INSENSITIVE),
//			Pattern.compile("truncate(?: |%20)", Pattern.CASE_INSENSITIVE),
//			Pattern.compile("rename(?: |%20)", Pattern.CASE_INSENSITIVE),
//			Pattern.compile("select(?: |%20)", Pattern.CASE_INSENSITIVE),
//			Pattern.compile("insert(?: |%20)", Pattern.CASE_INSENSITIVE),
//			Pattern.compile("merge(?: |%20)", Pattern.CASE_INSENSITIVE),
//			Pattern.compile("lock(?: |%20)table(?: |%20)", Pattern.CASE_INSENSITIVE),
//			Pattern.compile("grant(?: |%20)", Pattern.CASE_INSENSITIVE),
//			Pattern.compile("revoke(?: |%20)", Pattern.CASE_INSENSITIVE),
//			Pattern.compile("commit(?: |%20)", Pattern.CASE_INSENSITIVE),
//			Pattern.compile("savepoint(?: |%20)", Pattern.CASE_INSENSITIVE),
//			Pattern.compile("rollback(?: |%20)", Pattern.CASE_INSENSITIVE),
//			Pattern.compile("set(?: |%20)transaction(?: |%20)", Pattern.CASE_INSENSITIVE),
//			Pattern.compile("set(?: |%20)role(?: |%20)", Pattern.CASE_INSENSITIVE),
//
//			// SQL Injection hexadecimal
//			Pattern.compile("0063 0072 0065 0061 0074 0065 0020", Pattern.LITERAL),
//			Pattern.compile("0061 006C 0074 0065 0072 0020", Pattern.LITERAL),
//			Pattern.compile("0064 0072 006F 0070 0020", Pattern.LITERAL),
//			Pattern.compile("0074 0072 0075 006E 0063 0061 0074 0065 0020", Pattern.LITERAL),
//			Pattern.compile("0063 006F 006D 006D 0065 006E 0074 0020", Pattern.LITERAL),
//			Pattern.compile("0072 0065 006E 0061 006D 0065 0020", Pattern.LITERAL),
//			Pattern.compile("0073 0065 006C 0065 0063 0074 0020", Pattern.LITERAL),
//			Pattern.compile("0069 006E 0073 0065 0072 0074 0020", Pattern.LITERAL),
//			Pattern.compile("0075 0070 0064 0061 0074 0065 0020", Pattern.LITERAL),
//			Pattern.compile("0064 0065 006C 0065 0074 0065 0020", Pattern.LITERAL),
//			Pattern.compile("006D 0065 0072 0067 0065 0020", Pattern.LITERAL),
//			Pattern.compile("0063 0061 006C 006C 0020", Pattern.LITERAL),
//			Pattern.compile("0065 0078 0070 006C 0061 0069 006E 0020 0070 006C 0061 006E 0020", Pattern.LITERAL),
//			Pattern.compile("006C 006F 0063 006B 0020 0074 0061 0062 006C 0065 0020", Pattern.LITERAL),
//			Pattern.compile("0067 0072 0061 006E 0074 0020", Pattern.LITERAL),
//			Pattern.compile("0072 0065 0076 006F 006B 0065 0020", Pattern.LITERAL),
//			Pattern.compile("0063 006F 006D 006D 0069 0074 0020", Pattern.LITERAL),
//			Pattern.compile("0073 0061 0076 0065 0070 006F 0069 006E 0074 0020", Pattern.LITERAL),
//			Pattern.compile("0072 006F 006C 006C 0062 0061 0063 006B 0020", Pattern.LITERAL),
//			Pattern.compile("0073 0065 0074 0020 0074 0072 0061 006E 0073 0061 0063 0074 0069 006F 006E 0020",
//					Pattern.LITERAL),
//			Pattern.compile("0073 0065 0074 0020 0072 006F 006C 0065 0020", Pattern.LITERAL),
//
//			// SQL Injection ASCII
//			Pattern.compile("99 114 101 97 116 101 32", Pattern.LITERAL),
//			Pattern.compile("97 108 116 101 114 32", Pattern.LITERAL),
//			Pattern.compile("100 114 111 112 32", Pattern.LITERAL),
//			Pattern.compile("116 114 117 110 99 97 116 101 32", Pattern.LITERAL),
//			Pattern.compile("99 111 109 109 101 110 116 32", Pattern.LITERAL),
//			Pattern.compile("114 101 110 97 109 101 32", Pattern.LITERAL),
//			Pattern.compile("115 101 108 101 99 116 32", Pattern.LITERAL),
//			Pattern.compile("105 110 115 101 114 116 32", Pattern.LITERAL),
//			Pattern.compile("117 112 100 97 116 101 32", Pattern.LITERAL),
//			Pattern.compile("100 101 108 101 116 101 32", Pattern.LITERAL),
//			Pattern.compile("109 101 114 103 101 32", Pattern.LITERAL),
//			Pattern.compile("99 97 108 108 32", Pattern.LITERAL),
//			Pattern.compile("101 120 112 108 97 105 110 32 112 108 97 110 32", Pattern.LITERAL),
//			Pattern.compile("108 111 99 107 32 116 97 98 108 101 32", Pattern.LITERAL),
//			Pattern.compile("103 114 97 110 116 32", Pattern.LITERAL),
//			Pattern.compile("114 101 118 111 107 101 32", Pattern.LITERAL),
//			Pattern.compile("99 111 109 109 105 116 32", Pattern.LITERAL),
//			Pattern.compile("115 97 118 101 112 111 105 110 116 32", Pattern.LITERAL),
//			Pattern.compile("114 111 108 108 98 97 99 107 32", Pattern.LITERAL),
//			Pattern.compile("115 101 116 32 116 114 97 110 115 97 99 116 105 111 110 32", Pattern.LITERAL),
//			Pattern.compile("115 101 116 32 114 111 108 101 32", Pattern.LITERAL) 
//	};

	public static float Round(float Rval, int Rpl) {
		float p = (float) Math.pow(10, Rpl);
		Rval = Rval * p;
		float tmp = Math.round(Rval);
		return (float) tmp / p;
	}

	public static String generateRandomNumber(Integer digits) {
		String rndNumber = "";
		for (int i = 1; i <= digits; i++) {
			rndNumber = rndNumber + String.valueOf(rnd.nextInt(10));
		}
		return rndNumber;
	}

	/**
	 * gives you a nanosecond-precise time, relative to some arbitrary point.
	 * 
	 * @return
	 */
	public static Long getCurrentNanosecond() {
		return System.nanoTime();
	}

	/**
	 * To prevent opening new database connections (JDBC) to get the sequence ID, we
	 * are generating our own sequence ID, as a result we are reducing database hits
	 * and speedup the log-master batching process
	 */
	public static Long javaSequencer() {
		// 10 is used for shifting
		return getCurrentNanosecond() * 10 * RUNTIME_ENVIRONMENT.RANDOMIZED_DIGITS_TO_THE_SEQUENCE
				+ Long.valueOf(generateRandomNumber(RUNTIME_ENVIRONMENT.RANDOMIZED_DIGITS_TO_THE_SEQUENCE));
	}

	public static double Round(double Rval, int Rpl) {
		double p = (double) Math.pow(10, Rpl);
		Rval = Rval * p;
		double tmp = Math.round(Rval);
		return (double) tmp / p;
	}

	public static String getSelectedValueItems(String[] selLabelsArr) {
		if (selLabelsArr == null)
			return null;
		String selectedLabes = "";
		for (int i = 0; i < selLabelsArr.length; i++) {
			selectedLabes = selectedLabes + selLabelsArr[i] + "<br/>";
		}
		return "<span>" + selectedLabes + "</span>";
	}

	/**
	 * return elements randomly based on input count.
	 * 
	 * @param list
	 * @param count
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List selectRandomListItems(List list, int count) {
		List result = new ArrayList();
		int counter = 0;
		while (counter < count) {
			int size = list.size();
			if (size == 0) {
				return list;
			}
			int index = rnd.nextInt(size);
			result.add(list.get(index));
			list.remove(index);
			counter++;
		} // while
		return result;
	}// selectRandomListItems

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List selectRandomQuestionsListItems(List list, int count) {
		List result = new ArrayList();
		int counter = 0;

		while (counter < count) {
			int size = list.size();
			if (size == 0) {
				return list;
			}
			int index = rnd.nextInt(size);
			result.add(list.get(index));
			// list.remove(index);
			counter++;
		} // while
		return result;
	}// selectRandomListItems

//	private static boolean canUseOldKey(RequestDTO requestDTO) {
//
//		if (requestDTO.getChannel().equals(CHANNELS.CHANNEL_IB_ID)) {
//			return false;
//		} else {
//			String callerBBYNAppVersion = requestDTO.getBbynAppVersion();
//			callerBBYNAppVersion = callerBBYNAppVersion.replace("elbooq-dev/", "");
//
//			String versionToBeApplied = "";
//			if (requestDTO.getOperatingSystemId() == Constants.DEVICES.OS_TYPES.IOS) {
//				versionToBeApplied = Constants.SECURITY.IPHONE_MOBILE_VERSION_NO;
//			} else {
//				versionToBeApplied = Constants.SECURITY.ANDROID_MOBILE_VERSION_NO;
//			}
//
//			String[] thisParts = callerBBYNAppVersion.split("\\.");
//			String[] thatParts = versionToBeApplied.split("\\.");
//			int length = Math.max(thisParts.length, thatParts.length);
//			for (int i = 0; i < length; i++) {
//				int thisPart = i < thisParts.length ? Integer.parseInt(thisParts[i]) : 0;
//				int thatPart = i < thatParts.length ? Integer.parseInt(thatParts[i]) : 0;
//				if (thisPart < thatPart) {
//					return true;
//				}
//				if (thisPart > thatPart) {
//					return false;
//				}
//			}
//			return false;
//		}
//	}

	public static String symEncrypt(String message) {
		try {
			if (message == null || isEmpty(message)) {
				return null;
			}
			// Cipher c = new Cipher(decryptText(SECURITY.OLD_VALUES.KEY_ENCRYPTED));
			// byte[] cipherTextBytes = c.encrypt(message.getBytes("UTF-8"));
			byte[] cipherTextBytes = new byte[] { (byte) 0xe0, 0x4f, (byte) 0xd0, 0x30, 0x30, (byte) 0x9d };
			// return new String(Base64.base64Encode(cipherTextBytes), "UTF-8");
			return new String(cipherTextBytes, "UTF-8");
		} catch (Exception e) {
			UtilityClass.logMe(utilLogger, e);
			return null;
		}
	}

//	public static boolean isAppVersioSupportNFCRelease(RequestDTO requestDTO) {
//		if (requestDTO == null || requestDTO.getBbynAppVersion() == null
//				|| requestDTO.getChannel() == usmanBusinessConstants.CHANNELS.CHANNEL_IB_ID) {
//			return true;
//		}
//		try {
//			Integer currentVersion = Integer.parseInt(requestDTO.getBbynAppVersion().replace(".", ""));
//			Integer minSupportedVersion;
//			if (requestDTO.getOperatingSystemId() == Constants.DEVICES.OS_TYPES.IOS)
//				minSupportedVersion = Integer
//						.parseInt(Constants.DEVICES.MINIMUN_SUPPORTED_VERSION.NFC_RELEASE.IOS_VERSION.replace(".", ""));
//			else
//				minSupportedVersion = Integer.parseInt(
//						Constants.DEVICES.MINIMUN_SUPPORTED_VERSION.NFC_RELEASE.ANDROID_VERSION.replace(".", ""));
//
//			if (currentVersion >= minSupportedVersion)
//				return true;
//			else
//				return false;
//
//		} catch (Exception ex) {
//			return true;
//		}
//	}

	public static String generateEncryptionKey(int numberOfDigits) {
		if (isEmpty(numberOfDigits)) {
			numberOfDigits = 7;
		}

		return UtilityClass.generateRandomNumber(numberOfDigits);
	}

	/**
	 * get current date time
	 * 
	 * @param
	 * @author ait
	 */
	public static String getCurrentDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		Date date = new Date();
		return dateFormat.format(date);
	}

	public static String getFromattedCurrentDateTime(String format) {
		DateFormat dateFormat = new SimpleDateFormat(format);
		Date date = new Date();
		return dateFormat.format(date);
	}

	/**
	 * checks if input array of string [] contains the string value input, this can
	 * be used for check last 5 passwords against the entered password in forgot
	 * password service.
	 * 
	 * @param inputList
	 * @param value
	 * @return
	 */
	public static boolean contains(String[] inputList, String value) {
		for (int i = 0; i < inputList.length; i++) {
			if (inputList[i].equals(value)) {
				return true;
			}
		} // for
		return false;
	}// contains

	/**
	 * @author Rami Al Dhafiri
	 * @param date   the date you want to formmat
	 * @param format like "yyyy-MM-dd"
	 * @throws ParseException
	 */
	public static String formatDate(String date, String format) throws ParseException {
		try {
			if (date == null || date.equals(""))
				return null;

			SimpleDateFormat formatter = new SimpleDateFormat(format);
			return formatter.format(formatter.parse(date));
		} catch (Exception ex) {
			UtilityClass.logMe(utilLogger, ex);
			return null;
		}
	}

	public static String formatDate(Date date, String format) throws ParseException {
		if (date == null || "".equals(date.toString())) {
			return null;
		}

		SimpleDateFormat formatter = new SimpleDateFormat(format);
		return formatter.format(date);
	}

	/**
	 * returns number of days form a future date until today
	 * 
	 * @author Rami Al Dhafiri
	 * @param date
	 */
	public static String daysTillToday(String date) throws ParseException {
		if (date == null)
			return null;
		Date today = new Date();
		long diff = (new SimpleDateFormat(Constants.DATE_FORMAT.DATE_FORMAT_1)).parse(date).getTime() - today.getTime();
		long days = -1;
		if (diff > 0) {
			days = diff / (86400000);
		}
		; // 1000*60*60*24 in day
		return days + "";
	}

	static long DAY_MS = 86400000; // 1000*60*60*24 in day

	public static Long daysTillToday(Date date) {
		if (date == null) {
			return null;
		}

		Date today = new Date();
		double diff = (double) date.getTime() - (double) today.getTime();
		long days = -1;
		if (diff > 0) {
			days = (int) Math.round(diff / DAY_MS);
		}
		return days;
	}

	public static Date convertToDate(String dateString, String parseFormat) {
		try {
			if (parseFormat == null) {
				parseFormat = "yyyy-MM-dd 00:00:00.0";
			}
			SimpleDateFormat formatter = new SimpleDateFormat(parseFormat);
			return formatter.parse(dateString);
		} catch (Exception ex) {
			UtilityClass.logMe(utilLogger, ex);
			return null;
		}
	}

	/**
	 * convert the amount to the specified currency code
	 * 
	 * Example: formatCurrency("10000.000000","USD") --> "10,000.00"
	 * 
	 * @param amount
	 * @param currencyCode ISO 4217 code of the currency (e.g. KWD, USD, ERU, ...)
	 */
	public static String formatCurrency(Double amount, String currencyCode) {
		if (amount == null) {
			return null;
		}
		Currency instance = Currency.getInstance(currencyCode);
		int fraction = instance.getDefaultFractionDigits();
		String format = "%,." + fraction + "f";
		return String.format(format, amount);
	}

	public static String formatCurrency(Double amount, int fraction) {
		if (amount == null) {
			return null;
		}
		String format = "%,." + fraction + "f";
		return String.format(format, amount);
	}

	public static String formatCurrency(String amount, String currencyCode) {
		if (amount == null) {
			return null;
		}
		return formatCurrency(Double.parseDouble(amount.replaceAll(",", "")), currencyCode);
	}

	/**
	 * format the card number to the specified mask, the mask should contains 16 (0
	 * or X) if the mask is not valid then it will return the same card number
	 * without formating
	 * 
	 * Example: mask("4234567891234567","0000 00XX XXXX 0000") --> 4234 56XX XXXX
	 * 7365
	 * 
	 * @param cardNo
	 * @param mask
	 * @return
	 */

	public static String mask(String source, String mask) {
		if (source == null) {
			return source;
		}
		StringBuilder formatedMask = new StringBuilder(mask);
		int len = source.length();
		int digits = len;
		int index = 0;
		char[] src = source.toCharArray();

		while (digits != 0 && index < mask.length()) {
			char c = formatedMask.charAt(index);
			if (c == '0' || c == 'X') {
				if (c == '0') {
					formatedMask.setCharAt(index, src[len - digits]);
				}
				digits--;
			}
			index++;
		}
		if (digits != 0) {
			return source;
		}
		return formatedMask.toString();
	}

	public static String getQuery(String sqlQuery, String expression) {
		return (sqlQuery.replace("TABLE_NAME", expression));
	}

	/**
	 * To get current date in (Type:sql.Date)
	 * 
	 * @return * @author afayad
	 */
	public static Date getCurrentDate() {
		java.util.Date date = new java.util.Date();
		long t = date.getTime();
		return new java.sql.Date(t);
	}

	/**
	 * To get current date in "dd-MM-yyyy" format
	 * 
	 * @return * @author AIT
	 */
	public static String getImalFormatedCurrentDate() throws Exception {
		return formatDate(getCurrentDate(), Constants.DATE_FORMAT.IMAL_DATE_FORMAT);
	}

	/**
	 * To get current date in (Type:sql.Time)
	 * 
	 * @return
	 * @author afayad
	 */
	public static Time getCurrentTime() {
		java.util.Date date = new java.util.Date();
		long t = date.getTime();
		return new java.sql.Time(t);
	}

	/**
	 * To get current date in (Type:sql.Timestamp)
	 * 
	 * @return
	 * @author afayad
	 */
	public static Timestamp getCurrentTimestamp() {
		java.util.Date date = new java.util.Date();
		long t = date.getTime();
		return new java.sql.Timestamp(t);
	}

	/**
	 * left pad inoup number with zeros f.e: 2 --> 002 if lpadzeros is 2.
	 * 
	 * @param number
	 * @param lpadZeros
	 * @return
	 */
	public static String lpadInteger(Integer number, Integer lpadZeros) {
		return String.format("%0" + lpadZeros + "d", number);
	}

	/**
	 * generates a unique number. and return in string format.
	 * 
	 * @return
	 */
	public static String generateUniqueNumber() {
		Object object = new Object();
		String u = "";
		u = "" + object.hashCode();
		u += System.currentTimeMillis();
		return u;
	}// generateUniqueNumber

	/**
	 * Convert Date in String to Util Date
	 * 
	 * @param strDate
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static Date stringToUtilDate(String strDate, String format) throws ParseException {
		if (strDate != null && !strDate.equals("") && !strDate.equals("null")) {
			DateFormat sqlDateFormatter = new SimpleDateFormat(format);
			java.util.Date utilDate = sqlDateFormatter.parse(strDate);
			return utilDate;
		} else {
			return null;
		}
	}

	public static String changeDateFormat(String strDate, String oldFormat, String newFormat) throws ParseException {
		if (strDate == null || strDate.equals("")) {
			return null;
		}
		SimpleDateFormat format1 = new SimpleDateFormat(oldFormat);
		SimpleDateFormat format2 = new SimpleDateFormat(newFormat);
		Date date = format1.parse(strDate);
		return format2.format(date);
	}

	public static String convertStringArrayToString(String[] list) {
		if (list == null || list.length == 0) {
			return "";
		}
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < list.length; i++) {
			output.append(list[i]);
			if (i != (list.length - 1)) {
				output.append(" , ");
			}
		} // for
		return output.toString();
	}

	public static String toUpperCase(String value) {
		return String.valueOf(value).replace("null", "").toUpperCase();
	}

	public static Boolean isEmpty(Object value) {

		return (value == null || value.toString().trim().equals(""));
	}

	public static Boolean isEmpty(int value) {
		return (value == 0);
	}

	public static String valueOf(Object value) {
		if (value == null)
			return null;
		else
			return String.valueOf(value);
	}

	public static String replaceValueOf(Object value) {
		if (value == null || value.equals("null"))
			return "";
		else
			return String.valueOf(value);
	}

	public static String getPattern(int decimalDigits) {
		String patteren = "0.";
		for (int i = 0; i < decimalDigits; i++) {
			patteren += "0";
		} // for
		return patteren;
	}

	public static String replace(Boolean value) {
		if (value == null)
			return "es_no";
		else {
			if (value)
				return "es_yes";
			else
				return "es_no";
		}
	}

	public static Object replace(int value) {
		if (value == 0)
			return "es_no";
		else
			return "es_yes";
	}

	public static String replaceEmpty(String value, String replacementString) {
		if (!isEmpty(value)) {
			return value;
		}
		return replacementString;
	}

	public static void setSystemProperty(String localName, int port) {
		String localIP = System.getProperty(Constants.SYSTEM_PROPERTIES.LOCAL_HOST_NAME);
		if (UtilityClass.isEmpty(localIP)) {
			System.setProperty(Constants.SYSTEM_PROPERTIES.LOCAL_HOST_NAME, localName);
		}
		String localPort = System.getProperty(Constants.SYSTEM_PROPERTIES.LOCAL_HOST_PORT);

		if (UtilityClass.isEmpty(localPort)) {
			System.setProperty(Constants.SYSTEM_PROPERTIES.LOCAL_HOST_PORT, String.valueOf(port));
		}
	}

	public static double divideValueForWU(double v) {
		if (v > 0)
			return v / 100;

		return 0;

	}

	public static double multiplyValueForWU(double v) {
		if (v > 0)
			return v * 100;
		return 0;
	}

//	public static List<String> splitEqually(String text, int size) {
//		// Give the list the right capacity to start with. You could use an array
//		// instead if you wanted.
//		List<String> ret = new ArrayList((text.length() + size - 1) / size);
//		for (int start = 0; start < text.length(); start += size) {
//			ret.add(text.substring(start, Math.min(text.length(), start + size)));
//		}
//		return ret;
//	}

	/**
	 * Mohammed A.Salim - 15/5/2014 Validate card number using luhn algorithm
	 * 
	 * @param cardNumber
	 * @return
	 */
	public static boolean luhnCardNumValidate(String cardNumber) {
		int s1 = 0;
		int s2 = 0;
		String reverse = new StringBuilder(cardNumber).reverse().toString();
		for (int i = 0; i < reverse.length(); i++) {
			int digit = Character.digit(reverse.charAt(i), 10);
			if (i % 2 == 0) {// this is for odd digits, they are 1-indexed in the algorithm
				s1 += digit;
			} else {// add 2 * digit for 0-4, add 2 * digit - 9 for 5-9
				s2 += 2 * digit;
				if (digit >= 5) {
					s2 -= 9;
				}
			}
		}
		return (s1 + s2) % 10 == 0;

	}

	public static String[] convertListToArray(List<String> list) {
		if (list == null)
			return null;
		String[] result = new String[list.size()];
		for (int i = 0; i < result.length; i++) {
			String item = list.get(i);
			result[i] = item;
		} // for
		return result;
	}// for

	public static long getIPinLong(String ipAddress) {
		if (ipAddress == null || ipAddress.isEmpty()) {
			throw new IllegalArgumentException("ip address cannot be null or empty");
		}
		String[] octets = ipAddress.split(java.util.regex.Pattern.quote("."));
		if (octets.length != 4) {
			throw new IllegalArgumentException("invalid ip address");
		}
		long ip = 0;
		for (int i = 3; i >= 0; i--) {
			long octet = Long.parseLong(octets[3 - i]);
			if (octet > 255 || octet < 0) {
				throw new IllegalArgumentException("invalid ip address");
			}
			ip |= octet << (i * 8);
		}
		return ip;
	}

	public static String getWSRequestKey(RequestDTO requestDTO) {
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
					+ generateRandomNumber(8) + "-" + getCurrentTimestamp() + chatBotDelimiter;
			requestDTO.setChannelKey(channelKey);
			return channelKey;
		} else {
			return null;
		}
	}

	/**
	 * Get the service ID form the transfer-type
	 * 
	 * @param transferTypeId
	 * @return
	 */
	public static Integer getServiceIDByTransferType(Integer transferTypeId) {
		Integer serviceId = 0;
		switch (transferTypeId) {
		case Constants.TRANSFER_TYPES.TRANSFER_MY_ACCOUNT_ID:
			serviceId = Constants.Services.OWN_ACCOUNTS_TRANSFERS_TRANSFER;
			break;
		case Constants.TRANSFER_TYPES.TRANSFER_usman_ACCOUNT_ID:
			serviceId = Constants.Services.usman_ACCOUNTS_TRANSFERS_TRANSFER;
			break;
		case Constants.TRANSFER_TYPES.TRANSFER_LOCAL_BANK_ID:
			serviceId = Constants.Services.LOCAL_BANK_ACCOUNTS_TRANSFERS_TRANSFER;
			break;
		case Constants.TRANSFER_TYPES.TRANSFER_INTERNATIONAL_BANK_ID:
			serviceId = Constants.Services.INTERNATIONAL_BANK_ACCOUNTS_TRANSFERS_TRANSFER;
			break;
		case Constants.TRANSFER_TYPES.TRANSFER_CREDIT_CARD_ID:
			serviceId = Constants.Services.CREDIT_CARD_PAYMENTS_PAY;
			break;
		case Constants.TRANSFER_TYPES.TRANSFER_BILL_PAYMENT_ID:
			serviceId = Constants.Services.BILL_PAYMENTS_PAY;
			break;
		case Constants.TRANSFER_TYPES.TRANSFER_QBILLSS_PAYMENT_ID:
			serviceId = Constants.Services.BILL_PAYMENTS_QUICK_PAYEE;
			break;
		case Constants.TRANSFER_TYPES.TRANSFER_ISLAMIC_PAYMENT_ID:
			serviceId = Constants.Services.FINANCE_PAYMENTS_PAY;
			break;
		case Constants.TRANSFER_TYPES.TRANSFER_BROKERAGE_ID:
			serviceId = Constants.Services.BROKERAGE_TRANSFERS_TRANSFER;
			break;
		case Constants.TRANSFER_TYPES.TRANSFER_CHARITY_PAYMENT_ID:
			serviceId = Constants.Services.CHARITY_PAYMENTS_PAY;
			break;
		case Constants.TRANSFER_TYPES.TRANSFER_UTILITY_PAYMENT_ID:
			serviceId = Constants.Services.UTILITY_PAYMENT_PAY;
			break;
		case Constants.TRANSFER_TYPES.WU_TRANSFER:
			serviceId = Constants.Services.WESTERN_UNION_SEND_MONEY_STORE;
			break;
		case Constants.TRANSFER_TYPES.WU_REFUND_TRANSFER:
			serviceId = Constants.Services.WESTERN_UNION_REFUND_STORE;
			break;
		case Constants.TRANSFER_TYPES.ITUNES_GIFT_CARD_ID:
			serviceId = Constants.Services.ITUNES_GIFT_CARD;
			break;
		case Constants.TRANSFER_TYPES.GOOGLE_PLAY_GIFT_CARD_ID:
			serviceId = Constants.Services.GOOGLE_PLAY_GIFT_CARD;
			break;
		case Constants.TRANSFER_TYPES.CARDLESS_CONFIRMATION_CODE_ID:
			serviceId = Constants.Services.CARDLESS_CONFIRMATION_CODE;
			break;
		case Constants.TRANSFER_TYPES.CARDLESS_CID_ID:
			serviceId = Constants.Services.CARDLESS_CID;
			break;
		case Constants.TRANSFER_TYPES.KNET_TOP_UP_MY_ACCOUNT:
			serviceId = Constants.Services.PAY_ME_IN_APP;
			break;
		case Constants.TRANSFER_TYPES.PAY_ME:
			serviceId = Constants.Services.PAY_ME_SHARE;
			break;
		case Constants.TRANSFER_TYPES.SCHOOL_PAYMENT_TRANSFER_ID:
			serviceId = Constants.Services.SCHOOL_PAYMENT_SERVICE;
			break;
		case Constants.TRANSFER_TYPES.ELBOOQ_TO_usman_TRANSFER:
			serviceId = Constants.Services.ELBOOQ_TO_BOUNYAN_TRANSFER;
			break;

		default:
			serviceId = transferTypeId;
			break;
		}
		return serviceId;
	}

	public static String formatSessionID(String sessionID) {
		if (sessionID == null)
			return null;
		return sessionID.substring(0, sessionID.indexOf('!') + 1);
	}

	public static String defualtMask(String source) {
		if (source == null)
			return source;
		String maskedCardNum = mask(source, Constants.UTILITIES_CONSTANS.MASK_CARD_NUM);
		return maskedCardNum;
	}

	public static boolean isNumeric(String source) {
		Pattern pattern = Pattern.compile(".*[^0-9].*");
		return pattern.matcher(source).matches();
	}

	/**
	 * Checks if the given string is just numbers. In this case for instance, even
	 * 004 will be returned as true
	 * 
	 * @param source
	 * @return
	 */
	public static boolean isNumbersOnly(String source) {
		Pattern pattern = Pattern.compile("\\d+");
		return pattern.matcher(source).matches();
	}

	public static boolean isValidMobileNo(String source) {
		boolean result = false;
		String mobileNoIndex[] = { "5", "6", "9" };
		for (int i = 0; i < mobileNoIndex.length; i++) {
			if (mobileNoIndex[i].equals(source.substring(0, 1))) {
				result = true;
				break;
			}
		}
		return result;
	}

	public static String getBoolBal(boolean value) {
		return value ? "1" : "0";
	}

	public static String convertListToString(List<String> list) {
		if (list == null) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
			if (i != (list.size() - 1)) {
				sb.append(" , ");
			}
		} // fof
		return sb.toString();
	}

	/**
	 * Converts a list of card csa string to encrypted comma separated string value
	 * 
	 * @param list
	 * @param requestDTO
	 * @return
	 */
//	 public static String convertCSAListToEncryptedString (List<String> list, RequestDTO requestDTO){
//		 if (list == null) {
//			 return "";
//		 }
//		 StringBuilder sb = new StringBuilder();
//		 for (int i = 0; i < list.size(); i++) {
//			 sb.append(symEncrypt(list.get(i), requestDTO));
//				if (i != (list.size() - 1)){
//					sb.append(",");
//				}
//			}//fof
//		 return sb.toString();
//	 }

//	public static String readFile(String filePath) throws IOException, FileNotFoundException {
//		StringBuilder results = new StringBuilder();
//		try (FileReader fr = new FileReader(filePath); BufferedReader reader = new BufferedReader(fr)) {
//			String line = null;
//			while ((line = reader.readLine()) != null) {
//				results.append(line);
//			}
//		} catch (Exception e) {
//			UtilityClass.logMe(utilLogger, e);
//		}
//		return results.toString();
//	}

	public static boolean otpNotExpired(Date sentDate, Integer OTPMinutes) throws Exception {
		Date currentDate = getCurrentDate();

		long diff = currentDate.getTime() - sentDate.getTime();
		int sentInSec = (int) (diff / (1000));

		int OTPInSec = OTPMinutes * 60;

		if (sentInSec > OTPInSec)
			return false;
		else
			return true;
	}

//	public static boolean isEntitled(RequestDTO requestDTO, Integer serviceId) {
//
//		if (isEmpty(requestDTO) || isEmpty(requestDTO.getVisibleServices()))
//			return false;
//
//		return (requestDTO.getVisibleServices().indexOf("'" + serviceId + "'") > -1);
//
//	}

//	public static Integer[] getVisibileServicesList(RequestDTO requestDTO) {
//
//		String servicesString = requestDTO.getVisibleServices().replaceAll("'", "");
//
//		String[] servicesArray = servicesString.split(",");
//
//		List<Integer> visibleServicesArray = new ArrayList<>();
//
//		Integer serviceId;
//
//		for (int i = 0; i < servicesArray.length; i++) {
//
//			try {
//
//				serviceId = Integer.parseInt(servicesArray[i].trim());
//
//				visibleServicesArray.add(serviceId);
//
//			} catch (Exception ex) {
//				UtilityClass.logMe(utilLogger, ex);
//			}
//
//		}
//
//		return visibleServicesArray.toArray(new Integer[] {});
//	}

	public static String hash(String hashImpl, String value) throws Exception {
		String hashImplementation = hashImpl;
		if (hashImplementation == null)
			hashImplementation = "SHA-256";
		MessageDigest md = MessageDigest.getInstance(hashImplementation);
		md.update(value.getBytes());
		byte byteData[] = md.digest();
		// convert the byte to hex format method 1
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < byteData.length; i++) {
			sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
		}
		return (sb.toString());
	}

	public static String readPostParameter(String value) {

		if (value == null || isEmpty(value)) {
			return null;
		}

		return value.replaceAll("[\\r\\n]", "");

	}

	/**
	 * the user comment has a length limitation of 35 characters. So, cut user’s
	 * comment into 4 smaller chunks (where each chunk doesn’t exceed 35
	 * characters).
	 * 
	 * @param userComments
	 * @return
	 */
	public static String[] getIMalComments(String userComments) {
		// Local Constant
		final Integer CHUNK_GRANULARITY = 35;
		// declare and define 4 chunks
		String[] commentsArr = new String[4];
		// make sure the customer has a comment
		if (userComments == null) {
			return commentsArr;
		}
		// cleanup the comment from whitespace and get its length
		String comments = userComments.trim();
		Integer commentsLen = comments.length();
		// cut the comment accordingly
		if (commentsLen > 0) {
			// cut 1 chunk where it's upto CHUNK_GRANULARITY size
			if (commentsLen < CHUNK_GRANULARITY) {
				commentsArr[0] = comments.substring(0, commentsLen);
			} else {
				commentsArr[0] = comments.substring(0, CHUNK_GRANULARITY);
			}
			// cut 2 chunk where it's CHUNK_GRANULARITY size upto (CHUNK_GRANULARITY * 2)
			// size
			if (commentsLen >= CHUNK_GRANULARITY && commentsLen < (CHUNK_GRANULARITY * 2)) {
				commentsArr[1] = comments.substring(CHUNK_GRANULARITY, commentsLen);
			} else if (commentsLen >= CHUNK_GRANULARITY) {
				commentsArr[1] = comments.substring(CHUNK_GRANULARITY, (CHUNK_GRANULARITY * 2));
			}
			// cut 3 chunk where it's (CHUNK_GRANULARITY * 2) size upto (CHUNK_GRANULARITY *
			// 3) size
			if (commentsLen >= (CHUNK_GRANULARITY * 2) && commentsLen < (CHUNK_GRANULARITY * 3)) {
				commentsArr[2] = comments.substring((CHUNK_GRANULARITY * 2), commentsLen);
			} else if (commentsLen >= (CHUNK_GRANULARITY * 2)) {
				commentsArr[2] = comments.substring((CHUNK_GRANULARITY * 2), (CHUNK_GRANULARITY * 3));
			}
			// cut 4 chunk where it's (CHUNK_GRANULARITY * 3) size upto (CHUNK_GRANULARITY *
			// 4) size
			if (commentsLen >= (CHUNK_GRANULARITY * 3) && commentsLen < (CHUNK_GRANULARITY * 4)) {
				commentsArr[3] = comments.substring((CHUNK_GRANULARITY * 3), commentsLen);
			} else if (commentsLen >= (CHUNK_GRANULARITY * 3)) {
				commentsArr[3] = comments.substring((CHUNK_GRANULARITY * 3), (CHUNK_GRANULARITY * 4));
			}
		}
		// done
		return commentsArr;
	}

	public static String removeThousandSeperator(String amount) {
		if (amount == null || isEmpty(amount)) {
			return amount;
		}

		amount = amount.replace(",", "").trim();
		return amount;

	}

	public static String validateLanguage(String language) {

		if (language == null)
			return Constants.BUNDLES.DEFAULT_LANGUAGE;

		if (language.equalsIgnoreCase(Constants.BUNDLES.ENGLISH_LANGUAGE)
				|| language.equalsIgnoreCase(Constants.BUNDLES.ARABIC_LANGUAGE))
			return language.toLowerCase();
		else
			return Constants.BUNDLES.DEFAULT_LANGUAGE;
	}

	public static String getAccountNoFromIBan(String IBan) {

		if (IBan == null) {
			return null;
		}

		try {
			return IBan.substring(IBan.length() - 10, IBan.length());
		} catch (Exception ex) {
			return null;
		}
	}

	/**
	 * map eCore language to iMal language and preserve data integrity
	 * 
	 * @param retailLang
	 * @return
	 */
	public static String getImalLang(String retailLang) {

		try {
			if (retailLang.equalsIgnoreCase(Constants.BUNDLES.ENGLISH_LANGUAGE))
				return Constants.IMAL_SMS_LANG.ENGLISH;
			else if (retailLang.equalsIgnoreCase(Constants.BUNDLES.ARABIC_LANGUAGE))
				return Constants.IMAL_SMS_LANG.ARABIC;
			else
				return Constants.IMAL_SMS_LANG.DEFAULT;
		} catch (Exception ex) {
			return Constants.IMAL_SMS_LANG.DEFAULT;
		}

	}

	/*
	 * because of different values for the languages, as E, EN, L, A, AR this method
	 * pass any of those values and will return the equivalent ecore Bundle language
	 * eg: input-> "E" ==> output "en" input-> "L" ==> output "en" input-> "A" ==>
	 * output "ar" input-> "ar" ==> output "ar" input-> "EN" ==> output "en"
	 */
	public static String getEcoreBundleLang(String lang) {
		if (lang.equalsIgnoreCase(Constants.IMAL_CUST_PREFERED_LANG.ENGLISH))
			return Constants.BUNDLES.ENGLISH_LANGUAGE;
		else if (lang.equalsIgnoreCase(Constants.IMAL_CUST_PREFERED_LANG.ENGLISH_E))
			return Constants.BUNDLES.ENGLISH_LANGUAGE;
		else if (lang.equalsIgnoreCase(Constants.BUNDLES.ENGLISH_LANGUAGE))
			return Constants.BUNDLES.ENGLISH_LANGUAGE;
		else if (lang.equalsIgnoreCase(Constants.IMAL_CUST_PREFERED_LANG.ARABIC))
			return Constants.BUNDLES.ARABIC_LANGUAGE;
		else if (lang.equalsIgnoreCase(Constants.BUNDLES.ARABIC_LANGUAGE))
			return Constants.BUNDLES.ARABIC_LANGUAGE;
		else
			return Constants.BUNDLES.DEFAULT_LANGUAGE;

	}

	public static boolean validatIPAdress(String requestIPAddress, String allowdIpAddress) {
		if (allowdIpAddress.trim().equals("*"))
			return true;

		String allowdIps[] = allowdIpAddress.split(",");
		String subIpAddress = null;

		for (int i = 0; i < allowdIps.length; i++) {
			subIpAddress = allowdIps[i].replace("*", "");
			if (requestIPAddress.length() >= subIpAddress.length()
					&& requestIPAddress.trim().substring(0, subIpAddress.length()).equals(subIpAddress)) {
				return true;
			}
		}
		return false;
	}

	public static boolean getBooleanValue(int intValue) {
		if (intValue == Constants.FLAG_STATUS.ACTIVE)
			return true;
		else
			return false;
	}

	public static int getIntValue(boolean boolValue) {
		if (boolValue)
			return Constants.FLAG_STATUS.ACTIVE;
		else
			return Constants.FLAG_STATUS.INACTIVE;
	}

	public static String getDeviceModelName(String technicalModelName, int osTypeId) {

		if (technicalModelName == null || isEmpty(technicalModelName))
			return null;

		if (osTypeId == Constants.DEVICES.OS_TYPES.ANDROID || osTypeId == Constants.DEVICES.OS_TYPES.OTHER)
			return technicalModelName;

		if (technicalModelName.equalsIgnoreCase("iPod5,1"))
			return "iPodTouch 5";
		else if (technicalModelName.equalsIgnoreCase("iPod7,1"))
			return "iPodTouch 6";
		else if (technicalModelName.equalsIgnoreCase("iPhone3,1") || technicalModelName.equalsIgnoreCase("iPhone3,2")
				|| technicalModelName.equalsIgnoreCase("iPhone3,3"))
			return "iPhone 4";
		else if (technicalModelName.equalsIgnoreCase("iPhone4,1"))
			return "= iPhone 4s";
		else if (technicalModelName.equalsIgnoreCase("iPhone5,1") || technicalModelName.equalsIgnoreCase("iPhone5,2"))
			return "iPhone 5";
		else if (technicalModelName.equalsIgnoreCase("iPhone5,3") || technicalModelName.equalsIgnoreCase("iPhone5,4"))
			return "iPhone 5c";
		else if (technicalModelName.equalsIgnoreCase("iPhone6,1") || technicalModelName.equalsIgnoreCase("iPhone6,2"))
			return "iPhone 5s";
		else if (technicalModelName.equalsIgnoreCase("iPhone7,2"))
			return "iPhone 6";
		else if (technicalModelName.equalsIgnoreCase("iPhone7,1"))
			return "iPhone 6 Plus";
		else if (technicalModelName.equalsIgnoreCase("iPhone8,1"))
			return "iPhone 6s";
		else if (technicalModelName.equalsIgnoreCase("iPhone8,2"))
			return "iPhone 6s Plus";
		else if (technicalModelName.equalsIgnoreCase("iPhone8,4") || technicalModelName.equalsIgnoreCase("iPhone8,3"))
			return "iPhone SE";
		else if (technicalModelName.equalsIgnoreCase("iPhone9,1") || technicalModelName.equalsIgnoreCase("iPhone9,3"))
			return "iPhone 7";
		else if (technicalModelName.equalsIgnoreCase("iPhone9,2") || technicalModelName.equalsIgnoreCase("iPhone9,4"))
			return "iPhone 7 Plus";
		else if (technicalModelName.equalsIgnoreCase("iPhone10,1".toLowerCase())
				|| technicalModelName.equalsIgnoreCase("iPhone10,4".toLowerCase()))
			return "iPhone 8";
		else if (technicalModelName.equalsIgnoreCase("iPhone10,2".toLowerCase())
				|| technicalModelName.equalsIgnoreCase("iPhone10,5".toLowerCase()))
			return "iPhone 8 Plus";
		else if (technicalModelName.equalsIgnoreCase("iPhone10,3".toLowerCase())
				|| technicalModelName.equalsIgnoreCase("iPhone10,6".toLowerCase()))
			return "iPhone X";
		else if (technicalModelName.equalsIgnoreCase("iPhone11,8".toLowerCase()))
			return "iPhone XR";
		else if (technicalModelName.equalsIgnoreCase("iPhone11,2".toLowerCase()))
			return "iPhone XS";
		else if (technicalModelName.equalsIgnoreCase("iPhone11,6".toLowerCase())
				|| technicalModelName.equalsIgnoreCase("iPhone11,4".toLowerCase()))
			return "iPhone XS Max";
		else if (technicalModelName.equalsIgnoreCase("iPad2,1") || technicalModelName.equalsIgnoreCase("iPad2,2")
				|| technicalModelName.equalsIgnoreCase("iPad2,3") || technicalModelName.equalsIgnoreCase("iPad2,4"))
			return "iPad 2";
		else if (technicalModelName.equalsIgnoreCase("iPad3,1") || technicalModelName.equalsIgnoreCase("iPad3,2")
				|| technicalModelName.equalsIgnoreCase("iPad3,3"))
			return "iPad 3";
		else if (technicalModelName.equalsIgnoreCase("iPad3,4") || technicalModelName.equalsIgnoreCase("iPad3,5")
				|| technicalModelName.equalsIgnoreCase("iPad3,6"))
			return "iPad 4";
		else if (technicalModelName.equalsIgnoreCase("iPad4,1") || technicalModelName.equalsIgnoreCase("iPad4,2")
				|| technicalModelName.equalsIgnoreCase("iPad4,3"))
			return "iPad Air";
		else if (technicalModelName.equalsIgnoreCase("iPad5,3") || technicalModelName.equalsIgnoreCase("iPad5,4"))
			return "iPad Air 2";
		else if (technicalModelName.equalsIgnoreCase("iPad2,5") || technicalModelName.equalsIgnoreCase("iPad2,6")
				|| technicalModelName.equalsIgnoreCase("iPad2,7"))
			return "iPad Mini";
		else if (technicalModelName.equalsIgnoreCase("iPad4,4") || technicalModelName.equalsIgnoreCase("iPad4,5")
				|| technicalModelName.equalsIgnoreCase("iPad4,6"))
			return "iPad Mini 2";
		else if (technicalModelName.equalsIgnoreCase("iPad4,7") || technicalModelName.equalsIgnoreCase("iPad4,8")
				|| technicalModelName.equalsIgnoreCase("iPad4,9"))
			return "iPad Mini 3";
		else if (technicalModelName.equalsIgnoreCase("iPad5,1") || technicalModelName.equalsIgnoreCase("iPad5,2"))
			return "iPad Mini 4";
		else if (technicalModelName.equalsIgnoreCase("i386") || technicalModelName.equalsIgnoreCase("x86_64")
				|| technicalModelName.equalsIgnoreCase("iPad4,6"))
			return "Simulator";
		else
			return "UnknownDevice(" + technicalModelName + ")";
	}

	public static Double formatPOSAmount(String POSAmount) {

		if (POSAmount == null || isEmpty(POSAmount))
			return 0D;

		String fils = POSAmount.substring(POSAmount.length() - 3, POSAmount.length());
		String kdAmount = POSAmount.substring(0, POSAmount.length() - 3);

		return Double.parseDouble(kdAmount + "." + fils);

	}

	public static HashMap<Integer, Object> getRequestDetailsMap(String cif, String username) {
		String tmpCif = cif;
		String tmpUsername = username;
		if (tmpCif == null)
			tmpCif = "";

		if (tmpUsername == null)
			tmpUsername = "";

		HashMap<Integer, Object> requestDetailsMap = new HashMap<Integer, Object>();
		requestDetailsMap.put(LOG_TRANS_FIELDS.CIF_NUMBER, String.valueOf(tmpCif));
		requestDetailsMap.put(LOG_TRANS_FIELDS.CUSTOMER_NAME_EN, String.valueOf(tmpUsername));
		return requestDetailsMap;
	}

	/**
	 * checking if a xml is well formed
	 * 
	 * @param xmlString
	 * @return
	 */
//	public static ErrorDTO isXmlWellFormed(String xmlString) {
//		ErrorDTO errorDTO = new ErrorDTO();
//		DocumentBuilderFactory dbFactory = null;
//		DocumentBuilder dBuilder = null;
//		Document doc = null;
//		// checking if a XML is well formed
//		try {
//			dbFactory = DocumentBuilderFactory.newInstance();
//			dBuilder = dbFactory.newDocumentBuilder();
//			doc = dBuilder.parse(new InputSource(new StringReader(xmlString)));
//			doc.normalize();
//			// at this point, we can parse and normalize the string, so it's well formed!
//			errorDTO.setErrorCode(ERROR_CODES.SUCCESS);
//		} catch (Exception e) {
//			// at this point all of the values have been uploaded without exception, so set
//			// is pass
//			errorDTO.setErrorCode(ERROR_CODES.FAILED);
//			errorDTO.setErrorDescription(e.getMessage());
//		} finally {
//			if (dbFactory != null) {
//				dbFactory = null;
//			}
//			if (dBuilder != null) {
//				dBuilder = null;
//			}
//			if (doc != null) {
//				doc = null;
//			}
//		}
//		// done
//		return errorDTO;
//	}

	/**
	 * prevents javascript injection by making it not well-formed javascript syntax
	 */
	public static String cleanMedXSS(String value) {
		if (value != null && !UtilityClass.isEmpty(value)) {
			// Text Values to filter out
			value = value.replaceAll("<", "& lt;").replaceAll(">", "& gt;");
			value = value.replaceAll("eval\\((.*)\\)", "");
			value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");
			value = value.replaceAll("script ", "");

			// Base64 values to filter out
			value = value.replaceAll("PHNjcmlwdD4=", "").replaceAll("PFNjcmlwdD4=", "").replaceAll("PFNDUklQVD4=", ""); // This
																														// is
																														// for
																														// <script>,
																														// <Script>
																														// and
																														// <SCRIPT>

			// URL Encoded values to filter out
			value = value.replaceAll("%3C", "& lt;").replaceAll("%3E", "& gt;"); // Replacing > and <
			value = value.replaceAll("eval%28.*%29", ""); // Replacing eval(.*)
			value = value.replaceAll("%20javascript%3A.*", "").replaceAll("%20Javascript%3A.*", "")
					.replaceAll("%20JAVASCRIPT%3A.*", "");// This is for javascript:.*

			// Ascii values to filter out
			// value = value.replaceAll("60", "& lt;").replaceAll("62", "& gt;");//This
			// cannot be done as ascii value for < and > is 60 and 62 respectively
			value = value.replaceAll("101 118 97 108 40 .* 41", ""); // This is for eval(.*)
			value = value.replaceAll("32 106 97 118 97 115 99 114 105 112 116 58.*", ""); // This is for javascript:.*
			value = value.replaceAll("32 74 65 86 65 83 67 82 73 80 84 58.*", "");// This is for JAVASCRIPT:.*
			value = value.replaceAll("115 99 114 105 112 116", ""); // Replace the word 'script'

			// Hexa values to filter out
			value = value.replaceAll("003C", "& lt;").replaceAll("003E", "& gt;");// Replacing > and <
			value = value.replaceAll("0065 0076 0061 006C 0028.*0029", ""); // This is for eval(.*)
			value = value.replaceAll("0020 006A 0061 0076 0061 0073 0063 0072 0069 0070 0074 003A.*", ""); // This is
																											// for
																											// javascript:.*
			value = value.replaceAll("0020 004A 0041 0056 0041 0053 0043 0052 0049 0050 0054 003A.*", ""); // This is
																											// for
																											// JAVASCRIPT:.*
			value = value.replaceAll("0073 0063 0072 0069 0070 0074", "")
					.replaceAll("0053 0063 0072 0069 0070 0074", "").replaceAll("0053 0043 0052 0049 0050 0054", ""); // Replace
																														// the
																														// word
																														// 'script','Script'
																														// and
																														// 'SCRIPT'

		}
		return value;
	}

	/**
	 * 
	 * @param userEmail
	 * @return boolean
	 */
	public static boolean isValidEmail(String userEmail) {
		return userEmail.matches(Constants.EMAIL_VALIDATOR.EMAIL_REGEX);
	}

	/**
	 * It's true if and only if an Arabic Unicode is found in the text. The range
	 * 0600 - 06E0 is the code point range of Arabic characters and symbols.
	 */
	public static boolean isProbablyArabic(String s) {
		if (s != null) {
			for (int i = 0; i < s.length();) {
				int c = s.codePointAt(i);
				if (c >= 0x0600 && c <= 0x06E0)
					return true;
				i += Character.charCount(c);
			}
		}
		return false;
	}

	/**
	 * String.length() uses UTF-16, so English Unicode for UTF-8 and UTF-16 are the
	 * same, but for Arabic, String.length() would use UTF-16 where the database
	 * will still use UTF-8. For instance, if we have 4 Arabic characters,
	 * String.length() would give 4, but the database sees 8 which can be a problem
	 * if the database has a length constraint
	 */
	public static boolean doesNotSurpassDatabaseLength(String string, Integer length) {
		try {
			int allowedMaxNikenameLength = isProbablyArabic(string) ? /* Arabic doubled */ length * 2 : length;
			if (string != null)
				return string.getBytes(StandardCharsets.UTF_8).length > allowedMaxNikenameLength;
			else
				return false;
		} catch (Exception exception) {
			UtilityClass.logMe(utilLogger, exception);
			return false;
		}
	}

//	public static String getSOAUserAgentPhrase(RequestDTO requestDTO) {
//		String userAgentPhrase = "";
//
//		if (requestDTO.getChannelKey() != null) {
//			userAgentPhrase = requestDTO.getChannelKey();
//			if (System.getProperty("weblogic.Name") != null) {
//				userAgentPhrase += " ;" + System.getProperty("weblogic.Name") + "; ";
//			}
//		}
//
//		return userAgentPhrase;
//	}

//	public static Map<String, List<String>> getSOAHeader(RequestDTO requestDTO) {
//		Map<String, List<String>> headers = new HashMap();
//		headers.put("user-agent", Collections.singletonList(getSOAUserAgentPhrase(requestDTO)));
//		return headers;
//	}

	/**
	 * for instance, global message condition for a series of items may look as
	 * this: CIF in (1, 2, 3, 4) We want it to be converted to this format:
	 * ,1,2,3,4,
	 * 
	 * So, when checking if the the item exists, we will simply write this in java
	 * (where seriesOfItem is ,1,2,3,4,): seriesOfItem.contains(","+CIF+",");
	 */
	public static String globalMessageSeriesOfItemsParaser(String seriesOfItem) {
		// make sure it's null
		if (seriesOfItem == null || UtilityClass.isEmpty(seriesOfItem)) {
			// oops, the string is null or empty
			return null;
		}
		// TODO: for now, just apply it for "CIF in "
		if (!seriesOfItem.contains("CIF in")) {
			return seriesOfItem;
		}
		// get the value inside the parenthese: from CIF in (1, 2, 3, 4) to (1, 2, 3, 4)
		String tmp = seriesOfItem.substring(seriesOfItem.indexOf("CIF in"));
		String cifs = "";
		Integer lastParenthese = 0;
		do {
			lastParenthese = tmp.indexOf(')') + 1;
			cifs += tmp.substring(tmp.indexOf('('), lastParenthese);
			// remove the parenthese now and the white-space
			cifs = cifs.replace("(", ",").replace(")", ",").replace(" ", "");
		} while ((tmp = tmp.substring(lastParenthese)).contains("CIF in"));
		// done
		return cifs;
	}

//	public static boolean isOSVersionSupported(String minimumSupportedVersion, RequestDTO requestDTO) {
//
//		if (requestDTO == null)
//			return false;
//
//		if (requestDTO.getOperatingSystemVersion() == null)
//			return false;
//
//		try {
//			Integer minVersion = Integer.parseInt(minimumSupportedVersion.replace(".", ""));
//			String deviceOsVersion = requestDTO.getOperatingSystemVersion();
//
//			// Integer deviceVersion =
//			// Integer.parseInt(requestDTO.getOperatingSystemVersion().replace(".", "")) ;
//
//			if (StringUtils.countOccurrencesOf(deviceOsVersion, ".") == 0) {
//				deviceOsVersion = deviceOsVersion + ".0";
//			}
//
//			if (StringUtils.countOccurrencesOf(deviceOsVersion, ".") == 1) {
//				deviceOsVersion = deviceOsVersion + ".0";
//			}
//
//			Integer deviceVersion = Integer.parseInt(deviceOsVersion.replace(".", ""));
//
//			if (deviceVersion >= minVersion)
//				return true;
//			else
//				return false;
//
//		} catch (Exception ex) {
//			logMe(utilLogger, ex);
//			return false;
//		}
//
//	}

//	public static boolean isAppVersionSupported(RequestDTO requestDTO, String minIPhoneVersion,
//			String minAndroidVersion) {
//
//		try {
//			if (requestDTO == null)
//				return false;
//
//			if (requestDTO.getBbynAppVersion() == null)
//				return false;
//
//			if (requestDTO.getOperatingSystemId() == Constants.DEVICES.OS_TYPES.IOS) {
//				if (minIPhoneVersion == null)
//					return true;
//
//				if (Integer.parseInt(requestDTO.getBbynAppVersion().replace(".", "")) >= Integer
//						.parseInt(minIPhoneVersion.replace(".", "")))
//					return true;
//				else
//					return false;
//
//			} else if (requestDTO.getOperatingSystemId() == Constants.DEVICES.OS_TYPES.ANDROID) {
//				if (minAndroidVersion == null)
//					return true;
//
//				if (Integer.parseInt(requestDTO.getBbynAppVersion().replace(".", "")) >= Integer
//						.parseInt(minAndroidVersion.replace(".", "")))
//					return true;
//				else
//					return false;
//
//			} else {
//				return false;
//			}
//
//		} catch (Exception ex) {
//			UtilityClass.logMe(utilLogger, ex);
//			return false;
//		}
//
//	}

	public static String xOR(String v1, String v2) {
		StringBuilder sb = new StringBuilder();
		for (int k = 0; k < v1.length(); k++)
			sb.append((v1.charAt(k) ^ v2.charAt(k + (Math.abs(v1.length() - v2.length())))));
		return sb.toString();
	}

	/**
	 * Granting an employee a customer service to allow the request to be
	 * authenticated in controller service access level. If the employee hasn’t
	 * been granted, the controller service access would reject the request
	 * 
	 * @param serviceID
	 * @param requestDTO
	 */
//	public static void grantEmployeeACustomerService(Integer serviceID, RequestDTO requestDTO) {
//		try {
//			// add it if it doesn't exist
//			String service = "'" + serviceID + "'";
//			if (!requestDTO.getVisibleServices().contains(service)) {
//				requestDTO.setVisibleServices(requestDTO.getVisibleServices().concat(",").concat(service));
//			}
//		} catch (Exception exception) {
//			UtilityClass.logMe(utilLogger, exception);
//		}
//	}

//	public static Integer getMappedCommunicationStatus(Integer status, String source, String destination,
//			RequestDTO requestDTO) {
//
//		Integer returnedStatus;
//
//		if ((source.equals(Constants.SYSTEMS.IMAL)) && destination.equals(Constants.SYSTEMS.ECORE)) {
//			switch (status) {
//			case Constants.NOTIFICATIONS.COMMUNICATION_METHOD_IMAL.OFF:
//				returnedStatus = Constants.NOTIFICATIONS.COMMUNICATION_METHOD_ECORE.OFF;
//				break;
//			default:
//				returnedStatus = status;
//				break;
//			}
//
//		} else if ((source.equals(Constants.SYSTEMS.ECORE)) && (destination.equals(Constants.SYSTEMS.IMAL))) {
//			switch (status) {
//			case Constants.NOTIFICATIONS.COMMUNICATION_METHOD_ECORE.OFF:
//				returnedStatus = Constants.NOTIFICATIONS.COMMUNICATION_METHOD_IMAL.OFF;
//				break;
//			default:
//				returnedStatus = status;
//				break;
//			}
//
//		} else if ((source.equals(Constants.SYSTEMS.MOBILE)) && (destination.equals(Constants.SYSTEMS.ECORE))) {
//			if (isAppVersionSupported(requestDTO, Constants.APPLICATIONS_VERSIONS.IPHONE.R2_RELEASE,
//					Constants.APPLICATIONS_VERSIONS.ANDROID.R2_RELEASE)) {
//				switch (status) {
//				case Constants.NOTIFICATIONS.COMMUNICATION_METHOD_MOBILE.SMS:
//					returnedStatus = Constants.NOTIFICATIONS.COMMUNICATION_METHOD_ECORE.SMS;
//					break;
//				case Constants.NOTIFICATIONS.COMMUNICATION_METHOD_MOBILE.PN:
//					returnedStatus = Constants.NOTIFICATIONS.COMMUNICATION_METHOD_ECORE.PN;
//					break;
//				case Constants.NOTIFICATIONS.COMMUNICATION_METHOD_MOBILE.OFF:
//					returnedStatus = Constants.NOTIFICATIONS.COMMUNICATION_METHOD_ECORE.OFF;
//					break;
//				default:
//					returnedStatus = -99;
//					break;
//				}
//			} else {
//				returnedStatus = status;
//			}
//
//		} else if ((source.equals(Constants.SYSTEMS.ECORE)) && (destination.equals(Constants.SYSTEMS.MOBILE))) {
//
//			if (isAppVersionSupported(requestDTO, Constants.APPLICATIONS_VERSIONS.IPHONE.R2_RELEASE,
//					Constants.APPLICATIONS_VERSIONS.ANDROID.R2_RELEASE)) {
//				switch (status) {
//				case Constants.NOTIFICATIONS.COMMUNICATION_METHOD_ECORE.SMS:
//					returnedStatus = Constants.NOTIFICATIONS.COMMUNICATION_METHOD_MOBILE.SMS;
//					break;
//				case Constants.NOTIFICATIONS.COMMUNICATION_METHOD_ECORE.PN:
//					returnedStatus = Constants.NOTIFICATIONS.COMMUNICATION_METHOD_MOBILE.PN;
//					break;
//				case Constants.NOTIFICATIONS.COMMUNICATION_METHOD_ECORE.OFF:
//					returnedStatus = Constants.NOTIFICATIONS.COMMUNICATION_METHOD_MOBILE.OFF;
//					break;
//				case Constants.NOTIFICATIONS.COMMUNICATION_METHOD_ECORE.NOT_SET_BY_USER:
//					returnedStatus = Constants.NOTIFICATIONS.COMMUNICATION_METHOD_MOBILE.SMS;
//					break;
//				default:
//					returnedStatus = -99;
//					break;
//				}
//			} else {
//				returnedStatus = status;
//			}
//		} else {
//			returnedStatus = status;
//		}
//
//		return returnedStatus;
//
//	}

	public static String getMappedCreditCardCommunicationType(Integer status) {

		if (status == null || isEmpty(status))
			return Constants.NOTIFICATIONS.CREDIT_CARD_NOTIF_TYPES.SMS;

		if (status.equals(Constants.NOTIFICATIONS.COMMUNICATION_METHOD_MOBILE.SMS))
			return Constants.NOTIFICATIONS.CREDIT_CARD_NOTIF_TYPES.SMS;
		else if (status.equals(Constants.NOTIFICATIONS.COMMUNICATION_METHOD_MOBILE.SMS_AND_PN))
			return Constants.NOTIFICATIONS.CREDIT_CARD_NOTIF_TYPES.BOTH;
		else
			return Constants.NOTIFICATIONS.CREDIT_CARD_NOTIF_TYPES.SMS;
	}

	public static String getCreditCardCommunicationTypeFromIMal(String notificationType) {

		try {
			if (UtilityClass.isEmpty(notificationType)) {
				return Constants.NOTIFICATIONS.CREDIT_CARD_NOTIF_TYPES.SMS;
			}

			if (notificationType.equals("1") || notificationType.equalsIgnoreCase("p")
					|| notificationType.equalsIgnoreCase("b")) {
				return Constants.NOTIFICATIONS.CREDIT_CARD_NOTIF_TYPES.BOTH;
			} else if (notificationType.equals("0") || notificationType.equalsIgnoreCase("s")) {
				return Constants.NOTIFICATIONS.CREDIT_CARD_NOTIF_TYPES.SMS;
			} else {
				return Constants.NOTIFICATIONS.CREDIT_CARD_NOTIF_TYPES.SMS;
			}
		} catch (Exception ex) {
			logMe(utilLogger, ex);
			return Constants.NOTIFICATIONS.CREDIT_CARD_NOTIF_TYPES.SMS;
		}

	}

	public static Integer getMappedCreditCardCommunicationType(String status) {

		if (status == null || isEmpty(status))
			return Constants.NOTIFICATIONS.COMMUNICATION_METHOD_MOBILE.SMS;

		if (status.equals(Constants.NOTIFICATIONS.CREDIT_CARD_NOTIF_TYPES.SMS))
			return Constants.NOTIFICATIONS.COMMUNICATION_METHOD_MOBILE.SMS;
		else if (status.equals(Constants.NOTIFICATIONS.CREDIT_CARD_NOTIF_TYPES.BOTH))
			return Constants.NOTIFICATIONS.COMMUNICATION_METHOD_MOBILE.SMS_AND_PN;
		else if (status.equals(Constants.NOTIFICATIONS.CREDIT_CARD_NOTIF_TYPES.NOT_SET_BY_USER))
			return Constants.NOTIFICATIONS.COMMUNICATION_METHOD_MOBILE.SMS;
		else
			return Constants.NOTIFICATIONS.COMMUNICATION_METHOD_MOBILE.SMS;
	}

	public static boolean isValidAddress(String address) {
		try {
			return Pattern.compile("\\.?[a-zA-Z0-9\\.?\\-? ,? ]+").matcher(address).matches();
		} catch (Exception ex) {
			UtilityClass.logMe(utilLogger, ex);
			return false;
		}

	}

	public static boolean isValidCivilID(String civilId) {
		if (civilId == null || civilId.length() != 12)
			return false;
		int result = 11
				- ((Integer.parseInt(civilId.substring(0, 1)) * 2 + Integer.parseInt(civilId.substring(1, 2)) * 1
						+ Integer.parseInt(civilId.substring(2, 3)) * 6 + Integer.parseInt(civilId.substring(3, 4)) * 3
						+ Integer.parseInt(civilId.substring(4, 5)) * 7 + Integer.parseInt(civilId.substring(5, 6)) * 9
						+ Integer.parseInt(civilId.substring(6, 7)) * 10 + Integer.parseInt(civilId.substring(7, 8)) * 5
						+ Integer.parseInt(civilId.substring(8, 9)) * 8 + Integer.parseInt(civilId.substring(9, 10)) * 4
						+ Integer.parseInt(civilId.substring(10, 11)) * 2) % 11);
		return (result == Integer.parseInt(civilId.substring(11, 12)));
	}

	/**
	 * This method returns the first n number of words in a given sentence
	 * 
	 * @param line
	 * @param n
	 * @return
	 */
	public static String getFirstNWordsFromString(String line, int n) {
		line = line.replaceAll("_", "").replaceAll("  ", " ");
		line += " ";
		Pattern pattern = Pattern.compile("\\w*\\s|\\p{InArabic}+\\w*\\s");// Get words
		Matcher matcher = pattern.matcher(line);
		StringBuilder stringValue = new StringBuilder();
		int i = 0;
		while (matcher.find()) {
			if (i != n)
				stringValue.append(matcher.group()).append(" ");
			else
				break;
			i++;
		}

		return stringValue.toString().trim();
	}

	/**
	 * This method replaces emoji tags with emoji and returns the substituted
	 * altered text
	 * 
	 * @param text
	 * @return
	 * @throws Exception
	 */
	public static String replaceEmojiTagsWithEmoji(String text) throws Exception {
		Pattern emojiKeyValueExtractorPattern = Pattern.compile("<emoji\\stype=\"([^\"]+)");
		Pattern emojiTagPattern = Pattern.compile("\\<emoji\\s([^\\>]+)\\/\\>");

		Matcher matcher = emojiTagPattern.matcher(text);
		while (matcher.find()) {
			Matcher emojiKeyMatcher = emojiKeyValueExtractorPattern.matcher(matcher.group());
			while (emojiKeyMatcher.find()) {
				String emojiKey = emojiKeyMatcher.group(1);
				String emoji = null;// EChatFacade.getInstance(BUNDLES.DEFAULT_LANGUAGE).getEmojisMap(null).get(emojiKey);
				if (emoji != null) {
					text = text.replaceAll(matcher.group(), emoji);
				} else {
					text = text.replaceAll(matcher.group(), "");
				}
			}
		}
		return text;
	}

//	public static boolean isAppSupportUxUiRevamp(RequestDTO requestDTO) {
//
//		return isAppVersionSupported(requestDTO, Constants.APPLICATIONS_VERSIONS.IPHONE.UX_UI_REVAMP,
//				Constants.APPLICATIONS_VERSIONS.ANDROID.UX_UI_REVAMP);
//	}

	public static String deleleExtraSpaces(String str) { // custom method to remove multiple space
		StringBuilder sb = new StringBuilder();
		for (String s : str.split(" ")) {

			if (!s.equals("")) // ignore space
				sb.append(s + " "); // add word with 1 space

		}
		return sb.toString();
	}

	/**
	 * This method is used to remove the words in a question that are not
	 * appropriate for the logged in customer's gender. For ex: "Hello Sir/Madam".
	 * If logged in customer is male, then the resultant text will be "Hello Sir"
	 * 
	 * @param text
	 * @param gender
	 * @return
	 */
	public static String getGenderStyle(String text, String gender) {// custom method to remove multiple space
		if (UtilityClass.isEmpty(gender) || UtilityClass.isEmpty(text))
			return text;
		text = text.replace("\n", " -NEW_LINE-");
		String[] list = text.split(" ");
		String word = "";
		String varGender = null;

		for (int i = 0; i < list.length; i++) {
			varGender = list[i].trim();
			if (list[i].contains("/") && !list[i].contains("http") && !list[i].contains("html")
					&& !list[i].contains("/>")) {
				String[] twoWords = list[i].split("/");
				if (twoWords.length == 2 && (twoWords[0].matches("\\p{L}+") || twoWords[1].matches("\\p{L}+"))) {
					if (Constants.GENDER.MALE.equalsIgnoreCase(gender)) {
						varGender = twoWords[0];
					} else { // female
						varGender = twoWords[1];
					}
				}
			}
			word = word + " " + varGender;
		}
		word = word.trim().replace(" -NEW_LINE-", "\n");

		return (word);
	}

	/**
	 * This method may use when we want to stopa service in some inetrval period
	 * 
	 * @return
	 */
	public static boolean disableWay4Service() {
		Calendar calendar1 = Calendar.getInstance();
		calendar1.set(Calendar.SECOND, 0);
		calendar1.set(Calendar.MINUTE, 0);
		calendar1.set(Calendar.HOUR, 7);
		calendar1.set(Calendar.AM_PM, Calendar.AM);
		calendar1.set(Calendar.MONTH, Calendar.APRIL);
		calendar1.set(Calendar.DAY_OF_MONTH, 13);
		calendar1.set(Calendar.YEAR, 2018);
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(Calendar.SECOND, 0);
		calendar2.set(Calendar.MINUTE, 30);
		calendar2.set(Calendar.HOUR, 1);
		calendar2.set(Calendar.AM_PM, Calendar.PM);
		calendar2.set(Calendar.MONTH, Calendar.APRIL);
		calendar2.set(Calendar.DAY_OF_MONTH, 13);
		calendar2.set(Calendar.YEAR, 2018);

		Date now = new Date();

		if (now.after(calendar1.getTime()) && now.before(calendar2.getTime())) {
			return true;
		}

		return false;
	}

	public static boolean arabicOnly(String value) {
		String input = value;
		if (input != null) {
			char[] chars = input.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				int charCode = (int) chars[i];
				// Accept space, comma and dot as well.
				if (charCode != 46 && charCode != 44 && charCode != 32 && charCode != 45
						&& (charCode < 1569 || charCode > 1610)) {
					return false;
				}
			} // for
		}
		return true;
	}

	public static boolean containsArabic(String text) {
		if (text == null) {
			return false;
		}
		char[] charArray = text.toCharArray();
		for (char character : charArray) {
			if (character >= 0x600 && character <= 0x6ff) {
				return true;
			}
			if (character >= 0x750 && character <= 0x77f) {
				return true;
			}
			if (character >= 0xfb50 && character <= 0xfc3f) {
				return true;
			}
			if (character >= 0xfe70 && character <= 0xfefc) {
				return true;
			}
		}
		return false;
	}

	public static Environment getEnvironment() {
		String env = System.getProperty("bbyn.environment");
		if (((env != null && !isEmpty(env)) && env.equalsIgnoreCase("production"))) {
			return Constants.Environment.PRODUCTION;
		} else if ((env != null && !isEmpty(env)) && env.equalsIgnoreCase("uat")) {
			return Constants.Environment.UAT;
		} else if ((env != null && !isEmpty(env)) && env.toLowerCase().contains("BB-PC")) {
			return Constants.Environment.DEV;
		}
		return null;
	}

	/**
	 * Checks if the given string is number in decimal format
	 * 
	 * @param source
	 * @return
	 */
	public static boolean isDecimalOnly(String source) {
		Pattern pattern = Pattern.compile("\\d.+");
		return pattern.matcher(source).matches();
	}

	public static String cleanAliases(String alias) {
		if (alias != null && !isEmpty(alias)) {
			alias = alias.replaceAll(" +", " ");
			alias = alias.replace(" ?", "");
			alias = alias.replace(" ؟", "");
			alias = alias.replace("أ", "ا");
			alias = alias.replace("آ", "ا");
			alias = alias.replace("إ", "ا");
			alias = alias.replace("ة", "ه");
			// FIXME:test again after adding ال
			alias = alias.replaceAll("^ال", "");
			alias = alias.replaceAll("\\sال", " ");
			alias = alias.replaceAll("ي\\b", "ى");
		}
		return alias;
	}

	public static String cleanBags(String bagKeyWord) {
		if (bagKeyWord != null && !isEmpty(bagKeyWord)) {
			bagKeyWord = bagKeyWord.replaceAll("ي\\b", "ى");
		}
		return bagKeyWord;
	}

	public static String subString(String value, int size, boolean addDots) {

		if (value == null || isEmpty(value))
			return value;

		if (size <= 0)
			return null;

		if (value.length() == size)
			return value.substring(0, value.length());

		if (value.length() > size) {
			String result = value.substring(0, value.length() - 1);

			if (addDots)
				result += " ...";
			return result;
		}

		return value;

	}

	public static String cleanArabicFamousChars(String text) {
		if (text == null || UtilityClass.isEmpty(text))
			return null;
		text = text.replaceAll("أ", "ا");
		text = text.replaceAll("آ", "ا");
		text = text.replaceAll("إ", "ا");
		text = text.replaceAll("ة", "ه");

		return text;
	}

	public static String maskCreditCardNumber(String text) {
		if (UtilityClass.isEmpty(text)) {
			return null;
		}
		final String MASKCARD = "$1XXXXXX$2";
		final Pattern PATTERNCARD = Pattern.compile("\\b([0-9]{6})[0-9]{0,9}([0-9]{4})\\b");
		Matcher matcher = PATTERNCARD.matcher(text);
		if (matcher.find()) {
			return matcher.replaceAll(MASKCARD).replace("cvv", "");
		}
		return text;

	}

	/**
	 * Substitutes substitution keys with the substitution value extracted from the
	 * map
	 * 
	 * @param configuredText
	 * @param substitutionStringMap
	 * @return
	 */
	public static String getSubstitutedText(String configuredText, Map<String, String> substitutionStringMap) {
		if (configuredText != null && !UtilityClass.isEmpty(configuredText)) {
			configuredText = configuredText.replaceAll("  ", " ");// Replace all double space with single space

			if (substitutionStringMap != null && !substitutionStringMap.isEmpty()) {
				Iterator<Entry<String, String>> iterator = substitutionStringMap.entrySet().iterator();
				while (iterator.hasNext()) {
					Entry<String, String> entry = iterator.next();
					String substitutionVariable = entry.getKey();
					String substitutionValue = entry.getValue() == null ? ""
							: entry.getValue().replaceAll("\\$", "DollarSign");

					configuredText = configuredText.replaceAll(substitutionVariable, substitutionValue)
							.replaceAll("DollarSign", "\\$");
				}
			}
		}
		return configuredText != null ? configuredText.trim() : configuredText;
	}

//	public static String convertArabicUnicodeToString(String arabicUniCode) {
//		try {
//
//			if (arabicUniCode == null)
//				return null;
//			return StringEscapeUtils.unescapeJava(arabicUniCode);
//		} catch (Exception ex) {
//			utilLogger.info("************* arabicUniCode = " + arabicUniCode);
//			UtilityClass.logMe(utilLogger, ex);
//			return arabicUniCode;
//		}
//	}

	public static String getWUStatusCode(String wuTransactionStatus) {

		if (wuTransactionStatus == null || isEmpty(wuTransactionStatus))
			return WU_TRANSACTION_STATUS.WU_TRANSACTION_STATUS_CODES.UNKNOWN;

		if (wuTransactionStatus.equalsIgnoreCase(WU_TRANSACTION_STATUS.AVAILABLE))
			return WU_TRANSACTION_STATUS.WU_TRANSACTION_STATUS_CODES.AVAILABLE;
		else if (wuTransactionStatus.equalsIgnoreCase(WU_TRANSACTION_STATUS.REFUND_COMPLETED))
			return WU_TRANSACTION_STATUS.WU_TRANSACTION_STATUS_CODES.COMPLETED_REFUND;
		else if (wuTransactionStatus.equalsIgnoreCase(WU_TRANSACTION_STATUS.COMPLETEDSMS))
			return WU_TRANSACTION_STATUS.WU_TRANSACTION_STATUS_CODES.COMPLETEDSMS;
		else if (wuTransactionStatus.equalsIgnoreCase(WU_TRANSACTION_STATUS.PAID))
			return WU_TRANSACTION_STATUS.WU_TRANSACTION_STATUS_CODES.PAID;
		else if (wuTransactionStatus.equalsIgnoreCase(WU_TRANSACTION_STATUS.PAID_OTHER))
			return WU_TRANSACTION_STATUS.WU_TRANSACTION_STATUS_CODES.PAID_OTHER;
		else if (wuTransactionStatus.equalsIgnoreCase(WU_TRANSACTION_STATUS.SUSPENDED))
			return WU_TRANSACTION_STATUS.WU_TRANSACTION_STATUS_CODES.SUSPENDED;
		else
			return WU_TRANSACTION_STATUS.WU_TRANSACTION_STATUS_CODES.UNKNOWN;
	}

	public static int getUWHistoryIconCode(String wuTransactionStatus) {

		if (wuTransactionStatus.equalsIgnoreCase(WU_TRANSACTION_STATUS.AVAILABLE))
			return WU_TRANSACTION_STATUS.WU_HISTORY_ICON_CODES.PENDING_ICON;
		else if (wuTransactionStatus.equalsIgnoreCase(WU_TRANSACTION_STATUS.COMPLETED_REFUND))
			return WU_TRANSACTION_STATUS.WU_HISTORY_ICON_CODES.COMPLETED_ICON;
		else if (wuTransactionStatus.equalsIgnoreCase(WU_TRANSACTION_STATUS.COMPLETEDSMS))
			return WU_TRANSACTION_STATUS.WU_HISTORY_ICON_CODES.COMPLETED_ICON;
		else if (wuTransactionStatus.equalsIgnoreCase(WU_TRANSACTION_STATUS.PAID))
			return WU_TRANSACTION_STATUS.WU_HISTORY_ICON_CODES.COMPLETED_ICON;
		else if (wuTransactionStatus.equalsIgnoreCase(WU_TRANSACTION_STATUS.PAID_OTHER))
			return WU_TRANSACTION_STATUS.WU_HISTORY_ICON_CODES.COMPLETED_ICON;
		else if (wuTransactionStatus.equalsIgnoreCase(WU_TRANSACTION_STATUS.SUSPENDED))
			return WU_TRANSACTION_STATUS.WU_HISTORY_ICON_CODES.SUSPENDED_ICON;
		else
			return WU_TRANSACTION_STATUS.WU_HISTORY_ICON_CODES.COMPLETED_ICON;
	}

	public static String getWUPresentationStatusName(String wuTransactionStatus) {

		if (wuTransactionStatus == null || isEmpty(wuTransactionStatus))
			return WU_TRANSACTION_STATUS.WU_TRANSACTION_STATUS_CODES.UNKNOWN;

		if (wuTransactionStatus.equalsIgnoreCase(WU_TRANSACTION_STATUS.AVAILABLE))
			return WU_TRANSACTION_STATUS.WU_TRANSACTION_STATUS_NAMES_BUNDLES.AVAILABLE;
		else if (wuTransactionStatus.equalsIgnoreCase(WU_TRANSACTION_STATUS.PAID))
			return WU_TRANSACTION_STATUS.WU_TRANSACTION_STATUS_NAMES_BUNDLES.PAID;
		else if (wuTransactionStatus.equalsIgnoreCase(WU_TRANSACTION_STATUS.SUSPENDED))
			return WU_TRANSACTION_STATUS.WU_TRANSACTION_STATUS_NAMES_BUNDLES.SUSPENDED;
		else if (wuTransactionStatus.equalsIgnoreCase(WU_TRANSACTION_STATUS.REFUND_COMPLETED))
			return WU_TRANSACTION_STATUS.WU_TRANSACTION_STATUS_NAMES_BUNDLES.REFUND_COMPLETED;
		else
			return WU_TRANSACTION_STATUS.WU_TRANSACTION_STATUS_NAMES_BUNDLES.DEFAULT;

	}

	/**
	 * Check string contains more than one space in between the given characters
	 * 
	 * @param input
	 * @return
	 */
	public static boolean checkSpacesBetweenAnswer(String input) {
		int i = 0, spaceCount = 0;
		String words = input.toLowerCase().trim();
		while (i < words.length()) {
			if (words.charAt(i) == ' ') {
				spaceCount++;
			}
			i++;
		}
		if (spaceCount > 1) {
			return true;
		}
		return false;
	}

	/**
	 * Check UserName contain more than two repeated consecutive characters.
	 * 
	 * @param input
	 * @return
	 */
	public static boolean checkConsecutiveChars(String input) {
		int count = 0;
		String inputs = input.toLowerCase().trim();
		for (int i = 0; i < inputs.length() - 1; i++) {
			if (inputs.charAt(i) == inputs.charAt(i + 1)) {
				count++;
			} else {
				count = 0;
			}
			if (count >= 2)
				return true;
		}
		return false;
	}

	/**
	 * Check UserName contain more than two repeated consecutive numbers.
	 * 
	 * @param input
	 * @return
	 */
	public static boolean checkPwdWithSeqNums(String input) {
		String pattern = "^(?=\\d{4}$)(?:(.)\\1*|0?1?2?3?4?5?6?7?8?9?|9?8?7?6?5?4?3?2?1?0?)$";
		return input.matches(pattern);
	}

	/**
	 * Check UserName contain more than two repeated consecutive characters.
	 * 
	 * @param input
	 * @return
	 */
	public static boolean checPwdWithSeqChars(String input) {
		boolean isSeqChar = true;
		String inputs = input.toLowerCase().trim();
		for (int i = 1; i < inputs.length(); i++) {
			if (inputs.charAt(i) != inputs.charAt(i - 1) + 1) {
				isSeqChar = false;
			}
		}
		return isSeqChar;
	}

	/**
	 * This function is to remove spaces & all special chars except numbers
	 * 
	 * @param PhoneNumber
	 * @param IsLocalNumber
	 * @return phone number
	 */

	public static String cleanPhoneNumber(String PhoneNumber, boolean IsLocalNumber) {
		if (IsLocalNumber && PhoneNumber.length() > 8) {
			return PhoneNumber.replaceAll("[^0-9]", "").substring(PhoneNumber.replaceAll("[^0-9]", "").length() - 8); // get
																														// last
																														// 8
																														// Digits
																														// of
																														// Number
																														// which
																														// is
																														// KuwaitNumber
		} else if (!IsLocalNumber) {
			return PhoneNumber.replaceAll("[^0-9]", ""); // get Digits only
		} else {
			return PhoneNumber;
		}
	}

	public static void logMe(Logger logger, Exception ex) {
		logger.debug("Exception occurred at " + Thread.currentThread().getName(), ex);
		// ex.printStackTrace();
	}

	public static boolean isNFCFooOnly() {
		return NFC.WALLET_ACTIONS.ENABLE_FOO_DEBIT && !NFC.WALLET_ACTIONS.ENABLE_VTS_DEBIT;
	}

//	public static boolean isNFCVTSOnly() {
//		return !NFC.WALLET_ACTIONS.ENABLE_FOO_DEBIT && NFC.WALLET_ACTIONS.ENABLE_VTS_DEBIT;
//	}

	public static boolean isNFCFooAndVTSEnabled() {
		return NFC.WALLET_ACTIONS.ENABLE_FOO_DEBIT && NFC.WALLET_ACTIONS.ENABLE_VTS_DEBIT;
	}

	public static boolean isNFCVTSEnabled() {
		return NFC.WALLET_ACTIONS.ENABLE_VTS_DEBIT;
	}

	public static boolean isNFCFooDebitEnabled() {
		return NFC.WALLET_ACTIONS.ENABLE_FOO_DEBIT;
	}

	public static String convertArabicNumbersToDecimal(String number) {
		if (isEmpty(number))
			return number;

		try {
			char[] chars = new char[number.length()];
			for (int i = 0; i < number.length(); i++) {
				char ch = number.charAt(i);
				if (ch >= 0x0660 && ch <= 0x0669)
					ch -= 0x0660 - '0';
				else if (ch >= 0x06f0 && ch <= 0x06F9)
					ch -= 0x06f0 - '0';
				chars[i] = ch;
			}
			return new String(chars);
		} catch (Exception ex) {
			logMe(utilLogger, ex);
			return number;
		}

	}

	/**
	 * Formats the number without decimals values. Shows comma. Ex: if number is
	 * 90000, returned value is 90,000
	 * 
	 * @param number
	 * @return
	 */
	public static String formatNumberWithoutDecimals(String number) {
		if (number == null) {
			return null;
		}
		double amount = Double.parseDouble(number);
		if (amount < 0.0) {
			amount = (-1) * amount;
		}
		DecimalFormat formatter = new DecimalFormat("#,###");
		return formatter.format(amount);
	}

	/**
	 * Replaces certain words in reward statement with a more customer friendly
	 * description
	 * 
	 * @param description
	 * @param amount
	 * @return
	 */
	public static String replaceRewardsStatementText(String description, String amount) {
		if ("usman CB- Credit".equalsIgnoreCase(description)) {
			description = "CashBack";
		} else if ("Redemption".equalsIgnoreCase(description)) {
			description = "Debit";
		} else if (amount != null && "Adjustment".equalsIgnoreCase(description)) {
			if (amount.startsWith("-")) {
				description = "Debit";
			} else {
				description = "Credit";
			}
		} else if (amount != null && "Discretionary".equalsIgnoreCase(description)) {
			if (amount.startsWith("-")) {
				description = "Auto CashBack";
			} else {
				description = "Points Earned";
			}
		}
		return description;
	}

	public static String generateAndroidNone() {
		String nonce = generateUniqueNumber();
		return nonce;
	}

	public static String generateSecureToken(String cif) {
		String randomNumber = generateRandomNumber(3);
		String uuid = UUID.randomUUID().toString();
		String secureToken = randomNumber + cif + uuid;
		return secureToken;

	}

	public static String convertMapToFormattedString(Map<String, List<String>> map) {
		StringBuilder mapAsString = new StringBuilder("{");
		for (String key : map.keySet()) {
			mapAsString.append(key + "=" + map.get(key) + ", \n");
		}
		mapAsString.delete(mapAsString.length() - 2, mapAsString.length()).append("}");
		return mapAsString.toString() + "\n";
	}

	public static String addSpaceBeforeEmoji(String str) {
		return str.replaceAll("(?=[^\\p{L}\\p{N}\\p{P}\\p{Z}])", " ");
	}

	public static String addSpaceAfterEmoji(String str) {
		return str.replaceAll("(?<=[^\\p{L}\\p{N}\\p{P}\\p{Z}])", " ");
	}

	public static String addSpaceBeforeAndAfterEmoji(String str) {
		return addSpaceAfterEmoji(addSpaceBeforeEmoji(str));
	}

	/**
	 * Extracts a list of URLs from a provided String and returns
	 * @param text
	 * @return
	 */
	public static List<String> extractUrls(String text)
	{
	    List<String> containedUrls = new ArrayList<String>();
	    if(text!=null){
		    String urlRegex = "((https?|ftp|gopher|telnet|file):((//)|(\\\\))+[\\w\\d:#@%/;$()~_?\\+-=\\\\\\.&]*)";
		    Pattern pattern = Pattern.compile(urlRegex, Pattern.CASE_INSENSITIVE);
		    Matcher urlMatcher = pattern.matcher(text);
		    while (urlMatcher.find())
		    {
		        containedUrls.add(text.substring(urlMatcher.start(0),urlMatcher.end(0)));
		    }
	    }
	    return containedUrls;
	}
	
	public static boolean isUAT()  {
		return (UsmanRuntimeEnvironment.getDomainConfigValue(XML_TAG_NAMES.ENVIRONMENT).equals(Constants.APPLICATIONS_VERSIONS.ENVIRONMENT.UAT));
	}
	
	public static boolean isDev()  {
		Environment env = getEnvironment();
		return env==null ||  env.toString().toLowerCase().contains("dev");
	}
	public static boolean isDevOrUAT()  {
		Environment env = getEnvironment();
		return env==null || isUAT() || env.toString().toLowerCase().contains("uat") || env.toString().toLowerCase().contains("dev");
	}
	
	public static Map<String, String> getParameterQueryMap(String query)  
	{  
	    String[] params = query.split("&");  
	    Map<String, String> map = new HashMap<String, String>();  
	    for (String param : params)  
	    {  
	        String name = param.split("=")[0];  
	        String value = param.split("=")[1];  
	        map.put(name, value);  
	    }  
	    return map;  
	}
}
