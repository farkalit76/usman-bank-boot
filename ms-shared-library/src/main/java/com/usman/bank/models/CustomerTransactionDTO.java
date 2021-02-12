package com.usman.bank.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashMap;

import com.usman.bank.constants.Constants;

public class CustomerTransactionDTO extends BaseDTO  implements Serializable,Cloneable{
	
	
	/**
	 * Default Serial ID 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long custTransId;
	private Long custTransDetailsId;
	private String customerCIF;
	private Integer channelId;
	private Integer limitPeriod;
	private Integer currencyId;  //1 or -3 (KWD or NON KWD)
	private Integer currencyCode; //Actual Currency Id
	private Integer transferTypeId;
	private Float transAmountInKwd;
	private Double transAmount;
	private String transactionDate;
	private String fromAccountId;
	private String toAccountId;
	private Integer transferStatusTypeId;
	private Long confirmationNumber;
	private   HashMap<Integer,Object> transDetails;
	private Double totalAmountTransfered;
	private Integer totalTransactions;
	private String comments;
	private Timestamp transactionDateTime;
	private int custID ;
	private int serviceID ;
	private Double sessionExpiryTimeOut ;
	private String requestToken;
	private Integer transactionStage ;  /* 1 = transaction committed, 2 = transaction initiated */
	private String comments2 ;  /* will be used for the field comments2 for CUSTS_MASTER_TRANSACTION */

	
	public Integer getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(Integer currencyCode) {
		this.currencyCode = currencyCode;
	}
	public Double getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(Double transAmount) {
		this.transAmount = transAmount;
	}
	public Double getTotalAmountTransfered() {
		return totalAmountTransfered;
	}
	public void setTotalAmountTransfered(Double totalAmountTransfered) {
		this.totalAmountTransfered = totalAmountTransfered;
	}
	public Integer getTotalTransactions() {
		return totalTransactions;
	}
	public void setTotalTransactions(Integer totalTransactions) {
		this.totalTransactions = totalTransactions;
	}
	public Long getConfirmationNumber() {
		return confirmationNumber;
	}
	public void setConfirmationNumber(Long confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
	public Integer getTransferStatusTypeId() {
		return transferStatusTypeId;
	}
	public void setTransferStatusTypeId(Integer transferStatusTypeId) {
		this.transferStatusTypeId = transferStatusTypeId;
	}
	public Long getCustTransId() {
		return custTransId;
	}
	public void setCustTransId(Long custTransId) {
		this.custTransId = custTransId;
	}
	public Long getCustTransDetailsId() {
		return custTransDetailsId;
	}
	public void setCustTransDetailsId(Long custTransDetailsId) {
		this.custTransDetailsId = custTransDetailsId;
	}
	public HashMap<Integer, Object> getTransDetails() {
		return transDetails;
	}
	public void setTransDetails(HashMap<Integer, Object> transDetails) {
		this.transDetails = transDetails;
	}
	public String getToAccountId() {
		return toAccountId;
	}
	public void setToAccountId(String toAccountId) {
		this.toAccountId = toAccountId;
	}
	public String getFromAccountId() {
		return fromAccountId;
	}
	public void setFromAccountId(String fromAccountId) {
		this.fromAccountId = fromAccountId;
	}
	public String getCustomerCIF() {
		return customerCIF;
	}
	public void setCustomerCIF(String customerCIF) {
		this.customerCIF = customerCIF;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
		
	public Integer getChannelId() {
		return channelId;
	}
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	public Integer getLimitPeriod() {
		return limitPeriod;
	}
	public void setLimitPeriod(Integer limitPeriod) {
		this.limitPeriod = limitPeriod;
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
	public Float getTransAmountInKwd() {
		return transAmountInKwd;
	}
	public void setTransAmountInKwd(Float maxAmount) {
		this.transAmountInKwd = maxAmount;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

	
	public Timestamp getTransactionDateTime() {
		return transactionDateTime;
	}
	public void setTransactionDateTime(Timestamp transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}
	@Override
	public CustomerTransactionDTO clone() throws CloneNotSupportedException {
	
		return (CustomerTransactionDTO) super.clone();
	}
	
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public int getServiceID() {
		return serviceID;
	}
	public void setServiceID(int serviceID) {
		this.serviceID = serviceID;
	}
	public Double getSessionExpiryTimeOut() {
		return sessionExpiryTimeOut;
	}
	public void setSessionExpiryTimeOut(Double sessionExpiryTimeOut) {
		this.sessionExpiryTimeOut = sessionExpiryTimeOut;
	}
	
	public String getRequestToken() {
		return requestToken;
	}
	public void setRequestToken(String requestToken) {
		this.requestToken = requestToken;
	}
	
	public Integer getTransactionStage() {
		if (transactionStage == null)		
			return Constants.TRANSACTION_STAGE.TRANS_COMMITTED ;
		else
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
	
	
	
}
