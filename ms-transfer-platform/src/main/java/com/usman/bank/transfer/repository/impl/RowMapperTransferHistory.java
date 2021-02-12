/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.usman.bank.models.TransferHistoryDTO;

/**
 * Description: This class TransferHistoryRowMapper.java
 *
 * @author vXebiau
 * @date Oct 27, 2019
 * @version 1.0
 *
 */
public class RowMapperTransferHistory implements RowMapper<TransferHistoryDTO> {

	@Override
	public TransferHistoryDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new TransferHistoryDTO(rs.getLong("channel_id"), rs.getLong("cust_trans_id"));
	}
}
