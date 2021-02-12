/**
 * @Copyright reserved to bank
 */
package com.usman.bank.customer.config;

import springfox.documentation.service.VendorExtension;

/**
 * Description: This class VendorName.java
 *
 * @author  vXebiau
 * @date    Jul 2, 2019
 * @version 1.0
 *
 */
public class VendorName implements VendorExtension<Object>{

	private String name;
	
	public VendorName(String name) {
		this.name=name;
	}
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Object getValue() {
		return "Contractors";
	}

}
