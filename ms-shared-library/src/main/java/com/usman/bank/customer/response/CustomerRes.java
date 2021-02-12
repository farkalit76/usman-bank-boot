/**
 * @Copyright reserved to bank
 */
package com.usman.bank.customer.response;

import java.util.List;

import com.usman.bank.models.CustomersDTO;

/**
 * Description: This class CustomerRes.java
 *
 * @author vXebiau
 * @date Jun 27, 2019
 * @version 1.0
 *
 */
public class CustomerRes {

	private List<CustomersDTO> customerList;

	public List<CustomersDTO> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<CustomersDTO> customerList) {
		this.customerList = customerList;
	}

	@Override
	public String toString() {
		return "CustomerRS [customerList=" + customerList + "]";
	}
}
