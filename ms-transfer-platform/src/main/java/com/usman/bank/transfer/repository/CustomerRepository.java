/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.repository;

import com.usman.bank.models.CustomersDTO;
import com.usman.bank.transfer.exception.CustomerException;

/**
 * Description: This class CustomerRepository.java
 *
 * @author vXebiau
 * @date Dec 9, 2019
 * @version 1.0
 *
 */
public interface CustomerRepository {

	/**
	 * Get the customer profile by CIF-number
	 * 
	 * @param cif
	 * @return
	 * @throws CustomerException
	 */
	CustomersDTO getCustomerByCif(String cif) throws CustomerException;
}
