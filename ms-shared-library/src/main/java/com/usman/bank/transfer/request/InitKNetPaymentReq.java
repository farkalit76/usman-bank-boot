/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.request;

import java.io.Serializable;

/**
 * Description: This class InitKNetPaymentReq.java
 *
 * @author  vXebiau
 * @date    Nov 19, 2019
 * @version 1.0
 *
 */
public class InitKNetPaymentReq implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected String environment;
	
	protected String language;
	
	protected String transaction;

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}

	@Override
	public String toString() {
		return "InitKNetPaymentReq [environment=" + environment + ", language=" + language + ", transaction="
				+ transaction + "]";
	}
	
}
