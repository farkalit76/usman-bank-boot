/**
 * @Copyright reserved to bank
 */
package com.usman.bank.account.exception;

/**
 * Description: This class AccountException.java
 *
 * @author vXebiau
 * @date Oct 27, 2019
 * @version 1.0
 *
 */
public class AccountsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccountsException() {
		super();
	}

	public AccountsException(String message) {
		super( "Accounts Exception message:" +message);
	}
	
	public String getMessage() {
		return "Accounts Exception:" + super.getMessage();
	}
	
}
