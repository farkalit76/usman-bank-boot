/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.repository;

import java.util.List;

import com.usman.bank.models.CurrencyDTO;
import com.usman.bank.transfer.exception.CommonException;

/**
 * Description: This class CommonRepository.java
 *
 * @author  vXebiau
 * @date    Dec 9, 2019
 * @version 1.0
 *
 */
public interface CommonRepository {

	/**
	 * Get all currency details.
	 * 
	 * @return
	 */
	List<CurrencyDTO> getCurrencies() throws CommonException;
}
