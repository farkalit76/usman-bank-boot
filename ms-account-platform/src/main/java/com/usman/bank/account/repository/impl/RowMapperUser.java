/**
 * @Copyright reserved to bank
 */
package com.usman.bank.account.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.usman.bank.models.UserDTO;

/**
 * Description: This class RowMapperUser.java
 *
 * @author vXebiau
 * @date Oct 28, 2019
 * @version 1.0
 *
 */
public class RowMapperUser implements RowMapper<UserDTO> {

	@Override
	public UserDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new UserDTO(rs.getString("user_id"), rs.getString("user_name"), rs.getString("user_code"));
	}
}
