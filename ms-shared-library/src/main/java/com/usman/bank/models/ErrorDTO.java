/**
 * @Copyright reserved to bank
 */
package com.usman.bank.models;

import java.io.Serializable;

import com.usman.bank.constants.Constants.*;

/**
 * Description: This class ErrorDTO.java
 *
 * @author  vXebiau
 * @date    Jul 9, 2019
 * @version 1.0
 *
 */
public class ErrorDTO<T> implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String errorCode;
	private int httpErrorCode ;
	private String errorTitle;
	private String errorDescriptionEn;
	private String errorDescriptionAr;
	private String errorDescription;
	private String results;
	private String refOne;
	private String refTwo;
	private Long transactionTrackingNumber;
	private T outData;
	private Boolean isRefunded;
	private String httpResponseMsg ;
	
	public ErrorDTO() {
		
	}
	
	public ErrorDTO(String errorCode) {
		this.setErrorCode(errorCode);
	}
	
	public ErrorDTO(String errorCode, String errorDescEn, String errorDescAr) {
		this.errorCode =errorCode;
		this.errorDescriptionEn= errorDescEn;
		this.errorDescriptionAr= errorDescAr;
	}
	
	public T getOutData() {
		return outData;
	}
	public void setOutData(T outData) {
		this.outData = outData;
	}
	public String getRefOne() {
		return refOne;
	}
	public void setRefOne(String refOne) {
		this.refOne = refOne;
	}
	public String getRefTwo() {
		return refTwo;
	}
	public void setRefTwo(String refTwo) {
		this.refTwo = refTwo;
	}
	public String getErrorDescription() {
		return errorDescription;
	}
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorDescriptionEn() {
		return errorDescriptionEn;
	}
	public void setErrorDescriptionEn(String errorDescriptionEn) {
		this.errorDescriptionEn = errorDescriptionEn;
	}
	public String getErrorDescriptionAr() {
		return errorDescriptionAr;
	}
	public void setErrorDescriptionAr(String errorDescriptionAr) {
		this.errorDescriptionAr = errorDescriptionAr;
	}
	public String getResults() {
		return results;
	}
	public void setResults(String results) {
		this.results = results;
	}
	
	public Boolean isClean() {
		return (errorCode!=null && errorCode.equals(ErrorCodes.SUCCESS));
	}
	
	public void setIsClean(Boolean isClean) {
		if (isClean)
			setErrorCode(ErrorCodes.SUCCESS);
		else
			setErrorCode(ErrorCodes.FAILED);
	}
	
	

	public Long getTransactionTrackingNumber() {
		return transactionTrackingNumber;
	}
	public void setTransactionTrackingNumber(Long transactionTrackingNumber) {
		this.transactionTrackingNumber = transactionTrackingNumber;
	}
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("[ErrorCode=").append(errorCode).append(", ");
		sb.append("errorDescriptionAr=").append(errorDescriptionAr).append(", ");
		sb.append("errorDescriptionEn=").append(errorDescriptionEn).append(", ");
		sb.append("referenceNo=").append(refOne).append(", ");
		sb.append("olOpNo=").append(refTwo).append(", ");
		sb.append("transactionTrackingNumber=").append(transactionTrackingNumber).append(", ");
		sb.append("]");
		return sb.toString();
		
//		return "ErrorDTO [errorCode=" + errorCode + ", errorDescriptionAr="
//				+ errorDescriptionAr + ", errorDescriptionEn="
//				+ errorDescriptionEn + ", results=" + results + "]";
	}
	public void setIsRefunded(Boolean isRefunded) {
		this.isRefunded = isRefunded;
	}
	public Boolean getIsRefunded() {
		return isRefunded;
	}

	public String getErrorTitle() {
		return errorTitle;
	}

	public void setErrorTitle(String errorTitle) {
		this.errorTitle = errorTitle;
	}

	public int getHttpErrorCode() {
		return httpErrorCode;
	}

	public void setHttpErrorCode(int httpErrorCode) {
		this.httpErrorCode = httpErrorCode;
	}

	public String getHttpResponseMsg() {
		return httpResponseMsg;
	}

	public void setHttpResponseMsg(String httpResponseMsg) {
		this.httpResponseMsg = httpResponseMsg;
	}
}
