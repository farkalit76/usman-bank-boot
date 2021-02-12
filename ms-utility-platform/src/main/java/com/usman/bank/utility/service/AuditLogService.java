/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.service;

import java.util.List;

import com.usman.bank.models.LogMasterDTO;
import com.usman.bank.utility.exception.AuditLogExecption;

/**
 * Description: This class AuditLogService.java
 *
 * @author vXebiau
 * @date Sep 11, 2019
 * @version 1.0
 *
 */
public interface AuditLogService {

	/**
	 * 
	 * @param logMaster
	 * @return
	 * @throws AuditLogExecption
	 */
	Integer saveLog(LogMasterDTO logMaster) throws AuditLogExecption;

	/**
	 * 
	 * @return
	 * @throws AuditLogExecption
	 */
	List<LogMasterDTO> getLogMasters() throws AuditLogExecption;
}
