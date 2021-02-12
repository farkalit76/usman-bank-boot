/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.utils;

import java.sql.Timestamp;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.usman.bank.constants.Constants.KNET_TRANSACTION;
import com.usman.bank.constants.Constants.KNET_TRANSACTION.TRANS_STATUS_VALUES;
import com.usman.bank.models.KNetTransferDTO;
import com.usman.bank.utils.CipherUtility;
import com.usman.bank.utils.Utility;
import com.fss.plugin.iPayPipe;
import com.usman.bank.transfer.request.KNetPaymentReq;
import com.usman.bank.transfer.response.KNetPaymentRes;

/**
 * Description: This class PaypipeHelper.java
 *
 * @author vXebiau
 * @date Nov 19, 2019
 * @version 1.0
 *
 */
@Component
public class PaypipeHelper {

	private static final Logger LOG = LogManager.getLogger(PaypipeHelper.class);

	@Autowired
	private KNetUtility knetUtil;

	/**
	 * @param knetReq
	 * @return
	 */
	public iPayPipe getPaymentPipe(KNetPaymentReq knetReq) throws Exception {
		try {
			iPayPipe pipe = new iPayPipe();
			// Get from constant
			LOG.debug("knetResponseUrl:" + knetUtil.getResponseUrl());
			pipe.setResourcePath(knetUtil.getResourcePath());
			pipe.setKeystorePath(knetUtil.getKeystorePath());
			pipe.setAlias(knetUtil.getAlias());
			pipe.setAction(knetUtil.getActionId());
			pipe.setCurrency(knetUtil.getCurrencyCode());
			pipe.setResponseURL(knetUtil.getResponseUrl());
			pipe.setErrorURL(knetUtil.getErrorUrl());
			//set amount
			if (!Utility.isEmpty(knetReq.getAmountInKwd())) {
				pipe.setAmt(String.valueOf(knetReq.getAmountInKwd()));
			}
			String sendSms = "true";
			if (!Utility.isEmpty(knetReq.getIsSmsSent()) && knetReq.getIsSmsSent() == 0) {
				sendSms = "false";
			}
			pipe.setUdf4(Utility.encodeStr(CipherUtility.encrypt(sendSms)));
			return pipe;
		} catch ( Exception ex) {
			LOG.error(ex.getMessage());
			return null;
		}
	}

	/**
	 * @param knetdto
	 * @param knetReq
	 */
	public void generateKNetTransferDTO(KNetTransferDTO knetdto, KNetPaymentReq knetReq) {
		knetdto.setBbynPaymentId(knetReq.getBbynPaymentId());
		knetdto.setBbynTrackId(knetReq.getBbynTrackId());
		knetdto.setAmountInKwd(knetReq.getAmountInKwd());
		knetdto.setStage(KNET_TRANSACTION.TRANS_STAGE_VALUES.INITIALIZE_KNET_PAYMENT);
		knetdto.setStatus(TRANS_STATUS_VALUES.SUCCESS);
		knetdto.setKnetInitDate(new Timestamp(new Date().getTime()));
	}

	/**
	 * @param knetdto
	 * @param knetReq
	 */
	public void generateKNetTransferFailureDTO(KNetTransferDTO knetdto, KNetPaymentReq knetReq, iPayPipe pipe) {

		knetdto.setBbynPaymentId(knetReq.getBbynPaymentId());
		knetdto.setStage(knetReq.getStage());
		knetdto.setStatus(knetReq.getStatus());
		knetdto.setRemarks("KNet transfer failed.");
		// Set from Pipe
		knetdto.setKnetTransId(pipe.getTransId());
		knetdto.setKnetResponse(pipe.getResponseCode());
		knetdto.setKnetAuthNumber(pipe.getAuth());
		knetdto.setKnetRefId(pipe.getRef());
		knetdto.setKnetPaymentId(pipe.getPaymentId());

	}

	/**
	 * @param knetPaymentDTO
	 * @return
	 */
	public KNetPaymentRes transformKNetPaymentRes(KNetTransferDTO knetDTO) {

		KNetPaymentRes paymentRes = new KNetPaymentRes();
		paymentRes.setBbynPaymentId(knetDTO.getBbynPaymentId());
		paymentRes.setBbynRefId(knetDTO.getBbynRefId());
		paymentRes.setBbynTrackId(knetDTO.getBbynTrackId());
		paymentRes.setCustId(knetDTO.getCustId());
		paymentRes.setCif(knetDTO.getCif());
		paymentRes.setAmountInKwd(knetDTO.getAmountInKwd());
		paymentRes.setFromAccount(knetDTO.getFromAccount());
		paymentRes.setToAccount(knetDTO.getToAccount());
		paymentRes.setTransferTypeId(knetDTO.getTransferTypeId());
		paymentRes.setIsSmsSent(knetDTO.getIsSmsSent());
		paymentRes.setStage(knetDTO.getStage());
		paymentRes.setStatus(knetDTO.getStatus());
		paymentRes.setComment(knetDTO.getComment());
		return paymentRes;
	}

	/**
	 * Write payment failure message
	 * 
	 * @param pipe
	 * @param knetReq
	 */
	public void updatePaymetFailureMessage(iPayPipe pipe, KNetPaymentReq knetReq) {
		String errMsg = pipe.getError_text() + "\n" + pipe.getError();
		StringBuilder msgToPrint = new StringBuilder("\n************  initPayment ********** \n").append("Date: ")
				.append(new Timestamp(new Date().getTime())).append("\nCIF: ").append(knetReq.getCif())
				.append("\nError !!!!!\n").append(errMsg).append("\nBBYN Validation_Error: CIF@")
				.append(knetReq.getCif()).append("\npipe.getDebugMsg() = ").append(pipe.getDebugMsg())
				.append("\npipe.getRawResponse() = ").append(pipe.getRawResponse()).append("\npipe.getResult() = ")
				.append(pipe.getResult()).append("\n********************************************");

		LOG.info("msgToPrint = " + msgToPrint);
	}

	/**
	 * Write payment success message
	 * 
	 * @param knetReq
	 * @param knetPaymentId
	 */
	public void updatePaymentMessage(KNetPaymentReq knetReq, String knetPaymentId) {
		StringBuilder msgToPrint = new StringBuilder("\n************  initPayment ********** \n").append("Date: ")
				.append(new Timestamp(new Date().getTime())).append("\nCIF: ").append(knetReq.getCif())
				.append("\nPayment ID = " + knetPaymentId).append("\nKNet payment processed.")
				.append("\n********************************************");

		LOG.info("msgToPrint = " + msgToPrint);
	}

	/**
	 * Generate to KNet response value
	 * 
	 * @param transferType
	 * @return
	 */
	public iPayPipe getPipeObject(Integer transferType) {
		try {
			iPayPipe pipe = new iPayPipe();
			pipe.setResourcePath(knetUtil.getResourcePath());
			pipe.setKeystorePath(knetUtil.getKeystorePath());
			pipe.setAlias(knetUtil.getAlias());
			return pipe;
		} catch (Exception ex) {
			LOG.error("Error:" + ex.getMessage());
			return null;
		}
	}

	/**
	 * 
	 * @param pipe
	 * @param resultURL
	 * @param cif
	 */
	public void printDuplicateTransaction(iPayPipe pipe, String resultURL, String cif) {

		Timestamp currentTime = new Timestamp(new Date().getTime());
		String message = new StringBuilder("\n date-time: " + currentTime)
				.append("\n Knet Payment ID = " + pipe.getPaymentId()).append("\n resultURL = " + pipe.getResponseURL())
				.append("\n result=" + pipe.getResult()).append("\n auth=" + pipe.getAuth())
				.append("\n udf1=" + pipe.getUdf1()).append("\n udf2=" + pipe.getUdf2())
				.append("\n df3=" + pipe.getUdf3()).append("\n udf4=" + pipe.getUdf4())
				.append("\n udf5=" + pipe.getUdf5()).append("\n cif= " + cif).toString();
		LOG.info("\n Duplicate Message to Print:" + message);
	}

	/**
	 * 
	 * @param statusStr
	 * @return
	 */
	public String getRemarks(String statusStr) {
		String remarks = "";
		if (statusStr.equalsIgnoreCase("NOT CAPTURED") || statusStr.equalsIgnoreCase("NOT+CAPTURED")) {
			remarks = "Transaction was not captured from KNET.";
		} else if (statusStr.equalsIgnoreCase("CANCELED")) {
			remarks = "Transaction was cancelled by the user";
		} else if (statusStr.equalsIgnoreCase("HOST TIMEOUT")) {
			remarks = "Bank doesn't respond within the time out period";
		} else if (statusStr.equalsIgnoreCase("DENIDED BY RISK")) {
			remarks = "Risk profile to prevent fraud.";
		} else {
			remarks = statusStr;
		}
		return remarks;
	}

}
