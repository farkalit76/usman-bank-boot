package com.usman.bank.account.web.resource;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import com.usman.bank.models.AccountDTO;
import com.usman.bank.models.CustomerAccountSavingDTO;
import com.usman.bank.account.request.AccountDetailReq;
import com.usman.bank.account.response.AccountRes;
import com.usman.bank.account.service.impl.AccountServiceImpl;
import com.usman.bank.account.service.impl.AccountSoapServiceImpl;
import com.usman.bank.account.web.resource.AccountResource;

@RunWith(SpringRunner.class)
public class AccountResourceTest {

	@InjectMocks
	AccountResource accountResource;

	@Mock
	AccountServiceImpl accoutService;

	@Mock
	AccountSoapServiceImpl accountDetailService;

	AccountRes accountResponse = new AccountRes();
	List<CustomerAccountSavingDTO> accountList = new ArrayList<CustomerAccountSavingDTO>();

	AccountDetailReq accountReq = new AccountDetailReq();
	List<AccountDTO> accountDetails = new ArrayList<AccountDTO>();

//	@Test
//	public void getAccountsTest() throws Exception {
//		when(accoutService.getSavingAccounts()).thenReturn(accountList);
//		AccountRes accountResponse = accountResource.getAccounts();
//		assertNotNull(accountResponse);
//	}

	@Test
	public void getAccountsByCIFTest() throws Exception {
		when(accountDetailService.getAccountsDetails(accountReq)).thenReturn(accountDetails);
		AccountDTO deactivate = accountResource.getAccountsDetails(accountReq);
		assertNotNull(deactivate);
	}
}
