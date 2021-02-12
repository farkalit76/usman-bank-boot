package com.usman.bank.models;

import java.io.Serializable;

public class CurrencyConverationDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer fromCurrencyCode; //@ol_from_acc_cy                     
	private Double fromAmount; //@odec_from_amount                 
	private Double fromEchangeRate; //@odec_from_exch_rate              
	private Integer toCurrencyCode; //@ol_to_acc_cy                       
	private Double toAmount; //@odec_to_amount                     
	private Double toExchangeRate; //@odec_to_exch_rate               
	private Double crossRate; //@odec_cross_rate                 
	private Double amount; //@odec_trs_amount
	private String formattedFromAmount;
	private String formattedToAmount;
	private String formattedAmount;
	private Integer currencyID;
	private CurrencyDTO fromCurrencyDTO;
	private CurrencyDTO toCurrencyDTO;

	public Integer getCurrencyID() {
		return currencyID;
	}
	public void setCurrencyID(Integer currencyID) {
		this.currencyID = currencyID;
	}
	public Integer getFromCurrencyCode() {
		return fromCurrencyCode;
	}
	public void setFromCurrencyCode(Integer fromCurrencyCode) {
		this.fromCurrencyCode = fromCurrencyCode;
	}
	public Double getFromAmount() {
		return fromAmount;
	}
	public void setFromAmount(Double fromAmount) {
		this.fromAmount = fromAmount;
	}
	public Double getFromEchangeRate() {
		return fromEchangeRate;
	}
	public void setFromEchangeRate(Double fromEchangeRate) {
		this.fromEchangeRate = fromEchangeRate;
	}
	public Integer getToCurrencyCode() {
		return toCurrencyCode;
	}
	public void setToCurrencyCode(Integer toCurrencyCode) {
		this.toCurrencyCode = toCurrencyCode;
	}
	public Double getToAmount() {
		return toAmount;
	}
	public void setToAmount(Double toAmount) {
		this.toAmount = toAmount;
	}
	public Double getToExchangeRate() {
		return toExchangeRate;
	}
	public void setToExchangeRate(Double toExchangeRate) {
		this.toExchangeRate = toExchangeRate;
	}
	public Double getCrossRate() {
		return crossRate;
	}
	public void setCrossRate(Double crossRate) {
		this.crossRate = crossRate;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public void setFormattedFromAmount(String formattedFromAmount) {
		this.formattedFromAmount = formattedFromAmount;
	}
	public void setFormattedToAmount(String formattedToAmount) {
		this.formattedToAmount = formattedToAmount;
	}
	public void setFormattedAmount(String formattedAmount) {
		this.formattedAmount = formattedAmount;
	}
	public String getFormattedFromAmount() {
		return formattedFromAmount;
	}
	public String getFormattedToAmount() {
		return formattedToAmount;
	}
	public String getFormattedAmount() {
		return formattedAmount;
	}
	
	public CurrencyDTO getFromCurrencyDTO() {
		return fromCurrencyDTO;
	}
	public void setFromCurrencyDTO(CurrencyDTO fromCurrencyDTO) {
		this.fromCurrencyDTO = fromCurrencyDTO;
	}
	public CurrencyDTO getToCurrencyDTO() {
		return toCurrencyDTO;
	}
	public void setToCurrencyDTO(CurrencyDTO toCurrencyDTO) {
		this.toCurrencyDTO = toCurrencyDTO;
	}
		
} //CurrencyOutDTO
