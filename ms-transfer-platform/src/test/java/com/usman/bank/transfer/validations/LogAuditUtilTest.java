/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.validations;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

import com.usman.bank.models.LogMasterDTO;
import com.usman.bank.models.RequestDTO;
import com.usman.bank.transfer.validations.LogAuditUtil;

/**
 * Description: This class LogAuditUtilTest.java
 *
 * @author vXebiau
 * @date Nov 27, 2019
 * @version 1.0
 *
 */
@RunWith(SpringRunner.class)
public class LogAuditUtilTest {

	@InjectMocks
	private LogAuditUtil logAuditUtil;

	@Before
	public void init() {

	}

	@Test
	public void saveLogMasterTest() {
		LogMasterDTO logMaster = new LogMasterDTO();
		logMaster.setCifNumber("80764");
		Exception ex = new Exception();
		ex.fillInStackTrace();
		RequestDTO requestDto = new RequestDTO();
		LogMasterDTO auditLogMaster = logAuditUtil.audit("80764", logMaster, true, ex, "test remark", requestDto);
		assertNotNull(auditLogMaster);
	}
}
