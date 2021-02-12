/**
 * @Copyright reserved to bank
 */
package com.usman.bank.account.response;

import java.io.Serializable;
import java.util.List;

import com.usman.bank.models.AccountDTO;

/**
 * Description: This class AccountListRes.java
 *
 * @author vXebiau
 * @date Jul 9, 2019
 * @version 1.0
 *
 */
public class AccountListRes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<AccountDTO> accountList;

	public List<AccountDTO> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<AccountDTO> accountList) {
		this.accountList = accountList;
	}

	@Override
	public String toString() {
		return "AccountListRes [accountList=" + accountList + "]";
	}

}
