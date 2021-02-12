/**
 * 
 */
package com.usman.bank.transfer.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

/**
 * @author vXebiau
 *
 */
public class TransferInitReq implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	protected String custId;

	protected String cifNumber;

	protected String userName;

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCifNumber() {
		return cifNumber;
	}

	public void setCifNumber(String cifNumber) {
		this.cifNumber = cifNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "TransferInitReq [custId=" + custId + ", cifNumber=" + cifNumber + ", userName=" + userName + "]";
	}

}
