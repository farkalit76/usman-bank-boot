package com.usman.bank.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootBbynApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootBbynApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBbynApplication.class, args);
	}
	
	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}
}
