/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.request;

import java.io.Serializable;

/**
 * Description: This class SmsReq.java
 *
 * @author  vXebiau
 * @date    Sep 15, 2019
 * @version 1.0
 *
 */
public class SmsReq implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String phoneNumber;
	
	protected String message;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "SmsReq [phoneNumber=" + phoneNumber + ", message=" + message + "]";
	}
	
	
}
