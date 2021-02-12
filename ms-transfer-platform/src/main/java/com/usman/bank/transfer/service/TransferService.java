/**
 * @Copyright reserved to usman bank
 */
package com.usman.bank.transfer.service;

import java.util.List;

import com.usman.bank.models.KNetTransferDTO;
import com.usman.bank.models.LogMasterDTO;
import com.usman.bank.models.MailDTO;
import com.usman.bank.models.MasterTransactionDTO;
import com.usman.bank.models.RequestDTO;
import com.usman.bank.models.TokenDTO;
import com.usman.bank.transfer.exception.TransferException;
import com.usman.bank.transfer.request.InitKNetPaymentReq;

/**
 * Description: This class TransferService.java
 *
 * @author vXebiau
 * @date Oct 27, 2019
 * @version 1.0
 *
 */
public interface TransferService {

	/**
	 * Create a new KNET Entry
	 * 
	 * @param knetdto
	 * @return
	 * @throws AccountsException
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
	 * @throws AccountsException
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
	Boolean createTmpTransaction(KNetTransferDTO knetdto, RequestDTO requestDTO) throws TransferException;
	
	/**
	 * Send mail to the customer
	 * 
	 * @param mailDTO
	 */
	void sendEmail(MailDTO mailDTO);
	
	/**
	 * Save log in audit master table.
	 * 
	 * @param logMaster
	 */
	void audit(LogMasterDTO logMaster);
}
