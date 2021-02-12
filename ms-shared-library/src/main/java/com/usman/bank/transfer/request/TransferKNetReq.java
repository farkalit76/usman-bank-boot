/**
 * 
 */
package com.usman.bank.transfer.request;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

public class TransferKNetReq implements Serializable {

	protected static final long serialVersionUID = 1L;

	@NotNull
	protected String custId;

	@NotNull
	protected String cifNumber;

	protected String userName;
	protected String mobileNo;
	protected String consigneeName;

	@NotNull
	protected String language;

	@NotNull
	protected String transactionAmount;

	@NotNull
	protected String fromAccount;

	@NotNull
	protected String toAccount;

	@NotNull
	protected String comment;

	protected Integer noOfPayments;
	protected Date transactionDate;
	protected Integer serviceId;
	protected Integer transferType;
	protected Integer currencyId;
	protected Integer serviceTypeID;
	protected Integer clientChannel;

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCifNumber() {
		return cifNumber;
	}

	public void setCifNumber(String cifNumber) {
		this.cifNumber = cifNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getConsigneeName() {
		return consigneeName;
	}

	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getNoOfPayments() {
		return noOfPayments;
	}

	public void setNoOfPayments(Integer noOfPayments) {
		this.noOfPayments = noOfPayments;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public Integer getTransferType() {
		return transferType;
	}

	public void setTransferType(Integer transferType) {
		this.transferType = transferType;
	}

	public Integer getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}

	public Integer getServiceTypeID() {
		return serviceTypeID;
	}

	public void setServiceTypeID(Integer serviceTypeID) {
		this.serviceTypeID = serviceTypeID;
	}

	public Integer getClientChannel() {
		return clientChannel;
	}

	public void setClientChannel(Integer clientChannel) {
		this.clientChannel = clientChannel;
	}

	
	@Override
	public String toString() {
		return "TransferKnetReq [custId=" + custId + ", cifNumber=" + cifNumber + ", userName="
				+ userName + ", mobileNo=" + mobileNo + ", consigneeName=" + consigneeName + ", language=" + language
				+ ", transactionAmount=" + transactionAmount + ", fromAccount=" + fromAccount + ", toAccount="
				+ toAccount + ", comment=" + comment + ", noOfPayments=" + noOfPayments + ", transactionDate="
				+ transactionDate + ", serviceId=" + serviceId + ", transferType=" + transferType + ", currencyId="
				+ currencyId + ", serviceTypeID=" + serviceTypeID + ", clientChannel=" + clientChannel +  "]";
	}

	// protected String slNo;
	// protected String recurringInterval;
	// protected String soStartingDate;
	// protected Date soEndinggDate;
	// protected String soComment;
	// protected Boolean isPerpetual;
	// protected String transactionPassword;
	// protected Integer shareAndOur;
	// protected String cardSecureAlias ;
	// protected String un ; /* Unpredictable Number used by NFC Debit */
	// protected String atc ; /* Application Transaction Counter used by NFC Debit
	// */
	// protected String issuerAppData; /* The issuer app data as a string used by
	// NFC Debit */
	// protected String issuerCountryCode ;
	// protected String amountStr ;
	// protected String purposeId;//The purposeId selected from the transfer purpose
	// dropdown. This is applicable for Local and Int Transfer
	// protected Boolean otpIsNotReceived;
	// protected String nickName;
	// protected String Name;
	// protected boolean createPayee;
	// protected long charityPayeeId;
	// protected Integer productId;
	// protected String paymentSecureToken ;
	// protected DeviceRSDTO device;
	// protected boolean isLiveorPlus;

}