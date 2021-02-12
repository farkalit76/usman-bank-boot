/**
 * 
 */
package com.usman.bank.models;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author vXebiau
 *
 */
public class MasterTransactionDTO implements Serializable {

	/**
	 * 
	 */
	protected static final long serialVersionUID = 1L;

	protected Long custTransId;
	protected Integer bankId;
	protected String customerCIF;
	protected Integer channelId;
	protected Integer currencyId; // 1 or -3 (KWD or NON KWD)
	protected Integer transferTypeId;
	protected BigDecimal transAmountInKwd;
	protected BigDecimal transAmount;
	protected String fromAccountId;
	protected String toAccountId;
	protected Integer transferStatusTypeId;
	protected Long confirmationNumber;
	protected String comments;
	protected Integer custID;
	protected Integer serviceID;
	protected String channelKey;
	protected Integer transactionStage; /* 1 = transaction committed, 2 = transaction initiated */
	protected String comments2; /* will be used for the field comments2 for CUSTS_MASTER_TRANSACTION */

	public Long getCustTransId() {
		return custTransId;
	}

	public void setCustTransId(Long custTransId) {
		this.custTransId = custTransId;
	}

	public Integer getBankId() {
		return bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	public String getCustomerCIF() {
		return customerCIF;
	}

	public void setCustomerCIF(String customerCIF) {
		this.customerCIF = customerCIF;
	}

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}

	public Integer getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}

	public Integer getTransferTypeId() {
		return transferTypeId;
	}

	public void setTransferTypeId(Integer transferTypeId) {
		this.transferTypeId = transferTypeId;
	}

	public BigDecimal getTransAmountInKwd() {
		return transAmountInKwd;
	}

	public void setTransAmountInKwd(BigDecimal transAmountInKwd) {
		this.transAmountInKwd = transAmountInKwd;
	}

	public BigDecimal getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(BigDecimal transAmount) {
		this.transAmount = transAmount;
	}

	public String getFromAccountId() {
		return fromAccountId;
	}

	public void setFromAccountId(String fromAccountId) {
		this.fromAccountId = fromAccountId;
	}

	public String getToAccountId() {
		return toAccountId;
	}

	public void setToAccountId(String toAccountId) {
		this.toAccountId = toAccountId;
	}

	public Integer getTransferStatusTypeId() {
		return transferStatusTypeId;
	}

	public void setTransferStatusTypeId(Integer transferStatusTypeId) {
		this.transferStatusTypeId = transferStatusTypeId;
	}

	public Long getConfirmationNumber() {
		return confirmationNumber;
	}

	public void setConfirmationNumber(Long confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getCustID() {
		return custID;
	}

	public void setCustID(Integer custID) {
		this.custID = custID;
	}

	public Integer getServiceID() {
		return serviceID;
	}

	public void setServiceID(Integer serviceID) {
		this.serviceID = serviceID;
	}

	public Integer getTransactionStage() {
		return transactionStage;
	}

	public void setTransactionStage(Integer transactionStage) {
		this.transactionStage = transactionStage;
	}

	public String getComments2() {
		return comments2;
	}

	public void setComments2(String comments2) {
		this.comments2 = comments2;
	}

	public String getChannelKey() {
		return channelKey;
	}

	public void setChannelKey(String channelKey) {
		this.channelKey = channelKey;
	}

	@Override
	public String toString() {
		return "MasterTransactionDTO [custTransId=" + custTransId + ", bankId=" + bankId + ", customerCIF="
				+ customerCIF + ", channelId=" + channelId + ", transferTypeId=" + transferTypeId
				+ ", transAmountInKwd=" + transAmountInKwd + ", transAmount=" + transAmount + ", fromAccountId="
				+ fromAccountId + ", toAccountId=" + toAccountId + ", transferStatusTypeId=" + transferStatusTypeId
				+ ", confirmationNumber=" + confirmationNumber + ", comments=" + comments + ", custID=" + custID
				+ ", serviceID=" + serviceID + ", channelKey=" + channelKey + ", transactionStage=" + transactionStage
				+ ", comments2=" + comments2 + "]";
	}

}
