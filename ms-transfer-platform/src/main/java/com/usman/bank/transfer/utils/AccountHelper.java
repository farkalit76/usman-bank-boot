/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.utils;

import com.usman.bank.constants.Constants;
import com.usman.bank.constants.Constants.LOG_TRANS_FIELDS;
import com.usman.bank.models.RequestDTO;
import com.usman.bank.utils.UtilityClass;

/**
 * Description: This class AccountHelper.java
 *
 * @author vXebiau
 * @date Oct 22, 2019
 * @version 1.0
 *
 */
public class AccountHelper {

	private AccountHelper() {
	}

	public static String getWSRequestKey(RequestDTO requestDTO) {
		String cif;
		String channelKey;
		String chatBotDelimiter = "";
		if (requestDTO != null) {
			if (requestDTO.getChannelModule() == Constants.CHANNEL_MODULE.BOT) {
				chatBotDelimiter = "-;CHAT-BOT;";
			}

			if (requestDTO.getRequestDetailsMap() != null
					&& requestDTO.getRequestDetailsMap().get(LOG_TRANS_FIELDS.CIF_NUMBER) != null)
				cif = requestDTO.getRequestDetailsMap().get(LOG_TRANS_FIELDS.CIF_NUMBER).toString();
			else
				cif = "cannot be identified";
			channelKey = requestDTO.getChannel() + "-" + cif + "-" + requestDTO.getRemoteIPAddress() + "-"
					+ UtilityClass.generateRandomNumber(8) + "-" + UtilityClass.getCurrentTimestamp()
					+ chatBotDelimiter;
			requestDTO.setChannelKey(channelKey);
			return channelKey;
		} else {
			return null;
		}
	}
}
