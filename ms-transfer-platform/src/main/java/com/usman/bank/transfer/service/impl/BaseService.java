/**
 * @Copyright reserved to usman bank
 */
package com.usman.bank.transfer.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.usman.bank.constants.CustomerConstants;
import com.usman.bank.constants.UtilityConstants;
import com.usman.bank.models.LogMasterDTO;
import com.usman.bank.models.MailDTO;
import com.usman.bank.response.CommonDTO;
import com.usman.bank.utility.request.EmailReq;

/**
 * Description: This class BaseService.java
 *
 * @author vXebiau
 * @date Sep 11, 2019
 * @version 1.0
 *
 */
@Service
public class BaseService {

	private static final Logger LOG = LogManager.getLogger(BaseService.class);

	@Value("${services.utility.url}")
	private String utilityServiceURL;

	@Autowired
	RestTemplate restTemplate;

	/**
	 * Call the utility services for Log Master
	 * 
	 * @param logMaster
	 */
	public boolean saveLogMaster(LogMasterDTO logMaster) {
		try {
			ResponseEntity<String> response = restTemplate
					.postForEntity(utilityServiceURL + CustomerConstants.MAPPING_KAFKA_AUDITS, logMaster, String.class);
			LOG.info("BaseService.saveLogMaster.getStatusCodeValue:" + response.getStatusCodeValue());
			if (response.getStatusCode().equals(HttpStatus.OK)) {
				LOG.info("Audit Log message saved successfully.");
			}
		} catch (Exception ex) {
			LOG.error("BaseServie.Error while saving log master:"+ex.getMessage());
			LOG.error(ex);
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @param emailReq
	 * @return
	 */
	public CommonDTO sendEmail(MailDTO mailDTO) {
		ResponseEntity<CommonDTO> response = null;
		try {
			String[] emailIds = { "vXebiau@bbynuat.com" };
			EmailReq emailReq = new EmailReq();
			emailReq.setSubject(mailDTO.getSubject());
			emailReq.setBody(mailDTO.getBody());
			emailReq.setToEmailIds(emailIds);
			response = restTemplate.postForEntity(utilityServiceURL + UtilityConstants.MAPPING_EMAIL, emailReq,
					CommonDTO.class);
			LOG.info("BaseService.sendEmail.getStatusCodeValue:" + response.getStatusCodeValue());
		} catch (Exception ex) {
			LOG.error("BaseServie.Error while sending email:"+ex.getMessage());
			LOG.error(ex);
			return null;
		}
		return response.getBody();
	}

	@LoadBalanced
	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}
}
