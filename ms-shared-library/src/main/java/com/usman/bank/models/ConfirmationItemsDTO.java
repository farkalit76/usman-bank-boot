package com.usman.bank.models;

public class ConfirmationItemsDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String key;
	private String value;
	private String label;
	
	// empty constructor
	public ConfirmationItemsDTO(){}
	
	// constructor with parameters
	public ConfirmationItemsDTO(String key, String value){
		setKey(key);		// please note, key is already populated lable in its setter() method
		setValue(value);
	}
	
	// setters and getters
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
		setLabel(key);
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;		
	}

}//class