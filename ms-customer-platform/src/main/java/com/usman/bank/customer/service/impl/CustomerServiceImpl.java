/**
 * @Copyright reserved to bank
 */
package com.usman.bank.customer.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.usman.bank.constants.Constants.Actions;
import com.usman.bank.constants.Constants.LockReason;
import com.usman.bank.constants.Constants.Services;
import com.usman.bank.constants.Constants.UserStatus;
import com.usman.bank.customer.exception.CustomerException;
import com.usman.bank.customer.repository.CustomerRepository;
import com.usman.bank.customer.service.CustomerService;
import com.usman.bank.models.CustomerProfilesDTO;
import com.usman.bank.models.CustomersDTO;
import com.usman.bank.models.LogMasterDTO;
import com.usman.bank.utils.Utility;

/**
 * Description: This class CustomerServiceImpl.java
 *
 * @author vXebiau
 * @date Sep 08, 2019
 * @version 1.0
 *
 */
@Service
public class CustomerServiceImpl extends BaseService implements CustomerService {

	private static final Logger LOG = LogManager.getLogger(CustomerServiceImpl.class);

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public boolean resetLogin(String cifNumber) throws CustomerException {
		LOG.debug("CustomerServiceImpl resetLogin...cifNumber:{}", cifNumber);
		CustomersDTO customerDTO = customerRepository.getCustomerByCif(cifNumber);
		if (!Utility.isEmpty(customerDTO) && checkCustomerStatus(customerDTO)) {
			LogMasterDTO masterLogDTO = null;
			boolean transStatus = false;
			try {
				LOG.debug("Status ID:{}", customerDTO.getStatusId());
				Integer updateStatus = customerRepository.updateUserStatus(UserStatus.LOCKED, LockReason.USER_IS_ACTIVE, customerDTO.getCustId());
				LOG.debug("update User Status:{}", updateStatus);
				if (updateStatus == 1)
					transStatus = true;
				// Audit Reset Login
				Map<Integer, Object> logFieldsValues = getCustLogFieldsValues(customerDTO, Services.CUSTOMERS_RESET_LOGIN);
				masterLogDTO = new LogMasterDTO(customerDTO.getCustId(), Services.CUSTOMERS_RESET_LOGIN, Actions.RESET, logFieldsValues, null);
				masterLogDTO = getLogMaster(cifNumber, masterLogDTO, transStatus, null);
				audit(masterLogDTO);
			} catch (Exception ex) {
				// Audit Reset Login
				Utility.logMe(ex);
				masterLogDTO = getLogMaster(cifNumber, masterLogDTO, transStatus, ex);
				audit(masterLogDTO);
			}
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Integer updateUserStatus(int statusId, int lockReasonId, int custId) throws CustomerException {
		LOG.debug("CustomerServiceImpl updateUserStatus...custId:{}", custId);
		return customerRepository.updateUserStatus(statusId, lockReasonId, custId);
	}

	@Override
	public CustomersDTO getCustomerByCIF(String cif) throws CustomerException {
		LOG.debug("CustomerServiceImpl getCustomerByCIF...cif:{}", cif);
		return customerRepository.getCustomerByCif(cif);
	}

	@Override
	public CustomerProfilesDTO getCustomerProfileByCustId(String custId) {
		LOG.debug("CustomerServiceImpl getCustomerProfileByCustId...custId:{}", custId);
		return customerRepository.getCustomerProfileByCustId(custId);
	}

	@Override
	// @Cacheable(value = "customerCache", unless = "#result.size() == 0" )
	@Cacheable(value = "customerCache", key = "'cust_'.concat('10')", unless = "#result.size() == 0")
	public List<CustomerProfilesDTO> getCustomerProfiles() throws CustomerException {
		LOG.debug("CustomerServiceImpl. getCustomerProfiles...");
		return customerRepository.getCustomerProfiles();
	}

//	@Override
//	public CustomerDTO getCustomerByCifNumber(String cifNumber) {
//		LOG.debug("CustomerServiceImpl getCustomerByCifNumber...cifNumber:{}", cifNumber);
//		return customerRepository.getCustomerByCifNumber(cifNumber);
//	}

	/**
	 * Check the status of the account
	 * 
	 * @param customerDTO
	 * @return
	 */
	private boolean checkCustomerStatus(CustomersDTO customerDTO) {

		if (customerDTO.getStatusId() == UserStatus.ACTIVE && (customerDTO.getLockReasonId() == LockReason.INVALID_TRANSACTION_PASSWORD
				|| customerDTO.getLockReasonId() == LockReason.RESET_BOTH)) {
			customerDTO.setLockReasonId(LockReason.RESET_BOTH);
		} else if (customerDTO.getStatusId() == UserStatus.ACTIVE) {
			customerDTO.setLockReasonId(LockReason.INVALID_LOGIN_PASSWORD);
		} else {
			return false;
		}
		LOG.debug("checkCustomerStatus: true");
		return true;
	}

}
