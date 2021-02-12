/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description: This class UtilityServicesApplication.java
 *
 * @author  vXebiau - Farkalit Usman
 * @date    Sep 15, 2019
 * @version 1.0
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class UtilityServicesApplication {

	@PostConstruct
	void started() {
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kuwait"));
	}
	
	public static void main(String[] args) {
		SpringApplication.run(UtilityServicesApplication.class, args);
	}

}
