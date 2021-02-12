/**
 * @Copyright reserved to bank
 */
package com.usman.bank.account.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.usman.bank.models.UserAccountDTO;

/**
 * Description: This class RowMapperAccount.java
 *
 * @author vXebiau
 * @date Oct 27, 2019
 * @version 1.0
 *
 */
public class RowMapperAccount implements RowMapper<UserAccountDTO> {

	@Override
	public UserAccountDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new UserAccountDTO(rs.getString("ACCOUNT_ID"), rs.getString("ACCOUNT_NUMBER"),
				rs.getBigDecimal("AVAILABLE_BALANCE"), rs.getBigDecimal("CURRENT_BALANCE"));
	}
}
