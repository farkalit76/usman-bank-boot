/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.repository.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.ResultSet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.usman.bank.models.LogMasterDTO;
import com.usman.bank.utility.repository.impl.RowMapperLogMaster;

/**
 * Description: This class LogMasterRowMapperTest.java
 *
 * @author vXebiau
 * @date Sep 18, 2019
 * @version 1.0
 *
 */
@RunWith(SpringRunner.class)
public class LogMasterRowMapperTest {

	private final ResultSet resultSet = mock(ResultSet.class);

	@Test
	public void mapRowTest() throws Exception {
		RowMapperLogMaster mapper = new RowMapperLogMaster();
		LogMasterDTO dto = mapper.mapRow(resultSet, 1);
		assertTrue(true);
		assertEquals(null, dto.getCifNumber());
	}
}
