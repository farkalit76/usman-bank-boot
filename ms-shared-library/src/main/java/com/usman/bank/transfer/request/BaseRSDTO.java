package com.usman.bank.transfer.request;

import java.io.Serializable;

public class BaseRSDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String lang;
	private String hostname;
	private int port;
	
	private String companyCode;	
	private String requestToken;
	
	private SecurityRSDTO security ;
	
	public SecurityRSDTO getSecurity() {
		return security;
	}
	public void setSecurity(SecurityRSDTO security) {
		this.security = security;
	}
	
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getRequestToken() {
		return requestToken;
	}
	public void setRequestToken(String requestToken) {
		this.requestToken = requestToken;
	}
}
