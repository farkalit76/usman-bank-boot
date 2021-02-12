/**
 * @Copyright reserved to bank
 */
package com.usman.bank.customer.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.usman.bank.models.CustomerProfilesDTO;

/**
 * Description: This class CustomerProfileRowMapper.java
 *
 * @author  vXebiau
 * @date    Oct 2, 2019
 * @version 1.0
 *
 */
public class RowMapperCustomerProfile implements RowMapper<CustomerProfilesDTO> {

	@Override
	public CustomerProfilesDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new CustomerProfilesDTO(rs.getLong("cust_id"), rs.getString("name_ar"), rs.getString("name_en"), rs.getString("user_name"), rs.getDate("dob"), rs.getString("mobile_no"));
	}
}
