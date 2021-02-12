/**
 * @Copyright reserved to bank
 */
package com.usman.bank.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Description: This class ResponseUtils.java
 *
 * @author vXebiau
 * @date Sep 17, 2019
 * @version 1.0
 *
 */
public class ResponseUtils {

	private ResponseUtils() {
	}

	public static <T> ResponseEntity<ResponseDTO<T>> notFoundResponse() {
		return response(null, HttpStatus.NOT_FOUND);
	}

	public static <T> ResponseEntity<ResponseDTO<T>> response(ResponseDTO<T> response, HttpStatus status) {
		ResponseEntity.BodyBuilder responseEntity = ResponseEntity.status(status);
		return responseEntity.body(response);
	}

	public static <T> ResponseEntity<ResponseDTO<T>> success(ResponseDTO<T> responseDTO) {
		//return new ResponseEntity<>(responseDTO, HttpStatus.OK);
		ResponseEntity.BodyBuilder responseEntity = ResponseEntity.status(HttpStatus.OK);
		return responseEntity.body(responseDTO);
	}

	public static <T> ResponseEntity<ResponseDTO<T>> failure(ResponseDTO<T> responseDTO) {
		//return new ResponseEntity<>(responseDTO, HttpStatus.BAD_GATEWAY);
		ResponseEntity.BodyBuilder responseEntity = ResponseEntity.status(HttpStatus.BAD_GATEWAY);
		return responseEntity.body(responseDTO);
	}
}
