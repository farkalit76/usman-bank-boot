/**
 * @Copyright reserved to bank
 */
package com.usman.bank.transfer.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.usman.bank.constants.Constants;
import com.usman.bank.utils.Utility;

/**
 * Description: This class KNetUtility.java
 *
 * @author vXebiau
 * @date Nov 24, 2019
 * @version 1.0
 *
 */
@Component
public class KNetUtility {

	private static final Logger LOG = LogManager.getLogger(KNetUtility.class);

	@Value("${knet.alias.name}")
	protected String alias;

	@Value("${knet.response.url}")
	protected String responseUrl;

	@Value("${knet.error.url}")
	protected String errorUrl;

	@Value("${knet.currency.code}")
	protected String currencyCode;

	@Value("${knet.action.id}")
	protected String actionId;

	@Value("${knet.keystore.path.dev}")
	private String keystorePathDEV;

	@Value("${knet.keystore.path.uat}")
	private String keystorePathUAT;

	@Value("${knet.resource.path.dev}")
	private String resourcePathDEV;

	@Value("${knet.resource.path.uat}")
	private String resourcePathUAT;

	protected String keystorePath;

	protected String resourcePath;

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getResponseUrl() {
		return responseUrl;
	}

	public void setResponseUrl(String responseUrl) {
		this.responseUrl = responseUrl;
	}

	public String getErrorUrl() {
		return errorUrl;
	}

	public void setErrorUrl(String errorUrl) {
		this.errorUrl = errorUrl;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getActionId() {
		return actionId;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public String getKeystorePath() {
		String env = System.getProperty(Constants.BBYN_ENV);
		if (Utility.isEmpty(env) || env.equals(Constants.DEV_ENV)) {
			keystorePath = keystorePathDEV;
		} else {
			keystorePath = keystorePathUAT;
		}
		LOG.debug("keystorePath:" + keystorePath);
		return keystorePath;
	}

	public void setKeystorePath(String keystorePath) {
		this.keystorePath = keystorePath;
	}

	public String getResourcePath() {
		String env = System.getProperty(Constants.BBYN_ENV);
		if (Utility.isEmpty(env) || env.equals(Constants.DEV_ENV)) {
			resourcePath = resourcePathDEV;
		} else {
			resourcePath = resourcePathUAT;
		}
		LOG.debug("resourcePath:" + resourcePath);
		return resourcePath;
	}

	public void setResourcePath(String resourcePath) {
		this.resourcePath = resourcePath;
	}

	@Override
	public String toString() {
		return "KNetUtility [alias=" + alias + ", responseUrl=" + responseUrl + ", errorUrl=" + errorUrl
				+ ", currencyCode=" + currencyCode + ", actionId=" + actionId + "]";
	}

}
