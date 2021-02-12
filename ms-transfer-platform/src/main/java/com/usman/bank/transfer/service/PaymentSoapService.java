/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.service;

import com.usman.bank.models.KNetTransferDTO;
import com.usman.bank.models.RequestDTO;
import com.usman.bank.payment.wsdl.WsApiUtilityPaymentOutDTO;
import com.usman.bank.transfer.exception.TransferException;

/**
 * Description: This class PaymentSoapService.java
 *
 * @author vXebiau
 * @date Nov 6, 2019
 * @version 1.0
 *
 */
public interface PaymentSoapService {

	/**
	 * Do KNET transfer
	 * 
	 * @param transferDto
	 * @param requestDTO
	 * @return
	 * @throws TransferException
	 */
	WsApiUtilityPaymentOutDTO creditCustomerAccount(KNetTransferDTO transferDto, RequestDTO requestDTO)
			throws TransferException;
}
