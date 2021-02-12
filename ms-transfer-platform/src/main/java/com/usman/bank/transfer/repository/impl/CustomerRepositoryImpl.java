/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.repository.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.usman.bank.models.CustomersDTO;
import com.usman.bank.utils.Utility;
import com.usman.bank.transfer.exception.CustomerException;
import com.usman.bank.transfer.repository.CustomerRepository;
import com.usman.bank.transfer.utils.SQLConstants;

/**
 * Description: This class CustomerRepositoryImpl.java
 *
 * @author vXebiau
 * @date Dec 9, 2019
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
		List<CustomersDTO> customers = namedJdbcTemplate.query(SQLConstants.SELECT_CUST_BY_CIF_NUMBER, mapParams,
				new RowMapperCustomers());
		if (!Utility.isEmpty(customers))
			return customers.get(0);

		return new CustomersDTO();
	}

}
