/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.repository.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.usman.bank.models.LogMasterDTO;
import com.usman.bank.utility.repository.impl.AuditLogRepositoryImpl;
import com.usman.bank.utility.repository.impl.RowMapperLogMaster;
import com.usman.bank.utility.utils.SQLConstants;

/**
 * Description: This class AuditLogRepositoryImpl.java
 *
 * @author vXebiau
 * @date Sep 18, 2019
 * @version 1.0
 *
 */
@RunWith(SpringRunner.class)
public class AuditLogRepositoryImplTest {

	@InjectMocks
	private AuditLogRepositoryImpl auditRepositoy;

	@Mock
	private NamedParameterJdbcTemplate namedJdbcTemplate;

	@Test
	public void getAuditLogsTest() throws Exception {
		List<LogMasterDTO> logEntity = new ArrayList<LogMasterDTO>();
		logEntity.add(new LogMasterDTO());
		when(namedJdbcTemplate.query(SQLConstants.SELECT_LOGS, new RowMapperLogMaster())).thenReturn(logEntity);
		List<LogMasterDTO> logList = auditRepositoy.getAuditLogs();
		assertEquals(0, logList.size());
	}

	@Test
	public void saveLogTest() throws Exception {
		LogMasterDTO logEntity = new LogMasterDTO();
		String insertAuditLogs = SQLConstants.insertAuditLogs();
		assertNotNull(insertAuditLogs);
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("TRANS_ID", logEntity.getTransId());
		paramSource.addValue("CUST_ID", logEntity.getCustId());
		when(namedJdbcTemplate.update(insertAuditLogs, paramSource)).thenReturn(new Integer(1));
		Integer savedStatus = auditRepositoy.saveLog(logEntity);
		assertEquals(new Integer(0), savedStatus);
	}

}
