/**
 * @Copyright reserved to bank
 */
package com.usman.bank.customer.exception;

/**
 * Description: This class CustomerException.java
 *
 * @author vXebiau
 * @date Sep 10, 2019
 * @version 1.0
 *
 */
public class CustomerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomerException() {
		super();
	}

	public CustomerException(String message) {
		super("Customer Exception message:" + message);
	}

	public String getMessage() {
		return "Customer Exception:" + super.getMessage();
	}
}
