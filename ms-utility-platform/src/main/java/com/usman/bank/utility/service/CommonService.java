/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.service;

import java.util.List;

import com.usman.bank.models.CurrencyDTO;
import com.usman.bank.utility.exception.UtilityServicesException;
import com.usman.bank.utility.request.EmailReq;

/**
 * Description: This class CommonService.java
 *
 * @author  vXebiau
 * @date    Nov 7, 2019
 * @version 1.0
 *
 */
public interface CommonService {

	/**
	 * Get all currency details.
	 * 
	 * @return
	 */
	List<CurrencyDTO> getCurrencies();
	
	/**
	 * Send email
	 * 
	 * @param emailReq
	 * @return
	 * @throws UtilityServicesException
	 */
	boolean sendEmail(EmailReq emailReq) throws UtilityServicesException;
}
