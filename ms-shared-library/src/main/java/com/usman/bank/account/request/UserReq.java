/**
 * @Copyright reserved to bank
 */
package com.usman.bank.account.request;

import java.io.Serializable;

/**
 * Description: This class UserReq.java
 *
 * @author  vXebiau
 * @date    Oct 27, 2019
 * @version 1.0
 *
 */
public class UserReq implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected String userId;
	
	protected String booqId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBooqId() {
		return booqId;
	}

	public void setBooqId(String booqId) {
		this.booqId = booqId;
	}
	
	
}
