/**
 * @Copyright reserved to bank
 */
package com.usman.bank.dashboard.request;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Description: This class PayInfo.java
 *
 * @author  vXebiau
 * @date    Dec 16, 2019
 * @version 1.0
 *
 */
public class PayInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected Long bbynPaymentId;
	protected String bbynTrackId;
	protected String cif;
	protected Integer custId;
	protected BigDecimal amountInKwd;
	protected String fromAccount;
	protected String toAccount;
	protected Integer stage;
	protected Integer status;
	protected String bbynRefId;
	protected Integer transferTypeId;
	protected Integer isSmsSent;
	protected String comment;
	protected String tokenReq;
	/**
	 * @return the bbynPaymentId
	 */
	public Long getBbynPaymentId() {
		return bbynPaymentId;
	}
	/**
	 * @param bbynPaymentId the bbynPaymentId to set
	 */
	public void setBbynPaymentId(Long bbynPaymentId) {
		this.bbynPaymentId = bbynPaymentId;
	}
	/**
	 * @return the bbynTrackId
	 */
	public String getBbynTrackId() {
		return bbynTrackId;
	}
	/**
	 * @param bbynTrackId the bbynTrackId to set
	 */
	public void setBbynTrackId(String bbynTrackId) {
		this.bbynTrackId = bbynTrackId;
	}
	/**
	 * @return the cif
	 */
	public String getCif() {
		return cif;
	}
	/**
	 * @param cif the cif to set
	 */
	public void setCif(String cif) {
		this.cif = cif;
	}
	/**
	 * @return the custId
	 */
	public Integer getCustId() {
		return custId;
	}
	/**
	 * @param custId the custId to set
	 */
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	/**
	 * @return the amountInKwd
	 */
	public BigDecimal getAmountInKwd() {
		return amountInKwd;
	}
	/**
	 * @param amountInKwd the amountInKwd to set
	 */
	public void setAmountInKwd(BigDecimal amountInKwd) {
		this.amountInKwd = amountInKwd;
	}
	/**
	 * @return the fromAccount
	 */
	public String getFromAccount() {
		return fromAccount;
	}
	/**
	 * @param fromAccount the fromAccount to set
	 */
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	/**
	 * @return the toAccount
	 */
	public String getToAccount() {
		return toAccount;
	}
	/**
	 * @param toAccount the toAccount to set
	 */
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	/**
	 * @return the stage
	 */
	public Integer getStage() {
		return stage;
	}
	/**
	 * @param stage the stage to set
	 */
	public void setStage(Integer stage) {
		this.stage = stage;
	}
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * @return the bbynRefId
	 */
	public String getBbynRefId() {
		return bbynRefId;
	}
	/**
	 * @param bbynRefId the bbynRefId to set
	 */
	public void setBbynRefId(String bbynRefId) {
		this.bbynRefId = bbynRefId;
	}
	/**
	 * @return the transferTypeId
	 */
	public Integer getTransferTypeId() {
		return transferTypeId;
	}
	/**
	 * @param transferTypeId the transferTypeId to set
	 */
	public void setTransferTypeId(Integer transferTypeId) {
		this.transferTypeId = transferTypeId;
	}
	/**
	 * @return the isSmsSent
	 */
	public Integer getIsSmsSent() {
		return isSmsSent;
	}
	/**
	 * @param isSmsSent the isSmsSent to set
	 */
	public void setIsSmsSent(Integer isSmsSent) {
		this.isSmsSent = isSmsSent;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 * @return the tokenReq
	 */
	public String getTokenReq() {
		return tokenReq;
	}
	/**
	 * @param tokenReq the tokenReq to set
	 */
	public void setTokenReq(String tokenReq) {
		this.tokenReq = tokenReq;
	}
	@Override
	public String toString() {
		return "Payinfo [bbynPaymentId=" + bbynPaymentId + ", bbynTrackId=" + bbynTrackId + ", cif=" + cif + ", custId="
				+ custId + ", amountInKwd=" + amountInKwd + ", fromAccount=" + fromAccount + ", toAccount=" + toAccount
				+ ", stage=" + stage + ", status=" + status + ", bbynRefId=" + bbynRefId + ", transferTypeId="
				+ transferTypeId + ", isSmsSent=" + isSmsSent + ", comment=" + comment + ", tokenReq=" + tokenReq + "]";
	}
	
}
