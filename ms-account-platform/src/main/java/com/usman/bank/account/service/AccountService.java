/**
 * @Copyright reserved to bank
 */
package com.usman.bank.account.service;

import com.usman.bank.models.UserAccountDTO;
import com.usman.bank.account.exception.AccountsException;
import com.usman.bank.account.request.UserReq;

/**
 * Description: This class AccountService.java
 *
 * @author vXebiau
 * @date Jun 27, 2019
 * @version 1.0
 *
 */

public interface AccountService {

	/**
	 * 
	 * @param accountId
	 * @return
	 * @throws AccountsException
	 */
	UserAccountDTO getAccountById(String accountId) throws AccountsException;

	/**
	 * 
	 * @param accountNumber
	 * @return
	 * @throws AccountsException
	 */
	UserAccountDTO getAccountByNumber(String accountNumber) throws AccountsException;

	/**
	 * Get default account by user id.
	 * 
	 * @param userDto
	 * @return
	 * @throws AccountsException
	 */
	UserAccountDTO getDefaultAccount(UserReq userReq) throws AccountsException;

}
