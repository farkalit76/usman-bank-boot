/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usman.bank.models.LogMasterDTO;
import com.usman.bank.utility.exception.AuditLogExecption;
import com.usman.bank.utility.repository.AuditLogRepository;
import com.usman.bank.utility.service.AuditLogService;

/**
 * Description: This class AuditLogServiceImpl.java
 *
 * @author vXebiau
 * @date Sep 11, 2019
 * @version 1.0
 *
 */
@Service
public class AuditLogServiceImpl implements AuditLogService {

	private static final Logger LOG = LogManager.getLogger(AuditLogServiceImpl.class);

	@Autowired
	private AuditLogRepository auditLogRepository;

	@Override
	public Integer saveLog(LogMasterDTO logEntiry) throws AuditLogExecption {
		Integer saveStatus = auditLogRepository.saveLog(logEntiry);
		LOG.info("Log Master saved. Status:" + saveStatus);
		return saveStatus;
	}

	@Override
	public List<LogMasterDTO> getLogMasters() throws AuditLogExecption {
		List<LogMasterDTO> findAll = auditLogRepository.getAuditLogs();
		LOG.info("Log Master size:" + findAll.size());
		return findAll;
	}

}
