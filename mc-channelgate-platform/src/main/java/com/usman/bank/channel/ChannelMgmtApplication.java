/**
 * @Copyright reserved to bank
 */
package com.usman.bank.channel;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Description: This class ChannelMgmtApplication.java
 *
 * @author vXebiau - Farkalit Usman
 * @date Jun 27, 2019
 * @version 1.0
 *
 */
@SpringBootApplication
@EnableEurekaServer
@EnableZuulProxy
public class ChannelMgmtApplication {

	private static final Logger LOG = LogManager.getLogger(ChannelMgmtApplication.class);

	@PostConstruct
	void started() {
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kuwait"));
	}

	public static void main(String[] args) {
		LOG.info("GatewayApplication started...");
		SpringApplication.run(ChannelMgmtApplication.class, args);
	}

//	@Bean
//	public ZuulAuthFilter zuulAuthFilter() {
//		return new ZuulAuthFilter();
//	}
}
