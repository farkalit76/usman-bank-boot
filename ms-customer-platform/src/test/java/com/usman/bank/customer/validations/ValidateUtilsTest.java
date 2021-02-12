/**
 * @Copyright reserved to bank
 */
package com.usman.bank.customer.validations;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.usman.bank.customer.request.CustomerReq;
import com.usman.bank.customer.validations.ValidateUtils;

/**
 * Description: This class ValidateUtilsTest.java
 *
 * @author  vXebiau
 * @date    Sep 12, 2019
 * @version 1.0
 *
 */
@RunWith(SpringRunner.class)
public class ValidateUtilsTest {

	private ValidateUtils utils = new ValidateUtils();
	
	@Test
	public void validateCustomerInputTest() {
		CustomerReq request = new CustomerReq();
		request.setCifNumber("12345");
		boolean validFlag = utils.validateCustomerInput(request);
		assertTrue("Input is not null",validFlag);
	}
	
	@Test
	public void validateCustomerInputNullTest() {
		CustomerReq request = new CustomerReq();
		request.setCifNumber(null);
		boolean validFlag = utils.validateCustomerInput(request);
		assertFalse("Input is  null",validFlag);
	}
	
	@Test
	public void validateCustomerNullTest() {
		boolean validFlag = utils.validateCustomerInput(null);
		assertFalse("Input is  null",validFlag);
	}
}
