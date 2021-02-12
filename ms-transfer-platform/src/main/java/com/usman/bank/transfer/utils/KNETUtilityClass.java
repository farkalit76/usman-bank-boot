package com.usman.bank.transfer.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.usman.bank.constants.Constants;
import com.usman.bank.utils.UsmanRuntimeEnvironment;
import com.usman.bank.utils.Utility;

public class KNETUtilityClass {

	private static final Logger LOG = LogManager.getLogger(KNETUtilityClass.class);

	public static boolean isKNetNewPGWEnabled() {
		Boolean newPaymentGateway = Boolean.parseBoolean(
				UsmanRuntimeEnvironment.getDomainConfigValue(Constants.XML_TAG_NAMES.NEW_PAYMENT_GATEWAY));
		if( !Utility.isEmpty(newPaymentGateway))
			return newPaymentGateway;
		return true;
	}

	public static String getKeyStoreFile() {

		String keystorePath = UsmanRuntimeEnvironment.getDomainConfigValue(Constants.XML_TAG_NAMES.KEY_STORE_PATH);
		LOG.debug("keystorePath:"+keystorePath);
		String pathSeperator = "/";

		if (Utility.isEmpty(keystorePath)) {
			keystorePath = "/oracle/wls/user_projects/domains/ecore_domain/config/application/payme/";
		}

		if (Utility.isDev())
			pathSeperator = "\\";

		keystorePath = keystorePath + "newPG" + pathSeperator;

		if (Utility.isDev()) {
			keystorePath = "D:\\oracle\\domains\\ecore_domain\\config\\application\\payme\\newPG\\";
		}

		return keystorePath;

	}

	public static String getResourceFile(int transferType) {

		String resourcePath = UsmanRuntimeEnvironment.getDomainConfigValue(Constants.XML_TAG_NAMES.RESOURCE_PATH);
		String pathSeperator = "/";

		if (Utility.isDev())
			pathSeperator = "\\";

		if (Utility.isEmpty(resourcePath)) {
			resourcePath = "/oracle/wls/user_projects/domains/ecore_domain/config/application/payme/";
		}

		if (Utility.isDev()) {
			resourcePath = "D:\\oracle\\domains\\ecore_domain\\config\\application\\payme\\";
		}

		if (isKNetNewPGWEnabled())
			resourcePath = resourcePath + "newPG" + pathSeperator;
		else {
			resourcePath = resourcePath + "oldPG" + pathSeperator;
			if (transferType == Constants.TRANSFER_TYPES.PAY_ME) {
				resourcePath += "paymeshare" + pathSeperator;
			}
		}

		return resourcePath;
	}

	public static String getPayMeInAppAlias() {

		String alias = null;

		if (isKNetNewPGWEnabled()) {
			alias = UsmanRuntimeEnvironment.getDomainConfigValue(Constants.XML_TAG_NAMES.PAYME_IN_APP_AIAS_NEW_PGW);
		} else {
			alias = UsmanRuntimeEnvironment.getDomainConfigValue(Constants.XML_TAG_NAMES.ALIAS);
		}

		return alias;
	}

	public static String getPayMeShareAlias() {

		String alias = null;

		if (isKNetNewPGWEnabled()) {
			alias = UsmanRuntimeEnvironment.getDomainConfigValue(Constants.XML_TAG_NAMES.PAYME_SHARE_AIAS_NEW_PGW);
		} else {
			alias = UsmanRuntimeEnvironment.getDomainConfigValue(Constants.XML_TAG_NAMES.PAYME_ALIAS);
		}

		return alias;
	}

	public static String getKnetResponseURL() {
		String responseURL = UsmanRuntimeEnvironment.getDomainConfigValue(Constants.XML_TAG_NAMES.RESPONSE_URL);

		if (!Utility.isEmpty(responseURL)) {
			if (!isKNetNewPGWEnabled())
				responseURL = responseURL.replace("/knet/", "/knet/legacyknet/");
		}
		return responseURL;
	}

	public static String getKnetErrorURL() {
		String errorURL = UsmanRuntimeEnvironment.getDomainConfigValue(Constants.XML_TAG_NAMES.ERROR_URL);

		if (!Utility.isEmpty(errorURL)) {
			if (!isKNetNewPGWEnabled())
				errorURL = errorURL.replace("/knet/", "/knet/legacyknet/");
		}
		return errorURL;
	}

	public static String getPayMeInAppResultPageURL() {
		String resultPageURL = UsmanRuntimeEnvironment.getDomainConfigValue(Constants.XML_TAG_NAMES.KNET_RESULT_URL);

		if (!isKNetNewPGWEnabled())
			resultPageURL = resultPageURL.replace("/knet/", "/knet/legacyknet/");

		return resultPageURL;
	}

	public static String getPayMeShareResultPageURL() {

		String resultPageURL = UsmanRuntimeEnvironment.getDomainConfigValue(Constants.XML_TAG_NAMES.PAYME_RESULT_URL);

		if (!isKNetNewPGWEnabled())
			resultPageURL = resultPageURL.replace("/knet/", "/knet/legacyknet/");

		return resultPageURL;

	}
}
