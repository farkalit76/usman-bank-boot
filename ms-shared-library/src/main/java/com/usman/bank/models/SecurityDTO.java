package com.usman.bank.models;

import java.io.Serializable;

public class SecurityDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String requestToken;
	private String requestTime;

	private String appVersion;
	private String loginToken; /* fingerprint token for login & NFC */
	private String biometricToken; /* fingerprint token for transaction */
	private String ewatchToken; /* watch token for login from EWatch */

	// @XmlAttribute(name = "password")
	private String password;
	private String otp;
	private String otpMessage;
	private String token;
	private String securityKey1; /* used for elBooq authentication */
	private String securityKey2; /* used for elBooq authentication */

	private String passcode;

	private String bbynAppVersion;
	private String osName;
	private String osVersion;
	private String deviceBrand;
	private String deviceModel;
	private String osType;
	private String requestLanguage;
	private String geocodeLatitude;
	private String geocodeLongitude;
	private Boolean isDeviceRooted;
	private String deviceChannelStatus;

	// private String confirmTransactionPassword;
	private String encryptionKey;
	private String basicAuthUsername;
	private String basicAuthPassword;
	private String userName; // used only for eWatch request

	private Integer channelModule; // = 1;//1 - IB/MB, 2 - eChat
	private String deviceId;
	private String sessionRequestToken;
	private boolean isDemo;
	private String requestURL;
	private Boolean isValidRequestCredentials; // used in AuthFilter for basic credentials checking
	private String secureToken; // secure token that will be sent as silent PN. this value will be validated
								// with every OTP (will be validated only of secureToken != null )

	public String getRequestToken() {
		return requestToken;
	}

	public void setRequestToken(String requestToken) {
		this.requestToken = requestToken;
	}

	public String getLoginToken() {
		return loginToken;
	}

	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getBiometricToken() {
		return biometricToken;
	}

	public void setBiometricToken(String transactionToken) {
		this.biometricToken = transactionToken;
	}

	public String getSecurityKey1() {
		return securityKey1;
	}

	public void setSecurityKey1(String securityKey1) {
		this.securityKey1 = securityKey1;
	}

	public String getSecurityKey2() {
		return securityKey2;
	}

	public void setSecurityKey2(String securityKey2) {
		this.securityKey2 = securityKey2;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public String getOtp() {
		return otp;
	}

	public String getBbynAppVersion() {
		return bbynAppVersion;
	}

	public void setBbynAppVersion(String bbynAppVersion) {
		this.bbynAppVersion = bbynAppVersion;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getDeviceModel() {
		return deviceModel;
	}

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

	public String getRequestLanguage() {
		return requestLanguage;
	}

	public void setRequestLanguage(String requestLanguage) {
		this.requestLanguage = requestLanguage;
	}

	public String getGeocodeLatitude() {
		return geocodeLatitude;
	}

	public void setGeocodeLatitude(String geocodeLatitude) {
		this.geocodeLatitude = geocodeLatitude;
	}

	public String getGeocodeLongitude() {
		return geocodeLongitude;
	}

	public void setGeocodeLongitude(String geocodeLongitude) {
		this.geocodeLongitude = geocodeLongitude;
	}

	public Boolean isDeviceRooted() {
		return isDeviceRooted;
	}

	public void setDeviceRooted(Boolean isDeviceRooted) {
		this.isDeviceRooted = isDeviceRooted;
	}

	public String getOtpMessage() {
		return otpMessage;
	}

	public void setOtpMessage(String otpMessage) {
		this.otpMessage = otpMessage;
	}

	/*
	 * public String getConfirmTransactionPassword() { return
	 * confirmTransactionPassword; } public void
	 * setConfirmTransactionPassword(String confirmTransactionPassword) {
	 * this.confirmTransactionPassword = confirmTransactionPassword; }
	 */
	public Boolean getIsDeviceRooted() {
		return isDeviceRooted;
	}

	public void setIsDeviceRooted(Boolean isDeviceRooted) {
		this.isDeviceRooted = isDeviceRooted;
	}

	public String getEncryptionKey() {
		return encryptionKey;
	}

	public void setEncryptionKey(String encryptionKey) {
		this.encryptionKey = encryptionKey;
	}

	public String getBasicAuthPassword() {
		return basicAuthPassword;
	}

	public void setBasicAuthPassword(String basicAuthPassword) {
		this.basicAuthPassword = basicAuthPassword;
	}

	public String getBasicAuthUsername() {
		return basicAuthUsername;
	}

	public void setBasicAuthUsername(String basicAuthUsername) {
		this.basicAuthUsername = basicAuthUsername;
	}

	public Integer getChannelModule() {
		return channelModule;
	}

	public void setChannelModule(Integer channelModule) {
		this.channelModule = channelModule;
	}

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getDeviceBrand() {
		return deviceBrand;
	}

	public void setDeviceBrand(String deviceBrand) {
		this.deviceBrand = deviceBrand;
	}

	public String getEwatchToken() {
		return ewatchToken;
	}

	public void setEwatchToken(String ewatchToken) {
		this.ewatchToken = ewatchToken;
	}

	public String getPasscode() {
		return passcode;
	}

	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getSessionRequestToken() {
		return sessionRequestToken;
	}

	public void setSessionRequestToken(String sessionRequestToken) {
		this.sessionRequestToken = sessionRequestToken;
	}

	public boolean getIsDemo() {
		return isDemo;
	}

	public void setIsDemo(boolean isDemo) {
		this.isDemo = isDemo;
	}

	public String getRequestURL() {
		return requestURL;
	}

	public void setRequestURL(String requestURL) {
		this.requestURL = requestURL;
	}

	public String getDeviceChannelStatus() {
		return deviceChannelStatus;
	}

	public void setDeviceChannelStatus(String deviceChannelStatus) {
		this.deviceChannelStatus = deviceChannelStatus;
	}

	public Boolean isValidRequestCredentials() {
		return isValidRequestCredentials;
	}

	public void setIsValidRequestCredentials(Boolean isValidRequest) {
		this.isValidRequestCredentials = isValidRequest;
	}

	public String getSecureToken() {
		return secureToken;
	}

	public void setSecureToken(String secureToken) {
		this.secureToken = secureToken;
	}

}
