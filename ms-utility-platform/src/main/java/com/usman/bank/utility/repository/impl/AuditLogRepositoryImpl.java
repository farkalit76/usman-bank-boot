/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.repository.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.usman.bank.models.LogMasterDTO;
import com.usman.bank.utility.exception.AuditLogExecption;
import com.usman.bank.utility.repository.AuditLogRepository;
import com.usman.bank.utility.utils.SQLConstants;

/**
 * Description: This class AuditLogRepositoryImpl.java
 *
 * @author vXebiau
 * @date Sep 12, 2019
 * @version 1.0
 *
 */
@Repository
public class AuditLogRepositoryImpl implements AuditLogRepository {

	private static final Logger LOG = LogManager.getLogger(AuditLogRepositoryImpl.class);

	@Autowired
	private NamedParameterJdbcTemplate namedJdbcTemplate;

	@Override
	public List<LogMasterDTO> getAuditLogs() throws AuditLogExecption {
		LOG.debug("AuditLogRepositoryImpl.getAuditLogs...");
		return namedJdbcTemplate.query(SQLConstants.SELECT_LOGS, new RowMapperLogMaster());
	}

	@Override
	public Integer saveLog(LogMasterDTO logEntiry) {
		LOG.debug("AuditLogRepositoryImpl.saveLog...");
		Integer insertStatus = -1;
		MapSqlParameterSource paramSource = getInsertLogMapValues(logEntiry);

		insertStatus = namedJdbcTemplate.update(SQLConstants.insertAuditLogs(), paramSource);
		if (insertStatus != 0) {
			LOG.debug("Log Master data inserted for ID " + logEntiry.getTransId());
		} 
		return insertStatus;
	}

	/**
	 * Get the parameter sources
	 * 
	 * @param logEntity
	 * @return
	 */
	private MapSqlParameterSource getInsertLogMapValues(LogMasterDTO logEntity) {
		
		Timestamp currentTime = new Timestamp(new Date().getTime());
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("TRANS_ID", logEntity.getTransId());
		paramSource.addValue("CUST_ID", logEntity.getCustId());
		paramSource.addValue("LOG_SERVICE_ID", logEntity.getLogServiceId());
		paramSource.addValue("TRANS_DATE", logEntity.getTransDate());
		paramSource.addValue("LOG_ACTION_ID", logEntity.getLogActionId());
		paramSource.addValue("LOG_STATUS_ID", logEntity.getLogStatusId());
		paramSource.addValue("REMARK", logEntity.getRemark());
		paramSource.addValue("USER_TYPE", logEntity.getUserType());
		paramSource.addValue("MANAGED_SERVER", logEntity.getManagedServer());
		paramSource.addValue("COOKIE", logEntity.getCookie());

		paramSource.addValue("LOCAL_ADDRESS", logEntity.getLocalAddress());
		paramSource.addValue("LOCAL_SERVER", logEntity.getLocalServer());
		paramSource.addValue("USER_AGENT", logEntity.getUserAgent());
		paramSource.addValue("BROWSER_TYPE", logEntity.getBrowserType());
		paramSource.addValue("REMOTE_IP_ADDRESS", logEntity.getRemoteIpAddress());
		paramSource.addValue("CIF_NUMBER", logEntity.getCifNumber());
		paramSource.addValue("CHANNEL_ID", logEntity.getChannelId());
		paramSource.addValue("REQUEST_ACTION_ID", logEntity.getRequestActionId());
		paramSource.addValue("REMOTE_HOST", logEntity.getRemoteHost());
		paramSource.addValue("IP_IN_NUM", logEntity.getIpInNum());

		paramSource.addValue("IP_ROW_INDEX", logEntity.getIpRowIndex());
		paramSource.addValue("REQUEST_TOKEN", logEntity.getRequestToken());
		paramSource.addValue("DB_CREATED_DATE", currentTime);
		paramSource.addValue("CLIENT_TIMESTAMP", currentTime);
		paramSource.addValue("CHANNEL_KEY", logEntity.getChannelKey());
		paramSource.addValue("SESSION_ID", logEntity.getSessionId());
		paramSource.addValue("INTERFACE_LANG", logEntity.getInterfaceLang());
		paramSource.addValue("OS_NAME", logEntity.getOsName());
		paramSource.addValue("OS_VERSION", logEntity.getOsVersion());
		paramSource.addValue("APP_VERSION", logEntity.getAppVersion());

		paramSource.addValue("DEVICE_MODEL", logEntity.getDeviceModel());
		paramSource.addValue("GEOCODE_LATITUDE", logEntity.getGeocodeLatitude());
		paramSource.addValue("GEOCODE_LONGITUDE", logEntity.getGeocodeLongitude());
		paramSource.addValue("IS_DEVICE_ROOTED", logEntity.getIsDeviceRooted());
		paramSource.addValue("EXTRA_INFO", logEntity.getExtraInfo());
		paramSource.addValue("CHANNEL_MODULE", logEntity.getChannelModule());
		paramSource.addValue("SOA_REQ_ID", logEntity.getSoaReqId());

		return paramSource;
	}
}
