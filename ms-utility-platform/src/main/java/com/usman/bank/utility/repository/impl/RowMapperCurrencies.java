/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.usman.bank.models.CurrencyDTO;

/**
 * Description: This class RowMapperCurrencies.java
 *
 * @author vXebiau
 * @date Nov 7, 2019
 * @version 1.0
 *
 */
public class RowMapperCurrencies implements RowMapper<CurrencyDTO> {

	@Override
	public CurrencyDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		CurrencyDTO currency = new CurrencyDTO();
		currency.setCurrenyId(rs.getInt("CURRENCY_ID"));
		currency.setCurrencyNameEn(rs.getString("CURRENCY_NAME_EN"));
		currency.setCurrencyNameAr(rs.getString("CURRENCY_NAME_AR"));
		currency.setIsoCurrencyCode(rs.getInt("ISO_CURRECNY_CODE"));
		currency.setIsoCurrencyCodeStr(rs.getString("ISO_CURRENCY_CODE_STR"));
		currency.setFraction(rs.getInt("DECIMAL_POINTS"));
		return currency;
	}
}
