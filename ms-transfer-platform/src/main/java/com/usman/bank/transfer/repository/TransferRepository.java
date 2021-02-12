/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.repository;

import java.util.List;

import com.usman.bank.models.KNetTransferDTO;
import com.usman.bank.models.MasterTransactionDTO;
import com.usman.bank.models.TokenDTO;
import com.usman.bank.transfer.exception.TransferException;
import com.usman.bank.transfer.request.InitKNetPaymentReq;

/**
 * Description: This class TransferRepository.java
 *
 * @author vXebiau
 * @date Oct 27, 2019
 * @version 1.0
 *
 */
public interface TransferRepository {

	/**
	 * Create a new KNET Entry
	 * 
	 * @param knetdto
	 * @return
	 * @throws TransferException
	 */
	KNetTransferDTO createTransferEntry(KNetTransferDTO knetdto) throws TransferException;

	/**
	 * Generate transaction token
	 * 
	 * @param tokendto
	 * @return
	 * @throws TransferException
	 */
	TokenDTO createKNetToken(TokenDTO tokendto) throws TransferException;

	/**
	 * Update KNET transfer entry
	 * 
	 * @param knetdto
	 * @return
	 * @throws TransferException
	 */
	KNetTransferDTO updateTransferEntry(KNetTransferDTO knetdto) throws TransferException;

	/**
	 * Create a new master transaction Entry
	 * 
	 * @param masterdto
	 * @return
	 * @throws TransferException
	 */
	MasterTransactionDTO createTransactionMaster(MasterTransactionDTO masterdto) throws TransferException;

	/**
	 * Update KNET transfer payment entry
	 * 
	 * @param knetdto
	 * @return
	 * @throws TransferException
	 */
	KNetTransferDTO updateKnetPayment(KNetTransferDTO knetdto) throws TransferException;

	/**
	 * Update KNET transfer payment failure entry
	 * 
	 * @param knetdto
	 * @return
	 * @throws TransferException
	 */
	KNetTransferDTO updateKnetPaymentStatus(KNetTransferDTO knetdto) throws TransferException;

	/**
	 * Update KNET transfer payment failure entry
	 * 
	 * @param knetdto
	 * @return
	 * @throws TransferException
	 */
	KNetTransferDTO selectKnetPayment(InitKNetPaymentReq knetReq) throws TransferException;

	/**
	 * 
	 * @return
	 * @throws TransferException
	 */
	List<KNetTransferDTO> getKnetTransferHistory() throws TransferException;

	/**
	 * 
	 * @param knetTrackId
	 * @return
	 * @throws TransferException
	 */
	KNetTransferDTO getKNetTransactionByKNetTrackId(String knetTrackId) throws TransferException;

	/**
	 * Create temporary transaction details.
	 * 
	 * @param knetdto
	 * @return
	 * @throws TransferException
	 */
	Boolean createTmpTransaction(KNetTransferDTO knetdto) throws TransferException;
}
