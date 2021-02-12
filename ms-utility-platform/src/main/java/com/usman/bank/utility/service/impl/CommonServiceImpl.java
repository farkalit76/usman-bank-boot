/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usman.bank.models.CurrencyDTO;
import com.usman.bank.utility.exception.UtilityServicesException;
import com.usman.bank.utility.repository.CommonRepository;
import com.usman.bank.utility.request.EmailReq;
import com.usman.bank.utility.service.CommonService;
import com.usman.bank.utility.utils.EmailSender;

/**
 * Description: This class CommonServiceImpl.java
 *
 * @author vXebiau
 * @date Nov 7, 2019
 * @version 1.0
 *
 */
@Service
public class CommonServiceImpl implements CommonService {

	private static final Logger LOG = LogManager.getLogger(CommonServiceImpl.class);

	@Autowired
	private CommonRepository commonRepository;

	@Autowired
	private EmailSender emailSender;
	
	@Override
	public List<CurrencyDTO> getCurrencies() {
		LOG.info("CommonServiceImpl.getCurrencies...");
		return commonRepository.getCurrencies();
	}

	@Override
	public boolean sendEmail(EmailReq emailReq) throws UtilityServicesException {
		try {
			emailSender.sendEmail(emailReq);
		} catch (Exception e) {
			LOG.error("Error sending email.."+e.getMessage());
			throw new UtilityServicesException(e.getMessage());
		}
		return true;
	}

}
