package com.usman.bank.models;

import java.io.Serializable;

public class PresentationDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String custHeaderLogo;
	private boolean showRelOfficer;
	private String message ;
	private String customerNote ;
	

	public void setCustHeaderLogo(String custHeaderLogo) {
		this.custHeaderLogo = custHeaderLogo;
	}

	public String getCustHeaderLogo() {
		return custHeaderLogo;
	}


	
	public void setShowRelOfficer(boolean showRelOfficer) {
		this.showRelOfficer = showRelOfficer;
	}

	public boolean isShowRelOfficer() {
		return showRelOfficer;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCustomerNote() {
		return customerNote;
	}

	public void setCustomerNote(String customerNote) {
		this.customerNote = customerNote;
	}
	
	
	
	

}
