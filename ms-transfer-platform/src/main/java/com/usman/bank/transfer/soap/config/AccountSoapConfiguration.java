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
 * Description: This class AccountSoapConfiguration.java
 *
 * @author vXebiau
 * @date Jul 8, 2019
 * @version 1.0
 *
 */
@EnableWs
@Configuration
public class AccountSoapConfiguration {

	@Value("${soap.account.endpoint.prefix}")
	private String endpointPrefix;
	
	@Value("${soap.account.auth.userid}")
	private String userName;
	
	@Value("${soap.account.auth.passkey}")
	private String userPswd;
	
	@Bean
	public Wss4jSecurityInterceptor securityInterceptorAccount(){
	    Wss4jSecurityInterceptor wss4jSecurityInterceptor = new Wss4jSecurityInterceptor();
	    wss4jSecurityInterceptor.setValidationCallbackHandler(securityCallbackHandlerAccount());
	    wss4jSecurityInterceptor.setSecurementSamlCallbackHandler(securityCallbackHandlerAccount());
	    wss4jSecurityInterceptor.setSecurementActions(WSHandlerConstants.TIMESTAMP + " " +WSHandlerConstants.USERNAME_TOKEN);
	    wss4jSecurityInterceptor.setSecurementUsernameTokenCreated(true);
	    wss4jSecurityInterceptor.setSecurementPasswordType(WSConstants.PW_TEXT);
	    wss4jSecurityInterceptor.setSecurementUsername(userName);
	    wss4jSecurityInterceptor.setSecurementPassword(userPswd);
	    wss4jSecurityInterceptor.setTimestampPrecisionInMilliseconds(true);
	    return wss4jSecurityInterceptor;
	}

	@Bean
	public Jaxb2Marshaller getMarshallerAccount() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setCheckForXmlRootElement(false);
		marshaller.setContextPath("com.usman.bank.account.wsdl");
		return marshaller;
	}

	@Bean
	public AccountSoapClient getAccountClient() {
		AccountSoapClient acctClient = new AccountSoapClient();
		acctClient.setMarshaller(getMarshallerAccount());
		acctClient.setUnmarshaller(getMarshallerAccount());
		acctClient.setDefaultUri(endpointPrefix);
		ClientInterceptor[] interceptors = new ClientInterceptor[] { securityInterceptorAccount() };
		acctClient.setInterceptors(interceptors);
		return acctClient;
	}

	@Bean
	public SimplePasswordValidationCallbackHandler securityCallbackHandlerAccount() {
		SimplePasswordValidationCallbackHandler callbackHandler = new SimplePasswordValidationCallbackHandler();
		Properties users = new Properties();
		users.setProperty("users", userName);
		users.setProperty("password", userPswd);
		callbackHandler.setUsers(users);
		return callbackHandler;
	}
	
}
