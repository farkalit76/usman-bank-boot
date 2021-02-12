/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.repository.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.usman.bank.models.CurrencyDTO;
import com.usman.bank.utility.repository.CommonRepository;
import com.usman.bank.utility.utils.SQLConstants;

/**
 * Description: This class CommonRepositoryImpl.java
 *
 * @author vXebiau
 * @date Nov 7, 2019
 * @version 1.0
 *
 */
@Repository
public class CommonRepositoryImpl implements CommonRepository {

	private static final Logger LOG = LogManager.getLogger(CommonRepositoryImpl.class);

	@Autowired
	private NamedParameterJdbcTemplate namedJdbcTemplate;

	@Override
	public List<CurrencyDTO> getCurrencies() {
		LOG.debug("AuditLogRepositoryImpl.getCurrencies...");
		return namedJdbcTemplate.query(SQLConstants.COMMON_CURRENCIES, new RowMapperCurrencies());
	}

}
