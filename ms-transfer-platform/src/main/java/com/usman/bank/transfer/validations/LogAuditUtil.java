/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.validations;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.usman.bank.constants.Constants.LogTransactionStatus;
import com.usman.bank.constants.Constants.UserStatus;
import com.usman.bank.models.LogMasterDTO;
import com.usman.bank.models.RequestDTO;
import com.usman.bank.utils.Utility;

/**
 * Description: This class LogAuditUtil.java
 *
 * @author vXebiau
 * @date Nov 27, 2019
 * @version 1.0
 *
 */
@Component
public class LogAuditUtil {

	private static final Logger LOG = LogManager.getLogger(LogAuditUtil.class);

	/**
	 * Generate Log Master DTO
	 * 
	 * @param cifNumber
	 * @param logMaster
	 * @param transStatus
	 * @param ex
	 * @param remark
	 * @param requestDto
	 * @return
	 */
	public LogMasterDTO audit(String cifNumber, LogMasterDTO logMaster, Boolean transStatus, Exception ex,
			String remark, RequestDTO requestDto) {
		try {
			if (!Utility.isEmpty(logMaster)) {
				logMaster.setCifNumber(cifNumber);
				logMaster.setTransId(System.currentTimeMillis() * 8211);
				logMaster.setTransDate(Utility.getCurrentTimestamp());
				if (logMaster.getUserType() == null) {
					logMaster.setUserType(Integer.valueOf(UserStatus.RPA_EMPLOYEE_ID));
				}
				// set other values
				logMaster.setRemark(remark);
				logMaster.setManagedServer("DemoServer");
				logMaster.setCookie("JSESSIONID=" + requestDto.getSessionID());
				logMaster.setLocalAddress(requestDto.getRemoteIPAddress());
				logMaster.setLocalServer(requestDto.getRemoteIPAddress());
				logMaster.setUserAgent("postman");
				logMaster.setBrowserType("postman");
				logMaster.setChannelId(requestDto.getChannel());
				logMaster.setChannelKey(requestDto.getChannelKey());
				logMaster.setChannelModule("" + requestDto.getChannel());
				logMaster.setSessionId(requestDto.getSessionID());
				logMaster.setInterfaceLang("en");
				logMaster.setOsName("dev");
				logMaster.setOsVersion("10.0");
				logMaster.setAppVersion("1.0.0");
				logMaster.setDeviceModel("dummy");
				logMaster.setIsDeviceRooted(0);
				if (ex != null) {
					LOG.error(ex.getMessage());
					logMaster.setLogStatusId(LogTransactionStatus.GENBRAL_EXCEPTION);
					StringWriter trace = new StringWriter();
					PrintWriter printWriter = new PrintWriter(trace);
					ex.printStackTrace(printWriter);
					if (trace != null && trace.toString().length() > 301)
						logMaster.setRemark(trace.toString().substring(0, 300));
					else if (trace != null)
						logMaster.setRemark(trace.toString().substring(0, trace.toString().length() - 1));
					trace.close();
					printWriter.close();
				} else {
					if (transStatus)
						logMaster.setLogStatusId(LogTransactionStatus.SUCCESS);
					else
						logMaster.setLogStatusId(LogTransactionStatus.FAILURE);
				}
			}
		} catch (Exception e) {
			LOG.error("Error while creating LOG Master DTO....:"+e.getMessage());
			Utility.logMe(ex);
			return logMaster;
		}
		return logMaster;
	}
}
