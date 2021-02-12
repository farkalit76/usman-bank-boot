/**
 * @Copyright reserved to  bank
 */
package com.usman.bank.constants;

/**
 * Description: This class Customers.java
 *
 * @author vXebiau
 * @date Sep 15, 2019
 * @version 1.0
 *
 */
public class CustomerConstants {

	private CustomerConstants() {
	}

	public static final String RESOURCE_NAME = "/customer-mgmt";
	
	public static final String CUSTOMERS_PROFILES = "/customers/profiles";
	
	public static final String CUSTOMERS_BYCIFID = "/customers/bycifid";
	
	public static final String CUSTOMERS_DEACTIVATION = "/customers/deactivation";
	
	public static final String MAPPING_AUDITS = "/audits";
	
	public static final String MAPPING_KAFKA_AUDITS = "/kafka/audits";
	
	public static final String DEACTIVATION_SUCCESS = "Success deactivation/reset login";
	
	public static final String DEACTIVATION_FAILED = "Failed deactivation/reset login";
	
	public static final String CUSTOMERS_ALL = "/customers";
	
	public static final String CUSTOMERS_SUCCESS = "Success reset login";
}
