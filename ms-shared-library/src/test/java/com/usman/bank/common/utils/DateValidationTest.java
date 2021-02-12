package com.usman.bank.common.utils;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.usman.bank.validations.DateValidation;

public class DateValidationTest {

	@Test
	public void testIsValidDate()
	{
		boolean flag = DateValidation.isValidDate("10/03/1960");
		assertTrue(flag);
	}
}
