/**
 *  @Copyright reserved to bank
 */
package com.usman.bank.customer.web.resource;

import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usman.bank.constants.Constants;
import com.usman.bank.constants.CustomerConstants;
import com.usman.bank.customer.request.CustomerByCifReq;
import com.usman.bank.customer.request.CustomerByCustIdReq;
import com.usman.bank.customer.request.CustomerReq;
import com.usman.bank.customer.service.CustomerService;
import com.usman.bank.models.CustomerProfilesDTO;
import com.usman.bank.models.CustomersDTO;
import com.usman.bank.response.CommonDTO;
import com.usman.bank.response.ResponseDTO;
import com.usman.bank.response.ResponseUtils;
import com.usman.bank.response.StatusDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Description: This class CustomerResource.java
 *
 * @author vXebiau - Farkalit Usman
 * @date Sep 08, 2019
 * @version 1.0
 *
 */
@RestController
@RequestMapping(CustomerConstants.RESOURCE_NAME)
@Api(value = "Customer Services", description = "Operations pertaining to customer related services like activation and deactivation of users")
public class CustomerResource {

	private static final Logger LOG = LogManager.getLogger(CustomerResource.class);

	@Autowired
	private CustomerService customerService;

	/**
	 * Deactivate the customer based on CIF number and its status ID.
	 * 
	 * @param customerReq
	 * @return
	 */
	@ApiOperation(value = "Deactivate the user from banking", response = ResponseDTO.class)
	@PostMapping(value = CustomerConstants.CUSTOMERS_DEACTIVATION, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ResponseDTO<CommonDTO>> deactivateUser(@Valid @RequestBody CustomerReq customerReq) {
		ResponseDTO<CommonDTO> responseDTO = new ResponseDTO<>();
		Boolean customerByCIF = false;
		try {
			customerByCIF = customerService.resetLogin(customerReq.getCifNumber());
			if (customerByCIF) {
				responseDTO.setStatus(new StatusDTO(true, CustomerConstants.DEACTIVATION_SUCCESS, Constants.StatusCodes.SUCCESS));
				responseDTO.setResponse(new CommonDTO(customerByCIF));
			} else {
				responseDTO.setStatus(new StatusDTO(false, CustomerConstants.DEACTIVATION_FAILED, Constants.StatusCodes.FAILED));
				responseDTO.setResponse(new CommonDTO(customerByCIF));
				return ResponseUtils.failure(responseDTO);
			}
		} catch (Exception ex) {
			LOG.error(ex.getMessage());
			responseDTO.setStatus(new StatusDTO(false, ex.getMessage(), Constants.StatusCodes.EXCEPTION));
			responseDTO.setResponse(new CommonDTO(false));
			return ResponseUtils.failure(responseDTO);
		}
		return ResponseUtils.success(responseDTO);
	}

	@ApiOperation(value = "Get a maximum of 10 customer profiles order by user name", response = ResponseDTO.class)
	@GetMapping(value = CustomerConstants.CUSTOMERS_ALL, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ResponseDTO<List<CustomerProfilesDTO>>> getCustomers() {
		LOG.debug("getCustomers...");
		ResponseDTO<List<CustomerProfilesDTO>> responseDTO = new ResponseDTO<>();
		try {
			List<CustomerProfilesDTO> customerProfiles = customerService.getCustomerProfiles();
			responseDTO.setStatus(new StatusDTO(true, CustomerConstants.CUSTOMERS_SUCCESS, Constants.StatusCodes.SUCCESS));
			responseDTO.setResponse(customerProfiles);
		} catch (Exception ex) {
			responseDTO.setStatus(new StatusDTO(false, ex.getMessage(), Constants.StatusCodes.EXCEPTION));
			return ResponseUtils.failure(responseDTO);
		}
		return ResponseUtils.success(responseDTO);
	}

	@PostMapping(value = CustomerConstants.CUSTOMERS_PROFILES, produces = { MediaType.APPLICATION_JSON_VALUE })
	public CustomerProfilesDTO getCustomerByCustId(@RequestBody CustomerByCustIdReq customerRQ) {
		LOG.info("getCustomerByCustId post...");
		CustomerProfilesDTO customerProfile = customerService.getCustomerProfileByCustId(customerRQ.getCustId());
		LOG.debug(customerProfile.toString());
		return customerProfile;
	}

	@PostMapping(value = CustomerConstants.CUSTOMERS_BYCIFID, produces = { MediaType.APPLICATION_JSON_VALUE })
	public CustomersDTO getCustomerByCif(@RequestBody CustomerByCifReq customerReq) {
		CustomersDTO customersDTO = new CustomersDTO();
		try {
			LOG.info("getCustomerByCif started...");
			customersDTO = customerService.getCustomerByCIF(customerReq.getCifNumber());
			LOG.debug(customersDTO.toString());
		} catch (Exception ex) {
			LOG.error(ex);
			return null;
		}
		return customersDTO;
	}
}
