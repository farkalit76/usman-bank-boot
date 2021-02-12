/**
 * @Copyright reserved to bank
 */
package com.usman.bank.customer.repository;

import java.util.List;

import com.usman.bank.customer.exception.CustomerException;
import com.usman.bank.models.CustomerProfilesDTO;
import com.usman.bank.models.CustomersDTO;

/**
 * Description: This class CustomerProfilesRepository.java
 *
 * @author vXebiau
 * @date Jul 1, 2019
 * @version 1.0
 *
 */

public interface CustomerRepository {

	/**
	 * Update the customer status to lock it.
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
	 * Get the customer profile by CIF-number
	 * 
	 * @param cif
	 * @return
	 * @throws CustomerException
	 */
	CustomersDTO getCustomerByCif(String cif) throws CustomerException;

	/**
	 * Get the customer profile by CIF-number
	 * 
	 * @param cif
	 * @return
	 * @throws CustomerException
	 */
	// CustomerDTO getCustomerByCifNumber(String cif);
	/**
	 * Get customer profile by customer id.
	 * 
	 * @param custId
	 * @return
	 */
	CustomerProfilesDTO getCustomerProfileByCustId(String custId);

}
