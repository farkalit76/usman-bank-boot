/**
 * @Copyright reserved to bank
 */
package com.usman.bank.customer.web.resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.usman.bank.customer.request.CustomerReq;
import com.usman.bank.customer.web.resource.CustomerResource;
import com.usman.bank.response.CommonDTO;
import com.usman.bank.response.ResponseDTO;
import com.usman.bank.response.StatusDTO;

/**
 * Description: This class CustomerResourceTest.java
 *
 * @author vXebiau
 * @date Sep 15, 2019
 * @version 1.0
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class CustomerResourceTest {

//	@InjectMocks
//	private CustomerServiceImpl customeService;
//
//	@InjectMocks
//	private CustomerRepositoryImpl customerRespository;
//
//	@Mock
//	private NamedParameterJdbcTemplate namedJdbcTemplate;
//
//	@Mock
//	private CustomerResource customerResource;

	CustomerReq customerReq = new CustomerReq();
	ResponseDTO<CommonDTO> response = new ResponseDTO<>();

	@Before
	public void before() {
		customerReq.setCifNumber("12345");
		CommonDTO common = new CommonDTO("false");
		StatusDTO status = new StatusDTO(false, "1");
		status.setStatusDesc("Operation failed");
		response.setStatus(status);
		response.setResponse(common);
	}

	@Test
	public void deactivateUserExcepTest() throws Exception {
		CustomerResource resource = new CustomerResource();
		ResponseEntity<ResponseDTO<CommonDTO>> deactivate = resource.deactivateUser(customerReq);
		assertNotNull(deactivate);
		HttpStatus statusCode = deactivate.getStatusCode();
		assertEquals(HttpStatus.BAD_GATEWAY, statusCode);
	}

//	@Test
//	public void deactivateUserMockTest() throws Exception {
//		CustomerResource resource = new CustomerResource();
//		List<CustomerDTO> customers = new ArrayList<CustomerDTO>();
//		MapSqlParameterSource mapParams = new MapSqlParameterSource();
//		RowMapper<CustomerDTO> rows = new RowMapper<CustomerDTO>() {
//			
//			@Override
//			public CustomerDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
//				// TODO Auto-generated method stub
//				return new CustomerDTO();
//			}
//		};
//		Mockito.when(namedJdbcTemplate.query(Mockito.anyString(), Mockito.anyMap(), rows)).thenReturn(customers);
//		CustomerDTO customer = new CustomerDTO();
//		Mockito.when(customerRespository.getCustomerByCif(Mockito.anyString())).thenReturn(customer);
//		boolean statusFlag = true;
//		Mockito.when(customeService.resetLogin(Mockito.anyString())).thenReturn(statusFlag);
//		
//		ResponseEntity<ResponseDTO<CommonRes>> deactivate = resource.deactivateUser(customerReq);
//		assertNotNull(deactivate);
//	}
}
