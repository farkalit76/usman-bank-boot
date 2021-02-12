/**
 *  @Copyright reserved to bank
 */
package com.usman.bank.account.web.resource;

import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usman.bank.constants.AccountConstants;
import com.usman.bank.models.AccountDTO;
import com.usman.bank.models.UserAccountDTO;
import com.usman.bank.models.UserDTO;
import com.usman.bank.utils.Utility;
import com.usman.bank.account.request.AccountByIdReq;
import com.usman.bank.account.request.AccountByNumberReq;
import com.usman.bank.account.request.AccountDetailReq;
import com.usman.bank.account.request.UserReq;
import com.usman.bank.account.response.AccountListRes;
import com.usman.bank.account.service.AccountService;
import com.usman.bank.account.service.AccountSoapService;
import com.usman.bank.account.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Description: This class AccountResource.java
 *
 * @author vXebiau - Farkalit Usman
 * @date Jun 27, 2019
 * @version 1.0
 *
 */
@RestController
@RequestMapping(AccountConstants.RESOURCE_NAME)
@Api(value = "Account Services", description = "Operations pertaining to account related services like get account by cif number.")
public class AccountResource {

	private static final Logger LOG = LogManager.getLogger(AccountResource.class);

	@Autowired
	private AccountService accoutService;

	@Autowired
	private AccountSoapService accounSoapService;

	@Autowired
	private UserService userService;

	/**
	 * 
	 * @param accountReq
	 * @return
	 */
	@PostMapping(value = AccountConstants.ACCOUNTS_BYID, produces = { MediaType.APPLICATION_JSON_VALUE })
	public UserAccountDTO getAccountById(@Valid @RequestBody AccountByIdReq accountReq) {
		LOG.info("AccountResource.getAccountById started...");
		UserAccountDTO account = new UserAccountDTO();
		try {
			account = accoutService.getAccountById(accountReq.getAccountId());
		} catch (Exception e) {
			LOG.error("getAccountsById Error:" + e.getMessage());
			return null;
		}
		return account;
	}

	/**
	 * 
	 * @param accountReq
	 * @return
	 */
	@PostMapping(value = AccountConstants.ACCOUNTS_BYNUM, produces = { MediaType.APPLICATION_JSON_VALUE })
	public UserAccountDTO getAccountByNumber(@Valid @RequestBody AccountByNumberReq accountReq) {
		LOG.info("AccountResource.getAccountByNumber started...");
		UserAccountDTO account = new UserAccountDTO();
		try {
			account = accoutService.getAccountByNumber(accountReq.getAccountNumber());
		} catch (Exception e) {
			LOG.error("getAccountByNumber Error:" + e.getMessage());
			return null;
		}
		return account;
	}

	/**
	 * 
	 * @param userReq
	 * @return
	 */
	@PostMapping(value = AccountConstants.ACCOUNTS_DEFAULT, produces = { MediaType.APPLICATION_JSON_VALUE })
	public UserAccountDTO getAccountDefault(@Valid @RequestBody UserReq userReq) {
		LOG.info("AccountResource.getAccountDefault started...");
		UserAccountDTO account = new UserAccountDTO();
		try {
			account = accoutService.getDefaultAccount(userReq);
		} catch (Exception e) {
			LOG.error("getAccountDefault Error:" + e.getMessage());
			return null;
		}
		return account;
	}

	/**
	 * 
	 * @param userReq
	 * @return
	 */
	@PostMapping(value = AccountConstants.USERS_BYBOOQID, produces = { MediaType.APPLICATION_JSON_VALUE })
	public UserDTO getUserByBooqId(@Valid @RequestBody UserReq userReq) {
		LOG.info("AccountResource.getUserByBooqId started...");
		UserDTO user = new UserDTO();
		try {
			user = userService.getUserByBooqId(userReq.getBooqId());
		} catch (Exception e) {
			LOG.error("getUserByBooqId Error:" + e.getMessage());
			return null;
		}
		return user;
	}

	/**
	 * This method will retrieve account based on CIF and filter it with account
	 * number. Retrieved data from SOAP.
	 * 
	 * @param accountReq
	 * @return
	 */
	@ApiOperation(value = "Retrieve account from SOAP based on CIF and filter it with account number.", response = AccountDTO.class)
	@PostMapping(value = AccountConstants.ACCOUNTS_BYCIF_ACCOUNT, produces = { MediaType.APPLICATION_JSON_VALUE })
	public AccountDTO getAccountsDetails(@Valid @RequestBody AccountDetailReq accountReq) {
		LOG.info("AccountResource.getAccountsDetails started..." + accountReq.toString());
		long startTime = System.currentTimeMillis();
		AccountDTO account = new AccountDTO();
		try {
			List<AccountDTO> accountDetails = accounSoapService.getAccountsDetails(accountReq);
			LOG.info("Service call Elapse Time: {} millis", (System.currentTimeMillis() - startTime));
			if (!Utility.isEmpty(accountDetails) && !accountDetails.isEmpty() ) {
				LOG.debug("accountDetails.size:" + accountDetails.size());
				account = accountDetails.stream().filter(x -> x.getAccountNumber().equals(accountReq.getAccountNumber().trim())).findFirst().orElse(null);
				LOG.info("AccountResource.getAccountsDetails account ={}", account);
			}
		} catch (Exception e) {
			LOG.error("getAccountsDetails Error:" + e.getMessage());
			return null;
		}
		return account;
	}

	/**
	 * This method will retrieve account based on CIF. Retrieved data from SOAP.
	 * 
	 * @param accountReq
	 * @return
	 */
	@ApiOperation(value = "Retrieve account from SOAP based on CIF.", response = AccountListRes.class)
	@PostMapping(value = AccountConstants.ACCOUNTS_BYCIF, produces = { MediaType.APPLICATION_JSON_VALUE })
	public AccountListRes getAccountsByCIF(@Valid @RequestBody AccountDetailReq accountReq) {
		LOG.info("AccountResource.getAccountsByCIF started..." + accountReq.toString());
		long startTime = System.currentTimeMillis();
		AccountListRes accountList = new AccountListRes();
		try {
			List<AccountDTO> accountDetails = accounSoapService.getAccountsDetails(accountReq);
			accountList.setAccountList(accountDetails);
			LOG.info("Service call Elapse Time: {} millis", (System.currentTimeMillis() - startTime));
			if (!Utility.isEmpty(accountDetails)) {
				LOG.info("AccountResource.getAccountsByCIF accountDetails.size():" + accountDetails.size());
			}
		} catch (Exception e) {
			LOG.error("getAccountsByCIF Error:" + e.getMessage());
			return null;
		}
		return accountList;
	}

}
