/**
 * @Copyright reserved to  bank
 */
package com.usman.bank.account.repository.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.usman.bank.models.UserAccountDTO;
import com.usman.bank.utils.Utility;
import com.usman.bank.account.exception.AccountsException;
import com.usman.bank.account.repository.AccountRepository;
import com.usman.bank.account.request.UserReq;
import com.usman.bank.account.utils.SQLConstants;

/**
 * Description: This class AccountRepositoryImpl.java
 *
 * @author vXebiau
 * @date Oct 27, 2019
 * @version 1.0
 *
 */
@Repository
public class AccountRepositoryImpl implements AccountRepository {

	private static final Logger LOG = LogManager.getLogger(AccountRepositoryImpl.class);

	@Autowired
	private NamedParameterJdbcTemplate namedJdbcTemplate;

	@Override
	public UserAccountDTO getAccountById(String accountId) throws AccountsException {
		LOG.debug("AccountRepositoryImpl. getAccountById...");
		MapSqlParameterSource mapParams = new MapSqlParameterSource();
		mapParams.addValue("accountId", accountId);
		List<UserAccountDTO> customerAccount = namedJdbcTemplate.query(SQLConstants.SELECT_ACC_BY_ACCID, mapParams,
				new RowMapperAccount());
		if (!Utility.isEmpty(customerAccount))
			return customerAccount.get(0);
		return new UserAccountDTO();
	}

	@Override
	public UserAccountDTO getAccountByNumber(String accountNumber) throws AccountsException {
		LOG.debug("AccountRepositoryImpl. getAccountByNumber...");
		MapSqlParameterSource mapParams = new MapSqlParameterSource();
		mapParams.addValue("accountNumber", accountNumber);
		List<UserAccountDTO> customerAccount = namedJdbcTemplate.query(SQLConstants.SELECT_ACC_BY_ACCNUMBER, mapParams,
				new RowMapperAccount());
		if (!Utility.isEmpty(customerAccount))
			return customerAccount.get(0);
		return new UserAccountDTO();
	}

	@Override
	public UserAccountDTO getDefaultAccount(UserReq userReq) throws AccountsException {
		LOG.debug("AccountRepositoryImpl. getDefaultAccount...");
		MapSqlParameterSource mapParams = new MapSqlParameterSource();
		String selectSQL = "";
		if (!Utility.isEmpty(userReq.getUserId())) {
			selectSQL = SQLConstants.SELECT_ACC_BY_USERID;
			mapParams.addValue("userId", userReq.getUserId());
		} else {
			selectSQL = SQLConstants.SELECT_ACC_BY_USERCODE;
			mapParams.addValue("userCode", userReq.getBooqId());
		}
		List<UserAccountDTO> customerAccount = namedJdbcTemplate.query(selectSQL, mapParams, new RowMapperAccount());
		if (!Utility.isEmpty(customerAccount))
			return customerAccount.get(0);
		return new UserAccountDTO();
	}

	@Override
	public List<UserAccountDTO> getAccounts(String cifNumber) throws AccountsException {
		LOG.debug("AccountRepositoryImpl. getAccountByNumber...");
		MapSqlParameterSource mapParams = new MapSqlParameterSource();
		mapParams.addValue("cifNumber", cifNumber);
		List<UserAccountDTO> cifAccounts = namedJdbcTemplate.query(SQLConstants.SELECT_ACC_BY_ACCNUMBER, mapParams,
				new RowMapperAccount());
		return cifAccounts;
	}

}
