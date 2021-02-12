/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.usman.bank.models.CustomersDTO;

/**
 * Description: This class RowMapperCustomers.java
 *
 * @author vXebiau
 * @date Nov 7, 2019
 * @version 1.0
 *
 */
public class RowMapperCustomers implements RowMapper<CustomersDTO> {

	@Override
	public CustomersDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		CustomersDTO customer = new CustomersDTO(rs.getLong("cif"), rs.getInt("status_id"), rs.getInt("lock_reason_id"), rs.getInt("cust_id"));
		customer.setGender(rs.getString("GENDER"));
		
		customer.setCivilId(rs.getString("CIVIL_ID"));
		customer.setCustNameAr(rs.getString("NAME_AR"));
		customer.setCustNameEn(rs.getString("NAME_EN"));
		customer.setUserName(rs.getString("USER_NAME"));
		
		customer.setDob(rs.getDate("DOB"));
		customer.setMobileNo(rs.getString("MOBILE_NO"));
		customer.setPwdExpDate(rs.getDate("PWD_EXP_DATE"));
		customer.setCity(rs.getString("CITY"));
		customer.setState(rs.getString("STATE"));
		customer.setZip(rs.getString("ZIP"));
		customer.setCountryId(rs.getInt("COUNTRY_ID"));
		customer.setNationalityId(rs.getInt("NATIONALITY_ID"));
		customer.setHomePhone(rs.getString("HOME_PHONE"));
		customer.setEmail(rs.getString("EMAIL_ADDRESS"));
		customer.setFirstName(rs.getString("FIRST_NAME"));
		customer.setLastName(rs.getString("LAST_NAME"));
		customer.setMiddleName(rs.getString("MIDDLE_NAME"));
		customer.setTitleId(rs.getString("TITLE_ID"));
		
		return customer;
	}
}
