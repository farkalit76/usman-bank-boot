/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.exception;

/**
 * Description: This class CommonException.java
 *
 * @author  vXebiau
 * @date    Dec 9, 2019
 * @version 1.0
 *
 */
public class CommonException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CommonException() {
		super();
	}

	public CommonException(String message) {
		super("CommonException message:" + message);
	}

	public String getMessage() {
		return "CommonException message:" + super.getMessage();
	}
}
