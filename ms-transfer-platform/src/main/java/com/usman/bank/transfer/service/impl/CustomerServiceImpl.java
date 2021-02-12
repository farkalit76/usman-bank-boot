/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usman.bank.models.CustomersDTO;
import com.usman.bank.transfer.exception.CustomerException;
import com.usman.bank.transfer.repository.CustomerRepository;
import com.usman.bank.transfer.service.CustomerService;

/**
 * Description: This class CustomerServiceImpl.java
 *
 * @author  vXebiau
 * @date    Dec 9, 2019
 * @version 1.0
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService{

	private static final Logger LOG = LogManager.getLogger(CustomerServiceImpl.class);

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public CustomersDTO getCustomerByCIF(String cif) throws CustomerException {
		LOG.debug("CustomerServiceImpl getCustomerByCIF...cif:{}", cif);
		return customerRepository.getCustomerByCif(cif);
	}
}
