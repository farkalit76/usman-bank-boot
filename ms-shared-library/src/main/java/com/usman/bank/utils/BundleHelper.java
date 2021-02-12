/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utils;

import java.util.Hashtable;
import java.util.Locale;
import java.util.ResourceBundle;

import com.usman.bank.constants.Constants.BUNDLES;
import com.usman.bank.constants.Constants.IMAL_CUST_PREFERED_LANG;
import com.usman.bank.constants.Constants.IMAL_SMS_LANG;

/**
 * Description: This class BundleHelper.java
 *
 * @author vXebiau
 * @date Jul 9, 2019
 * @version 1.0
 *
 */
public class BundleHelper extends Helper {

	private static Hashtable<String, BundleHelper> instances = new Hashtable<String, BundleHelper>();

	/**
	 * @param language
	 */
	protected BundleHelper(String language) {
		super(language);
	}

	public static BundleHelper getInstance(String language) {
		BundleHelper instance = instances.get(language);
		if (instance != null) {
			return instance;
		}
		instance = new BundleHelper(language);
		instances.put(language, instance);
		return instance;
	}

	public String getBundleMsg(String key) {
		// user does not registered.
		String bundleMsg = getBundleMessage(BUNDLES.VALIDATIONS, key, language);
		if (bundleMsg == null)
			bundleMsg = getBundleMessage(BUNDLES.UI, key, language);
		return bundleMsg;
	}// getBundleMsg

	/**
	 * Gets the localized resource bundle using the passed bundle name.
	 * 
	 * @param bundleName the String name of the bundle
	 * @return the ResourceBundle containing the localized messages for the
	 */
	static public ResourceBundle getBundle(String bundleName, Locale locale) {
		return ResourceBundle.getBundle(bundleName, locale);
	}// getBundle

	/**
	 * Gets the localized message using the passed bundle name and message.
	 * 
	 * @param bundleName the String name of the bundle
	 * @param messageKey the String key to be found in the bundle properties
	 * @return the String containing the localized message
	 */
	static public String getBundleMessage(String bundleName, String messageKey, String lang) {
		if (messageKey != null && messageKey.indexOf("$$") == 0)
			return messageKey.replace("$$", "");
		String message = "";
		Locale local = null;
		if (lang == null || lang.equals(BUNDLES.ENGLISH_LANGUAGE) || lang.equals(IMAL_SMS_LANG.ENGLISH)
				|| lang.equals(IMAL_CUST_PREFERED_LANG.ENGLISH)) {
			local = new Locale(BUNDLES.DEFAULT_LANGUAGE);
		} else {
			local = new Locale(BUNDLES.ARABIC_LANGUAGE);
		}

		ResourceBundle bundle = getBundle(bundleName, local);
		try {
			if (bundle != null) {
				if (bundle.getString(messageKey) != null)
					message = bundle.getString(messageKey);
				else
					return null;
			}
		} catch (Exception e) {
			return null;
		}
		return message;
	}// getBundleMessage
}
