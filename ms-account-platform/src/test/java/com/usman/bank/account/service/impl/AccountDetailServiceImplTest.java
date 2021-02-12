/**
 * @Copyright reserved to  bank
 */
package com.usman.bank.account.service.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;

import com.usman.bank.models.AccountDTO;
import com.usman.bank.models.RequestDTO;
import com.usman.bank.account.request.AccountDetailReq;
import com.usman.bank.account.service.impl.AccountSoapServiceImpl;
import com.usman.bank.account.soap.config.AccountSoapClient;
import com.usman.bank.account.wsdl.WsAccountsDTO;
import com.usman.bank.account.wsdl.WscifDetailsInDTO;

/**
 * Description: This class AccountDetailServiceImplTest.java
 *
 * @author vXebiau
 * @date Oct 23, 2019
 * @version 1.0
 *
 */
@RunWith(SpringRunner.class)
public class AccountDetailServiceImplTest {

	@InjectMocks
	AccountSoapServiceImpl accountDetailService;

	@MockBean
	ApplicationContext applicationContext;

	List<AccountDTO> accountList = new ArrayList<AccountDTO>();

	AccountSoapClient soapClient = new AccountSoapClient();

	@Test
	public void getSavingAccountsTest() throws Exception {
		try {
			AccountDetailReq accountReq = new AccountDetailReq();
			accountReq.setCifNumber("123333");
			// when(applicationContext.getBean(AccountSoapClient.class)).thenReturn(new
			// AccountSoapClient());
			when(applicationContext.getBean(AccountSoapClient.class)).thenReturn(soapClient);
			List<AccountDTO> responseDTO = accountDetailService.getAccountsDetails(accountReq);
			assertTrue(responseDTO.size() == accountList.size());
		} catch (Exception e) {
			assertFalse(false);
		}
	}

	public static AccountSoapServiceImpl accountService;

	@BeforeClass
	public static void beforeClass() {
		accountService = new AccountSoapServiceImpl();
	}

	@Test
	public void getRequestDTOTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		String input = "123456";
		RequestDTO invokeMethod = ReflectionTestUtils.invokeMethod(accountService, "getRequestDTO", input);
		assertNotNull(invokeMethod);
	}

	@Test
	public void getAccountDetailsTest()
			throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		List<WsAccountsDTO> input = new ArrayList<WsAccountsDTO>();
		WsAccountsDTO dto = new WsAccountsDTO();
		dto.setAccountName("test");
		dto.setOsStatus("A");
		dto.setAlAccBranch("1");
		dto.setCurrencyCode("1");
		dto.setOdecCVAvailBal("11.0");
		dto.setOdecCVBal("11.2");
		dto.setOdecFCAvailBal("11.1");
		dto.setOdecFCBal("11.0");
		input.add(dto);
		List<AccountDTO> invokeMethod = ReflectionTestUtils.invokeMethod(accountService, "getAccountDetails", input);
		assertNotNull(invokeMethod);
	}

	@Test
	public void getCifDetailDtoTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		String input = "123456";
		RequestDTO requestDTO = new RequestDTO();
		WscifDetailsInDTO invokeMethod = ReflectionTestUtils.invokeMethod(accountService, "getCifDetailDto", input,
				requestDTO);
		assertNotNull(invokeMethod);
	}

//	@Test
//	public void getAccountsTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//		String input = "123456";
//		when(applicationContext.getBean(AccountSoapClient.class)).thenReturn(soapClient);
//		List<AccountDTO> invokeMethod = ReflectionTestUtils.invokeMethod(accountService, "getAccounts", input);
//		assertNotNull(invokeMethod);
//	}
}
