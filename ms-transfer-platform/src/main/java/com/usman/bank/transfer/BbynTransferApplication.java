/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer;

import java.util.Properties;
import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;

import com.usman.bank.constants.Constants;
import com.usman.bank.utils.SystemInfo;

/**
 * Description: This class BbynTransferApplication.java
 *
 * @author vXebiau - Farkalit Usman
 * @date Jun 27, 2019
 * @version 1.0
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class BbynTransferApplication {

	@Autowired
	private Environment environment;

	@PostConstruct
	void started() {
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kuwait"));
	}

	public static void main(String[] args) {
		SpringApplication.run(BbynTransferApplication.class, args);
	}

	@PostConstruct
	private void init() {

		// set the default properties
		Properties props = System.getProperties();
		props.setProperty(Constants.BBYN_HOSTNAME, SystemInfo.getHostname());
		props.setProperty(Constants.BBYN_ENV, SystemInfo.getEnvironment());
		props.setProperty(Constants.BBYN_IP_ADDR, SystemInfo.getIPAddress());

		String[] defaultProfiles = environment.getDefaultProfiles();
		System.out.println("defaultProfiles :" + defaultProfiles[0]);

	}
}
