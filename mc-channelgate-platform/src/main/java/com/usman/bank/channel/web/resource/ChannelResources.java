/**
 * @Copyright reserved to bank
 */
package com.usman.bank.channel.web.resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: This class ChannelResources.java
 *
 * @author vXebiau
 * @date Jul 1, 2019
 * @version 1.0
 *
 */
@RestController
@RequestMapping("/channel")
public class ChannelResources {

	private static final Logger LOG = LogManager.getLogger(ChannelResources.class);

	@GetMapping(value = "/test", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String testService() {
		LOG.info("testService...:");
		return "SUCCESS";
	}
}
