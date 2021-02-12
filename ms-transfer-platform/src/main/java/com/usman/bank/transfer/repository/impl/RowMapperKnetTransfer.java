/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.usman.bank.models.KNetTransferDTO;

/**
 * Description: This class RowMapperKnetTransfer.java
 *
 * @author vXebiau
 * @date Oct 28, 2019
 * @version 1.0
 *
 */
public class RowMapperKnetTransfer implements RowMapper<KNetTransferDTO> {

	@Override
	public KNetTransferDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		KNetTransferDTO knetDto = new KNetTransferDTO(rs.getString("CIF"), rs.getInt("CUST_ID"));
		knetDto.setBbynPaymentId(rs.getLong("BBYN_PAYMENT_ID"));
		knetDto.setBbynTrackId(rs.getString("BBYN_TRACK_ID"));
		knetDto.setChannelId(rs.getInt("CHANNEL_ID"));
		knetDto.setSmsMsg(rs.getString("SMS_MSG"));
		knetDto.setBbynRefId(rs.getString("BBYN_REF_ID"));
		knetDto.setTransAmount(rs.getBigDecimal("AMOUNT_IN_KWD"));
		knetDto.setAmountInKwd(rs.getBigDecimal("AMOUNT_IN_KWD"));
		knetDto.setFromAccount(rs.getString("FROM_ACCOUNT"));
		knetDto.setToAccount(rs.getString("TO_ACCOUNT"));
		knetDto.setComment(rs.getString("USER_COMMENTS"));
		knetDto.setTransferTypeId(rs.getInt("TRANSFER_TYPE_ID"));
		knetDto.setIsSmsSent(rs.getInt("IS_SMS_SENT"));
		knetDto.setStage(rs.getInt("STAGE"));
		knetDto.setStatus(rs.getInt("STATUS"));
		//Add KNET success info
		knetDto.setKnetPaymentId(rs.getString("KNET_PAYMENT_ID"));
		knetDto.setKnetPaymentUrl(null);
		knetDto.setKnetTransId(rs.getString("KNET_TRANS_ID"));
		knetDto.setKnetAuthNumber(rs.getString("KNET_AUTH_NUMBER"));
		knetDto.setKnetRefId(rs.getString("KNET_REFERENCE_ID"));
		knetDto.setKnetResponse(rs.getString("KNET_RESPONSE"));
		knetDto.setKnetInitDate(rs.getTimestamp("KNET_INIT_DATE"));
		knetDto.setRemarks(rs.getString("REMARKS"));
		return knetDto;
	}
}
