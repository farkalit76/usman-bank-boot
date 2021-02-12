/**
 * @Copyright reserved to bank
 */
package com.usman.bank.account.response;

import java.util.List;

import com.usman.bank.models.CustomerAccountSavingDTO;

/**
 * Description: This class AccountRS.java
 *
 * @author vXebiau
 * @date Jun 27, 2019
 * @version 1.0
 *
 */
public class AccountRes {

	private List<CustomerAccountSavingDTO> accountList;

	public List<CustomerAccountSavingDTO> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<CustomerAccountSavingDTO> accountList) {
		this.accountList = accountList;
	}

	@Override
	public String toString() {
		return "AccountRS [accountList=" + accountList + "]";
	}

}
