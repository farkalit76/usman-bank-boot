/**
 * @Copyright reserved to bank
 */
package com.usman.bank.account.service;

import com.usman.bank.models.UserDTO;
import com.usman.bank.account.exception.UserException;

/**
 * Description: This class UserService.java
 *
 * @author vXebiau
 * @date Oct 28, 2019
 * @version 1.0
 *
 */
public interface UserService {
	/**
	 * Get the User details by userId
	 * 
	 * @param booqId
	 * @return
	 * @throws UserException
	 */
	UserDTO getUserByBooqId(String booqId) throws UserException;
}
