/**
 * @Copyright reserved to bank
 */
package com.usman.bank.customer.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.usman.bank.customer.exception.CustomerException;
import com.usman.bank.customer.repository.CustomerRepository;
import com.usman.bank.customer.utils.SQLConstants;
import com.usman.bank.models.CustomerProfilesDTO;
import com.usman.bank.models.CustomersDTO;
import com.usman.bank.utils.Utility;

/**
 * Description: This class CustomerRepositoryImpl.java
 *
 * @author vXebiau
 * @date Sep 12, 2019
 * @version 1.0
 *
 */
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

	private static final Logger LOG = LogManager.getLogger(CustomerRepositoryImpl.class);

	@Autowired
	private NamedParameterJdbcTemplate namedJdbcTemplate;

	@Override
	public CustomersDTO getCustomerByCif(String cif) throws CustomerException {
		LOG.debug("CustomerRepositoryImpl. getCustomerByCif...");
		MapSqlParameterSource mapParams = new MapSqlParameterSource();
		mapParams.addValue("cif", cif);
		List<CustomersDTO> customers = namedJdbcTemplate.query(SQLConstants.SELECT_CUST_BYCIFNUMBER, mapParams, new RowMapperCustomers());
		if (!Utility.isEmpty(customers))
			return customers.get(0);

		return new CustomersDTO();
	}

	@Override
	public Integer updateUserStatus(int statusId, int lockReasonId, int custId) throws CustomerException {
		LOG.debug("CustomerRepositoryImpl. updateUserStatus...");
		MapSqlParameterSource mapParams = new MapSqlParameterSource();
		mapParams.addValue("statusId", statusId);
		mapParams.addValue("lockReasonId", lockReasonId);
		mapParams.addValue("custId", custId);
		int updateStatus = namedJdbcTemplate.update(SQLConstants.UPDATE_CUST_STATUS, mapParams);
		if (updateStatus != 0) {
			LOG.debug("Customer data updated for custId " + custId);
		} else {
			LOG.debug("No Customer found with custId " + custId);
		}
		return updateStatus;
	}

	@Override
	public List<CustomerProfilesDTO> getCustomerProfiles() throws CustomerException {
		LOG.debug("CustomerRepositoryImpl. getCustomerProfiles...");
		List<CustomerProfilesDTO> customers = namedJdbcTemplate.query(SQLConstants.SELECT_CUST_PROFILES, new RowMapperCustomerProfile());
		if (!Utility.isEmpty(customers))
			return customers;

		return new ArrayList<>();
	}

//	@Override
//	public CustomerDTO getCustomerByCifNumber(String cif) {
//		LOG.debug("CustomerRepositoryImpl. getCustomerByCifNumber...");
//		MapSqlParameterSource mapParams = new MapSqlParameterSource();
//		mapParams.addValue("cif", cif);
//		List<CustomerDTO> customers = namedJdbcTemplate.query(SQLConstants.SELECT_CUST_BYCIFNUMBER, mapParams, new RowMapperCustomers());
//		if (!Utility.isEmpty(customers))
//			return customers.get(0);
//
//		return new CustomerDTO();
//	}

	@Override
	public CustomerProfilesDTO getCustomerProfileByCustId(String custId) {
		LOG.debug("CustomerRepositoryImpl. getCustomerProfileByCustId...");
		MapSqlParameterSource mapParams = new MapSqlParameterSource();
		mapParams.addValue("custId", custId);
		List<CustomerProfilesDTO> customers = namedJdbcTemplate.query(SQLConstants.SELECT_CUST_PROFILES_BYCUSTID, mapParams,
				(rs, rowNum) -> new CustomerProfilesDTO(rs.getLong("cust_id"), rs.getString("name_ar"), rs.getString("name_en"),
						rs.getString("user_name"), rs.getDate("dob"), rs.getString("mobile_no")));
		if (!Utility.isEmpty(customers))
			return customers.get(0);

		return new CustomerProfilesDTO();
	}

}
