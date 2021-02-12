package com.usman.bank.common.utils;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.usman.bank.validations.EmailValidation;

public class EmailValidationTest {

	@Test
	public void testIsValidEmail()
	{
		boolean flag = EmailValidation.isValidEmail("vxebia@bbynuat.com");
		assertTrue(flag);
	}
}
