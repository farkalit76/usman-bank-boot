/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.usman.bank.models.LogMasterDTO;
import com.usman.bank.models.MailDTO;
import com.usman.bank.response.CommonDTO;
import com.usman.bank.transfer.service.impl.BaseService;

/**
 * Description: This class BaseServiceTest.java
 *
 * @author vXebiau
 * @date Nov 27, 2019
 * @version 1.0
 *
 */
@RunWith(SpringRunner.class)
public class BaseServiceTest {

	@InjectMocks
	private BaseService baseService;

	@Mock
	private RestTemplate restTemplate;

	@Before
	public void init() {

	}

	@Test
	public void saveLogMasterTest() {
		LogMasterDTO logMaster = new LogMasterDTO();
		logMaster.setCifNumber("80764");
		ResponseEntity<String> response = new ResponseEntity<>(HttpStatus.OK);
		when(restTemplate.postForEntity(Mockito.anyString(), Mockito.any(), Mockito.eq(String.class)))
				.thenReturn(response);
		boolean saveLogMaster = baseService.saveLogMaster(logMaster);
		assertTrue("Log Master logged.", saveLogMaster);
	}

//	@Test
//	public void getAccountByCifAccountTest() {
//		AccountDTO account = new AccountDTO();
//		account.setAccountNumber("111222222");
//		when(restTemplate.postForEntity(Mockito.anyString(), Mockito.any(), Mockito.eq(AccountDTO.class)))
//				.thenReturn(generateResponse(account, HttpStatus.OK));
//		AccountDetailReq accountReq = new AccountDetailReq();
//		AccountDTO accountByCifAccount = baseService.getAccountByCifAccount(accountReq);
//		assertNotNull(accountByCifAccount);
//	}

//	@Test
//	public void getAccountByCifTest() {
//		AccountListRes accountList = new AccountListRes();
//		List<AccountDTO> accouns = new ArrayList<AccountDTO>();
//		accountList.setAccountList(accouns);
//		when(restTemplate.postForEntity(Mockito.anyString(), Mockito.any(), Mockito.eq(AccountListRes.class)))
//				.thenReturn(generateResponse(accountList, HttpStatus.OK));
//		AccountDetailReq accountReq = new AccountDetailReq();
//		List<AccountDTO> accountByCif = baseService.getAccountByCif(accountReq);
//		assertNotNull(accountByCif);
//	}

//	@Test
//	public void getCustomerByCifNumberTest() {
//		CustomersDTO customer = new CustomersDTO();
//		customer.setCif(80764L);
//		when(restTemplate.postForEntity(Mockito.anyString(), Mockito.any(), Mockito.eq(CustomersDTO.class)))
//				.thenReturn(generateResponse(customer, HttpStatus.OK));
//		CustomerByCifReq customerReq = new CustomerByCifReq();
//		CustomersDTO customerByCifNumber = baseService.getCustomerByCifNumber(customerReq);
//		assertNotNull(customerByCifNumber);
//	}

//	@Test
//	public void getCurrenciesTest() {
//		CurrencyListRes currencyRes = new CurrencyListRes();
//		List<CurrencyDTO> currencyList = new ArrayList<CurrencyDTO>();
//		currencyRes.setCurrencyList(currencyList);
//		when(restTemplate.getForEntity(Mockito.anyString(), Mockito.eq(CurrencyListRes.class)))
//				.thenReturn(generateResponse(currencyRes, HttpStatus.OK));
//		CurrencyListRes currencies = baseService.getCurrencies();
//		assertNotNull(currencies);
//	}

	@Test
	public void sendEmailTest() {
		CommonDTO common = new CommonDTO();
		common.setMessage("Email sent");
		when(restTemplate.postForEntity(Mockito.anyString(), Mockito.any(), Mockito.eq(CommonDTO.class)))
				.thenReturn(generateResponse(common, HttpStatus.OK));
		MailDTO mailDTO = new MailDTO();
		CommonDTO sendEmail = baseService.sendEmail(mailDTO);
		assertNotNull(sendEmail);
	}

//	private ResponseEntity<AccountDTO> generateResponse(AccountDTO response, HttpStatus httpStatus) {
//		return new ResponseEntity<>(response, httpStatus);
//	}
//
//	private ResponseEntity<AccountListRes> generateResponse(AccountListRes response, HttpStatus httpStatus) {
//		return new ResponseEntity<>(response, httpStatus);
//	}
//
//	private ResponseEntity<CustomersDTO> generateResponse(CustomersDTO response, HttpStatus httpStatus) {
//		return new ResponseEntity<>(response, httpStatus);
//	}
//
//	private ResponseEntity<CurrencyListRes> generateResponse(CurrencyListRes response, HttpStatus httpStatus) {
//		return new ResponseEntity<>(response, httpStatus);
//	}

	private ResponseEntity<CommonDTO> generateResponse(CommonDTO response, HttpStatus httpStatus) {
		return new ResponseEntity<>(response, httpStatus);
	}
}
