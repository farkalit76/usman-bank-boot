/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.service.impl;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.usman.bank.constants.UtilityConstants;
import com.usman.bank.models.LogMasterDTO;
import com.usman.bank.utility.repository.AuditLogRepository;

/**
 * Description: This class KfkConsumer.java
 *
 * @author vXebiau
 * @date Sep 16, 2019
 * @version 1.0
 *
 */
@Service
public class KfkConsumer {

	private static final Logger LOG = LogManager.getLogger(KfkConsumer.class);

	@Autowired
	private AuditLogRepository auditLogRepository;

	/**
	 * It will receive the message which is produced/send by publish method.
	 * 
	 * @param message
	 * @throws IOException
	 */
	@KafkaListener(topics = UtilityConstants.TOPIC_NAME, groupId = UtilityConstants.GROUP_NAME)
	public void consume(String message) throws IOException {
		LOG.info(String.format("#### -> Consumed/Receive message -> %s", message));
		try {
			ObjectMapper mapper = new ObjectMapper();
			LogMasterDTO logMaster = mapper.readValue(message, LogMasterDTO.class);
			LOG.info("logMaster as java object:{}", logMaster.toString());
			// Save this message into database
			Integer saveStatus = auditLogRepository.saveLog(logMaster);
			LOG.info("Log Master saved. Status:" + saveStatus);
		} catch (Exception ex) {
			LOG.error(ex.getMessage());
		}

	}
}
