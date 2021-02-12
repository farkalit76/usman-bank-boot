/**
 * @Copyright reserved to bank
 */
package com.usman.bank.account.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usman.bank.models.UserAccountDTO;
import com.usman.bank.account.exception.AccountsException;
import com.usman.bank.account.repository.AccountRepository;
import com.usman.bank.account.request.UserReq;
import com.usman.bank.account.service.AccountService;

/**
 * Description: This class AccountServiceImpl.java
 *
 * @author vXebiau
 * @date Jun 27, 2019
 * @version 1.0
 *
 */
@Service
public class AccountServiceImpl implements AccountService {

	private static final Logger LOG = LogManager.getLogger(AccountServiceImpl.class);

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public UserAccountDTO getAccountByNumber(String accountNumber) throws AccountsException {
		LOG.debug("AccountServiceImpl.getAccountByNumber started...");
		return accountRepository.getAccountByNumber(accountNumber);
	}

	@Override
	public UserAccountDTO getAccountById(String accountId) throws AccountsException {
		LOG.debug("AccountServiceImpl.getAccountById started...");
		return accountRepository.getAccountById(accountId);
	}

	@Override
	public UserAccountDTO getDefaultAccount(UserReq userReq) throws AccountsException {
		LOG.debug("AccountServiceImpl.getDefaultAccount started...");
		return accountRepository.getDefaultAccount(userReq);
	}

}
