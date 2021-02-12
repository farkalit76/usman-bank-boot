/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.soap.config;

import javax.xml.bind.JAXBElement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.usman.bank.payment.wsdl.InstantDeposit;
import com.usman.bank.payment.wsdl.InstantDepositResponse;

/**
 * Description: This class PaymentSoapClient.java
 *
 * @author vXebiau
 * @date Jul 7, 2019
 * @version 1.0
 *
 */

public class PaymentSoapClient extends WebServiceGatewaySupport {

	private static final Logger LOG = LogManager.getLogger(PaymentSoapClient.class);

	@Value("${soap.payment.endpoint.prefix}")
	private String endpointPrefix;

	@Value("${soap.payment.endpoint.details}")
	private String endpointPaymentDetails;

	/**
	 * This is default constructor
	 */
	public PaymentSoapClient() {
		super();
	}

	@SuppressWarnings("unchecked")
	public InstantDepositResponse instantDeposit(JAXBElement<InstantDeposit> paymentReq) {
		LOG.debug("PaymentSoapClient.instantDeposit- paymentReq.getValue:{}", paymentReq.getValue());
		JAXBElement<InstantDepositResponse> marshalSendAndReceive = (JAXBElement<InstantDepositResponse>) getWebServiceTemplate()
				.marshalSendAndReceive(endpointPrefix + endpointPaymentDetails, paymentReq,
						new SoapActionCallback("instantDeposit()"));
		return marshalSendAndReceive.getValue();

	}

}
