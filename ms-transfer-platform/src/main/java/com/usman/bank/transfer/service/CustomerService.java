/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.service;

import com.usman.bank.models.CustomersDTO;
import com.usman.bank.transfer.exception.CustomerException;

/**
 * Description: This class CustomerService.java
 *
 * @author vXebiau
 * @date Dec 9, 2019
 * @version 1.0
 *
 */
public interface CustomerService {

	/**
	 * Get the customer based on CIF number.
	 * 
	 * @param cifNumber
	 * @return
	 */
	CustomersDTO getCustomerByCIF(String cifNumber) throws CustomerException;

}
