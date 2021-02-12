package com.usman.bank.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.usman.bank.constants.Constants;

public class DeviceDTO implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userName;
	private String deviceId;
	private String dbHashedDeviceId;
	private Timestamp deviceCreatedOn;
	private String preferedSound;
	private int registrationChannelId;
	private Timestamp deviceUpdatedOn;

	// private Integer pushNotificationMsgStatus ; //1=show PN msg for user, 2=
	// don't show msg for the user.

	private Integer mobileActionType; // this is indicator for the mobile to know what action should be done after
										// login.
										// 1 = PN Enabled.
										// 2 = PN disabled.
										// 3 = PN disabled from OS.
										// 4 = PN Disabled but show to the customer confirmation msg.

	/**
	 * JIRA: RTLCRPMBDV-442 (DA-527 - SMS & PN Enhancement) Neel: 14-Nov-2016
	 */
	private String creditCardNotificationType;// S=SMS, P = Push, B = Both SMS & Push.
	private Integer creditCardCommunicationType; // 1 = SMS, 2 = SMS & PN

	// device properties
	private boolean deviceEnabled;
	private String bbynAppVersion;
	private String deviceOsName;
	private String osVersion;
	private String deviceModel;
	private int osType;
	private String deviceLanguage;
	private Boolean isDeviceDefault;
	private Boolean isDeviceRooted;
	private String actionMessage;

	// @XmlAttribute (name="pushNotificationToken")
	private String deviceToken;

	private String fcmToken;

	// @XmlAttribute (name="deviceToken")
	private String oldAppDeviceToken; // this objet was added only to handle the global config requests from old App
										// version. because it send the device object as "deviceDTO".

	private Integer notificationSettingsStatus; // 0 = PN settings is disabled. 1 = Enabled.
	// private boolean pnEnabled ;
	private Integer pnTransactionStatus;// 0 = PN transactions settings is disabled. 1 = Enabled.
	private Integer notificationCenterStatus; // 1= the suer can read the msg from outside the application. 0 = he has
												// to be logged in.
	private PushNotificationDTO pushNotificationDTO;
	private Timestamp pnUpdatedDateTime;

	private int nfcDebitStatusId;
	private int nfcCreditStatusId;

	private int isEwatchEnabled;
	private String ewatchToken;
	private String dbHashedEwatchToken;
	private Timestamp ewatchTokenDateTime;
	private String ewatchPassCode;
	private boolean ewatchIsPassCodeRequired;
	private int ewatchWrongPassCodeCounter;
	private String ewatchLanguage;
	private Timestamp ewatchUpdatedDateTime;

	private boolean showFingerprintOption;
	private int isFpLoginEnabled;
	private String fpLoginTokenDB;

	// @XmlAttribute(name = "fpLoginToken")
	private String fpLoginToken;

	private String fpTransactionToken;
	private int isFpTransactionEnabled;
	private Timestamp fpSettingsUpdatedDateTime;
	private Timestamp fpTokenDateTime;
	private Integer fpWrongLoginCounter;
	private Timestamp fpSettingsDatetime;
	private String visaCurrentDeviceId;
	private String visaOldDeviceId;
	private String pnMessage;
	private String fpMessage;
	private String nfcDebitPaymentSecureToken;
	private String nfcCreditPaymentSecureToken;
	private String nfcWalletToken;
	private boolean isMigratedUser = false;
	private String communicationMethod;
	private boolean isRegistredWithSMS;
	private double chargesAmount;
	private boolean showOTP;
	private PresentationDTO presentationDTO;
	private boolean showPnPopup; // true= chow the pop-up for the customer when he log-in to the mobile.
	private String alertSmsNoteAmount;
	private boolean showValidateAlertMsg; // This boolean is used in the validate method for alert settings. if true, it
											// will show the pop-up for the client.
	private boolean imalFailedReadingDeviceInfo;

	// Added by Neel for chatbot popup controlled by server side
	private String chatBotPopupMessage; // The chatBotPopup Message
	private String sessionEncryptionToken; // used for android devices to specify the encryption key
	private String sessionRequestToken;
	private boolean isSupportFaceId = false;

	private String checkDeviceToken;
	private String genuineDeviceToken;
	private String androidSessionSafetyNetNonce;

	public DeviceDTO() {
	}

	public DeviceDTO(String deviceId, String oldVisaDeviceId, RequestDTO requestDTO) {
		this.deviceId = deviceId;
		this.bbynAppVersion = requestDTO.getBbynAppVersion();
		this.deviceCreatedOn = new Timestamp(new Date().getTime());
		this.deviceEnabled = true;
		this.deviceLanguage = requestDTO.getSelectedLangInterface();
		this.deviceModel = requestDTO.getDeviceModel();
		this.deviceToken = null;
		this.deviceOsName = requestDTO.getOperatingSystemName();
		this.osVersion = requestDTO.getOperatingSystemVersion();
		this.osType = requestDTO.getOperatingSystemId();
		this.isEwatchEnabled = Constants.FLAG_STATUS.INACTIVE;
		this.ewatchIsPassCodeRequired = false;
		this.ewatchWrongPassCodeCounter = 0;
		this.isDeviceDefault = true;
		this.isFpLoginEnabled = Constants.FLAG_STATUS.NOT_SET_BY_USER;
		this.isFpTransactionEnabled = Constants.FLAG_STATUS.NOT_SET_BY_USER;
		this.nfcCreditStatusId = Constants.FLAG_STATUS.INACTIVE;
		this.nfcDebitStatusId = Constants.FLAG_STATUS.INACTIVE;
		this.isDeviceRooted = requestDTO.isDeviceRooted();
		this.notificationCenterStatus = Constants.FLAG_STATUS.NOT_SET_BY_USER;
		this.notificationSettingsStatus = Constants.NOTIFICATIONS.COMMUNICATION_METHOD_ECORE.NOT_SET_BY_USER;
		if (Constants.APPLICATIONS_VERSIONS.SOA_FLAG.SMS_CHARGES_APPLIED)
			this.pnTransactionStatus = Constants.NOTIFICATIONS.COMMUNICATION_METHOD_ECORE.OFF;
		else
			this.pnTransactionStatus = Constants.NOTIFICATIONS.COMMUNICATION_METHOD_ECORE.SMS;

		this.visaOldDeviceId = oldVisaDeviceId;
		this.fpWrongLoginCounter = 0;
		this.creditCardNotificationType = Constants.NOTIFICATIONS.CREDIT_CARD_NOTIF_TYPES.NOT_SET_BY_USER;
		this.showPnPopup = true;
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

	public Timestamp getDeviceCreatedOn() {
		return deviceCreatedOn;
	}

	public void setDeviceCreatedOn(Timestamp deviceCreatedOn) {
		this.deviceCreatedOn = deviceCreatedOn;
	}

	public String getPreferedSound() {
		return preferedSound;
	}

	public void setPreferedSound(String preferedSound) {
		this.preferedSound = preferedSound;
	}

	public int getRegistrationChannelId() {
		return registrationChannelId;
	}

	public void setRegistrationChannelId(int registrationChannelId) {
		this.registrationChannelId = registrationChannelId;
	}

	public Timestamp getDeviceUpdatedOn() {
		return deviceUpdatedOn;
	}

	public void setDeviceUpdatedOn(Timestamp deviceUpdatedOn) {
		this.deviceUpdatedOn = deviceUpdatedOn;
	}

	public Integer getMobileActionType() {
		return mobileActionType;
	}

	public void setMobileActionType(Integer mobileActionType) {
		this.mobileActionType = mobileActionType;
	}

	public boolean isDeviceEnabled() {
		return deviceEnabled;
	}

	public void setDeviceEnabled(boolean deviceEnabled) {
		this.deviceEnabled = deviceEnabled;
	}

	public String getBbynAppVersion() {
		return bbynAppVersion;
	}

	public void setBbynAppVersion(String bbynAppVersion) {
		this.bbynAppVersion = bbynAppVersion;
	}

	public String getDeviceOsName() {
		return deviceOsName;
	}

	public void setDeviceOsName(String deviceOsName) {
		this.deviceOsName = deviceOsName;
	}

	public String getDeviceModel() {
		return deviceModel;
	}

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

	public int getOsType() {
		return osType;
	}

	public void setOsType(int osType) {
		this.osType = osType;
	}

	public String getDeviceLanguage() {
		return deviceLanguage;
	}

	public void setDeviceLanguage(String deviceLanguage) {
		this.deviceLanguage = deviceLanguage;
	}

	public Boolean isDeviceDefault() {
		return isDeviceDefault;
	}

	public void setDeviceDefault(Boolean isDeviceDefault) {
		this.isDeviceDefault = isDeviceDefault;
	}

	public Boolean isDeviceRooted() {
		return isDeviceRooted;
	}

	public void setDeviceRooted(Boolean isDeviceRooted) {
		this.isDeviceRooted = isDeviceRooted;
	}

	public String getDeviceToken() {
		return deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	public Integer getPnTransactionStatus() {
		return pnTransactionStatus;
	}

	public void setPnTransactionStatus(Integer pnTransactionStatus) {
		this.pnTransactionStatus = pnTransactionStatus;
	}

	public PushNotificationDTO getPushNotificationDTO() {
		return pushNotificationDTO;
	}

	public void setPushNotificationDTO(PushNotificationDTO pushNotificationDTO) {
		this.pushNotificationDTO = pushNotificationDTO;
	}

	public Timestamp getPnUpdatedDateTime() {
		return pnUpdatedDateTime;
	}

	public void setPnUpdatedDateTime(Timestamp pnUpdatedDateTime) {
		this.pnUpdatedDateTime = pnUpdatedDateTime;
	}

	public int getNfcDebitStatusId() {
		return nfcDebitStatusId;
	}

	public void setNfcDebitStatusId(int nfcDebitStatusId) {
		this.nfcDebitStatusId = nfcDebitStatusId;
	}

	public int getNfcCreditStatusId() {
		return nfcCreditStatusId;
	}

	public void setNfcCreditStatusId(int nfcCreditStatusId) {
		this.nfcCreditStatusId = nfcCreditStatusId;
	}

	public String getEwatchToken() {
		return ewatchToken;
	}

	public void setEwatchToken(String ewatchToken) {
		this.ewatchToken = ewatchToken;
	}

	public Timestamp getEwatchTokenDateTime() {
		return ewatchTokenDateTime;
	}

	public void setEwatchTokenDateTime(Timestamp ewatchTokenDateTime) {
		this.ewatchTokenDateTime = ewatchTokenDateTime;
	}

	public String getEwatchPassCode() {
		return ewatchPassCode;
	}

	public void setEwatchPassCode(String ewatchPassCode) {
		this.ewatchPassCode = ewatchPassCode;
	}

	public boolean isEwatchIsPassCodeRequired() {
		return ewatchIsPassCodeRequired;
	}

	public void setEwatchIsPassCodeRequired(boolean ewatchIsPassCodeRequired) {
		this.ewatchIsPassCodeRequired = ewatchIsPassCodeRequired;
	}

	public int getEwatchWrongPassCodeCounter() {
		return ewatchWrongPassCodeCounter;
	}

	public void setEwatchWrongPassCodeCounter(int ewatchWrongPassCodeCounter) {
		this.ewatchWrongPassCodeCounter = ewatchWrongPassCodeCounter;
	}

	public String getEwatchLanguage() {
		return ewatchLanguage;
	}

	public void setEwatchLanguage(String ewatchLanguage) {
		this.ewatchLanguage = ewatchLanguage;
	}

	public Timestamp getEwatchUpdatedDateTime() {
		return ewatchUpdatedDateTime;
	}

	public void setEwatchUpdatedDateTime(Timestamp ewatchUpdatedDateTime) {
		this.ewatchUpdatedDateTime = ewatchUpdatedDateTime;
	}

	public boolean isShowFingerprintOption() {
		return showFingerprintOption;
	}

	public void setShowFingerprintOption(boolean showFingerprintOption) {
		this.showFingerprintOption = showFingerprintOption;
	}

	public String getFpLoginToken() {
		return fpLoginToken;
	}

	public void setFpLoginToken(String fpLoginToken) {
		this.fpLoginToken = fpLoginToken;
	}

	public String getFpTransactionToken() {
		return fpTransactionToken;
	}

	public void setFpTransactionToken(String fpTransactionToken) {
		this.fpTransactionToken = fpTransactionToken;
	}

	public Timestamp getFpSettingsUpdatedDateTime() {
		return fpSettingsUpdatedDateTime;
	}

	public void setFpSettingsUpdatedDateTime(Timestamp fpSettingsUpdatedDateTime) {
		this.fpSettingsUpdatedDateTime = fpSettingsUpdatedDateTime;
	}

	public Timestamp getFpTokenDateTime() {
		return fpTokenDateTime;
	}

	public void setFpTokenDateTime(Timestamp fpTokenDateTime) {
		this.fpTokenDateTime = fpTokenDateTime;
	}

	public Integer getFpWrongLoginCounter() {
		return fpWrongLoginCounter;
	}

	public void setFpWrongLoginCounter(Integer fpWrongLoginCounter) {
		this.fpWrongLoginCounter = fpWrongLoginCounter;
	}

	public Timestamp getFpSettingsDatetime() {
		return fpSettingsDatetime;
	}

	public void setFpSettingsDatetime(Timestamp fpSettingsDatetime) {
		this.fpSettingsDatetime = fpSettingsDatetime;
	}

	public String getActionMessage() {
		return actionMessage;
	}

	public void setActionMessage(String actionMessage) {
		this.actionMessage = actionMessage;
	}

	public Integer getNotificationSettingsStatus() {
		return notificationSettingsStatus;
	}

	public void setNotificationSettingsStatus(Integer notificationSettingsStatus) {
		this.notificationSettingsStatus = notificationSettingsStatus;
	}

	public Integer getNotificationCenterStatus() {
		return notificationCenterStatus;
	}

	public Integer getNotificationCenterStatus(boolean imalValue) {
		return notificationCenterStatus;
	}

	public void setNotificationCenterStatus(Integer notificationCenterStatus) {
		this.notificationCenterStatus = notificationCenterStatus;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getVisaCurrentDeviceId() {
		return visaCurrentDeviceId;
	}

	public void setVisaCurrentDeviceId(String visaCurrentDeviceId) {
		this.visaCurrentDeviceId = visaCurrentDeviceId;
	}

	public String getVisaOldDeviceId() {
		return visaOldDeviceId;
	}

	public void setVisaOldDeviceId(String visaOldDeviceId) {
		this.visaOldDeviceId = visaOldDeviceId;
	}

	public int getIsEwatchEnabled() {
		return isEwatchEnabled;
	}

	public void setIsEwatchEnabled(int isEwatchEnabled) {
		this.isEwatchEnabled = isEwatchEnabled;
	}

	public int getIsFpLoginEnabled() {
		return isFpLoginEnabled;
	}

	public void setIsFpLoginEnabled(int isFpLoginEnabled) {
		this.isFpLoginEnabled = isFpLoginEnabled;
	}

	public int getIsFpTransactionEnabled() {
		return isFpTransactionEnabled;
	}

	public void setIsFpTransactionEnabled(int isFpTransactionEnabled) {
		this.isFpTransactionEnabled = isFpTransactionEnabled;
	}

	public String getPnMessage() {
		return pnMessage;
	}

	public void setPnMessage(String pnMessage) {
		this.pnMessage = pnMessage;
	}

	public String getFpMessage() {
		return fpMessage;
	}

	public void setFpMessage(String fpMessage) {
		this.fpMessage = fpMessage;
	}

	public Integer getImalStatus(Integer settingsStatus) {
		if (settingsStatus == null || settingsStatus == Constants.FLAG_STATUS.NOT_SET_BY_USER) {
			return Constants.FLAG_STATUS.INACTIVE;
		} else {
			return settingsStatus;
		}
	}

	public String getNfcDebitPaymentSecureToken() {
		return nfcDebitPaymentSecureToken;
	}

	public void setNfcDebitPaymentSecureToken(String nfcDebitPaymentSecureToken) {
		this.nfcDebitPaymentSecureToken = nfcDebitPaymentSecureToken;
	}

	public String getNfcCreditPaymentSecureToken() {
		return nfcCreditPaymentSecureToken;
	}

	public void setNfcCreditPaymentSecureToken(String nfcCreditPaymentSecureToken) {
		this.nfcCreditPaymentSecureToken = nfcCreditPaymentSecureToken;
	}

	public String getNfcWalletToken() {
		return nfcWalletToken;
	}

	public void setNfcWalletToken(String nfcWalletToken) {
		this.nfcWalletToken = nfcWalletToken;
	}

	public boolean isMigratedUser() {
		return isMigratedUser;
	}

	public void setMigratedUser(boolean isMigratedUser) {
		this.isMigratedUser = isMigratedUser;
	}

	public String getFpLoginTokenDB() {
		return fpLoginTokenDB;
	}

	public void setFpLoginTokenDB(String fpLoginTokenDB) {
		this.fpLoginTokenDB = fpLoginTokenDB;
	}

	@Override
	public DeviceDTO clone() throws CloneNotSupportedException {

		return (DeviceDTO) super.clone();
	}

	public String getDbHashedDeviceId() {
		return dbHashedDeviceId;
	}

	public void setDbHashedDeviceId(String dbHashedDeviceId) {
		this.dbHashedDeviceId = dbHashedDeviceId;
	}

	public String getDbHashedEwatchToken() {
		return dbHashedEwatchToken;
	}

	public void setDbHashedEwatchToken(String dbHashedEwatchToken) {
		this.dbHashedEwatchToken = dbHashedEwatchToken;
	}

	/**
	 * JIRA: RTLCRPMBDV-442 (DA-527 - SMS & PN Enhancement) Neel: 14-Nov-2016
	 */
	public String getCreditCardNotificationType() {
		return creditCardNotificationType;
	}

	public void setCreditCardNotificationType(String creditCardNotificationType) {
		this.creditCardNotificationType = creditCardNotificationType;
	}

	public String getCommunicationMethod() {
		return communicationMethod;
	}

	public void setCommunicationMethod(String communicationMethod) {
		this.communicationMethod = communicationMethod;
	}

	public boolean isRegistredWithSMS() {
		return isRegistredWithSMS;
	}

	public void setRegistredWithSMS(boolean isRegistredWithSMS) {
		this.isRegistredWithSMS = isRegistredWithSMS;
	}

	public Integer getCreditCardCommunicationType() {
		return creditCardCommunicationType;
	}

	public void setCreditCardCommunicationType(Integer creditCardCommunicationType) {
		this.creditCardCommunicationType = creditCardCommunicationType;
	}

	public boolean isShowOTP() {
		return showOTP;
	}

	public void setShowOTP(boolean showOTP) {
		this.showOTP = showOTP;
	}

	public boolean isShowPnPopup() {
		return showPnPopup;
	}

	public void setShowPnPopup(boolean showPnPopup) {
		this.showPnPopup = showPnPopup;
	}

	public double getChargesAmount() {
		return chargesAmount;
	}

	public void setChargesAmount(double chargesAmount) {
		this.chargesAmount = chargesAmount;
	}

	public String getAlertSmsNoteAmount() {
		return alertSmsNoteAmount;
	}

	public void setAlertSmsNoteAmount(String alertSmsNoteAmount) {
		this.alertSmsNoteAmount = alertSmsNoteAmount;
	}

	public boolean isImalFailedReadingDeviceInfo() {
		return imalFailedReadingDeviceInfo;
	}

	public void setImalFailedReadingDeviceInfo(boolean imalFailedReadingDeviceInfo) {
		this.imalFailedReadingDeviceInfo = imalFailedReadingDeviceInfo;
	}

	public String getChatBotPopupMessage() {
		return chatBotPopupMessage;
	}

	public void setChatBotPopupMessage(String chatBotPopupMessage) {
		this.chatBotPopupMessage = chatBotPopupMessage;
	}

	public String getSessionEncryptionToken() {
		return sessionEncryptionToken;
	}

	public void setSessionEncryptionToken(String sessionEncryptionToken) {
		this.sessionEncryptionToken = sessionEncryptionToken;
	}

	public boolean isShowValidateAlertMsg() {
		return showValidateAlertMsg;
	}

	public void setShowValidateAlertMsg(boolean showValidateAlertMsg) {
		this.showValidateAlertMsg = showValidateAlertMsg;
	}

	public PresentationDTO getPresentationDTO() {
		return presentationDTO;
	}

	public void setPresentationDTO(PresentationDTO presentationDTO) {
		this.presentationDTO = presentationDTO;
	}

	public String getSessionRequestToken() {
		return sessionRequestToken;
	}

	public void setSessionRequestToken(String sessionRequestToken) {
		this.sessionRequestToken = sessionRequestToken;
	}

	public boolean getIsSupportFaceId() {
		return isSupportFaceId;
	}

	public void setIsSupportFaceId(boolean isSupportFaceId) {
		this.isSupportFaceId = isSupportFaceId;
	}

	@Deprecated
	public String getOldAppDeviceToken() {
		return oldAppDeviceToken;
	}

	@Deprecated
	public void setOldAppDeviceToken(String oldAppDeviceToken) {
		this.oldAppDeviceToken = oldAppDeviceToken;
	}

	public String getCheckDeviceToken() {
		return checkDeviceToken;
	}

	public void setCheckDeviceToken(String checkDeviceToken) {
		this.checkDeviceToken = checkDeviceToken;
	}

	public String getGenuineDeviceToken() {
		return genuineDeviceToken;
	}

	public void setGenuineDeviceToken(String genuineDeviceToken) {
		this.genuineDeviceToken = genuineDeviceToken;
	}

	public String getFcmToken() {
		return fcmToken;
	}

	public void setFcmToken(String fcmToken) {
		this.fcmToken = fcmToken;

	}

	public String getAndroidSessionSafetyNetNonce() {
		return androidSessionSafetyNetNonce;
	}

	public void setAndroidSessionSafetyNetNonce(String androidSessionSafetyNetNonce) {
		this.androidSessionSafetyNetNonce = androidSessionSafetyNetNonce;
	}

}