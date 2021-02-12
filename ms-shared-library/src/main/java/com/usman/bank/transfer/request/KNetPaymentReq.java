/**
 * 
 */
package com.usman.bank.transfer.request;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

/**
 * Description: This class KNetPaymentReq.java
 *
 * @author vXebiau
 * @date Nov 19, 2019
 * @version 1.0
 *
 */
public class KNetPaymentReq implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	protected Long bbynPaymentId;

	@NotNull
	protected String bbynTrackId;

	@NotNull
	protected String cif;

	@NotNull
	protected Integer custId;

	protected BigDecimal amountInKwd;
	protected String fromAccount;
	protected String toAccount;
	protected Integer stage;
	protected Integer status;
	protected String bbynRefId;
	protected Integer transferTypeId;
	protected Integer isSmsSent;
	
	protected TokenReq tokenReq;

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

	public BigDecimal getAmountInKwd() {
		return amountInKwd;
	}

	public void setAmountInKwd(BigDecimal amountInKwd) {
		this.amountInKwd = amountInKwd;
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

	public String getBbynRefId() {
		return bbynRefId;
	}

	public void setBbynRefId(String bbynRefId) {
		this.bbynRefId = bbynRefId;
	}

	public TokenReq getTokenReq() {
		return tokenReq;
	}

	public void setTokenReq(TokenReq tokenReq) {
		this.tokenReq = tokenReq;
	}

	public Integer getTransferTypeId() {
		return transferTypeId;
	}

	public void setTransferTypeId(Integer transferTypeId) {
		this.transferTypeId = transferTypeId;
	}

	public Integer getIsSmsSent() {
		return isSmsSent;
	}

	public void setIsSmsSent(Integer isSmsSent) {
		this.isSmsSent = isSmsSent;
	}

	@Override
	public String toString() {
		return "KNetPaymentReq [bbynPaymentId=" + bbynPaymentId + ", bbynTrackId=" + bbynTrackId + ", cif=" + cif
				+ ", custId=" + custId + ", amountInKwd=" + amountInKwd + ", fromAccount=" + fromAccount
				+ ", toAccount=" + toAccount + ", stage=" + stage + ", status=" + status + ", bbynRefId=" + bbynRefId
				+ ", transferTypeId=" + transferTypeId + ", isSmsSent=" + isSmsSent + ", tokenReq=" + tokenReq + "]";
	}

}
