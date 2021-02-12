package com.usman.bank.models;

import java.io.Serializable;

public class GlobalConfigurationDTO implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;
	private Boolean showLimitsUtilization;
	private Boolean showCaptcha;
	private Integer siteKeyImagesNo;
	private Boolean showLimitsDetails;
	private Integer passwordExpirationPeriod;
	private Integer otpDigitts;
	private Integer otpExpirationPeriod;
	private Integer userAutheticationType;
	private String appsMailList;
	private String casesMailList;
	private String outlookMailList;
	private Boolean resetSiteKey;
	private Integer siteKeyquestionsStyle;
	private Boolean isOTPEnabled;
	private String deviceSupportConfig;
	// private Map<String, ApplicationVersionInfoDTO> applicationVersionInfo ;
	// private ApplicationVersionInfoDTO iOSAppVersionSupport;
	// private ApplicationVersionInfoDTO AndroidAppVersionSupport;
	private String travelNotificationMailList;
	/*
	 * CR:DA-988: Travel Plan Cancel Option Notification
	 */
	private String travelNotificationEndOfTripMailList;
	private String premiumAccGlCode;
	private String fundsMailList;
	private Double intrTransferFeesOUR;
	private String travelNotificationPDFPassword;
	private String travelNotificationCcMailList;
	private String callCenterMailList;
	private String registrationMethod;
	private Integer otpMinutes;
	private Integer ewatchTokenValidationPeriod;
	private Integer ewatchAccountHistoryDays;
	private Integer ewatchFinanceHistoryDays;
	private Integer ewatchCardsHistoryDays;
	private Integer cvvseconds;
	private Boolean isCIDCheckingEnabled;
	private Integer promotionCounterStyle;
	private Integer fingerprintLoginTokenPeriod;
	private boolean isReposneEncrypted;
	private Boolean isLocalBeneficiariesOTPEnabled;
	private Boolean isusmanBeneficiariesOTPEnabled;
	private Boolean isInternationalBeneficiariesOTPEnabled;

	private Boolean isWUBeneficiariesOTPEnabled;
	private Boolean isUtilityPaymentBeneficiariesOTPEnabled;
	private int maxToSameCID;
	private int maxToSameCIDPerAllCust;
	private Boolean isShakeAndSaveEnabled;
	private Boolean disableCreditcardPayment;
	private String numberOfDays;
	private String itqanMailList;
	private Integer cardPaymentDecimalPlaces;
	private Double payMeExpirationPeriodHours;
	private Integer payMeURLType;

	private Double multiplePayMeExpirationPeriodHours;

	private Integer schoolPaymentAllowMutipleStudents;
	private Boolean wuCash4MeOTP;
	private Integer noOfBenfInqueryPerSession;
	private Integer noOfBenfInqueryPerDay;
	// NFC Changes
	private Integer nfcDebitTokenPaymentExpiryInMinutes;
	private Integer nfcInfosysTokenExpiryInMinutes;
	private Boolean nfcAllowMultipleDebitCards;
	private boolean allowHeaderSignatureChecking;

	// DA-632:Customer Email Updating
	private Integer emailVerificationLifeTimeInHours;

	/*
	 * JIRA: RTLCRPMBDV-451 (DA-530 - Intermediate Bank Approval) [Neel 03-11-2016:
	 * Changes made for parameterizing Intermediate Bank Approval with
	 * Enable/Disable Flag]
	 */
	private Boolean autoIntermediateBankApprovalEnabled;

	// If the key is enabled, replace the sql keyword occurences in json. If
	// disabled, just log the information
	private Boolean replaceSQLKeysinXSS;
	/*
	 * JIRA: RTLCRPMBDV-623 (New Murabaha Offers MVP Tasks) [Neel 15-02-2017: All
	 * configuration values for the new Murabaha Deals to be offered on iPhone]
	 * 
	 */
	// This is the video url that will be displayed on app once the customer clicks
	// on More info on offered Muabaha deal
	private String murabahaVideoURLEnglish;
	private String murabahaVideoURLArabic;
	private Double minTransferAmountRequiredOTP;
	private Double minTransferAmountRequiredApproval;
	private Integer whatsAppOption;
	private String custCareEmailList;// This is used for sending notification to customer care that a mobile number
										// update request has been made by the user
	private String softLaunchCIFsList;

	// hotfix:RTLCRPMBDV-1264 : pinless
	private double pinlessAmount;
	private Integer setPinAlowedAttempts;

	private String notificationsCounter;
	// surendra
	private String openAccountTermsAndConditionLink;

	private String murbahaBranchAppointmentCCList;

	private String liveChatURL;
	private String liveChatURLAr;
	private String liveChatURLEn;
	private int iOSHijryDays;
	private int androidHijryDays;
	private String genesysUrl;
	private String androidNonce;

	private Boolean msa3edPublicAccessEnabled;
	private Boolean msa3edProtectedAccessEnabled;
	private Boolean showVoip;
	private String whatsappScenarioKey;
	private String infobipAuthHeader;
	private Boolean forceVoipChecking;

	private Boolean showOnBoardingServiceButton;

	private Integer nonBBYNCustomerOTPExpirationPeriod;
	private Integer nonBBYNCustomerOTPNumberOfAttemps;
	private Integer nonBBYNCustomerOTPNumberOfMobileNumbers;

	@Override
	public GlobalConfigurationDTO clone() throws CloneNotSupportedException {
		return (GlobalConfigurationDTO) super.clone();
	}

	public String getNotificationsCounter() {
		return notificationsCounter;
	}

	public void setNotificationsCounter(String notificationsCounter) {
		this.notificationsCounter = notificationsCounter;
	}

	public Boolean getIsCIDCheckingEnabled() {
		return isCIDCheckingEnabled;
	}

	public void setIsCIDCheckingEnabled(Boolean isCIDCheckingEnabled) {
		this.isCIDCheckingEnabled = isCIDCheckingEnabled;
	}

	public Boolean getIsInternationalBeneficiariesOTPEnabled() {
		return isInternationalBeneficiariesOTPEnabled;
	}

	public void setIsInternationalBeneficiariesOTPEnabled(Boolean isInternationalBeneficiariesOTPEnabled) {
		this.isInternationalBeneficiariesOTPEnabled = isInternationalBeneficiariesOTPEnabled;
	}

	public Boolean getIsLocalBeneficiariesOTPEnabled() {
		return isLocalBeneficiariesOTPEnabled;
	}

	public void setIsLocalBeneficiariesOTPEnabled(Boolean isLocalBeneficiariesOTPEnabled) {
		this.isLocalBeneficiariesOTPEnabled = isLocalBeneficiariesOTPEnabled;
	}

	public Boolean getIsusmanBeneficiariesOTPEnabled() {
		return isusmanBeneficiariesOTPEnabled;
	}

	public void setIsusmanBeneficiariesOTPEnabled(Boolean isusmanBeneficiariesOTPEnabled) {
		this.isusmanBeneficiariesOTPEnabled = isusmanBeneficiariesOTPEnabled;
	}

	public boolean isReposneEncrypted() {
		return isReposneEncrypted;
	}

	public void setReposneEncrypted(boolean isReposneEncrypted) {
		this.isReposneEncrypted = isReposneEncrypted;
	}

	public Boolean getIsWUBeneficiariesOTPEnabled() {
		return isWUBeneficiariesOTPEnabled;
	}

	public void setIsWUBeneficiariesOTPEnabled(Boolean isWUBeneficiariesOTPEnabled) {
		this.isWUBeneficiariesOTPEnabled = isWUBeneficiariesOTPEnabled;
	}

	public Boolean getIsUtilityPaymentBeneficiariesOTPEnabled() {
		return isUtilityPaymentBeneficiariesOTPEnabled;
	}

	public void setIsUtilityPaymentBeneficiariesOTPEnabled(Boolean isUtilityPaymentBeneficiariesOTPEnabled) {
		this.isUtilityPaymentBeneficiariesOTPEnabled = isUtilityPaymentBeneficiariesOTPEnabled;
	}

	public Boolean getIsOTPEnabled() {
		return isOTPEnabled;
	}

	public void setIsOTPEnabled(Boolean isOTPEnabled) {
		this.isOTPEnabled = isOTPEnabled;
	}

	public Integer getSiteKeyquestionsStyle() {
		return siteKeyquestionsStyle;
	}

	public void setSiteKeyquestionsStyle(Integer siteKeyquestionsStyle) {
		this.siteKeyquestionsStyle = siteKeyquestionsStyle;
	}

	public Boolean getResetSiteKey() {
		return resetSiteKey;
	}

	public void setResetSiteKey(Boolean resetSiteKey) {
		this.resetSiteKey = resetSiteKey;
	}

	public String getAppsMailList() {
		return appsMailList;
	}

	public void setAppsMailList(String appsMailList) {
		this.appsMailList = appsMailList;
	}

	public String getCasesMailList() {
		return casesMailList;
	}

	public void setCasesMailList(String casesMailList) {
		this.casesMailList = casesMailList;
	}

	public Integer getOtpDigitts() {
		return otpDigitts;
	}

	public void setOtpDigitts(Integer otpDigitts) {
		this.otpDigitts = otpDigitts;
	}

	public Integer getOtpExpirationPeriod() {
		return otpExpirationPeriod;
	}

	public void setOtpExpirationPeriod(Integer otpExpirationPeriod) {
		this.otpExpirationPeriod = otpExpirationPeriod;
	}

	public Boolean getShowCaptcha() {
		return showCaptcha;
	}

	public void setShowCaptcha(Boolean showCaptcha) {
		this.showCaptcha = showCaptcha;
	}

	public Integer getSiteKeyImagesNo() {
		return siteKeyImagesNo;
	}

	public void setSiteKeyImagesNo(Integer siteKeyImagesNo) {
		this.siteKeyImagesNo = siteKeyImagesNo;
	}

	public Boolean getShowLimitsUtilization() {
		return showLimitsUtilization;
	}

	public void setShowLimitsUtilization(Boolean showLimitsUtilization) {
		this.showLimitsUtilization = showLimitsUtilization;
	}

	public Boolean getShowLimitsDetails() {
		return showLimitsDetails;
	}

	public void setShowLimitsDetails(Boolean showLimitsDetails) {
		this.showLimitsDetails = showLimitsDetails;
	}

	public Integer getPasswordExpirationPeriod() {
		return passwordExpirationPeriod;
	}

	public void setPasswordExpirationPeriod(Integer passwordExpirationPeriod) {
		this.passwordExpirationPeriod = passwordExpirationPeriod;
	}

	public Integer getUserAutheticationType() {
		return userAutheticationType;
	}

	public void setUserAutheticationType(Integer userAutheticationType) {
		this.userAutheticationType = userAutheticationType;
	}

	public void setOutlookMailList(String outlookMailList) {
		this.outlookMailList = outlookMailList;
	}

	public String getOutlookMailList() {
		return outlookMailList;
	}

	public int getMaxToSameCID() {
		return maxToSameCID;
	}

	public void setMaxToSameCID(int maxToSameCID) {
		this.maxToSameCID = maxToSameCID;
	}

	public int getMaxToSameCIDPerAllCust() {
		return maxToSameCIDPerAllCust;
	}

	public void setMaxToSameCIDPerAllCust(int maxToSameCIDPerAllCust) {
		this.maxToSameCIDPerAllCust = maxToSameCIDPerAllCust;
	}

	public String getDeviceSupportConfig() {
		return deviceSupportConfig;
	}

	public void setDeviceSupportConfig(String deviceSupportConfig) {
		this.deviceSupportConfig = deviceSupportConfig;
	}

	public void setPremiumAccGlCode(String premiumAccGlCode) {
		this.premiumAccGlCode = premiumAccGlCode;
	}

	public String getPremiumAccGlCode() {
		return premiumAccGlCode;
	}

	public void setFundsMailList(String fundsMailList) {
		this.fundsMailList = fundsMailList;
	}

	public String getFundsMailList() {
		return fundsMailList;
	}

	public void setIsShakeAndSaveEnabled(Boolean isShakeAndSaveEnabled) {
		this.isShakeAndSaveEnabled = isShakeAndSaveEnabled;
	}

	public Boolean getIsShakeAndSaveEnabled() {
		return isShakeAndSaveEnabled;
	}

	public void setIntrTransferFeesOUR(Double intrTransferFeesOUR) {
		this.intrTransferFeesOUR = intrTransferFeesOUR;
	}

	public Double getIntrTransferFeesOUR() {
		return intrTransferFeesOUR;
	}

	public void setTravelNotificationPDFPassword(String travelNotificationPDFPassword) {
		this.travelNotificationPDFPassword = travelNotificationPDFPassword;
	}

	public String getTravelNotificationPDFPassword() {
		return travelNotificationPDFPassword;
	}

	public void setTravelNotificationCcMailList(String travelNotificationCcMailList) {
		this.travelNotificationCcMailList = travelNotificationCcMailList;
	}

	public String getTravelNotificationCcMailList() {
		return travelNotificationCcMailList;
	}

	public void setTravelNotificationMailList(String travelNotificationMailList) {
		this.travelNotificationMailList = travelNotificationMailList;
	}

	public String getTravelNotificationMailList() {
		return travelNotificationMailList;

	}

	public String getTravelNotificationEndOfTripMailList() {
		return travelNotificationEndOfTripMailList;
	}

	public void setTravelNotificationEndOfTripMailList(String travelNotificationEndOfTripMailList) {
		this.travelNotificationEndOfTripMailList = travelNotificationEndOfTripMailList;
	}

	public String getRegistrationMethod() {
		return registrationMethod;
	}

	public void setRegistrationMethod(String registrationMethod) {
		this.registrationMethod = registrationMethod;
	}

	public Boolean getDisableCreditcardPayment() {
		return disableCreditcardPayment;
	}

	public void setDisableCreditcardPayment(Boolean disableCreditcardPayment) {
		this.disableCreditcardPayment = disableCreditcardPayment;
	}

	public void setNumberOfDays(String numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public String getNumberOfDays() {
		return numberOfDays;
	}

	public void setOtpMinutes(Integer otpMinutes) {
		this.otpMinutes = otpMinutes;
	}

	public Integer getOtpMinutes() {
		return otpMinutes;

	}

	public void setCvvseconds(Integer cvvseconds) {
		this.cvvseconds = cvvseconds;
	}

	public Integer getCvvseconds() {
		return cvvseconds;
	}

	public Integer getEwatchTokenValidationPeriod() {
		return ewatchTokenValidationPeriod;
	}

	public void setEwatchTokenValidationPeriod(Integer ewatchTokenValidationPeriod) {
		this.ewatchTokenValidationPeriod = ewatchTokenValidationPeriod;
	}

	public Integer getEwatchAccountHistoryDays() {
		return ewatchAccountHistoryDays;
	}

	public void setEwatchAccountHistoryDays(Integer ewatchAccountHistoryDays) {
		this.ewatchAccountHistoryDays = ewatchAccountHistoryDays;
	}

	public Integer getEwatchFinanceHistoryDays() {
		return ewatchFinanceHistoryDays;
	}

	public void setEwatchFinanceHistoryDays(Integer ewatchFinanceHistoryDays) {
		this.ewatchFinanceHistoryDays = ewatchFinanceHistoryDays;
	}

	public Integer getEwatchCardsHistoryDays() {
		return ewatchCardsHistoryDays;
	}

	public void setEwatchCardsHistoryDays(Integer ewatchCardsHistoryDays) {
		this.ewatchCardsHistoryDays = ewatchCardsHistoryDays;
	}

	public Integer getFingerprintLoginTokenPeriod() {
		return fingerprintLoginTokenPeriod;
	}

	public void setFingerprintLoginTokenPeriod(Integer fingerprintLoginTokenPeriod) {
		this.fingerprintLoginTokenPeriod = fingerprintLoginTokenPeriod;
	}

	public Integer getPromotionCounterStyle() {
		return promotionCounterStyle;
	}

	public void setPromotionCounterStyle(Integer promotionCounterStyle) {
		this.promotionCounterStyle = promotionCounterStyle;
	}

	public String getItqanMailList() {
		return itqanMailList;
	}

	public void setItqanMailList(String itqanMailList) {
		this.itqanMailList = itqanMailList;
	}

	public Integer getCardPaymentDecimalPlaces() {
		return cardPaymentDecimalPlaces;
	}

	public void setCardPaymentDecimalPlaces(Integer cardPaymentDecimalPlaces) {
		this.cardPaymentDecimalPlaces = cardPaymentDecimalPlaces;
	}

	/*
	 * public Integer getPayMeExpirationPeriodHours() { return
	 * payMeExpirationPeriodHours; } public void
	 * setPayMeExpirationPeriodHours(Integer payMeExpirationPeriodHours) {
	 * this.payMeExpirationPeriodHours = payMeExpirationPeriodHours; }
	 */

	public Integer getPayMeURLType() {
		return payMeURLType;
	}

	public Double getPayMeExpirationPeriodHours() {
		return payMeExpirationPeriodHours;
	}

	public void setPayMeExpirationPeriodHours(Double payMeExpirationPeriodHours) {
		this.payMeExpirationPeriodHours = payMeExpirationPeriodHours;
	}

	public void setPayMeURLType(Integer payMeURLType) {
		this.payMeURLType = payMeURLType;
	}

	public Integer getSchoolPaymentAllowMutipleStudents() {
		return schoolPaymentAllowMutipleStudents;
	}

	public void setSchoolPaymentAllowMutipleStudents(Integer schoolPaymentAllowMutipleStudents) {
		this.schoolPaymentAllowMutipleStudents = schoolPaymentAllowMutipleStudents;
	}

	public void setWuCash4MeOTP(Boolean wuCash4MeOTP) {
		this.wuCash4MeOTP = wuCash4MeOTP;
	}

	public Boolean getWuCash4MeOTP() {
		return wuCash4MeOTP;
	}

	public Integer getNoOfBenfInqueryPerSession() {
		return noOfBenfInqueryPerSession;
	}

	public void setNoOfBenfInqueryPerSession(Integer noOfBenfInqueryPerSession) {
		this.noOfBenfInqueryPerSession = noOfBenfInqueryPerSession;
	}

	public Integer getNoOfBenfInqueryPerDay() {
		return noOfBenfInqueryPerDay;
	}

	public void setNoOfBenfInqueryPerDay(Integer noOfBenfInqueryPerDay) {
		this.noOfBenfInqueryPerDay = noOfBenfInqueryPerDay;
	}

	public Integer getNfcDebitTokenPaymentExpiryInMinutes() {
		return nfcDebitTokenPaymentExpiryInMinutes;
	}

	public void setNfcDebitTokenPaymentExpiryInMinutes(Integer nfcDebitTokenPaymentExpiryInMinutes) {
		this.nfcDebitTokenPaymentExpiryInMinutes = nfcDebitTokenPaymentExpiryInMinutes;
	}

	public Integer getNfcInfosysTokenExpiryInMinutes() {
		return nfcInfosysTokenExpiryInMinutes;
	}

	public void setNfcInfosysTokenExpiryInMinutes(Integer nfcInfosysTokenExpiryInMinutes) {
		this.nfcInfosysTokenExpiryInMinutes = nfcInfosysTokenExpiryInMinutes;
	}

	public Boolean getNfcAllowMultipleDebitCards() {
		return nfcAllowMultipleDebitCards;
	}

	public void setNfcAllowMultipleDebitCards(Boolean nfcAllowMultipleDebitCards) {
		this.nfcAllowMultipleDebitCards = nfcAllowMultipleDebitCards;
	}

	/*
	 * public Boolean getSchoolPaymentAllowMutipleStudents() { return
	 * schoolPaymentAllowMutipleStudents; } public void
	 * setSchoolPaymentAllowMutipleStudents( Boolean
	 * schoolPaymentAllowMutipleStudents) { this.schoolPaymentAllowMutipleStudents =
	 * schoolPaymentAllowMutipleStudents; }
	 */

	/*
	 * JIRA: RTLCRPMBDV-451 (DA-530 - Intermediate Bank Approval) [Neel 03-11-2016:
	 * Changes made for parameterizing Intermediate Bank Approval with
	 * Enable/Disable Flag]
	 */
	public Boolean getAutoIntermediateBankApprovalEnabled() {
		// temporarily fix to make sure if this is case related thing, please check the
		// approval in RTLIBSUPRT-435 Failed in Adding Inernational benefciary
		autoIntermediateBankApprovalEnabled = true;
		return autoIntermediateBankApprovalEnabled;
	}

	public void setAutoIntermediateBankApprovalEnabled(Boolean autoIntermediateBankApprovalEnabled) {
		this.autoIntermediateBankApprovalEnabled = autoIntermediateBankApprovalEnabled;
	}

	public String getCallCenterMailList() {
		return callCenterMailList;
	}

	public void setCallCenterMailList(String callCenterMailList) {
		this.callCenterMailList = callCenterMailList;
	}

	public Integer getEmailVerificationLifeTimeInHours() {
		return emailVerificationLifeTimeInHours;
	}

	public void setEmailVerificationLifeTimeInHours(Integer emailVerificationLifeTimeInHours) {
		this.emailVerificationLifeTimeInHours = emailVerificationLifeTimeInHours;
	}

	public Boolean getReplaceSQLKeysinXSS() {
		return replaceSQLKeysinXSS;
	}

	public void setReplaceSQLKeysinXSS(Boolean replaceSQLKeysinXSS) {
		this.replaceSQLKeysinXSS = replaceSQLKeysinXSS;
	}

	/*
	 * JIRA: RTLCRPMBDV-623 (New Murabaha Offers MVP Tasks) [Neel 15-02-2017: All
	 * configuration values for the new Murabaha Deals to be offered on iPhone]
	 * 
	 */
	public String getMurabahaVideoURLEnglish() {
		return murabahaVideoURLEnglish;
	}

	public void setMurabahaVideoURLEnglish(String murabahaVideoURLEnglish) {
		this.murabahaVideoURLEnglish = murabahaVideoURLEnglish;
	}

	public String getMurabahaVideoURLArabic() {
		return murabahaVideoURLArabic;
	}

	public void setMurabahaVideoURLArabic(String murabahaVideoURLArabic) {
		this.murabahaVideoURLArabic = murabahaVideoURLArabic;
	}

	public Double getMinTransferAmountRequiredOTP() {
		return minTransferAmountRequiredOTP;
	}

	public void setMinTransferAmountRequiredOTP(Double minTransferAmountRequiredOTP) {
		this.minTransferAmountRequiredOTP = minTransferAmountRequiredOTP;
	}

	public Double getMinTransferAmountRequiredApproval() {
		return minTransferAmountRequiredApproval;
	}

	public void setMinTransferAmountRequiredApproval(Double minTransferAmountRequiredApproval) {
		this.minTransferAmountRequiredApproval = minTransferAmountRequiredApproval;
	}

	public Integer getWhatsAppOption() {
		return whatsAppOption;
	}

	public void setWhatsAppOption(Integer whatsAppOption) {
		this.whatsAppOption = whatsAppOption;
	}

	public String getCustCareEmailList() {
		return custCareEmailList;
	}

	public void setCustCareEmailList(String custCareEmailList) {
		this.custCareEmailList = custCareEmailList;
	}

	public double getPinlessAmount() {
		return pinlessAmount;
	}

	public void setPinlessAmount(double pinlessAmount) {
		this.pinlessAmount = pinlessAmount;
	}

	public Integer getSetPinAlowedAttempts() {
		return setPinAlowedAttempts;
	}

	public void setSetPinAlowedAttempts(Integer setPinAlowedAttempts) {
		this.setPinAlowedAttempts = setPinAlowedAttempts;
	}

	public String getOpenAccountTermsAndConditionLink() {
		return openAccountTermsAndConditionLink;
	}

	public void setOpenAccountTermsAndConditionLink(String openAccountTermsAndConditionLink) {
		this.openAccountTermsAndConditionLink = openAccountTermsAndConditionLink;
	}

	public Double getMultiplePayMeExpirationPeriodHours() {
		return multiplePayMeExpirationPeriodHours;
	}

	public void setMultiplePayMeExpirationPeriodHours(Double multiplePayMeExpirationPeriodHours) {
		this.multiplePayMeExpirationPeriodHours = multiplePayMeExpirationPeriodHours;
	}

	public String getMurbahaBranchAppointmentCCList() {
		return murbahaBranchAppointmentCCList;
	}

	public void setMurbahaBranchAppointmentCCList(String murbahaBranchAppointmentCCList) {
		this.murbahaBranchAppointmentCCList = murbahaBranchAppointmentCCList;
	}

//	public Map<String, ApplicationVersionInfoDTO> getApplicationVersionInfo() {
//		return applicationVersionInfo;
//	}
//	public void setApplicationVersionInfo(Map<String, ApplicationVersionInfoDTO> applicationVersionInfo) {
//		this.applicationVersionInfo = applicationVersionInfo;
//	}
//	public ApplicationVersionInfoDTO getiOSAppVersionSupport() {
//		return iOSAppVersionSupport;
//	}
//	public void setiOSAppVersionSupport(
//			ApplicationVersionInfoDTO iOSAppVersionSupport) {
//		this.iOSAppVersionSupport = iOSAppVersionSupport;
//	}
//	public ApplicationVersionInfoDTO getAndroidAppVersionSupport() {
//		return AndroidAppVersionSupport;
//	}
//	public void setAndroidAppVersionSupport(
//			ApplicationVersionInfoDTO androidAppVersionSupport) {
//		AndroidAppVersionSupport = androidAppVersionSupport;
//	}
	public String getSoftLaunchCIFsList() {
		return softLaunchCIFsList;
	}

	public void setSoftLaunchCIFsList(String softLaunchCIFsList) {
		this.softLaunchCIFsList = softLaunchCIFsList;
	}

	public String getLiveChatURL() {
		return liveChatURL;
	}

	public void setLiveChatURL(String liveChatURL) {
		this.liveChatURL = liveChatURL;
	}

	public int getiOSHijryDays() {
		return iOSHijryDays;
	}

	public void setiOSHijryDays(int iOSHijryDays) {
		this.iOSHijryDays = iOSHijryDays;
	}

	public int getAndroidHijryDays() {
		return androidHijryDays;
	}

	public void setAndroidHijryDays(int androidHijryDays) {
		this.androidHijryDays = androidHijryDays;
	}

	public String getLiveChatURLAr() {
		return liveChatURLAr;
	}

	public void setLiveChatURLAr(String liveChatURLAr) {
		this.liveChatURLAr = liveChatURLAr;
	}

	public String getLiveChatURLEn() {
		return liveChatURLEn;
	}

	public void setLiveChatURLEn(String liveChatURLEn) {
		this.liveChatURLEn = liveChatURLEn;
	}

	public Boolean getMsa3edPublicAccessEnabled() {
		return msa3edPublicAccessEnabled;
	}

	public void setMsa3edPublicAccessEnabled(Boolean msa3edPublicAccessEnabled) {
		this.msa3edPublicAccessEnabled = msa3edPublicAccessEnabled;
	}

	public Boolean getMsa3edProtectedAccessEnabled() {
		return msa3edProtectedAccessEnabled;
	}

	public void setMsa3edProtectedAccessEnabled(Boolean msa3edProtectedAccessEnabled) {
		this.msa3edProtectedAccessEnabled = msa3edProtectedAccessEnabled;
	}

	public String getGenesysUrl() {
		return genesysUrl;
	}

	public void setGenesysUrl(String genesysUrl) {
		this.genesysUrl = genesysUrl;
	}

	public boolean isAllowHeaderSignatureChecking() {
		return allowHeaderSignatureChecking;
	}

	public void setAllowHeaderSignatureChecking(boolean allowHeaderSignatureChecking) {
		this.allowHeaderSignatureChecking = allowHeaderSignatureChecking;
	}

	public String getAndroidNonce() {
		return androidNonce;
	}

	public void setAndroidNonce(String androidNonce) {
		this.androidNonce = androidNonce;
	}

	public Boolean getShowOnBoardingServiceButton() {
		return showOnBoardingServiceButton;
	}

	public void setShowOnBoardingServiceButton(Boolean showOnBoardingServiceButton) {
		this.showOnBoardingServiceButton = showOnBoardingServiceButton;
	}

	public Integer getNonBBYNCustomerOTPExpirationPeriod() {
		return nonBBYNCustomerOTPExpirationPeriod;
	}

	public void setNonBBYNCustomerOTPExpirationPeriod(Integer nonBBYNCustomerOTPExpirationPeriod) {
		this.nonBBYNCustomerOTPExpirationPeriod = nonBBYNCustomerOTPExpirationPeriod;
	}

	public Boolean getShowVoip() {
		return showVoip;
	}

	public void setShowVoip(Boolean showVoip) {
		this.showVoip = showVoip;
	}

	public String getWhatsappScenarioKey() {
		return whatsappScenarioKey;
	}

	public void setWhatsappScenarioKey(String whatsappScenarioKey) {
		this.whatsappScenarioKey = whatsappScenarioKey;
	}

	public String getInfobipAuthHeader() {
		return infobipAuthHeader;
	}

	public void setInfobipAuthHeader(String infobipAuthHeader) {
		this.infobipAuthHeader = infobipAuthHeader;
	}

	public Boolean getForceVoipChecking() {
		return forceVoipChecking;
	}

	public void setForceVoipChecking(Boolean forceVoipChecking) {
		this.forceVoipChecking = forceVoipChecking;
	}

	public Integer getNonBBYNCustomerOTPNumberOfAttemps() {
		return nonBBYNCustomerOTPNumberOfAttemps;
	}

	public void setNonBBYNCustomerOTPNumberOfAttemps(Integer nonBBYNCustomerOTPNumberOfAttemps) {
		this.nonBBYNCustomerOTPNumberOfAttemps = nonBBYNCustomerOTPNumberOfAttemps;
	}

	public Integer getNonBBYNCustomerOTPNumberOfMobileNumbers() {
		return nonBBYNCustomerOTPNumberOfMobileNumbers;
	}

	public void setNonBBYNCustomerOTPNumberOfMobileNumbers(Integer nonBBYNCustomerOTPNumberOfMobileNumbers) {
		this.nonBBYNCustomerOTPNumberOfMobileNumbers = nonBBYNCustomerOTPNumberOfMobileNumbers;
	}

}
