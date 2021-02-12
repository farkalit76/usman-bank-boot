/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.exception;

/**
 * Description: This class TransferException.java
 *
 * @author  vXebiau
 * @date    Oct 28, 2019
 * @version 1.0
 *
 */
public class TransferException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TransferException() {
		super();
	}

	public TransferException(String message) {
		super( "Accounts Exception message:" +message);
	}
	
	public String getMessage() {
		return "Accounts Exception:" + super.getMessage();
	}
}
