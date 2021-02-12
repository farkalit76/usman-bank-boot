/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.response;

import com.usman.bank.models.KNetTransferDTO;
import com.usman.bank.response.ResponseDTO;

/**
 * Description: This class KNetTransferRespose.java
 *
 * @author  vXebiau
 * @date    Dec 17, 2019
 * @version 1.0
 *
 */
public class KNetTransferResponse {

	protected KNetTransferDTO knetTransferDto;
	
	protected ResponseDTO responseDto;

	/**
	 * @return the knetTransferDto
	 */
	public KNetTransferDTO getKnetTransferDto() {
		return knetTransferDto;
	}

	/**
	 * @param knetTransferDto the knetTransferDto to set
	 */
	public void setKnetTransferDto(KNetTransferDTO knetTransferDto) {
		this.knetTransferDto = knetTransferDto;
	}

	/**
	 * @return the responseDto
	 */
	public ResponseDTO getResponseDto() {
		return responseDto;
	}

	/**
	 * @param responseDto the responseDto to set
	 */
	public void setResponseDto(ResponseDTO responseDto) {
		this.responseDto = responseDto;
	}
	
	
	
}
