/**
 * @Copyright reserved to bank
 */
package com.usman.bank.dashboard.config;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

/**
 * Description: This class WebMvcConfig.java
 *
 * @author  vXebiau
 * @date    Dec 17, 2019
 * @version 1.0
 *
 */
@Component
public class WebMvcConfig extends AcceptHeaderLocaleResolver implements WebMvcConfigurer {

	private static final Logger LOG = LogManager.getLogger(WebMvcConfig.class);

	private static final long MAX_AGE_SECS = 3600;

	List<Locale> LOCALES = Arrays.asList(new Locale("en"), new Locale("ar"));

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		LOG.debug("WebMvcConfig...addCorsMappings....");
		registry.addMapping("/**").allowedOrigins("*")
				.allowedMethods("HEAD", "OPTIONS", "GET", "POST", "PUT", "PATCH", "DELETE").maxAge(MAX_AGE_SECS);
	}

	@Override
	public Locale resolveLocale(HttpServletRequest request) {
		String headerLang = request.getHeader("Accept-Language");
		return headerLang == null || headerLang.isEmpty() ? Locale.getDefault()
				: Locale.lookup(Locale.LanguageRange.parse(headerLang), LOCALES);
	}

	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource rs = new ResourceBundleMessageSource();
		rs.setBasename("messages");
		rs.setDefaultEncoding("UTF-8");
		rs.setUseCodeAsDefaultMessage(true);
		return rs;
	}
}
