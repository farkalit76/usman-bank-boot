/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.request;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Description: This class KNetPaymentByTrackIdReq.java
 *
 * @author  vXebiau
 * @date    Nov 28, 2019
 * @version 1.0
 *
 */
public class KNetPaymentResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String trandata; 
	
	protected String trackid; 
	
	protected String udf1; 
	
	protected String udf2; 
	
	protected String paymentId;
	
	protected Integer cifNumber;
	
	protected BigDecimal amount;

	public String getTrandata() {
		return trandata;
	}

	public void setTrandata(String trandata) {
		this.trandata = trandata;
	}

	public String getTrackid() {
		return trackid;
	}

	public void setTrackid(String trackid) {
		this.trackid = trackid;
	}

	public String getUdf1() {
		return udf1;
	}

	public void setUdf1(String udf1) {
		this.udf1 = udf1;
	}

	public String getUdf2() {
		return udf2;
	}

	public void setUdf2(String udf2) {
		this.udf2 = udf2;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	
	public Integer getCifNumber() {
		return cifNumber;
	}

	public void setCifNumber(Integer cifNumber) {
		this.cifNumber = cifNumber;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "KNetPaymentByTrackIdReq [trandata=" + trandata + ", udf1=" + udf1 + ", udf2=" + udf2 + ", paymentId="
				+ paymentId + "]";
	} 
	
}
