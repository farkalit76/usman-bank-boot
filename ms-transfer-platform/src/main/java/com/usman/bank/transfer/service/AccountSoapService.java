/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.service;

import java.util.List;

import com.usman.bank.models.AccountDTO;
import com.usman.bank.models.RequestDTO;
import com.usman.bank.transfer.exception.AccountsException;
import com.usman.bank.transfer.request.TransferInitReq;

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
	List<AccountDTO> getAccounts(TransferInitReq accountReq, RequestDTO requestDTO) throws AccountsException;

	/**
	 * 
	 * @param toAccount
	 * @param cifNumber
	 * @return
	 * @throws AccountsException
	 */
	AccountDTO getAccountByCIFAndAccount(String toAccount, String cifNumber, RequestDTO requestDTO) throws AccountsException;
}
