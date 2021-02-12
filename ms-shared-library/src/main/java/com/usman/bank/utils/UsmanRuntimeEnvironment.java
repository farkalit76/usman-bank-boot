package com.usman.bank.utils;

import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.Document;

import com.usman.bank.constants.Constants;
import com.usman.bank.constants.Constants.XML_TAG_NAMES;

/**
 * When a managed server starts, we load specific environment variables. For
 * instance, we have 3 different environments, which are: dev, UAT, and prod. In
 * a way, each one of them have different runtime variables, so here we would
 * load each of their specific values to a cache to be retrieved anywhere in the
 * code-base.
 * 
 * Kindly keep in mind, the cache implementation usually is in the Façade
 * layer, but we implemented it here because we have several cache calls in the
 * DAO later (where we can’t call the Façade from there). To guarantee its
 * universal access to the whole code-base, we implemented it here, but this is
 * not a standard way of doing it.
 */
public class UsmanRuntimeEnvironment {

	// private static final Logger logger = LogManager.getLogger(Helper.class);

	// Private constructor to hide the implicit public one
	private UsmanRuntimeEnvironment() {
	}

	/**
	 * runtime variables to be stored in 2 places: cache and static variables. From
	 * live environment, we can see runtime cache is hit the most, and with adding
	 * these new runtime variables it would get worst: --> RS audit control
	 * management --> REST Batch --> SOAP Batch --> Log master Batch
	 * 
	 * The design: When adding “static�? attribute in the xml tag, then it would
	 * store in static instead of cache memory. Example, <AUDIT_MANAGEMENT>
	 * <BATCH_LIMIT_LOG static="static">1</BATCH_LIMIT_LOG>
	 * <BATCH_LIMIT_WS_LOG static="static">1</BATCH_LIMIT_WS_LOG>
	 * <BATCH_LIMIT_RS_LOG static="static">1</BATCH_LIMIT_RS_LOG>
	 * <ENABLE_RS_LOG static="static">true</ENABLE_RS_LOG> </AUDIT_MANAGEMENT>
	 */
	private static Map<String, String> staticDomainConfigValue = new HashMap<String, String>();
//	private static Map<Integer, SecurityConfigDTO> securityConfigDTOMap = new HashMap<>();
//	private static Map<String, Map<String, MasterLogDTO>> soapAuditingMap = new HashMap<>();
	private static Document payload;

//	@SuppressWarnings("rawtypes")
//	public static void init() throws Exception {
//		logger.info("UsmanRuntimeEnvironment.init().");
//		staticDomainConfigValue = new HashMap<>();
//
//		String domainCacheKey = CACHE_ITEMS.DOMAIN_SPECIFIC_VARIABLES_ITEMS;
//		String securityConfigCacheKey = CACHE_ITEMS.SECURITY_CONFIGURATION_ITEMS;
//		ConfigManagerDAO configManagerDAO = new ConfigManagerDAO();
//		ErrorDTO errorDTO;
//
//		/**************************************************/
//		payload = getPayload();
//
//		for (XML_TAG_NAMES d : XML_TAG_NAMES.values()) {
//			String key = d.toString();
//			String value = null;
//			if (payload != null && key != null && getValue(payload, key) != null)
//				value = getValue(payload, key);
//			staticDomainConfigValue.put(key, value);
//		}
//
//		CacheManager.createNewInstance();
//		CacheManager.getInstance().put(domainCacheKey, staticDomainConfigValue, Constants.CACHE.CACHE_TTL.YEARLY);
//
//		/**************************************************/
//		errorDTO = configManagerDAO.getAllSecurityConfigFromDB();
//		securityConfigDTOMap = (Map<Integer, SecurityConfigDTO>) errorDTO.getOutData();
//
//		CacheManager.getInstance().put(securityConfigCacheKey, securityConfigDTOMap, Constants.CACHE.CACHE_TTL.YEARLY);
//	}
//
//	public static Document getPayload() throws Exception {
//		ConfigManagerDAO configManagerDAO = new ConfigManagerDAO();
//		ErrorDTO errorDTO = configManagerDAO.getDomainServerConfigDatabase();
//		if (errorDTO != null)
//			return (Document) errorDTO.getOutData();
//		else
//			return null;
//	}
//
//	private static String getValue(Document document, String key) {
//		String value = "";
//		try {
//			if (document.getElementsByTagName(key) != null && document.getElementsByTagName(key).item(0) != null
//					&& (document.getElementsByTagName(key).item(0).getAttributes().getLength() > 0)
//					&& document.getElementsByTagName(key).item(0).getAttributes().item(0).getNodeValue()
//							.equals("static")) {
//				value = document.getElementsByTagName(key).item(0).getTextContent();
//				return value;
//			}
//			// others!
//			value = document.getElementsByTagName(key).item(0).getTextContent();
//		} catch (Exception ex) {
//			logger.info(key.concat(" not found"));
//			logger.debug("Exception at " + Thread.currentThread().getName() + " " + ex + "::" + ex.getMessage());
//			return value;
//		}
//		return value;
//	}

	public static String getDomainConfigValue(XML_TAG_NAMES key) {
		return staticDomainConfigValue.get(key.toString());
	}

	public static String getDomainConfigValue(String key) {
		String value = "";
		if (key.startsWith("US_") && (!key.equals(Constants.XML_TAG_NAMES.US_PRODUCT_IDS.toString()))
				&& (!key.equals(Constants.XML_TAG_NAMES.US_PRODUCT_VALUES.toString()))) {
			// iTunes US market
			String[] usProductIdsArr = payload.getElementsByTagName(Constants.XML_TAG_NAMES.US_PRODUCT_IDS.toString())
					.item(0).getTextContent().split(",");
			String[] usProductValuesArr = payload
					.getElementsByTagName(Constants.XML_TAG_NAMES.US_PRODUCT_VALUES.toString()).item(0).getTextContent()
					.split(",");
			for (int i = 0; i < usProductIdsArr.length; i++) {
				if (key.equals("US_" + usProductIdsArr[i])) {
					value = usProductValuesArr[i];
					return value;
				}
			}
		} else if (key.startsWith("UK_") && (!key.equals(Constants.XML_TAG_NAMES.UK_PRODUCT_IDS.toString()))
				&& (!key.equals(Constants.XML_TAG_NAMES.UK_PRODUCT_VALUES.toString()))) {
			// iTunes UK market
			String[] ukProductIdsArr = payload.getElementsByTagName(Constants.XML_TAG_NAMES.UK_PRODUCT_IDS.toString())
					.item(0).getTextContent().split(",");
			String[] ukProductValuesArr = payload
					.getElementsByTagName(Constants.XML_TAG_NAMES.UK_PRODUCT_VALUES.toString()).item(0).getTextContent()
					.split(",");

			for (int i = 0; i < ukProductIdsArr.length; i++) {
				if (key.equals("UK_" + ukProductIdsArr[i])) {
					value = ukProductValuesArr[i];
					return value;
				}
			}
		} else if (key.startsWith("GP_") && (!key.equals(Constants.XML_TAG_NAMES.GOOGLE_PRODUCT_IDS.toString()))
				&& (!key.equals(Constants.XML_TAG_NAMES.GOOGLE_PRODUCT_VALUES.toString()))) {
			// google play
			String[] googlePlayProductIdsArr = payload
					.getElementsByTagName(Constants.XML_TAG_NAMES.GOOGLE_PRODUCT_IDS.toString()).item(0)
					.getTextContent().split(",");
			String[] googlePlayProductValuesArr = payload
					.getElementsByTagName(Constants.XML_TAG_NAMES.GOOGLE_PRODUCT_VALUES.toString()).item(0)
					.getTextContent().split(",");

			for (int i = 0; i < googlePlayProductIdsArr.length; i++) {
				if (key.equals("GP_" + googlePlayProductIdsArr[i])) {
					value = googlePlayProductValuesArr[i];
					return value;
				}
			}
		}

		return staticDomainConfigValue.get(key);
	}

//	public static void flushRuntimeConfigCache() throws Exception {
//		// flush the cache values
//		// clear the static values
//		staticDomainConfigValue = new HashMap<>();
//		String domainCacheKey = CACHE_ITEMS.DOMAIN_SPECIFIC_VARIABLES_ITEMS;
//		String securityConfigCacheKey = CACHE_ITEMS.SECURITY_CONFIGURATION_ITEMS;
//		CacheManager.getInstance().flush(domainCacheKey);
//		CacheManager.getInstance().flush(securityConfigCacheKey);
//		init();
//		// update SOA end-point
//		IMALFactory.getNewInstance();
//	}
//
//	@SuppressWarnings("unchecked")
//	public static String getSecurityConfigValue(Integer configId, Boolean decryptFlag) {
//		try {
//			if (securityConfigDTOMap != null && !securityConfigDTOMap.isEmpty()) {
//				SecurityConfigDTO securityConfigDTO = securityConfigDTOMap.get(configId);
//				if (decryptFlag) {
//					return UtilityClass.decryptText(securityConfigDTO.getEncryptedValue(),
//							securityConfigDTO.getLocation());
//				} else {
//					return securityConfigDTO.getEncryptedValue();// Do not decrypt the value since the encrypted value
//																	// is required
//				}
//			}
//		} catch (Exception e) {
//			UtilityClass.logMe(logger, e);
//		}
//
//		return null;
//	}
//
//	@SuppressWarnings("unchecked")
//	public static Map<String, Map<String, MasterLogDTO>> getSoapAuditingCache() {
//
//		if (soapAuditingMap != null && !soapAuditingMap.isEmpty()) {
//			return soapAuditingMap;
//		}
//
//		try {
//			soapAuditingMap = (Map<String, Map<String, MasterLogDTO>>) CacheManager.getInstance().getMap(
//					CACHE_ITEMS.SOAP_AUDITING_ITEMS, new TypeReference<Map<String, Map<String, MasterLogDTO>>>() {
//					});
//
//			// if it's not null, then good return it
//			if (!UtilityClass.isEmpty(soapAuditingMap) && !soapAuditingMap.isEmpty()) {
//				return soapAuditingMap;
//			}
//			// the cache is empty, get it from the database
//
//			ErrorDTO errorDTO = ConfigManagerFacade.getInstance(BUNDLES.DEFAULT_LANGUAGE).getSoapAuditFromDB();
//			if (errorDTO.isClean()) {
//				CacheManager.getInstance().put(CACHE_ITEMS.SOAP_AUDITING_ITEMS, errorDTO.getOutData(),
//						CACHE.CACHE_TTL.NEVER_EXPIRE);
//				// get the value
//				soapAuditingMap = (Map<String, Map<String, MasterLogDTO>>) errorDTO.getOutData();
//			}
//		} catch (Exception exception) {
//			UtilityClass.logMe(logger, exception);
//		}
//		return soapAuditingMap;
//
//	}

}