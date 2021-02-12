/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.request;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

/**
 * Description: This class TransferReq.java
 *
 * @author vXebiau
 * @date Oct 27, 2019
 * @version 1.0
 *
 */
public class TransferReq implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message = "Transfer amount cannot be null or empty.")
	protected BigDecimal transAmount;

	protected Integer localCurrencyId;

	protected Integer transTypeId;

	protected Integer cardlessTypeId;

	protected String cardlessToken;

	@NotNull(message = "Transfer account cannot be null or empty.")
	protected AccountReq fromAccount;

	protected AccountReq toAccount;

	protected int knetStageId;

	protected int knetStatusId;

	public Integer getLocalCurrencyId() {
		return localCurrencyId;
	}

	public void setLocalCurrencyId(Integer localCurrencyId) {
		this.localCurrencyId = localCurrencyId;
	}

	public Integer getTransTypeId() {
		return transTypeId;
	}

	public void setTransTypeId(Integer transTypeId) {
		this.transTypeId = transTypeId;
	}

	public Integer getCardlessTypeId() {
		return cardlessTypeId;
	}

	public void setCardlessTypeId(Integer cardlessTypeId) {
		this.cardlessTypeId = cardlessTypeId;
	}

	public String getCardlessToken() {
		return cardlessToken;
	}

	public void setCardlessToken(String cardlessToken) {
		this.cardlessToken = cardlessToken;
	}

	public BigDecimal getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(BigDecimal transAmount) {
		this.transAmount = transAmount;
	}

	public AccountReq getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(AccountReq fromAccount) {
		this.fromAccount = fromAccount;
	}

	public AccountReq getToAccount() {
		return toAccount;
	}

	public void setToAccount(AccountReq toAccount) {
		this.toAccount = toAccount;
	}

	public int getKnetStageId() {
		return knetStageId;
	}

	public void setKnetStageId(int knetStageId) {
		this.knetStageId = knetStageId;
	}

	public int getKnetStatusId() {
		return knetStatusId;
	}

	public void setKnetStatusId(int knetStatusId) {
		this.knetStatusId = knetStatusId;
	}

	@Override
	public String toString() {
		return "TransferReq{" + "localCurrencyId=" + localCurrencyId + ", transTypeId=" + transTypeId
				+ ", cardlessTypeId=" + cardlessTypeId + ", cardlessToken='" + cardlessToken + '\'' + ", transAmount="
				+ transAmount + ", fromAccount=" + fromAccount + ", toAccount=" + toAccount + ", knetStageId="
				+ knetStageId + ", knetStatusId=" + knetStatusId + '}';
	}
}
