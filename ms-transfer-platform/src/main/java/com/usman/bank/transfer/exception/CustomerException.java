/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.exception;

/**
 * Description: This class CustomerException.java
 *
 * @author  vXebiau
 * @date    Dec 9, 2019
 * @version 1.0
 *
 */
public class CustomerException extends Exception{

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
