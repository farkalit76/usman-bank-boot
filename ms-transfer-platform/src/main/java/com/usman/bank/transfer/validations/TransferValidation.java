/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.validations;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.usman.bank.constants.Constants;
import com.usman.bank.models.AccountDTO;
import com.usman.bank.models.CurrencyDTO;
import com.usman.bank.models.CustomersDTO;
import com.usman.bank.models.ErrorDTO;
import com.usman.bank.utils.Utility;
import com.usman.bank.transfer.request.TransferKNetReq;

/**
 * Description: This class TransferValidation.java
 *
 * @author vXebiau
 * @date Nov 7, 2019
 * @version 1.0
 *
 */
@Component
public class TransferValidation {

	private static final Logger LOG = LogManager.getLogger(TransferValidation.class);

	private TransferValidation() {
	}

	/**
	 * @param knetReq
	 * @return
	 */
	public static ErrorDTO<String> validateInput(@Valid TransferKNetReq knetReq) {
		LOG.debug("validating KNet inputs values...");
		ErrorDTO<String> errorDTO = new ErrorDTO<String>();

		try {

			if (Utility.isEmpty(knetReq.getToAccount())) {
				errorDTO.setErrorDescription("error_select_account_required");
				return errorDTO;
			}

			// from account
			if (Utility.isEmpty(knetReq.getFromAccount())) {
				errorDTO.setErrorDescription("error_select_from_account_required");
				return errorDTO;
			}

			if (Utility.isEmpty(knetReq.getCurrencyId()) || knetReq.getCurrencyId() != 1) {
				errorDTO.setErrorDescription("service_local_currency_Id_only");
				return errorDTO;
			}

			// check transaction amount
			if (Utility.isEmpty(knetReq.getTransactionAmount())
					|| Double.parseDouble(knetReq.getTransactionAmount()) <= 0) {
				errorDTO.setErrorDescription("ERROR_CODES.TRANS_AMOUNT_IS_REQUIRED");
				return errorDTO;
			}

			if (knetReq.getServiceId() == Constants.Services.PAY_ME_SHARE) {
				if (Utility.isEmpty(knetReq.getMobileNo())) {
					errorDTO.setErrorDescription("error_invalid_mobile_no");
					return errorDTO;
				}
				if (Utility.isEmpty(knetReq.getComment()) && knetReq.getComment().length() > 200) {
					errorDTO.setErrorDescription("payme_comments_length");
					return errorDTO;
				}
			}
		} catch (Exception e) {
			errorDTO.setErrorDescription("Exception Found:" + e.getMessage());
			return errorDTO;
		}
		return errorDTO;
	}

	/**
	 * @param customersDto
	 * @param accountDto
	 * @param currencyDto
	 */
	public static ErrorDTO<String> validateCustomerAccount(CustomersDTO customerDto, AccountDTO accountDto,
			CurrencyDTO currencyDto) {
		LOG.debug("validating KNet Customer Account values...");
		ErrorDTO<String> errorDTO = new ErrorDTO<>();
		try {
			if (Utility.isEmpty(customerDto) || Utility.isEmpty(customerDto.getCif())) {
				errorDTO.setErrorDescription("Customer_Not Found");
				return errorDTO;
			}
			// validate the existence and validity
			if (Utility.isEmpty(accountDto) || Utility.isEmpty(accountDto.getAccountNumber())) {
				errorDTO.setErrorDescription("Account_For_Customer_Not Found");
				/** errorDTO.setErrorDescription("ERROR_CODES.INVALID_FROM_ACCOUNT_NUMBER"); */
				return errorDTO;
			}
			if (Utility.isEmpty(currencyDto) || Utility.isEmpty(currencyDto.getCurrenyId())) {
				errorDTO.setErrorDescription("Currency_Not Found");
				return errorDTO;
			}
		} catch (Exception e) {
			errorDTO.setErrorDescription("Exception Found:" + e.getMessage());
			return errorDTO;
		}
		return errorDTO;
	}

}
