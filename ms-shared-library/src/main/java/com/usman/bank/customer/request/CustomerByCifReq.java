/**
 * @Copyright reserved to bank
 */
package com.usman.bank.customer.request;

/**
 * Description: This class CustomerByCifReq.java
 *
 * @author  vXebiau - Farkalit Usman
 * @date    Jun 27, 2019
 * @version 1.0
 *
 */
public class CustomerByCifReq {

	private String cifNumber;

	public String getCifNumber() {
		return cifNumber;
	}

	public void setCifNumber(String cifNumber) {
		this.cifNumber = cifNumber;
	}

	@Override
	public String toString() {
		return "CustomerCifRQ [cifNumber=" + cifNumber + "]";
	}

}
