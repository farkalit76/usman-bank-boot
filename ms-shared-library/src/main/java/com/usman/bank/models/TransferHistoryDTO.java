/**
 * @Copyright reserved to bank
 */
package com.usman.bank.models;

import java.io.Serializable;
import java.util.Date;

/**
 * Description: This class TransferHistoryDTO.java
 *
 * @author vXebiau
 * @date Jul 7, 2019
 * @version 1.0
 *
 */
public class TransferHistoryDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private long channelId;
	private long custTransId;
	private String transferTypeNameEn;
	private String transferTypeNameAr;
	private String channelNameEn;
	private String bankNameEn;
	private String cif;
	private double transferAmountInKd;
	private String fromAccountId;
	private String toAccountId;
	private Date createdDate;
	private String transferStatusTypeNameEn;
	private String transferStatusTypeNameAr;
	private double amount;
	private int roundedAmount;
	private int transferTypeId;
	private int transferStatusTypeId;
	private int transferCurrencyId;
	private String comments;
	private String currencyNameEn;
	private String currencyNameAr;

	// private String giftCardNo ;
	// private String refNo ;
	// private String payeeName;
	// private String payeeNameEn;
	// private String payeeNameAr ;
	// private boolean isLiveorPlus;
	
	public TransferHistoryDTO() {}
	
	public TransferHistoryDTO(long channelId, long custTransId) {
		this.channelId= channelId;
		this.custTransId = custTransId;
	}
	
	public long getChannelId() {
		return channelId;
	}

	public void setChannelId(long channelId) {
		this.channelId = channelId;
	}

	public long getCustTransId() {
		return custTransId;
	}

	public void setCustTransId(long custTransId) {
		this.custTransId = custTransId;
	}

	public String getTransferTypeNameEn() {
		return transferTypeNameEn;
	}

	public void setTransferTypeNameEn(String transferTypeNameEn) {
		this.transferTypeNameEn = transferTypeNameEn;
	}

	public String getTransferTypeNameAr() {
		return transferTypeNameAr;
	}

	public void setTransferTypeNameAr(String transferTypeNameAr) {
		this.transferTypeNameAr = transferTypeNameAr;
	}

	public String getChannelNameEn() {
		return channelNameEn;
	}

	public void setChannelNameEn(String channelNameEn) {
		this.channelNameEn = channelNameEn;
	}

	public String getBankNameEn() {
		return bankNameEn;
	}

	public void setBankNameEn(String bankNameEn) {
		this.bankNameEn = bankNameEn;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public double getTransferAmountInKd() {
		return transferAmountInKd;
	}

	public void setTransferAmountInKd(double transferAmountInKd) {
		this.transferAmountInKd = transferAmountInKd;
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getTransferStatusTypeNameEn() {
		return transferStatusTypeNameEn;
	}

	public void setTransferStatusTypeNameEn(String transferStatusTypeNameEn) {
		this.transferStatusTypeNameEn = transferStatusTypeNameEn;
	}

	public String getTransferStatusTypeNameAr() {
		return transferStatusTypeNameAr;
	}

	public void setTransferStatusTypeNameAr(String transferStatusTypeNameAr) {
		this.transferStatusTypeNameAr = transferStatusTypeNameAr;
	}

	public int getTransferStatusTypeId() {
		return transferStatusTypeId;
	}

	public void setTransferStatusTypeId(int transferStatusTypeId) {
		this.transferStatusTypeId = transferStatusTypeId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getRoundedAmount() {
		return roundedAmount;
	}

	public void setRoundedAmount(int roundedAmount) {
		this.roundedAmount = roundedAmount;
	}

	public int getTransferTypeId() {
		return transferTypeId;
	}

	public void setTransferTypeId(int transferTypeId) {
		this.transferTypeId = transferTypeId;
	}

	public int getTransferCurrencyId() {
		return transferCurrencyId;
	}

	public void setTransferCurrencyId(int transferCurrencyId) {
		this.transferCurrencyId = transferCurrencyId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCurrencyNameEn() {
		return currencyNameEn;
	}

	public void setCurrencyNameEn(String currencyNameEn) {
		this.currencyNameEn = currencyNameEn;
	}

	public String getCurrencyNameAr() {
		return currencyNameAr;
	}

	public void setCurrencyNameAr(String currencyNameAr) {
		this.currencyNameAr = currencyNameAr;
	}

}
