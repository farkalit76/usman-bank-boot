/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.exception;

/**
 * Description: This class UtilityServicesException.java
 *
 * @author vXebiau
 * @date Sep 15, 2019
 * @version 1.0
 *
 */
public class UtilityServicesException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UtilityServicesException(String message) {
		super(message);
	}

	public UtilityServicesException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public String getMessage() {
		return "Utility Services Error: "+super.getMessage();
	}
}
