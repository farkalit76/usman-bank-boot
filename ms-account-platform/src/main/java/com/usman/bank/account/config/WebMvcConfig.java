/**
 * @Copyright reserved to bank
 */
package com.usman.bank.account.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Description: This class WebMvcConfig.java
 *
 * @author vXebiau
 * @date Jun 30, 2019
 * @version 1.0
 *
 */
@Component
public class WebMvcConfig implements WebMvcConfigurer {

	private static final Logger LOG = LogManager.getLogger(WebMvcConfig.class);
	
	private final long MAX_AGE_SECS = 3600;

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		LOG.debug("WebMvcConfig...addCorsMappings....");
		registry.addMapping("/**").allowedOrigins("*")
				.allowedMethods("HEAD", "OPTIONS", "GET", "POST", "PUT", "PATCH", "DELETE").maxAge(MAX_AGE_SECS);
	}
}
