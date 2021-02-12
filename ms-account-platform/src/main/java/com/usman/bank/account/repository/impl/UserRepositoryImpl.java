/**
 * @Copyright reserved to bank
 */
package com.usman.bank.account.repository.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.usman.bank.models.UserDTO;
import com.usman.bank.utils.Utility;
import com.usman.bank.account.exception.UserException;
import com.usman.bank.account.repository.UserRepository;
import com.usman.bank.account.utils.SQLConstants;

/**
 * Description: This class UserRepositoryImpl.java
 *
 * @author vXebiau
 * @date Oct 28, 2019
 * @version 1.0
 *
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

	private static final Logger LOG = LogManager.getLogger(UserRepositoryImpl.class);

	@Autowired
	private NamedParameterJdbcTemplate namedJdbcTemplate;

	@Override
	public UserDTO getUserByBooqId(String booqId) throws UserException {
		LOG.debug("UserRepositoryImpl.getUserByBooqId...");
		MapSqlParameterSource mapParams = new MapSqlParameterSource();
		mapParams.addValue("userCode", booqId);
		List<UserDTO> customerAccount = namedJdbcTemplate.query(SQLConstants.SELECT_USER_BY_USERCODE, mapParams,
				new RowMapperUser());
		if (!Utility.isEmpty(customerAccount))
			return customerAccount.get(0);
		return new UserDTO();
	}

}
