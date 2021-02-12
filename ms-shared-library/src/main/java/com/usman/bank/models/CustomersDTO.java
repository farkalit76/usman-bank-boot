/**
 * @Copyright reserved to bank
 */
package com.usman.bank.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;



/**
 * Description: This class CustomersDTO.java
 *
 * @author vXebiau
 * @date Jul 9, 2019
 * @version 1.0
 *
 */
public class CustomersDTO implements Serializable {

	/**
	 * default serial id
	 */
	protected static final long serialVersionUID = 1L;
	protected Integer custId;
	protected String userName;
	protected String civilId;
	protected String custNameAr;
	protected String custNameEn;
	protected Date dob;
	protected String firstName;
	protected String lastName;
	protected String middleName;

	protected String preferredLang;
	protected Integer custTypeId;
	protected String lastVisitedChannelId;
	protected String mobileNo;
	protected String officeNo;
	protected String faxNo;
	protected Timestamp lastLoginDate;
	protected String gender;
	protected String email;
	protected Date nationalIdExpDate;
	protected Long cif;
	protected String addressOne;
	protected String addressTwo;

	protected String city;
	protected String state;
	protected String zip;
	protected Integer countryId = 0;
	protected String cardHolderName;
	protected Integer nationalityId = 0;
	protected String homePhone;
	protected Integer maritalStatusId = 0;
	protected String titleId;
	protected String personalBankerEmpId;
	protected Integer sitekeyFlag;
	protected String sitekeyLang;
	protected Integer statusId;
	protected Integer lockReasonId;
	protected Integer pwdExpPeriod;
	protected Date pwdExpDate;

	protected Integer timeout;
	protected Integer rankingCode = -1;
	protected String rmOfficerId;
	protected String rmOfficerNameEn;
	protected String rmOfficerMobile;
	protected String rmOfficerEmail;
	protected String spId;
	protected String spNameEn;
	protected String spNameAr;
	protected String rankingDescEn;
	protected String rankingDescAr;
	protected String statusNameEn;
	protected String password;

	protected String allowMobileInquiry;
	protected String murabahaApplicationStatus;
	protected String deviceId;
	protected String deviceStatus;
	protected Boolean deviceIsDefault;

	protected String osName;
	protected String appVersion;
	protected Integer deviceOsVersion;
	protected Integer deviceOsTypeId;

	protected String deviceModel;
	protected Integer isRooted;
	protected String fcmDeviceToken;
	protected String deviceLanguage;

	protected Timestamp recordCreatedDateTime;
	protected Timestamp recordUpdatedDateTime;
	protected String deviceNotificationStatus;
	protected String notificationCenterStatus;
	protected String pnTransactionStatus;
	protected String deviceToken;
	protected Timestamp pnUpdatedDateTime;

	protected Integer nfcDebitEnabled;
	protected String nfcCreditEnabled;
	protected String ewatchStatus;
	protected String ewatchToken;
	protected Timestamp ewatchTokenDateTime;
	protected String ewatchPassCode;
	protected Integer ewatchIsPassCodeRequired;
	protected Integer ewatchWrongPasscodeCounter;
	protected Timestamp ewatchUpdatedDateTime;
	protected String fpLoginStatus;
	protected String fpTransactionStatus;
	protected Timestamp fpUpdatedDateTime;
	protected String fpLoginToken;
	protected Timestamp fpTokenDateTime;
	protected String fpWrongLoginCounter;
	protected String fpTransactionToken;

	protected Integer creditCardNotifType;
	protected String visaCurrentDeviceId;
	protected String visaOldDeviceId;
	protected Integer isMigratedUser;
	protected Integer isCivilidUploaded;
	protected Integer setPinWrongCounter;
	protected String orgNameEn;
	protected String orgNameAr;
	protected Date nextSalaryDate;
	protected Integer isProductsExpanded;
	protected String passportFirstName;
	protected String passportLastName;
	protected String showRewardsArticle;


	public CustomersDTO() {}


	public CustomersDTO(Long cif, Integer statusId, Integer lockReasonId, Integer custId) {
		this.cif =cif;
		this.statusId=statusId;
		this.lockReasonId=lockReasonId;
		this.custId=custId;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getCivilId() {
		return civilId;
	}

	public void setCivilId(String civilId) {
		this.civilId = civilId;
	}

	public String getCustNameAr() {
		return custNameAr;
	}

	public void setCustNameAr(String custNameAr) {
		this.custNameAr = custNameAr;
	}

	public String getCustNameEn() {
		return custNameEn;
	}

	public void setCustNameEn(String custNameEn) {
		this.custNameEn = custNameEn;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPreferredLang() {
		return preferredLang;
	}

	public void setPreferredLang(String preferredLang) {
		this.preferredLang = preferredLang;
	}

	public Integer getCustTypeId() {
		return custTypeId;
	}

	public void setCustTypeId(Integer custTypeId) {
		this.custTypeId = custTypeId;
	}

	public String getLastVisitedChannelId() {
		return lastVisitedChannelId;
	}

	public void setLastVisitedChannelId(String lastVisitedChannelId) {
		this.lastVisitedChannelId = lastVisitedChannelId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getOfficeNo() {
		return officeNo;
	}

	public void setOfficeNo(String officeNo) {
		this.officeNo = officeNo;
	}

	public String getFaxNo() {
		return faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	public Timestamp getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Timestamp lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getNationalIdExpDate() {
		return nationalIdExpDate;
	}

	public void setNationalIdExpDate(Date nationalIdExpDate) {
		this.nationalIdExpDate = nationalIdExpDate;
	}

	public Long getCif() {
		return cif;
	}

	public void setCif(Long cif) {
		this.cif = cif;
	}

	public String getAddressOne() {
		return addressOne;
	}

	public void setAddressOne(String addressOne) {
		this.addressOne = addressOne;
	}

	public String getAddressTwo() {
		return addressTwo;
	}

	public void setAddressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public Integer getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(Integer nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public Integer getMaritalStatusId() {
		return maritalStatusId;
	}

	public void setMaritalStatusId(Integer maritalStatusId) {
		this.maritalStatusId = maritalStatusId;
	}

	public String getTitleId() {
		return titleId;
	}

	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

	public String getPersonalBankerEmpId() {
		return personalBankerEmpId;
	}

	public void setPersonalBankerEmpId(String personalBankerEmpId) {
		this.personalBankerEmpId = personalBankerEmpId;
	}

	public Integer getSitekeyFlag() {
		return sitekeyFlag;
	}

	public void setSitekeyFlag(Integer sitekeyFlag) {
		this.sitekeyFlag = sitekeyFlag;
	}

	public String getSitekeyLang() {
		return sitekeyLang;
	}

	public void setSitekeyLang(String sitekeyLang) {
		this.sitekeyLang = sitekeyLang;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public Integer getLockReasonId() {
		return lockReasonId;
	}

	public void setLockReasonId(Integer lockReasonId) {
		this.lockReasonId = lockReasonId;
	}

	public Integer getPwdExpPeriod() {
		return pwdExpPeriod;
	}

	public void setPwdExpPeriod(Integer pwdExpPeriod) {
		this.pwdExpPeriod = pwdExpPeriod;
	}

	public Date getPwdExpDate() {
		return pwdExpDate;
	}

	public void setPwdExpDate(Date pwdExpDate) {
		this.pwdExpDate = pwdExpDate;
	}

	public Integer getTimeout() {
		return timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}

	public Integer getRankingCode() {
		return rankingCode;
	}

	public void setRankingCode(Integer rankingCode) {
		this.rankingCode = rankingCode;
	}

	public String getRmOfficerId() {
		return rmOfficerId;
	}

	public void setRmOfficerId(String rmOfficerId) {
		this.rmOfficerId = rmOfficerId;
	}

	public String getRmOfficerNameEn() {
		return rmOfficerNameEn;
	}

	public void setRmOfficerNameEn(String rmOfficerNameEn) {
		this.rmOfficerNameEn = rmOfficerNameEn;
	}

	public String getRmOfficerMobile() {
		return rmOfficerMobile;
	}

	public void setRmOfficerMobile(String rmOfficerMobile) {
		this.rmOfficerMobile = rmOfficerMobile;
	}

	public String getRmOfficerEmail() {
		return rmOfficerEmail;
	}

	public void setRmOfficerEmail(String rmOfficerEmail) {
		this.rmOfficerEmail = rmOfficerEmail;
	}

	public String getSpId() {
		return spId;
	}

	public void setSpId(String spId) {
		this.spId = spId;
	}

	public String getSpNameEn() {
		return spNameEn;
	}

	public void setSpNameEn(String spNameEn) {
		this.spNameEn = spNameEn;
	}

	public String getSpNameAr() {
		return spNameAr;
	}

	public void setSpNameAr(String spNameAr) {
		this.spNameAr = spNameAr;
	}

	public String getRankingDescEn() {
		return rankingDescEn;
	}

	public void setRankingDescEn(String rankingDescEn) {
		this.rankingDescEn = rankingDescEn;
	}

	public String getRankingDescAr() {
		return rankingDescAr;
	}

	public void setRankingDescAr(String rankingDescAr) {
		this.rankingDescAr = rankingDescAr;
	}

	public String getStatusNameEn() {
		return statusNameEn;
	}

	public void setStatusNameEn(String statusNameEn) {
		this.statusNameEn = statusNameEn;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAllowMobileInquiry() {
		return allowMobileInquiry;
	}

	public void setAllowMobileInquiry(String allowMobileInquiry) {
		this.allowMobileInquiry = allowMobileInquiry;
	}

	public String getMurabahaApplicationStatus() {
		return murabahaApplicationStatus;
	}

	public void setMurabahaApplicationStatus(String murabahaApplicationStatus) {
		this.murabahaApplicationStatus = murabahaApplicationStatus;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceStatus() {
		return deviceStatus;
	}

	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public Boolean getDeviceIsDefault() {
		return deviceIsDefault;
	}

	public void setDeviceIsDefault(Boolean deviceIsDefault) {
		this.deviceIsDefault = deviceIsDefault;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public Integer getDeviceOsVersion() {
		return deviceOsVersion;
	}

	public void setDeviceOsVersion(Integer deviceOsVersion) {
		this.deviceOsVersion = deviceOsVersion;
	}

	public Integer getDeviceOsTypeId() {
		return deviceOsTypeId;
	}

	public void setDeviceOsTypeId(Integer deviceOsTypeId) {
		this.deviceOsTypeId = deviceOsTypeId;
	}

	public String getDeviceModel() {
		return deviceModel;
	}

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

	public Integer getIsRooted() {
		return isRooted;
	}

	public void setIsRooted(Integer isRooted) {
		this.isRooted = isRooted;
	}

	public String getFcmDeviceToken() {
		return fcmDeviceToken;
	}

	public void setFcmDeviceToken(String fcmDeviceToken) {
		this.fcmDeviceToken = fcmDeviceToken;
	}

	public String getDeviceLanguage() {
		return deviceLanguage;
	}

	public void setDeviceLanguage(String deviceLanguage) {
		this.deviceLanguage = deviceLanguage;
	}

	public Timestamp getRecordCreatedDateTime() {
		return recordCreatedDateTime;
	}

	public void setRecordCreatedDateTime(Timestamp recordCreatedDateTime) {
		this.recordCreatedDateTime = recordCreatedDateTime;
	}

	public Timestamp getRecordUpdatedDateTime() {
		return recordUpdatedDateTime;
	}

	public void setRecordUpdatedDateTime(Timestamp recordUpdatedDateTime) {
		this.recordUpdatedDateTime = recordUpdatedDateTime;
	}

	public String getDeviceNotificationStatus() {
		return deviceNotificationStatus;
	}

	public void setDeviceNotificationStatus(String deviceNotificationStatus) {
		this.deviceNotificationStatus = deviceNotificationStatus;
	}

	public String getNotificationCenterStatus() {
		return notificationCenterStatus;
	}

	public void setNotificationCenterStatus(String notificationCenterStatus) {
		this.notificationCenterStatus = notificationCenterStatus;
	}

	public String getPnTransactionStatus() {
		return pnTransactionStatus;
	}

	public void setPnTransactionStatus(String pnTransactionStatus) {
		this.pnTransactionStatus = pnTransactionStatus;
	}

	public String getDeviceToken() {
		return deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	public Timestamp getPnUpdatedDateTime() {
		return pnUpdatedDateTime;
	}

	public void setPnUpdatedDateTime(Timestamp pnUpdatedDateTime) {
		this.pnUpdatedDateTime = pnUpdatedDateTime;
	}

	public Integer getNfcDebitEnabled() {
		return nfcDebitEnabled;
	}

	public void setNfcDebitEnabled(Integer nfcDebitEnabled) {
		this.nfcDebitEnabled = nfcDebitEnabled;
	}

	public String getNfcCreditEnabled() {
		return nfcCreditEnabled;
	}

	public void setNfcCreditEnabled(String nfcCreditEnabled) {
		this.nfcCreditEnabled = nfcCreditEnabled;
	}

	public String getEwatchStatus() {
		return ewatchStatus;
	}

	public void setEwatchStatus(String ewatchStatus) {
		this.ewatchStatus = ewatchStatus;
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

	public Integer getEwatchIsPassCodeRequired() {
		return ewatchIsPassCodeRequired;
	}

	public void setEwatchIsPassCodeRequired(Integer ewatchIsPassCodeRequired) {
		this.ewatchIsPassCodeRequired = ewatchIsPassCodeRequired;
	}

	public Integer getEwatchWrongPasscodeCounter() {
		return ewatchWrongPasscodeCounter;
	}

	public void setEwatchWrongPasscodeCounter(Integer ewatchWrongPasscodeCounter) {
		this.ewatchWrongPasscodeCounter = ewatchWrongPasscodeCounter;
	}

	public Timestamp getEwatchUpdatedDateTime() {
		return ewatchUpdatedDateTime;
	}

	public void setEwatchUpdatedDateTime(Timestamp ewatchUpdatedDateTime) {
		this.ewatchUpdatedDateTime = ewatchUpdatedDateTime;
	}

	public String getFpLoginStatus() {
		return fpLoginStatus;
	}

	public void setFpLoginStatus(String fpLoginStatus) {
		this.fpLoginStatus = fpLoginStatus;
	}

	public String getFpTransactionStatus() {
		return fpTransactionStatus;
	}

	public void setFpTransactionStatus(String fpTransactionStatus) {
		this.fpTransactionStatus = fpTransactionStatus;
	}

	public Timestamp getFpUpdatedDateTime() {
		return fpUpdatedDateTime;
	}

	public void setFpUpdatedDateTime(Timestamp fpUpdatedDateTime) {
		this.fpUpdatedDateTime = fpUpdatedDateTime;
	}

	public String getFpLoginToken() {
		return fpLoginToken;
	}

	public void setFpLoginToken(String fpLoginToken) {
		this.fpLoginToken = fpLoginToken;
	}

	public Timestamp getFpTokenDateTime() {
		return fpTokenDateTime;
	}

	public void setFpTokenDateTime(Timestamp fpTokenDateTime) {
		this.fpTokenDateTime = fpTokenDateTime;
	}

	public String getFpWrongLoginCounter() {
		return fpWrongLoginCounter;
	}

	public void setFpWrongLoginCounter(String fpWrongLoginCounter) {
		this.fpWrongLoginCounter = fpWrongLoginCounter;
	}

	public String getFpTransactionToken() {
		return fpTransactionToken;
	}

	public void setFpTransactionToken(String fpTransactionToken) {
		this.fpTransactionToken = fpTransactionToken;
	}

	public Integer getCreditCardNotifType() {
		return creditCardNotifType;
	}

	public void setCreditCardNotifType(Integer creditCardNotifType) {
		this.creditCardNotifType = creditCardNotifType;
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

	public Integer getIsMigratedUser() {
		return isMigratedUser;
	}

	public void setIsMigratedUser(Integer isMigratedUser) {
		this.isMigratedUser = isMigratedUser;
	}

	public Integer getIsCivilidUploaded() {
		return isCivilidUploaded;
	}

	public void setIsCivilidUploaded(Integer isCivilidUploaded) {
		this.isCivilidUploaded = isCivilidUploaded;
	}

	public Integer getSetPinWrongCounter() {
		return setPinWrongCounter;
	}

	public void setSetPinWrongCounter(Integer setPinWrongCounter) {
		this.setPinWrongCounter = setPinWrongCounter;
	}

	public String getOrgNameEn() {
		return orgNameEn;
	}

	public void setOrgNameEn(String orgNameEn) {
		this.orgNameEn = orgNameEn;
	}

	public String getOrgNameAr() {
		return orgNameAr;
	}

	public void setOrgNameAr(String orgNameAr) {
		this.orgNameAr = orgNameAr;
	}

	public Date getNextSalaryDate() {
		return nextSalaryDate;
	}

	public void setNextSalaryDate(Date nextSalaryDate) {
		this.nextSalaryDate = nextSalaryDate;
	}

	public Integer getIsProductsExpanded() {
		return isProductsExpanded;
	}

	public void setIsProductsExpanded(Integer isProductsExpanded) {
		this.isProductsExpanded = isProductsExpanded;
	}

	public String getPassportFirstName() {
		return passportFirstName;
	}

	public void setPassportFirstName(String passportFirstName) {
		this.passportFirstName = passportFirstName;
	}

	public String getPassportLastName() {
		return passportLastName;
	}

	public void setPassportLastName(String passportLastName) {
		this.passportLastName = passportLastName;
	}

	public String getShowRewardsArticle() {
		return showRewardsArticle;
	}

	public void setShowRewardsArticle(String showRewardsArticle) {
		this.showRewardsArticle = showRewardsArticle;
	}

}
