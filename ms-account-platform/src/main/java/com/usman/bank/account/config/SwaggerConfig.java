/**
 * @Copyright reserved to bank
 */
package com.usman.bank.account.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Description: This class SwaggerConfig.java
 *
 * @author vXebiau - Farkalit Usman
 * @date Jun 27, 2019
 * @version 1.0
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.usman.bank.account.web.resource"))
				.paths(PathSelectors.any()).build().apiInfo(getApiInformation());
	}

	private ApiInfo getApiInformation() {
		VendorName vendors = new VendorName("Xebia India");
		@SuppressWarnings("rawtypes")
		List<VendorExtension> vendorExtensions = new ArrayList<>();
		vendorExtensions.add(vendors);
		Contact contact = new Contact("Developer", "https://usman.bank.com", "vxebiau@bbynuat.com");
		return new ApiInfo("usman Account Management API Documentation", "usman bank API Documentation", "1.0",
				"https://github.com/spring-boot/bbyn-core", contact, "usman API 2.0",
				"https://usman.bank.com/svc/api", vendorExtensions);
	}
}
