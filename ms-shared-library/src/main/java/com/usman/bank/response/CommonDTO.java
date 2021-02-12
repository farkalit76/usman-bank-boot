/**
 * @Copyright reserved to bank
 */
package com.usman.bank.response;

/**
 * Description: This class CommonRes.java
 *
 * @author  vXebiau
 * @date    Sep 10, 2019
 * @version 1.0
 *
 */
public class CommonDTO {

	protected Object message;

	public CommonDTO() {}
	
	public CommonDTO(Object msg) {
		this.message = msg;
	}
	
	public Object getMessage() {
		return message;
	}

	public void setMessage(Object message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "CommonRes [message=" + message + "]";
	}
	
}
