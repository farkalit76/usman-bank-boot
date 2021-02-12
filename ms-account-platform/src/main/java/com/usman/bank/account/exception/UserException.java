/**
 * @Copyright reserved to bank
 */
package com.usman.bank.account.exception;

/**
 * Description: This class UserException.java
 *
 * @author  vXebiau
 * @date    Oct 28, 2019
 * @version 1.0
 *
 */
public class UserException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserException() {
		super();
	}

	public UserException(String message) {
		super( "User Exception message:" +message);
	}
	
	public String getMessage() {
		return "User Exception:" + super.getMessage();
	}
}
