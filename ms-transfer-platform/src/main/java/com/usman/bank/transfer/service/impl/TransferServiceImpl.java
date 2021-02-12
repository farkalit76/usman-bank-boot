/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usman.bank.constants.Constants;
import com.usman.bank.models.KNetTransferDTO;
import com.usman.bank.models.LogMasterDTO;
import com.usman.bank.models.MailDTO;
import com.usman.bank.models.MasterTransactionDTO;
import com.usman.bank.models.RequestDTO;
import com.usman.bank.models.TokenDTO;
import com.usman.bank.response.CommonDTO;
import com.usman.bank.utils.Utility;
import com.usman.bank.transfer.exception.TransferException;
import com.usman.bank.transfer.repository.TransferRepository;
import com.usman.bank.transfer.request.InitKNetPaymentReq;
import com.usman.bank.transfer.service.TransferService;
import com.usman.bank.transfer.validations.LogAuditUtil;

/**
 * Description: This class TransferServiceImpl.java
 *
 * @author vXebiau
 * @date Oct 27, 2019
 * @version 1.0
 *
 */
@Service
public class TransferServiceImpl implements TransferService {

	private static final Logger LOG = LogManager.getLogger(TransferServiceImpl.class);

	@Autowired
	private TransferRepository transferRepository;
	
	@Autowired
	private BaseService baseService;
	
	@Autowired
	private LogAuditUtil logAuditUtil;

	@Override
	public KNetTransferDTO createTransferEntry(KNetTransferDTO knetdto) throws TransferException {
		LOG.debug("TransferServiceImpl.createTransferEntry...");
		return transferRepository.createTransferEntry(knetdto);
	}

	@Override
	public TokenDTO createKNetToken(TokenDTO tokendto) throws TransferException {
		LOG.debug("TransferServiceImpl.createKNetToken...");
		return transferRepository.createKNetToken(tokendto);
	}

	@Override
	public KNetTransferDTO updateTransferEntry(KNetTransferDTO knetdto) throws TransferException {
		LOG.debug("TransferServiceImpl.updateTransferEntry...");
		return transferRepository.updateTransferEntry(knetdto);
	}

	@Override
	public MasterTransactionDTO createTransactionMaster(MasterTransactionDTO masterdto) throws TransferException {
		LOG.debug("TransferServiceImpl.createTransactionMaster...");
		return transferRepository.createTransactionMaster(masterdto);
	}

	@Override
	public KNetTransferDTO updateKnetPayment(KNetTransferDTO knetdto) throws TransferException {
		LOG.debug("TransferServiceImpl.updateKnetPayment...");
		return transferRepository.updateKnetPayment(knetdto);
	}
	
	@Override
	public KNetTransferDTO updateKnetPaymentStatus(KNetTransferDTO knetdto) throws TransferException {
		LOG.debug("TransferServiceImpl.updateKnetPaymentFailure...");
		return transferRepository.updateKnetPaymentStatus(knetdto);
	}
	
	@Override
	public KNetTransferDTO selectKnetPayment(InitKNetPaymentReq knetReq) throws TransferException {
		LOG.debug("TransferServiceImpl.selectKnetPayment...");
		return transferRepository.selectKnetPayment(knetReq);
	}
	
	@Override
	public List<KNetTransferDTO> getKnetTransferHistory() throws TransferException {
		LOG.debug("TransferServiceImpl.getKnetTransferHistory...");
		return transferRepository.getKnetTransferHistory();
	}

	@Override
	public KNetTransferDTO getKNetTransactionByKNetTrackId(String knetTrackId) throws TransferException {
		LOG.debug("TransferServiceImpl.getKNetTransactionByKNetTrackId...");
		return transferRepository.getKNetTransactionByKNetTrackId(knetTrackId);
	}

	@Override
	public Boolean createTmpTransaction(KNetTransferDTO knetdto, RequestDTO requestDTO) throws TransferException {
		LOG.debug("TransferServiceImpl.createTmpTransaction...");
		Boolean createTmpTransaction = transferRepository.createTmpTransaction(knetdto);
		if(!createTmpTransaction) {
			String remarks = "Pay Me: Duplicate trans detected - not executed, Knet payment Id = " + knetdto.getKnetPaymentId();
			LogMasterDTO logMaster = new LogMasterDTO(null, knetdto.getCustId(), knetdto.getServiceId(), Constants.Actions.PAY, remarks);
			logMaster = logAuditUtil.audit("" + knetdto.getCustId(), logMaster, false, null, remarks, requestDTO);
			baseService.saveLogMaster(logMaster);
		}
		return createTmpTransaction;
	}

	/**
	 * 
	 * @param mailDTO
	 */
	@Override
	public void sendEmail(MailDTO mailDTO) {
		try {
			if(!Utility.isEmpty(mailDTO)) {
				CommonDTO sendEmail = baseService.sendEmail(mailDTO);
				LOG.debug("****Email Send*********:" + sendEmail);
			}else {
				LOG.debug("mailDTO is empty so cannot send email*****");
			}
		} catch (Exception e) {
			LOG.error("TransferServiceImpl.Error while sending email:"+e.getMessage());
		}
	}

	@Override
	public void audit(LogMasterDTO logMaster) {
		try {
			if(!Utility.isEmpty(logMaster)) {
				boolean saveLogMaster = baseService.saveLogMaster(logMaster);
				LOG.debug("saveLogMaster Flag:" + saveLogMaster);
			}else {
				LOG.debug("logMaster is empty so cannot log the message*****");
			}
		} catch (Exception e) {
			LOG.error("TransferServiceImpl.Error while saving log master:"+e.getMessage());
		}
	}
	
}
