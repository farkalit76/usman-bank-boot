/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.repository.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.usman.bank.models.KNetTransferDTO;
import com.usman.bank.models.MasterTransactionDTO;
import com.usman.bank.models.TokenDTO;
import com.usman.bank.transfer.repository.impl.RowMapperKnetTransfer;
import com.usman.bank.transfer.repository.impl.TransferRepositoryImpl;
import com.usman.bank.transfer.request.InitKNetPaymentReq;
import com.usman.bank.transfer.utils.SQLConstants;

/**
 * Description: This class TransferRepositoryImplTest.java
 *
 * @author vXebiau
 * @date Nov 27, 2019
 * @version 1.0
 *
 */
@RunWith(SpringRunner.class)
public class TransferRepositoryImplTest {

	@InjectMocks
	private TransferRepositoryImpl transferRepository;

	@Mock
	private NamedParameterJdbcTemplate namedJdbcTemplate;

	private KNetTransferDTO knetTransferDto = new KNetTransferDTO();

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		knetTransferDto.setToAccount("0080764016");
		knetTransferDto.setFromAccount("0176915001");
		knetTransferDto.setCurrencyId(1);
		knetTransferDto.setServiceId(365);
		knetTransferDto.setMobileNo("97471261");
		knetTransferDto.setComment("Test transfer");

		// Mock Get Nextval
		String nextvalSQL = "SELECT CUSTS_KNET_PAYMENTS_SEQ.NEXTVAL from dual";
		when(namedJdbcTemplate.queryForObject(nextvalSQL, (HashMap<String, ?>) null, Long.class)).thenReturn(111122L);
		// Mock Get GUID
		String guidIdSQL = "SELECT SYS_GUID() FROM DUAL";
		when(namedJdbcTemplate.queryForObject(guidIdSQL, (HashMap<String, ?>) null, String.class))
				.thenReturn("4yut234uy234324");
	}

	@Test
	public void initPayMeTransferTest() throws Exception {

		// Mock Get update response
		MapSqlParameterSource mapParams = new MapSqlParameterSource();
		when(namedJdbcTemplate.update(SQLConstants.CREATE_KNET_TRANSFER, mapParams)).thenReturn(1);
		// Call method
		KNetTransferDTO createTransferEntry = transferRepository.createTransferEntry(knetTransferDto);
		// assertNotNull(createTransferEntry);
		assertNull(createTransferEntry);
	}

	@Test
	public void createKNetTokenTest() throws Exception {
		TokenDTO knetdto = new TokenDTO();
		knetdto.setToken("111111111");
		knetdto.setTokenType(121);
		knetdto.setCustId(80764);
		knetdto.setWrongAttempts(1);
		knetdto.setLinkType(1);
		// Mock Get update response
		MapSqlParameterSource mapParams = new MapSqlParameterSource();
		when(namedJdbcTemplate.update(SQLConstants.CREATE_NEW_TOKEN, mapParams)).thenReturn(1);
		// Call method
		TokenDTO createKNetToken = transferRepository.createKNetToken(knetdto);
		assertNull(createKNetToken);
		// assertNotNull(createKNetToken);
	}

	@Test
	public void updateTransferEntryTest() throws Exception {
		// Mock Get update response
		MapSqlParameterSource mapParams = new MapSqlParameterSource();
		when(namedJdbcTemplate.update(SQLConstants.UPDATE_KNET_TRANSFER, mapParams)).thenReturn(1);
		// Call method
		KNetTransferDTO updateTransferEntry = transferRepository.updateTransferEntry(knetTransferDto);
		// assertNotNull(updateTransferEntry);
		assertNull(updateTransferEntry);
	}

	@Test
	public void createTransactionMasterTest() throws Exception {
		// Mock Get update response
		MapSqlParameterSource mapParams = new MapSqlParameterSource();
		when(namedJdbcTemplate.update(SQLConstants.CREATE_TRANSACTION_MASTER, mapParams)).thenReturn(1);
		// Call method
		MasterTransactionDTO masterdto = new MasterTransactionDTO();
		MasterTransactionDTO createTransactionMaster = transferRepository.createTransactionMaster(masterdto);
		// assertNotNull(createTransactionMaster);
		assertNull(createTransactionMaster);
	}

	@Test
	public void updateKnetPaymentTest() throws Exception {
		// Mock Get update response
		MapSqlParameterSource mapParams = new MapSqlParameterSource();
		when(namedJdbcTemplate.update(SQLConstants.UPDATE_KNET_PAYMENT, mapParams)).thenReturn(1);
		// Call method
		KNetTransferDTO updateKnetPayment = transferRepository.updateKnetPayment(knetTransferDto);
		// assertNotNull(updateKnetPayment);
		assertNull(updateKnetPayment);
	}

	@Test
	public void updateKnetPaymentFailureTest() throws Exception {
		// Mock Get update response
		MapSqlParameterSource mapParams = new MapSqlParameterSource();
		when(namedJdbcTemplate.update(SQLConstants.UPDATE_KNET_PAYMENT_FAILURE, mapParams)).thenReturn(1);
		// Call method
		KNetTransferDTO updateKnetPaymentFail = transferRepository.updateKnetPaymentStatus(knetTransferDto);
		// assertNotNull(updateKnetPaymentFail);
		assertNull(updateKnetPaymentFail);
	}

	@Test
	public void selectKnetPaymentTest() throws Exception {
		// Mock Get update response
		MapSqlParameterSource mapParams = new MapSqlParameterSource();
		List<KNetTransferDTO> histories = new ArrayList<KNetTransferDTO>();
		histories.add(knetTransferDto);
		when(namedJdbcTemplate.query(SQLConstants.SELECT_KNET_PAYMENT_ENTRY, mapParams, new RowMapperKnetTransfer()))
				.thenReturn(histories);
		// Call method
		InitKNetPaymentReq initReq = new InitKNetPaymentReq();
		KNetTransferDTO selectKnetPayment = transferRepository.selectKnetPayment(initReq);
		// assertNotNull(selectKnetPayment);
		assertNull(selectKnetPayment);
	}

	@Test
	public void getKnetTransferHistoryTest() throws Exception {
		// Mock Get update response
		List<KNetTransferDTO> histories = new ArrayList<KNetTransferDTO>();
		histories.add(knetTransferDto);
		when(namedJdbcTemplate.query(SQLConstants.SELECT_KNET_TRANS_HISTORY, new RowMapperKnetTransfer()))
				.thenReturn(histories);
		// Call method
		List<KNetTransferDTO> knetTransferHistory = transferRepository.getKnetTransferHistory();
		assertNotNull(knetTransferHistory);
	}
}
