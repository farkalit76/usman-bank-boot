package com.usman.bank.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

import com.usman.bank.enums.LanguageEnum;
import com.usman.bank.utils.Utility;

/**
 * Created by Veneesh on 9/8/14.
 */
public class UserDTO extends CustomerDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userId;
	private String userName;
	private String nickName;
	private String booqId;
	// Default is mobile
	private int userNameTypeId = 1;

	private String posCredentials;
	private UserDTO parentUserDTO;
	private boolean realmLockStatus;
	private LookupDTO userTypeDTO;
	// private BusinessPackageDTO businessPackageDTO;
	private String userPassword;
	private String confirmedTransactionPin;
	private String confirmedLoginPassword;
	private List<String> userGroups;

	private String authenticationToken;
	private String apiJWT;// The JWT token to be used after Login
	private String refreshJWT;// The refresh JWT token to refresh the Login Token
	private String serviceKey;
	private String userPin;
	private String loginOTP;
	private int statusId;
	private int lockReasonId;
	private int emailActivationStatus;

	// private List<DeviceDTO> deviceDTOList;
	// private List<GlobalConfigDTO> globalConfigDTOList;
	// private LimitUtilizationDTO usrLimitUtilizationDTO;
	// private HashMap<Long,PayeeDTO> payeeDTOHashMap;
	// private Map<String,SecurityKeyDTO> securityKeyDTOHM;
	private byte[] profileImage;
	private byte[] logoImage;
	private String encodedLogoImage;

	private Timestamp lastImageProfileUpdateDateTime;

	private Timestamp lastLogoProfileUpdateDateTime;
	private Timestamp lastAccessDateTime;

	private String logoColor;

	private LanguageEnum communicationLanguage;

	private byte[] serverPublickKey;
	private byte[] serverPrivateKey;
	private String clientPublicKey;
	// sent by client to server
	// private String clientPublicModulus;
	// private String clientPublicExponent;
	private UserAccountDTO primeAccountDTO;

	// sent by server to client
	// private String serverPublicModulus;
	// private String serverPublicExponent;

	// hidden and used by server only to decrypt
	// private String serverPrivateExponent;

	// This will be encrypted using RSA
	private byte[] symmetricKey;

	// used in case booq user wants to integrate with Booq Tokenization system
	private String privateSharedPassword;

	private int tokenValidity;
	private String civilID;
	private int configId;

	public UserDTO() {
	}

	public UserDTO(String userId, String userName, String userCode) {
		this.userId = userId;
		this.userName = userName;
		this.booqId = userCode;
	}

	public Timestamp getLastLogoProfileUpdateDateTime() {
		return lastLogoProfileUpdateDateTime;
	}

	public void setLastLogoProfileUpdateDateTime(Timestamp lastLogoProfileUpdateDateTime) {
		this.lastLogoProfileUpdateDateTime = lastLogoProfileUpdateDateTime;
	}

	public String getEncodedLogoImage() {
		if (getLogoImage() != null)
			encodedLogoImage = Base64.getEncoder().encodeToString(getLogoImage());
		return encodedLogoImage;
	}

	public void setEncodedLogoImage(String encodedLogoImage) {
		this.encodedLogoImage = encodedLogoImage;
	}

	public String getLogoColor() {
		return logoColor;
	}

	public void setLogoColor(String logoColor) {
		this.logoColor = logoColor;
	}

	public byte[] getLogoImage() {
		return logoImage;
	}

	public void setLogoImage(byte[] logoImage) {
		this.logoImage = logoImage;
	}

	public boolean isRealmLockStatus() {
		return realmLockStatus;
	}

	public void setRealmLockStatus(boolean realmLockStatus) {
		this.realmLockStatus = realmLockStatus;
	}

	public String getClientPublicKey() {
		return clientPublicKey;
	}

	public void setClientPublicKey(String clientPublicKey) {
		this.clientPublicKey = clientPublicKey;
	}

	public String getPrivateSharedPassword() {
		return privateSharedPassword;
	}

	public void setPrivateSharedPassword(String privateSharedPassword) {
		this.privateSharedPassword = privateSharedPassword;
	}

	public int getTokenValidity() {
		return tokenValidity;
	}

	public void setTokenValidity(int tokenValidity) {
		this.tokenValidity = tokenValidity;
	}

	public UserAccountDTO getPrimeAccountDTO() {
		return primeAccountDTO;
	}

	public void setPrimeAccountDTO(UserAccountDTO primeAccountDTO) {
		this.primeAccountDTO = primeAccountDTO;
	}

	public int getLockReasonId() {
		return lockReasonId;
	}

	public void setLockReasonId(int lockReasonId) {
		this.lockReasonId = lockReasonId;
	}

	public byte[] getSymmetricKey() {
		return symmetricKey;
	}

	public void setSymmetricKey(byte[] symmetricKey) {
		this.symmetricKey = symmetricKey;
	}

	public byte[] getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(byte[] profileImage) {
		this.profileImage = profileImage;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public LookupDTO getUserTypeDTO() {
		return userTypeDTO;
	}

	public void setUserTypeDTO(LookupDTO userTypeDTO) {
		this.userTypeDTO = userTypeDTO;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public List<String> getUserGroups() {
		return userGroups;
	}

	public void setUserGroups(List<String> userGroups) {
		this.userGroups = userGroups;
	}

	public String getBooqId() {
		if (booqId != null)
			return booqId.toUpperCase();
		else
			return booqId;
	}

	public void setBooqId(String booqId) {
		this.booqId = booqId;
	}

	public String getServiceKey() {
		return serviceKey;
	}

	public void setServiceKey(String serviceKey) {
		this.serviceKey = serviceKey;
	}

	public String getUserPin() {
		return userPin;
	}

	public void setUserPin(String userPin) {
		this.userPin = userPin;
	}

	public String getLoginOTP() {
		return loginOTP;
	}

	public void setLoginOTP(String loginOTP) {
		this.loginOTP = loginOTP;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

//    public BusinessPackageDTO getBusinessPackageDTO() {
//        return businessPackageDTO;
//    }
//
//    public void setBusinessPackageDTO(BusinessPackageDTO businessPackageDTO) {
//        this.businessPackageDTO = businessPackageDTO;
//    }
//    
//    public List<DeviceDTO> getDeviceDTOList() {
//        return deviceDTOList;
//    }
//
//    public void setDeviceDTOList(List<DeviceDTO> deviceDTOList) {
//        this.deviceDTOList = deviceDTOList;
//    }
//
//    public List<GlobalConfigDTO> getGlobalConfigDTOList() {
//        return globalConfigDTOList;
//    }
//
//    public void setGlobalConfigDTOList(List<GlobalConfigDTO> globalConfigDTOList) {
//        this.globalConfigDTOList = globalConfigDTOList;
//    }
//
//    public LimitUtilizationDTO getUsrLimitUtilizationDTO() {
//        return usrLimitUtilizationDTO;
//    }
//
//    public void setUsrLimitUtilizationDTO(LimitUtilizationDTO usrLimitUtilizationDTO) {
//        this.usrLimitUtilizationDTO = usrLimitUtilizationDTO;
//    }
//    public Map<Long, PayeeDTO> getPayeeDTOHashMap() {
//        return this.payeeDTOHashMap;
//    }
//
//    public void setPayeeDTOHashMap(HashMap<Long, PayeeDTO> payeeDTOHashMap) {
//
//        this.payeeDTOHashMap = payeeDTOHashMap;
//    }
//    public Map<String, SecurityKeyDTO> getSecurityKeyDTOHM() {
//        return securityKeyDTOHM;
//    }
//
//    public void setSecurityKeyDTOHM(Map<String, SecurityKeyDTO> securityKeyDTOHM) {
//        this.securityKeyDTOHM = securityKeyDTOHM;
//    }

	public String getConfirmedTransactionPin() {
		return confirmedTransactionPin;
	}

	public void setConfirmedTransactionPin(String confirmedTransactionPin) {
		this.confirmedTransactionPin = confirmedTransactionPin;
	}

	public String getConfirmedLoginPassword() {
		return confirmedLoginPassword;
	}

	public void setConfirmedLoginPassword(String confirmedLoginPassword) {
		this.confirmedLoginPassword = confirmedLoginPassword;
	}

	public LanguageEnum getCommunicationLanguage() {
		communicationLanguage = Utility.isEmpty(this.communicationLanguage) ? LanguageEnum.EN
				: this.communicationLanguage;
		return communicationLanguage;
	}

	public void setCommunicationLanguage(LanguageEnum communicationLanguage) {
		this.communicationLanguage = communicationLanguage;
	}

	public String getAuthenticationToken() {
		return authenticationToken;
	}

	public void setAuthenticationToken(String authenticationToken) {
		this.authenticationToken = authenticationToken;
	}

	public byte[] getServerPublickKey() {
		return serverPublickKey;
	}

	public void setServerPublickKey(byte[] serverPublickKey) {
		this.serverPublickKey = serverPublickKey;
	}

	public byte[] getServerPrivateKey() {
		return serverPrivateKey;
	}

	public void setServerPrivateKey(byte[] serverPrivateKey) {
		this.serverPrivateKey = serverPrivateKey;
	}

	public int getEmailActivationStatus() {
		return emailActivationStatus;
	}

	public void setEmailActivationStatus(int emailActivationStatus) {
		this.emailActivationStatus = emailActivationStatus;
	}

	public Timestamp getLastImageProfileUpdateDateTime() {
		return lastImageProfileUpdateDateTime;
	}

	public void setLastImageProfileUpdateDateTime(Timestamp lastImageProfileUpdateDateTime) {
		this.lastImageProfileUpdateDateTime = lastImageProfileUpdateDateTime;
	}

	public int getUserNameTypeId() {
		return userNameTypeId;
	}

	public void setUserNameTypeId(int userNameTypeId) {
		this.userNameTypeId = userNameTypeId;
	}

	public Timestamp getLastAccessDateTime() {
		return lastAccessDateTime;
	}

	public void setLastAccessDateTime(Timestamp lastAccessDateTime) {
		this.lastAccessDateTime = lastAccessDateTime;
	}

	public UserDTO getParentUserDTO() {
		return parentUserDTO;
	}

	public void setParentUserDTO(UserDTO parentUserDTO) {
		this.parentUserDTO = parentUserDTO;
	}

	public String getPosCredentials() {
		return posCredentials;
	}

	public void setPosCredentials(String posCredentials) {
		this.posCredentials = posCredentials;
	}

	public String getCivilID() {
		return civilID;
	}

	public void setCivilID(String civilID) {
		this.civilID = civilID;
	}

	public int getConfigId() {
		return configId;
	}

	public void setConfigId(int configId) {
		this.configId = configId;
	}

	public String getApiJWT() {
		return apiJWT;
	}

	public void setApiJWT(String apiJWT) {
		this.apiJWT = apiJWT;
	}

	public String getRefreshJWT() {
		return refreshJWT;
	}

	public void setRefreshJWT(String refreshJWT) {
		this.refreshJWT = refreshJWT;
	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userName=" + userName + ", nickName=" + nickName + ", booqId=" + booqId
				+ ", userNameTypeId=" + userNameTypeId + ", posCredentials=" + posCredentials + ", parentUserDTO="
				+ parentUserDTO + ", realmLockStatus=" + realmLockStatus + ", userTypeDTO=" + userTypeDTO
				+ ", userPassword=" + userPassword + ", confirmedTransactionPin=" + confirmedTransactionPin
				+ ", confirmedLoginPassword=" + confirmedLoginPassword + ", userGroups=" + userGroups
				+ ", authenticationToken=" + authenticationToken + ", apiJWT=" + apiJWT + ", refreshJWT=" + refreshJWT
				+ ", serviceKey=" + serviceKey + ", userPin=" + userPin + ", loginOTP=" + loginOTP + ", statusId="
				+ statusId + ", lockReasonId=" + lockReasonId + ", emailActivationStatus=" + emailActivationStatus
				+ ", profileImage=" + Arrays.toString(profileImage) + ", logoImage=" + Arrays.toString(logoImage)
				+ ", encodedLogoImage=" + encodedLogoImage + ", lastImageProfileUpdateDateTime="
				+ lastImageProfileUpdateDateTime + ", lastLogoProfileUpdateDateTime=" + lastLogoProfileUpdateDateTime
				+ ", lastAccessDateTime=" + lastAccessDateTime + ", logoColor=" + logoColor + ", communicationLanguage="
				+ communicationLanguage + ", serverPublickKey=" + Arrays.toString(serverPublickKey)
				+ ", serverPrivateKey=" + Arrays.toString(serverPrivateKey) + ", clientPublicKey=" + clientPublicKey
				+ ", primeAccountDTO=" + primeAccountDTO + ", symmetricKey=" + Arrays.toString(symmetricKey)
				+ ", privateSharedPassword=" + privateSharedPassword + ", tokenValidity=" + tokenValidity + ", civilID="
				+ civilID + ", configId=" + configId + "]";
	}

}
