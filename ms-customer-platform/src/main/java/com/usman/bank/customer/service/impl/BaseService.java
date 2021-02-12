/**
 * @Copyright reserved to bank
 */
package com.usman.bank.customer.service.impl;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.usman.bank.constants.CustomerConstants;
import com.usman.bank.constants.Constants.LogTransFields;
import com.usman.bank.constants.Constants.LogTransactionStatus;
import com.usman.bank.constants.Constants.UserStatus;
import com.usman.bank.models.CustomersDTO;
import com.usman.bank.models.LogMasterDTO;
import com.usman.bank.utils.Utility;

/**
 * Description: This class BaseService.java
 *
 * @author vXebiau
 * @date Sep 11, 2019
 * @version 1.0
 *
 */
public class BaseService {

	private static final Logger LOG = LogManager.getLogger(BaseService.class);

	@Value("${services.utilities.url}")
	private String serviceURL;

	@Autowired
	RestTemplate restTemplate;

	/**
	 * Call the utility services for Log Master
	 * 
	 * @param logMaster
	 */
	public void audit(LogMasterDTO logMaster) {
		try {
			ResponseEntity<String> response = restTemplate
					.postForEntity(serviceURL + CustomerConstants.MAPPING_KAFKA_AUDITS, logMaster, String.class);
			if (!Utility.isEmpty(response)) {
				LOG.info(response.getBody());
				if (response.getStatusCode().equals(HttpStatus.OK)) {
					LOG.info("Audit Log message saved successfully****.");
				}else {
					LOG.info("Audit Log message NOT saved....");
				}
			}
		} catch (Exception ex) {
			LOG.error("Audit Log message error."+ex.getMessage());
			LOG.error(ex);
		}
	}

	/**
	 * 
	 * @param cifNumber
	 * @param logMaster
	 * @param transStatus
	 * @param ex
	 * @return
	 */
	public LogMasterDTO getLogMaster(String cifNumber, LogMasterDTO logMaster, Boolean transStatus, Exception ex) {
		try {
			if (!Utility.isEmpty(logMaster)) {
				logMaster.setTransId(System.currentTimeMillis() * 8211);
				if (cifNumber != null) {
					logMaster.setCifNumber(cifNumber);
					logMaster.setTransDate(Utility.getCurrentTimestamp());
				}
				if (ex != null) {
					logMaster.setLogStatusId(LogTransactionStatus.GENBRAL_EXCEPTION);
				} else {
					if (transStatus)
						logMaster.setLogStatusId(LogTransactionStatus.SUCCESS);
					else
						logMaster.setLogStatusId(LogTransactionStatus.FAILURE);
				}
				if (logMaster.getUserType() == null) {
					logMaster.setUserType(Integer.valueOf(UserStatus.RPA_EMPLOYEE_ID));
				}
				if (ex != null) {
					StringWriter trace = new StringWriter();
					PrintWriter printWriter = new PrintWriter(trace);
					ex.printStackTrace(printWriter);
					if (trace != null && trace.toString().length() > 301)
						logMaster.setRemark(trace.toString().substring(0, 300));
					else if (trace != null)
						logMaster.setRemark(trace.toString().substring(0, trace.toString().length() - 1));
					trace.close();
					printWriter.close();
				}
				// set other values
				logMaster.setRemark("user deactivated");
				logMaster.setManagedServer("LocalServer");
				logMaster.setCookie("JSESSIONID=Kp06G1hQL!800155044");
				logMaster.setLocalAddress("127.0.0.1");
				logMaster.setLocalServer("10.7.91.40");
				logMaster.setUserAgent("postman");
				logMaster.setBrowserType("postman");
				if (ex != null) {
					if (ex instanceof IndexOutOfBoundsException) {
						LOG.error(ex.getMessage());
					} else {
						Utility.logMe(ex);
					}
				}
			}
		} catch (Exception e) {
			Utility.logMe(ex);
			return logMaster;
		}
		return logMaster;
	}

	/**
	 * 
	 * @param customerDTO
	 * @param serviceName
	 * @return
	 */
	public Map<Integer, Object> getCustLogFieldsValues(CustomersDTO customerDTO, Integer serviceName) {
		Map<Integer, Object> logFieldsValues = new HashMap<>();
		try {
			logFieldsValues.put(LogTransFields.CUSTOMER_NAME_EN, customerDTO.getCustNameEn());
			logFieldsValues.put(LogTransFields.CUSTOMER_REQ_OPERATION, "Lock User");
			logFieldsValues.put(LogTransFields.CUSTOMER_CIF_NO, customerDTO.getCif());
			logFieldsValues.put(LogTransFields.SERVICE_NAME, serviceName);
			return logFieldsValues;
		} catch (Exception ex) {
			LOG.error(ex);
			return logFieldsValues;
		}
	}

	@LoadBalanced
	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}
}
