/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.usman.bank.models.LogMasterDTO;

/**
 * Description: This class LogMasterRowMapper.java
 *
 * @author vXebiau
 * @date Sep 18, 2019
 * @version 1.0
 *
 */
public class RowMapperLogMaster implements RowMapper<LogMasterDTO> {

	@Override
	public LogMasterDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		LogMasterDTO master = new LogMasterDTO(rs.getLong("trans_id"), rs.getInt("cust_id"),
				rs.getInt("log_service_id"), rs.getInt("log_action_id"), rs.getString("remark"));
		master.setTransDate(rs.getTimestamp("trans_date"));
		master.setLogStatusId(rs.getInt("log_status_id"));
		master.setRemark(rs.getString("remark"));
		master.setUserType(rs.getInt("user_type"));
		master.setManagedServer(rs.getString("managed_server"));
		master.setCookie(rs.getString("cookie"));
		master.setLocalAddress(rs.getString("local_address"));
		master.setLocalServer(rs.getString("local_server"));
		master.setUserAgent(rs.getString("user_agent"));
		master.setExtraInfo(rs.getString("extra_info"));
		master.setChannelId(rs.getInt("channel_id"));
		return master;
	}

}
