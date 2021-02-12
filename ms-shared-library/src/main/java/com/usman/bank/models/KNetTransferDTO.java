/**
 * @Copyright reserved to bank
 */
package com.usman.bank.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Description: This class KnetTransferDTO.java
 *
 * @author vXebiau
 * @date Oct 27, 2019
 * @version 1.0
 *
 */
public class KNetTransferDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected Long bbynPaymentId;
	protected String bbynTrackId;
	protected String cif;
	protected Integer custId;
	protected Integer channelId;
	protected String fromAccount;
	protected String toAccount;
	protected Integer currencyId;
	protected BigDecimal transAmount;
	protected String comment;
	protected String lang;
	protected Integer serviceId;
	protected Integer transferTypeId;
	protected BigDecimal amountInKwd;
	protected Timestamp appTarnsDate;
	protected Timestamp dbTransDate;
	protected Integer stage;
	protected Integer status;
	protected String sessionId;
	protected String channelKey;
	
	protected String mobileNo;
	protected String emailId;
	protected String consigneeName;
	
	protected String knetPaymentId;
	protected String knetPaymentUrl;
	protected String knetTransId;
	protected String knetAuthNumber;
	protected String knetRefId;
	protected String knetResponse;
	protected Timestamp knetInitDate;
	
	protected String remarks;
	protected Timestamp appDateKnetLastResp;
	protected Timestamp dbDateKnetLastResp;
	protected Timestamp expiryDate;
	protected String smsMsg;
	protected String smsLink;
	protected Integer msgDeliveryType;
	protected Integer isSmsSent;
	protected String eventName;
	protected Integer noOfPayments;
	protected Integer remainingAmount;
	protected String bbynRefId;
	protected Integer showRemaining;
	protected Integer parentId;
	protected String refId;
	protected String knetTrackId;
	
	protected String responseUrl;
	
	public KNetTransferDTO() {
	}
	
	public KNetTransferDTO(String cif, Integer custId) {
		this.cif=cif;
		this.custId= custId;
	}

	public Long getBbynPaymentId() {
		return bbynPaymentId;
	}

	public void setBbynPaymentId(Long bbynPaymentId) {
		this.bbynPaymentId = bbynPaymentId;
	}

	public String getBbynTrackId() {
		return bbynTrackId;
	}

	public void setBbynTrackId(String bbynTrackId) {
		this.bbynTrackId = bbynTrackId;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
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

	public Integer getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}

	public BigDecimal getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(BigDecimal transAmount) {
		this.transAmount = transAmount;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public Integer getTransferTypeId() {
		return transferTypeId;
	}

	public void setTransferTypeId(Integer transferTypeId) {
		this.transferTypeId = transferTypeId;
	}

	public BigDecimal getAmountInKwd() {
		return amountInKwd;
	}

	public void setAmountInKwd(BigDecimal amountInKwd) {
		this.amountInKwd = amountInKwd;
	}

	public Timestamp getAppTarnsDate() {
		return appTarnsDate;
	}

	public void setAppTarnsDate(Timestamp appTarnsDate) {
		this.appTarnsDate = appTarnsDate;
	}

	public Timestamp getDbTransDate() {
		return dbTransDate;
	}

	public void setDbTransDate(Timestamp dbTransDate) {
		this.dbTransDate = dbTransDate;
	}

	public Integer getStage() {
		return stage;
	}

	public void setStage(Integer stage) {
		this.stage = stage;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getChannelKey() {
		return channelKey;
	}

	public void setChannelKey(String channelKey) {
		this.channelKey = channelKey;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getConsigneeName() {
		return consigneeName;
	}

	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}

	public String getKnetPaymentId() {
		return knetPaymentId;
	}

	public void setKnetPaymentId(String knetPaymentId) {
		this.knetPaymentId = knetPaymentId;
	}

	public String getKnetPaymentUrl() {
		return knetPaymentUrl;
	}

	public void setKnetPaymentUrl(String knetPaymentUrl) {
		this.knetPaymentUrl = knetPaymentUrl;
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

	public String getKnetRefId() {
		return knetRefId;
	}

	public void setKnetRefId(String knetRefId) {
		this.knetRefId = knetRefId;
	}

	public String getKnetResponse() {
		return knetResponse;
	}

	public void setKnetResponse(String knetResponse) {
		this.knetResponse = knetResponse;
	}

	public Timestamp getKnetInitDate() {
		return knetInitDate;
	}

	public void setKnetInitDate(Timestamp knetInitDate) {
		this.knetInitDate = knetInitDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Timestamp getAppDateKnetLastResp() {
		return appDateKnetLastResp;
	}

	public void setAppDateKnetLastResp(Timestamp appDateKnetLastResp) {
		this.appDateKnetLastResp = appDateKnetLastResp;
	}

	public Timestamp getDbDateKnetLastResp() {
		return dbDateKnetLastResp;
	}

	public void setDbDateKnetLastResp(Timestamp dbDateKnetLastResp) {
		this.dbDateKnetLastResp = dbDateKnetLastResp;
	}

	public Timestamp getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Timestamp expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getSmsMsg() {
		return smsMsg;
	}

	public void setSmsMsg(String smsMsg) {
		this.smsMsg = smsMsg;
	}

	public String getSmsLink() {
		return smsLink;
	}

	public void setSmsLink(String smsLink) {
		this.smsLink = smsLink;
	}

	public Integer getMsgDeliveryType() {
		return msgDeliveryType;
	}

	public void setMsgDeliveryType(Integer msgDeliveryType) {
		this.msgDeliveryType = msgDeliveryType;
	}

	public Integer getIsSmsSent() {
		return isSmsSent;
	}

	public void setIsSmsSent(Integer isSmsSent) {
		this.isSmsSent = isSmsSent;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Integer getNoOfPayments() {
		return noOfPayments;
	}

	public void setNoOfPayments(Integer noOfPayments) {
		this.noOfPayments = noOfPayments;
	}

	public Integer getRemainingAmount() {
		return remainingAmount;
	}

	public void setRemainingAmount(Integer remainingAmount) {
		this.remainingAmount = remainingAmount;
	}

	public String getBbynRefId() {
		return bbynRefId;
	}

	public void setBbynRefId(String bbynRefId) {
		this.bbynRefId = bbynRefId;
	}

	public Integer getShowRemaining() {
		return showRemaining;
	}

	public void setShowRemaining(Integer showRemaining) {
		this.showRemaining = showRemaining;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getRefId() {
		return refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	public String getKnetTrackId() {
		return knetTrackId;
	}

	public void setKnetTrackId(String knetTrackId) {
		this.knetTrackId = knetTrackId;
	}

	
	/**
	 * @return the responseUrl
	 */
	public String getResponseUrl() {
		return responseUrl;
	}

	/**
	 * @param responseUrl the responseUrl to set
	 */
	public void setResponseUrl(String responseUrl) {
		this.responseUrl = responseUrl;
	}

	@Override
	public String toString() {
		return "KNetTransferDTO [bbynPaymentId=" + bbynPaymentId + ", bbynTrackId=" + bbynTrackId + ", cif=" + cif
				+ ", custId=" + custId + ", channelId=" + channelId + ", fromAccount=" + fromAccount + ", toAccount="
				+ toAccount + ", currencyId=" + currencyId + ", transAmount=" + transAmount + ", comment=" + comment
				+ ", lang=" + lang + ", serviceId=" + serviceId + ", transferTypeId=" + transferTypeId
				+ ", amountInKwd=" + amountInKwd + ", appTarnsDate=" + appTarnsDate + ", dbTransDate=" + dbTransDate
				+ ", stage=" + stage + ", status=" + status + ", sessionId=" + sessionId + ", channelKey=" + channelKey
				+ ", mobileNo=" + mobileNo + ", emailId=" + emailId + ", consigneeName=" + consigneeName
				+ ", knetPaymentId=" + knetPaymentId + ", knetPaymentUrl=" + knetPaymentUrl + ", knetTransId="
				+ knetTransId + ", knetAuthNumber=" + knetAuthNumber + ", knetRefId=" + knetRefId + ", knetResponse="
				+ knetResponse + ", knetInitDate=" + knetInitDate + ", remarks=" + remarks + ", appDateKnetLastResp="
				+ appDateKnetLastResp + ", dbDateKnetLastResp=" + dbDateKnetLastResp + ", expiryDate=" + expiryDate
				+ ", smsMsg=" + smsMsg + ", smsLink=" + smsLink + ", msgDeliveryType=" + msgDeliveryType
				+ ", isSmsSent=" + isSmsSent + ", eventName=" + eventName + ", noOfPayments=" + noOfPayments
				+ ", remainingAmount=" + remainingAmount + ", bbynRefId=" + bbynRefId + ", showRemaining="
				+ showRemaining + ", parentId=" + parentId + ", refId=" + refId + ", knetTrackId=" + knetTrackId + "]";
	}

}
