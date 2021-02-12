/**
 * @Copyright reserved to bank
 */
package com.usman.bank.customer.web.resource;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.core.MediaType;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.usman.bank.customer.request.CustomerReq;
import com.usman.bank.customer.service.CustomerService;
import com.usman.bank.response.CommonDTO;
import com.usman.bank.response.ResponseDTO;
import com.usman.bank.response.StatusDTO;

/**
 * Description: This class CustomerResourceMockTest.java
 *
 * @author vXebiau
 * @date Sep 15, 2019
 * @version 1.0
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(com.usman.bank.customer.web.resource.CustomerResource.class)
//@PropertySource("file:application.properties")
public class CustomerResourceMockTest {

	CustomerReq customerReq = new CustomerReq();
	ResponseDTO<CommonDTO> response = new ResponseDTO<>();

	@Autowired
	private MockMvc mocMvc;

	@MockBean
	private CustomerService customerService;

	// @Autowired
	// private AuditLogService auditLogService;

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
		String jsonInput = "{\r\n" + "	\"cifNumber\":\"138137\"\r\n" + "}";
		// Mockito.when(auditLogService.saveLog(Mockito.any())).thenReturn(1);
		Mockito.when(customerService.resetLogin(Mockito.any())).thenReturn(true);
		RequestBuilder builder = MockMvcRequestBuilders.post("/customers/deactivate").content(jsonInput).accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON);
		MvcResult mvcResult = mocMvc.perform(builder).andReturn();
		MockHttpServletResponse response = mvcResult.getResponse();

		// response validation
		assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatus());

	}
}
