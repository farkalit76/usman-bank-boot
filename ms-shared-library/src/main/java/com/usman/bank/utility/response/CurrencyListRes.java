package com.usman.bank.utility.response;

import java.util.List;

import com.usman.bank.models.CurrencyDTO;

public class CurrencyListRes {

	private List<CurrencyDTO> currencyList;

	public List<CurrencyDTO> getCurrencyList() {
		return currencyList;
	}

	public void setCurrencyList(List<CurrencyDTO> currencyList) {
		this.currencyList = currencyList;
	}

	@Override
	public String toString() {
		return "CurrencyListRes [currencyList=" + currencyList + "]";
	}

}
