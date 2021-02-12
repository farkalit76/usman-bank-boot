package com.usman.bank.transfer.web.resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.usman.bank.models.AccountDTO;
import com.usman.bank.models.CurrencyDTO;
import com.usman.bank.models.CustomersDTO;
import com.usman.bank.models.KNetTransferDTO;
import com.usman.bank.models.MasterTransactionDTO;
import com.usman.bank.models.RequestDTO;
import com.usman.bank.models.TokenDTO;
import com.usman.bank.response.CommonDTO;
import com.usman.bank.response.ResponseDTO;
import com.usman.bank.response.StatusDTO;
import com.fss.plugin.iPayPipe;
import com.usman.bank.transfer.request.KNetPaymentReq;
import com.usman.bank.transfer.request.TransferInitReq;
import com.usman.bank.transfer.request.TransferKNetReq;
import com.usman.bank.transfer.response.KNetPaymentRes;
import com.usman.bank.transfer.response.KNetTransferRes;
import com.usman.bank.transfer.service.AccountSoapService;
import com.usman.bank.transfer.service.CommonService;
import com.usman.bank.transfer.service.CustomerService;
import com.usman.bank.transfer.service.impl.TransferServiceImpl;
import com.usman.bank.transfer.utils.PaypipeHelper;
import com.usman.bank.transfer.utils.TransferHelper;
import com.usman.bank.transfer.web.resource.TransferResource;

@RunWith(SpringRunner.class)
public class TransferResourceTest {

	@InjectMocks
	private TransferResource transferResource;

	@Mock
	private TransferServiceImpl transferService;

	@Mock
	private CustomerService customerService;

	@Mock
	private CommonService commonService;

	@Mock
	private AccountSoapService accountSaopService;

	@Mock
	private HttpSession httpSession;

	@Mock
	private TransferHelper helper;

	@Mock
	private PaypipeHelper paypipe;

	private TransferKNetReq knetReq = new TransferKNetReq();

	@Before
	public void init() throws Exception {
		knetReq.setCifNumber("80764");
		knetReq.setToAccount("0080764016");
		knetReq.setFromAccount("0176915001");
		knetReq.setCurrencyId(1);
		knetReq.setTransactionAmount("11.0");
		knetReq.setServiceId(365);
		knetReq.setMobileNo("97471261");
		knetReq.setComment("Test transfer");

		// Mock session id
		when(httpSession.getId()).thenReturn("11111111111111111111");

		// Mock Helper
		when(helper.getLanguage()).thenReturn("en");
		RequestDTO requestDto = new RequestDTO();
		when(helper.getRequestDTO(Mockito.anyString(), Mockito.anyString())).thenReturn(requestDto);

		// Get customer
		CustomersDTO customersDto = new CustomersDTO();
		customersDto.setCif(80764L);
		when(customerService.getCustomerByCIF(Mockito.anyString())).thenReturn(customersDto);

		// Mock get currency
		CurrencyDTO currencyDto = new CurrencyDTO();
		currencyDto.setCurrenyId(1);
		when(commonService.getCurrencies(Mockito.anyInt())).thenReturn(currencyDto);

		// Mock account Soap Service
		List<AccountDTO> accountList = new ArrayList<>();
		AccountDTO accountDto = new AccountDTO();
		accountDto.setAccountNumber("0080764016");
		accountList.add(accountDto);
		when(accountSaopService.getAccounts(Mockito.any(), Mockito.any())).thenReturn(accountList);
		when(accountSaopService.getAccountByCIFAndAccount(Mockito.anyString(), Mockito.anyString(), Mockito.any()))
				.thenReturn(accountDto);
	}

	/**
	 * 
	 */
	@Test
	public void initPayMeTransferTest() throws Exception {
		String cifNumber = "80764";
		TransferInitReq transfer = new TransferInitReq();
		transfer.setCifNumber(cifNumber);

		ResponseEntity<ResponseDTO<CommonDTO>> initPayMe = transferResource.initPayMeTransfer(transfer);
		assertNotNull(initPayMe);
		HttpStatus statusCode = initPayMe.getStatusCode();
		assertEquals(HttpStatus.OK, statusCode);
	}

	/**
	 * 
	 */
	@Test
	public void initPayMeTransferFailedTest() throws Exception {
		String cifNumber = "80764";
		TransferInitReq transfer = new TransferInitReq();
		transfer.setCifNumber(cifNumber);
		ResponseEntity<ResponseDTO<CommonDTO>> initPayMe = transferResource.initPayMeTransfer(transfer);
		assertNotNull(initPayMe);
		HttpStatus statusCode = initPayMe.getStatusCode();
		assertEquals(HttpStatus.OK, statusCode);
	}

	/**
	 * 
	 */
	@Test
	public void validatePayMeTransferTest() throws Exception {
		// Call the validation service
		ResponseEntity<ResponseDTO<CommonDTO>> initPayMe = transferResource.validatePayMeTransfer(knetReq);
		assertNotNull(initPayMe);
		HttpStatus statusCode = initPayMe.getStatusCode();
		assertEquals(HttpStatus.OK, statusCode);
	}

	/**
	 * 
	 */
	@Test
	public void validatePayMeTransferFailedTest() throws Exception {
		TransferKNetReq knetTransferReq = new TransferKNetReq();
		// Call the validation service
		ResponseEntity<ResponseDTO<CommonDTO>> initPayMe = transferResource.validatePayMeTransfer(knetTransferReq);
		assertNotNull(initPayMe);
		HttpStatus statusCode = initPayMe.getStatusCode();
		assertEquals(HttpStatus.BAD_GATEWAY, statusCode);
	}

	/**
	 * 
	 */
	@Test
	public void validatePayMeTransferFailedCustomerAcountTest() throws Exception {
		// Mock for validation failed
		when(customerService.getCustomerByCIF(Mockito.any())).thenReturn(null);

		// Call the validation service
		ResponseEntity<ResponseDTO<CommonDTO>> initPayMe = transferResource.validatePayMeTransfer(knetReq);
		assertNotNull(initPayMe);
		HttpStatus statusCode = initPayMe.getStatusCode();
		assertEquals(HttpStatus.BAD_GATEWAY, statusCode);
	}

	/**
	 * 
	 */
	@Test
	public void confirmPayMeTransferTest() throws Exception {
		// Mock create knet transfer
		KNetTransferDTO knetTransferDto = new KNetTransferDTO();
		when(transferService.createTransferEntry(Mockito.any())).thenReturn(knetTransferDto);

		// Mock create token
		TokenDTO tokenDto = new TokenDTO();
		tokenDto.setToken("1111");
		tokenDto.setTokenType(2);
		when(transferService.createKNetToken(Mockito.any())).thenReturn(tokenDto);

		// Mock create transaction master
		MasterTransactionDTO createTransMaster = new MasterTransactionDTO();
		when(transferService.createTransactionMaster(Mockito.any())).thenReturn(createTransMaster);

		// Set helper
		when(helper.generateTokenDto(Mockito.any())).thenReturn(tokenDto);

		// Mock update knet transfer
		when(transferService.updateTransferEntry(Mockito.any())).thenReturn(knetTransferDto);

		// Call the confirm pay master
		ResponseEntity<ResponseDTO<CommonDTO>> initPayMe = transferResource.confirmPayMeTransfer(knetReq);
		assertNotNull(initPayMe);
		HttpStatus statusCode = initPayMe.getStatusCode();
		assertEquals(HttpStatus.OK, statusCode);
	}

	/**
	 * 
	 */
	@Test
	public void initKnetPaymentTest() throws Exception {

		// Mock knet select info
		KNetTransferDTO knetPaymentDTO = new KNetTransferDTO();
		when(transferService.selectKnetPayment(Mockito.any())).thenReturn(knetPaymentDTO);

		// Call init knet payment
		String trans = "dDhsZUhsVmNWNHU0dHpiZGJSUGNBQT09";
		ResponseDTO<KNetPaymentRes> initPayMe = transferResource.initKnetPayment("BB-PC-1037645", "en",
				trans);
		assertNotNull(initPayMe);
		StatusDTO status = initPayMe.getStatus();
		assertEquals(true, status.isSuccess());
	}

	/**
	 * 
	 */
	@Test
	public void startKnetPaymentFailTest() throws Exception {
		// Mock the fail update
		KNetTransferDTO updateFailure = new KNetTransferDTO();
		when(transferService.updateKnetPaymentStatus(Mockito.any())).thenReturn(updateFailure);

		// Mock ipaypipe
		iPayPipe pipe = new iPayPipe();
		pipe.setAlias("usman");
		when(paypipe.getPaymentPipe(Mockito.any())).thenReturn(pipe);

		// Call the start pay knet
		KNetPaymentReq paymentReq = new KNetPaymentReq();
		paymentReq.setCif("80764");
		paymentReq.setAmountInKwd(new BigDecimal(11.0));
		ResponseDTO<KNetTransferDTO> initPayMe = transferResource.startKnetPayment(paymentReq);
		assertNotNull(initPayMe);
		StatusDTO status = initPayMe.getStatus();
		assertEquals(false, status.isSuccess());
	}

	/**
	 * 
	 */
	@Test
	public void startKnetPaymentSuccessTest() throws Exception {

		// Mock the success update
		KNetTransferDTO updateFailure = new KNetTransferDTO();
		when(transferService.updateKnetPayment(Mockito.any())).thenReturn(updateFailure);

		// Mock ipaypipe
		iPayPipe pipe = new iPayPipe();
		pipe.setAlias("usman");
		pipe.setAction("1");
		pipe.setCurrency("414");
		pipe.setResponseURL("https://south.bankusman.com:1906/ASWeb/faces/portlets/retail/knet/knetresponse.jsp");
		pipe.setErrorURL("https://south.bankusman.com:1906/ASWeb/faces/portlets/retail/knet/error.jsp");
		pipe.setResourcePath("D:/oracle/domains/ecore_domain/config/application/payme/newPG/");
		pipe.setKeystorePath("D:/oracle/domains/ecore_domain/config/application/payme/newPG/");
		when(paypipe.getPaymentPipe(Mockito.any())).thenReturn(pipe);

		// Call the start pay knet
		KNetPaymentReq paymentReq = new KNetPaymentReq();
		paymentReq.setCif("80764");
		paymentReq.setBbynTrackId("111111211");
		paymentReq.setAmountInKwd(new BigDecimal(11.0));
		ResponseDTO<KNetTransferDTO> initPayMe = transferResource.startKnetPayment(paymentReq);
		assertNotNull(initPayMe);
		StatusDTO status = initPayMe.getStatus();
		assertEquals(true, status.isSuccess());
	}

	/**
	 * 
	 * @throws Exception
	 */
	@Test
	public void getKnetTransferHistoryTest() throws Exception {
		List<KNetTransferDTO> transferList = new ArrayList<KNetTransferDTO>();
		KNetTransferDTO transfer = new KNetTransferDTO();
		transfer.setCif("80764");
		transferList.add(transfer);
		when(transferService.getKnetTransferHistory()).thenReturn(transferList);
		KNetTransferRes accountResponse = transferResource.getKnetTransferHistory();
		assertNotNull(accountResponse);
		assertEquals("80764", accountResponse.getTransferList().get(0).getCif());
	}

}
