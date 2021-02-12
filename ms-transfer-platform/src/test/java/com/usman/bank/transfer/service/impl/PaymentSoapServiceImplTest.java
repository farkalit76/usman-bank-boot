/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.service.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.test.context.junit4.SpringRunner;

import com.usman.bank.models.AccountDTO;
import com.usman.bank.models.CurrencyDTO;
import com.usman.bank.models.CustomerTransactionDTO;
import com.usman.bank.models.CustomersDTO;
import com.usman.bank.models.KNetTransferDTO;
import com.usman.bank.models.RequestDTO;
import com.usman.bank.payment.wsdl.InstantDepositResponse;
import com.usman.bank.payment.wsdl.WsApiUtilityPaymentOutDTO;
import com.usman.bank.transfer.config.MsgTranslator;
import com.usman.bank.transfer.service.impl.PaymentSoapServiceImpl;
import com.usman.bank.transfer.soap.config.PaymentSoapClient;

/**
 * Description: This class PaymentSoapServiceImplTest.java
 *
 * @author vXebiau
 * @date Nov 27, 2019
 * @version 1.0
 *
 */
@RunWith(SpringRunner.class)
public class PaymentSoapServiceImplTest {

	@InjectMocks
	private PaymentSoapServiceImpl transferService;

	@Mock
	private ApplicationContext applicationContext;

	@Mock
	private PaymentSoapClient paymentClient;
	
	@Mock
	private MsgTranslator msgTranslator;
	
	@Mock
	private static ResourceBundleMessageSource messageSource;

	// private TransferDTO transferDto = new TransferDTO();
	private KNetTransferDTO transferDto = new KNetTransferDTO();
	private RequestDTO requestDTO = new RequestDTO();

	@Before
	public void init() {
		// set transfer dto
		CustomersDTO customer = new CustomersDTO();
		customer.setCif(80764L);
		AccountDTO account = new AccountDTO();
		account.setAccountNumber("11010101");
		account.setCurrencyCode(1);
		CurrencyDTO currency = new CurrencyDTO();
		currency.setIsoCurrencyCodeStr("414");
		account.setCurrency(currency);

		CustomerTransactionDTO transaction = new CustomerTransactionDTO();
		transaction.setTransAmountInKwd(11.00F);
		transaction.setTransferTypeId(121);

//		transferDto.setCustomerDTO(customer);
//		transferDto.setToAccountDTO(account);
//		transferDto.setCustomerTransactionDTO(transaction);
//		
//		transferDto.setTransactionAmount(11.00);
//		transferDto.setAlBranchCode("kwt");
//		transferDto.setAlTrxType("trx");
//		transferDto.setAsAccount("111122222");
//		transferDto.setAsDesc("");
//		transferDto.setAsDescAr("");
//		transferDto.setAllowLimitChecking(1);
		
		requestDTO.setChannel(1);
		requestDTO.setChannelName("payme");
	}

	@Test
	public void creditCustomerAccountTest() throws Exception {
		PaymentSoapClient paymentSoapClient = new PaymentSoapClient();
		InstantDepositResponse response = new InstantDepositResponse();
		try {
			when(applicationContext.getBean(PaymentSoapClient.class)).thenReturn(paymentSoapClient);
			when(paymentClient.instantDeposit(Mockito.any())).thenReturn(response);
			//when(messageSource.getMessage(Mockito.anyString(), Mockito.any(), Mockito.eq(new Locale("en")))).thenReturn("test");
			//when(msgTranslator.toLocale("test")).thenReturn("test");
			WsApiUtilityPaymentOutDTO doKnetTransfer = transferService.creditCustomerAccount(transferDto, requestDTO);
			assertNull(doKnetTransfer);
		} catch (Exception e) {
			assertFalse("Caught Exception" + e.getMessage(), true);
		}

	}
}
