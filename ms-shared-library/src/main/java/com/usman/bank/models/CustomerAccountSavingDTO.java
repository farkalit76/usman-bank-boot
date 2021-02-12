/**
 * @Copyright reserved to bank
 */
package com.usman.bank.models;

import java.io.Serializable;
import java.sql.Date;

/**
 * Description: This class AccountDTO.java
 *
 * @author vXebiau - Farkalit Usman
 * @date Jun 27, 2019
 * @version 1.0
 *
 */
public class CustomerAccountSavingDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long savingId;

	private String toPermAccountId;

	private Date createdDate;

	private String fromAccountId;

	public CustomerAccountSavingDTO() {}
	
	public CustomerAccountSavingDTO(long savingId, String toPermAccontId, Date createdDate, String fromAccountId) {
		this.savingId=savingId;
		this.toPermAccountId=toPermAccontId;
		this.createdDate=createdDate;
		this.fromAccountId=fromAccountId;
	}
	
	public Long getSavingId() {
		return savingId;
	}

	public void setSavingId(Long savingId) {
		this.savingId = savingId;
	}

	public String getToPermAccountId() {
		return toPermAccountId;
	}

	public void setToPermAccountId(String toPermAccountId) {
		this.toPermAccountId = toPermAccountId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getFromAccountId() {
		return fromAccountId;
	}

	public void setFromAccountId(String fromAccountId) {
		this.fromAccountId = fromAccountId;
	}

}
