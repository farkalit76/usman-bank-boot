/**
 * @Copyright reserved to bank
 */
package com.usman.bank.account.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usman.bank.models.UserDTO;
import com.usman.bank.account.exception.UserException;
import com.usman.bank.account.repository.UserRepository;
import com.usman.bank.account.service.UserService;

/**
 * Description: This class UserServiceImpl.java
 *
 * @author vXebiau
 * @date Oct 28, 2019
 * @version 1.0
 *
 */
@Service
public class UserServiceImpl implements UserService {

	private static final Logger LOG = LogManager.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDTO getUserByBooqId(String booqId) throws UserException {
		LOG.debug("UserServiceImpl.getUserByBooqId started...");
		return userRepository.getUserByBooqId(booqId);
	}

}
