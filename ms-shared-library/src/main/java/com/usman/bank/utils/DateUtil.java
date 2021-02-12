package com.usman.bank.utils;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.usman.bank.constants.DateTimeConst;

/**
 * Created by Veneesh on 8/23/14.
 */
public final class DateUtil {

	public static String getStringFormattedDate(Date pDate, String format) {
		String stringFormattedDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		stringFormattedDate = sdf.format(pDate);
		return stringFormattedDate;
	}

	public static Date getFormattedDate(Date pDate, String format) {
		try {
			String stringFormattedDate = null;
			Date formattedDate = null;
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			stringFormattedDate = sdf.format(pDate);
			formattedDate = sdf.parse(stringFormattedDate);
			return formattedDate;
		} catch (Exception ex) {
			return null;
		}
	}

	public static Date getCurrentFormattedDateTime(String format) {
		Calendar calendar = Calendar.getInstance();
		if (format == null) {
			format = DateTimeConst.DateFormats.DD_MM_YYYY_HHMMSS_SSS;
		}
		return getFormattedDate(calendar.getTime(), format);
	}

	public static Timestamp getCurrentFormattedDateTime() {
		return getCurrentTimestamp();
	}

	public static String getCurrentTime() {
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND)
				+ ":" + calendar.get(Calendar.MILLISECOND);
	}

	public static int getDateInfo(Date date, int type) {
		if (date == null)
			return -1;
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int value = -1;
		if (type == Calendar.MONTH)
			value = cal.get(type) + 1;
		else
			value = cal.get(type);
		return value;
	}

	public static Timestamp getCurrentTimestamp() {
		Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
		return currentTimestamp;
	}

	public static Timestamp getCurrentTimestamp(int type, int value) {
		Date dNow = new Date(); // Instantiate a Date object
		Calendar cal = Calendar.getInstance();
		cal.setTime(dNow);
		cal.add(type, value);
		dNow = cal.getTime();
		return new Timestamp(dNow.getTime());
	}

	public static long diff(Timestamp d1, Timestamp d2) {

		long diff = d2.getTime() - d1.getTime();
		long diffSeconds = diff / 1000 % 60;
		long diffMinutes = diff / (60 * 1000) % 60;
		long diffHours = diff / (60 * 60 * 1000) % 24;
		long diffDays = diff / (24 * 60 * 60 * 1000);

		long diffInMin = (diffDays * 24 * 60) + (diffHours * 60) + (diffMinutes) + (diffSeconds / 60);
		return diffInMin;
	}

	public static boolean isCurrentTimeBetween(String time1, String time2) {
		try {
			SimpleDateFormat format = new SimpleDateFormat("DD-MMM-yyyy HH:mm:ss");
			Date date1 = format.parse("01-Jan-2016 " + time1);
			Date date2 = format.parse("01-Jan-2016 " + time2);
			Calendar calendar = Calendar.getInstance();
			Time currentTime = new Time(calendar.getTimeInMillis());
			Date currentDate = format.parse("01-Jan-2016 " + currentTime);
			return (currentDate.after(date1) && currentDate.before(date2));
		} catch (Exception ex) {
			return false;
		}

	}

	/**
	 * convert String to Date
	 * 
	 * @param strDate
	 * @param format
	 * @return converted Date object
	 * @throws ParseException
	 */
	public static Date convertStringToDate(String strDate, String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return (sdf.parse(strDate));
	}

}
