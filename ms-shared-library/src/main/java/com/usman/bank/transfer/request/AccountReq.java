/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.usman.bank.account.request.UserReq;

/**
 * Description: This class AccountRQ.java
 *
 * @author vXebiau - Farkalit Usman
 * @date Jun 27, 2019
 * @version 1.0
 *
 */
public class AccountReq implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message = "Account number cannot be null or empty.")
	@Size(min = 3, message = "Account number must not be less than 3 characters")
	private String accountNumber;

	@NotNull(message = "Account Id cannot be null or empty.")
	@Size(min = 3, message = "Account Id must not be less than 3 characters")
	private String accountId;

	private UserReq owner;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public UserReq getOwner() {
		return owner;
	}

	public void setOwner(UserReq owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "AccountReq [accountNumber=" + accountNumber + ", accountId=" + accountId + ", owner=" + owner + "]";
	}

}
