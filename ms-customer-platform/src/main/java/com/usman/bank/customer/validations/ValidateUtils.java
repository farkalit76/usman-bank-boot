/**
 * @Copyright reserved to bank
 */
package com.usman.bank.customer.validations;

import com.usman.bank.customer.request.CustomerReq;
import com.usman.bank.utils.Utility;

/**
 * Description: This class ValidateUtils.java
 *
 * @author  vXebiau
 * @date    Sep 12, 2019
 * @version 1.0
 *
 */
public class ValidateUtils {

	public boolean validateCustomerInput(CustomerReq request) {
		if(!Utility.isEmpty(request)) {
			if( request.getCifNumber() != null ) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
}
