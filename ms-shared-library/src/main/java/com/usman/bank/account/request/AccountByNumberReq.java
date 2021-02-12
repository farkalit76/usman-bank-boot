/**
 * @Copyright reserved to bank
 */
package com.usman.bank.account.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Description: This class AccountByNumberReq.java
 *
 * @author  vXebiau
 * @date    Oct 28, 2019
 * @version 1.0
 *
 */
public class AccountByNumberReq {

	@NotNull(message = "Account Number cannot be null or empty.")
	@Size(min=3, message="Account Number must not be less than 3 characters")
	private String accountNumber;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "AccountByNumberReq [accountNumber=" + accountNumber + "]";
	}

}
