/**
 * @Copyright reserved to bank
 */
package com.usman.bank.response;

import java.io.Serializable;

/**
 * Description: This class StatusDTO.java
 *
 * @author  vXebiau
 * @date    Sep 10, 2019
 * @version 1.0
 *
 */
public class StatusDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected boolean success;
	
	protected String statusDesc;
	
	protected String statusCode;
	

	public StatusDTO() {}
	
	public StatusDTO(boolean success, String statusDesc) {
		this.success=success;
		this.statusDesc= statusDesc;
	}
	public StatusDTO(boolean success, String statusDesc, String statusCode) {
		this.success=success;
		this.statusDesc= statusDesc;
		this.statusCode=statusCode;
	}
	
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	
	public String getStatusDesc() {
		return statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	@Override
	public String toString() {
		return "StatusDTO [success=" + success + ", statusDesc=" + statusDesc + ", statusCode=" + statusCode + "]";
	}

}
