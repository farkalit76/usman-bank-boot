package com.usman.bank.common.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.Time;
import java.sql.Timestamp;

import org.junit.Test;

import com.usman.bank.utils.Utility;

public class CommonUtilityTest {

	@Test
	public void testIsEmptyInt() {
		boolean flag = Utility.isEmpty(0);
		assertTrue(flag);
		boolean flag2 = Utility.isEmpty(10);
		assertFalse(flag2);
	}

	@Test
	public void testIsEmptyLong() {
		boolean flag = Utility.isEmpty(0L);
		assertTrue(flag);
		boolean flag2 = Utility.isEmpty(10L);
		assertFalse(flag2);
	}

	@Test
	public void testIsEmptyObject() {
		boolean flag = Utility.isEmpty(null);
		assertTrue(flag);
		boolean flag2 = Utility.isEmpty("");
		assertTrue(flag2);
		boolean flag3 = Utility.isEmpty(new String("null"));
		assertTrue(flag3);
		boolean flag4 = Utility.isEmpty(new String("0"));
		assertFalse(flag4);
		boolean flag5 = Utility.isEmpty(new Integer(0));
		assertFalse(flag5);
	}

	@Test
	public void testGetCurrentTime() {
		Time time = Utility.getCurrentTime();
		assertNotNull("current time :", time);
	}

	@Test
	public void testGetCurrentTimestamp() {
		Timestamp tstamp = Utility.getCurrentTimestamp();
		assertNotNull("current time stamp:", tstamp);
	}

//	@Test
//	public void testLogMe()
//	{
//		CommonUtility.logMe(new Exception("test log exception"));
//		assertTrue(true);;
//	}
//	
//	@Test
//	public void testLogMeLog()
//	{
//		final Logger LOG = LogManager.getLogger(CommonUtilityTest.class);
//		CommonUtility.logMe( LOG, new Exception("test log exception"));
//		assertTrue(true);;
//	}
}
