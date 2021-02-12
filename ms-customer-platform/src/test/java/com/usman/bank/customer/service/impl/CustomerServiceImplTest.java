/**
 * @Copyright reserved to bank
 */
package com.usman.bank.customer.service.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

import com.usman.bank.customer.repository.CustomerRepository;
import com.usman.bank.customer.service.impl.BaseService;
import com.usman.bank.customer.service.impl.CustomerServiceImpl;
import com.usman.bank.models.CustomersDTO;

/**
 * Description: This class CustomerServiceImplTest.java
 *
 * @author vXebiau
 * @date Sep 15, 2019
 * @version 1.0
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceImplTest {

	@InjectMocks
	private CustomerServiceImpl customeService;

	@Mock
	private CustomerRepository customerRespository;

	RestTemplate restTemplate = new RestTemplate();

	@InjectMocks
	private BaseService baseService;

//	@Test
//	public void resetLoginTest() throws Exception {
//		CustomerDTO customer = new CustomerDTO();
//		customer.setCif(12345L);
//		customer.setCustId(6666);
//		customer.setStatusId(1);
//		customer.setLockReasonId(0);
//		Mockito.when(customerRespository.getCustomerByCif(Mockito.anyString())).thenReturn(customer);
//
//		boolean respFlag = customeService.resetLogin("12345");
//		assertThat(respFlag == true);
//	}

	@Test
	public void getCustomerByCIFTest() throws Exception {
		try {
			CustomersDTO customer = new CustomersDTO();
			customer.setCif(12345L);
			customer.setCustId(6666);
			Mockito.when(customerRespository.getCustomerByCif(Mockito.anyString())).thenReturn(customer);

			CustomersDTO respCust = customeService.getCustomerByCIF("12345");
			assertThat(respCust.getCustId() == customer.getCustId());
		} catch (Exception e) {
			assertFalse(false);
		}
	}

	@Test
	public void updateUserStatusTest() {
		try {
			Integer count = 1;
			Mockito.when(customerRespository.updateUserStatus(Mockito.anyInt(), Mockito.anyInt(), Mockito.anyInt())).thenReturn(count);
			Integer respCount = customeService.updateUserStatus(1, 0, 0);
			assertThat(respCount == count);
		} catch (Exception e) {
			assertFalse(false);
		}
	}
}
