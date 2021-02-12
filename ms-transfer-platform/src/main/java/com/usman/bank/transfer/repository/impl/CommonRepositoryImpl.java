/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.repository.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.usman.bank.models.CurrencyDTO;
import com.usman.bank.transfer.exception.CommonException;
import com.usman.bank.transfer.repository.CommonRepository;
import com.usman.bank.transfer.utils.SQLConstants;

/**
 * Description: This class CommonRepositoryImpl.java
 *
 * @author vXebiau
 * @date Dec 9, 2019
 * @version 1.0
 *
 */
@Repository
public class CommonRepositoryImpl implements CommonRepository {

	private static final Logger LOG = LogManager.getLogger(CommonRepositoryImpl.class);

	@Autowired
	private NamedParameterJdbcTemplate namedJdbcTemplate;

	@Override
	public List<CurrencyDTO> getCurrencies() throws CommonException{
		LOG.debug("AuditLogRepositoryImpl.getCurrencies...");
		return namedJdbcTemplate.query(SQLConstants.COMMON_CURRENCIES, new RowMapperCurrencies());
	}

}
