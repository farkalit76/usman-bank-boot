/**
 * @Copyright reserved to  bank
 */
package com.usman.bank.constants;

/**
 * Description: This class Accounts.java
 *
 * @author vXebiau
 * @date Oct 21, 2019
 * @version 1.0
 *
 */
public class AccountConstants {

	private AccountConstants() {
	}

	public static final String RESOURCE_NAME = "/account-mgmt";

	//public static final String RESOURCE_NAME_TRANSFER = "/account-mgmt/transfer";

	public static final String ACCOUNTS_ALL = "/accounts";

	public static final String ACCOUNTS_BYCIF = "/accounts/cif";
	
	public static final String ACCOUNTS_BYCIF_ACCOUNT = "/accounts/cifaccount";

	public static final String ACCOUNTS_BYID = "/accounts/accountId";
	
	public static final String ACCOUNTS_BYNUM = "/accounts/accountNumber";
	
	public static final String ACCOUNTS_DEFAULT = "/accounts/default";
	
	public static final String USERS_BYBOOQID = "/users/booqId";

	public static final String KNET = "/knet";

	public static final String KNET_TRANSFERS = "/transfers";
	
	public static final String ELBOOQ_KNET_ACCOUNT = "ELBOOQ-KNET-0";

	public static class KNET_UAT {
		public static final String currency = "414";
		public static final String action = "1";
		public static final String language = "ENG";
		// public static final String alias = "usmannew";
		public static final String alias = "usman";
		//public static final String resourcePath = "/oracle/wls12210/user_projects/domains/elbooq_domain/";
		public static final String resourcePath = "D:/tmp/domains/elbooq_domain/";
		public static final String resultURL = "/GPNWeb/uatknet/result.xhtml";
		// public static final String responseURL =
		// "http://uat.elbooq.net/GPNWeb/uatknet/response.xhtml";
		public static final String responseURL = "https://online.bankusman.com/GPNWeb/knet/response.xhtml";
		// public static final String errorURL =
		// "http://uat.elbooq.net/GPNWeb/uatknet/error.jsp";
		public static final String errorURL = "https://online.bankusman.com/GPNWeb/knet/error.jsp";
	}

	public static class KNET_PROD {
		public static final String currency = "414";
		public static final String action = "1";
		public static final String language = "ENG";
		// public static final String alias = "usmannew";
		public static final String alias = "usmannew";
		public static final String resourcePath = "/oracle/wls12213/user_projects/domains/elbooq_domain/"; // for
																											// usman
																											// env
		public static final String responseURL = "https://elbooq.bankusman.com/GPNWeb/knet/response.xhtml";
		public static final String resultURL = "/GPNWeb/knet/result.xhtml";
		public static final String errorURL = "https://elbooq.bankusman.com/GPNWeb/knet/error.jsp";
		public static final int EXPIRED_PERIOD = 12; // in minutes
	}
}
