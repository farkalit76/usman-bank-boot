package com.usman.bank.models;

import java.io.Serializable;

/**
 * SMS object to hold all SMS details
 * @author afayad
 *
 */
public class SMSDTO implements Serializable {
    /**
	 * serial version id
	 */
	private static final long serialVersionUID = 1L;

	private String accAddRef;
	private String accBranch;
	private String accCIFSubNo;
	private String accCurrency;
	private String accGL;
	private String accSL;
	private String depAmount;
	private String depOperator;
	private String jvType;
	private String language;
	private String lowLimit;
	private String maturityDays;
	private String message;
	private String messageType;
	private String mobileNumber;
	private String olSubscriptionNo;
	private String postedDate;
	private String results;
	private String sendDate;
	private String sendTime;
	private String serviceCode;
	private String serviceType;
	private String specificType;
	private String status;
	private String subscriptionNo;
	private String wdAmount;
	private String wdOperator;
	private String alCompCode;
	private String alBranchCode;
	private String alSubscriptionNo;
	private String alServiceCode;
	private String asSpeceficType;
	private String alCIFNo;
	private String asCifReference;
	private String alAccBranch;
	private String alAccCurrency;
	private String alGlCode;
	private String alAccCifSubNo;
	private String alAccSlNo;
	private String asAccAddRef;
	private String asMobileNo;
	private String adtSendTime;
	private String asAction;
	private String adecLowLimit;

	public String getAccAddRef() {
		return accAddRef;
	}
	public void setAccAddRef(String accAddRef) {
		this.accAddRef = accAddRef;
	}
	public String getAccBranch() {
		return accBranch;
	}
	public void setAccBranch(String accBranch) {
		this.accBranch = accBranch;
	}
	public String getAccCIFSubNo() {
		return accCIFSubNo;
	}
	public void setAccCIFSubNo(String accCIFSubNo) {
		this.accCIFSubNo = accCIFSubNo;
	}
	public String getAccCurrency() {
		return accCurrency;
	}
	public void setAccCurrency(String accCurrency) {
		this.accCurrency = accCurrency;
	}
	public String getAccGL() {
		return accGL;
	}
	public void setAccGL(String accGL) {
		this.accGL = accGL;
	}
	public String getAccSL() {
		return accSL;
	}
	public void setAccSL(String accSL) {
		this.accSL = accSL;
	}
	public String getDepAmount() {
		return depAmount;
	}
	public void setDepAmount(String depAmount) {
		this.depAmount = depAmount;
	}
	public String getDepOperator() {
		return depOperator;
	}
	public void setDepOperator(String depOperator) {
		this.depOperator = depOperator;
	}
	public String getJvType() {
		return jvType;
	}
	public void setJvType(String jvType) {
		this.jvType = jvType;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getLowLimit() {
		return lowLimit;
	}
	public void setLowLimit(String lowLimit) {
		this.lowLimit = lowLimit;
	}
	public String getMaturityDays() {
		return maturityDays;
	}
	public void setMaturityDays(String maturityDays) {
		this.maturityDays = maturityDays;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getOlSubscriptionNo() {
		return olSubscriptionNo;
	}
	public void setOlSubscriptionNo(String olSubscriptionNo) {
		this.olSubscriptionNo = olSubscriptionNo;
	}
	public String getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(String postedDate) {
		this.postedDate = postedDate;
	}
	public String getResults() {
		return results;
	}
	public void setResults(String results) {
		this.results = results;
	}
	public String getSendDate() {
		return sendDate;
	}
	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}
	public String getSendTime() {
		return sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getSpecificType() {
		return specificType;
	}
	public void setSpecificType(String specificType) {
		this.specificType = specificType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSubscriptionNo() {
		return subscriptionNo;
	}
	public void setSubscriptionNo(String subscriptionNo) {
		this.subscriptionNo = subscriptionNo;
	}
	public String getWdAmount() {
		return wdAmount;
	}
	public void setWdAmount(String wdAmount) {
		this.wdAmount = wdAmount;
	}
	public String getWdOperator() {
		return wdOperator;
	}
	public void setWdOperator(String wdOperator) {
		this.wdOperator = wdOperator;
	}
	public void setAlCompCode(String alCompCode) {
		this.alCompCode = alCompCode;
	}
	public String getAlCompCode() {
		return alCompCode;
	}
	public void setAlBranchCode(String alBranchCode) {
		this.alBranchCode = alBranchCode;
	}
	public String getAlBranchCode() {
		return alBranchCode;
	}
	public void setAlSubscriptionNo(String alSubscriptionNo) {
		this.alSubscriptionNo = alSubscriptionNo;
	}
	public String getAlSubscriptionNo() {
		return alSubscriptionNo;
	}
	public void setAlServiceCode(String alServiceCode) {
		this.alServiceCode = alServiceCode;
	}
	public String getAlServiceCode() {
		return alServiceCode;
	}
	public void setAsSpeceficType(String asSpeceficType) {
		this.asSpeceficType = asSpeceficType;
	}
	public String getAsSpeceficType() {
		return asSpeceficType;
	}
	public void setAlCIFNo(String alCIFNo) {
		this.alCIFNo = alCIFNo;
	}
	public String getAlCIFNo() {
		return alCIFNo;
	}
	public void setAsCifReference(String asCifReference) {
		this.asCifReference = asCifReference;
	}
	public String getAsCifReference() {
		return asCifReference;
	}
	public void setAlAccBranch(String alAccBranch) {
		this.alAccBranch = alAccBranch;
	}
	public String getAlAccBranch() {
		return alAccBranch;
	}
	public void setAlAccCurrency(String alAccCurrency) {
		this.alAccCurrency = alAccCurrency;
	}
	public String getAlAccCurrency() {
		return alAccCurrency;
	}
	public void setAlGlCode(String alGlCode) {
		this.alGlCode = alGlCode;
	}
	public String getAlGlCode() {
		return alGlCode;
	}
	public void setAlAccCifSubNo(String alAccCifSubNo) {
		this.alAccCifSubNo = alAccCifSubNo;
	}
	public String getAlAccCifSubNo() {
		return alAccCifSubNo;
	}
	public void setAlAccSlNo(String alAccSlNo) {
		this.alAccSlNo = alAccSlNo;
	}
	public String getAlAccSlNo() {
		return alAccSlNo;
	}
	public void setAsAccAddRef(String asAccAddRef) {
		this.asAccAddRef = asAccAddRef;
	}
	public String getAsAccAddRef() {
		return asAccAddRef;
	}
	public void setAsMobileNo(String asMobileNo) {
		this.asMobileNo = asMobileNo;
	}
	public String getAsMobileNo() {
		return asMobileNo;
	}
	public void setAdtSendTime(String adtSendTime) {
		this.adtSendTime = adtSendTime;
	}
	public String getAdtSendTime() {
		return adtSendTime;
	}
	public void setAsAction(String asAction) {
		this.asAction = asAction;
	}
	public String getAsAction() {
		return asAction;
	}
	public void setAdecLowLimit(String adecLowLimit) {
		this.adecLowLimit = adecLowLimit;
	}
	public String getAdecLowLimit() {
		return adecLowLimit;
	}

	
}//class
