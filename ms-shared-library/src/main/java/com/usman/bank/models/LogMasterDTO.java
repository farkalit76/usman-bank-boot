/**
 * @Copyright reserved to bank
 */
package com.usman.bank.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Map;

/**
 * Description: This class LogMasterEntity.java
 *
 * @author vXebiau
 * @date Sep 11, 2019
 * @version 1.0
 *
 */
public class LogMasterDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	protected Long transId;
	protected Integer custId;
	protected Integer logServiceId;
	protected Timestamp transDate;
	protected Integer logActionId;
	protected Integer logStatusId;

	protected String remark = null; // NCLOB
	protected Integer userType;
	protected String managedServer;
	protected String cookie;
	protected String localAddress;
	protected String localServer;
	protected String userAgent;
	protected String browserType;
	protected String remoteIpAddress;
	protected String cifNumber;

	protected Integer channelId;
	protected Integer requestActionId;
	protected String remoteHost;
	protected Integer ipInNum;

	protected Integer ipRowIndex;
	protected String requestToken;
	protected Timestamp dbCreatedDate;
	protected Timestamp clientTimestamp;
	protected String channelKey;
	protected String sessionId;
	protected String interfaceLang;

	protected String osName;
	protected String osVersion;
	protected String appVersion;
	protected String deviceModel;
	protected String geocodeLatitude;
	protected String geocodeLongitude;
	protected Integer isDeviceRooted;
	protected String extraInfo; // varchar 4000
	protected String channelModule;
	protected String soaReqId;

	public LogMasterDTO() {
	}

	public LogMasterDTO(Long transId, Integer custId, Integer serviceId, Integer actionId, String remarks) {
		this(custId, serviceId, actionId, remarks);
		this.transId = transId;
	}

	public LogMasterDTO(Integer custId, Integer serviceId, Integer actionId, String remarks) {
		this.custId = custId;
		this.logServiceId = serviceId;
		this.logActionId = actionId;
		this.remark = remarks;
	}

	public LogMasterDTO(Integer custId, Integer serviceId, Integer actionId, Map<Integer, Object> logFieldsValues,
			String remarks) {
		this.custId = custId;
		this.logServiceId = serviceId;
		this.logActionId = actionId;
		this.extraInfo = logFieldsValues.toString();
		this.remark = remarks;
	}

	public Long getTransId() {
		return transId;
	}

	public void setTransId(Long transId) {
		this.transId = transId;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public Integer getLogServiceId() {
		return logServiceId;
	}

	public void setLogServiceId(Integer logServiceId) {
		this.logServiceId = logServiceId;
	}

	public Timestamp getTransDate() {
		return transDate;
	}

	public void setTransDate(Timestamp transDate) {
		this.transDate = transDate;
	}

	public Integer getLogActionId() {
		return logActionId;
	}

	public void setLogActionId(Integer logActionId) {
		this.logActionId = logActionId;
	}

	public Integer getLogStatusId() {
		return logStatusId;
	}

	public void setLogStatusId(Integer logStatusId) {
		this.logStatusId = logStatusId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getManagedServer() {
		return managedServer;
	}

	public void setManagedServer(String managedServer) {
		this.managedServer = managedServer;
	}

	public String getCookie() {
		return cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
	}

	public String getLocalAddress() {
		return localAddress;
	}

	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}

	public String getLocalServer() {
		return localServer;
	}

	public void setLocalServer(String localServer) {
		this.localServer = localServer;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getBrowserType() {
		return browserType;
	}

	public void setBrowserType(String browserType) {
		this.browserType = browserType;
	}

	public String getRemoteIpAddress() {
		return remoteIpAddress;
	}

	public void setRemoteIpAddress(String remoteIpAddress) {
		this.remoteIpAddress = remoteIpAddress;
	}

	public String getCifNumber() {
		return cifNumber;
	}

	public void setCifNumber(String cifNumber) {
		this.cifNumber = cifNumber;
	}

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}

	public Integer getRequestActionId() {
		return requestActionId;
	}

	public void setRequestActionId(Integer requestActionId) {
		this.requestActionId = requestActionId;
	}

	public String getRemoteHost() {
		return remoteHost;
	}

	public void setRemoteHost(String remoteHost) {
		this.remoteHost = remoteHost;
	}

	public Integer getIpInNum() {
		return ipInNum;
	}

	public void setIpInNum(Integer ipInNum) {
		this.ipInNum = ipInNum;
	}

	public Integer getIpRowIndex() {
		return ipRowIndex;
	}

	public void setIpRowIndex(Integer ipRowIndex) {
		this.ipRowIndex = ipRowIndex;
	}

	public String getRequestToken() {
		return requestToken;
	}

	public void setRequestToken(String requestToken) {
		this.requestToken = requestToken;
	}

	public Timestamp getDbCreatedDate() {
		return dbCreatedDate;
	}

	public void setDbCreatedDate(Timestamp dbCreatedDate) {
		this.dbCreatedDate = dbCreatedDate;
	}

	public Timestamp getClientTimestamp() {
		return clientTimestamp;
	}

	public void setClientTimestamp(Timestamp clientTimestamp) {
		this.clientTimestamp = clientTimestamp;
	}

	public String getChannelKey() {
		return channelKey;
	}

	public void setChannelKey(String channelKey) {
		this.channelKey = channelKey;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getInterfaceLang() {
		return interfaceLang;
	}

	public void setInterfaceLang(String interfaceLang) {
		this.interfaceLang = interfaceLang;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
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

	public String getDeviceModel() {
		return deviceModel;
	}

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
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

	public Integer getIsDeviceRooted() {
		return isDeviceRooted;
	}

	public void setIsDeviceRooted(Integer isDeviceRooted) {
		this.isDeviceRooted = isDeviceRooted;
	}

	public String getExtraInfo() {
		return extraInfo;
	}

	public void setExtraInfo(String extraInfo) {
		this.extraInfo = extraInfo;
	}

	public String getChannelModule() {
		return channelModule;
	}

	public void setChannelModule(String channelModule) {
		this.channelModule = channelModule;
	}

	public String getSoaReqId() {
		return soaReqId;
	}

	public void setSoaReqId(String soaReqId) {
		this.soaReqId = soaReqId;
	}

	@Override
	public String toString() {
		return "LogMasterDTO [transId=" + transId + ", custId=" + custId + ", logServiceId=" + logServiceId
				+ ", transDate=" + transDate + ", logActionId=" + logActionId + ", logStatusId=" + logStatusId
				+ ", remark=" + remark + ", userType=" + userType + ", managedServer=" + managedServer + ", cookie="
				+ cookie + ", localAddress=" + localAddress + ", localServer=" + localServer + ", userAgent="
				+ userAgent + ", browserType=" + browserType + ", remoteIpAddress=" + remoteIpAddress + ", cifNumber="
				+ cifNumber + ", channelId=" + channelId + ", requestActionId=" + requestActionId + ", remoteHost="
				+ remoteHost + ", ipInNum=" + ipInNum + ", ipRowIndex=" + ipRowIndex + ", requestToken=" + requestToken
				+ ", dbCreatedDate=" + dbCreatedDate + ", clientTimestamp=" + clientTimestamp + ", channelKey="
				+ channelKey + ", sessionId=" + sessionId + ", interfaceLang=" + interfaceLang + ", osName=" + osName
				+ ", osVersion=" + osVersion + ", appVersion=" + appVersion + ", deviceModel=" + deviceModel
				+ ", geocodeLatitude=" + geocodeLatitude + ", geocodeLongitude=" + geocodeLongitude
				+ ", isDeviceRooted=" + isDeviceRooted + ", extraInfo=" + extraInfo + ", channelModule=" + channelModule
				+ ", soaReqId=" + soaReqId + "]";
	}

}
