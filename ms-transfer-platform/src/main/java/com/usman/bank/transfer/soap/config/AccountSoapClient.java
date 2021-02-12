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

import com.usman.bank.account.wsdl.GetCIFAccounts;
import com.usman.bank.account.wsdl.GetCIFAccountsResponse;

/**
 * Description: This class AccountSoapClient.java
 *
 * @author vXebiau
 * @date Jul 7, 2019
 * @version 1.0
 *
 */

public class AccountSoapClient extends WebServiceGatewaySupport {

	private static final Logger LOG = LogManager.getLogger(AccountSoapClient.class);

	@Value("${soap.account.endpoint.prefix}")
	private String endpointPrefix;

	@Value("${soap.account.endpoint.details}")
	private String endpointAccountDetails;

	/**
	 * This is default constructor
	 */
	public AccountSoapClient() {
		super();
	}

	@SuppressWarnings("unchecked")
	public GetCIFAccountsResponse getAccounts(JAXBElement<GetCIFAccounts> dtoReq) {
		LOG.debug("dtoReq.getCifNumber:{}", dtoReq.getValue().getWSCIFDetailsInDTO().getCifNumber());
		JAXBElement<GetCIFAccountsResponse> marshalSendAndReceive = (JAXBElement<GetCIFAccountsResponse>) getWebServiceTemplate()
				.marshalSendAndReceive(endpointPrefix + endpointAccountDetails, dtoReq,
						new SoapActionCallback("getAccountDetails()"));
		return marshalSendAndReceive.getValue();

	}

}
