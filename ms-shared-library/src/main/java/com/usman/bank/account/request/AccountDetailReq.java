package com.usman.bank.account.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AccountDetailReq {

	@NotNull(message = "Cif number cannot be null or empty.")
	@Size(min=3, message="Cif number must not be less than 3 characters")
	private String cifNumber;

	private String accountNumber;
	
	public String getCifNumber() {
		return cifNumber;
	}

	public void setCifNumber(String cifNumber) {
		this.cifNumber = cifNumber;
	}

	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "AccountReq [cifNumber=" + cifNumber + ", accountNumber=" + accountNumber + "]";
	}

}
