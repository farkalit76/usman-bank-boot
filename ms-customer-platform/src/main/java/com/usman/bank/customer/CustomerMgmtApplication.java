/**
 * @Copyright reserved to bank
 */
package com.usman.bank.customer;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description: This class CustomerMgmtApplication.java
 *
 * @author vXebiau - Farkalit Usman
 * @date Jun 27, 2019
 * @version 1.0
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class CustomerMgmtApplication {

	@PostConstruct
	void started() {
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kuwait"));
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerMgmtApplication.class, args);
	}

}
