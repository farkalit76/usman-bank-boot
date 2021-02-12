/**
 * @Copyright reserved to bank
 */
package com.usman.bank.models;

import java.io.Serializable;

/**
 * Description: This class CurrencyDTO.java
 *
 * @author  vXebiau
 * @date    Jul 9, 2019
 * @version 1.0
 *
 */
public class CurrencyDTO implements Serializable{

	/**
	 * serial version id
	 */
	private static final long serialVersionUID = 1L;

	private Integer currenyId;
	private String currencyName;
	private String currencyNameEn;
	private String currencyNameAr;
	private Integer isoCurrencyCode;
	private String currencyLongName;
	private String currencyLongNameEn;
	private String currencyLongNameAr;
	private String currencyConverterLongNameAr;
	private Integer fraction;
	private String isoCurrencyCodeStr ;
	//Ahamed Fozil added for the purpose of International Beneficiary
	private String correspondentBIC;
	private Double minOpeningBalance ;
	private Double equivalentAmount ;
	private String currencyExchangeLabel;
	private String formattedAmount ;
	private Double equivalentOpeningBalance ;
	
	
	public Integer getCurrenyId() {
		return currenyId;
	}
	public void setCurrenyId(Integer currenyId) {
		this.currenyId = currenyId;
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
	public Integer getIsoCurrencyCode() {
		return isoCurrencyCode;
	}
	
	public String getIsoImage() {
		return (currencyNameEn!=null)?currencyNameEn.substring(0, 2)+"_":"";
	}
	
	public void setIsoCurrencyCode(Integer isoCurrencyCode) {
		this.isoCurrencyCode = isoCurrencyCode;
	}
	public String getCurrencyLongNameEn() {
		return currencyLongNameEn;
	}
	public void setCurrencyLongNameEn(String currencyLongNameEn) {
		this.currencyLongNameEn = currencyLongNameEn;
	}
	public String getCurrencyLongNameAr() {
		return currencyLongNameAr;
	}
	public void setCurrencyLongNameAr(String currencyLongNameAr) {
		this.currencyLongNameAr = currencyLongNameAr;
	}
	public Integer getFraction() {
		return fraction;
	}
	public void setFraction(Integer fraction) {
		this.fraction = fraction;
	}

	public String getCorrespondentBIC() {
		return correspondentBIC;
	}
	public void setCorrespondentBIC(String correspondentBIC) {
		this.correspondentBIC = correspondentBIC;
	}
	
	public String getCurrencyName() {
		return currencyName;
	}
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	
	
	public String getCurrencyLongName() {
		return currencyLongName;
	}
	public void setCurrencyLongName(String currencyLongName) {
		this.currencyLongName = currencyLongName;
	}
	@Override
	public String toString() {
		return "CurrencyDTO [currencyLongNameAr=" + currencyLongNameAr
				+ ", currencyLongNameEn=" + currencyLongNameEn
				+ ", currencyNameAr=" + currencyNameAr + ", currencyNameEn="
				+ currencyNameEn + ", currenyId=" + currenyId + ", fraction="
				+ fraction + ", isoCurrencyCode=" + isoCurrencyCode + "]";
	}
	
	public String getIsoCurrencyCodeStr() {
		return isoCurrencyCodeStr;
	}
	public void setIsoCurrencyCodeStr(String isoCurrencyCodeStr) {
		this.isoCurrencyCodeStr = isoCurrencyCodeStr;
	}
	public Double getMinOpeningBalance() {
		return minOpeningBalance;
	}
	public void setMinOpeningBalance(Double minOpeningBalance) {
		this.minOpeningBalance = minOpeningBalance;
	}
	public Double getEquivalentAmount() {
		return equivalentAmount;
	}
	public void setEquivalentAmount(Double equivalentAmount) {
		this.equivalentAmount = equivalentAmount;
	}
	public void setCurrencyExchangeLabel(String currencyExchangeLabel) {
		this.currencyExchangeLabel = currencyExchangeLabel;
	}
	public String getCurrencyExchangeLabel() {
		return currencyExchangeLabel;
	}
	public String getFormattedAmount() {
		return formattedAmount;
	}
	public void setFormattedAmount(String formattedAmount) {
		this.formattedAmount = formattedAmount;
	}
	public Double getEquivalentOpeningBalance() {
		return equivalentOpeningBalance;
	}
	public void setEquivalentOpeningBalance(Double equivalentOpeningBalance) {
		this.equivalentOpeningBalance = equivalentOpeningBalance;
	}
	public String getCurrencyConverterLongNameAr() {
		return currencyConverterLongNameAr;
	}
	public void setCurrencyConverterLongNameAr(String currencyConverterLongNameAr) {
		this.currencyConverterLongNameAr = currencyConverterLongNameAr;
	}
}
