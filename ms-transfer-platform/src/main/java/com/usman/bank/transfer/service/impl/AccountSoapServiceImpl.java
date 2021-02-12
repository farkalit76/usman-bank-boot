/**
 * @Copyright reserved to usman bank
 */
package com.usman.bank.transfer.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.apache.commons.lang.WordUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.usman.bank.account.wsdl.GetCIFAccounts;
import com.usman.bank.account.wsdl.GetCIFAccountsResponse;
import com.usman.bank.account.wsdl.ObjectFactory;
import com.usman.bank.account.wsdl.WsAccountsDTO;
import com.usman.bank.account.wsdl.WscifDetailsInDTO;
import com.usman.bank.constants.Constants.BUNDLES;
import com.usman.bank.constants.Constants.CONFIG_GLOBAL_SETUP;
import com.usman.bank.constants.Constants.DATE_FORMAT;
import com.usman.bank.models.AccountDTO;
import com.usman.bank.models.RequestDTO;
import com.usman.bank.utils.BundleHelper;
import com.usman.bank.utils.Utility;
import com.usman.bank.utils.UtilityClass;
import com.usman.bank.transfer.exception.AccountsException;
import com.usman.bank.transfer.request.TransferInitReq;
import com.usman.bank.transfer.service.AccountSoapService;
import com.usman.bank.transfer.soap.config.AccountSoapClient;
import com.usman.bank.transfer.utils.AccountHelper;

/**
 * Description: This class AccountDetailService.java
 *
 * @author vXebiau
 * @date Jul 9, 2019
 * @version 1.0
 *
 */
@Service
public class AccountSoapServiceImpl implements AccountSoapService {

	private static final Logger LOG = LogManager.getLogger(AccountSoapServiceImpl.class);

	@Autowired
	private ApplicationContext applicationContext;

	@Override
	@Cacheable(value = "trAccountCache", key = "#accountReq.cifNumber")
	public List<AccountDTO> getAccounts(TransferInitReq accountReq, RequestDTO requestDTO) throws AccountsException {
		LOG.debug("AccountDetailServiceImpl.getAccounts started...");
		return getAccountsByCif(accountReq.getCifNumber(), requestDTO);
	}

	@Override
	public AccountDTO getAccountByCIFAndAccount(String toAccount, String cifNumber, RequestDTO requestDTO)
			throws AccountsException {
		LOG.debug("AccountDetailServiceImpl.getAccountByCIFAndAccount started...");
		AccountDTO account = new AccountDTO();
		List<AccountDTO> accountList = getAccountsByCif(cifNumber, requestDTO);
		if (!Utility.isEmpty(accountList) && !accountList.isEmpty()) {
			LOG.debug("accountList.size:" + accountList.size());
			account = accountList.stream().filter(x -> x.getAccountNumber().equals(toAccount.trim())).findFirst()
					.orElse(null);
			LOG.info("AccountResource.getAccountByCIFAndAccount account ={}", account);
		}
		return account;
	}

	/**
	 * language parameter either en, ar, etc...
	 */
	protected String language;

	public AccountSoapServiceImpl() {
		this.language = "en";
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * 
	 * @param cifNumber
	 * @return
	 */
	private List<AccountDTO> getAccountsByCif(String cifNumber, RequestDTO requestDTO) {
		LOG.debug("AccountDetailService.getAccountsByCif from SOAP...");
		AccountSoapClient accountClient = applicationContext.getBean(AccountSoapClient.class);
		LOG.debug("AccountClient bean created...");
		try {
			// RequestDTO requestDTO = getRequestDTO(cifNumber);
			GetCIFAccounts cifAccounts = new GetCIFAccounts();
			JAXBElement<GetCIFAccounts> accountReq = new ObjectFactory().createGetCIFAccounts(cifAccounts);
			cifAccounts.setWSCIFDetailsInDTO(getCifDetailDto(cifNumber, requestDTO));
			accountReq.setValue(cifAccounts);

			GetCIFAccountsResponse accountResponse = accountClient.getAccounts(accountReq);
			LOG.debug("accountResponse: {}", accountResponse.getGetCIFAccountsResults().size());

			List<WsAccountsDTO> accountsResults = accountResponse.getGetCIFAccountsResults();

			// Convert it into AccountDTO
			return getAccountDetails(accountsResults);
		} catch (Exception ex) {
			UtilityClass.logMe(LOG, ex);
			return new ArrayList<>();
		}

	}

	/**
	 * @param cifNumber
	 * @return
	 */
	private WscifDetailsInDTO getCifDetailDto(String cifNumber, RequestDTO requestDTO) {
		String channelKey = AccountHelper.getWSRequestKey(requestDTO);
		WscifDetailsInDTO cifDto = new WscifDetailsInDTO();
		cifDto.setCompanyCode(CONFIG_GLOBAL_SETUP.COMPANY_CODE);
		cifDto.setCifNumber(cifNumber);
		cifDto.setAcctType(CONFIG_GLOBAL_SETUP.DEPOSITE_ACCOUNTS_FLAG);
		cifDto.setChannelId(1);

		cifDto.setChannelKey(channelKey);
		cifDto.setRetrieveLinkCif("1");// Always retrieve the linked child accounts
		return cifDto;
	}

	/**
	 * 
	 * @param accountsResults
	 * @return
	 */
	private List<AccountDTO> getAccountDetails(List<WsAccountsDTO> wsAccountDTOs) throws Exception {
		List<AccountDTO> accounts = new ArrayList<>();
		Integer type = AccountDTO.DEPOSITE_FIXED_ACCOUNT;

		for (WsAccountsDTO wsAccountDTO : wsAccountDTOs) {
			LOG.debug("wsAccountDTO.getOsStatus:" + wsAccountDTO.getOsStatus());

			if (wsAccountDTO.getOsStatus() == null
					|| (!wsAccountDTO.getOsStatus().equals("A") && !wsAccountDTO.getOsStatus().equals("I"))) {
				continue;
			}
			AccountDTO accountDTO = new AccountDTO();
			accountDTO.setObjectTypeId(1);
			accountDTO.setStatus(wsAccountDTO.getOsStatus());
			accountDTO.setAccountType(wsAccountDTO.getAccountType());
			accountDTO.setIsLinkedAccount(
					wsAccountDTO.getChildParent() != null && "L".equalsIgnoreCase(wsAccountDTO.getChildParent()));
			if (wsAccountDTO.getAlAccBranch() != null) {
				accountDTO.setBranchCode(Integer.parseInt(wsAccountDTO.getAlAccBranch()));
			}
			accountDTO.setBriefNameAr(wsAccountDTO.getOsBriefNameArab());
			accountDTO.setBriefNameEn(wsAccountDTO.getOsBriefNameEng());
			if (wsAccountDTO.getCurrencyCode() != null) {
				accountDTO.setCurrencyCode(Integer.parseInt(wsAccountDTO.getCurrencyCode()));
			}
			if (wsAccountDTO.getOdecCVAvailBal() != null) {
				Double val = Double.parseDouble(wsAccountDTO.getOdecCVAvailBal());
				// This is removed as confirmed by Fadi Al Salha & Ahmed Fozil
				accountDTO.setCvAvailableBalance(val);
			}
			if (wsAccountDTO.getOdecCVBal() != null) {
				Double val = Double.parseDouble(wsAccountDTO.getOdecCVBal());
				accountDTO.setCvBalance(val);
			}
			if (wsAccountDTO.getOdecFCAvailBal() != null) {
				Double val = Double.parseDouble(wsAccountDTO.getOdecFCAvailBal());
				accountDTO.setFcAvailableBalance(val);
			}
			if (wsAccountDTO.getOdecFCBal() != null) {
				Double val = Double.parseDouble(wsAccountDTO.getOdecFCBal());
				accountDTO.setFcBalance(val);
			}
			accountDTO.setGlCode(wsAccountDTO.getGlCode());
			accountDTO.setGlNameAr(wsAccountDTO.getGlNameArab());

			String glName = wsAccountDTO.getGlNameEng();

			if (type.equals(AccountDTO.DEPOSITE_ACCOUNT) && !UtilityClass.isEmpty(glName)) {
				glName = WordUtils.capitalize(glName.toLowerCase());
			}

			accountDTO.setGlNameEn(glName);
			if (getLanguage().equals(BUNDLES.ARABIC_LANGUAGE)) {
				accountDTO.setGlName(wsAccountDTO.getGlNameArab());
			} else {
				accountDTO.setGlName(glName);
			}
			if (wsAccountDTO.getOdecHoldAmount() != null) {
				Double val = Double.parseDouble(wsAccountDTO.getOdecHoldAmount());
				if (val < 0)
					val = val * -1;
				accountDTO.setHoldAmount(val);
			}
			accountDTO.setIbanNumber(wsAccountDTO.getIbanNo());

			if (getLanguage().equals(BUNDLES.ARABIC_LANGUAGE)) {
				accountDTO.setBriefName(wsAccountDTO.getOsBriefNameArab());
			} else {
				accountDTO.setBriefName(wsAccountDTO.getOsBriefNameEng());
			}

			accountDTO.setLongNameAr(wsAccountDTO.getOsLongNameArab());
			accountDTO.setLongNameEn(wsAccountDTO.getOsLongNameEng());

			if (getLanguage().equals(BUNDLES.ARABIC_LANGUAGE)) {
				accountDTO.setLongName(wsAccountDTO.getOsLongNameArab());
			} else {
				accountDTO.setLongName(wsAccountDTO.getOsLongNameEng());
			}

			String openDate = wsAccountDTO.getOdOpenDate();
			if (openDate != null && !openDate.trim().equals("")) {
				accountDTO.setOpenDate(UtilityClass.stringToUtilDate(openDate, DATE_FORMAT.WS_DATE_FORMAT));
			}

			if (wsAccountDTO.getAddRef() != null) {
				accountDTO.setAccountNumber(wsAccountDTO.getAddRef());
			}
			if (wsAccountDTO.getAdditionalRef() != null) {
				accountDTO.setAccountNumber(wsAccountDTO.getAdditionalRef());
			}
			if (wsAccountDTO.getSlNo() != null && !wsAccountDTO.getSlNo().trim().equals("")) {
				accountDTO.setSlNo(Integer.parseInt(wsAccountDTO.getSlNo()));
			}
			if (wsAccountDTO.getOlBranchCode() != null) {
				accountDTO.setBranchCode(Integer.parseInt(wsAccountDTO.getOlBranchCode()));
			}

			/**
			 * JIRA: RTLCRPMBDV-441 (DA-550 - Card Issuance CR Changes) Neel: 24-Jan-2017
			 */
			if (wsAccountDTO.getEligibleForCardIssuance() != null
					&& wsAccountDTO.getEligibleForCardIssuance().trim().equals("1")) {
				accountDTO.setIsEligibleForCardIssuance(Boolean.TRUE);
			} else {
				accountDTO.setIsEligibleForCardIssuance(Boolean.FALSE);
			}

			accountDTO.setBranchName(wsAccountDTO.getOsBranchName());
			if (type == AccountDTO.DEPOSITE_FIXED_ACCOUNT) {
				// For deposit account
				String branchDate = wsAccountDTO.getOdBranchDate();
				if (branchDate != null && !branchDate.trim().equals("")) {
					accountDTO.setBranchDate(UtilityClass.stringToUtilDate(branchDate, DATE_FORMAT.WS_DATE_FORMAT));
				}
				String lastActivityDate = wsAccountDTO.getOdLastActivityDate();
				if (lastActivityDate != null && !lastActivityDate.trim().equals("")) {
					accountDTO.setLastActivityDate(
							UtilityClass.stringToUtilDate(lastActivityDate, DATE_FORMAT.WS_DATE_FORMAT));
				}
				String lastDepositDate = wsAccountDTO.getOdLastDepositDate();
				if (lastDepositDate != null && !lastDepositDate.trim().equals("")) {
					accountDTO.setLastDepositeDate(
							UtilityClass.stringToUtilDate(lastDepositDate, DATE_FORMAT.WS_DATE_FORMAT));
				}
				String maturity = wsAccountDTO.getOdMaturity();
				if (maturity != null && !maturity.trim().equals("")) {
					accountDTO.setMaturityDate(UtilityClass.stringToUtilDate(maturity, DATE_FORMAT.WS_DATE_FORMAT));
				}
				if (wsAccountDTO.getOdecLastDepositAmount() != null) {
					Double val = Double.parseDouble(wsAccountDTO.getOdecLastDepositAmount());
					if (val < 0) {
						val = val * -1;
					}
					accountDTO.setLastDepositeAmount(val);
				}
				if (wsAccountDTO.getOlTenor() != null) {
					accountDTO.setTenor(Integer.parseInt(wsAccountDTO.getOlTenor()));
					accountDTO.setFormattedTenure(Integer.parseInt(wsAccountDTO.getOlTenor()) + " "
							+ BundleHelper.getInstance(getLanguage()).getBundleMsg("display_multiple_days"));
				}
				if (wsAccountDTO.getOdecExpectedProfitRate() != null) {
					accountDTO.setExpectedProfitRate(Double.parseDouble(wsAccountDTO.getOdecExpectedProfitRate()));
					accountDTO.setShowRate(Boolean.TRUE);
				} else {
					accountDTO.setExpectedProfitRate(0.0);
					/* if expected rate profit rate is null set show rate FALSE */
					accountDTO.setShowRate(Boolean.FALSE);
				}

				accountDTO.setProfitAccountNumber(wsAccountDTO.getOsProfitAccount());

				accountDTO.setAutoRenewal(wsAccountDTO.getOsAutoRenewal());

				if (BUNDLES.ARABIC_LANGUAGE.equalsIgnoreCase(getLanguage())) {
					accountDTO.setFixedMaturityType(wsAccountDTO.getGlNameArab());
				} else {
					accountDTO.setFixedMaturityType(wsAccountDTO.getGlNameEng());
				}
			}

			/* These Properties for Share Account Details */
			/* BEGIN */
			accountDTO.setSwiftCode("usman_swift_code");
			accountDTO.setBankName("usman_bank_name");
			accountDTO.setBankAddress("usman_account_bank_address");
			accountDTO.setBankCountry("usman_country");
			/* END */

			accounts.add(accountDTO);
		}
		LOG.debug("------>return accounts.size:" + accounts.size());
		return accounts;
	}

}
