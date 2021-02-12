/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.repository;

import java.util.List;

import com.usman.bank.models.CurrencyDTO;

/**
 * Description: This class CommonRepository.java
 *
 * @author vXebiau
 * @date Nov 7, 2019
 * @version 1.0
 *
 */
public interface CommonRepository {

	/**
	 * Get all currency details.
	 * 
	 * @return
	 */
	List<CurrencyDTO> getCurrencies();
}
