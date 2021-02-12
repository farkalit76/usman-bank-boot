/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.usman.bank.constants.UtilityConstants;

/**
 * Description: This class KfkProducer.java
 *
 * @author vXebiau
 * @date Sep 16, 2019
 * @version 1.0
 *
 */
@Service
public class KfkProducer {

	private static final Logger LOG = LogManager.getLogger(KfkProducer.class);

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String message) {
		LOG.info(String.format("#### -> Producing message -> %s", message));
		this.kafkaTemplate.send(UtilityConstants.TOPIC_NAME, message);
		LOG.info("#### -> Message send to kafka-->");
	}
}
