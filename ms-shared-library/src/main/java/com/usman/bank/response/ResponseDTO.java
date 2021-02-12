/**
 * @Copyright reserved to bank
 */
package com.usman.bank.response;

/**
 * Description: This class ResponseDTO.java
 *
 * @author  vXebiau
 * @date    Sep 10, 2019
 * @version 1.0
 *
 */
public class ResponseDTO<T> {
	
	protected StatusDTO status;
	
	protected T response;

	public StatusDTO getStatus() {
		return status;
	}

	public void setStatus(StatusDTO statusDTO) {
		this.status = statusDTO;
	}

	public T getResponse() {
		return response;
	}

	public void setResponse(T response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "ResponseDTO [status=" + status + ", response=" + response + "]";
	}

}
