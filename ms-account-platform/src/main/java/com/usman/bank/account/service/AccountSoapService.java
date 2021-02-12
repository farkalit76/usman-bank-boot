/**
 * @Copyright reserved to bank
 */
package com.usman.bank.account.service;

import java.util.List;

import com.usman.bank.models.AccountDTO;
import com.usman.bank.account.exception.AccountsException;
import com.usman.bank.account.request.AccountDetailReq;

/**
 * Description: This class IAccountDetailService.java
 *
 * @author vXebiau
 * @date Jul 9, 2019
 * @version 1.0
 *
 */
public interface AccountSoapService {

	/**
	 * 
	 * @param accountRQ
	 * @return
	 * @throws AccountsException
	 */
	List<AccountDTO> getAccountsDetails(AccountDetailReq accountReq) throws AccountsException;
	
	/**
	 * 
	 * @param accountReq
	 * @return
	 * @throws AccountsException
	 */
	//AccountDTO getAccounts(AccountReq accountReq) throws AccountsException;
}
