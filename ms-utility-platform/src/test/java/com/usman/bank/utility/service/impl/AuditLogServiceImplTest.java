/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.service.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import com.usman.bank.models.LogMasterDTO;
import com.usman.bank.utility.repository.AuditLogRepository;
import com.usman.bank.utility.service.impl.AuditLogServiceImpl;

/**
 * Description: This class AuditLogServiceImplTest.java
 *
 * @author vXebiau
 * @date Sep 18, 2019
 * @version 1.0
 *
 */
@RunWith(SpringRunner.class)
public class AuditLogServiceImplTest {

	@InjectMocks
	private AuditLogServiceImpl logService;

	@Mock
	private AuditLogRepository auditLogRepository;

	@Test
	public void saveLogTest() throws Exception {
		LogMasterDTO logMasters = new LogMasterDTO();
		when(auditLogRepository.saveLog(Mockito.any())).thenReturn(new Integer(1));
		Integer logs = logService.saveLog(logMasters);
		assertEquals(new Integer(1), logs);
	}

	@Test
	public void getLogMastersTest() throws Exception {
		List<LogMasterDTO> logMasters = new ArrayList<LogMasterDTO>();
		logMasters.add(new LogMasterDTO());
		when(auditLogRepository.getAuditLogs()).thenReturn(logMasters);
		List<LogMasterDTO> logs = logService.getLogMasters();
		assertEquals(1, logs.size());
	}
}
