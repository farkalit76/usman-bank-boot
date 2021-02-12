package com.usman.bank.models;

import java.io.Serializable;
import java.sql.Timestamp;

public class KNetTransactionDTO extends CustomerTransactionDTO implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	private Long bbynPaymentId;
	private String bbynbTrackId;
	private String language;
	private Integer knetTransStage;
	private Integer knetTransStatus;
	private Timestamp knetAppDateTime;
	private String knetPaymentId;
	private String knetPaymentURL;
	private String bbynSessionId;
	private Timestamp lastLoginTime;
	private String loginSessionID;
	private String knetResult;
	private String knetTransId;
	private String knetAuthNumber;
	private String knetReferenceId;
	private String amountStr;
	private String customerEmail;
	private String mobileNo;
	private String customerName; /* this property added to be used by PayMe service */
	private String consigneeName;/* this property added to be used by PayMe service */
	private Timestamp expiryDate; /* this property added to be used by PayMe service */
	private int finalStatusId; /*
								 * this property added to be used by PayMe service. this final status is for the
								 * client, to show the final status of the combination of status and stage
								 */
	private String finalStatusDesc; /* this property added to be used by PayMe service */
	private String smsMsg;
	private boolean isSMSSent;
	private int msgDeliveryType; /* 1= SMS, 2=Share. by default the value will be share */

	private Integer paymeMethod; // Through app or mpbile
	private String smsLink;

	// This change is being done for Exchat. Adding the parameter payMeURL to be
	// returned by EnvelopeDTO
	private String payMeURL;
	private double totalAmount;
	private double installmentAmount; /* in case mutiple payments, installment amount is equal to transAmount */
	private int numberOfPayments;
	private String eventName;
	private BeneficiaryDTO beneficiaryDTO;
	private String bbynRefId;
	private double remainingAmount;
	private boolean showRemainingToOthers;
	private Long parentPaymentId;
	private FileDTO fileDTO; /* Used by Pay Me Mutiple payments to upload the event picture. */

	public Long getBbynPaymentId() {
		return bbynPaymentId;
	}

	public void setBbynPaymentId(Long bbynPaymentId) {
		this.bbynPaymentId = bbynPaymentId;
	}

	public String getBbynbTrackId() {
		return bbynbTrackId;
	}

	public void setBbynbTrackId(String bbynbTrackId) {
		this.bbynbTrackId = bbynbTrackId;
	}

	public Integer getKnetTransStatus() {
		return knetTransStatus;
	}

	public void setKnetTransStatus(Integer kNetTransStatus) {
		this.knetTransStatus = kNetTransStatus;
	}

	public Timestamp getKnetAppDateTime() {
		return knetAppDateTime;
	}

	public void setKnetAppDateTime(Timestamp kNetAppDateTime) {
		this.knetAppDateTime = kNetAppDateTime;
	}

	public String getKnetPaymentId() {
		return knetPaymentId;
	}

	public void setKnetPaymentId(String knetPaymentId) {
		this.knetPaymentId = knetPaymentId;
	}

	public String getKnetPaymentURL() {
		return knetPaymentURL;
	}

	public void setKnetPaymentURL(String knetPaymentURL) {
		this.knetPaymentURL = knetPaymentURL;
	}

	public String getBbynSessionId() {
		return bbynSessionId;
	}

	public void setBbynSessionId(String bbynSessionId) {
		this.bbynSessionId = bbynSessionId;
	}

	public Integer getKnetTransStage() {
		return knetTransStage;
	}

	public void setKnetTransStage(Integer knetTransStage) {
		this.knetTransStage = knetTransStage;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Timestamp getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getKnetResult() {
		return knetResult;
	}

	public void setKnetResult(String knetResult) {
		this.knetResult = knetResult;
	}

	public String getLoginSessionID() {
		return loginSessionID;
	}

	public void setLoginSessionID(String loginSessionID) {
		this.loginSessionID = loginSessionID;
	}

	public String getKnetTransId() {
		return knetTransId;
	}

	public void setKnetTransId(String knetTransId) {
		this.knetTransId = knetTransId;
	}

	public String getKnetAuthNumber() {
		return knetAuthNumber;
	}

	public void setKnetAuthNumber(String knetAuthNumber) {
		this.knetAuthNumber = knetAuthNumber;
	}

	public String getKnetReferenceId() {
		return knetReferenceId;
	}

	public void setKnetReferenceId(String knetReferenceId) {
		this.knetReferenceId = knetReferenceId;
	}

	public String getAmountStr() {
		return amountStr;
	}

	public void setAmountStr(String amountStr) {
		this.amountStr = amountStr;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getConsigneeName() {
		return consigneeName;
	}

	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}

	public Timestamp getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Timestamp expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getFinalStatusId() {
		return finalStatusId;
	}

	public void setFinalStatusId(int finalStatusId) {
		this.finalStatusId = finalStatusId;
	}

	public String getFinalStatusDesc() {
		return finalStatusDesc;
	}

	public void setFinalStatusDesc(String finalStatusDesc) {
		this.finalStatusDesc = finalStatusDesc;
	}

	@Override
	public KNetTransactionDTO clone() throws CloneNotSupportedException {
		return (KNetTransactionDTO) super.clone();
	}

	public String getSmsMsg() {
		return smsMsg;
	}

	public void setSmsMsg(String smsMsg) {
		this.smsMsg = smsMsg;
	}

	public boolean isSMSSent() {
		return isSMSSent;
	}

	public void setSMSSent(boolean isSMSSent) {
		this.isSMSSent = isSMSSent;
	}

	public int getMsgDeliveryType() {
		return msgDeliveryType;
	}

	public void setMsgDeliveryType(int msgDeliveryType) {
		this.msgDeliveryType = msgDeliveryType;
	}

	public Integer getPaymeMethod() {
		return paymeMethod;
	}

	public void setPaymeMethod(Integer paymeMethod) {
		this.paymeMethod = paymeMethod;
	}

	public String getPayMeURL() {
		return payMeURL;
	}

	public void setPayMeURL(String payMeURL) {
		this.payMeURL = payMeURL;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getInstallmentAmount() {
		return installmentAmount;
	}

	public void setInstallmentAmount(double installmentAmount) {
		this.installmentAmount = installmentAmount;
	}

	public int getNumberOfPayments() {
		return numberOfPayments;
	}

	public void setNumberOfPayments(int numberOfPayments) {
		this.numberOfPayments = numberOfPayments;
	}

	public BeneficiaryDTO getBeneficiaryDTO() {
		return beneficiaryDTO;
	}

	public void setBeneficiaryDTO(BeneficiaryDTO beneficiaryDTO) {
		this.beneficiaryDTO = beneficiaryDTO;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getBbynRefId() {
		return bbynRefId;
	}

	public void setBbynRefId(String bbynRefId) {
		this.bbynRefId = bbynRefId;
	}

	public double getRemainingAmount() {
		return remainingAmount;
	}

	public void setRemainingAmount(double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}

	public boolean isShowRemainingToOthers() {
		return showRemainingToOthers;
	}

	public void setShowRemainingToOthers(boolean showRemainingToOthers) {
		this.showRemainingToOthers = showRemainingToOthers;
	}

	public Long getParentPaymentId() {
		return parentPaymentId;
	}

	public void setParentPaymentId(Long parentPaymentId) {
		this.parentPaymentId = parentPaymentId;
	}

	public FileDTO getFileDTO() {
		return fileDTO;
	}

	public void setFileDTO(FileDTO fileDTO) {
		this.fileDTO = fileDTO;
	}

	public String getSmsLink() {
		return smsLink;
	}

	public void setSmsLink(String smsLink) {
		this.smsLink = smsLink;
	}

}
