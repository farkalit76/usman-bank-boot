/**
 * @Copyright reserved to bank
 */
package com.usman.bank.customer.service;

import java.util.List;

import com.usman.bank.customer.exception.CustomerException;
import com.usman.bank.models.CustomerProfilesDTO;
import com.usman.bank.models.CustomersDTO;

/**
 * Description: This class CustomerService.java
 *
 * @author vXebiau
 * @date Jun 27, 2019
 * @version 1.0
 *
 */

public interface CustomerService {

	/**
	 * Rest the User authentication.
	 * 
	 * @param cifNumber
	 * @return
	 * @throws CustomerException
	 */
	boolean resetLogin(String cifNumber) throws CustomerException;

	/**
	 * Update the user status.
	 * 
	 * @param statusId
	 * @param lockReasonId
	 * @param custId
	 * @return
	 * @throws CustomerException
	 */
	Integer updateUserStatus(int statusId, int lockReasonId, int custId) throws CustomerException;

	/**
	 * Select all the customer profiles
	 * 
	 * @return
	 */
	List<CustomerProfilesDTO> getCustomerProfiles() throws CustomerException;

	/**
	 * Get the customer based on CIF number.
	 * 
	 * @param cifNumber
	 * @return
	 */
	CustomersDTO getCustomerByCIF(String cifNumber) throws CustomerException;

	/**
	 * Get the customer profile by CIF-number
	 * 
	 * @param cif
	 * @return
	 * @throws CustomerException
	 */
	// CustomerDTO getCustomerByCifNumber(String cif);

	/**
	 * Get customer by customer id.
	 * 
	 * @param custId
	 * @return
	 */
	CustomerProfilesDTO getCustomerProfileByCustId(String custId);
}
