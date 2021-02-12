/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usman.bank.models.CurrencyDTO;
import com.usman.bank.utils.Utility;
import com.usman.bank.transfer.exception.CommonException;
import com.usman.bank.transfer.repository.CommonRepository;
import com.usman.bank.transfer.service.CommonService;

/**
 * Description: This class CommonServiceImpl.java
 *
 * @author vXebiau
 * @date Dec 9, 2019
 * @version 1.0
 *
 */
@Service
public class CommonServiceImpl implements CommonService {

	private static final Logger LOG = LogManager.getLogger(CommonServiceImpl.class);

	@Autowired
	private CommonRepository commonRepository;

	@Override
	public CurrencyDTO getCurrencies(int currencyId) throws CommonException {
		LOG.debug("CommonServiceImpl.getCurrencies started..");
		CurrencyDTO currencyDto = new CurrencyDTO();
		List<CurrencyDTO> currencyList = commonRepository.getCurrencies();
		if (!Utility.isEmpty(currencyList) && !currencyList.isEmpty()) {
			currencyDto = currencyList.stream().filter(x -> x.getCurrenyId().equals(currencyId)).findFirst()
					.orElse(null);
			LOG.debug("CommonServiceImpl.currencyDto:" + currencyDto);
		}
		return currencyDto;
	}

}
