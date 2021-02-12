/**
 * @Copyright reserved to bank
 */
package com.usman.bank.models;

import java.io.Serializable;
import java.util.Date;

/**
 * Description: This class AccountDTO.java
 *
 * @author vXebiau
 * @date Jul 9, 2019
 * @version 1.0
 *
 */
public class AccountDTO implements Serializable, Comparable<AccountDTO> {

	/**
	 * serial version id
	 */
	private static final long serialVersionUID = 1L;

	public static final int ACCOUNTS_AND_FIXED_DEPOSIT = -1;
	public static final int DEPOSITE_ACCOUNT = 1;
	public static final int DEPOSITE_FIXED_ACCOUNT = 2;

	private Integer objectTypeId;
	private String accountType;
	private String accountTypeCode;
	private String accountTypeDesc;
	private String accountTypeDescArab;
	private String currencyDescEng;
	private String currencyDescArab;
	private Double minimumOpenBal;

	private Integer currencyCode;
	private String ibanNumber;
	private Date openDate;
	private Double cvAvailableBalance;
	private Double cvBalance;
	private Double fcAvailableBalance;
	private Double fcBalance;
	private Double holdAmount;
	private Integer branchCode;
	private String glCode;
	private String localizedGLName;
	private String glNameAr;
	private String glNameEn;
	private String glName;
	private String briefName;
	private String briefNameAr;
	private String briefNameEn;
	private String longName;
	private String longNameAr;
	private String longNameEn;
	private String status;
	private CurrencyDTO currency;
	private ProductPreferenceDTO preference;
	private String accountNumber; // add_ref
	private Integer slNo = 0;
	private String cifNo;
	private String formattedAvailableBalance;
	private String formattedCurrentBalance;
	private String formattedAvailableBalanceKWD;
	private String formattedHoldAmount;
	private String additionalRef;
	private String transferTrxNo;
	private String hofTrxNo;
	private String pointRate;
	private boolean showRate;
	private Date maturityDate;
	private String debitAvailBal;
	private String availBal;
	private String currentAccntBalance;
	private String accountName;
	private String arabicAccntName;
	private String errorCode;
	private String errorDes;
	private String countryCode;
	private String ibanRequire;
	private String ibanLength;
	private String ibanDetails;
	private String countryISO;

	// Additioanl attribute for fixed deposite account
	private Date branchDate;
	private Date lastActivityDate;
	private Date lastDepositeDate;
	private Double lastDepositeAmount;
	private String autoRenewal;
	private String branchName;
	private String fixedMaturityType;
	private Double expectedProfitRate;
	private Integer tenor;
	private String formattedTenure;
	private String profitAccountNumber;
	private Boolean isEntitledtoViewCheuqeImage;

	private String releaseDate;
	private String valueDate;
	private String cvAmount;
	private String holdReason;
	private String createdBy;
	private String reasonDesc;

	/* These Properties for Share Account Details */
	/* BEGIN */
	private String bankName;
	private String swiftCode;
	private String bankAddress;
	private String bankCountry;

	/* END */

	/**
	 * JIRA: RTLCRPMBDV-441 (DA-550 - Card Issuance CR Changes) Neel: 24-Jan-2017
	 */
	private Boolean isEligibleForCardIssuance;
	private Boolean isLinkedAccount;
	private String customercode;
	private Date dateOfBirth;
	private String accountId;
	private Integer accountStatusId;

	public AccountDTO() {
	}

	public AccountDTO(String accountId, String accountNumber, Double cvAvailableBalance, Double cvBalance) {
		this.accountId = accountId;
		this.accountNumber = accountNumber;
		this.cvAvailableBalance = cvAvailableBalance;
		this.cvBalance = cvBalance;
	}

	public String getCustomercode() {
		return customercode;
	}

	public void setCustomercode(String customercode) {
		this.customercode = customercode;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Integer getAccountStatusId() {
		return accountStatusId;
	}

	public void setAccountStatusId(Integer accountStatusId) {
		this.accountStatusId = accountStatusId;
	}

	public String getBriefName() {
		return briefName;
	}

	public void setBriefName(String briefName) {
		this.briefName = briefName;
	}

	public String getLongName() {
		return longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public String getGlName() {
		return glName;
	}

	public void setGlName(String glName) {
		this.glName = glName;
	}

	public String getCifNo() {
		return cifNo;
	}

	public void setCifNo(String cifNo) {
		this.cifNo = cifNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Integer getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(Integer currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getIbanNumber() {
		return ibanNumber;
	}

	public void setIbanNumber(String ibanNumber) {
		this.ibanNumber = ibanNumber;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public Double getCvAvailableBalance() {
		return cvAvailableBalance;
	}

	public void setCvAvailableBalance(Double cvAvailableBalance) {
		this.cvAvailableBalance = cvAvailableBalance;
	}

	public Double getCvBalance() {
		return cvBalance;
	}

	public void setCvBalance(Double cvBalance) {
		this.cvBalance = cvBalance;
	}

	public Double getFcAvailableBalance() {
		return fcAvailableBalance;
	}

	public void setFcAvailableBalance(Double fcAvailableBalance) {
		this.fcAvailableBalance = fcAvailableBalance;
	}

	public Double getFcBalance() {
		return fcBalance;
	}

	public void setFcBalance(Double fcBalance) {
		this.fcBalance = fcBalance;
	}

	public Double getHoldAmount() {
		return holdAmount;
	}

	public void setHoldAmount(Double holdAmount) {
		this.holdAmount = holdAmount;
	}

	public Integer getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(Integer branchCode) {
		this.branchCode = branchCode;
	}

	public String getGlNameAr() {
		return glNameAr;
	}

	public void setGlNameAr(String glNameAr) {
		this.glNameAr = glNameAr;
	}

	public String getGlNameEn() {
		return glNameEn;
	}

	public void setGlNameEn(String glNameEn) {
		this.glNameEn = glNameEn;
	}

	public String getBriefNameAr() {
		return briefNameAr;
	}

	public void setBriefNameAr(String briefNameAr) {
		this.briefNameAr = briefNameAr;
	}

	public String getBriefNameEn() {
		return briefNameEn;
	}

	public void setBriefNameEn(String briefNameEn) {
		this.briefNameEn = briefNameEn;
	}

	public String getLongNameAr() {
		return longNameAr;
	}

	public void setLongNameAr(String longNameAr) {
		this.longNameAr = longNameAr;
	}

	public String getLongNameEn() {
		return longNameEn;
	}

	public void setLongNameEn(String longNameEn) {
		this.longNameEn = longNameEn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public ProductPreferenceDTO getPreference() {
		return preference;
	}

	public void setPreference(ProductPreferenceDTO preference) {
		this.preference = preference;
	}

	public CurrencyDTO getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyDTO currency) {
		this.currency = currency;
	}

	public Integer getSlNo() {
		return slNo;
	}

	public void setSlNo(Integer slNo) {
		this.slNo = slNo;
	}

	public Double getCurrentBalance() {
		if (currencyCode != null && currencyCode == 1) {
			return cvBalance;
		}
		return fcBalance;
	}

	public Double getAvailableBalance() {
		if (currencyCode != null && currencyCode == 1) {
			return cvAvailableBalance;
		}
		return fcAvailableBalance;
	}

	public void setFormattedAvailableBalance(String formattedAvailableBalance) {
		this.formattedAvailableBalance = formattedAvailableBalance;
	}

	public void setFormattedCurrentBalance(String formattedCurrentBalance) {
		this.formattedCurrentBalance = formattedCurrentBalance;
	}

	public void setFormattedAvailableBalanceKWD(String formattedAvailableBalanceKWD) {
		this.formattedAvailableBalanceKWD = formattedAvailableBalanceKWD;
	}

	public String getFormattedAvailableBalance() {
		return formattedAvailableBalance;
	}

	public String getFormattedCurrentBalance() {
		return formattedCurrentBalance;
	}

	public String getFormattedAvailableBalanceKWD() {
		return formattedAvailableBalanceKWD;
	}

//	@Override
	public int compareTo(AccountDTO o) {
		return getAccountNumber().compareToIgnoreCase(o.getAccountNumber());
	}

	/**
	 * @param additionalRef the additionalRef to set
	 */
	public void setAdditionalRef(String additionalRef) {
		this.additionalRef = additionalRef;
	}

	/**
	 * @return the additionalRef
	 */
	public String getAdditionalRef() {
		return additionalRef;
	}

	/**
	 * @param transferTrxNo the transferTrxNo to set
	 */
	public void setTransferTrxNo(String transferTrxNo) {
		this.transferTrxNo = transferTrxNo;
	}

	/**
	 * @return the transferTrxNo
	 */
	public String getTransferTrxNo() {
		return transferTrxNo;
	}

	/**
	 * @param hofTrxNo the hofTrxNo to set
	 */
	public void setHofTrxNo(String hofTrxNo) {
		this.hofTrxNo = hofTrxNo;
	}

	/**
	 * @return the hofTrxNo
	 */
	public String getHofTrxNo() {
		return hofTrxNo;
	}

	/**
	 * @param pointRate the pointRate to set
	 */
	public void setPointRate(String pointRate) {
		this.pointRate = pointRate;
	}

	/**
	 * @return the pointRate
	 */
	public String getPointRate() {
		return pointRate;
	}

	/**
	 * @param maturityDate the maturityDate to set
	 */
	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	/**
	 * @return the maturityDate
	 */
	public Date getMaturityDate() {
		return maturityDate;
	}

	/**
	 * @param debitAvailBal the debitAvailBal to set
	 */
	public void setDebitAvailBal(String debitAvailBal) {
		this.debitAvailBal = debitAvailBal;
	}

	/**
	 * @return the debitAvailBal
	 */
	public String getDebitAvailBal() {
		return debitAvailBal;
	}

	/**
	 * @param availBal the availBal to set
	 */
	public void setAvailBal(String availBal) {
		this.availBal = availBal;
	}

	/**
	 * @return the availBal
	 */
	public String getAvailBal() {
		return availBal;
	}

	/**
	 * @param accountName the accountName to set
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * @return the accountName
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * @param currentAccntBalance the currentAccntBalance to set
	 */
	public void setCurrentAccntBalance(String currentAccntBalance) {
		this.currentAccntBalance = currentAccntBalance;
	}

	/**
	 * @return the currentAccntBalance
	 */
	public String getCurrentAccntBalance() {
		return currentAccntBalance;
	}

	/**
	 * @param arabicAccntName the arabicAccntName to set
	 */
	public void setArabicAccntName(String arabicAccntName) {
		this.arabicAccntName = arabicAccntName;
	}

	/**
	 * @return the arabicAccntName
	 */
	public String getArabicAccntName() {
		return arabicAccntName;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorDes the errorDes to set
	 */
	public void setErrorDes(String errorDes) {
		this.errorDes = errorDes;
	}

	/**
	 * @return the errorDes
	 */
	public String getErrorDes() {
		return errorDes;
	}

	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param ibanRequire the ibanRequire to set
	 */
	public void setIbanRequire(String ibanRequire) {
		this.ibanRequire = ibanRequire;
	}

	/**
	 * @return the ibanRequire
	 */
	public String getIbanRequire() {
		return ibanRequire;
	}

	/**
	 * @param ibanLength the ibanLength to set
	 */
	public void setIbanLength(String ibanLength) {
		this.ibanLength = ibanLength;
	}

	/**
	 * @return the ibanLength
	 */
	public String getIbanLength() {
		return ibanLength;
	}

	/**
	 * @param ibanDetails the ibanDetails to set
	 */
	public void setIbanDetails(String ibanDetails) {
		this.ibanDetails = ibanDetails;
	}

	/**
	 * @return the ibanDetails
	 */
	public String getIbanDetails() {
		return ibanDetails;
	}

	/**
	 * @param countryISO the countryISO to set
	 */
	public void setCountryISO(String countryISO) {
		this.countryISO = countryISO;
	}

	/**
	 * @return the countryISO
	 */
	public String getCountryISO() {
		return countryISO;
	}

	public void setAccountTypeCode(String accountTypeCode) {
		this.accountTypeCode = accountTypeCode;
	}

	public String getAccountTypeCode() {
		return accountTypeCode;
	}

	public void setAccountTypeDesc(String accountTypeDesc) {
		this.accountTypeDesc = accountTypeDesc;
	}

	public String getAccountTypeDesc() {
		return accountTypeDesc;
	}

	public void setMinimumOpenBal(Double minimumOpenBal) {
		this.minimumOpenBal = minimumOpenBal;
	}

	public Double getMinimumOpenBal() {
		return minimumOpenBal;
	}

	public void setCurrencyDescArab(String currencyDescArab) {
		this.currencyDescArab = currencyDescArab;
	}

	public String getCurrencyDescArab() {
		return currencyDescArab;
	}

	public void setCurrencyDescEng(String currencyDescEng) {
		this.currencyDescEng = currencyDescEng;
	}

	public String getCurrencyDescEng() {
		return currencyDescEng;
	}

	public void setAccountTypeDescArab(String accountTypeDescArab) {
		this.accountTypeDescArab = accountTypeDescArab;
	}

	public String getAccountTypeDescArab() {
		return accountTypeDescArab;
	}

	public String getFormattedHoldAmount() {
		return formattedHoldAmount;
	}

	public void setFormattedHoldAmount(String formattedHoldAmount) {
		this.formattedHoldAmount = formattedHoldAmount;
	}

	public String getGlCode() {
		return glCode;
	}

	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}

	public String getLocalizedGLName() {
		return localizedGLName;
	}

	public void setLocalizedGLName(String localizedGLName) {
		this.localizedGLName = localizedGLName;
	}

	public Integer getObjectTypeId() {
		return objectTypeId;
	}

	public void setObjectTypeId(Integer objectTypeId) {
		this.objectTypeId = objectTypeId;
	}

	public Date getBranchDate() {
		return branchDate;
	}

	public void setBranchDate(Date branchDate) {
		this.branchDate = branchDate;
	}

	public Date getLastActivityDate() {
		return lastActivityDate;
	}

	public void setLastActivityDate(Date lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
	}

	public Date getLastDepositeDate() {
		return lastDepositeDate;
	}

	public void setLastDepositeDate(Date lastDepositeDate) {
		this.lastDepositeDate = lastDepositeDate;
	}

	public Double getLastDepositeAmount() {
		return lastDepositeAmount;
	}

	public void setLastDepositeAmount(Double lastDepositeAmount) {
		this.lastDepositeAmount = lastDepositeAmount;
	}

	public String getAutoRenewal() {
		return autoRenewal;
	}

	public void setAutoRenewal(String autoRenewal) {
		this.autoRenewal = autoRenewal;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getFixedMaturityType() {
		return fixedMaturityType;
	}

	public void setFixedMaturityType(String fixedMaturityType) {
		this.fixedMaturityType = fixedMaturityType;
	}

	public Double getExpectedProfitRate() {
		return expectedProfitRate;
	}

	public void setExpectedProfitRate(Double expectedProfitRate) {
		this.expectedProfitRate = expectedProfitRate;
	}

	public Integer getTenor() {
		return tenor;
	}

	public void setTenor(Integer tenor) {
		this.tenor = tenor;
	}

	public String getProfitAccountNumber() {
		return profitAccountNumber;
	}

	public void setProfitAccountNumber(String profitAccountNumber) {
		this.profitAccountNumber = profitAccountNumber;
	}

	public Boolean getIsEntitledtoViewCheuqeImage() {
		return isEntitledtoViewCheuqeImage;
	}

	public void setIsEntitledtoViewCheuqeImage(Boolean isEntitledtoViewCheuqeImage) {
		this.isEntitledtoViewCheuqeImage = isEntitledtoViewCheuqeImage;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getValueDate() {
		return valueDate;
	}

	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

	public String getCvAmount() {
		return cvAmount;
	}

	public void setCvAmount(String cvAmount) {
		this.cvAmount = cvAmount;
	}

	public String getHoldReason() {
		return holdReason;
	}

	public void setHoldReason(String holdReason) {
		this.holdReason = holdReason;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getReasonDesc() {
		return reasonDesc;
	}

	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}

	/**
	 * JIRA: RTLCRPMBDV-441 (DA-550 - Card Issuance CR Changes) Neel: 24-Jan-2017
	 */
	public Boolean getIsEligibleForCardIssuance() {
		return isEligibleForCardIssuance;
	}

	public void setIsEligibleForCardIssuance(Boolean isEligibleForCardIssuance) {
		this.isEligibleForCardIssuance = isEligibleForCardIssuance;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	public String getFormattedTenure() {
		return formattedTenure;
	}

	public void setFormattedTenure(String formattedTenure) {
		this.formattedTenure = formattedTenure;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public String getBankCountry() {
		return bankCountry;
	}

	public void setBankCountry(String bankCountry) {
		this.bankCountry = bankCountry;
	}

	public String getSwiftCode() {
		return swiftCode;
	}

	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

	public boolean isShowRate() {
		return showRate;
	}

	public void setShowRate(boolean showRate) {
		this.showRate = showRate;
	}

	public Boolean getIsLinkedAccount() {
		return isLinkedAccount;
	}

	public void setIsLinkedAccount(Boolean isLinkedAccount) {
		this.isLinkedAccount = isLinkedAccount;
	}

	@Override
	public String toString() {
		return "AccountDTO [accountName=" + accountName + ", accountNumber=" + accountNumber + ", accountType="
				+ accountType + ", accountTypeCode=" + accountTypeCode + ", accountTypeDesc=" + accountTypeDesc
				+ ", accountTypeDescArab=" + accountTypeDescArab + ", additionalRef=" + additionalRef
				+ ", arabicAccntName=" + arabicAccntName + ", autoRenewal=" + autoRenewal + ", availBal=" + availBal
				+ ", branchCode=" + branchCode + ", branchDate=" + branchDate + ", branchName=" + branchName
				+ ", briefNameAr=" + briefNameAr + ", briefNameEn=" + briefNameEn + ", cifNo=" + cifNo
				+ ", countryCode=" + countryCode + ", countryISO=" + countryISO + ", currency=" + currency
				+ ", currencyCode=" + currencyCode + ", currencyDescArab=" + currencyDescArab + ", currencyDescEng="
				+ currencyDescEng + ", currentAccntBalance=" + currentAccntBalance + ", cvAvailableBalance="
				+ cvAvailableBalance + ", cvBalance=" + cvBalance + ", debitAvailBal=" + debitAvailBal + ", errorCode="
				+ errorCode + ", errorDes=" + errorDes + ", expectedProfitRate=" + expectedProfitRate
				+ ", fcAvailableBalance=" + fcAvailableBalance + ", fcBalance=" + fcBalance + ", fixedMaturityType="
				+ fixedMaturityType + ", formattedAvailableBalance=" + formattedAvailableBalance
				+ ", formattedAvailableBalanceKWD=" + formattedAvailableBalanceKWD + ", formattedCurrentBalance="
				+ formattedCurrentBalance + ", formattedHoldAmount=" + formattedHoldAmount + ", glCode=" + glCode
				+ ", glNameAr=" + glNameAr + ", glNameEn=" + glNameEn + ", hofTrxNo=" + hofTrxNo + ", holdAmount="
				+ holdAmount + ", ibanDetails=" + ibanDetails + ", ibanLength=" + ibanLength + ", ibanNumber="
				+ ibanNumber + ", ibanRequire=" + ibanRequire + ", lastActivityDate=" + lastActivityDate
				+ ", lastDepositeAmount=" + lastDepositeAmount + ", lastDepositeDate=" + lastDepositeDate
				+ ", localizedGLName=" + localizedGLName + ", longNameAr=" + longNameAr + ", longNameEn=" + longNameEn
				+ ", maturityDate=" + maturityDate + ", minimumOpenBal=" + minimumOpenBal + ", objectTypeId="
				+ objectTypeId + ", openDate=" + openDate + ", pointRate=" + pointRate + ", preference=" + preference
				+ ", profitAccountNumber=" + profitAccountNumber + ", slNo=" + slNo + ", status=" + status + ", tenor="
				+ tenor + ", transferTrxNo=" + transferTrxNo + "]";
	}

	
}
