/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.service;

import com.usman.bank.models.CurrencyDTO;
import com.usman.bank.transfer.exception.CommonException;

/**
 * Description: This class CommonService.java
 *
 * @author vXebiau
 * @date Dec 9, 2019
 * @version 1.0
 *
 */
public interface CommonService {

	/**
	 * Get all currency details.
	 * 
	 * @return
	 */
	CurrencyDTO getCurrencies(int currencyId) throws CommonException;
}
