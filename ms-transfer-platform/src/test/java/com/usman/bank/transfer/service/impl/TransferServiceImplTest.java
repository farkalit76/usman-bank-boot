/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import com.usman.bank.models.KNetTransferDTO;
import com.usman.bank.models.MasterTransactionDTO;
import com.usman.bank.models.TokenDTO;
import com.usman.bank.transfer.exception.TransferException;
import com.usman.bank.transfer.repository.TransferRepository;
import com.usman.bank.transfer.request.InitKNetPaymentReq;
import com.usman.bank.transfer.service.impl.TransferServiceImpl;

/**
 * Description: This class TransferServiceImplTest.java
 *
 * @author vXebiau
 * @date Oct 23, 2019
 * @version 1.0
 *
 */
@RunWith(SpringRunner.class)
public class TransferServiceImplTest {

	@InjectMocks
	private TransferServiceImpl transferService;

	@Mock
	private TransferRepository transferRepository;

	List<KNetTransferDTO> transferList = new ArrayList<KNetTransferDTO>();

	private KNetTransferDTO knetTransferDto = new KNetTransferDTO();

	@Before
	public void init() {
		knetTransferDto.setAmountInKwd(new BigDecimal(11.0));
	}

	@Test
	public void createTransferEntryTest() throws TransferException {
		KNetTransferDTO transferDto = new KNetTransferDTO();
		when(transferRepository.createTransferEntry(Mockito.any())).thenReturn(transferDto);
		KNetTransferDTO createTransferEntry = transferService.createTransferEntry(knetTransferDto);
		assertNotNull(createTransferEntry);
	}

	@Test
	public void createKNetTokenTest() throws TransferException {
		TokenDTO tokenDto = new TokenDTO();
		when(transferRepository.createKNetToken(Mockito.any())).thenReturn(tokenDto);
		TokenDTO createKNetToken = transferService.createKNetToken(tokenDto);
		assertNotNull(createKNetToken);
	}

	@Test
	public void updateTransferEntryTest() throws TransferException {
		KNetTransferDTO transferDto = new KNetTransferDTO();
		when(transferRepository.updateTransferEntry(Mockito.any())).thenReturn(transferDto);
		KNetTransferDTO updateTransferEntry = transferService.updateTransferEntry(knetTransferDto);
		assertNotNull(updateTransferEntry);
	}

	@Test
	public void createTransactionMasterTest() throws TransferException {
		MasterTransactionDTO masterDto = new MasterTransactionDTO();
		when(transferRepository.createTransactionMaster(Mockito.any())).thenReturn(masterDto);
		MasterTransactionDTO createTransactionMaster = transferService.createTransactionMaster(masterDto);
		assertNotNull(createTransactionMaster);
	}

	@Test
	public void updateKnetPaymentTest() throws TransferException {
		KNetTransferDTO transferDto = new KNetTransferDTO();
		when(transferRepository.updateKnetPayment(Mockito.any())).thenReturn(transferDto);
		KNetTransferDTO updateTransferEntry = transferService.updateKnetPayment(knetTransferDto);
		assertNotNull(updateTransferEntry);
	}

	@Test
	public void updateKnetPaymentFailureTest() throws TransferException {
		KNetTransferDTO transferDto = new KNetTransferDTO();
		when(transferRepository.updateKnetPaymentStatus(Mockito.any())).thenReturn(transferDto);
		KNetTransferDTO updateTransferFailure = transferService.updateKnetPaymentStatus(knetTransferDto);
		assertNotNull(updateTransferFailure);
	}

	@Test
	public void selectKnetPayment() throws TransferException {
		KNetTransferDTO transferDto = new KNetTransferDTO();
		when(transferRepository.selectKnetPayment(Mockito.any())).thenReturn(transferDto);
		InitKNetPaymentReq knetReq = new InitKNetPaymentReq();
		KNetTransferDTO selectKnetPayment = transferService.selectKnetPayment(knetReq);
		assertNotNull(selectKnetPayment);
	}

	@Test
	public void getKnetTransferHistoryTest() throws Exception {
		KNetTransferDTO dto = new KNetTransferDTO();
		dto.setFromAccount("12321321");
		transferList.add(dto);
		when(transferRepository.getKnetTransferHistory()).thenReturn(transferList);
		List<KNetTransferDTO> responseDTO = transferService.getKnetTransferHistory();
		assertTrue(responseDTO.size() == transferList.size());
	}
}
