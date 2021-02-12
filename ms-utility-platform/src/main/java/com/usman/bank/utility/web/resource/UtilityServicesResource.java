/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.web.resource;

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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.usman.bank.constants.UtilityConstants;
import com.usman.bank.models.CurrencyDTO;
import com.usman.bank.models.LogMasterDTO;
import com.usman.bank.response.CommonDTO;
import com.usman.bank.response.ResponseDTO;
import com.usman.bank.response.ResponseUtils;
import com.usman.bank.response.StatusDTO;
import com.usman.bank.utility.exception.UtilityServicesException;
import com.usman.bank.utility.request.EmailReq;
import com.usman.bank.utility.request.SmsReq;
import com.usman.bank.utility.response.CurrencyListRes;
import com.usman.bank.utility.service.AuditLogService;
import com.usman.bank.utility.service.CommonService;
import com.usman.bank.utility.service.impl.KfkProducer;
import com.usman.bank.utils.Utility;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Description: This class UtilityServicesResource.java
 *
 * @author vXebiau
 * @date Sep 15, 2019
 * @version 1.0
 *
 */
@RestController
@RequestMapping(UtilityConstants.RESOURCE_NAME)
@Api(value = "Utility Services", description = "Operations pertaining to utility services like audit, email and sms")
public class UtilityServicesResource {

	private static final Logger LOG = LogManager.getLogger(UtilityServicesResource.class);

	@Autowired
	private AuditLogService auditLogService;

	@Autowired
	private CommonService commonService;

	@Autowired
	private KfkProducer kfkProducer;

	@ApiOperation(value = "Send log message to kafka topic consumer", response = Void.class)
	@PostMapping(value = UtilityConstants.MAPPING_KAFKA_AUDITS)
	public void sendMessageToKafkaTopic(@RequestBody LogMasterDTO logReq) {
		try {
			LOG.debug("sendMessageToKafkaTopic started...{}", logReq.toString());
			// Creating Object to JSON string
			ObjectMapper mapper = new ObjectMapper();
			String jsonStr = mapper.writeValueAsString(logReq);
			this.kfkProducer.sendMessage(jsonStr);
		} catch (Exception ex) {
			LOG.error(ex.getMessage());
		}
	}

	@ApiOperation(value = "Save log message to db", response = ResponseDTO.class)
	@PostMapping(value = UtilityConstants.MAPPING_AUDITS, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ResponseDTO<LogMasterDTO>> saveAuditLogMaster(@RequestBody LogMasterDTO logReq) {

		ResponseDTO<LogMasterDTO> responseDTO = new ResponseDTO<>();
		try {
			LOG.debug("saveAuditLogMaster started.....");
			long transId = System.currentTimeMillis() * 821;
			logReq.setTransId(transId);
			LOG.debug(logReq.toString());
			Integer logStatus = auditLogService.saveLog(logReq);
			if (logStatus == 1) {
				responseDTO.setStatus(new StatusDTO(true, "Success to save audit message."));
			} else {
				responseDTO.setStatus(new StatusDTO(false, "Failed to save audit message."));
			}
			responseDTO.setResponse(logReq);
		} catch (Exception ex) {
			LOG.error(ex.getMessage());
			responseDTO.setStatus(new StatusDTO(false, ex.getMessage()));
			return ResponseUtils.failure(responseDTO);
		}
		return ResponseUtils.success(responseDTO);
	}

	@ApiOperation(value = "Get all the log message", response = List.class)
	@GetMapping(value = UtilityConstants.MAPPING_AUDITS_INFO, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ResponseDTO<List<LogMasterDTO>>> getCurrentAuditLogs() {
		List<LogMasterDTO> logMasters = null;
		ResponseDTO<List<LogMasterDTO>> responseDTO = new ResponseDTO<>();
		try {
			LOG.debug("getCurrentAuditLogs started...");
			logMasters = auditLogService.getLogMasters();
			LOG.debug(logMasters.toString());
			responseDTO.setStatus(new StatusDTO(true, "Success fetch data"));
			responseDTO.setResponse(logMasters);
		} catch (Exception ex) {
			LOG.error(ex.getMessage());
			responseDTO.setStatus(new StatusDTO(false, ex.getMessage()));
			return ResponseUtils.failure(responseDTO);
		}
		return ResponseUtils.success(responseDTO);
	}

	@ApiOperation(value = "Send email to the customer", response = ResponseDTO.class)
	@PostMapping(value = UtilityConstants.MAPPING_EMAIL, produces = { MediaType.APPLICATION_JSON_VALUE })
	public CommonDTO sendEmail(@Valid @RequestBody EmailReq emailReq) {
		CommonDTO commonDTO = new CommonDTO();
		try {
			LOG.debug("sendEmail started...emailReq:" + emailReq.toString());
			commonService.sendEmail(emailReq);
			commonDTO.setMessage("Email sent successfully.");
			LOG.debug("sendEmail done:");
		} catch (UtilityServicesException ex) {
			commonDTO.setMessage("Email sending failed.");
			Utility.logMe(ex);
		}
		return commonDTO;
	}

	@ApiOperation(value = "Send sms to the customer", response = ResponseDTO.class)
	@PostMapping(value = UtilityConstants.MAPPING_SMS, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ResponseDTO<CommonDTO>> sendSms(@RequestBody SmsReq smsReq) {
		ResponseDTO<CommonDTO> responseDTO = new ResponseDTO<>();
		LOG.debug("sendSms started...smsReq:" + smsReq.toString());
		responseDTO.setStatus(new StatusDTO(true, "Success"));
		responseDTO.setResponse(new CommonDTO(true));
		return ResponseUtils.success(responseDTO);
	}

	@GetMapping(value = UtilityConstants.MAPPING_CURRENCIES, produces = { MediaType.APPLICATION_JSON_VALUE })
	public CurrencyListRes getCurrencies() {
		LOG.debug("getCurrentAuditLogs started...");
		List<CurrencyDTO> currencyList = commonService.getCurrencies();
		LOG.debug("currencyList:" + currencyList);
		CurrencyListRes currencyRes = new CurrencyListRes();
		currencyRes.setCurrencyList(currencyList);
		return currencyRes;
	}

}
