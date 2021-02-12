/**
 * @Copyright reserved to bank
 */
package com.usman.bank.account.repository;

import java.util.List;

import com.usman.bank.models.UserAccountDTO;
import com.usman.bank.account.exception.AccountsException;
import com.usman.bank.account.request.UserReq;

/**
 * Description: This class AccountRepository.java
 *
 * @author vXebiau
 * @date Jun 27, 2019
 * @version 1.0
 *
 */
public interface AccountRepository {

	/**
	 * Using NAtive query with parameter
	 * 
	 * @param status
	 * @return
	 */
	UserAccountDTO getAccountById(String accountId) throws AccountsException;

	/**
	 * Get the account detail by account number
	 * 
	 * @param accountNumber
	 * @return
	 * @throws AccountsException
	 */
	UserAccountDTO getAccountByNumber(String accountNumber) throws AccountsException;

	/**
	 * Get default account by user id.
	 * 
	 * @param userId
	 * @return
	 * @throws AccountsException
	 */
	UserAccountDTO getDefaultAccount(UserReq userReq) throws AccountsException;
	
	/**
	 * 
	 * @param cifNumber
	 * @return
	 * @throws AccountsException
	 */
	List<UserAccountDTO> getAccounts(String cifNumber) throws AccountsException;
}
