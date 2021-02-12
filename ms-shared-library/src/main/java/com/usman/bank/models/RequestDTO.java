/**
 * @Copyright reserved to bank
 */
package com.usman.bank.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.usman.bank.constants.Constants.*;
import com.usman.bank.utils.UtilityClass;

/**
 * Description: This class RequestDTO.java
 *
 * @author  vXebiau
 * @date    Jul 9, 2019
 * @version 1.0
 *
 */
public class RequestDTO  implements Serializable{

	private static final Logger logger = LogManager.getLogger(RequestDTO.class);

	private static final long serialVersionUID = 1L;
	private String managedServerName = null;
	private String browserType = null;
	private String userAgent = null;
	private String localServerAddress = null;
	private String localServerName = null;
	private int localPort;
	private String cookie = null;
	private String remoteIPAddress = null;
	private Integer channel;
	private String channelName;
	private String remoteHostAddress;
	private String bbynAppVersion;
	private String operatingSystemName;
	private boolean isCardsFlushed;
	private boolean enableWSDebug =true;
	transient HashMap<Integer, Object> requestDetailsMap;
	private String requestToken;
	private Timestamp requestTimeStamp;
	private String channelKey;
	private String anyString1;
	private boolean disableEncruption = false;
	private String sessionID;
	private int operatingSystemId;
	private String operatingSystemVersion;
	
	private boolean ewatchIsValidToken ;	
	//private CustomerEWatchDTO customerEWatchDTO ;
	private String visibleServices ;
	private String selectedLangInterface;
	private Timestamp wsRequestTimeStamp;
	private Timestamp wsResponseTimeStamp;
	private String deviceModel;
	private String deviceBrand ;
	private String requestLanguage ;
	
	private boolean shaking ;	
	// mobile geocode latitude and longitude	
	private String geocodeLatitude; 
	private String geocodeLongitude;
	private boolean isDeviceRooted = true ;
	private Integer serviceID;
	private String requestMediaType ;
	
	private String gender ;
	private String formattedGenderCol ;

	private int channelModule =1;  //This to differentiate between App and Bot access
	private boolean callSOA = true; //control when to call SOA. This is used in case of login from BOT or later not to call SOA if iMAL or SOA is down.
	
	private boolean flush = true;	
	private String requestDeviceId;
	private String sessionRequestToken ;	
	private String deviceChannelStatus ;
	private boolean callSOACreditCard = true;
	
	
	public boolean isFlush() {
		return flush;
	}
	public void setFlush(boolean flush) {
		this.flush = flush;
	}
	public String getFormattedGenderCol() {
		formattedGenderCol = (gender != null ? (gender.equalsIgnoreCase("m") ? "MALE":"FEM") :"MALE");
		return formattedGenderCol;
	}
	public void setFormattedGenderCol(String formattedGenderCol) {
		this.formattedGenderCol = formattedGenderCol;
	}
	public String getGender() {
		
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getChannelModule() {
		return channelModule;
	}
	public void setChannelModule(int channelModule) {
		this.channelModule = channelModule;
	}
	public boolean isCallSOA() {
		return callSOA;
	}
	public void setCallSOA(boolean callSOA) {
		this.callSOA = callSOA;
	}
	public String getOperatingSystemVersion() {
		return operatingSystemVersion;
	}
	public void setOperatingSystemVersion(String operatingSystemVersion) {
		this.operatingSystemVersion = operatingSystemVersion;
	}	
	
	public int getOperatingSystemId() {
		return operatingSystemId;
	}
	public void setOperatingSystemId(int operatingSystemId) {
		this.operatingSystemId = operatingSystemId;
	}
	public Timestamp getWsRequestTimeStamp() {
		return wsRequestTimeStamp;
	}
	public void setWsRequestTimeStamp(Timestamp wsRequestTimeStamp) {
		this.wsRequestTimeStamp = wsRequestTimeStamp;
	}
	public String getSelectedLangInterface() {
		return selectedLangInterface;
	}
	public void setSelectedLangInterface(String selectedLangInterface) {
		this.selectedLangInterface = selectedLangInterface;
	}
	public HashMap<Integer, Object> getRequestDetailsMap() {
		return requestDetailsMap;
	}
	public void setRequestDetailsMap(HashMap<Integer, Object> requestDetailsMap) {
		this.requestDetailsMap = requestDetailsMap;
	}
	public boolean isCardsFlushed() {
		return isCardsFlushed;
	}
	public void setCardsFlushed(boolean isCardsFlushed) {
		this.isCardsFlushed = isCardsFlushed;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getRemoteIPAddress() {
		return remoteIPAddress;
	}
	public void setRemoteIPAddress(String remoteIPAddress) {
		this.remoteIPAddress = remoteIPAddress;
	}
	public String getBrowserType() {
		return browserType;
	}
	public void setBrowserType(String browserType) {
		this.browserType = browserType;
	}
	public String getUserAgent() {
		return userAgent;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	public String getManagedServerName() {
		return managedServerName;
	}
	public void setManagedServerName(String managedServerName) {
		this.managedServerName = managedServerName;
	}
	public String getLocalServerAddress() {
		return localServerAddress;
	}
	public void setLocalServerAddress(String localServerAddress) {
		this.localServerAddress = localServerAddress;
	}
	public String getLocalServerName() {
		return localServerName;
	}
	public void setLocalServerName(String localServerName) {
		this.localServerName = localServerName;
	}
	public String getCookie() {
		return cookie;
	}
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}
	public int getLocalPort() {
		return localPort;
	}
	public void setLocalPort(int localPort) {
		this.localPort = localPort;
	}
	public Integer getChannel() {
		return channel;
	}
	public void setChannel(Integer channel) {
		this.channel = channel;
	}
	public String getRemoteHostAddress() {
		return remoteHostAddress;
	}
	public void setRemoteHostAddress(String remoteHostAddress) {
		this.remoteHostAddress = remoteHostAddress;
	}
	
	public String getBbynAppVersion() {
		return bbynAppVersion;
	}
	public void setBbynAppVersion(String bbynAppVersion) {
		this.bbynAppVersion = bbynAppVersion;
	}	
	
	
	
	public String getOperatingSystemName() {
		return operatingSystemName;
	}
	public void setOperatingSystemName(String operatingSystemName) {
		this.operatingSystemName = operatingSystemName;
	}
	public String getRequestToken() {
		return requestToken;
	}
	public void setRequestToken(String requestToken) {
		this.requestToken = requestToken;
	}
	public boolean isEnableWSDebug() {
		return enableWSDebug;
	}
	public void setEnableWSDebug(boolean enableWSDebug) {
		this.enableWSDebug = enableWSDebug;
	}
	
	
	public Timestamp getRequestTimeStamp() {
		return requestTimeStamp;
	}
	public void setRequestTimeStamp(Timestamp requestTimeStamp) {
		this.requestTimeStamp = requestTimeStamp;
	}
	
	
	public String getChannelKey() {
		return channelKey;
	}
	public void setChannelKey(String channelKey) {
		this.channelKey = channelKey;
	}
	
	
	
	public String getAnyString1() {
		return anyString1;
	}
	public void setAnyString1(String anyString1) {
		this.anyString1 = anyString1;
	}
	
	
	public String getSessionID() {
		return sessionID;
	}
	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}				
	public boolean isEwatchValidToken() {
		return ewatchIsValidToken;
	}
	public void setIsEwatchValidToken(boolean ewatchIsValidToken) {
		this.ewatchIsValidToken = ewatchIsValidToken;
	}				
//	public CustomerEWatchDTO getCustomerEWatchDTO() {
//		return customerEWatchDTO;
//	}
//	public void setCustomerEWatchDTO(CustomerEWatchDTO customerEWatchDTO) {
//		this.customerEWatchDTO = customerEWatchDTO;
//	}
	@Override
	public String toString() {
		return "RequestDTO ["
				+ (browserType != null ? "browserType=" + browserType + ", "
						: "")
				+ (channel != null ? "channel=" + channel + ", " : "")
				+ (channelName != null ? "channelName=" + channelName + ", "
						: "")
				+ (cookie != null ? "cookie=" + cookie + ", " : "")
				+ (operatingSystemName != null ? "deviceOSType=" + operatingSystemName + ", "
						: "")
				+ "isCardsFlushed="
				+ isCardsFlushed
				+ ", localPort="
				+ localPort
				+ ", "
				+ (localServerAddress != null ? "localServerAddress="
						+ localServerAddress + ", " : "")
				+ (localServerName != null ? "localServerName="
						+ localServerName + ", " : "")
				+ (managedServerName != null ? "managedServerName="
						+ managedServerName + ", " : "")
				+ (bbynAppVersion != null ? "mobileVersion=" + bbynAppVersion
						+ ", " : "")
				+ (remoteHostAddress != null ? "remoteHostAddress="
						+ remoteHostAddress + ", " : "")
				+ (remoteIPAddress != null ? "remoteIPAddress="
						+ remoteIPAddress + ", " : "")
				+ (userAgent != null ? "userAgent=" + userAgent : "") + "]";
	}
	
	public String getVisibleServices() {
		return visibleServices;
	}
	public void setVisibleServices(String visibleServices) {
		this.visibleServices = visibleServices;
	}
	public String getDeviceModel() {
		return deviceModel;
	}
	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}
	public void setShaking(boolean shaking) {
		this.shaking = shaking;
	}
	public boolean isShaking() {
		return shaking;
	}

	public String getRequestLanguage() {
		return requestLanguage;
	}
	public void setRequestLanguage(String requestLanguage) {
		this.requestLanguage = requestLanguage;
	}	
	public void setGeocodeLatitude(String geocodeLatitude) {
		this.geocodeLatitude = geocodeLatitude;
	}	
	public String getGeocodeLatitude() {
		return geocodeLatitude;
	}
	public void setGeocodeLongitude(String geocodeLongitude) {
		this.geocodeLongitude = geocodeLongitude;
	}
	public String getGeocodeLongitude() {
		return geocodeLongitude;
	}
	public boolean isDeviceRooted() {
		if (this.deviceChannelStatus != null && this.deviceChannelStatus.equals("validrequest")){
			isDeviceRooted =  false;
		}
		return isDeviceRooted;
	}
	public void setDeviceRooted(boolean isDeviceRooted) {
		this.isDeviceRooted = isDeviceRooted;
	}
	public Integer getServiceID() {
		return serviceID;
	}
	public void setServiceID(Integer serviceID) {
		this.serviceID = serviceID;
	}
	public String getRequestMediaType() {
		return requestMediaType;
	}
	public void setRequestMediaType(String requestMediaType) {
		this.requestMediaType = requestMediaType;
	}
	public boolean isDisableEncruption() {
		
		return disableEncruption;
	}
	public void setDisableEncruption(boolean disableEncruption) {
		this.disableEncruption = disableEncruption;
	}	
	
	public String getDeviceBrand() {
		return deviceBrand;
	}
	public void setDeviceBrand(String deviceBrand) {
		this.deviceBrand = deviceBrand;
	}
	
	public String getRequestDeviceId() {
		return requestDeviceId;
	}
	public void setRequestDeviceId(String requestDeviceId) {
		this.requestDeviceId = requestDeviceId;
	}
	public String getSessionRequestToken() {
		return sessionRequestToken;
	}
	public void setSessionRequestToken(String sessionRequestToken) {
		this.sessionRequestToken = sessionRequestToken;
	}
	
	public String getDeviceChannelStatus() {
		return deviceChannelStatus;
	}
	public void setDeviceChannelStatus(String deviceChannelStatus) {
		this.deviceChannelStatus = deviceChannelStatus;
	}
	
	
	public boolean isCallSOACreditCard() {
		return callSOACreditCard;
	}
	public void setCallSOACreditCard(boolean callSOACreditCard) {
		this.callSOACreditCard = callSOACreditCard;
	}
	public boolean isAndroid(){
		try{
			return this.operatingSystemId == DEVICES.OS_TYPES.ANDROID ;	
		}catch(Exception ex){
			UtilityClass.logMe(logger, ex);
			return false;
		}
		
	}
	
	public boolean isiOS(){
		try{
			return this.operatingSystemId == DEVICES.OS_TYPES.IOS ;
		}catch(Exception ex){
			UtilityClass.logMe(logger, ex);
			return false;
		}
	}
	public Timestamp getWsResponseTimeStamp() {
		return wsResponseTimeStamp;
	}
	public void setWsResponseTimeStamp(Timestamp wsResponseTimeStamp) {
		this.wsResponseTimeStamp = wsResponseTimeStamp;
	}
	

}
