/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.web.resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.usman.bank.models.LogMasterDTO;
import com.usman.bank.response.CommonDTO;
import com.usman.bank.response.ResponseDTO;
import com.usman.bank.utility.request.EmailReq;
import com.usman.bank.utility.request.SmsReq;
import com.usman.bank.utility.service.AuditLogService;
import com.usman.bank.utility.service.CommonService;
import com.usman.bank.utility.web.resource.UtilityServicesResource;

/**
 * Description: This class UtilityServicesResourceTest.java
 *
 * @author vXebiau
 * @date Sep 18, 2019
 * @version 1.0
 *
 */
@RunWith(SpringRunner.class)
public class UtilityServicesResourceTest {

	@InjectMocks
	UtilityServicesResource utilityResource;

	@Mock
	private AuditLogService auditLogService;

	@Mock
	private CommonService commonService;

	@Test
	public void saveAuditLogMasterMockSuccessTest() throws Exception {
		when(auditLogService.saveLog(Mockito.any())).thenReturn(new Integer(1));
		ResponseEntity<ResponseDTO<LogMasterDTO>> audit = utilityResource.saveAuditLogMaster(new LogMasterDTO());
		assertNotNull(audit);
		HttpStatus statusCode = audit.getStatusCode();
		assertEquals(HttpStatus.OK, statusCode);
	}

	@Test
	public void saveAuditLogMasterMockFaliedTest() throws Exception {
		when(auditLogService.saveLog(Mockito.any())).thenReturn(new Integer(0));
		ResponseEntity<ResponseDTO<LogMasterDTO>> audit = utilityResource.saveAuditLogMaster(new LogMasterDTO());
		assertNotNull(audit);
		HttpStatus statusCode = audit.getStatusCode();
		assertEquals(HttpStatus.OK, statusCode);
	}

	@Test
	public void saveAuditLogMasterExcepTest() throws Exception {
		UtilityServicesResource resource = new UtilityServicesResource();
		ResponseEntity<ResponseDTO<LogMasterDTO>> audit = resource.saveAuditLogMaster(new LogMasterDTO());
		assertNotNull(audit);
		HttpStatus statusCode = audit.getStatusCode();
		assertEquals(HttpStatus.BAD_GATEWAY, statusCode);
	}

	@Test
	public void getCurrentAuditLogsMockTest() throws Exception {
		List<LogMasterDTO> logs = new ArrayList<LogMasterDTO>();
		when(auditLogService.getLogMasters()).thenReturn(logs);
		ResponseEntity<ResponseDTO<List<LogMasterDTO>>> audits = utilityResource.getCurrentAuditLogs();
		assertNotNull(audits);
		HttpStatus statusCode = audits.getStatusCode();
		assertEquals(HttpStatus.OK, statusCode);
	}

	@Test
	public void getCurrentAuditLogsTest() throws Exception {
		UtilityServicesResource resource = new UtilityServicesResource();
		ResponseEntity<ResponseDTO<List<LogMasterDTO>>> audits = resource.getCurrentAuditLogs();
		assertNotNull(audits);
		HttpStatus statusCode = audits.getStatusCode();
		assertEquals(HttpStatus.BAD_GATEWAY, statusCode);
	}

	@Test
	public void sendEmailTest() throws Exception {
		EmailReq emailReq = new EmailReq();
		emailReq.setToEmailIds(null);
		emailReq.setSubject("test");
		emailReq.setBody("testing mail");
		when(commonService.sendEmail(emailReq)).thenReturn(true);
		CommonDTO sendEmail = utilityResource.sendEmail(emailReq);
		assertNotNull(sendEmail);
	}

	@Test
	public void sendSmsTest() throws Exception {
		UtilityServicesResource resource = new UtilityServicesResource();
		ResponseEntity<ResponseDTO<CommonDTO>> sendsms = resource.sendSms(new SmsReq());
		assertNotNull(sendsms);
		HttpStatus statusCode = sendsms.getStatusCode();
		assertEquals(HttpStatus.OK, statusCode);
	}
}
