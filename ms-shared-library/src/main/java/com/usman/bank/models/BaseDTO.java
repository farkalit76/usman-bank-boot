package com.usman.bank.models;

import java.io.Serializable;

public class BaseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String lang;
	private String hostname;
	private int port;

	private String companyCode;
	private String requestToken;

	private SecurityDTO security;

	private DeviceDTO oldDeviceDTO; // this object was added only to handle the global config requests from old App
									// version. because it send the device object as "deviceDTO".

	public SecurityDTO getSecurity() {
		return security;
	}

	public void setSecurity(SecurityDTO security) {
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

	public DeviceDTO getOldDeviceDTO() {
		return oldDeviceDTO;
	}

	public void setOldDeviceDTO(DeviceDTO oldDeviceDTO) {
		this.oldDeviceDTO = oldDeviceDTO;
	}

}
