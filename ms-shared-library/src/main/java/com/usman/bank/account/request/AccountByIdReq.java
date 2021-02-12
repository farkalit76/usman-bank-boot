/**
 * @Copyright reserved to bank
 */
package com.usman.bank.account.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Description: This class AccountByIdReq.java
 *
 * @author  vXebiau
 * @date    Oct 27, 2019
 * @version 1.0
 *
 */
public class AccountByIdReq {

	@NotNull(message = "Account Id cannot be null or empty.")
	@Size(min=3, message="Account Id must not be less than 3 characters")
	private String accountId;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	@Override
	public String toString() {
		return "AccountByIdReq [accountId=" + accountId + "]";
	}
}
