/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utils;

import java.util.Hashtable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Description: This class Helper.java
 *
 * @author vXebiau
 * @date Jul 9, 2019
 * @version 1.0
 *
 */
public class Helper {

	private static final Logger LOG = LogManager.getLogger(Helper.class);

	private static Hashtable<String, Helper> instances = new Hashtable<String, Helper>();

	protected String language;

	protected Helper(String language) {
		this.language = language;
	}

	public static Helper getInstance(String language) throws Exception {
		LOG.debug("HelpergetInstance");
		Helper instance = instances.get(language);
		if (instance != null) {
			return instance;
		}
		instance = new Helper(language);
		instances.put(language, instance);
		return instance;
	}

}
