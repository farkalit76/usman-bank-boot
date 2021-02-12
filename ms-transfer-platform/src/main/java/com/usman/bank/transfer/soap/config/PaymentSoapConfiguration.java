/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.soap.config;

import java.util.Properties;

import org.apache.wss4j.dom.WSConstants;

import org.apache.wss4j.dom.handler.WSHandlerConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;
import org.springframework.ws.soap.security.wss4j2.callback.SimplePasswordValidationCallbackHandler;

/**
 * Description: This class PaymentSoapConfiguration.java
 *
 * @author vXebiau
 * @date Jul 8, 2019
 * @version 1.0
 *
 */
@EnableWs
@Configuration
public class PaymentSoapConfiguration {

	@Value("${soap.payment.endpoint.prefix}")
	private String endpointPrefix;
	
	@Value("${soap.payment.auth.userid}")
	private String userName;
	
	@Value("${soap.payment.auth.passkey}")
	private String userPswd;
	
	@Bean
	public Wss4jSecurityInterceptor securityInterceptorPayment(){
	    Wss4jSecurityInterceptor wss4jSecurityInterceptor = new Wss4jSecurityInterceptor();
	    wss4jSecurityInterceptor.setValidationCallbackHandler(securityCallbackHandlerPayment());
	    wss4jSecurityInterceptor.setSecurementSamlCallbackHandler(securityCallbackHandlerPayment());
	    wss4jSecurityInterceptor.setSecurementActions(WSHandlerConstants.TIMESTAMP + " " +WSHandlerConstants.USERNAME_TOKEN);
	    wss4jSecurityInterceptor.setSecurementUsernameTokenCreated(true);
	    wss4jSecurityInterceptor.setSecurementPasswordType(WSConstants.PW_TEXT);
	    wss4jSecurityInterceptor.setSecurementUsername(userName);
	    wss4jSecurityInterceptor.setSecurementPassword(userPswd);
	    wss4jSecurityInterceptor.setTimestampPrecisionInMilliseconds(true);
	    return wss4jSecurityInterceptor;
	}

	@Bean
	public Jaxb2Marshaller getMarshallerPayment() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setCheckForXmlRootElement(false);
		marshaller.setContextPath("com.usman.bank.payment.wsdl");
		return marshaller;
	}

	@Bean
	public PaymentSoapClient getPaymentClient() {
		PaymentSoapClient acctClient = new PaymentSoapClient();
		acctClient.setMarshaller(getMarshallerPayment());
		acctClient.setUnmarshaller(getMarshallerPayment());
		acctClient.setDefaultUri(endpointPrefix);
		ClientInterceptor[] interceptors = new ClientInterceptor[] { securityInterceptorPayment() };
		acctClient.setInterceptors(interceptors);
		return acctClient;
	}

	@Bean
	public SimplePasswordValidationCallbackHandler securityCallbackHandlerPayment() {
		SimplePasswordValidationCallbackHandler callbackHandler = new SimplePasswordValidationCallbackHandler();
		Properties users = new Properties();
		users.setProperty("users", userName);
		users.setProperty("password", userPswd);
		callbackHandler.setUsers(users);
		return callbackHandler;
	}
	
}
