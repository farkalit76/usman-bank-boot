/**
 * @Copyright reserved to bank
 */
package com.usman.bank.customer.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Description: This class CustomerReq.java
 *
 * @author  vXebiau - Farkalit Usman
 * @date    Jun 27, 2019
 * @version 1.0
 *
 */
public class CustomerReq {

	@NotNull(message = "Cif number cannot be null or empty.")
	@Size(min=3, message="Cif number must not be less than 3 characters")
	private String cifNumber;

	public String getCifNumber() {
		return cifNumber;
	}

	public void setCifNumber(String cifNumber) {
		this.cifNumber = cifNumber;
	}

	@Override
	public String toString() {
		return "CustomerReq [cifNumber=" + cifNumber + "]";
	}
}
