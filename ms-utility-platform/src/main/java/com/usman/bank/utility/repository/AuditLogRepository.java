/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.repository;

import java.util.List;

import com.usman.bank.models.LogMasterDTO;
import com.usman.bank.utility.exception.AuditLogExecption;

/**
 * Description: This class AuditLogRepository.java
 *
 * @author vXebiau
 * @date Sep 12, 2019
 * @version 1.0
 *
 */
public interface AuditLogRepository {

	/**
	 * Select current 10 log master details
	 * 
	 * @return
	 * @throws AuditLogExecption
	 */
	List<LogMasterDTO> getAuditLogs() throws AuditLogExecption;

	/**
	 * Insert the log master entry
	 * 
	 * @param logEntiry
	 * @return
	 */
	Integer saveLog(LogMasterDTO logEntiry);
}
