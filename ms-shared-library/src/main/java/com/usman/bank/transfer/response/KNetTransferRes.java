/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.response;

import java.util.List;

import com.usman.bank.models.KNetTransferDTO;

/**
 * Description: This class KnetTransferRes.java
 *
 * @author vXebiau
 * @date Oct 28, 2019
 * @version 1.0
 *
 */
public class KNetTransferRes {

	private List<KNetTransferDTO> transferList;

	public List<KNetTransferDTO> getTransferList() {
		return transferList;
	}

	public void setTransferList(List<KNetTransferDTO> transferList) {
		this.transferList = transferList;
	}

	@Override
	public String toString() {
		return "KnetTransferRes [transferList=" + transferList + "]";
	}

}
