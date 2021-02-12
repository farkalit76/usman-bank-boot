package com.usman.bank.common.utils;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.usman.bank.validations.PhoneValidation;

public class PhoneValidationTest {

	@Test
	public void testIsValidPhone()
	{
		boolean flag = PhoneValidation.isValidPhone("+96512345678");
		assertTrue(flag);
	}
	
}
