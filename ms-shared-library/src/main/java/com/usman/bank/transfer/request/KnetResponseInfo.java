/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.request;

import java.io.Serializable;

/**
 * Description: This class KnetResponseInfo.java
 *
 * @author vXebiau
 * @date Dec 17, 2019
 * @version 1.0
 *
 */
public class KnetResponseInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String amt;
	protected String auth;
	protected String authRespCode;
	protected String avr;
	protected String kmsid;
	protected String paymentid;
	protected String postdate;
	protected String ref;
	protected String result;
	protected String trackid;
	protected String trandata;
	protected String udf1;
	protected String udf2;
	protected String udf3;
	protected String udf4;
	protected String udf5;
	/**
	 * @return the amt
	 */
	public String getAmt() {
		return amt;
	}
	/**
	 * @param amt the amt to set
	 */
	public void setAmt(String amt) {
		this.amt = amt;
	}
	/**
	 * @return the auth
	 */
	public String getAuth() {
		return auth;
	}
	/**
	 * @param auth the auth to set
	 */
	public void setAuth(String auth) {
		this.auth = auth;
	}
	/**
	 * @return the authRespCode
	 */
	public String getAuthRespCode() {
		return authRespCode;
	}
	/**
	 * @param authRespCode the authRespCode to set
	 */
	public void setAuthRespCode(String authRespCode) {
		this.authRespCode = authRespCode;
	}
	/**
	 * @return the avr
	 */
	public String getAvr() {
		return avr;
	}
	/**
	 * @param avr the avr to set
	 */
	public void setAvr(String avr) {
		this.avr = avr;
	}
	/**
	 * @return the kmsid
	 */
	public String getKmsid() {
		return kmsid;
	}
	/**
	 * @param kmsid the kmsid to set
	 */
	public void setKmsid(String kmsid) {
		this.kmsid = kmsid;
	}
	/**
	 * @return the paymentid
	 */
	public String getPaymentid() {
		return paymentid;
	}
	/**
	 * @param paymentid the paymentid to set
	 */
	public void setPaymentid(String paymentid) {
		this.paymentid = paymentid;
	}
	/**
	 * @return the postdate
	 */
	public String getPostdate() {
		return postdate;
	}
	/**
	 * @param postdate the postdate to set
	 */
	public void setPostdate(String postdate) {
		this.postdate = postdate;
	}
	/**
	 * @return the ref
	 */
	public String getRef() {
		return ref;
	}
	/**
	 * @param ref the ref to set
	 */
	public void setRef(String ref) {
		this.ref = ref;
	}
	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}
	/**
	 * @return the trackid
	 */
	public String getTrackid() {
		return trackid;
	}
	/**
	 * @param trackid the trackid to set
	 */
	public void setTrackid(String trackid) {
		this.trackid = trackid;
	}
	/**
	 * @return the trandata
	 */
	public String getTrandata() {
		return trandata;
	}
	/**
	 * @param trandata the trandata to set
	 */
	public void setTrandata(String trandata) {
		this.trandata = trandata;
	}
	/**
	 * @return the udf1
	 */
	public String getUdf1() {
		return udf1;
	}
	/**
	 * @param udf1 the udf1 to set
	 */
	public void setUdf1(String udf1) {
		this.udf1 = udf1;
	}
	/**
	 * @return the udf2
	 */
	public String getUdf2() {
		return udf2;
	}
	/**
	 * @param udf2 the udf2 to set
	 */
	public void setUdf2(String udf2) {
		this.udf2 = udf2;
	}
	/**
	 * @return the udf3
	 */
	public String getUdf3() {
		return udf3;
	}
	/**
	 * @param udf3 the udf3 to set
	 */
	public void setUdf3(String udf3) {
		this.udf3 = udf3;
	}
	/**
	 * @return the udf4
	 */
	public String getUdf4() {
		return udf4;
	}
	/**
	 * @param udf4 the udf4 to set
	 */
	public void setUdf4(String udf4) {
		this.udf4 = udf4;
	}
	/**
	 * @return the udf5
	 */
	public String getUdf5() {
		return udf5;
	}
	/**
	 * @param udf5 the udf5 to set
	 */
	public void setUdf5(String udf5) {
		this.udf5 = udf5;
	}
	@Override
	public String toString() {
		return "KnetResponseInfo [amt=" + amt + ", auth=" + auth + ", authRespCode=" + authRespCode + ", avr=" + avr
				+ ", kmsid=" + kmsid + ", paymentid=" + paymentid + ", postdate=" + postdate + ", ref=" + ref
				+ ", result=" + result + ", trackid=" + trackid + ", trandata=" + trandata + ", udf1=" + udf1
				+ ", udf2=" + udf2 + ", udf3=" + udf3 + ", udf4=" + udf4 + ", udf5=" + udf5 + "]";
	}
	
}
