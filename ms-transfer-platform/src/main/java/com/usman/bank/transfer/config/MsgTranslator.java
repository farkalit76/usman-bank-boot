/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.config;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

/**
 * Description: This class MsgTranslator.java
 *
 * @author vXebiau
 * @date Nov 24, 2019
 * @version 1.0
 *
 */
@Component
public class MsgTranslator {

	private static ResourceBundleMessageSource messageSource;

	@Autowired
	MsgTranslator(ResourceBundleMessageSource messageSource) {
		MsgTranslator.messageSource = messageSource;
	}

	public static String toLocale(String msgCode) {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage(msgCode, null, locale);
	}
	
	public static String toLocaleAr(String msgCode) {
		Locale locale = new Locale("ar"); 
		return messageSource.getMessage(msgCode, null, locale);
	}
}
