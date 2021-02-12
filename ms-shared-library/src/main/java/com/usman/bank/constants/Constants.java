/**
 * @Copyright reserved to bank
 */
package com.usman.bank.constants;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description: This class Constants.java
 *
 * @author vXebiau
 * @date Jul 7, 2019
 * @version 1.0
 *
 */
public class Constants {

	private Constants() {
	}

	//public static final String DEV_HOSTNAME = "BB-PC-1037645";
	
	public static final String DEV_HOSTNAME = "DCP-USMAN";
	
	public static final String DEV_IP_ADDRESS = "10.7.91.40"; 
	
//	public static final String DEV_HOST_PORT = "http://10.7.91.40:8093";
//	
//	public static final String UAT_HOST_PORT =  "https://10.1.131.136:8093";
	
	public static final String PROD_HOST_PORT = "https://online.bankusman.com";
	
	public static final String BBYN_HOSTNAME = "bbyn.hostname";
	
	public static final String BBYN_ENV = "bbyn.environment";
	
	public static final String BBYN_IP_ADDR = "bbyn.ipaddress";
	
	public static final String DEV_ENV = "dev";
	
	public static final String UAT_ENV = "uat";
	
	
	public static class Common {
		private Common() {
		}

		public static final String STR_EMPTY = "";
		public static final String STR_EQUAL = "=";

	}
	
	public static class StatusCodes {
		private StatusCodes() {
		}
		public static final String SOAP_EXCEPTION = "-2";
		public static final String EXCEPTION = "-1";
		public static final String FAILED = "1";
		public static final String SUCCESS = "0";
	}

	public static class ErrorCodes {
		private ErrorCodes() {
		}

		public static final String EXCEPTION = "-1";
		public static final String FAILED = "1";
		public static final String SUCCESS = "0";
	}

	public static class UserStatus {
		private UserStatus() {
		}

		public static final int ACTIVE = 1;
		public static final int LOCKED = 2;
		public static final int INACTIVE_IN_CORE_BANKING = 3;
		public static final int CLOSED = 4;
		public static final int HIDDEN = 5;
		public static final String RPA_EMPLOYEE_ID = "10";
	}// USER LOCK

	public static class LockReason {
		private LockReason() {
		}

		public static final int USER_IS_ACTIVE = 0;
		public static final int INVALID_SITEKEY_ANSWER = 1;
		public static final int INVALID_LOGIN_PASSWORD = 2;
		public static final int INVALID_TRANSACTION_PASSWORD = 3;
		public static final int FORGOT_PASSWORD = 4;
		public static final int REGISTERED_NOT_AUTHENTICATED = 5;
		public static final int RESET_BOTH = 6;
		public static final int INVALID_OTP = 7;
		public static final int INVALID_SECRET_KEY = 9;
		public static final int INVALID_CIVIL_ID = 10;
	}// USER LOCK

	public static class LogTransactionStatus {
		private LogTransactionStatus() {
		}

		public static final int SUCCESS = 0;
		public static final int FAILURE = 1;
		public static final int GENBRAL_EXCEPTION = 2;
	}

	/**
	 * Used for log action applied on services
	 * 
	 * @author Ali
	 *
	 */
	public static class Actions {
		private Actions() {
		}

		public static final int ADD = 1;
		public static final int EDIT = 2;
		public static final int DELETE = 3;
		public static final int VIEW = 6;
		public static final int APPROVE = 4;
		public static final int REJECT = 5;
		public static final int VERIFY = 7;
		public static final int TRANSFER = 8;
		public static final int SEARCH = 9;
		public static final int PAY = 10;
		public static final int ASSIGN = 11;
		public static final int REQUEST = 12;
		public static final int SEND = 15;
		public static final int ENABLE = 13;
		public static final int DISABLE = 14;
		public static final int RESET = 16;
		public static final int INTERIM_NOT_REQ = 17;
		public static final int WAITING = 18;
		public static final int LINK = 19;
		public static final int UNLINK = 20;
		public static final int LOGIN = 21;
		public static final int CHANGE_PASSWORD = 22;
		public static final int INITIATE = 23;
		public static final int CANCEL = 24;
		public static final int CUSTOMER_RESPONSE = 25;
		public static final int ACTIVE = 26;

		public static final int SUBSCRIBE = 27;
		public static final int REDEEM = 28;

		public static final int GENERATE_TOKEN = 29;

		public static final int DOWNLOAD = 30;
		public static final int UPLOAD = 31;
		public static final int LOCK = 32;

	}// ACTIONS

	/**
	 * Used for log services fields, each service has as a list of binded fields to
	 * be logged
	 * 
	 * @author Ali
	 *
	 */
	public static class LogTransFields {
		private LogTransFields() {
		}

		public static final int LOGIN_STATUS = 268;

		public static final int SERVICES = 1;
		public static final int AMOUNT = 2;
		public static final int SHOW_LIMITS_UTILIZATION = 5;
		public static final int SHOW_CAPTCHA = 6;
		public static final int SITEKEY_IMAGES_NO = 7;
		public static final int SHOW_LIMITS_DETAILS = 8;
		public static final int PASSWORD_EXPIRATION_PERIOD = 9;

		public static final int TRACKING_NO = 150;

		public static final int FROM_ACCOUNT_NO = 49;
		public static final int TO_ACCOUNT_NO = 50;
		public static final int CURRENCY = 59;
		public static final int COMMENTS = 60;
		public static final int TRANSFER_INSTANCE = 61;
		public static final int THE_PAYEE_OF_INTERNATIONAL_TRANSFER_FEES = 379;

		public static final int TO_CURRENCY = 159;
		public static final int FROM_CURRENCY = 162;

		public static final int TO_AMOUNT = 160;
		public static final int FROM_AMOUNT = 161;

		public static final int FROM_EXCHANGE_RATE = 155;
		public static final int TO_EXCHANGE_RATE = 158;
		public static final int CROSS_EXCHANGE_RATE = 156;

		public static final int FROM_IBAN = 151;
		public static final int TO_IBAN = 152;

		// CaseType Service Fields
		public static final int CASE_TYPE_NAME_EN = 11;
		public static final int CASE_TYPE_NAME_AR = 12;
		public static final int AUTO_RESPONSE_EN = 13;
		public static final int AUTO_RESPONSE_AR = 14;
		public static final int SUBJECT = 15;
		public static final int DESCRIPTION = 16;
		public static final int TO_SELECTED_ITEMS = 17;

		public static final int SCRIPT_TITLE = 185;
		public static final int SCRIPT_BODY_EN = 186;
		public static final int SCRIPT_BODY_AR = 187;

		// ApplicationType Service Fields
		public static final int APPLICATIN_TYPE_NAME_EN = 99;
		public static final int APPLICATIN_TYPE_NAME_AR = 100;
		public static final int APPLICATIN_TYPE_AUTO_REPLAY = 101;
		public static final int APPLICATIN_TYPE_SUBJECT = 102;
		public static final int APPLICATIN_TYPE_DESC = 103;
		public static final int APPLICATIN_TYPE_REPLAY_MSG = 104;
		public static final int APPLICATIN_TYPE_FROM_MSG_CENTER = 105;

		// Employees Service Fields
		public static final int EMPLOYEES_FIRST_NAME = 106;////////////////////////////////////////////////
		public static final int EMPLOYEES_LAST_NAME = 107;
		public static final int EMPLOYEES_EMAIL = 108;
		public static final int EMPLOYEES_IMMEDIATE_SUPERVISOR = 109;
		public static final int EMPLOYEES_PHONE_NO = 110;
		public static final int EMPLOYEES_ROLE_ID = 111;
		public static final int EMPLOYEES_USER_NAME = 112;
		public static final int EMPLOYEES_STATUS = 113;
		public static final int EMPLOYEES_IS_SUPER_ADMIN = 114;
		public static final int EMPLOYEES_ALLOW_OWN_APPROVAL = 115;
		public static final int EMPLOYEES_CASES = 116;
		public static final int EMPLOYEES_APPLICATIONS = 117;

		// Customer Services Access
		public static final int SERVICE_NAME = 184;
		public static final int SERVICE_ACCESS_STATUS = 267;

		// Global Messages Fields
		public static final int BANK_NAME = 118;
		public static final int MESSAGE_TYPE = 119;
		public static final int FROM_AGENT = 120;
		public static final int FROM_DATE = 121;
		public static final int TO_DATE = 122;
		public static final int SENDING_LIST = 123;

		public static final int CUSTOMER_ID = 124;
		public static final int CUSTOMER_NAME_AR = 171;
		public static final int CUSTOMER_NAME_EN = 172;
		public static final int CUSTOMER_REQ_OPERATION = 246;
		public static final int CUSTOMER_CIF_NO = 125;
		public static final int IBAN = 126;
		public static final int ACCOUNT_NICKNAME = 148;
		public static final int ACCOUNT_NEW_NICKNAME = 263;
		public static final int ACCOUNT_VISIBILITY = 149;
		public static final int ACCOUNT_NO = 147;
		public static final int CUSTOMER_ACCOUNT_NO = 242;

		// GLOBAL PAYEES FIELDS
		public static final int PAYEE_TYPE = 127;
		public static final int PAYEE_NAME_EN = 128;
		public static final int PAYEE_NAME_AR = 129;
		public static final int PAYEE_ACCOUNT_NO = 130;
		public static final int PAYEE_EMAIL = 391;
		public static final int MINIMUM_AMOUNT = 131;
		public static final int MAXIMUM_AMOUNT = 132;
		public static final int FIELD1_NAME = 133;
		public static final int FIELD1_VISIBILITY = 134;
		public static final int FIELD1_MANDATORY = 135;
		public static final int FIELD1_VALIDATE_CIVIL_ID = 136;
		public static final int FIELD1_LENGTH = 137;
		public static final int FIELD1_TYPE = 138;
		public static final int FIELD1_STARTS_WITH = 139;
		public static final int FIELD2_NAME = 140;
		public static final int FIELD2_VISIBILITY = 141;
		public static final int FIELD2_MANDATORY = 142;
		public static final int FIELD2_VALIDATE_CIVIL_ID = 143;
		public static final int FIELD2_LENGTH = 144;
		public static final int FIELD2_TYPE = 145;
		public static final int FIELD2_STARTS_WITH = 146;

		// Constants for Transaction Details (New Mapping) - Transfers
		public static final int FROM_ACC_AMOUNT = 79;
		public static final int FROM_ACC_AMOUNT_IN_KD = 78;
		public static final int FROM_ACC_CURRENCY = 77;
		public static final int FROM_ACC_RATE = 76;
		public static final int TO_ACC_AMOUNT = 69;
		public static final int TO_ACC_AMOUNT_IN_KD = 68;
		public static final int TO_ACC_CURRENCY = 67;
		public static final int TO_ACC_RATE = 65;

		// Standing Order fields details
		public static final int SO_DURATION = 276;
		public static final int SO_START_DATE = 277;
		public static final int SO_END_DATE = 278;
		public static final int SO_NO_OF_PAYMENTS = 279;
		public static final int SO_IS_PERPETUAL = 280;

		// Back-End Errors

		public static final int WS_ERROR_DTO = 281;

		// Constants for Transaction Details (new Mapping) - Payments
		public static final int TRANSACTON_BRANCH = 96;
		public static final int SERVICE_CODE = 97;
		public static final int IMAL_OP_NO = 93;
		public static final int IMAL_REFERENCE_NO = 94;
		public static final int IMAL_ERROR_DESCRIPTION = 95;

		// Constants for Transaction Details (new Mapping) - Finance (Murabaha)
		public static final int BRANCH_CODE = 253;
		public static final int DEAL_NUMBER = 254;
		public static final int CIF_NUMBER = 255;
		public static final int DEBIT_ACCOUNT_NUMBER = 256;
		public static final int TRANSACTION_DATE = 257;
		public static final int SETTLEMENT_NUMBER = 258;
		public static final int OTP_DIGITS = 163;
		public static final int OTP_EXPIRATION_PERIOD = 164;
		public static final int APPLICATION_MAIL_LIST = 165;
		public static final int CASES_MAIL_LIST = 166;

		// Constants for Apply for a Cheque Book
		public static final int CHEQUE_BOOK_LANGUAGE = 176;
		public static final int URGENT_CHEQUE_BOOK = 175;
		public static final int NO_OF_CHEQUE_BOOKS = 173;
		public static final int NO_OF_LEAVES_PER_CHEQUE_BOOK = 174;

		// Constants for Apply for a Balance Certificate
		public static final int CERTIFICATE_LANGUAGE = 177;
		public static final int CERTIFICATE_ADDRESS = 178;
		public static final int CERTIFICATE_CHARGE = 179;

		// Admin Roles
		public static final int ROLE_ID = 167;
		public static final int ROLE_NAME_EN = 168;
		public static final int ROLE_NAME_AR = 169;
		public static final int ROLE_SERVICS = 170;

		// Constants for usman , Local and International beneficiaries (Payees)
		public static final int BENEFICIARY_NICKNAME = 182;
		public static final int BENEFICIARY_BANK_NAME = 84;
		public static final int BENEFICIARY_BANK_ADDRESS = 154;
		public static final int BENEFICIARY_BANK_COUNTRY_ID = 86;
		public static final int BENEFICIARY_ACCOUNT_NO = 180;
		public static final int BENEFICIARY_IBAN = 181;

		public static final int BENEFICIARY_INTERM_BANK_REQ = 243;
		public static final int BENEFICIARY_CIF_NO = 233;
		public static final int BENEFICIARY_SERIAL_NO = 234;
		public static final int BENEFICIARY_ACTION_TYPE = 235;
		public static final int BENEFICIARY_TYPE = 236;
		public static final int BENEFICIARY_DATE = 237;
		public static final int BENEFICIARY_BRANCH_NAME = 82;
		public static final int BENEFICIARY_CURRENCY = 157;
		public static final int BENEFICIARY_BANK_COUNTRY_NAME = 85;
		public static final int BENEFICIARY_NAME = 153;
		public static final int BENEFICIARY_REJECTION_REASON = 240;
		public static final int BENEFICIARY_BANK_SWIFT_CODE = 83;

		public static final int CREDIT_CARD_COMPANY_CODE = 208;
		public static final int CREDIT_CARD_BRANCH_CODE = 209;
		public static final int CREDIT_CARD_CIF_NO = 212;
		public static final int CREDIT_CARD_POST_DATE = 214;
		public static final int CREDIT_CARD_TRADE_DATE = 215;
		public static final int CREDIT_CARD_VALUE_DATE = 216;
		public static final int DEBIT_AMOUNT = 217;
		public static final int CREDIT_CARD_CV_AMOUNT = 218;
		public static final int CREDIT_CARD_JV_TYPE = 220;
		public static final int CREDIT_CARD_TRANSACTION_TYPE = 221;
		public static final int CREDIT_CARD_TIME_CREATED = 223;
		public static final int CREDIT_CARD_TERMINAL_ID = 224;
		public static final int CREDIT_CARD_CREATED_BY = 225;
		public static final int CREDIT_CARD_AUTHORISED_BY = 226;
		public static final int CREDIT_CARD_TRANSACTION_BRANCH_CODE = 227;
		public static final int CREDIT_CARD_TRANSACTION_ORIGIN = 228;
		public static final int CREDIT_CARD_TRANSACTION_CURRENCY = 229;
		public static final int CREDIT_CARD_NO = 230;
		public static final int CREDIT_CARD_NICKNAME = 251;
		public static final int CREDIT_CARD_NEW_NICKNAME = 252;

		// limit matrix
		public static final int LIMIT_MARKET_SEGMENT = 188;
		public static final int LIMIT_SERVICE_PACKAGE = 189;
		public static final int LIMIT_TRANSFER_TYPE = 193;
		// public static final int ACCOUNT_NO = 147;
		public static final int LIMIT_CURRENCY = 191;
		public static final int LIMIT_PERIOD = 192;
		public static final int LIMIT_CHANNEL = 190;//
		public static final int LIMIT_MAX_AMOUNT = 194;
		public static final int LIMIT_TOTAL_TRANSACTIONS = 195; //

		// GLOBAL LIMITS
		public static final int GLOBAL_LIMITS_TRANSFER_TYPE = 196;//
		public static final int GLOBAL_LIMITS_MAX_AMOUNT = 197;
		public static final int GLOBAL_LIMITS_MIN_AMOUNT = 198; //

		// MARKET SEGMENTS FIELDS
		public static final int MARKET_SEGMENTS_BANK = 199;
		public static final int MARKET_SEGMENTS_TYPE = 200;
		public static final int MARKET_SEGMENTS_NAME_EN = 201;
		public static final int MARKET_SEGMENTS_NAME_AR = 202;
		public static final int MARKET_SEGMENTS_DESC = 203;

		// SERVICE PACKAGE
		public static final int SERVICE_PACKAGE_MARKET_SEGMENT = 204;
		public static final int SERVICE_PACKAGE_NAME = 205;
		public static final int SERVICE_PACKAGE_DESC = 206;
		public static final int SERVICE_PACKAGE_DEFAULT = 207;
		public static final int SERVICE_PACKAGE_ID = 266;

		// Charity
		public static final int GLOBAL_CHARITY_PAYEE_NAME = 231;
		public static final int GLOBAL_CHARITY_PAYEE_NICKNAME = 232;
		public static final int GLOBAL_CHARITY_PAYEE_FIELD_1 = 244;
		public static final int GLOBAL_CHARITY_PAYEE_FIELD_2 = 245;

		public static final int ATM_CARD_NO = 247;
		public static final int ATM_CARD_NICKNAME = 249;
		public static final int ATM_CARD_NEW_NICKNAME = 250;
		public static final int ATM_CARD_BLOCK_REASON = 248;

		public static final int MONTH = 264;
		public static final int YEAR = 265;
		// Finance
		public static final int FINANCE_NICKNAME = 259;
		public static final int FINANCE_NEW_NICKNAME = 260;

		// Funds
		public static final int FUND_PORTFOLIO_NO = 261;
		public static final int FUND_PORTFOLIO_NAME = 262;

		// E-Services Open a new Account
		public static final int BRANCH_NAME = 269;
		public static final int INITIAL_DEPOSIT_AMOUNT = 270;

		// E-Services Transfer Limit
		public static final int TRANSFER_LIMIT_TYPE = 271;
		public static final int LIMIT_TYPE = 272;
		public static final int LIMIT_KUWAIT_CURRENCY = 273;
		public static final int LIMIT_FOREIGN_CURRENCY = 274;

		// IB settings
		public static final int MINUTES_OF_INACTIVITY = 275;
		public static final int MOBILE_NUMBER = 282;

		public static final int EMPLOYEE_USER_ID = 284;
		public static final int SUPER_ADMIN_USERNAME = 285;
		public static final int SUPER_APPROVER_USERNAME = 286;
		public static final int CORPORATE_CIF_NUMBER = 287;
		// Global Configuration
		public static final int GLOBAL_CONFIGURATION = 283;
		public static final int RESET_SITE_KEY = 288;
		public static final int SITE_KEY_QUESTIONS_STYLE = 289;
		public static final int CREDITED_ACCOUNT = 290;
		public static final int VALIDATE_IBAN = 291;
		public static final int VALIDATE_CVD = 292;
		public static final int MINIMUM_NUMBER_OF_SALARY = 293;
		public static final int BO_CORP_USER_NAME = 295;
		public static final int BO_CORP_USER_MOBILE_NUMBER = 294;
		public static final int BO_CORP_USER_FIRST_NAME = 297;
		public static final int BO_CORP_USER_LAST_NAME = 298;
		public static final int BO_CORP_USER_STATUS = 299;
		public static final int MAXIMUM_NUMBER_OF_SALARY = 300;
		public static final int ACCOUNT_TYPE = 301;
		public static final int BO_CORPORATE_REGISTRATION = 302;
		public static final int BO_CORPORATE_REGISTRATION_MODE = 329;

		/// Mohammed A. Salim - 30/12/2013
		// constants for Western_Union
		public static final int WU_BENEFICARY_NICKNAME = 303;
		public static final int WU_BENEFICARY_FIRSTNAME = 304;
		public static final int WU_BENEFICARY_LASTNAME = 305;
		public static final int WU_BENEFICARY_COUNTRY = 306;
		public static final int WU_BENEFICARY_STATE = 307;
		public static final int WU_BENEFICARY_CITY = 308;
		public static final int WU_BENEFICARY_CURRENCY = 309;
		public static final int WU_BENEFICIARY_MODIFIED_DATE = 310;
		public static final int WU_SENDER_CIF = 311;
		public static final int WU_SENDER_FROM_ACCOUNT_NO = 312;
		public static final int WU_RECEIVER_DETAILS = 313;
		public static final int WU_TRANSFER_AMOUNT = 314;
		public static final int WU_SENDER_USER_NAME = 315;

		public static final int GLOBAL_MSG_CUST_RESPONSE = 316;
		public static final int ITUNES_GIFT_CARD = 317;
		public static final int ESTATEMENT = 318;
		public static final int TRAVEL_NOTIFICATION = 319;
		public static final int CARDLESS_CIVIL_ID = 320;
		public static final int CASH4ME = 321;

		public static final int FUND_ACTION_TYPE = 322;
		public static final int FUND_AMOUNT = 323;
		public static final int FUND_UNITS = 324;
		public static final int ATM_LOCATION_CODE = 326;
		public static final int PREM_ACCOUNT_GL_CODE = 325;
		public static final int ENABLE_CREDIT_CARDS_ONLINE_BALANCE = 327;
		public static final int FUNDS_MAIL_LIST = 328;
		public static final int REQUEST_TOKEN = 351;

		public static final int CUST_PAYEE_MOBILE_NO = 352;
		public static final int CUST_PAYEE_SERVICE_PROVIDER_NAME = 353;
		public static final int CUST_PAYEE_SERVICE_TYPE = 354;
		public static final int CUST_PAYEE_NICK_NAME = 355;
		public static final int CUST_PAYEE_NAME = 356;

		public static final int SCHOOL_NAME = 357;
		public static final int STUDENT_NAME = 358;
		public static final int CLASS_NAME = 359;
		public static final int CLASS_REF = 360;
		public static final int STUDENT_ID = 361;
		public static final int FEES_TYPE = 362;
		public static final int FEES_AMOUNT = 363;

		public static final int OLD_USERNAME = 364;
		public static final int NEW_USERNAME = 365;

		public static final int FP_MOBILE_LOGIN_TOKEN = 368;
		public static final int FP_INVALID_LOGIN_ATTEMPT = 369;
		public static final int SEARCH_FILTER_ALIAS = 370;
		public static final int SEARCH_FILTER_TYPE = 371;
		public static final int SEARCH_FILTER_NAME_EN = 372;
		public static final int SEARCH_FILTER_NAME_AR = 373;

		public static final int ATM_LOCATION_NAME = 374;

		public static final int ROUND_UP_TO = 376;
		public static final int DURATION = 377;

		public static final int CIVIL_ID_RENEWAL = 375;

		public static final int SERVICE_PACKAGE_EXPIRATION_DATE = 378;

		// elbooq
		public static final int ELBOOQ_ID = 380;
		public static final int ELBOOQ_UUID_TOKEN = 381;
		public static final int ELBOOQ_AVAILABLE_BALANCE = 382;
		public static final int ELBOOQ_CURRENT_BALANCE = 383;

		/**
		 * JIRA: RTLCRPMBDV-441 (DA-550 - Card Issuance CR Changes) Neel: 08-Nov-2016
		 */
		public static final int ATM_CARD_ISSUE_REASON = 388;
		public static final int ATM_CARD_REPLACE_REASON = 389;
		// ----------------------------------------------

		public static final int REGISTERED_DEVICE_ID = 385;
		public static final int REQUEST_DEVICE_ID = 386;
		public static final int CARD_SECURE_ALIAS = 390;

		// change email log fields
		public static final int OLD_EMAIL = 423;
		public static final int NEW_EMAIL = 424;
		public static final int EMAIL_LINK_EXPIRY = 425;

		/**
		 * JIRA: RTLCRPMBDV-623 (MVP - New Murabaha/Top-up MVP) Neel: 07-Mar-2016
		 */
		public static final int DEAL_TYPE = 392;
		public static final int SALARY = 393;
		public static final int EMPLOYMENT_TYPE = 394;
		public static final int FINANCE_TYPE = 395;
		public static final int HIBA_OPTED = 396;
		public static final int HIBA_AMOUNT = 397;
		public static final int REFLECTION_DATE = 398;
		public static final int LEAD_REF_ID = 399;
		public static final int LEAD_CODE = 400;
		public static final int OUTSTANDING_BALANCE = 401;
		public static final int LEAD_STATUS = 402;
		public static final int CUST_MURABAHA_STAGE_STATUS = 403;
		public static final int REFLECTION_PERIOD_COMPLETE = 404;
		public static final int PRODUCT_CATEGORY = 405;
		public static final int REQUEST_TYPE = 406;
		public static final int APPOINTMENT_DATE = 407;
		public static final int BRANCH_EMAIL = 408;
		public static final int FILE_NAME = 409;
		public static final int FILE_EXTENSION = 410;
		public static final int REL_OFFICER_ID = 411;
		public static final int REL_OFFICER_NAME = 412;
		public static final int REL_OFFICER_EMAIL = 413;
		public static final int DBR = 414;
		public static final int CASH_IN_HAND = 415;
		public static final int TOTAL_DEAL_AMOUNT = 416;
		public static final int TOTAL_PROFIT = 417;
		public static final int NATIONALITY = 418;
		public static final int CLASS_CODE = 419;
		public static final int MAXIMUM_DURATION = 420;
		public static final int OTHER_PAYMENTS = 421;
		public static final int MINIMUM_DURATION = 422;
		public static final int PN_INFORMATIVE_LAERT = 426;
		public static final int PN_CREDIT_CARD_NOTIFICATION = 427;
		public static final int PN_ACCOUNTS_AND_DEBIT_ALERTS = 428;
		public static final int REGISTERED_WITH_SMS = 429;
		public static final int OTP_REQUIRED = 430;
		public static final int PN_INFORMATIVE_LAERT_OLD = 431;
		public static final int PN_CREDIT_CARD_NOTIFICATION_OLD = 432;
		public static final int PN_ACCOUNTS_AND_DEBIT_ALERTS_OLD = 433;

		/**
		 * @author Neelkanth Tripathi [28-Aug-2017]
		 * @JIRA_Ref: RTLCRPMBDV-1015 (DA-735: Update Client Profile)
		 */
		public static final int PROFILE_NEW_MARITAL_STATUS = 434;
		public static final int PROFILE_OLD_MARITAL_STATUS = 435;
		public static final int PROFILE_NEW_EDUCATION_QUAL = 436;
		public static final int PROFILE_OLD_EDUCATION_QUAL = 437;
		public static final int PROFILE_NEW_LANGUAGE = 438;
		public static final int PROFILE_OLD_LANGUAGE = 439;
		public static final int PROFILE_NEW_HOUSE_NUM = 440;
		public static final int PROFILE_OLD_HOUSE_NUM = 441;
		public static final int PROFILE_NEW_BLOCK = 442;
		public static final int PROFILE_OLD_BLOCK = 443;
		public static final int PROFILE_NEW_STREET = 444;
		public static final int PROFILE_OLD_STREET = 445;
		public static final int PROFILE_NEW_AVENUE = 446;
		public static final int PROFILE_OLD_AVENUE = 447;
		public static final int PROFILE_NEW_AREA = 448;
		public static final int PROFILE_OLD_AREA = 449;
		public static final int PROFILE_NEW_HOME_ADDRESS = 450;
		public static final int PROFILE_OLD_HOME_ADDRESS = 451;
		public static final int PROFILE_NEW_CITY_ADDRESS = 452;
		public static final int PROFILE_OLD_CITY_ADDRESS = 453;
		public static final int PROFILE_NEW_MOBILE = 454;
		public static final int PROFILE_OLD_MOBILE = 455;
		/**
		 * @author Neelkanth Tripathi [14-Oct-2017]
		 * @JIRA_Ref: RTLCRPMBDV-1100 (DA-792: Create International Beneficiary
		 *            Enhancement)
		 */
		public static final int IFSC_CODE = 456;
		public static final int ROUTING_NUMBER = 457;
		/**
		 * @author Neelkanth Tripathi [28-Aug-2017]
		 * @JIRA_Ref: RTLCRPMBDV-1015 (DA-735: Update Client Profile) More fields
		 */
		public static final int PROFILE_NEW_POST_OFFICE_BOX = 458;
		public static final int PROFILE_OLD_POST_OFFICE_BOX = 459;
		public static final int PROFILE_NEW_POST_OFFICE_BOX_AREA = 460;
		public static final int PROFILE_OLD_POST_OFFICE_BOX_AREA = 461;
		public static final int PROFILE_NEW_POSTAL_CODE = 462;
		public static final int PROFILE_OLD_POSTAL_CODE = 463;
		public static final int PROFILE_NEW_POST_OFFICE_NAME = 464;
		public static final int PROFILE_OLD_POST_OFFICE_NAME = 465;

		// RTLCRPMBDV-1232 : more logs for wu
		public static final int WU_MTCN = 466;
		public static final int WU_MTCN_DATE = 467;
		public static final int WU_TRANSACTION_ID = 468;
		public static final int OLD_DESCRIPTION = 473;

		// Opening FD Thru Mobile Application

		public static final int PROFIT_ACCOUNT = 469;
		public static final int FIXED_DEPOSIT_TYPE = 470;
		public static final int FIXED_DEPOSIT_DURATION = 471;
		public static final int FIXED_DEPOSIT_RENEWAL = 472;

	}// LOG_TRANS_FIELDS

	/**
	 * Used for Consumer IB log services, each log service has as id to be used for
	 * log process
	 * 
	 * @author Ali
	 *
	 */
	public static class Services {
		private Services() {
		}

		public static final int EMPLOYEE_LOGIN_SERVICE = 1;
		public static final int EMPLOYEE_LOGIN_CHANGE_PASSWORD = 273;

		// Home Page
		public static final int SINGLE_TRANSFER_SERVICE = 2;
		public static final int MY_ACCOUNTS_TRANSFER = 55;
		public static final int BROKERAGE_TRANSFER = 54;
		public static final int PERSONAL_FINANCE_PAYMENT = 8;
		// Bill Payment
		public static final int BILL_PAYMENT = 50;

		public static final int EDIT_PAYEE_BILL_PAYMENTS = 53;
		public static final int DELETE_PAYEE_BILL_PAYMENTS = 240;

		public static final int ADD_PAYEE_BILL_PAYMENTS = 52;
		public static final int BILL_PAYMENTS_QUICK_PAYEE = 268;
		public static final int BILL_PAYMENTS_MANAGE_PAYEE = 269;
		public static final int BILL_PAYMENTS_PENDING_PAYEE = 270;
		public static final int BILL_PAYMENTS_PAYMENTS_HSITORY = 271;
		public static final int PAYMENTS_PAYMENTS_HSITORY = 290;

		public static final int ESERVICES_CHEQUE_BOOK = 10;
		public static final int ESERVICES_CERTIFICATE = 11;
		public static final int ESERVICES_BLOCK_ATM_CARD = 12;
		public static final int ESERVICES_TRANSFER_LIMIT = 13;

		public static final int ESERVICES_NEW_BANK_ACCOUNT = 14;

		public static final int ESERVICES_LINK_UNLINK_ATM = 15;
		public static final int CHARITY_PAYMENTS = 51;

		public static final int ESERVICES_REQUEST_HISTORY = 194;
		// CaseType Service
		public static final int CASE_TYPE_CREATE = 16;
		public static final int CASE_TYPE_UPDATE = 17;
		public static final int CASE_TYPE_APPROVE = 18;
		public static final int CASE_TYPE_REJECT = 19;
		public static final int CASE_TYPE_VIEW = 20;
		public static final int CASE_TYPE_HISTORY = 120;
		public static final int SCRIPT_CREATE = 121;

		// Application Service
		public static final int APP_TYPE_CREATE = 57;
		public static final int APP_TYPE_UPDATE = 58;
		public static final int APP_TYPE_APPROVE = 59;
		public static final int APP_TYPE_REJECT = 60;
		public static final int APP_TYPE_VIEW = 61;
		public static final int APP_TYPE_HISTORY = 122;

		// Employees Service
		public static final int EMPLOYEES_CREATE = 62;
		public static final int EMPLOYEES_UPDATE = 63;
		public static final int EMPLOYEES_APPROVE = 64;
		public static final int EMPLOYEES_REJECT = 65;
		public static final int EMPLOYEES_VIEW = 66;
		public static final int EMPLOYEES_HISTORY = 119;

		// Global Messages
		public static final int GLOBAL_MESSAGES_CREATE = 67;
		public static final int GLOBAL_MESSAGES_UPDATE = 68;
		public static final int GLOBAL_MESSAGES_APPROVE = 69;
		public static final int GLOBAL_MESSAGES_REJECT = 70;
		public static final int GLOBAL_MESSAGES_VIEW = 71;
		public static final int GLOBAL_MESSAGES_HISTORY = 123;

		// Global Payees
		public static final int GLOBAL_PAYEES_CREATE = 72;
		public static final int GLOBAL_PAYEES_UPDATE = 73;
		public static final int GLOBAL_PAYEES_APPROVE = 74;
		public static final int GLOBAL_PAYEES_REJECT = 75;
		public static final int GLOBAL_PAYEES_VIEW = 76;
		public static final int GLOBAL_PAYEES_HISTORY = 124;

		// Global Configuration
		public static final int GLOBAL_CONFIGURATIONS_UPDATE = 78;
		public static final int GLOBAL_CONFIGURATIONS_VIEW = 79;

		// Admin Roles
		public static final int ADMIN_ROLES_CREATE = 80;
		public static final int ADMIN_ROLES_UPDATE = 81;
		public static final int ADMIN_ROLES_VIEW = 82;
		public static final int ADMIN_ROLES_ASSIGN = 83;
		public static final int ADMIN_ROLES_DELETE = 102;

		// Unlock requets
		public static final int UNLOCK_REQUESTS_APPROVE = 84;
		public static final int UNLOCK_REQUESTS_REJECT = 85;
		public static final int UNLOCK_REQUESTS_VIEW = 86;
		public static final int UNLOCK_REQUESTS_UNLOCK = 87;
		public static final int UNLOCK_REQUESTS_UNLOCK_APPROVE = 9059;
		public static final int LOCK_REQUESTS_LOCK = 283;
		public static final int LOCK_REQUESTS_LOCK_APPROVE = 9058;

		// Customer Services Access
		public static final int CUSTOMER_SERVICE_ACCESS_VIEW = 88;
		public static final int CUSTOMER_SERVICE_ACCESS_DISABLE = 89;
		public static final int CUSTOMER_SERVICE_ACCESS_ENABLE = 90;
		public static final int CUSTOMER_SERVICE_ACCESS_CREATE = 267;

		// IB Case (Message)
		public static final int CREATE_CASE = 28;
		public static final int DELETE_CASE = 30;
		public static final int REPLY_CASE = 29;

		// Admin Case
		public static final int CREATE_ADMIN_CASE = 21;
		public static final int REPLY_ADMIN_CASE = 22;
		public static final int ACCEPT_ADMIN_CASE = 26;
		public static final int CLOSE_ADMIN_CASE = 27;
		public static final int REASSIGN_ADMIN_CASE = 25;
		public static final int REQUEST_ASSISTANCE_ADMIN_CASE = 23;
		public static final int REPLY_ASSISTANCE_ADMIN_CASE = 24;

		// Finance Payments
		public static final int FINANCE_PAYMENTS_PAY = 31;
		public static final int TRANSFER_HSITORY = 56;

		// Finance
		public static final int FINANCE_NICKNAME_UPDATE = 40;
		public static final int FINANCE_TRANSACTIONS_HISTORY_SEARCH = 41;
		public static final int FINANCE_SUMMARY_VIEW = 262;
		public static final int FINANCE_MANAGE = 193;

		// Fund
		public static final int FUND_MANAGE = 192;

		// SiteKey
		public static final int SITEKEY_ATM_CARD = 32;
		public static final int SITEKEY_ACCT_NUMBER = 348;
		public static final int SITEKEY_ANSWERS = 33;
		public static final int SITEKEY_FORGOT_PASSWORD = 34;
		public static final int SITEKEY_LOGIN_USER_NAME = 35;
		public static final int SITEKEY_IMAGE = 36;
		public static final int SITEKEY_QUESTION = 37;
		public static final int SITEKEY_LOGIN_PASSWORD = 38;
		public static final int SITEKEY_RESET_PASSWORD = 39;
		public static final int SITEKEY_LOGIN_OTP_LINKING = 563;
		public static final int SITEKEY_LOGIN_OTP_LINKING_WEB = 569;

		// Added for save action during registration
		public static final int SITEKEY_ENTER_USERNAME_PWD = 281;
		public static final int SITEKEY_OTP_COMPLETE = 282;

		public static final int SETTINGS_PASSWORD_UPDATE = 275;
		public static final int SETTINGS_TRANSACTION_PASSWORD_UPDATE = 276;
		public static final int SETTINGS_BOTH_PASSWORD_UPDATE = 278;
		public static final int SETTINGS_SITEKEY_RESET = 277;
		public static final int SETTINGS_SMS_SUBSCRIPTION_UPDATE = 279;

		// Credit Cards
		public static final int CREDIT_CARDS_MANAGE = 191;

		// Options
		public static final int SETTINGS_OPTIONS = 195;
		public static final int SETTINGS_CHANGE_PASSWORD = 196;
		public static final int SETTINGS_SESSION_TIMEOUT = 197;
		public static final int SETTINGS_SMS_SUBSCRIPTIONS = 198;
		public static final int SETTINGS_SMS_HISTORY = 199;
		public static final int SETTINGS_CHANGE_USERNAME = 346;
		public static final int SETTINGS_EWATCH = 331;

		// Cards
		public static final int CARDS_MANAGE = 291;

		// Accounts
		public static final int ACCOUNTS_SUMMARY_VIEW = 77;
		public static final int ACCOUNTS_TRANSACTIONS_HISTORY_SEARCH = 93;
		public static final int ACCOUNTS_PREFERENCES_VIEW = 95;
		public static final int ACCOUNTS_NICKNAME_UPDATE = 96;
		public static final int ACCOUNTS_STATEMENT_VIEW = 91;
		public static final int ACCOUNTS_STATEMENT_CREATE = 92;
		public static final int ACCOUNTS_UNCLEARED_CHEQUES_VIEW = 94;
		public static final int ACCOUNTS_MANAGE = 185;
		public static final int ACCOUNTS_HOLD_DETAILS = 344;

		// Own Accounts Transfers
		public static final int OWN_ACCOUNTS_TRANSFERS_TRANSFER = 55;
		// usman Accounts Transfers
		public static final int usman_ACCOUNTS_TRANSFERS_TRANSFER = 97;
		// Local Bank Accounts Transfers
		public static final int LOCAL_BANK_ACCOUNTS_TRANSFERS_TRANSFER = 98;
		// International Bank Accounts Transfers
		public static final int INTERNATIONAL_BANK_ACCOUNTS_TRANSFERS_TRANSFER = 99;
		// Brokerage Transfer
		public static final int BROKERAGE_TRANSFERS_TRANSFER = 100;
		// Credit Card Payments
		public static final int CREDIT_CARD_PAYMENTS_PAY = 101;
		// Charity Payments
		public static final int CHARITY_PAYMENTS_PAY = 200;
		// Bill Payments
		public static final int BILL_PAYMENTS_PAY = 201;
		// International Beneficiaries

		public static final int STANDING_ORDER_OWN_ACCOUNTS_TRANSFER = 284;
		// Standing Order - usman Accounts Transfers
		public static final int STANDING_ORDER_usman_ACCOUNTS_TRANSFER = 285;
		// Standing Order - Local Bank Accounts Transfers
		public static final int STANDING_ORDER_LOCAL_BANK_ACCOUNTS_TRANSFERR = 286;
		// Standing Order - International Bank Accounts Transfers
		public static final int STANDING_ORDER_INTERNATIONAL_BANK_ACCOUNTS_TRANSFER = 287;
		// Standing Order - Charity Payments
		public static final int STANDING_ORDER_CHARITY_PAYMENTS_PAY = 288;
		// Standing Order - Bill Payments
		public static final int STANDING_ORDER_BILL_PAYMENTS = 289;

		public static final int TRANSFERS_HISTORY = 189;
		public static final int TRANSFERS_PENDING = 190;

		// International Beneficiaries
		public static final int INTERNATIONAL_BENEFICIARY_CREATE = 103;
		public static final int INTERNATIONAL_BENEFICIARY_UPDATE = 104;
		public static final int INTERNATIONAL_BENEFICIARY_DELETE = 105;
		public static final int INTERNATIONAL_BENEFICIARY_ACTIVATE = 115;
		public static final int INTERNATIONAL_BENEFICIARY_OTP_SEND = 114;
		public static final int INTERNATIONAL_BENEFICIARY_MANAGE = 187;
		public static final int INTERNATIONAL_BENEFICIARY_APPROVE = 241;
		public static final int INTERNATIONAL_BENEFICIARY_REJECT = 242;
		public static final int INTERNATIONAL_BENEFICIARY_RESET = 243;
		public static final int INTERNATIONAL_BENEFICIARY_INTERIM_BNK_NOT_REQ = 244;
		public static final int INTERNATIONAL_BENEFICIARY_AMEND = 9069;

		// Local Beneficiaries
		public static final int LOCAL_BENEFICIARY_CREATE = 106;
		public static final int LOCAL_BENEFICIARY_UPDATE = 107;
		public static final int LOCAL_BENEFICIARY_DELETE = 108;
		public static final int LOCAL_BENEFICIARY_ACTIVATE = 109;
		public static final int LOCAL_BENEFICIARY_OTP_SEND = 116;
		public static final int LOCAL_BENEFICIARY_MANAGE = 188;
		public static final int LOCAL_BENEFICIARY_APPROVE = 204;
		public static final int LOCAL_BENEFICIARY_REJECT = 205;
		public static final int LOCAL_BENEFICIARY_RESET = 238;
		public static final int LOCAL_BENEFICIARY_WAITING = 251;
		public static final int LOCAL_BENEFICIARY_AMEND = 9068;

		// usman Beneficiaries
		public static final int usman_BENEFICIARY_CREATE = 110;
		public static final int usman_BENEFICIARY_UPDATE = 111;
		public static final int usman_BENEFICIARY_DELETE = 112;
		public static final int usman_BENEFICIARY_ACTIVATE = 113;
		public static final int usman_BENEFICIARY_OTP_SEND = 117;
		public static final int usman_BENEFICIARY_MANAGE = 186;
		public static final int usman_BENEFICIARY_APPROVE = 202;
		public static final int usman_BENEFICIARY_REJECT = 203;
		public static final int usman_BENEFICIARY_RESET = 239;
		public static final int usman_BENEFICIARY_WAITING = 252;

		// my profile service
		public static final int MY_PROFILE_VIEW = 118;

		// customers search
		public static final int CUSTOMERS_SEARCH = 125;
		public static final int CUSTOMERS_SEARCH_SEARCH = 180;
		public static final int CUSTOMERS_SEARCH_SERVICE_ACCESS = 181;
		public static final int CUSTOMERS_SEARCH_ACCOUNT_LIMIT = 182;
		public static final int CUSTOMERS_SEARCH_SERVICE_PACKAGE_ASSIGNMNET = 183;
		public static final int CUSTOMERS_SEARCH_TRANSACTIONS = 184;

		public static final int CUSTOMERS_BENEFICIARIES_VIEW = 280;

		public static final int CUSTOMERS_RESET_LOGIN = 253;
		public static final int CUSTOMERS_RESET_LOGIN_APPROVE = 9055;

		public static final int CUSTOMERS_RESET_TRANS = 254;
		public static final int CUSTOMERS_RESET_TRANS_APPROVE = 9056;

		public static final int CUSTOMERS_SEND_OTP = 255;
		public static final int CUSTOMERS_SEND_OTP_APPROVE = 9057;

		// case tap
		public static final int CASES_SEARCH = 126;
		public static final int CASES_NEW_CASES = 127;
		public static final int CASES_CREATE = 128;
		public static final int CASES_MY_CASES_ASSIGNED = 129;
		public static final int CASES_MY_CASES_MY_CUSTOMERS = 130;
		public static final int CASES_MY_CASES_HELP_REQUESTS = 131;
		public static final int CASES_MY_CASES_ASSISTANT_PROVIDED_CLOSED = 132;
		public static final int CASES_MY_CASES_APPROVE = 133;

		// Applications tap
		public static final int APPLICATIONS_LIST = 134;

		// Limit matrix Level 1
		public static final int LIMIT_MATRIX_LEVEL1_CREATE = 135;
		public static final int LIMIT_MATRIX_LEVEL1_UPDATE = 136;
		public static final int LIMIT_MATRIX_LEVEL1_APPROVE = 137;
		public static final int LIMIT_MATRIX_LEVEL1_REJECT = 138;
		public static final int LIMIT_MATRIX_LEVEL1_VIEW = 139;
		public static final int LIMIT_MATRIX_LEVEL1_HISTORY = 140;

		// Limit matrix Level 2
		public static final int LIMIT_MATRIX_LEVEL2_CREATE = 141;
		public static final int LIMIT_MATRIX_LEVEL2_UPDATE = 142;
		public static final int LIMIT_MATRIX_LEVEL2_APPROVE = 143;
		public static final int LIMIT_MATRIX_LEVEL2_REJECT = 144;
		public static final int LIMIT_MATRIX_LEVEL2_VIEW = 145;
		public static final int LIMIT_MATRIX_LEVEL2_HISTORY = 146;

		// Limit matrix Level 3
		public static final int LIMIT_MATRIX_LEVEL3_CREATE = 147;
		public static final int LIMIT_MATRIX_LEVEL3_UPDATE = 148;
		public static final int LIMIT_MATRIX_LEVEL3_APPROVE = 149;
		public static final int LIMIT_MATRIX_LEVEL3_REJECT = 150;
		public static final int LIMIT_MATRIX_LEVEL3_VIEW = 151;
		public static final int LIMIT_MATRIX_LEVEL3_HISTORY = 152;

		public static final int LIMIT_MATRIX_LEVEL4_CREATE = 295;
		public static final int LIMIT_MATRIX_LEVEL4_UPDATE = 298;
		public static final int LIMIT_MATRIX_LEVEL4_APPROVE = 294;
		public static final int LIMIT_MATRIX_LEVEL4_REJECT = 297;
		public static final int LIMIT_MATRIX_LEVEL4_VIEW = 299;
		public static final int LIMIT_MATRIX_LEVEL4_HISTORY = 296;

		// account limit matrix
		public static final int ACCOUNT_LIMIT_MATRIX_CREATE = 245;
		public static final int ACCOUNT_LIMIT_MATRIX_UPDATE = 246;
		public static final int ACCOUNT_LIMIT_MATRIX_APPROVE = 247;
		public static final int ACCOUNT_LIMIT_MATRIX_REJECT = 248;
		public static final int ACCOUNT_LIMIT_MATRIX_VIEW = 249;
		public static final int ACCOUNT_LIMIT_MATRIX_HISTORY = 250;

		// Global Limits
		public static final int GLOBAL_LIMITS_CREATE = 153;
		public static final int GLOBAL_LIMITS_UPDATE = 154;
		public static final int GLOBAL_LIMITS_APPROVE = 155;
		public static final int GLOBAL_LIMITS_REJECT = 156;
		public static final int GLOBAL_LIMITS_VIEW = 157;
		public static final int GLOBAL_LIMITS_HISTORY = 158;

		// Market Segment
		public static final int MARKET_SEGMENT_CREATE = 159;
		public static final int MARKET_SEGMENT_UPDATE = 160;
		public static final int MARKET_SEGMENT_APPROVE = 161;
		public static final int MARKET_SEGMENT_REJECT = 162;
		public static final int MARKET_SEGMENT_VIEW = 163;
		public static final int MARKET_SEGMENT_HISTORY = 164;

		// Service Package
		public static final int SERVICE_PACKAGE_CREATE = 165;
		public static final int SERVICE_PACKAGE_UPDATE = 166;
		public static final int SERVICE_PACKAGE_APPROVE = 167;
		public static final int SERVICE_PACKAGE_REJECT = 168;
		public static final int SERVICE_PACKAGE_VIEW = 169;
		public static final int SERVICE_PACKAGE_HISTORY = 170;
		public static final int SERVICE_PACKAGE_SP_ASSIGNMENT_APPROVE = 171;
		public static final int SERVICE_PACKAGE_SP_ASSIGNMENT_REJECT = 172;

		// Beneficiaries Approval
		public static final int BENEFICIARIES_APPROVAL_LOCAL = 174;
		public static final int BENEFICIARIES_APPROVAL_usman = 175;
		public static final int BENEFICIARIES_APPROVAL_INTERNATIONAL_AGENT = 176;
		public static final int BENEFICIARIES_APPROVAL_ADD_BBYN_BENEFICIARY = 177;
		public static final int BENEFICIARIES_APPROVAL_INTERNATIONAL_OPERATOR = 178;

		// Reprots tap
		public static final int REPORTS_VIEW = 179;

		// Credit Card
		public static final int CREDIT_CARDS_SUMMARY_VIEW = 256;
		public static final int CREDIT_CARD_NICKNAME_UPDATE = 258;
		public static final int CREDIT_CARD_TRANSACTIONS_HISTORY_SEARCH = 260;
		public static final int CREDIT_CARD_STATEMENT_CREATE = 261;

		// ATM Card
		public static final int ATM_CARDS_SUMMARY_VIEW = 257;
		public static final int ATM_CARD_NICKNAME_UPDATE = 259;

		// Funds
		public static final int FUND_TRANSACTIONS_HISTORY_SEARCH = 263;
		public static final int FUND_STATEMENT_CREATE = 264;
		public static final int FUNDS_SUMMARY_VIEW = 265;

		// Default Denied Service
		public static final int CUSTS_DEFAULT_DENIED_SERVICES = 266;

		public static final int CUSTOMERS_GLOBAL_MESSAGES = 272;

		public static final int UTILITY_PAYMENT_PAY = 292;
		public static final int CARDLESS_CONFIRMATION_CODE = 293;

		public static final int ACCOUNTS_TRANS_ALERTS_OFF = 418;

		public static final int BO_CORP_CORPORATE_REGISTRATION = 8001;
		public static final int BO_CORP_GLOBAL_CONFIG = 8002;
		public static final int BO_CORP_SERVICE_PACKAGE_UPDATE = 8003;
		public static final int BO_CORP_SP_DEFAULT_DENIED_SERVICES = 8004;
		public static final int BO_CORP_USER_RESET_LOGIN = 8005;
		public static final int BO_CORP_USER_RESET_TRANS = 8006;
		public static final int BO_CORP_USER_LOCK = 8007;
		public static final int BO_CORP_USER_UNLOCK = 8008;

		public static final int BO_CORP_LM1_CREATE = 8009;
		public static final int BO_CORP_LM1_UPDATE = 8010;
		public static final int BO_CORP_LM1_APPROVE = 8011;
		public static final int BO_CORP_LM1_REJECT = 8012;
		public static final int BO_CORP_LM1_VIEW = 8013;
		public static final int BO_CORP_LM1_HISTORY = 8014;

		public static final int BO_CORP_GLOBAL_LIMITS_CREATE = 8015;
		public static final int BO_CORP_GLOBAL_LIMITS_UPDATE = 8016;
		public static final int BO_CORP_GLOBAL_LIMITS_APPROVE = 8017;
		public static final int BO_CORP_GLOBAL_LIMITS_REJECT = 8018;
		public static final int BO_CORP_GLOBAL_LIMITS_VIEW = 8019;
		public static final int BO_CORP_GLOBAL_LIMITS_HISTORY = 8020;
		public static final int BO_CORP_USER_CORP_EDIT = 8021;
		public static final int BO_CORP_SALARY_CONFIG = 8022;
		public static final int BO_CORP_APPROVAL_CENTER = 8023;
		public static final int BO_CORP_REPORT = 8024;
		public static final int BO_CORP_USER_SEND_OTP = 8025;
		public static final int BO_CORP_REGISTRATION_MODE_UPDATE = 9053;
		public static final int BO_CORP_REGISTRATION_MODE_UPDATE_APPROVE = 9054;
		public static final int BO_CORP_MURABAHA_REQUEST = 9060;
		public static final int BO_CORP_RANKING_CODES_CIF_TYPES_CONFIG = 9061;

		/**
		 * @author Mohammed A. Salim 31/12/2013 Western Union Services
		 */

		public static final int WESTERN_UNION_TRANSFER = 300;
		public static final int WESTERN_UNION_FEES_INQUIRY = 301;
		public static final int WESTERN_UNION_SEND_MONEY_VALIDATE = 302;
		public static final int WESTERN_UNION_SEND_MONEY_STORE = 303;
		public static final int WESTERN_UNION_TRANSACTION_INQUIRY = 304;
		public static final int WESTERN_UNION_REFUND_SEARCH = 305;
		public static final int WESTERN_UNION_REFUND_STORE = 306;
		public static final int WESTERN_UNION_BENEFICIARY_MANAGE = 307;
		public static final int WESTERN_UNION_BENEFICIARY_CREATE = 308;
		public static final int WESTERN_UNION_BENEFICIARY_DELETE = 309;
		public static final int WESTERN_UNION_BENEFICIARY_APPROVE = 310;
		public static final int WESTERN_UNION_BENEFICIARY_REJECT = 311;
		public static final int WESTERN_UNION_BENEFICIARY_RESET = 312;
		public static final int WESTERN_UNION_BENEFICIARY_WAITING = 313;
		public static final int WESTERN_UNION_BENEFICIARY_AMEND = 9067;
		public static final int BENEFICIARIES_APPROVAL_WESTERN_UNION = 314;
		public static final int WESTERN_UNION_BENEFICIARY_OTP_SEND = 315;
		public static final int WESTERN_UNION_CASH_FOR_ME = 316;
		public static final int WESTERN_UNION_TRANSFER_HISTORY = 317;
		public static final int CARDLESS_CID = 318;
		public static final int GLOBAL_MESSAGE_CUST_RESPONSE = 319;
		public static final int ITUNES_GIFT_CARD = 320;
		public static final int ESTATEMENT = 321;
		public static final int CHEQUE_IMAGE_STATEMENT = 322;
		public static final int TRAVEL_NOTIFICATION = 323;
		public static final int RESET_SESSION_ID = 324;
		public static final int SHAKE_3SAREE3_OWN_ACC_TRANSFER = 325;
		public static final int FUNDS_CREATE_SUBSCRIPTION = 326;
		public static final int FUNDS_CREATE_REDEMPTION = 327;
		public static final int SHAKE_MANAGE = 330;
		public static final int BRANCH_DETAILS_CREATE = 333;
		public static final int BRANCH_DETAILS_UPDATE = 334;
		public static final int BRANCH_DETAILS_VIEW = 335;
		public static final int OUR_AND_SHARE = 339;
		public static final int ATM_LOCATION_CREATE = 336;
		public static final int ATM_LOCATION_UPDATE = 337;
		public static final int ATM_LOCATION_VIEW = 338;
		public static final int CREDIT_CARD_ONLINE_BALANCE = 341;

		public static final int GOOGLE_PLAY_GIFT_CARD = 340;
		public static final int LOG_OUT = 342;
		public static final int VALIDATE_USER_OTP = 343;

		public static final int PAY_ME_IN_APP = 328;
		public static final int CREATE_CASE_THANK_YOU_MSG = 329;

		public static final int EWATCH_VALIDATE_PASSCODE = 332;

		public static final int CUSTOMER_PERSONAL_PAYEE = 347;

		// It was 345 which is assigned to change user name
		public static final int SCHOOL_PAYMENT_SERVICE = 349;

		// Fixed Deposit CR
		public static final int FIXED_DEPOSIT_CREATE = 507;

		public static final int EWATCH_LOGIN = 352;

		public static final int CARD_HOLD_TRNX_DETAILS = 350;

		public static final int VIRTUAL_CARD_CVV = 351;

		public static final int SETTINGS_NOTIFICATIONS = 353;

		public static final int SEND_NOTIFICATION_ADMIN = 354;

		public static final int FINGERPRINT_LOGIN = 355;

		public static final int WEBSITE_SEARCH_FILTER = 356;

		public static final int ATM_LOCATION_DELETE = 357;

		public static final int BRANCH_DETAILS_DELETE = 358;

		public static final int ELBOOQ_TO_BOUNYAN_TRANSFER = 361;

		public static final int CIVIL_ID_RENEWAL = 364;

		public static final int WAFFERLI = 368;

		public static final int PAY_ME_SHARE = 365;

		public static final int GENERATE_TOKEN = 366;

		public static final int FINGERPRINT_TRANSCTIONS = 367;

		public static final int DELETE_PUSH_NOTIFICATIONS = 369;
		// elbooq services
		public static final int ELBOOQ_LINK_ACCOUNT = 370;
		public static final int ELBOOQ_RESEND_ACTIVATION_CODE = 371;
		public static final int ELBOOQ_TOPUP = 372;

		public static final int SHAKE_3SAREE3_CARD_PAYMENT = 373;
		public static final int SHAKE_3SAREE3_MOBILE_PAYMENT = 374;

		public static final int ELBOOQ_WALLET = 376;

		public static final int ELBOOQ_ADD_BENEFICIARY = 378;
		public static final int ELBOOQ_DELINK = 379;
		// backoffice features for addign (or editing) school fee
		public static final int SCHOOL_FEE_BACKOFFICE = 380;
		public static final int MOBILE_DEMO_CONTROL_MANAGER = 381;
		public static final int ELBOOQ_CARDLESS_CIVIL_ID = 382;
		public static final int ELBOOQ_CARDLESS_CONFIRMATION_CODE = 383;

		public static final int UNLINK_DEVICE = 386;

		public static final int DOMAIN_SPECIFIC_VARIABLES = 387;

		public static final int SETTINGS_MOBILE_INQUIRY = 384;
		public static final int usman_BENF_BY_MOBILE_NUMBER = 385;

		public static final int WALLET_NFC_DEBIT = 392;
		public static final int WALLET_NFC_CREDIT = 393;

		public static final int NFC_DEBIT_PAYMENT = 394;
		public static final int NFC_AUTH_CARDS_WALLET = 395;

		public static final int AUTH_INFOSYS_TOKEN = 396;
		public static final int HASH_SITEKEY_ANSWER = 391;

		public static final int PAYME_SEND_PAYER_SMS = 397;

		/**
		 * JIRA: RTLCRPMBDV-441 (DA-550 - Card Issuance CR Changes) Neel: 07-Nov-2016
		 * Added new services for Manage Cards
		 */
		public static final int ESERVICES_ISSUE_ATM_CARD = 388;
		public static final int ESERVICES_RENEW_ATM_CARD = 389;
		public static final int ESERVICES_REPLACE_ATM_CARD = 390;

		public static final int SETTINGS_CREDIT_CARD_NOTIFICATION = 398;
		public static final int GLOBAL_PAYEE_SEND_EMAIL = 399;
		public static final int SOAP_AUDITOR = 406;

		/*
		 * JIRA: RTLCRPMBDV-623 (New Murabaha Offers MVP Tasks) [Neel 27-02-2017: Added
		 * new Services for Finanace Murabaha Deal Offer]
		 * 
		 */
		public static final int FINANCE_MURABAHA_DEALS = 400;
		public static final int FINANCE_MURABAHA_CALCULATOR = 401;
		public static final int FINANCE_MURABAHA_ELIGIBILITY = 402;
		public static final int FINANCE_MURABAHA_APPLICATION = 403;
		public static final int FINANCE_MURABAHA_UPDATE = 404;
		public static final int FINANCE_MURABAHA_REFLECTION_PERIOD = 405;
		public static final int FINANCE_MURABAHA_INQUIRE_DETAILS = 407;
		public static final int FINANCE_MURABAHA_APPOINTMENT = 408;

		public static final int SETTINGS_ACCOUNT_TRANS_NOTIFICATIONS = 409;

		// Setting-Change EMail
		public static final int SETTINGS_CHANGE_EMAIL = 410;

		public static final int CUSTOMER_TRANSACTIONS_APPROVAL_CENTER = 411;
		// RTLCRPMBDV-1049 (New Cache Design) - This is the service access to keep
		// customer products in cache for a day even after logoff
		public static final int PRODUCTS_CACHING_ENABLER = 412;
		public static final int ACCOUNTS_CACHING_ENABLER = 413;
		public static final int FINANCE_CACHING_ENABLER = 414;
		public static final int CARDS_CACHING_ENABLER = 415;
		public static final int FUNDS_CACHING_ENABLER = 416;
		public static final int CIF_DETAILS_CACHING_ENABLER = 417;

		public static final int UPDATE_PROFILE = 418;
		public static final int SET_CARD_PIN_DEBIT = 420;

		public static final int BO_REPORT_EMPLOYEE_ACTIVITIES = 421;
		public static final int BO_MOBILE_UPDATE_APPROVAL_CENTER = 447;

		public static final int CREDIT_CARD_REQUEST = 446;

		public static final int READ_GLOBAL_MESSAGE = 448;
		public static final int GET_IBAN_DETAILS = 449;
		public static final int SET_CARD_PIN_CREDIT = 450;

		// Service IDs for eChat Services

		public static final int ECHAT_SERVICE_NOT_ALLOWED = 0;
		public static final int ECHAT_SERVICE = 451;
		public static final int ECHAT_ACCOUNT_BALANCE = 452;
		public static final int ECHAT_ACCOUNT_STATEMENT = 453;
		public static final int ECHAT_PAYME_SHARE = 454;
		public static final int ECHAT_CREDIT_CARD_PAYMENT = 455;
		public static final int ECHAT_UTILITY_PAYMENT = 456;
		public static final int ECHAT_OWN_TRANSFER = 457;

		public static final int ECHAT_CARDLESS = 509;
		public static final int ECHAT_TRANSACTIONS = 510;
		public static final int ECHAT_GOOGLE_PLAY = 511;
		public static final int ECHAT_ITUNES_CARD = 512;
		public static final int ECHAT_BLOCK_REPLACE_CARD = 513;
		public static final int ECHAT_usman_TRANSFER = 514;
		public static final int ECHAT_NEAREST_BRANCH = 515;
		public static final int ECHAT_PAYME_IN_APP = 516;
		public static final int ECHAT_GENERIC_SERVICE = 517;
		public static final int ECHAT_TRANSACTION_SEARCH = 518;

		public static final int ECHAT_LOCAL_TRANSFER = 528;
		public static final int ECHAT_CHARITY_PAYMENT = 529;
		public static final int ECHAT_TRAVEL_NOTIFICATION = 530;
		public static final int ECHAT_usman_BENEFICIARY = 531;
		public static final int ECHAT_LOCAL_BENEFICIARY = 532;
		public static final int ECHAT_OPEN_NEW_ACCOUNT = 533;
		public static final int ECHAT_CHANGE_MOBILE_NUMBER = 534;
		public static final int ECHAT_OPEN_FIXED_DEPOSIT = 535;
		public static final int ECHAT_INTERNATIONAL_TRANSFER = 536;
		public static final int ECHAT_COMPETITION = 537;

		public static final int ECHAT_EVOUCHERS = 540;
		public static final int ECHAT_CARD_HOLD_TRANSACTIONS = 541;
		public static final int ECHAT_CARD_STATEMENT = 542;
		public static final int ECHAT_INT_BENEFICIARY = 543;
		public static final int ECHAT_ACTIVATE_BENEFICIARY = 544;
		public static final int ECHAT_CHEQUE_BOOK_REQUEST = 545;
		public static final int ECHAT_CERTIFICATE_REQUEST = 546;
		public static final int ECHAT_FINANCE_SERVICE = 548;
		public static final int ECHAT_WAFERLI_SERVICE = 549;
		public static final int ECHAT_DELETE_BENEFICIARY = 550;
		public static final int ECHAT_WESTERN_UNION = 551;
		public static final int ECHAT_STANDING_ORDER = 552;
		public static final int ECHAT_WESTERN_UNION_REFUNDS = 553;
		public static final int ECHAT_CREDIT_CARD_REQUEST = 555;
		public static final int ECHAT_CREDIT_CARD_REQUEST_HISTORY = 556;

		public static final int ECHAT_ENABLE_DISABLE_TOUCH_ID = 557;
		public static final int ECHAT_BENEFICIARY_BY_MOBILE = 558;
		public static final int ECHAT_FINANCE_PAYMENT_SCHEDULE = 559;
		public static final int ECHAT_TELEX_VOUCHER = 560;
		public static final int ECHAT_MY_PRODUCTS = 562;
		public static final int ECHAT_UPDATE_BENEFICIARY = 564;
		public static final int ECHAT_BLOCK_CREDIT_CARD = 565;
		public static final int ECHAT_LIVE_CHAT = 570;
		public static final int ECHAT_usman_SELECT = 578;

		public static final int UPDATE_PROFILE_MOBILE_NO = 458;
		public static final int UPDATE_PROFILE_EMAIL = 459;
		public static final int UPDATE_PROFILE_MARITAL_STATUS = 460;
		public static final int UPDATE_PROFILE_EDUCATION = 461;
		public static final int UPDATE_PROFILE_COMMUNICATION_LANGUAGE = 462;
		public static final int UPDATE_PROFILE_ADDRESS = 463;
		public static final int PACI_SKIP_OPTION = 476;
		public static final int MULTIPLE_PAY_ME_SMS = 464;
		public static final int ECHAT_ADMIN_BAGS = 472;
		public static final int ECHAT_ADMIN_ENTITY = 473;
		public static final int ECHAT_ADMIN_BAG_WORD = 474;
		public static final int ECHAT_ADMIN_REG_EXP = 475;
		public static final int NFC_MASTER_CARD = 508;
		public static final int ALL_TRANSFER_SERVICES = 538;
		public static final int FAVORITES_SERVICES = 539;
		public static final int FIXED_DEPOSIT_MANAGE = 554;
		public static final int PN_MULTIPLE_READ_UNREAD = 566;
		public static final int GET_CIF_PRODUCTS = 567;
		public static final int DIGITAL_MUR_ALLOW_TOPUP_FINANCE = 571;

		public static final int FAVORITES_CONNTACT_US = 572;
		public static final int FAVORITES_CALL_CENTER = 573;
		public static final int PARENT_E_VOUCHERS = 574; // parent service for iTunes, GooglePlay, Xbox, Playstation ...
		public static final int PARENT_PAY_ME_SERVICE = 575;
		public static final int PARENT_CASHE_WITHDRWAL = 576;

		public static final int BO_CORP_MASTER_SUBSIDIARIES_SETUP = 9063;
		public static final int BO_CORP_MASTER_SUBSIDIARIES_SETUP_APPROVE = 9064;

		public static final int ECHAT_ADMIN_ALIASES = 520;
		public static final int ECHAT_ADMIN_SERVICES = 519;
		public static final int ECHAT_ADMIN_ROLE_BAGS = 521;
		public static final int ECHAT_ADMIN_ENTIRY_EXP = 522;
		public static final int ECHAT_ADMIN_KNOWLEDGE_REPO = 524;
		public static final int ECHAT_ADMIN_QUESTIONS = 523;
		public static final int ECHAT_ADMIN_REPORTS = 525;
		public static final int ECHAT_ADMIN_ORG_SALARY = 527;
		public static final int DEMO_DATA = 581;

	}// SERVICES

	/**
	 * database sources JNDI names used by the system
	 * 
	 * @author Majdi
	 *
	 */
	public static class DATA_SOURCES {
		private DATA_SOURCES() {
		}

		public static final String BBYN_DATASOURCE = "BBYNDS";
		public static final String BIGDATA_DATASOURCE = BBYN_DATASOURCE; // "BIGDATA";
		public static final String PORTAL_FRAMEWORK_POOL_DATASOURCE = "portalFrameworkPool";
		public static final String BBYN_DATASOURCE_READONLY = "BBYNDS";

	}// DATA_SOURCES

	/**
	 * Used for site key flags, not registered means that user does not register for
	 * sitekey yet.
	 * 
	 * @author Majdi
	 *
	 */
	public static class SITEKEY_FLAGS {
		private SITEKEY_FLAGS() {
		}

		public static final int NOT_REGISTERED = 0;
		public static final int REGISTERED = 1;
		public static final int NEW = 2;
	}// SITEKEY_FLAGS

	/**
	 * Used for site key flags, not registered means that user does not register for
	 * sitekey yet.
	 * 
	 * @author Majdi
	 *
	 */
	public static class BUNDLES {
		private BUNDLES() {
		}

		public static final String UI = "com.as.bundles.ui.UI";
		public static final String DEFAULT_LANGUAGE = "en";
		public static final String ARABIC_LANGUAGE = "ar";
		public static final String ENGLISH_LANGUAGE = "en";
		public static final String VALIDATIONS = "com.as.bundles.validations.Validations";
		public static final String VALIDATIONS_AR = "com.as.bundles.validations.Validations_ar";
		public static final String LANG = "lang";
		public static final String LOCK_MSG = "Your account has been locked, please call 1820082 to reactive your account.";
		public static final String EWEB_UI = "resources.com.usman.ui";
		public static final String EWEB_ERROR = "resources.com.usman.errors";

	}// BUNDLES

	/**
	 * Used for application keys, values realted attributes.
	 * 
	 * @author Majdi
	 *
	 */
	public static class APPLICATION {
		private APPLICATION() {
		}

		public static final String MAPPINGS = "actions-urls-mapping";
	}

	/**
	 * Used for session keys and other related session attributes
	 * 
	 * @author Majdi
	 */

	public static class SESSION_TIMEOUT_RANGE_VALUES {
		private SESSION_TIMEOUT_RANGE_VALUES() {
		}

		private static Integer[] TIMEOUT_RANGE_VALUES = new Integer[] { 5, 10, 15 };

		public static Integer[] getTIMEOUT_RANGE_VALUES() {
			return TIMEOUT_RANGE_VALUES;
		}

	}

	public class SESSION {
		private SESSION() {
		}

		public static final String CUSTOMERDTO = "customerdto_key";
		public static final String EMPLOYEE_DTO = "employeedto_key";
		public static final String IS_ADMIN = "is_admin";
		public static final String USER_SKEY = "user_pwd";
		public static final String BO_ENTITLED_SERVICES = "backOfficeEntitledServices";
		public static final String IB_ENTITLED_SERVICES = "IBCustomersEntitledServices";
		public static final String PHASE_USER_EXISTENCE = "phase_user_existence";
		public static final String PHASE_SITEKEY_ANSWER = "phase_sitekey_answer";
		public static final String PHASE_AUTHENTICATION = "phase_authentication";
		public static final String REQUEST_DTO = "requestdto_key";
		public static final String MOBILE_VIEW = "MobileView";
		public static final String IS_REQUEST_ONLINE_CC_BALANCE = "IsRequestedOnlineCCBal";
		public static final String CARD_FOR_UPDATE = "CardForUpdate";
		public static final String REQUEST_HM_FIELDS = "requestHMLogFields";
		public static final String MOBILE_REQUEST_DTO = "requestdto_mobile";

		public static final String SHOW_OTP = "showOTP";
		public static final String HUGE_AMOUNT_TRANS = "hugeAmountTrans";
		public static final String OTP_IS_NOT_RECEIVED = "otpIsNotReceived";
		public static final String OTP = "otp";
		public static final String DEVICE_DTO_OTP = "deviceOtp";
		public static final String CONSENT_FORM = "consentForm";
		public static final String CONSENT_PDF_FORM = "consentPdfForm";
		// MVP: New Murabaha Tasks. The contract files for download on app
		public static final String FILESLIST = "filesList_key";
		public static final String ENCRYPTION_KEY = "encryptionKey";
		public static final String PACI_DTO = "pacidto";
		public static final String PACI_RANDOM_ID = "paciRandomID";
		public static final String CREDIT_CARD_TERMS_AND_COND = "creditCardTermsAndCond";
		// MVP: The appointment details
		public static final String UPDATE_PROF_OTP_USED = "updateProfileOTPUsed";// Used to validate if Update Profile
																					// OTP is already sent and used
		public static final String UPDATE_PROFILE_DATA = "profileUpdateRequest";

		public static final String BEAN_METHOD_NAME = "methodName";
		public static final String CONFIRMATION_PAGE_TITLE = "confirmationTitle";
		public static final String LAST_PAGE_OUTCOME = "lastPage";
		public static final String CURRENT_PAGE_OUTCOME = "currentPage";

		public static final String INVALID_SESSION_INDICATOR = "invalidSessionIndicator";
		public static final String GLOBAL_MESSAGE_SESSION = "home_global_msg_dto";
		public static final String IS_SESSION_AUTHENTICATED = "IsSessionAuthenticated";
		// EChat Session attribute
		public static final String CHAT_SESSION = "chat_session";
		public static final String CHAT_LAST_MENU_SERVICE = "last_menu_id";
		public static final String CHAT_LAST_QUESTION_ID = "last_question_id";
		public static final String CHAT_EXTRACTED_ANSWERS_PER_SERVICE = "extracted_answers_per_service";
		public static final String CHAT_SERVICE_STAGE = "service_stage";
		public static final String CHAT_LAST_FIXED_OR_DYNAMIC_QUESTION = "last_fixed_or_query_question";
		public static final String IS_SWITCHED_FROM_BOT = "isSwitchedToBot";
		public static final String INITIAL_LANG = "initial_lang";
		public static final String CURRENT_TRAVEL_NOTIF = "current_travel_notification";
		public static final String TEXT_RETURNS_FILTERED_SERVICES = "text_returns_filtered_services";
		public static final String SERVICE_CANCELLED = "cancellation_service";// The session attribute that would be
																				// used to hold the service name that
																				// will be audited in DB
		public static final String TEXT_TYPED_TO_RESOLVE_A_SERVICE = "text_typed_to_resolve_service";

		public static final String STORE_PRODUCT_COUNT = "store_product_count";
		public static final String STORE_COUNTER_COUNT = "store_counter_count";
		public static final String EWATCH_CUSTOMER_VISIBLE_SERVICES_SESSION_NAME = "customer_visible_services";

		public static final String ECHAT_usman_SELECT = "usman_select_details";
		public static final String ECHAT_usman_SELECT_COUNTER = "usman_select_session_counter";
		public static final String ANDROID_SAFETYNET_NONCE = "androidSafetynetNonce";

	}// SESSION

	public class SESSION_SCOPE_ATTRIBUTES {
		private SESSION_SCOPE_ATTRIBUTES() {
		}

		public static final String CUSTOMERDTO = "customerdto_key";
		public static final String EMPLOYEE_DTO = "employeedto_key";
		public static final String IS_ADMIN = "is_admin";
		public static final String USER_SKEY = "user_pwd";
		public static final String BO_ENTITLED_SERVICES = "backOfficeEntitledServices";
		public static final String IB_ENTITLED_SERVICES = "IBCustomersEntitledServices";
		public static final String PHASE_USER_EXISTENCE = "phase_user_existence";
		public static final String PHASE_SITEKEY_ANSWER = "phase_sitekey_answer";
		public static final String PHASE_AUTHENTICATION = "phase_authentication";
		public static final String REQUEST_DTO = "requestdto_key";
		public static final String MOBILE_VIEW = "MobileView";
		public static final String IS_REQUEST_ONLINE_CC_BALANCE = "IsRequestedOnlineCCBal";
		public static final String CARD_FOR_UPDATE = "CardForUpdate";
		public static final String REQUEST_HM_FIELDS = "requestHMLogFields";
		public static final String MOBILE_REQUEST_DTO = "requestdto_mobile";

		public static final String SHOW_OTP = "showOTP";
		public static final String OTP_IS_NOT_RECEIVED = "otpIsNotReceived";
		public static final String OTP = "otp";
		public static final String DEVICE_DTO_OTP = "deviceOtp";

		// MVP: New Murabaha Tasks. The contract files for download on app
		public static final String FILESLIST = "filesList_key";
		public static final String ENCRYPTION_KEY = "encryptionKey";
		public static final String PACI_DTO = "pacidto";
		// MVP: The appointment details
		public static final String UPDATE_PROF_OTP_USED = "updateProfileOTPUsed";// Used to validate if Update Profile
																					// OTP is already sent and used

		public static final String BEAN_METHOD_NAME = "methodName";
		public static final String CONFIRMATION_PAGE_TITLE = "confirmationTitle";
		public static final String LAST_PAGE_OUTCOME = "lastPage";
		public static final String CURRENT_PAGE_OUTCOME = "currentPage";
		public static final String INVALID_SESSION_INDICATOR = "invalidSessionIndicator";
		public static final String GLOBAL_MESSAGE_SESSION = "home_global_msg_dto";
		public static final String IS_SESSION_AUTHENTICATED = "IsSessionAuthenticated";
		// EChat Session attribute
		public static final String CHAT_SESSION = "chat_session";
		public static final String CHAT_LAST_MENU_SERVICE = "last_menu_id";
		public static final String CHAT_LAST_QUESTION_ID = "last_question_id";
		public static final String CHAT_EXTRACTED_ANSWERS_PER_SERVICE = "extracted_answers_per_service";
		public static final String CHAT_SERVICE_STAGE = "service_stage";
		public static final String CHAT_LAST_FIXED_OR_DYNAMIC_QUESTION = "last_fixed_or_query_question";
		public static final String IS_SWITCHED_FROM_BOT = "isSwitchedToBot";

	}// SESSION

	public static class SOA_CREDENTIALS {
		private SOA_CREDENTIALS() {
		}
		// public static final String USERNAME =
		// usmanRuntimeEnvironment.getSecurityConfigValue(SECURITY_CONFIGURATION_KEYS.SOA_USER_NAME,
		// true);
		// <!-- UAT and Dev are ibretail@test -->
		// <!-- Prod is ibretail123 -->
		// public static final String PASSWORD =
		// usmanRuntimeEnvironment.getSecurityConfigValue(SECURITY_CONFIGURATION_KEYS.SOA_PASS_PHRASE,
		// true);
	}

	/**
	 * Used for Consumer IB log services, each log service has as id to be used for
	 * log process
	 * 
	 * @author Ali
	 *
	 */

	/**
	 * Used for log services fields, each service has as a list of binded fields to
	 * be logged
	 * 
	 * @author Ali
	 *
	 */
	public static class LOG_TRANS_FIELDS {
		private LOG_TRANS_FIELDS() {
		}

		public static final int LOGIN_STATUS = 268;

		public static final int SERVICES = 1;
		public static final int AMOUNT = 2;
		public static final int SHOW_LIMITS_UTILIZATION = 5;
		public static final int SHOW_CAPTCHA = 6;
		public static final int SITEKEY_IMAGES_NO = 7;
		public static final int SHOW_LIMITS_DETAILS = 8;
		public static final int PASSWORD_EXPIRATION_PERIOD = 9;

		public static final int TRACKING_NO = 150;

		public static final int FROM_ACCOUNT_NO = 49;
		public static final int TO_ACCOUNT_NO = 50;
		public static final int CURRENCY = 59;
		public static final int COMMENTS = 60;
		public static final int TRANSFER_INSTANCE = 61;
		public static final int THE_PAYEE_OF_INTERNATIONAL_TRANSFER_FEES = 379;

		public static final int TO_CURRENCY = 159;
		public static final int FROM_CURRENCY = 162;

		public static final int TO_AMOUNT = 160;
		public static final int FROM_AMOUNT = 161;

		public static final int FROM_EXCHANGE_RATE = 155;
		public static final int TO_EXCHANGE_RATE = 158;
		public static final int CROSS_EXCHANGE_RATE = 156;

		public static final int FROM_IBAN = 151;
		public static final int TO_IBAN = 152;

		// CaseType Service Fields
		public static final int CASE_TYPE_NAME_EN = 11;
		public static final int CASE_TYPE_NAME_AR = 12;
		public static final int AUTO_RESPONSE_EN = 13;
		public static final int AUTO_RESPONSE_AR = 14;
		public static final int SUBJECT = 15;
		public static final int DESCRIPTION = 16;
		public static final int TO_SELECTED_ITEMS = 17;

		public static final int SCRIPT_TITLE = 185;
		public static final int SCRIPT_BODY_EN = 186;
		public static final int SCRIPT_BODY_AR = 187;

		// ApplicationType Service Fields
		public static final int APPLICATIN_TYPE_NAME_EN = 99;
		public static final int APPLICATIN_TYPE_NAME_AR = 100;
		public static final int APPLICATIN_TYPE_AUTO_REPLAY = 101;
		public static final int APPLICATIN_TYPE_SUBJECT = 102;
		public static final int APPLICATIN_TYPE_DESC = 103;
		public static final int APPLICATIN_TYPE_REPLAY_MSG = 104;
		public static final int APPLICATIN_TYPE_FROM_MSG_CENTER = 105;

		// Employees Service Fields
		public static final int EMPLOYEES_FIRST_NAME = 106;////////////////////////////////////////////////
		public static final int EMPLOYEES_LAST_NAME = 107;
		public static final int EMPLOYEES_EMAIL = 108;
		public static final int EMPLOYEES_IMMEDIATE_SUPERVISOR = 109;
		public static final int EMPLOYEES_PHONE_NO = 110;
		public static final int EMPLOYEES_ROLE_ID = 111;
		public static final int EMPLOYEES_USER_NAME = 112;
		public static final int EMPLOYEES_STATUS = 113;
		public static final int EMPLOYEES_IS_SUPER_ADMIN = 114;
		public static final int EMPLOYEES_ALLOW_OWN_APPROVAL = 115;
		public static final int EMPLOYEES_CASES = 116;
		public static final int EMPLOYEES_APPLICATIONS = 117;

		// Customer Services Access
		public static final int SERVICE_NAME = 184;
		public static final int SERVICE_ACCESS_STATUS = 267;

		// Global Messages Fields
		public static final int BANK_NAME = 118;
		public static final int MESSAGE_TYPE = 119;
		public static final int FROM_AGENT = 120;
		public static final int FROM_DATE = 121;
		public static final int TO_DATE = 122;
		public static final int SENDING_LIST = 123;

		public static final int CUSTOMER_ID = 124;
		public static final int CUSTOMER_NAME_AR = 171;
		public static final int CUSTOMER_NAME_EN = 172;
		public static final int CUSTOMER_REQ_OPERATION = 246;
		public static final int CUSTOMER_CIF_NO = 125;
		public static final int IBAN = 126;
		public static final int ACCOUNT_NICKNAME = 148;
		public static final int ACCOUNT_NEW_NICKNAME = 263;
		public static final int ACCOUNT_VISIBILITY = 149;
		public static final int ACCOUNT_NO = 147;
		public static final int CUSTOMER_ACCOUNT_NO = 242;

		// GLOBAL PAYEES FIELDS
		public static final int PAYEE_TYPE = 127;
		public static final int PAYEE_NAME_EN = 128;
		public static final int PAYEE_NAME_AR = 129;
		public static final int PAYEE_ACCOUNT_NO = 130;
		public static final int PAYEE_EMAIL = 391;
		public static final int MINIMUM_AMOUNT = 131;
		public static final int MAXIMUM_AMOUNT = 132;
		public static final int FIELD1_NAME = 133;
		public static final int FIELD1_VISIBILITY = 134;
		public static final int FIELD1_MANDATORY = 135;
		public static final int FIELD1_VALIDATE_CIVIL_ID = 136;
		public static final int FIELD1_LENGTH = 137;
		public static final int FIELD1_TYPE = 138;
		public static final int FIELD1_STARTS_WITH = 139;
		public static final int FIELD2_NAME = 140;
		public static final int FIELD2_VISIBILITY = 141;
		public static final int FIELD2_MANDATORY = 142;
		public static final int FIELD2_VALIDATE_CIVIL_ID = 143;
		public static final int FIELD2_LENGTH = 144;
		public static final int FIELD2_TYPE = 145;
		public static final int FIELD2_STARTS_WITH = 146;

		// Constants for Transaction Details (New Mapping) - Transfers
		public static final int FROM_ACC_AMOUNT = 79;
		public static final int FROM_ACC_AMOUNT_IN_KD = 78;
		public static final int FROM_ACC_CURRENCY = 77;
		public static final int FROM_ACC_RATE = 76;
		public static final int TO_ACC_AMOUNT = 69;
		public static final int TO_ACC_AMOUNT_IN_KD = 68;
		public static final int TO_ACC_CURRENCY = 67;
		public static final int TO_ACC_RATE = 65;

		// Standing Order fields details
		public static final int SO_DURATION = 276;
		public static final int SO_START_DATE = 277;
		public static final int SO_END_DATE = 278;
		public static final int SO_NO_OF_PAYMENTS = 279;
		public static final int SO_IS_PERPETUAL = 280;

		// Back-End Errors

		public static final int WS_ERROR_DTO = 281;

		// Constants for Transaction Details (new Mapping) - Payments
		public static final int TRANSACTON_BRANCH = 96;
		public static final int SERVICE_CODE = 97;
		public static final int IMAL_OP_NO = 93;
		public static final int IMAL_REFERENCE_NO = 94;
		public static final int IMAL_ERROR_DESCRIPTION = 95;

		// Constants for Transaction Details (new Mapping) - Finance (Murabaha)
		public static final int BRANCH_CODE = 253;
		public static final int DEAL_NUMBER = 254;
		public static final int CIF_NUMBER = 255;
		public static final int DEBIT_ACCOUNT_NUMBER = 256;
		public static final int TRANSACTION_DATE = 257;
		public static final int SETTLEMENT_NUMBER = 258;
		public static final int OTP_DIGITS = 163;
		public static final int OTP_EXPIRATION_PERIOD = 164;
		public static final int APPLICATION_MAIL_LIST = 165;
		public static final int CASES_MAIL_LIST = 166;

		// Constants for Apply for a Cheque Book
		public static final int CHEQUE_BOOK_LANGUAGE = 176;
		public static final int URGENT_CHEQUE_BOOK = 175;
		public static final int NO_OF_CHEQUE_BOOKS = 173;
		public static final int NO_OF_LEAVES_PER_CHEQUE_BOOK = 174;

		// Constants for Apply for a Balance Certificate
		public static final int CERTIFICATE_LANGUAGE = 177;
		public static final int CERTIFICATE_ADDRESS = 178;
		public static final int CERTIFICATE_CHARGE = 179;

		// Admin Roles
		public static final int ROLE_ID = 167;
		public static final int ROLE_NAME_EN = 168;
		public static final int ROLE_NAME_AR = 169;
		public static final int ROLE_SERVICS = 170;

		// Constants for usman , Local and International beneficiaries (Payees)
		public static final int BENEFICIARY_NICKNAME = 182;
		public static final int BENEFICIARY_BANK_NAME = 84;
		public static final int BENEFICIARY_BANK_ADDRESS = 154;
		public static final int BENEFICIARY_BANK_COUNTRY_ID = 86;
		public static final int BENEFICIARY_ACCOUNT_NO = 180;
		public static final int BENEFICIARY_IBAN = 181;

		public static final int BENEFICIARY_INTERM_BANK_REQ = 243;
		public static final int BENEFICIARY_CIF_NO = 233;
		public static final int BENEFICIARY_SERIAL_NO = 234;
		public static final int BENEFICIARY_ACTION_TYPE = 235;
		public static final int BENEFICIARY_TYPE = 236;
		public static final int BENEFICIARY_DATE = 237;
		public static final int BENEFICIARY_BRANCH_NAME = 82;
		public static final int BENEFICIARY_CURRENCY = 157;
		public static final int BENEFICIARY_BANK_COUNTRY_NAME = 85;
		public static final int BENEFICIARY_NAME = 153;
		public static final int BENEFICIARY_REJECTION_REASON = 240;
		public static final int BENEFICIARY_BANK_SWIFT_CODE = 83;

		public static final int CREDIT_CARD_COMPANY_CODE = 208;
		public static final int CREDIT_CARD_BRANCH_CODE = 209;
		public static final int CREDIT_CARD_CIF_NO = 212;
		public static final int CREDIT_CARD_POST_DATE = 214;
		public static final int CREDIT_CARD_TRADE_DATE = 215;
		public static final int CREDIT_CARD_VALUE_DATE = 216;
		public static final int DEBIT_AMOUNT = 217;
		public static final int CREDIT_CARD_CV_AMOUNT = 218;
		public static final int CREDIT_CARD_JV_TYPE = 220;
		public static final int CREDIT_CARD_TRANSACTION_TYPE = 221;
		public static final int CREDIT_CARD_TIME_CREATED = 223;
		public static final int CREDIT_CARD_TERMINAL_ID = 224;
		public static final int CREDIT_CARD_CREATED_BY = 225;
		public static final int CREDIT_CARD_AUTHORISED_BY = 226;
		public static final int CREDIT_CARD_TRANSACTION_BRANCH_CODE = 227;
		public static final int CREDIT_CARD_TRANSACTION_ORIGIN = 228;
		public static final int CREDIT_CARD_TRANSACTION_CURRENCY = 229;
		public static final int CREDIT_CARD_NO = 230;
		public static final int CREDIT_CARD_NICKNAME = 251;
		public static final int CREDIT_CARD_NEW_NICKNAME = 252;

		// limit matrix
		public static final int LIMIT_MARKET_SEGMENT = 188;
		public static final int LIMIT_SERVICE_PACKAGE = 189;
		public static final int LIMIT_TRANSFER_TYPE = 193;
		// public static final int ACCOUNT_NO = 147;
		public static final int LIMIT_CURRENCY = 191;
		public static final int LIMIT_PERIOD = 192;
		public static final int LIMIT_CHANNEL = 190;//
		public static final int LIMIT_MAX_AMOUNT = 194;
		public static final int LIMIT_TOTAL_TRANSACTIONS = 195; //

		// GLOBAL LIMITS
		public static final int GLOBAL_LIMITS_TRANSFER_TYPE = 196;//
		public static final int GLOBAL_LIMITS_MAX_AMOUNT = 197;
		public static final int GLOBAL_LIMITS_MIN_AMOUNT = 198; //

		// MARKET SEGMENTS FIELDS
		public static final int MARKET_SEGMENTS_BANK = 199;
		public static final int MARKET_SEGMENTS_TYPE = 200;
		public static final int MARKET_SEGMENTS_NAME_EN = 201;
		public static final int MARKET_SEGMENTS_NAME_AR = 202;
		public static final int MARKET_SEGMENTS_DESC = 203;

		// SERVICE PACKAGE
		public static final int SERVICE_PACKAGE_MARKET_SEGMENT = 204;
		public static final int SERVICE_PACKAGE_NAME = 205;
		public static final int SERVICE_PACKAGE_DESC = 206;
		public static final int SERVICE_PACKAGE_DEFAULT = 207;
		public static final int SERVICE_PACKAGE_ID = 266;

		// Charity
		public static final int GLOBAL_CHARITY_PAYEE_NAME = 231;
		public static final int GLOBAL_CHARITY_PAYEE_NICKNAME = 232;
		public static final int GLOBAL_CHARITY_PAYEE_FIELD_1 = 244;
		public static final int GLOBAL_CHARITY_PAYEE_FIELD_2 = 245;

		public static final int ATM_CARD_NO = 247;
		public static final int ATM_CARD_NICKNAME = 249;
		public static final int ATM_CARD_NEW_NICKNAME = 250;
		public static final int ATM_CARD_BLOCK_REASON = 248;

		public static final int MONTH = 264;
		public static final int YEAR = 265;
		// Finance
		public static final int FINANCE_NICKNAME = 259;
		public static final int FINANCE_NEW_NICKNAME = 260;

		// Funds
		public static final int FUND_PORTFOLIO_NO = 261;
		public static final int FUND_PORTFOLIO_NAME = 262;

		// E-Services Open a new Account
		public static final int BRANCH_NAME = 269;
		public static final int INITIAL_DEPOSIT_AMOUNT = 270;

		// E-Services Transfer Limit
		public static final int TRANSFER_LIMIT_TYPE = 271;
		public static final int LIMIT_TYPE = 272;
		public static final int LIMIT_KUWAIT_CURRENCY = 273;
		public static final int LIMIT_FOREIGN_CURRENCY = 274;

		// IB settings
		public static final int MINUTES_OF_INACTIVITY = 275;
		public static final int MOBILE_NUMBER = 282;

		public static final int EMPLOYEE_USER_ID = 284;
		public static final int SUPER_ADMIN_USERNAME = 285;
		public static final int SUPER_APPROVER_USERNAME = 286;
		public static final int CORPORATE_CIF_NUMBER = 287;
		// Global Configuration
		public static final int GLOBAL_CONFIGURATION = 283;
		public static final int RESET_SITE_KEY = 288;
		public static final int SITE_KEY_QUESTIONS_STYLE = 289;
		public static final int CREDITED_ACCOUNT = 290;
		public static final int VALIDATE_IBAN = 291;
		public static final int VALIDATE_CVD = 292;
		public static final int MINIMUM_NUMBER_OF_SALARY = 293;
		public static final int BO_CORP_USER_NAME = 295;
		public static final int BO_CORP_USER_MOBILE_NUMBER = 294;
		public static final int BO_CORP_USER_FIRST_NAME = 297;
		public static final int BO_CORP_USER_LAST_NAME = 298;
		public static final int BO_CORP_USER_STATUS = 299;
		public static final int MAXIMUM_NUMBER_OF_SALARY = 300;
		public static final int ACCOUNT_TYPE = 301;
		public static final int BO_CORPORATE_REGISTRATION = 302;
		public static final int BO_CORPORATE_REGISTRATION_MODE = 329;

		/// Mohammed A. Salim - 30/12/2013
		// constants for Western_Union
		public static final int WU_BENEFICARY_NICKNAME = 303;
		public static final int WU_BENEFICARY_FIRSTNAME = 304;
		public static final int WU_BENEFICARY_LASTNAME = 305;
		public static final int WU_BENEFICARY_COUNTRY = 306;
		public static final int WU_BENEFICARY_STATE = 307;
		public static final int WU_BENEFICARY_CITY = 308;
		public static final int WU_BENEFICARY_CURRENCY = 309;
		public static final int WU_BENEFICIARY_MODIFIED_DATE = 310;
		public static final int WU_SENDER_CIF = 311;
		public static final int WU_SENDER_FROM_ACCOUNT_NO = 312;
		public static final int WU_RECEIVER_DETAILS = 313;
		public static final int WU_TRANSFER_AMOUNT = 314;
		public static final int WU_SENDER_USER_NAME = 315;

		public static final int CHANNEL_ID = 474;
		public static final int PAYMENT_DIGEST = 475;
		public static final int NATIONAL_ID = 476;
		public static final int COUNTRY_OF_BIRTH = 477;
		public static final int ACCOUNT_NUMBER = 478;
		public static final int ADDRESS = 479;
		public static final int CHARGES = 480;
		public static final int PRINCIPAL_AMOUNT = 481;
		public static final int GROSS_AMOUNT = 482;
		public static final int COUNTRY_ISO_CODE = 483;
		public static final int CURRENCY_ISO_CODE = 484;
		public static final int EXPECTED_PAYOUT_AMOUNT = 485;
		public static final int NATIONAL_ID_EXPIRATION_DATE = 486;
		public static final int GLOBAL_MSG_CUST_RESPONSE = 316;
		public static final int ITUNES_GIFT_CARD = 317;
		public static final int ESTATEMENT = 318;
		public static final int TRAVEL_NOTIFICATION = 319;
		public static final int CARDLESS_CIVIL_ID = 320;
		public static final int CASH4ME = 321;

		public static final int FUND_ACTION_TYPE = 322;
		public static final int FUND_AMOUNT = 323;
		public static final int FUND_UNITS = 324;
		public static final int ATM_LOCATION_CODE = 326;
		public static final int PREM_ACCOUNT_GL_CODE = 325;
		public static final int ENABLE_CREDIT_CARDS_ONLINE_BALANCE = 327;
		public static final int FUNDS_MAIL_LIST = 328;
		public static final int REQUEST_TOKEN = 351;

		public static final int CUST_PAYEE_MOBILE_NO = 352;
		public static final int CUST_PAYEE_SERVICE_PROVIDER_NAME = 353;
		public static final int CUST_PAYEE_SERVICE_TYPE = 354;
		public static final int CUST_PAYEE_NICK_NAME = 355;
		public static final int CUST_PAYEE_NAME = 356;

		public static final int SCHOOL_NAME = 357;
		public static final int STUDENT_NAME = 358;
		public static final int CLASS_NAME = 359;
		public static final int CLASS_REF = 360;
		public static final int STUDENT_ID = 361;
		public static final int FEES_TYPE = 362;
		public static final int FEES_AMOUNT = 363;

		public static final int OLD_USERNAME = 364;
		public static final int NEW_USERNAME = 365;

		public static final int FP_MOBILE_LOGIN_TOKEN = 368;
		public static final int FP_INVALID_LOGIN_ATTEMPT = 369;
		public static final int SEARCH_FILTER_ALIAS = 370;
		public static final int SEARCH_FILTER_TYPE = 371;
		public static final int SEARCH_FILTER_NAME_EN = 372;
		public static final int SEARCH_FILTER_NAME_AR = 373;

		public static final int ATM_LOCATION_NAME = 374;

		public static final int ROUND_UP_TO = 376;
		public static final int DURATION = 377;

		public static final int CIVIL_ID_RENEWAL = 375;

		public static final int SERVICE_PACKAGE_EXPIRATION_DATE = 378;

		// elbooq
		public static final int ELBOOQ_ID = 380;
		public static final int ELBOOQ_UUID_TOKEN = 381;
		public static final int ELBOOQ_AVAILABLE_BALANCE = 382;
		public static final int ELBOOQ_CURRENT_BALANCE = 383;

		/**
		 * JIRA: RTLCRPMBDV-441 (DA-550 - Card Issuance CR Changes) Neel: 08-Nov-2016
		 */
		public static final int ATM_CARD_ISSUE_REASON = 388;
		public static final int ATM_CARD_REPLACE_REASON = 389;
		// ----------------------------------------------

		public static final int REGISTERED_DEVICE_ID = 385;
		public static final int REQUEST_DEVICE_ID = 386;
		public static final int CARD_SECURE_ALIAS = 390;

		// change email log fields
		public static final int OLD_EMAIL = 423;
		public static final int NEW_EMAIL = 424;
		public static final int EMAIL_LINK_EXPIRY = 425;

		/**
		 * JIRA: RTLCRPMBDV-623 (MVP - New Murabaha/Top-up MVP) Neel: 07-Mar-2016
		 */
		public static final int DEAL_TYPE = 392;
		public static final int SALARY = 393;
		public static final int EMPLOYMENT_TYPE = 394;
		public static final int FINANCE_TYPE = 395;
		public static final int HIBA_OPTED = 396;
		public static final int HIBA_AMOUNT = 397;
		public static final int REFLECTION_DATE = 398;
		public static final int LEAD_REF_ID = 399;
		public static final int LEAD_CODE = 400;
		public static final int OUTSTANDING_BALANCE = 401;
		public static final int LEAD_STATUS = 402;
		public static final int CUST_MURABAHA_STAGE_STATUS = 403;
		public static final int REFLECTION_PERIOD_COMPLETE = 404;
		public static final int PRODUCT_CATEGORY = 405;
		public static final int REQUEST_TYPE = 406;
		public static final int APPOINTMENT_DATE = 407;
		public static final int BRANCH_EMAIL = 408;
		public static final int FILE_NAME = 409;
		public static final int FILE_EXTENSION = 410;
		public static final int REL_OFFICER_ID = 411;
		public static final int REL_OFFICER_NAME = 412;
		public static final int REL_OFFICER_EMAIL = 413;
		public static final int DBR = 414;
		public static final int CASH_IN_HAND = 415;
		public static final int TOTAL_DEAL_AMOUNT = 416;
		public static final int TOTAL_PROFIT = 417;
		public static final int NATIONALITY = 418;
		public static final int CLASS_CODE = 419;
		public static final int MAXIMUM_DURATION = 420;
		public static final int OTHER_PAYMENTS = 421;
		public static final int MINIMUM_DURATION = 422;
		public static final int PN_INFORMATIVE_LAERT = 426;
		public static final int PN_CREDIT_CARD_NOTIFICATION = 427;
		public static final int PN_ACCOUNTS_AND_DEBIT_ALERTS = 428;
		public static final int REGISTERED_WITH_SMS = 429;
		public static final int OTP_REQUIRED = 430;
		public static final int PN_INFORMATIVE_LAERT_OLD = 431;
		public static final int PN_CREDIT_CARD_NOTIFICATION_OLD = 432;
		public static final int PN_ACCOUNTS_AND_DEBIT_ALERTS_OLD = 433;

		/**
		 * @author Neelkanth Tripathi [28-Aug-2017]
		 * @JIRA_Ref: RTLCRPMBDV-1015 (DA-735: Update Client Profile)
		 */
		public static final int PROFILE_NEW_MARITAL_STATUS = 434;
		public static final int PROFILE_OLD_MARITAL_STATUS = 435;
		public static final int PROFILE_NEW_EDUCATION_QUAL = 436;
		public static final int PROFILE_OLD_EDUCATION_QUAL = 437;
		public static final int PROFILE_NEW_LANGUAGE = 438;
		public static final int PROFILE_OLD_LANGUAGE = 439;
		public static final int PROFILE_NEW_HOUSE_NUM = 440;
		public static final int PROFILE_OLD_HOUSE_NUM = 441;
		public static final int PROFILE_NEW_BLOCK = 442;
		public static final int PROFILE_OLD_BLOCK = 443;
		public static final int PROFILE_NEW_STREET = 444;
		public static final int PROFILE_OLD_STREET = 445;
		public static final int PROFILE_NEW_AVENUE = 446;
		public static final int PROFILE_OLD_AVENUE = 447;
		public static final int PROFILE_NEW_AREA = 448;
		public static final int PROFILE_OLD_AREA = 449;
		public static final int PROFILE_NEW_HOME_ADDRESS = 450;
		public static final int PROFILE_OLD_HOME_ADDRESS = 451;
		public static final int PROFILE_NEW_CITY_ADDRESS = 452;
		public static final int PROFILE_OLD_CITY_ADDRESS = 453;
		public static final int PROFILE_NEW_MOBILE = 454;
		public static final int PROFILE_OLD_MOBILE = 455;
		/**
		 * @author Neelkanth Tripathi [14-Oct-2017]
		 * @JIRA_Ref: RTLCRPMBDV-1100 (DA-792: Create International Beneficiary
		 *            Enhancement)
		 */
		public static final int IFSC_CODE = 456;
		public static final int ROUTING_NUMBER = 457;
		/**
		 * @author Neelkanth Tripathi [28-Aug-2017]
		 * @JIRA_Ref: RTLCRPMBDV-1015 (DA-735: Update Client Profile) More fields
		 */
		public static final int PROFILE_NEW_POST_OFFICE_BOX = 458;
		public static final int PROFILE_OLD_POST_OFFICE_BOX = 459;
		public static final int PROFILE_NEW_POST_OFFICE_BOX_AREA = 460;
		public static final int PROFILE_OLD_POST_OFFICE_BOX_AREA = 461;
		public static final int PROFILE_NEW_POSTAL_CODE = 462;
		public static final int PROFILE_OLD_POSTAL_CODE = 463;
		public static final int PROFILE_NEW_POST_OFFICE_NAME = 464;
		public static final int PROFILE_OLD_POST_OFFICE_NAME = 465;

		// RTLCRPMBDV-1232 : more logs for wu
		public static final int WU_MTCN = 466;
		public static final int WU_MTCN_DATE = 467;
		public static final int WU_TRANSACTION_ID = 468;
		public static final int OLD_DESCRIPTION = 473;

		// Opening FD Thru Mobile Application

		public static final int PROFIT_ACCOUNT = 469;
		public static final int FIXED_DEPOSIT_TYPE = 470;
		public static final int FIXED_DEPOSIT_DURATION = 471;
		public static final int FIXED_DEPOSIT_RENEWAL = 472;

		public static final int GENUINE_DEVICE_TOKEN = 487;
		public static final int ANDROID_NONCE = 488;
		public static final int IS_GENUINE_DEVICE = 489;
		public static final int HTTP_ERROR_CODE = 490;
		public static final int IOS_BIT0 = 491;
		public static final int IOS_BIT1 = 492;
		public static final int JWT_TOKEN = 493;

	}// LOG_TRANS_FIELDS

	/**
	 * Used for to dynamically setting action method name for confirmation button
	 * 
	 * @author Ali Fayad
	 *
	 */
	public static class ACTION_CONFIGURATION {
		private ACTION_CONFIGURATION() {
		}

		public static final String ACTION_NAME = "action";

	}// ACTION_CONFIGURATION

	public static class MESSAGE_PRIORITY {
		private MESSAGE_PRIORITY() {
		}

		public static final int HIGH = 1;

	}// MESSAGE_PRIORITY

	public static class LOG_TRANSACTION_STATUS {
		private LOG_TRANSACTION_STATUS() {
		}

		public static final int SUCCESS = 0;
		public static final int FAILURE = 1;
		public static final int GENBRAL_EXCEPTION = 2;
	}// TRANSACTION_STATUS

	public static class DESKTOPS_PATHS {
		private DESKTOPS_PATHS() {
		}

		public static final String E_WEB_LOGIN = "/eWeb/pages/retail/public/sitekey/login/begin.xhtml";
		public static final String BACKOFFICE_PORTAL = "/faces/portlets/backoffice/menueOne.jsp";
		public static final String RETAIL_LOGIN = "/appmanager/usmanPortal/RetailLogin";
		public static final String RETAIL_PORTAL = "/appmanager/usmanPortal/RetailDesktop";
		public static final String CORPORATE_LOGIN = "/appmanager/CorporatePortal/CorporateLogin";
		public static final String CORPORATE_PORTAL = "/appmanager/CorporatePortal/CorporateDesktop";

		public static final String BACKOFFICE_JSP_BEGIN = "/faces/portlets/secured/begin.jsp"; // "/faces/portlets/backoffice/login/begin.jsp";//
		public static final String BACKOFFICE_JSP_LOGIN = "/faces/portlets/secured/login.jsp"; // "/faces/portlets/backoffice/login/login.jsp";//
		public static final String BACKOFFICE_JSP_LOGOUT = "/faces/common/shared/boLogout.jsp";

		public static final String BACKOFFICE_JSP_EMP_CHNG_PSSWRD = "/faces/portlets/backoffice/admin/employee/edit/employee_change_password.jsp";

		public static final boolean IS_PORTAL = false;

	}// DESKTOPS_PATHS

	/**
	 * Used for ASDataGrid Class to set some related attributes and components
	 * images
	 * 
	 * @author afayad
	 *
	 */
	public static class AS_DATA_GRID {
		private AS_DATA_GRID() {
		}

		public static final String ASC_SORTING_IMAGE_PATH = "/framework/skins/shared/images/asc.gif";
		public static final String DECS_SORTING_IMAGE_PATH = "/framework/skins/shared/images/desc.gif";
		public static final String UP_DOWN_SORTING_IMAGE_PATH = "/framework/skins/shared/images/updown.gif";
		public static final String PAGE_LABEL_EN = "Page";
		public static final String PAGE_LABEL_AR = "Page";
		public static final String PAGING_NEXT_LABEL_EN = "�";
		public static final String PAGING_NEXT_LABEL_AR = "�";
		public static final String PAGING_PREV_LABEL_EN = "�";
		public static final String PAGING_PREV_LABEL_AR = "�";
		public static final int MAX_EXPORTED_RECORDS = 30000;
	}// AS_DATA_GRID

	/**
	 * used to reference lookup item based on group id
	 * 
	 * @author afayad
	 *
	 */
	public static class SERVICE_TYPES {
		private SERVICE_TYPES() {
		}

		public static final int IB_CONSUMERS_HIDDEN_SERVICES = 1;
		public static final int IB_BO_HIDDEN_SERVICES = 2;
		public static final int IB_BO_ENTITLEMENTS_SERVICES = 3;
		public static final int IB_CONSUMERS_ENTITLEMENTS_SERVICES = 4;
		public static final int IB_CORPORATE_HIDDEN_SERVICES = 5;
		public static final int IB_CORPORATE_ENTITLEMENTS_SERVICES = 6;
		public static final int IB_BO_CORPORATE_HIDDEN_SERVICES = 7;
		public static final int IB_BO_CORPORATE_ENTITLEMENTS_SERVICES = 8;

	}// SERVICE_TYPES

	/**
	 * used to reference lookup item based on group id
	 * 
	 * @author afayad
	 *
	 */
	public static class LOOKUP_ITEMS {
		private LOOKUP_ITEMS() {
		}

		public static final int LIMIT_PERIOD_GROUP = 4;
		public static final int GLOBAL_MSG_TYPE_GROUP = 8;
		public static final int BANK_GROUP = 9;
		public static final int TO_GLOBAL_MSG_SENDING_GROUP = 10;
		public static final int CASE_STATUS = 3;
		public static final int LOGIN_PASSWORD = 0;
		public static final int TRANSACTION_PASSWORD = 1;
		public static final int BOTH_PASSWORDS = 2;
	}// LOOKUP_ITEMS

	/**
	 * used to reference lookup item for Limit Period
	 * 
	 * @author afayad
	 *
	 */
	public static class RECEIVER_LIST_TYPES {
		private RECEIVER_LIST_TYPES() {
		}

		public static final int SERVICE_PACKAGE = 1;
		public static final int FILTERED_CUSTOMERS = 2;
		public static final int ALL_CUSTOMERS = 3;

	}// RECEIVER_LIST_TYPES

	/**
	 * used to reference lookup item for Limit Period
	 * 
	 * @author afayad
	 *
	 */
	public static class GLOBAL_MESSAGE_STATUS {
		private GLOBAL_MESSAGE_STATUS() {
		}

		public static final int ACTIVE = 1;
		public static final int INACTIVE = 2;
	}// GLOBAL_MESSAGE_STATUS

	/**
	 * used to reference lookup item for Limit Period
	 * 
	 * @author afayad
	 *
	 */
	public static class LIMIT_PERIODS {
		private LIMIT_PERIODS() {
		}

		public static final int DAILY = 1;
		public static final int MONTHLY = 2;
		public static final int DAILY_MONTHLY = 3;
	}// LIMIT_PERIODS

	/**
	 * used to reference lookup item for Limit Period
	 * 
	 * @author afayad
	 *
	 */
	public static class CURRENCIES {
		private CURRENCIES() {
		}

		public static final int KWD = 1;
		public static final int NON_KWD = -3;
		public static final int INR = 64;
		public static final String IMAL_AS_CURRENCY_KWD = "414";
		public static final String CURRENCY_NAME_KWD = "KWD";
		public static final String CURRENCY_NAME_NON_KWD = "NON KWD";
		public static final String KWD_EXCHANGE_RATE = "1";

	}// CURRENCIES

	/**
	 * used to reference BANKS
	 * 
	 * @author afayad
	 *
	 */
	public static class BANKS {
		private BANKS() {
		}

		public static final int KUWAIT_BANK = 1;

	}// BANKS

	/**
	 * used to reference TRANSACTION STATUS
	 * 
	 * @author afayad
	 *
	 */
	public static class TRANSACTION_STATUS {
		private TRANSACTION_STATUS() {
		}

		public static final int SUCCESS = 0;
		public static final int BATCH_INPROCESS = 1;
		public static final int CANCELEDON = 2;
		public static final int FAILURE = 3;
		public static final int IMMED_INPROCESS = 4;
		public static final int LIMIT_CHECK_FAILED = 5;
		public static final int NOFUNDSON = 6;
		public static final int POSTEDON = 7;
		public static final int WILLPROCESSON = 8;
		public static final int PARTIAL_SUCCESS = 9;

	}// TRANSACTION_STATUS

	/**
	 * database sources CONFIG_GLOBAL_SETUP item names
	 * 
	 * @author Emad
	 *
	 */
	public static class CONFIG_GLOBAL_SETUP {
		private CONFIG_GLOBAL_SETUP() {
		}

		public static final int SHOW_LIMITS_UTILIZATION = 1;

		public static final int SITE_KEY_IMAGES_NO = 2;
		public static final int SHOW_CAPTCHA = 3;
		public static final int PASSWORD_EXPIRATION_PERIOD = 4;
		public static final int SHOW_LIMITS_DETAILS = 5;
		public static final String COMPANY_CODE = "1";

		public static final int OTP_DIGITS = 6;
		public static final int OTP_EXPIRATION_PERIOD = 7;
		public static final int USER_AUTHENTICATION_TYPE = 8;
		public static final int APPS_MAIL_LIST = 9;

		public static final int CASES_MAIL_LIST = 10;
		public static final int RESET_SITE_KEY = 11;
		public static final int OUTLOOK_MAIL_LIST = 12;
		public static final Integer SITE_KEY_QUESTIONS_STYLE = 13;
		public static final Integer IS_OTP_ENABLED = 14;

		public static final Integer IS_usman_TRANSFER_OTP_ENABLED = 15;
		public static final Integer IS_LOCAL_TRANSFER_OTP_ENABLED = 16;
		public static final Integer IS_INTERNATIONAL_TRANSFER_OTP_ENABLED = 17;
		public static final Integer IS_WU_TRANSFER_OTP_ENABLED = 18;
		public static final Integer IS_UTILITY_PAYMENT_OTP_ENABLED = 19;

		public static final Integer TRANSFER_CURRENCY_SAUDI_RIYAL_CODE = 682;

		public static final Integer MAX_TO_SAME_CID = 20;
		public static final Integer MAX_TO_SAME_CID_ALL_CUSTOMERS = 21;
		public static final Integer DEVICE_RELEASE_INFO = 22;
		public static final Integer IS_CHEQUE_ENABLED = 23;
		public static final Integer TRAVEL_NOTIFICATION_MAIL_LIST = 24;
		public static final Integer TRAVEL_NOTIFICATION_END_OF_TRIP_MAIL_LIST = 76;
		public static final Integer PREMIUM_ACCOUNTS_GL_CODE = 25;
		public static final int IS_CREDIT_CARD_ONLINE_BALANCE_ENABLED = 26;
		public static final int FUNDS_MAIL_LIST = 27;
		public static final int ENABLE_SHAKE_AND_SAVE = 28;
		public static final int INT_TRANSFER_FEES_OUR = 29;
		public static final int TRAVEL_NOTIFICATION_PDF_PASSWORD = 30;

		public static final int TRAVEL_NOTIFICATION_CC_MAIL_LIST = 31;
		public static final int REGISTRATION_METHOD = 32;
		public static final int DISABLE_CREDIT_CARD_PAYMENTS = 34;
		public static final int OTP_MINS_3D_SECURE = 35;
		public static final int NUMBER_OF_DAYS_GET_CARD_ONLINE_TRNX = 36;
		public static final int CVV_SECONDS = 37;

		public static final String DATABASE_USER = "IBUSR";
		public static final String MACHINE_NAME = "imalp1";
		public static final String BRANCH_CODE = "998";
		public static final String FROM_BRANCH_CODE = "1";
		public static final String TO_BRANCH_CODE = "999";
		public static final String BRANCH_FINANCE = "989";
		public static final String BRANCH_CODE_FUND = "995";
		public static final String TELLER_ID = "IBUSR";// "00614";
		public static final String CHANNEL_ID = "1";
		public static final String TRANSACTION_ORGIN = "E";
		public static final String AS_OVERRIDE = "N";
		public static final String API_USER_ID = "IBUSR";
		public static final String FLAG = "0";
		public static final String DEPOSITE_ACCOUNTS_FLAG = "D";
		public static final String CREATED_BY = "eBanking";

		public static final int EWATCH_DAYS_OF_ACCOUNT_HISTORY = 38;
		public static final int EWATCH_DAYS_OF_FINANCE_HISTORY = 39;
		public static final int EWATCH_DAYS_OF_CARDS_HISTORY = 40;
		public static final int EWATCH_TOKEN_VALID_MINUTES = 41;

		public static final int ENABLE_CID_CHECKING = 47;
		public static final int PROMOTION_ICON_STYLE = 48;

		public static final int FINGERPRINT_LOGIN_TOKEN_PERIOD_IN_MINS = 46;

		public static final int ITQAN_MAIL_LIST = 49;
		public static final int CARD_PAYMENT_DECIMAL_PLACES = 50;
		public static final int SCHOOL_PAYMENT_ALLOW_MULTIPLE_STUDENTS = 51;
		public static final int IS_ENCRYPTED = 52;
		public static final int PAY_ME_TOKEN_EXPIRY_PERIOD_HOURS = 53;
		public static final int MULTIPLE_PAY_ME_TOKEN_EXPIRY_PERIOD_HOURS = 75;
		public static final int PAY_ME_URL_TYPE = 54;
		public static final int WU_CASH4ME_OTP_SETTINGS = 58;
		public static final int BENF_INQUERY_PER_SESSION = 56;
		public static final int BENF_INQUERY_PER_DAY = 57;
		public static final int NFC_DEBIT_TOKEN_PAYMENT_EXPIRY_MINUTES = 60;
		public static final int NFC_INFOSYS_TOKEN_EXPIRY_IN_MINUTES = 61;
		public static final int NFC_ALLOW_MULTIPLE_DEBIT_CARDS = 62;
		// public static final int CSS_STYLE = 78 ; // Change By Surendra For SSL
		public static final int CALL_CENTER_EMAIL_LIST = 64;

		// DA-632:Customer Email Updating
		public static final int EMAIL_VERIFICATION_TIMEOUT = 65;

		// Enable/Disable flag for removal of SQL Keywords in XSS
		public static final int SQL_KEYWORD_REMOVAL_XSS_FLAG = 67;
		/*
		 * JIRA: RTLCRPMBDV-451 (DA-530 - Intermediate Bank Approval) [Neel 03-11-2016:
		 * Changes made for parameterizing Intermediate Bank Approval with
		 * Enable/Disable Flag]
		 */
		public static final int AUTO_INTERMEDIATE_BANK_APPROVAL = 59;

		/*
		 * JIRA: RTLCRPMBDV-623 (New Murabaha Offers MVP Tasks) [Neel 15-02-2017: All
		 * configuration values for the new Murabaha Deals to be offered on iPhone]
		 * 
		 */
		public static final int MURABAHA_VIDEO_URL_ENGLISH = 63;
		public static final int MURABAHA_VIDEO_URL_ARABIC = 66;

		public static final int MIN_TRANSFER_AMOUNT_REQUIRES_OTP = 68;
		public static final int MIN_TRANSFER_AMOUNT_REQUIRES_APPROVAL = 69;
		public static final int WHATSAPP_OPTION = 70;

		public static final int PINLESS_AMOUNT = 71;
		public static final int CUST_CARE_EMAIL_LIST_FOR_UPDATE = 72;
		public static final int HIJRY_DAYS_ADJUSMENT = 73;
		public static final int SET_PIN_ALLOWD_ATTEMPTS = 74;

		public static final int MURABAHA_BRANCH_APPOINTMENT_CC_LIST = 77;
		// DA1010--SME Clients Restriction to Use Retail IB/MB : Add Exception for some
		// SME customer temporarly
		// public static final String SME_EXCEPTION_LIST =
		// "406106,176922,4300,4301,4302,4303,4304,111567" ;

		public static final int OPEN_ACCOUNT_TERMS_AND_CONDITION = 75;

		// DA1010--SME Clients Restriction to Use Retail IB/MB : Add Exception for some
		// SME customer temporarly
		public static final String SME_EXCEPTION_LIST = "176922";
		// Mobile Login with OTP CR#182
		public static final Integer IS_OTP_LINKING_REQUIRED = 79;

		public static final Integer SOFT_LAUNCH_CIF_LIST = 81;

		public static final Integer APPLICATION_SUPPORT_VERSION = 82;
		public static final Integer LIVE_CHAT_URL = 83;
		public static final Integer GENESYS_LIVE_CHAT_URL = 84;

		public static final Integer MSA3ED_ACCESS_PUBLIC = 85;
		public static final Integer MSA3ED_ACCESS_LINKED_USER = 86;
		public static final Integer ALLOW_HEADER_SIGNATURE_CHECKING = 87;

	}// CONFIG_GLOBAL_SETUP

	public static class APP_UPDATE_ACTIONS {
		private APP_UPDATE_ACTIONS() {
		}

		public static final int NO_ACTION = 0;
		public static final int UPDATE_AVAILABLE = 1;
		public static final int FORCE_UPDATE = 2;
	}

	public static class BO_CORP_CONFIG_GLOBAL_SETUP {
		private BO_CORP_CONFIG_GLOBAL_SETUP() {
		}

		public static final int SHOW_LIMITS_UTILIZATION = 1;
		public static final int SITE_KEY_IMAGES_NO = 2;
		public static final int SHOW_CAPTCHA = 3;
		public static final int PASSWORD_EXPIRATION_PERIOD = 4;
		public static final int SHOW_LIMITS_DETAILS = 5;

		public static final String COMPANY_CODE = "1";
		public static final int OTP_DIGITS = 6;
		public static final int OTP_EXPIRATION_PERIOD = 7;
		public static final int USER_AUTHENTICATION_TYPE = 8;
		public static final int APPS_MAIL_LIST = 9;
		public static final int CASES_MAIL_LIST = 10;
		public static final int OUTLOOK_MAIL_LIST = 12;
		public static final int RESET_SITE_KEY = 11;
		public static final Integer SITE_KEY_QUESTIONS_STYLE = 13;
		public static final Integer IS_OTP_ENABLED = 14;
		public static final Integer CREDITED_ACCOUNT = 15;
		public static final Integer VALIDATE_IBAN = 16;
		public static final Integer MAXIMUM_NUMBER_OF_SALARY = 17;
		public static final Integer MINIMUM_NUMBER_OF_SALARY = 18;
		public static final Integer VALIDATE_CVD = 19;
		public static final int ACCOUNT_TYPE = 20;
		public static final int ALLOW_NEW_SESSION = 21;
		public static final int MURABAHA_RERUEST_EMAIL_GROUP = 27;
		public static final int CORP_ELIGIBLE_RANKING_CODES = 32;
		public static final int CORP_ELIGIBLE_CIF_TYPES = 33;

	}// CONFIG_GLOBAL_SETUP

	public static class CONFIG_GLOBAL_SETUP_DEFAULT_VALUES {
		private CONFIG_GLOBAL_SETUP_DEFAULT_VALUES() {
		}

		public static final boolean SHOW_LIMITS_UTILIZATION = false;
		public static final int SITE_KEY_IMAGES_NO = 5;
		public static final boolean SHOW_CAPTCHA = true;
		public static final int PASSWORD_EXPIRATION_PERIOD = 90;
		public static final boolean SHOW_LIMITS_DETAILS = false;
		public static final int OTP_DIGITS = 5;
		// Ahamed Fozil 13-4-2014 change the unit of OTP Expiration in minutes from
		// hours as per Mr.Hassan Abouzeid's email
		// public static final int OTP_EXPIRATION_PERIOD = 12;
		public static final int OTP_EXPIRATION_PERIOD = 60; // 1 hour in minutes
		public static final int USER_AUTHENTICATION_TYPE = 2;
		public static final String APPS_MAIL_LIST = "";
		public static final String CASES_MAIL_LIST = "";
		public static final String OUTLOOK_MAIL_LIST = "";
		public static final boolean RESET_SITE_KEY = false;
		public static final Integer MULTIPLE_LOGIN_VALIDITY = 10;
		public static final Integer SITE_KEY_QUESTIONS_STYLE = 1;
		public static final boolean IS_OTP_ENABLED = false;
		public static final Integer SITEKEY_QUESTIONS = 5;

		public static final boolean IS_usman_TRANSFER_OTP_ENABLED = false;
		public static final boolean IS_LOCAL_TRANSFER_OTP_ENABLED = false;
		public static final boolean IS_INTERNATIONAL_TRANSFER_OTP_ENABLED = false;
		// Mobile Login with OTP CR#182
		public static final boolean IS_OTP_LINKING_REQUIRED = false;
		public static final boolean IS_WU_TRANSFER_OTP_ENABLED = false;
		public static final boolean IS_UTILITY_PAYMENT_OTP_ENABLED = false;
		public static final int MAX_TO_SAME_CID = 2;
		public static final int MAX_TO_SAME_CID_PER_ALL_CUSTS = 20;
		public static final boolean IS_CHEQUE_ENABLED = true;

		public static final String TRAVEL_NOTIFICATION_MAIL_LIST = "";
		public static final String TRAVEL_NOTIFICATION_END_OF_TRIP_MAIL_LIST = "";
		public static final String PREMIUM_ACCOUNTS_GL_CODE = "";
		public static final boolean IS_CREDIT_CARD_ONLINE_BALANCE_ENABLED = false;
		public static final String FUNDS_MAIL_LIST = "";
		public static final boolean ENABLE_SHAKE_AND_SAVE = false;

		public static final double INT_TRANSFER_FEES_OUR = 5.0;

		public static final String TRAVEL_NOTIFICATION_CC_MAIL_LIST = "";
		public static final String TRAVEL_NOTIFICATION_PDF_VALUE = "1234";
		public static final String REGISTRATION_METHOD = "C";
		public static final boolean CREDIT_CARD_DISABLE_MESSAGE = false;

		public static final String NUMBER_OF_DAYS = "7";

		public static final int OTP_MINS_3D_SECURE = 10; // in minutes
		public static final int CVV_SECONDS = 10; // in seconds

		public static final int EWATCH_TOKEN_VALID_MINUTES = 1440; // in days
		public static final int EWATCH_DAYS_OF_ACCOUNT_HISTORY = 10; // in days
		public static final int EWATCH_DAYS_OF_FINANCE_HISTORY = 10; // in days
		public static final int EWATCH_DAYS_OF_CARDS_HISTORY = 10; // in days
		public static final int FINGERPRINT_LOGIN_TOKEN_PERIOD_IN_MINS = 10000;

		public static final boolean ENABLE_CID_CHECKING = true;

		public static final Integer CUSTOMER_INBOX_STYLE = 1;

		public static final String ITQAN_MAIL_LIST = "";

		public static final int CARD_PAYMENT_DECIMAL_PLACES = 2;

		public static final Integer SCHOOL_PAYMENT_ALLOW_MULTIPLE_PAYMENT = 0;

		public static final boolean IS_ENCRYPTED = false;

		public static final int PAY_ME_TOKEN_EXPIRY_PERIOD_HOURS = 2;

		public static final int MULTIPLE_PAY_ME_TOKEN_EXPIRY_PERIOD_HOURS = 24;

		public static final int PAY_ME_URL_TYPE = 1;
		public static final boolean WU_CASH4ME_OTP_SETTINGS = true;

		public static final int BENF_INQUERY_PER_SESSION = -1;

		public static final int BENF_INQUERY_PER_DAY = -1;

		/*
		 * JIRA: RTLCRPMBDV-451 (DA-530 - Intermediate Bank Approval) [Neel 03-11-2016:
		 * Changes made for parameterizing Intermediate Bank Approval with
		 * Enable/Disable Flag]
		 */
		public static final boolean AUTO_INTERMEDIATE_BANK_APPROVAL = true;

		public static final Integer NFC_DEBIT_TOKEN_PAYMENT_EXPIRY_MINUTES = 10;

		public static final Integer NFC_WALLET_TOKEN_EXPIRY_MINUTES = 10;

		public static final Boolean NFC_ALLOW_MULTIPLE_DEBIT_CARDS = false;

		// public static final Boolean CSS_STYLE = false ;

		public static final String CALL_CENTER_EMAIL_LIST = "";

		/*
		 * JIRA: RTLCRPMBDV-623 (New Murabaha Offers MVP Tasks) [Neel 15-02-2017: All
		 * configuration values for the new Murabaha Deals to be offered on iPhone]
		 * 
		 */
		public static final String MURABAHA_VIDEO_URL_ENGLISH = "https://youtu.be/B1U5IfJ3Zg8";
		public static final String MURABAHA_VIDEO_URL_ARABIC = "https://youtu.be/tBR96G5_CJY";
		public static final String MURABAHA_EXCLUDED_PRODUCT_CLASSES = "2302";

		public static final Double MIN_TRANSFER_AMOUNT_REQUIRES_OTP = 30000.000;
		public static final Double MIN_TRANSFER_AMOUNT_REQUIRES_APPROVAL = 40000.000;
		public static final Double PINLESS_AMOUNT = 10d;

		public static final Boolean SQL_KEYWORD_REMOVAL_XSS_FLAG = false;
		public static final Integer WHATSAPP_OPTION = 1; // 1 = open whatsapp conversation screen with the callcenter
															// number. 2 = open whatsapp conversation screen

		public static final String CUST_CARE_EMAIL_LIST_FOR_UPDATE = "usman-CallCenter-TeamLeaders@bankusman.com";

		public static final int SET_PIN_ALLOWED_ATTEMPTS = 3;

		public static final String OPEN_ACCOUNT_TERMS_AND_CONDITION = "";

		public static final Boolean MURABAHA_BRANCH_APPOINTMENT_CC_LIST = false;// Defaulted to Yousef's ID
		public static final Boolean MSA3ED_ACCESS_PUBLIC = false;
		public static final Boolean MSA3ED_ACCESS_LINKED_USER = false;
		public static final boolean ALLOW_HEADER_SIGNATURE_CHECKING = false;
	} // CONFIG_GLOBAL_SETUP_DEFAULT_VALUES

	public static class BO_CORP_GLOBAL_CONFIG_DEFAULT_VALUES {
		private BO_CORP_GLOBAL_CONFIG_DEFAULT_VALUES() {
		}

		public static final boolean SHOW_LIMITS_UTILIZATION = false;
		public static final int SITE_KEY_IMAGES_NO = 5;
		public static final boolean SHOW_CAPTCHA = true;
		public static final int PASSWORD_EXPIRATION_PERIOD = 90;
		public static final boolean SHOW_LIMITS_DETAILS = false;
		public static final int OTP_DIGITS = 5;
		public static final int OTP_EXPIRATION_PERIOD = 12;
		public static final int USER_AUTHENTICATION_TYPE = 2;
		public static final String APPS_MAIL_LIST = "";
		public static final String CASES_MAIL_LIST = "";
		public static final String OUTLOOK_MAIL_LIST = "";
		public static final boolean RESET_SITE_KEY = false;
		public static final Integer MULTIPLE_LOGIN_VALIDITY = 10;
		public static final Integer SITE_KEY_QUESTIONS_STYLE = 1;
		public static final boolean IS_OTP_ENABLED = true;
		public static final Integer SITEKEY_QUESTIONS = 5;
		public static final Integer CREDITED_ACCOUNT = 0;
		public static final boolean VALIDATE_IBAN = false;
		public static final Integer MAXIMUM_NUMBER_OF_SALARY = 0;
		public static final Integer MINIMUM_NUMBER_OF_SALARY = 0;
		public static final boolean VALIDATE_CVD = false;
		public static final String ACCOUNT_TYPE = "";
		public static final boolean ALLOW_NEW_SESSION = false;
		public static final String CORP_ELIGIBLE_RANKING_CODES = "-1";
		public static final String CORP_ELIGIBLE_CIF_TYPES = "-1";

	}// BO_CORP_GLOBAL_CONFIG_DEFAULT_VALUES

	/**
	 * SMS Subscription params
	 * 
	 * @author ZABIN
	 *
	 */
	public static class SMS_SUBSCRIPTION_PARAMS {
		private SMS_SUBSCRIPTION_PARAMS() {
		}

		public static final String SMS_SUBSCRIPTION_NUMBER = "865";
		public static final String SMS_SERVICE_CODE = "1";
		public static final String SMS_SPECIFIC_TYPE_CUSTOMER = "C";
		public static final String SMS_SPECIFIC_TYPE_ACCOUNTS = "A";
		public static final String SMS_ACTION = "M";
		public static final String SMS_LOW_LIMIT = "1000";
	} // SMS_SUBSCRIPTION_PARAMS

	public static class REGISTRATION_METHODS_TYPES {
		private REGISTRATION_METHODS_TYPES() {
		}

		public static final String ATM_CARD_NO = "C";
		public static final String ACCOUNT_NUMBER = "A";
	}

	/**
	 * user authetication types
	 * 
	 * @author Majdi
	 *
	 */
	public static class USER_AUTHENTICATION_TYPES {
		private USER_AUTHENTICATION_TYPES() {
		}

		public static final int PIN = 0;
		public static final int OTP = 1;
		public static final int BOTH = 2;
	}

	/**
	 * User status lookup
	 * 
	 * @author Emad
	 *
	 */
	public static class USER_STATUS {
		private USER_STATUS() {
		}

		public static final int ACTIVE = 1;
		public static final int LOCKED = 2;
		public static final int INACTIVE_IN_CORE_BANKING = 3;
		public static final int CLOSED = 4;
		public static final int HIDDEN = 5;
	}// USER LOCK

	/**
	 * lock reason look up
	 * 
	 * @author Emad
	 *
	 */
	public static class LOCK_REASON {
		private LOCK_REASON() {
		}

		public static final int USER_IS_ACTIVE = 0;
		public static final int INVALID_SITEKEY_ANSWER = 1;
		public static final int INVALID_LOGIN_PASSWORD = 2;
		public static final int INVALID_TRANSACTION_PASSWORD = 3;
		public static final int FORGOT_PASSWORD = 4;
		public static final int REGISTERED_NOT_AUTHENTICATED = 5;
		public static final int RESET_BOTH = 6;
		public static final int INVALID_OTP = 7;
		public static final int INVALID_SECRET_KEY = 9;
		public static final int INVALID_CIVIL_ID = 10;

		// public static final boolean ALLOW_OTP_UNLOCK = true ;
	}// USER LOCK

	/**
	 * product types
	 * 
	 * @author Majdi
	 *
	 */
	public static class PRODUCT_TYPE {
		private PRODUCT_TYPE() {
		}

		public static final int ACCOUNTS = 1;
		public static final int FUNDS = 2;
		public static final int CARDS = 3;
		public static final int MURABAHA = 4;
	}// USER LOCK

	public static class SCREEN_MODES {
		private SCREEN_MODES() {
		}

		public static final int VIEW = 1;
		public static final int EDIT = 2;
		public static final int APPROVAL = 3;
		public static final int NEW = 4;
	}// DATA_SOURCES

	public static class TRANSFER_TYPES {
		private TRANSFER_TYPES() {
		}

		public static final int TRANSFER_ALL_TRANSFER_ID = 100;
		public static final int TRANSFER_MY_ACCOUNT_ID = 101;
		public static final int TRANSFER_usman_ACCOUNT_ID = 102;
		public static final int TRANSFER_LOCAL_BANK_ID = 103;
		public static final int TRANSFER_INTERNATIONAL_BANK_ID = 104;
		public static final int TRANSFER_CREDIT_CARD_ID = 105;
		public static final int TRANSFER_BILL_PAYMENT_ID = 106;
		public static final int TRANSFER_QBILLSS_PAYMENT_ID = 107;
		public static final int TRANSFER_ISLAMIC_PAYMENT_ID = 108;
		public static final int TRANSFER_BROKERAGE_ID = 110;
		public static final int TRANSFER_CHARITY_PAYMENT_ID = 111;
		public static final int TRANSFER_UTILITY_PAYMENT_ID = 112;
		public static final int SALARY_TRANSFER = 113;
		public static final int CARDLESS_CONFIRMATION_CODE_ID = 114;
		public static final int WU_TRANSFER = 115;
		public static final int WU_REFUND_TRANSFER = 116;
		public static final int CARDLESS_CID_ID = 117;
		public static final int ITUNES_GIFT_CARD_ID = 118;
		public static final int GOOGLE_PLAY_GIFT_CARD_ID = 119;
		public static final int SCHOOL_PAYMENT_TRANSFER_ID = 120;
		public static final int KNET_TOP_UP_MY_ACCOUNT = 121;
		public static final int PAY_ME = 122;
		public static final int ELBOOQ_TO_usman_TRANSFER = 123;
		public static final int ELBOOQ_TO_CARDLESS = 124;
		public static final int ELBOOQ_TOP_UP = 125;
		public static final int WU_CASH4ME_TRANSFER = 131;
		public static final int NINTENDO_PAYMENT = 132;
		public static final int BEIN_SPORT_PAYMENT = 133;
		public static final int XBOX_PAYMENT = 134;
		public static final int PLAYSTATION_PAYMENT = 135;
		public static final int GCC_PAYMENT = 136;
	}

	public static class DATE_FORMAT {
		private DATE_FORMAT() {
		}

		public static final String WS_DATE_FORMAT = "yyyy-MM-dd hh:mm:ss";
		public static final String IMAL_DATE_FORMAT = "dd-MM-yyyy";
		public static final String IB_DATE_FORMAT = "dd/MM/yyyy";
		public static final String IB_DATE_FORMAT_2 = "dd-MM-yyyy";
		public static final String IB_DATE_FORMAT_3 = "dd-MMMMM-yyyy";
		public static final String IB_DATE_TIME_FORMAT = "dd/MM/yyyy hh:mm:ss";
		public static final String IMAL_DATE_FORMAT_MM = "MM-dd-yyyy";
		public static final String IB_DATE_TIME_DASH_FORMAT = "dd-MMM-yyyy hh:mm:ss";
		public static final String IB_DATE_TIME_24_FORMAT = "dd/MM/yyyy HH:mm:ss";
		public static final String WS_DATE_TIME_24_FORMAT = "yyyy-MM-dd HH:mm:ss";
		public static final String WU_DATE_FORMAT_1 = "MMddyyyy";
		public static final String DATE_FORMAT_1 = "yyyy-MM-dd";
		public static final String DATE_FORMAT_2 = "ddMMyyyy";
		public static final String DATE_FORMAT_3 = "dd/MM/yyyy";
		public static final String DATE_FORMAT_4 = "MM/dd/yyyy";
		public static final String WU_EST_DATE_TIME = "yyyy-MM-dd 'T' HH:mm:ss";
		public static final String DATE_TIME_STAMP = "yyyy-MM-dd hh:mm:ss.SSS";
		public static final String DATE_TIME_STAMP24 = "yyyy-MM-dd HH:mm:ss.S";
		public static final String DATE_TIME_STAMPFF24 = "yyyy-mm-dd HH:mm:ss";
		public static final String DATE_MM_YY = "MMyy";
		public static final String DATETIMEPICKER = "yyyy/MM/dd HH:mm";
		public static final String INFOSYS_MONTH_NAME_YEAR = "MMM/yy";
		public static final String IB_REFLECTION_PERIOD_FORMAT_1 = "dd-MMMMM-yyyy hh:mm a";
		public static final String IB_REFLECTION_PERIOD_FORMAT_2 = "MM/dd/yy hh:mm:ss";
		public static final String IB_REFLECTION_PERIOD_FORMAT_3 = "EEEE d MMMMM";// Used only in Arabic locale (Ex:
																					// Tuesday 4 April)
		public static final String IB_REFLECTION_PERIOD_FORMAT_4 = "dd/MM/yyyy hh:mm a"; // Used only for Finance
																							// Digital Murabaha in
																							// appointment phase
		public static final String ECHAT_DATE_FORMAT_1 = "dd-MMMMM-yyyy";
		public static final String ECHAT_DATE_FORMAT_2 = "dd-MMM-yyyy";
		public static final String DATE_MONTH_TIME = "dd-MMMMM @hh:mm a";

	}

	public static class TIME_FORMAT {
		private TIME_FORMAT() {
		}

		public static final String IB_TIME_FORMAT = "hh:mm:ss";
	}

	/**
	 * Constants for Creating Standing Order C = Create A = Ammend S = Stop
	 * 
	 * @author ZABIN
	 *
	 */
	public static class CREATE_SO_OPERATIONS {
		private CREATE_SO_OPERATIONS() {
		}

		public static final String CREATE_OPERATION = "C";
		public static final String AMMEND_OPERATION = "A";
		public static final String STOP_OPERATION = "S";

	}// CREATE_SO_OPERATIONS

	/**
	 * used for OTP status
	 * 
	 * @author afayad
	 *
	 */
	public static class OTP_STATUS {
		private OTP_STATUS() {
		}

		public static final int NO_OTP_EXISTS = 1;
		public static final int EXPIRED_OTP = 2;
		public static final int VALID_OTP = 3;
		public static final int INVALID_OTP = 4;

	}// SERVICE_TYPES

	public static class SECURE_TOKEN_STATUS {
		public static final int NULL_TOKEN = 1;
		public static final int VALID_TOKEN = 2;
		public static final int INVALID_TOKEN = 3;
	}

	/**
	 * Following is to determine how the Transfer SWIFT charges fees will be
	 * collected
	 * 
	 * @author ZABIN
	 *
	 */
	public static class TRANSFER_CHARGES_TYPES {
		private TRANSFER_CHARGES_TYPES() {
		}

		public static final String SHARED_CHARGES = "SHA";
		/** Between usman and Target Bank */
		public static final String OUR_CHARGES = "OUR";
		/** usman will collect the charges */
		public static final String BENEFICARY_CHARGES = "BEN"; /** Beneficary will be charged */
	}// TRANSFER_CHARGES_TYPES

	/**
	 * Determine the recurring interval
	 * 
	 * @author ZABIN
	 */
	public static class RECURRING_INTERVALS {
		private RECURRING_INTERVALS() {
		}

		public static final String DAILY = "D";
		public static final String WEEKLY = "W";
		public static final String MONTHLY = "M";
		public static final String YEARLY = "Y";
	}// RECURRING_INTERVALS

	/**
	 * The APIs' Codes
	 * 
	 * @author ZABIN
	 */
	public static class API_CODES {
		private API_CODES() {
		}

		public static final String CREAETE_STANDING_ORDER_API = "134";
		public static final String CREAETE_NEW_ACCOUNT_API = "134";
		public static final String LINK_DELINK_CARDS = "134";
		public static final String FUNDS_API = "900";

		/*
		 * JIRA: RTLCRPMBDV-623 (New Murabaha Offers MVP Tasks) [Neel 20-02-2017: API
		 * Code for the Murabaha Islamic Loan Calculator]
		 * 
		 */
		public static final String PROCESS_LOAN_CALCULATOR_API = "414";

	}// API_CODES

	/**
	 * Open New Account Constants
	 * 
	 * @author ZABIN
	 */
	public static class NEW_ACCOUNT_CONSTANTS {
		private NEW_ACCOUNT_CONSTANTS() {
		}

		public static final String IS_RENEWABLE_ACCOUNT = "N";
		public static final String IS_PROFIT_ACCOUNT = "0";
		public static final String IS_CUSTOMER_ACCOUNT = "4";
		public static final String IS_STATMENT_MAILD = "Y";
		public static final String EXTERNAL_REFRENCE = "N";
		public static final String OPEN_ACCOUNT_INTERNAL_REFRENCE = "1#2-3@2";
		public static final String ACCOUNT_POSITION = "0";
		public static final String OPEN_ACCOUNT_TRX_TYPE = "103";
		public static final String HOLD_OF_FUND_TRX_TYPE = "110";
		public static final String TELLER_ID = "IBUSR";
		public static final int MIN_AGE_FOR_WOW_ACCOUNT = 18;
		// Ahamed Fozil, 24-10-2013. Excluded Fahad Al Salem, Hateen, Riqqae branches
		// upon Abdulrahman's Email.
		// Remove Heteen - 29; Riqqae-28 from the filter list. Add corp-operation unit
		// -500 to the filter list. CR by Abdulrahman - 19-03-2014
		// Sami Hawari, Date: 08/12/2015, CR#:CR128702, remove branches "34" & "35" from
		// excluded list.
		// Sami Hawari, Date: 17/02/2016, CR#:CR######, remove branche "33" from
		// excluded list.
		private static String EXCLUDED_BRANCHES[] = { "7", // Hawally -Bin Khaldoon
				"8", // SALMIYA- BRANCH
				"11", // FAHAD ALSALEM STREET BRANCH
				"12", // QIBLA BRANCH
				"20", // Jahra2 Ladies
				// "44", // Subah Al-Salem Branch - until it opens on 2018!
				"500", // Corporate Branch
				"501", // AL - AHMADI - CORPRATE
				"502", // KHAITAN - CORPORATE
				"503", // FAHAHEEL - CORPORATE
				"504", // SALMIYA - CORPORATE
				"666", // Business Banking Unit
				"700", // ATM BRANCH
				"701", // FUND BRANCH
				"702", // VIRTUAL BRANCH
				"703", // Compliance Siron
				"704", // Virtual Branch Card Issuance ATM
				"800", // Al Amil Unit
				"801", // CALL CENTER
				"802", // Salary Branch
				"803", // Central Sales
				"804", // GSD
				"807", // Operation & Control
				"900", // PRIVATE BANKING BRANCH
				"988", // Information technology group
				"989", // RETAIL FINANCING
				"990", // Trade financing
				"991", // Main Vault
				"992", // Retail Banking Group
				"993", // Investment Group
				"994", // Finance Group
				"995", // TREASURY
				"996", // Support Function Group
				"997", // Financial Group
				"998", // Operation & General Services
				"999" // Top management Group

		};

		public static String[] getEXCLUDED_BRANCHES() {
			return EXCLUDED_BRANCHES;
		}

		public static final String INCLUDED_BRANCHES[] = {};

	}// NEW_ACCOUNT_CONSTANTS

	/**
	 * Used to update status for beneficiary , agent and operator as per values
	 * found in beneficaries DB
	 *
	 */
	public static class API_BENEFICARY_SERVICES {
		private API_BENEFICARY_SERVICES() {
		}

		public static final String APPROVED = "A";
		public static final String PENDING = "P";
		public static final String NEW = "N";
		public static final String REJECTED = "R";
		public static final String DELETED = "D";
		public static final String AMEND = "M";
		public static final String INTERIM_BANK_REQUIRED = "Y";
		public static final String INTERIM_BANK_NOT_REQUIRED = "N";
		public static final String OPERATOR_APPROVE_ACTION_DESC_IB_REQUIRED = "Requires Operator Approval";
		public static final String OPERATOR_APPROVE_ACTION_DESC_IB_NOT_REQUIRED = "Ready for Transfer";
		public static final String OPERATOR_DELETE_ACTION_DESC_IB_REQUIRED = "Awaiting Interim Info";
		public static final String N_DESC = "Waiting for OTP authentication";
		public static final String A_DESC = "Approved";
		public static final String P_DESC = "Pending";
		public static final String R_DESC = "Rejected";
		public static final String IB_CHANNEL = "IB";
		// CR 419 IFSC Ahamed Fozil 27.9.2012
		public static final String IFSC_REQUIRED = "Y";
		public static final String IFSC_NOT_REQUIRED = "N";

		public static class ACTIONS {
			private ACTIONS() {
			}

			public static final String ACTIVATE = "ACTIVATE";
			public static final String ADD = "ADD";
			public static final String UPDATE = "UPDATE";
			public static final String DELETE = "DELETE";

		}
		// CR 419 IFSC Ahamed Fozil 27.9.2012
	}// RECURRING_INTERVALS

	public static class GLOBAL_MESSAGES_TYPES {
		private GLOBAL_MESSAGES_TYPES() {
		}

		public static final byte PROMOTION = 1;
		public static final byte LOGIN = 2;
		public static final byte HOME_PAGE = 3;
		public static final byte SECURE = 4;
		public static final byte UNSECURE = 5;
	}// RECEIVER_LIST_TYPES

	public static class USERS_TYPES {
		private USERS_TYPES() {
		}

		public static final int EMPLOYEE = 1;
		public static final int RETAIL = 2;
		public static final int ANONYMOUS = 3;
		public static final int CORPORATE = 4;
		public static final int ALL = 5;

		public static class CUSTOMER_TYPES {
			private CUSTOMER_TYPES() {
			}

			public static final Integer CLICK_ACCOUNT_TYPE = 26;
		}
	}

	public static class RESPONSE_TYPES {
		private RESPONSE_TYPES() {
		}

		public static final int INTERESTED = 1;
		public static final int NOT_INTERESTED = 2;
		public static final int REMIND_ME_LATER = 3;
	}

	public static class CACHE {
		private CACHE() {
		}

		public static class CACHE_TTL {
			private CACHE_TTL() {
			}

			// values in seconds
			public static final int NEVER_EXPIRE = -1;
			public static final int HOURLY = 3600;
			public static final int DAILY = HOURLY * 24;
			public static final int WEEKLY = DAILY * 7;
			public static final int MONTHLY = WEEKLY * 4;
			public static final int YEARLY = MONTHLY * 12;
		}

		public static final String ONLINE_MENU_CACHE = "IBMBWeb.ONLINE_MENU_CACHE";
		public static final String NETWORTH_CACHE_NAME = "IBMBWeb.NetWorthCache";
		public static final String GLOBAL_LOOKUP_CACHE_NAME = "IBMBWeb.GlobalConfigLookupData";
		public static final String LOOKUP_BO_TABLE_CACHE_NAME = "IBMBWeb.BO_LookupData";
		public static final String LOOKUP_IBMB_SERVICES_TABLE_CACHE_NAME = "IBMBWeb.IBMB_Services";
		public static final String SP_SERVICE_FIELDS_TABLE = "IBMBWeb.BO_SpServiceFieldsTable";
		public static final String CORP_USERS_ACCESS_TYPES = "IBMBWeb.BO_UsersAccessTypes";
		public static final String CORP_ACCOUNT_TYPES = "IBMBWeb.BO_CorpAccountTypes";
		public static final String LOOKUP_TABLE_CACHE_NAME = "IBMBWeb.LookupData";
		public static final String CLOUD_API_CACHE_NAME = "IBMBWeb.CloudAPIData";
		public static final String LOOKUP_IMAL_COUNTRIES = "IBMBWeb.LookupImalCountries";
		public static final String LOOKUP_IMAL_RATES = "IBMBWeb.LookupImalCountries";
		public static final String NOTIFICATION_INBOX = "IBMBWeb.NotificationCache";
		public static final String KNET_CONFIGURATION = "IBMBWeb.KnetConfiguration";
		public static final String AVAILABLE_ACCOUNTS_TYPES_CACHE_NAME = "IBMBWeb.AvailableAccountsTypesCache";
		public static final String BRANCHES_CACHE_NAME = "IBMBWeb.BranchesCache";
		public static final String ACCOUNTS_CACHE_NAME = "IBMBWeb.Products_AccountsCache";
		public static final String CARDS_CACHE_NAME = "IBMBWeb.Products_CardsCache";
		public static final String FINANCE_CACHE_NAME = "IBMBWeb.Products_FinanceCache";
		public static final String FUND_CACHE_NAME = "IBMBWeb.Products_FundCache";
		public static final String HAS_DATA_FUND_CACHE_NAME = "IBMBWeb.HasDataFundCache";
		public static final String LOGGING_SERVICES = "IBMBWeb.LoggingServices";
		public static final String WEB_SERVICES_CREDENTIAL = "IBMBWeb.WSCredentialsCache";
		public static final String CUST_SEL_SITEKEY_QUESTIONS = "IBMBWeb.CustSelectedSiteKeyQuestions";
		public static final String FUND_BO_LIMIT_CACHE = "IBMBWeb.FundBOLimitCache";
		public static final String SHAKE_BO_LIMIT_CACHE = "IBMBWeb.ShakeBOLimitCache";
		public static final String CORP_REG_MODES_CACHE = "IBMBWeb.CorpRegModesCache";
		public static final String CUST_PRODUCTS_CACHE = "IBMBWeb.CustomerProductsCache";
		public static final String UTILITY_PAYMENT_SERVICES_CACHE = "IBMBWeb.UtilityPaymentServicesCache";
		public static final String NFC_PAYMENT_CACHE = "IBMBWeb.NfcPaymentCache";
		public static final String NFC_CARDS_CACHE = "IBMBWeb.NfcCardsCache";
		public static final String LOCAL_BANKS_CACHE = "IBMBWeb.localBanksCache";
		public static final String GLOBAL_MESSAGES_CACHE = "IBMBWeb.GlobalMessagesCache";
		public static final String CUSTOMER_PRODUCT_PREFERENCES = "IBMBWeb.CustomerProductPreferences";
		public static final String PACI_CONFIGURATION = "IBMBWeb.PACIConfigurationCache";
		public static final String CREDIT_CARD_ELIGIBILITY_MARTIX = "IBMBWeb.CreditCardEligibilityMatrix";
		public static final String IMAL_CREDIT_CARD_TYPES = "IBMBWeb.ImalCreditCardTypesLookup";
		public static final String CREDIT_CARD_REQUEST_STATUS = "IBMBWeb.CreditCardRequestStatus";
		public static final String MOBILE_DEMO_DATA_CACHE = "IBMBWeb.MobileDemoData";
		public static final String ORGANIZATION_LIST_DATA = "IBMBWeb.OrganizationListData";

		public static final String usman_SELECT_CACHE_POINTS_DETAILS = "IBMBWeb.usmanSelectPointsDetails";
		public static final String usman_SELECT_CACHE_CUSTOMER_ACCOUNTS = "IBMBWeb.usmanSelectCustomerAccounts";
		public static final String usman_SELECT_CACHE_REWARD_SUMMARY = "IBMBWeb.usmanSelectRewardSummary";

		public static final String BANK_OBJECTS_CACHE = "IBMBWeb.bankObjectsCache";

		public static final String CUSTOMER_PRODUCTS = "IBMBWeb.CustomerProducts";
		/*
		 * JIRA: RTLCRPMBDV-623 (New Murabaha Offers MVP) [Neel 19-02-2017: cache the
		 * holiday list retrieved from iMAL]
		 */
		public static final String LOOKUP_IMAL_HOLIDAYS = "IBMBWeb.LookupImalHolidays";
		public static final String MURABAHA_DEAL_ELIGIBILITY = "IBMBWeb.MurabahaDealEligibility";
		public static final String MURABAHA_DEAL_ELIGIBILITY_RESULT = "IBMBWeb.MurabahaDealEligibilityResults";
		public static final String RUNTIME_ENVIRONMENT_CONFIGURATION_CACHE = "IBMBWeb.RuntimeEnvConfigCache";
		public static final String SOAP_AUDITING_CACHE = "IBMBWeb.SoapAuditingCache";

		/*
		 * JIRA: RTLCRPMBDV-1049 (New Cache design for improvement) [Neel 24-07-2017:
		 * cache name for the products list with their associated updates timestamp as
		 * retrieved from IMAL]
		 */
		public static final String PRODUCTS_IMAL_UPDATE_CACHE = "IBMBWeb.ProductsIMALUpdateTimestampCache";
		// public static final String PRODUCTS_IMAL_UPDATE_CACHE =
		// "IBMBWeb.ProductsIMALUpdateTimestampCache";
		// The below holds the information of each product per cif and their last
		// updated cached timestamp
		public static final String PRODUCTS_WEB_UPDATE_CACHE = "IBMBWeb.ProductsWebUpdateTimestampCache";
		// The below holds the brokerage list per CIF. Is newly being added. Earlier the
		// brokerage info was stored as a part of products cache
		public static final String BROKERAGE_LIST = "IBMBWeb.BrokerageListCache";
		public static final String CIF_DETAILS_CACHE = "IBMBWeb.CIFDetailsCache";
		public static final String CIF_PROFILE_DETAILS_CACHE = "IBMBWeb.CIFProfileDetailsCache";
		public static final String BENEFICIARY_usman_CACHE = "IBMBWeb.BeneficiaryusmanCache";
		public static final String BENEFICIARY_LOCAL_CACHE = "IBMBWeb.BeneficiaryLocalCache";
		public static final String BENEFICIARY_INTERNATIONAL_CACHE = "IBMBWeb.BeneficiaryInternationalCache";
		public static final String BENEFICIARY_WU_CACHE = "IBMBWeb.BeneficiaryWUCache";

		/*
		 * JIRA: RTLCRPMBDV-1047 (Store all sensitive info in DB in encypted form) [Neel
		 * 31-07-2017: Cache that holds all the security configuration values]
		 */
		public static final String SECURITY_CONFIGURATION_CACHE = "IBMBWeb.SecurityConfigurationValues";

		/*
		 * JIRA: BK-8 (Store all chat menu items) [Neel 15-01-2018: Cache that holds all
		 * the chat main menu items]
		 */
		public static final String ECHAT_MENU_ITEMS = "IBMBWeb.EChatMenuItems";
		public static final String ECHAT_SERVICES_LOOKUP_CACHE = "IBMBWeb.EChatServicesLookupCache";
		public static final String ECHAT_SERVICE_QUESTIONS_CACHE = "IBMBWeb.EChatServiceQuestionsCache";
		public static final String ECHAT_ALL_QUESTIONS_LOOKUP = "IBMBWeb.EChatQuestionsLookupCache";

		public static final String ECHAT_SERVICES_PATTERNS = "IBMBWeb.EChatServicesPatterns";
		public static final String ECHAT_BAGS_WORDS = "IBMBWeb.EChatBagsWords";
		public static final String ECHAT_ENTITY_EXPS = "IBMBWeb.EChatEntityExps";

		public static final String ECHAT_REG_EXP_CACHEE = "IBMBWeb.EChatRegExpLookupCache";

		public static final String ECHAT_SERVICES_QUESTIONS_CACHE = "IBMBWeb.EChatServicesQuestionsCache";

		public static final String ECHAT_EXTRACTOR_CONFIG_ITEMS = "IBMBWeb.EChatDataRepositoryItems";

		public static final String ECHAT_QUESTION_RESPONSE_REPO_CACHE = "IBMBWeb.EChatResponseCache";
		public static final String ECHAT_READ_SOURCE_INDICATOR = "IBMBWeb.EChatReadSourceIndicatorCache";

		// FixedDeposit
		public static final String ACCOUNT_TYPES_CACHE_NAME = "IBMBWeb.Products_All_Account_Types_Cache";
		public static final String PRODUCTS_LOOKUP_CACHE_NAME = "IBMBWeb.Lookup_Products_Cache";
		public static final String ONLY_ACCOUNTS_CACHE_NAME = "IBMBWeb.Products_OnlyAccountsCache";

		// Visible Services Cache that will be used to cache the services per cif
		public static final String VISIBLE_SERVICES_CACHE = "IBMBWeb.VisibleServicesCache";
		public static final String VISIBLE_SERVICES_DTO_CACHE = "IBMBWeb.VisibleServicesDTOsCache";

		// THis will hold the pdf content of the last generated pdf from user. This
		// could be statement or transaction
		public static final String ECHAT_USERS_PDF_CACHE = "IBMBWeb.EChatGeneratedPDF";
		public static final String BANKS_IN_COUNTRY = "IBMBWeb.BANKS_IN_COUNTRY";

		public static final String IS_usman_SELECT_CUSTOMER_CACHE = "IBMBWeb.isusmanSelectCustomer";
		public static final String usman_SELECT_REWARDS_CACHE = "IBMBWeb.usmanSelectRewards";
		public static final String usman_SELECT_REWARDS_PACKAGES_CACHE = "IBMBWeb.usmanSelectPackages";
		public static final String ACCOUNT_GLOBAL_CONFIG = "IBMBWeb.AccounGlobalConfig";

	}

	public static class CACHE_ITEMS {
		private CACHE_ITEMS() {
		}

		public static final String RESTRICTED_ADMIN_CONSUMER_BK = "RESTRICTED_ADMIN_CONSUMER_BK";
		public static final String ADMIN_CONSUMER_BK = "ADMIN_CONSUMER_BK";
		public static final String LOOKUP_TABLE_GLOBAL_CONFIG = "retailGlobalConfig";
		public static final String LOOKUP_TABLE_GLOBAL_CONFIG_FILTERED = "mobileGlobalConfigFiltered";
		public static final String LOOKUP_TABLE_CORP_GLOBAL_CONFIG = "corporateGlobalConfig";

		public static final String CURRENCIES_TABLE = "LookupDataCurrencyTable";
		public static final String COUNTRIES_TABLE = "LookupDataCountryTable";
		public static final String IMAL_COUNTRIES_TABLE = "ImalCountryTable";
		public static final String IMAL_EXCHANGE_RATE_TABLE = "ImalExchangeRatesTable";
		public static final String BANK_GL_ACCUONT_TABLE = "LookupDataBankGLAccountsTable";
		public static final String CUSTOMER_PREFERENCES = "CustomerPreferences";
		public static final String V_FK_CONSTRAINTS = "ViewFKConstraints";
		public static final String LOOKUP_BRANCHES_LOCATIONS_ITEMS = "LookupBranchesLocationsItems";
		public static final String LOOKUP_BANK_OBJECTS_ITEMS = "LookupBankObjectsItems";
		public static final String LOOKUP_PRAYER_TIMES_ITEMS = "LookupPrayerTimesItems";
		public static final String LOOKUP_ATM_LOCATIONS_ITEMS = "LookupAtmLocationsItems";
		public static final String CARDS_TYPES_TABLE = "LookupDataCardsTable";
		public static final String IMAL_DEBIT_CREDIT_CARDS_TYPES = "LookupImalDebitCreditCardTypes";
		public static final String FUND_BO_LIMIT_ITEMS = "FundBOLimitItems";
		public static final String SHAKE_BO_LIMIT_ITEMS = "ShakeBOLimitItems";
		public static final String GLOBAL_MESSAGES_CACHE_ITEMS = "globalMessagesCacheItems";
		public static final String GLOBAL_MESSAGES_CACHE = "globalMessagesCache";
		public static final String PACI_CONFIG_ITEMS = "paciConfigItems";
		public static final String IMAL_CREDIT_CARDS_TYPES_ITEMS = "ImalCreditCardTypesLookupItems";
		public static final String PRODUCTS_FIXED_DEPOSITES_CACHE_ITEM = "productsFixedDepositsCache";
		public static final String ORGANIZATION_SALARY = "LookupCustOrgSalariesTable";
		public static final String WEATHER_CACHE_KEY = "weather";

		public static final String ALL_COUNTRIES_TABLE = "LookupDataALLCountryTable";
		public static final String GLOBAL_PAYEES = "lookupGlobalPayees";
		public static final String ALL_NATIONALITIES_TABLE = "LookupDataALLNationalityTable";

		/*
		 * Products Cache Items
		 */
		public static final String PRODUCTS_TREES = "productsTreeItemsCache";
		public static final String PRODUCTS_TREE_NODES = "productsTreeNodeCache";
		public static final String PRODUCTS_FORMS_TEMPLATES = "productsFormTemplateCache";

		public static final String WESTERN_UNION_COUNTRIES = "westernUnionCountriesCache";

		/*
		 * JIRA: RTLCRPMBDV-623 (New Murabaha Offers MVP) [Neel 19-02-2017: Get the
		 * Murabaha yield calculation from the DB setup]
		 */
		public static final String MURABAHA_YIELDS_ITEMS = "MurabahaYieldsConfigurationCache";

		public static final String MURABAHA_REBATES_ITEMS = "MurabahaRebatesConfigurationCache";
		public static final String IMAL_HOLIDAYS_ITEMS = "iMALHolidaysCache";

		public static final String DOMAIN_SPECIFIC_VARIABLES_ITEMS = "DomainSpecificVariablesItems";
		public static final String SOAP_AUDITING_ITEMS = "soapAuditingItems";

		public static final String SECURITY_CONFIGURATION_ITEMS = "securityConfigItems";
		public static final String LOOKUP_TRANSFER_PURPOSES_ITEMS = "LookupTransferPurposeItems";
		public static final String LOOKUP_MARITAL_STATUS_ITEMS = "LookupMaritalStatusItems";
		public static final String LOOKUP_EDUCATION_ITEMS = "LookupEducationLookupItems";
		public static final String LOOKUP_LANGUAGE_ITEMS = "LookupCommunicationLangItems";
		public static final String LOOKUP_AREA_ITEMS = "LookupAddressAreaItems";
		public static final String LOOKUP_CREDIT_CARD_REQUEST_STATUS_ITEMS = "LookupCreditCArdREquestStatusItems";

		public static final String ECACHE_MENU_ITEMS = "MenuItems";
		public static final String ECACHE_SERVICES_LOOKUP_ITEMS = "eChatServicseLookupItems";
		public static final String ECACHE_SERVICE_QUESTIONS_ITEMS = "ServiceQuestionsItems";
		public static final String ECACHE_ALL_QUESTIONS_LOOKUP_ITEMS = "QuestionsLookupItems";
		public static final String ECHAT_SERVICES_PATTERNS_TYPE_1_ITEMS = "IBMBWeb.EChatServicesPatternsItems";
		public static final String ECHAT_SERVICES_PATTERNS_TYPE_2_ITEMS = "IBMBWeb.EChatServicesPatternsItemsType2";
		public static final String ECHAT_BAGS_WORDS_ITEMS = "IBMBWeb.EChatBagsWordsItems";
		public static final String ECHAT_REG_EXP_CACHE_ITEMS = "IBMBWeb.EchatRegExpListLookupItems";
		public static final String ECHAT_ENTITY_EXPS_ITEMS = "IBMBWeb.EChatEntityExpsItems";
		public static final String ECHAT_SERVICES_QUESTIONS_CACHE_ITEMS = "IBMBWeb.EChatServicesQuestionsCacheItems";
		public static final String ECHAT_KNOWLEDGE_REPO_ITEMS = "IBMBWeb.EChatKnowledgeRepoItems";
		public static final String ECHAT_EMOJI_ITEMS = "IBMBWeb.EChatEmojiItems";
		public static final String ECHAT_READ_SOURCE_INDICATOR_ITEMS = "IBMBWeb.EChatReadSourceIndicatorCacheItems";
	}

	public static class WLP_BOOKS {
		private WLP_BOOKS() {
		}

		public static final String ADMIN_CONSUMER_BK = "adminConsumersBk";
	}

	public static class IMAL_SMS_LANG {
		private IMAL_SMS_LANG() {
		}

		public static final String DEFAULT = "E";
		public static final String ENGLISH = "E";
		public static final String ARABIC = "A";

	}

	public static class IMAL_CUST_PREFERED_LANG {
		private IMAL_CUST_PREFERED_LANG() {
		}

		public static final String DEFAULT = "L";
		public static final String ENGLISH = "L";
		public static final String ARABIC = "A";
		public static final String BOTH_LANGS = "B";
		public static final String ENGLISH_E = "E";

	}

	public static class IMAL_ACCOUNTS_TYPES_CODES {
		private IMAL_ACCOUNTS_TYPES_CODES() {
		}

		public static final String CURRENT = "210101";

	}

	/**
	 * Determine the STANDING_ORDERS_HEADER_STATUS
	 * 
	 * @author ZABIN
	 */
	public static class STANDING_ORDERS_HEADER_STATUS {
		private STANDING_ORDERS_HEADER_STATUS() {
		}

		public static final String ACTIVE = "T";
	}// STANDING_ORDERS_HEADER_STATUS

	public static class SYSTEM_PROPERTIES {
		private SYSTEM_PROPERTIES() {
		}

		public static final String LOCAL_HOST_NAME = "LOCAL_HOST_NAME";
		public static final String LOCAL_HOST_PORT = "LOCAL_HOST_PORT";
	}// SYSTEM_PROPERTIES

	// This represents the Trx Types defined in iMAL for IB
	public static class SO_IB_TRANSACTION_TYPES {
		private SO_IB_TRANSACTION_TYPES() {
		}

		public static final String TRANSFER_usman_ACCOUNT_ID = "120";
		public static final String TRANSFER_MY_ACCOUNT_ID = "121";
		public static final String TRANSFER_LOCAL_BANK_ID = "122";
		public static final String TRANSFER_INTERNATIONAL_BANK_ID = "123";
		public static final String TRANSFER_CHARITY_PAYMENT_ID = "124";
		public static final String TRANSFER_BILL_PAYMENT_ID = "125";
	}// SO_TRANSFER_TYPES

	// This represents the Trx Types defined in iMAL for IB
	public static class SO_BRANCH_TRANSFER_TYPES {
		private SO_BRANCH_TRANSFER_TYPES() {
		}

		public static final String usman_SO = "220";
		public static final String LOCAL_SO = "221";
		public static final String usman_COMMERCIAL = "222";
		public static final String CHARITY = "223";
		public static final String usman_MIN_MAX = "224";
		public static final String usman_MINISTRIES = "225";
		public static final String usman_COVERING = "230";

	}// SO_TRANSFER_TYPES

	public static class RECURRING_DEFAULT_PARAMETERS {
		private RECURRING_DEFAULT_PARAMETERS() {
		}

		public static final String PERPETUAL_DATE = "31/12/2090";
		public static final int PERPETUAL_YEAR = 2090;

	}// RECURRING_DEFAULT_PARAMETERS

	public static class IMAL_SO_COUNTRIES {
		private IMAL_SO_COUNTRIES() {
		}

		public static final Integer KUWAIT = 1;
		public static final Integer NO_NATIONALITY = 241;
	}// IMAL_SO_COUNTRIES

	public static class IMAL_SO_CITIES {
		private IMAL_SO_CITIES() {
		}

		public static final Integer KUWAIT = 1;
	}// IMAL_SO_CITIES

	public static class CORRESPONDENT_BANKS {
		private CORRESPONDENT_BANKS() {
		}

		public static final String CENTRAL_BANK_OF_KUWAIT_CODE = "90026";
		public static final String CENTRAL_BANK_OF_KUWAIT_ACCOUNT = "0090026001";
	}// CORROSPONDENT_BANKS

	public static class SECURITY {
		private SECURITY() {
		}

		// public static final String KEY_IPHONE_ENCRYPTED =
		// usmanRuntimeEnvironment.getSecurityConfigValue(SECURITY_CONFIGURATION_KEYS.KEY_IPHONE_ENCRYPTED_VAL,
		// false);
		// public static final String KEY_ANDROID_ENCRYPTED =
		// usmanRuntimeEnvironment.getSecurityConfigValue(SECURITY_CONFIGURATION_KEYS.KEY_ANDROID_ENCRYPTED_VAL,
		// false);

		// public static final String
		// SUPER_AES_IPHONE_REQUEST_RESPONSE_PAYLOAD_ENCRYPTION_KEY =
		// usmanRuntimeEnvironment.getSecurityConfigValue(SECURITY_CONFIGURATION_KEYS.SUPER_AES_IPHONE_REQUEST_RESPONSE_PAYLOAD_ENCRYPTION_KEY_VAL,
		// true);
		// public static final String
		// SUPER_AES_ANDROID_REQUEST_RESPONSE_PAYLOAD_ENCRYPTION_KEY_OLD =
		// usmanRuntimeEnvironment.getSecurityConfigValue(SECURITY_CONFIGURATION_KEYS.SUPER_AES_ANDROID_REQUEST_RESPONSE_PAYLOAD_ENCRYPTION_KEY_OLD_VAL,
		// true);;
		// public static final String
		// SUPER_AES_ANDROID_REQUEST_RESPONSE_PAYLOAD_ENCRYPTION_KEY =
		// usmanRuntimeEnvironment.getSecurityConfigValue(SECURITY_CONFIGURATION_KEYS.SUPER_AES_ANDROID_REQUEST_RESPONSE_PAYLOAD_ENCRYPTION_KEY_VAL,
		// true);;
		// public static final String PAYLOAD_HASH_KEY =
		// usmanRuntimeEnvironment.getSecurityConfigValue(SECURITY_CONFIGURATION_KEYS.PAYLOAD_HASHING_KEY,
		// true);

		// public static final String INFOSYS_ENCRYPTION_KEY =
		// usmanRuntimeEnvironment.getSecurityConfigValue(SECURITY_CONFIGURATION_KEYS.INFOSYS_ENCRYPTION_KEY_VAL,
		// true);//"EWI3#kr#./9D*a+E"

		// min version number that will be applied to new security rule
		public static final String IPHONE_MOBILE_VERSION_NO = "3.4.0";
		public static final String ANDROID_MOBILE_VERSION_NO = "3.6.0";

		public static class OLD_VALUES {
			public static final String KEY_ENCRYPTED = SECURITY_CONFIGURATION_KEYS.KEY_ENCRYPTED_VAL.toString();
			// public static final String KEY_ENCRYPTED =
			// usmanRuntimeEnvironment.getSecurityConfigValue(SECURITY_CONFIGURATION_KEYS.KEY_ENCRYPTED_VAL,
			// false);
		}

		// public static final String SUPER_AES_KEY_IPHONE =
		// usmanRuntimeEnvironment.getSecurityConfigValue(SECURITY_CONFIGURATION_KEYS.SUPER_AES_KEY_IPHONE_VAL,
		// true);
		// public static final String SUPER_AES_KEY_ANDROID =
		// usmanRuntimeEnvironment.getSecurityConfigValue(SECURITY_CONFIGURATION_KEYS.SUPER_AES_KEY_ANDROID_VAL,
		// true);
		// public static final String SUPER_AES_KEY_ANDROID_OLD =
		// usmanRuntimeEnvironment.getSecurityConfigValue(SECURITY_CONFIGURATION_KEYS.SUPER_AES_KEY_ANDROID_OLD_VAL,
		// true);
		// public static final String CARD_PIN_ENCRYPTION_KEY =
		// usmanRuntimeEnvironment.getSecurityConfigValue(SECURITY_CONFIGURATION_KEYS.CARD_PIN_ENCRYPTION_KEY,
		// true);

		public static class ANDROID {
			public static final String JSON_USER = "s00nthING5WIIBEok";
			public static final String JSON_D = "tr33R_Vb@o7PLn1!dNMplT&ttQ";
		}

		public static class IOS {
			private IOS() {
			}

			public static final String JSON_USER = "ih0PER2ISGoodrelE@SE";
			public static final String JSON_D = "bv_E!2asC-4RlmNZPLZZi4_i@er";

		}

	}// SECURITY

	public static class CREDENTIALS_VAULTS {
		private CREDENTIALS_VAULTS() {
		}

		public static final String RESTAPIS = "RESTAPIS";
		public static final String WEB_SERVICES = "WebServices";

	}// SECURITY
		// For negative error codes use '_'; otherwise no character is added

	public enum UTILITY_PAYMENT_WS_ERRORS {
		ERR_2("invalid_zain_mobile_no"), ERR_3("invalid_viva_mobile_no"), ERR_4("invalid_mobile_no"),
		ERR_5("mobileno_serviceno_not_identical"), ERR_6("required_service_not_available"),
		// ERR_10(BundleConstants.ERROR_SORRY_FOR_INCONVENIOUS),
		// ERR_20(BundleConstants.ERROR_SORRY_FOR_INCONVENIOUS),
		ERR_30("utility_wrong_information");
		// ERR_40(BundleConstants.ERROR_SORRY_FOR_INCONVENIOUS),
		// ERR_50(BundleConstants.ERROR_SORRY_FOR_INCONVENIOUS),
		// ERR_60(BundleConstants.ERROR_SORRY_FOR_INCONVENIOUS),
		// ERR_99(BundleConstants.ERROR_SORRY_FOR_INCONVENIOUS);

		UTILITY_PAYMENT_WS_ERRORS(String bundleKey) {
			this.bundleKey = bundleKey;
		}

		private String bundleKey;

		public String getBundleKey() {
			return bundleKey;
		}

	}

	public enum BENEFICIARY_TYPES {
		BBYN("BBYN"), LOCAL("LOCAL"), INT("INT"), WU("WU");
		BENEFICIARY_TYPES(String id) {
			this.id = id;
		}

		private static final Map<String, BENEFICIARY_TYPES> lookup = new HashMap<String, BENEFICIARY_TYPES>();
		static {
			for (BENEFICIARY_TYPES s : EnumSet.allOf(BENEFICIARY_TYPES.class))
				lookup.put(s.getId(), s);
		}

		public static BENEFICIARY_TYPES get(String code) {
			return lookup.get(code);
		}

		private String id;

		public String getId() {
			return this.id;
		}

	}

	public static class USER_ACCESS_TYPES {
		private USER_ACCESS_TYPES() {
		}

		public static final int NORMAL = 1;
		public static final int SUPER_ADMIN = 2;
		public static final int SUPER_APPROVER = 3;
	}// SITEKEY_FLAGS

	public static class EMPLOYEE_CUSTS_ACCESS_TYPES {
		private EMPLOYEE_CUSTS_ACCESS_TYPES() {
		}

		public static final String APP_ANY = "APP_ANY";
		public static final String APP_CORPORATE = "APP_CORPORATE";
		public static final String APP_RETAIL = "APP_RETAIL";
		public static final String BO_ADMIN = "BO_ADMIN";
	}// SITEKEY_FLAGS

	public static class ORACLE_SCHEMAS {
		private ORACLE_SCHEMAS() {
		}

		public static final String BBYNIB = "BBYNIB.";
		public static final String BBYNCORPORATE = "BBYNCORPORATE.";
	}

	public static class CROSS_SITE_SCRIPTING_KEY {
		private CROSS_SITE_SCRIPTING_KEY() {
		}

		public static final String IGNOREDMSGKEY = "igcss_";
		public static final String KEEP_AS_IS = "keepAsIs_";

	}

	/**
	 * CR-1862013: Display the correct logo based on Master/Visa
	 **/

	public static class CARD_TYPES {
		private CARD_TYPES() {
		}

		public static final String CREDITCARD = "C";
		public static final String DEBITCARD = "D";
		public static final String ALLCARDS = "ALL";

	}

	public static class CARDS_GROUPS {
		private CARDS_GROUPS() {
		}

		public static final String DEBIT = "D";
		public static final String VIRTUAL = "V";
		public static final String PREPAID = "P";
		public static final String CREDIT = "C";
	}

	public static class CARD_STATUS {
		private CARD_STATUS() {
		}

		public static final String DEBIT_ACTIVE = "A";
		public static final String CREDIT_ACTIVE = "Z";
		public static final String CONVERSION_FRAUD = "B";
	}

	public static class CREDIT_CARD_BRANDS {
		private CREDIT_CARD_BRANDS() {
		}

		public static final String MASTERCARD = "M";
		public static final String VISACARD = "V";

	}

	public static class CREDIT_CARD_TYPES {
		private CREDIT_CARD_TYPES() {
		}

		public static final Integer CHARGE = 1;
		public static final Integer REVOLVING = 2;

	}

	public static class CREDIT_CARD_REQUEST_SETTING {
		private CREDIT_CARD_REQUEST_SETTING() {
		}

		public static final Integer INTERVAL_LIMIT = 100;
	}

	public static class CREDIT_CARD_TRANS_STATUS {
		private CREDIT_CARD_TRANS_STATUS() {
		}

		public static final String HOLD_TRANS = "H";
	}

	public static class CREDIT_CARD_TRANS_HISTORY_TYPES {
		private CREDIT_CARD_TRANS_HISTORY_TYPES() {
		}

		public static final Integer ALL = -1;
		public static final Integer CREDIT = 1;
		public static final Integer DEBIT = 2;
		public static final Integer PURCHASE = 3;
		public static final Integer PAYMENT = 4;
		public static final Integer CASH_BACK = 5;

	}

	public static class ACCOUNTS_TRANS_HISTORY_TYPES {
		private ACCOUNTS_TRANS_HISTORY_TYPES() {
		}

		public static final Integer ALL = -1;
		public static final Integer CREDIT = 1;
		public static final Integer DEBIT = 2;
		public static final Integer CHEQUE = 3;
		public static final Integer CASH_BACK = 4;

	}

	public static class FUND_TRANS_HISTORY_TYPES {
		private FUND_TRANS_HISTORY_TYPES() {
		}

		public static class FUND_ECORE_TRANS_TYPES {
			private FUND_ECORE_TRANS_TYPES() {
			}

			public static final Integer ALL = -1;
			public static final Integer SUBSCRIPTION = 1;
			public static final Integer REDEMPTION = 2;
		}

		public static class FUND_IMAL_TRX_TYPES {
			private FUND_IMAL_TRX_TYPES() {
			}

			public static final String SUBSCRIPTION = "subscription";
			public static final String REDEMPTION = "redemption";
		}

		public static String getImalTransHistory(Integer transHistoryType) {
			if (transHistoryType != null && transHistoryType.equals(FUND_ECORE_TRANS_TYPES.SUBSCRIPTION))
				return FUND_IMAL_TRX_TYPES.SUBSCRIPTION;
			else
				return FUND_IMAL_TRX_TYPES.REDEMPTION;
		}

	}

	/**
	 * minimum user age for registration
	 */

	public static class USER_INFO {
		private USER_INFO() {
		}

		public static final Integer MIN_USER_AGE = 18;
		public static final String DEFAULT_ACCOUNT_MANAGER_EMP_ID = "0";
	}

	/**
	 * minimum user age for registration
	 */

	public static class SENT_SMS_REASONS {
		private SENT_SMS_REASONS() {
		}

		public static final String IB_MB_OTP = "IB-MB-OTP";
	}// SENT_SMS_REASONS

	/**
	 * western unions transaction status PAID = Pickup Completed ie., NO REFUND
	 * Possible ON HOLD = Transaction is on hold by CSC, waiting for Authorization,
	 * Overlimit Queue, Background Check or preset delay NOT AVAILABLE = Status Not
	 * Available OR Recording Agent Unknown or Inquiring Agent Unknown AVAILABLE =
	 * Transaction is in Will Call Status. This is Refundable PAID_OTHER = Payment
	 * is made through other channels such as Quack Pay, D2B etc. QUEUED = The
	 * transaction is put in one of the queues such as overlimit queue, fraud
	 * queue,security queue etc. CANCELLED = Transaction has been cancelled
	 * SUSPENDED = Transaction has been suspended UNKNOWN = Status of the MTCN is
	 * not known. Call CSC for details PURGED = MTCN removed COMPLETEDSMS
	 * transaction is just save on db and no idea if it paid or not
	 */
	public static class WU_TRANSACTION_STATUS {
		private WU_TRANSACTION_STATUS() {
		}

		public static final String PAID = "PAID";
		public static final String AVAILABLE = "AVAILABLE";
		public static final String COMPLETEDSMS = "COMPLETED SENT";
		public static final String COMPLETED_REFUND = "COMPLETED REFUND";
		public static final String REFUND_COMPLETED = "REFUND_COMPLETED";
		public static final String PAID_OTHER = "PAID_OTHER";
		public static final String SUSPENDED = "SUSPENDED";

		public static class WU_TRANSACTION_STATUS_CODES {
			private WU_TRANSACTION_STATUS_CODES() {
			}

			public static final String UNKNOWN = "-1";
			public static final String PAID = "1";
			public static final String AVAILABLE = "2";
			public static final String COMPLETEDSMS = "3";
			public static final String COMPLETED_REFUND = "4";
			public static final String PAID_OTHER = "5";
			public static final String SUSPENDED = "6";

		}

		public static class WU_HISTORY_ICON_CODES {
			private WU_HISTORY_ICON_CODES() {
			}

			public static final int COMPLETED_ICON = 1;
			public static final int PENDING_ICON = 2;
			public static final int SUSPENDED_ICON = 3;
		}

		public static class WU_TRANSACTION_STATUS_NAMES_BUNDLES {
			private WU_TRANSACTION_STATUS_NAMES_BUNDLES() {
			}

			public static final String DEFAULT = "wu_status_name_paid";
			public static final String PAID = "wu_status_name_paid";
			public static final String AVAILABLE = "wu_status_name_pending";
			public static final String SUSPENDED = "wu_status_name_suspended";
			public static final String REFUND_COMPLETED = "wu_status_name_refund_completed";

		}

	}// WU_TRANSACTION_STATUS

	/**
	 * Presentation logo
	 * 
	 */

	public enum WESTERN_UNION_TRANS_STATUS_DESC {

		PAID("wu_trans_status_description_paid"), ONHOLD("wu_trans_status_description_onhold"),
		ON_HOLD("wu_trans_status_description_onhold"), NOTAVAILABLE("wu_trans_status_description_notavailable"),
		NOT_AVAILABLE("wu_trans_status_description_notavailable"), AVAILABLE("wu_trans_status_description_available"),
		PAID_OTHER("wu_trans_status_description_paidother"), QUEUED("wu_trans_status_description_queued"),
		SUSPENDED("wu_trans_status_description_suspended"), UNKNOWN("wu_trans_status_description_unknown"),
		PURGED("wu_trans_status_description_purged"), COMPLETEDSENT("wu_trans_status_description_com_sent"),
		SENT_COMPLETED("wu_trans_status_description_com_sent"),
		REFUND_COMPLETED("wu_trans_status_description_com_refund"),
		COMPLETEDREFUND("wu_trans_status_description_com_refund");

		WESTERN_UNION_TRANS_STATUS_DESC(String bundleKey) {
			this.bundleKey = bundleKey;
		}

		private String bundleKey;

		public String getBundleKey() {
			return bundleKey;
		}

	}

	public static class WU_TRANSACTION_CONSTANTS {
		private WU_TRANSACTION_CONSTANTS() {
		}

		public static final String CASH4ME = "CASH4ME";
		public static final String CASH4ME_BENEFICIARY = "-1";
		public static final String SENDER_COUNTRY_CODE = "KW";
		public static final String SENDER_CITY = "Kuwait City";
		public static final String SENDER_STATE = "Al Asimah";
		public static final String CARD_LOOKUP_SEARCH_TYPE_SENDER = "M";
		public static final String CARD_LOOKUP_SEARCH_TYPE_RECEIVER = "S";
		public static final String SEND_MONEY_SESSION_PREFIX = "WUTrans_";
		public static final String REFUND_SESSION_PREFIX = "WURefTrans_";
		public static final int INDEX_TRANS_TYPE = 0;
		public static final int INDEX_CURRENCY_ISO_CODE = 1;
		public static final int INDEX_SENDER_FULL_NAME = 2;
		public static final int INDEX_RECEIVER_FULL_NAME = 3;
		public static final int INDEX_DESTINATION = 4;
		public static final int KUWAIT_MOBILE_NUMBER_LENGTH = 8;
		public static final int COUNTRY_CODE = 965;
	}

	public static class WU_SEND_MONEY_STORE_CONSTANTS {
		private WU_SEND_MONEY_STORE_CONSTANTS() {
		}

		public static final String IB_USER = "IBUSR";
		public static final String MB_USER = "MBUSR";
		public static final String BRANCH_CODE = "992";// changed from 998 based on Business Request
		public static final String IB_TELLER_ID = "99999";// "90219" ;based on abdelmenaem's phonecall on 13 April 2014
		public static final String MB_TELLER_ID = "9998";// "90219" ;based on abdelmenaem's phonecall on 16 April 2014
		public static final String COMPANY_CODE = "1";
	}

	public static class TRASNFER_LIMITS_TYPES {
		private TRASNFER_LIMITS_TYPES() {
		}

		public static final String DAILY = "D";
		public static final String WEEKLY = "W";
		public static final String MONTHLY = "M";
		public static final String YEARLY = "Y";
	}

	public static class CARDLESS_TYPES {
		private CARDLESS_TYPES() {
		}

		public static final int CONFIRMATION_CODE = 1;
		public static final int CIVIL_ID = 2;

	}

	public static class CARDLESS_BR_VALIDATION {
		private CARDLESS_BR_VALIDATION() {
		}

		public static final int MAX_TO_SAME_CID = 2;
		public static final String CONF_WITHDRAWEL_EXPIRY = "6";
		public static final String CID_WITHDRAWEL_EXPIRY = "48";

	}

	public static class SERVICE_EXPIRY_TIME_OUT {
		private SERVICE_EXPIRY_TIME_OUT() {
		}

		public static final double ONE_MIN = 1;
		public static final double TWO_MINS = 2;
		public static final double THREE_MINS = 3;
		public static final double FOUR_MINS = 4;
		public static final double TWO_HOURS_IN_MINS = 120;
		public static final double TWENTY_FOUR_HRS = 1440;

	}

	public static class PRESENTATION_LOGO {
		private PRESENTATION_LOGO() {
		}

		public static final String PLATINUM = "platinum_logo";
		public static final String PRIVATE = "private_logo";
		public static final boolean SHOW_REL_OFFICER = true;

	}

	/**
	 * used to distinguish our high net worth customer. For instance, we will show
	 * them their relationship manager contact number when logging in
	 */
	public static class RANKING_CODE {
		private RANKING_CODE() {
		}

		public static final Integer PLATINUM_CODE = 10;
		public static final Integer PRIVATE_CODE = 4;
		public static final Integer IMTAZ_PLATINUM_CODE = 21;
		public static final Integer PRIVATE_PBD_SUPER_CODE = 24;
		public static final Integer PRIVATE_PBD_RELATIVES_CODE = 25;
		public static final Integer SME_CODE = 16;

	}

	public static class ESTATEMENT_UPDATED_OBJECT {
		private ESTATEMENT_UPDATED_OBJECT() {
		}

		public static final Integer UPDATE_EMAIL = 1;
		public static final Integer UPDATE_ACC = 2;
		public static final Integer CHANGE_PASSWORD = 3;
		public static final Integer CANCEL_SUBSCRIPTION = 4;
		public static final Integer UPDATE_CRD = 5;
	}

	public static class ESTATEMENT_SUBSCRIBTION_STATUS {
		private ESTATEMENT_SUBSCRIBTION_STATUS() {
		}

		public static final String ACTIVE = "A";
		public static final String PENDING = "P";
	}

	public static class GL_CODE {
		private GL_CODE() {
		}

		public static final String PREMIUM_ACCOUNTS = "210205";
		public static final String CURRENT_ACCOUNT = "210101";
		public static final String SALARY_ACCOUNT = "210102";
		public static final String PERSONAL_FINANCE_ACCOUNT = "210105";
		public static final String SAVING_ACCOUNT = "210202";
		public static final String WOW_ACCOUNTS = "210203";
	}

	public static class FUND {
		private FUND() {
		}

		public static class SERVICE_TYPE {
			private SERVICE_TYPE() {
			}

			public static final int SUBSCRIPTION = 1;
			public static final int REDEMPTION = 2;
		}

		public static class VALUE_DATE_OPTION {
			private VALUE_DATE_OPTION() {
			}

			public static final String TRADE_DATE = "0";
			public static final String NAV_NEXT_DATE = "1";
			public static final String SPECIFIC_DATE = "2";
		}

		public static class REDEMPTION_TYPE {
			private REDEMPTION_TYPE() {
			}

			public static final int PARTIAL_RED = 1;
			public static final int FULL_RED = 2;
		}

		public static class PERIOD_TYPE {
			private PERIOD_TYPE() {
			}

			public static final String DAILY = "D";
			public static final String WEEKLY = "W";
			public static final String BI_WEEKLY = "B";
			public static final String MONTHLY = "M";
			public static final String MONTHLY_ON_DAY = "X";
			public static final String QUARTERLY = "Q";
			public static final String SEMI_ANNUALLY = "S";
			public static final String YEARLY = "Y";

		}
	}

	public static class ITUNES {
		private ITUNES() {
		}

		public static class STORE {
			public static final int US = 62;
			public static final int UK = 79;
		}

		public static class US {
			private US() {
			}

			public static final int KWD_3750_ID = 118;
			public static final int KWD_5500_ID = 119;
			public static final int KWD_6500_ID = 177;
			public static final int KWD_8750_ID = 120;
			public static final int KWD_10000_ID = 178;
			public static final int KWD_17000_ID = 122;
			public static final int KWD_33500_ID = 138;

			public static final int KWD_64000_ID = 213;

			public static final int KWD_93000_ID = 214;
			public static final int KWD_122000_ID = 215;
			public static final int KWD_154000_ID = 216;
			public static final int KWD_7250_ID = 372;

			public static final String KWD_3750_VALUE = "$10";
			public static final String KWD_5500_VALUE = "$15";
			public static final String KWD_6500_VALUE = "$20";
			public static final String KWD_8750_VALUE = "$25";
			public static final String KWD_10000_VALUE = "$30";
			public static final String KWD_17000_VALUE = "$50";
			public static final String KWD_33500_VALUE = "$100";

			public static final String KWD_64000_VALUE = "$200";

			public static final String KWD_93000_VALUE = "$300";
			public static final String KWD_122000_VALUE = "$400";
			public static final String KWD_154000_VALUE = "$500";
			public static final String KWD_7250_VALUE = "$20";

		}

		public static class UK {
			private UK() {
			}

			public static final int KWD_5_ID = 160;
			public static final int KWD_8_ID = 161;
			public static final int KWD_15_ID = 162;
			public static final int KWD_28_ID = 163;
			public static final int KWD_51_ID = 164;

			public static final String KWD_5_VALUE = "�10";
			public static final String KWD_8_VALUE = "�15";
			public static final String KWD_15_VALUE = "�25";
			public static final String KWD_28_VALUE = "�50";
			public static final String KWD_51_VALUE = "�100";
		}

	}

	public static class GOOGLE_PLAY {
		private GOOGLE_PLAY() {
		}

		public static final int SERVICE_ID = 82;

		public static class PRODUCTS {
			public static final int KWD_3500_ID = 171;
			public static final int KWD_8500_ID = 172;
			public static final int KWD_16000_ID = 173;

			public static final String KWD_3500_VALUE = "$10";
			public static final String KWD_8500_VALUE = "$25";
			public static final String KWD_16000_VALUE = "$50";

		}
	}

	public static class SHARE_AND_OUR_type {
		private SHARE_AND_OUR_type() {
		}

		public static final int SHARE = 1;
		public static final int OUR = 2;
	}

	public static class TRAVEL_NOTIFICATION {
		private TRAVEL_NOTIFICATION() {
		}

		public static final String USER_PASS = "1234";
		public static final String DISABLE_REASON_IMAL = "Back to Kuwait";
		public static final String CREATED_BY_IMAL = "IBMB";

		public static final String NEW_NOTIFICATION = "1"; // Status 1 new notification

		public static class PDF_FIELDS {
			private PDF_FIELDS() {
			}

			public static final int CUSTOMER_NAME = 0;
			public static final int CIF = 1;
			public static final int FROM_DATE = 2;
			public static final int TO_DATE = 3;
			public static final int ATM_CARDS = 4;
			public static final int CREDIT_CARDS = 5;
			public static final int COUNTRIES = 6;
			public static final int MOBILE_NO = 7;
			public static final int PDF_PASSWORD = 8;
		}
	}

	public static class CIF_TYPES {
		private CIF_TYPES() {
		}

		public static final int PERSONAL_STAFF = 2;
		public static final int MINOR = 16;
		public static final int WOW = 26;
	}

	public static class UTILITIES_CONSTANS {
		private UTILITIES_CONSTANS() {
		}

		public static final String MASK_CARD_NUM = "000000XXXXXX0000";
		public static final String LEAD_REF_IS_NULL_IN_SUCCESS = "Lead creation is successfull but LeadId is emprty/null";
		public static final String USER_SHAKING = "1";
	}

	public static class CUST_PER_PAYEE_CONSTANS {
		private CUST_PER_PAYEE_CONSTANS() {
		}

		public static final String CREATE_PAYEE = "createPayee";
		public static final String UPDATE_PAYEE = "updatePayee";
		public static final String DELETE_PAYEE = "deletePayee";
		public static final String GLOBAL_PAYEE = "1";
		public static final String PERSONAL_PAYEE = "2";
		public static final int CUST_MOBILE_PAYEE_TYPE_ID = 1;
		public static final int CUST_SCHOOL_PAYEE_TYPE_ID = 2;
		public static final int MOBILE_FIELD = 1;
		public static final int COMPANY_FIELD = 2;
		public static final int SERVICE_TYPE_FIELD = 3;
		public static final int SCHOOL_ID_FIELD = 4;
		public static final int CLASS_NAME_FIELD = 5;
		public static final int CLASS_REF_FIELD = 6;
		public static final int STUDENT_ID_FIELD = 7;
		public static final int SCHOOL_NAME_FIELD = 8;
		public static final int ZAIN_PREPAID = 47;
		public static final int VIVA_PREPAID = 39;
		public static final int OOREDOO_PREPAID = 3;

		public static final int ZAIN_POSTPAID = 5;
		public static final int VIVA_POSTPAID = 48;
		public static final int OOREDOO_POSTPAID = 1;
		public static final String ZAIN_ID = "1";
		public static final String OOREDOO_ID = "2";
		public static final String VIVA_ID = "3";
		public static final String ZAIN_NAME = "Zain";
		public static final String VIVA_NAME = "Viva";
		public static final String OOREDOO_NAME = "Ooredoo";
		public static final String CUST_PAYEE_ID = "payeeId";
		public static final String PAYEE_NAME = "name";
		public static final String NICK_NAME = "nickName";
		public static final String PAYEE_TYPE = "payeeType";
		public static final String CUST_FIELDS_MAP = "fields";
		public static final String CREATED_BY = "Created By CustId ";
		public static final String PREPAID = "PREPAID";
		public static final String POSTPAID = "POSTPAID";

	}

	public static class GLOBAL_PAYEE_CONSTANTS {
		private GLOBAL_PAYEE_CONSTANTS() {
		}

		public static final String FROM_ACCOUNT_NO_FIELD = "fromAccount";
		public static final String COMMENTS_FIELD = "comments";
		public static final String PAYMENTS_DETAILS_MAP = "paymentDetails";
		public static final String IMAGES_PATH = "framework/skins/shared/images/globalpayees/";
		public static final String EDUCATION_GENERAL_ICON_LARGE = "educationGeneral_large.png";
		public static final String EDUCATION_GENERAL_ICON_SMALL = "educationGeneral_small.png";
		public static final String CHARITY_GENERAL_ICON_LARGE = "charityGeneral_large.png";
		public static final String CHARITY_GENERAL_ICON_SMALL = "charityGeneral_small.png";

	}

	public static class CASE_TYPES {
		private CASE_TYPES() {
		}

		// on uat = 1 and on dev = 1
		public static final int THANK_YOU_MSG_TYPE_ID = 1;
		public static final String THANK_YOU_MSG_BODY = "#cifLabel#: #cifValue# <br/>#customerNameLabel# : #customerNameValue#<br/><br/>#employeeNameLabel#: #employeeNameValue#, <br/>#branchHeader#: #branchName#<br/><br/>";

		public static class CASE_TYPES_ID {
			public static final int THANK_YOU = 1;
			public static final int CASE = 2;
		}
	}

	public static class FLAG_STATUS {
		private FLAG_STATUS() {
		}

		public static final int INACTIVE = 0;
		public static final int ACTIVE = 1;
		public static final int NOT_SET_BY_USER = 2;
	}

	public static class DEVICES {
		private DEVICES() {
		}

		public static final String DEVICE_ID_DELIMITER = ";=,=;";

		public static class MINIMUN_SUPPORTED_VERSION {
			public static class NFC_RELEASE {
				public static final String IOS_VERSION = "4.0.0";
				public static final String ANDROID_VERSION = "4.0.0";
			}

		}

		public static class DB_METHOD_ACTION {
			private DB_METHOD_ACTION() {
			}

			public static final int INSERT = 1;
			public static final int UPDATE = 2;
			public static final int NOT_DEFINED = 3;
		}

		public static class OS_TYPES {
			public static final int IOS = 1;
			public static final int ANDROID = 2;
			public static final int OTHER = 99;
		}

		public static class EWATCH {
			private EWATCH() {
			}

			public static final String TOKEN_DELIMITER = ";-;";
			public static final String TOKEN_REQUEST_HEADER_CONSTANT = "EW_TK";
			public static final String USERNAME_REQUEST_HEADER_CONSTANT = "EW_UN";

			public static class SUPPORTED_VERSIONS {
				public static final String ANDROID_VERSION = "1.1.9.9.9.9";
				public static final String IOS_VERSION = "8.2.0.0.0.0";
				public static final String ANDROID_APP_MIN_SUPPORTED_VERSION = "3.0.0";
				public static final String IOS_APP_MIN_SUPPORTED_VERSION = "2.7.0";

			}

		}

		public static class ACTION_TYPES {
			private ACTION_TYPES() {
			}

			public static final int NOTING = 0;
			public static final int ASK_USER_FOR_DEFAULT_DEVICE = 1;
		}

		public static class MODEL {
			private MODEL() {
			}

			public static final String IPHONE_X = "iPhone X";
		}

	}

	public static class NOTIFICATIONS {
		private NOTIFICATIONS() {
		}

		public static final String NOTIFICATION_SOUND = "default";

		public static class PUSH_TYPE {
			public static final int SMS_TYPE_IB = 1;
			public static final int PUSH_TYPE_IB = 2;
			public static final String SMS_TYPE_IMAL = "SMS";
			public static final String PUSH_TYPE_IMAL = "PUSH";
		}

		public static class CONTENT_TYPE {
			public static final int TXT_MSG = 1;
			public static final int HTML_MSG = 2;
		}

		public static class OS_TYPES {
			public static final int IOS = 1;
			public static final int ANDROID = 2;
			public static final int OTHER = 99;
		}

		// These values are used by Mobile App for version R1 or ealier for PN
		// Transaction and PN informative
		public static class CENTER_STATUS {
			public static final int ACTIVE = 1;
			public static final int INACTIVE = 0;
			public static final int NOT_SET_BY_USER = 2;
		}

		public static class MOBILE_ACTIONS {
			public static final int PN_ENABLED = 1;
			public static final int PN_DISABLED = 2;
			public static final int PN_DISABLED_FROM_OS = 3;
			public static final int PN_DISABLED_WITH_CONFIRMATION_MSG = 4;
		}

		public static class PARAMETER_VALUE_TYPES {
			public static final int CUSTOMER_ID = 1;
			public static final int DEVICE_ID = 2;
			public static final int DEVICE_TOKEN = 3;
		}

		public static class MESSAGE_STATUS {
			public static final int ALL = -1;
			public static final int NEW = 1;
			public static final int OPEN = 2;
			public static final int CLOSE = 3;
		}

		// These values are used by iMAL for Credit Card Transaction
		public static class CREDIT_CARD_NOTIF_TYPES {
			public static final String SMS = "S";// Default is always "S"
			public static final String PUSH = "P";// "P" is the value to be set for Push Notifications in IMAL
			public static final String BOTH = "B";// "B" is for both Push Notification and SMS
			public static final String NOT_SET_BY_USER = "2"; // not set means SMS, but not updated by user.

		}// CREDIT_CARD_NOTIF_TYPES

		// These values are used by iMAL for PN Transaction and PN informative
		public static class COMMUNICATION_METHOD_IMAL {
			public static final int SMS = 0;
			public static final int PN = 1;
			public static final int OFF = -1;
		}

		// These values are used by Mobile App for version R2 and later for PN
		// Transaction and PN informative and Credit Card Trans
		public static class COMMUNICATION_METHOD_ECORE {
			public static final int OFF = -1;
			public static final int SMS = 0;
			public static final int PN = 1;
			public static final int NOT_SET_BY_USER = 2;
		}

		public static class COMMUNICATION_METHOD_MOBILE {
			public static final int OFF = 0;
			public static final int SMS = 1;
			public static final int PN = 2;
			public static final int SMS_AND_PN = 2;
			public static final int NONE = -1;
		}

		public static class IMAL_ERROR_CODES {
			public static final String NO_SMS_SUBSCRIPTION = "-12";
			public static final String NO_BALANCE1 = "-104";
			public static final String NO_BALANCE2 = "-114";
		}

	}

	public static class SHAKE {
		private SHAKE() {
		}

		public static class SHAKE_USER_STATUS {
			public static final int USER_IS_SHAKING = 1;
		}

		public static class SHAKE_FIELDS {
			private SHAKE_FIELDS() {
			}

			public static final int ENTITLED_SERVICES = 0;
			public static final int FROM_ACCOUNT = 1;
			public static final int TO_ACCOUNT = 2;
			public static final int MINIMUM = 3;
			public static final int MAXMIMUM = 4;
			public static final int ACCOUNT_NUMBER = 5;
			public static final int CARD_NUMBER = 6;
			public static final int ACCOUNT_LIMIT = 7;
			public static final int CARD_LIMIT = 8;
			public static final int ERROR = 9;
		}

		public static class SHAKE_SERVICES_ID {
			private SHAKE_SERVICES_ID() {
			}

			public static final int ASAREE_3_AND_SAVE = 1;
			public static final int ACCOUNTS_BALANCE_INQUIRY = 2;
			public static final int CARD_BALANCE_INQUIRY = 3;
			public static final int PAY_TO_CARD = 4;
			public static final int PAY_TO_MOBILE = 5;
		}

		public static class SHAKE_DB_LOGFIELDSVALUES_ID {
			private SHAKE_DB_LOGFIELDSVALUES_ID() {
			}

			public static final String PHONE_BUMBER = "1";
			public static final String POST_OR_PRE_PAID = "2";
			public static final String MOBILE_PROVIDER = "3";
		}
	}

	public static class KNET_TRANSACTION {
		private KNET_TRANSACTION() {
		}

		public static final String KNET_URL = "http://localhost:7002/fund/faces/knetPayment.jsp";
		public static final String SESSION_PREFIX_TRANSACTION_DTO = "Trans_";
		public static final String SESSION_PREFIX_LAST_KNET_SERVICE = "LAST_KNET_SERVICE";
		public static final String SESSION_PREFIX_DUPLICATE_CHECKING = "KNetTrans_";
		public static final String KNET_ENG_LANGUAGE = "ENG";
		public static final String KNET_AR_LANGUAGE = "ARA";

		/********* these values for UAT ******/
		public static final String IMAL_TRX_TYPE = "800"; // for environment Tuliptd5 10.1.13.20
		public static final String BRANCH_CODE = "998";

		// Suspense Account with Account sign BOTH
		public static final String IMAL_GL_CODE_OWN_TRANSFER = "199201003";

		public static final String EMAIL_TITLE = "Top-Up my Account";

		public static class TRANS_STATUS_VALUES {
			public static final int ALL = -1; // used for enquiry only.
			public static final int UNKOWN = 0;
			public static final int SUCCESS = 1;
			public static final int FAILURE = 2;
			public static final int PARTIAL_SUCCESS = 3;
			public static final int PENDING = 4;
			public static final int EXPIRED = 5;
			public static final int REJECTED = 6;
			public static final int PARTIALLY_PAID = 7;
		}

		public static class TRANS_STAGE_VALUES {
			public static final int CREATE_KNET_PAYMENT = 1;
			public static final int INITIALIZE_KNET_PAYMENT = 2;
			public static final int PAYMENT_PROCESSING = 3;
			public static final int FINALIZE_PAYMENT = 4;
			public static final int PAYMENT_REJECTED = 0;
		}

		public static class MSG_DELIVERY_TYPE {
			public static final int SMS = 1;
			public static final int SAHRE = 2;
		}
	}

	public static class CARDS_TYPE {
		private CARDS_TYPE() {
		}

		public static final String VIRTUAL = "23";

		public static final String CLASSIC = "001";
		public static final String GOLD = "002";
		public static final String PLATINUM = "003";
		public static final String INFINITE = "004";
		public static final String MASTER_CARD_WORLD = "005";
		public static final String MASTER_CARD_TITANUM = "006";
		public static final String VISA_CREDIT_PREPAID = "007";
		public static final String VISA_SIGNATURE = "008";
		public static final String IMAL_PREFIX = "IMAL_"; // this prefix indects the use of imal card type instead of
															// soa
		public static final String CLICK_PREPAID = "55";
		public static final String MASTER_WORLD_ELITE = "009";
		public static final String MASTER_CARD_PLATINUM = "?";
		public static final String VISA_PRE_PAID = "34"; // 12 also

	}

	public static class CARD_TYPES_LOOKUP {
		private CARD_TYPES_LOOKUP() {
		}

		public static class ECORE_CARD_TYPE {
			public static final int VISA_DEBIT = 1;
			public static final int VISA_CREDIT = 2;
			public static final int MASTER_CREDIT = 3;
		}

		public static class ECORE_DEFAULT_CARD_IDS {
			private ECORE_DEFAULT_CARD_IDS() {
			}

			public static final int VISA_DEBIT = -1;
			public static final int VISA_CREDIT = -2;
			public static final int MASTER_CREDIT = -3;
		}

		private static ArrayList<Integer> PREPAID_CARDS_CODES = new ArrayList<Integer>() {
			private static final long serialVersionUID = 1L;
			{
				add(20);
				add(21);
			}
		};

		public static ArrayList<Integer> getPREPAID_CARDS_CODES() {
			return PREPAID_CARDS_CODES;
		}

	}

	public static class CREDIT_CARD_TYPES_IMAL {
		private CREDIT_CARD_TYPES_IMAL() {
		}

		public static final String VISA_PLATINUM = "7"; // production 65
		public static final String VISA_SIGNATURE = "22"; // production 66
		public static final String MASTER_CARD_WORLD = "14"; // production 68
		public static final String MASTER_CARD_PLATINUM = "?"; // production
		public static final String PREPAID_CARD = "12"; // production 70
		public static final String VISA_SIGNATURE1 = "66";
		public static final String VISA_PLATINUM1 = "65";
		public static final String MASTER_CARD_WORLD1 = "68";
		public static final String PREPAID_CARD1 = "70";
		public static final String MASTER_CARD_PLATINUM1 = "?";
		public static final String VISA_PLATINUM_CC = "27";
		public static final String MASTER_CARD_PLATINUM2 = "69";
	}

	public static class EWATCH {
		private EWATCH() {
		}

		public static final String TOKEN_DELIMITER = ";-;";
		public static final String EWATCH_REQUEST_HEADER_CONSTANT = "EW_RQ";
		public static final String TOKEN_REQUEST_HEADER_CONSTANT = "EW_TK";
		public static final String USERNAME_REQUEST_HEADER_CONSTANT = "EW_UN";

		public static class SUPPORTED_VERSIONS {
			private SUPPORTED_VERSIONS() {
			}

			public static final String ANDROID_VERSION = "1.1.9.9.9.9";
			public static final String IOS_VERSION = "8.2.0.0.0.0";
			public static final String ANDROID_APP_MIN_SUPPORTED_VERSION = "3.0.0";
			public static final String IOS_APP_MIN_SUPPORTED_VERSION = "2.7.0";

		}

		public static class SETTINGS_STATUS {
			public static final boolean ENABLE = true;
			public static final boolean DISABLE = false;
		}

	}

	public static class FINGERPRINT {

		public static final String TOKEN_DELIMITER = ";=,=;";
		public static final String TOKEN_KEY_2 = "@L9P0DJiR1A!_t4sP8U";
		public static final String TOKEN_KEY_2_ENCRYPTED = "{AES}9xKuC+2hYTUxlDGQyKdSsP9IV2gz++74tYnoBIirpkq6eJaVT3rW0OZR0XCuezhB";

		public static final double ALLOWED_TIME_DIFFERENCE_IN_MINS = 20;

		public static class SETTINGS_STATUS {
			public static final boolean ENABLE = true;
			public static final boolean DISABLE = false;
		}
	}

	public static class LOGIN_MODE {
		public static final int PASSWORD_LOGIN = 1;
		public static final int FINGERPRINT_TOKEN = 2;
		public static final int BASIC_AUTHENTICATION = 3;
	}

	public static class MOBILE_OS_TYPES {
		public static final String ANDROID = "android";
		public static final String IOS = "ios";

	}

	public static class MURABAHA_PAYMENT_IMAL_STATUS {
		public static final String PAID = "paid";
		public static final String UNPAID = "unpaid";
		public static final String ERALYPAID = "early paid";
		public static final String PARTIALLYPAID = "partially paid";
		public static final String UNKNOWN = "unknown";

		public static final String PAID_ID = "1";
		public static final String UNPAID_ID = "2";
		public static final String EARLYPAID_ID = "3";
		public static final String PARTIALLYPAID_ID = "4";

		public static final String UNKNOWN_ID = "5";

	}

	/**
	 * When getting http request from the MB, we extract the http header values.
	 * Below values are the needed one.
	 */
	public static class HTTP_HEADERS {
		public static final String USER_AGENT = "User-Agent";
		public static final String REQ_TK = "REQ-TK";
		public static final String REQ_TS = "REQ-TS";
		public static final String ACCEPT_LANGUAGE = "Accept-Language";
		public static final String ULO_LAT = "ULO-LAT";
		public static final String ULO_LON = "ULO-LON";
		public static final String IS_DEVICE_ROOTED = "REQ-DR";
	}

	public static class WS_LOGS {

		private static ArrayList<String> errorCodeList = new ArrayList<String>() {
			private static final long serialVersionUID = 1L;
			{
				add("99998");
				add("BEA-380001");
				add("BEA-380000");
				// add("-40");
				add("-50");
				add("-372");
				add("-888");
				// add("-30");
				// add("-40");
				// add("-40");
			}
		};

		public static ArrayList<String> getErrorCodeList() {
			return errorCodeList;
		}

		private static ArrayList<String> errorCodeDesc = new ArrayList<String>() {
			private static final long serialVersionUID = 1L;
			{
				add("Validation Error Occured::Validation Failed From Enet::   StatusCode::107 StatusDesc::BEA-382500: OSB Service Callout action received SOAP Fault response Mobile Type::UNKNON");
				add("Validation Failed at Enet  StatusCode::107 StatusDesc::Service not available, try again later.");
				add("Validation Failed at Enet With Exception");
				add("Wester Union Payment FAILED :: Message HTTP transport error: java.net.SocketTimeoutException: connect timed out");
				add("Payment Error Occured::Payment Failed On Provider Side ");
			}
		};

		public static ArrayList<String> getErrorCodeDesc() {
			return errorCodeDesc;
		}

		public static final String SUPPORT_EMAIL = "salhawari@bankusman.com,afayad@bankusman.com,ahendi@bankusman.com,oyousuf@bankusman.com";

		public static final int WS_TEST_MAX_LENGTH = 3500;

		// TODO-pushNotification: sami-enable email notification on production
		public static final boolean ENABLE_EMAIL_NOTIFICATION = true;
	}

	public static class PDF_FIEDS_NAME {
		public static final String FILE_NAME = "pdfFileName";
		public static final String HEADER_NAME = "headerName";
	}

	public static class DB_PARAMETER_VALUE_TYPES {
		public static final String CUSTS_PROFILES_CUSTOMER_ID = "CUST_ID";
		public static final String EWATCH_TOKEN = "EWATCH_TOKEN";
		public static final String DEVICE_ID = "CUSTS_DEVICE.DEVICE_ID";
		public static final String DEVICE_TOKEN = "CUSTS_DEVICE.DEVICE_TOKEN";
		public static final String MOBILE_NO = "MOBILE_NO";

	}

	public static class ACCT_TO_ACCT_TRANSFER_PARAMETERS {
		public static final String AL_USE_CARD_ACCT_NO = "0";
		public static final String SCHOOL_PAYMENT_IMAL_TRX_TYPE = "136";

	}

	public static class BRANCHES_ATMS_CONFIG {

		public static class BRANCH_TYPE {
			public static final int BRANCH = 1;
			public static final int usman_DIRECT = 2;
		}

		public static class TYPE {
			public static final String BRANCH = "Branch";
			public static final String ATM = "ATM";
		}

		public static class ACTION_TYPE {
			public static final int CREATE = 1;
			public static final int UPDATE = 2;
			public static final int DELETE = 3;
		}
	}

	public static class SECRET_KEY {
		public static final String KEY_VALUE = "j!KEMK@6rC*?Yewgz%M";
	}

	public static class UPLOAD_FILE_HANDLER {
		public static final Float SUPPORTED_MAXIMUM_ALLOWED_FILE_SIZE = 2.5F; // 2.5M
		public static final Float SUPPORTED_MINIMUM_ALLOWED_FILE_SIZE = .002F; // 250KB
		public static final String SUPPORTED_MAX_FILE_SIZE_MB = "2.5 MB";
		public static final String SUPPORTED_MIN_FILE_SIZE_KB = "250 KB";
		public static final Float CREDIT_CARD_REQUEST_MAXIMUM_FILE_SIZE = 1.5F; // 1.5M

		public static class UPLOAD_SOURCE {
			public static final String SESSION_KEY = "uploadDataSource";
			public static final String RENEW_CIVIL_ID = "renewCivilId";
			public static final String CREDIT_CARD_REQUEST = "creditCardRequest";
		}
	}

	public static class REMOTE_FILESYSTEMS {
		public static final String SUPPORTED_IMAGE_TYPES = "jpg jpeg png";
		public static final String DEFAULT_FILE_TYPE = "jpg";
		public static final Integer SUPPORTED_MAXIMAL_CIVIL_ID_IMAGE_HIGHT = 400;
		public static final Integer SUPPORTED_MAXIMAL_CIVIL_ID_IMAGE_WIDTH = 400;
		public static final Integer SUPPORTED_MINIMAL_CIVIL_ID_IMAGE_HIGHT = 100;
		public static final Integer SUPPORTED_MINIMAL_CIVIL_ID_IMAGE_WIDTH = 100;
		public static final Float SUPPORTED_MAXIMUM_CIVIL_ID_SIZE = 2.5F; // 2.5M
		public static final Float SUPPORTED_MINIMUM_CIVIL_ID_SIZE = .25F; // 250KB
	}

	public static class CIVIL_ID {
		public static final Integer ALLOWABLE_PERSIOD_FOR_UPDATE = 30;
		public static final Integer NUMBER_OF_PHOTOS = 2;
		public static final Integer CIVIL_ID_CODE_ID = 1;
	}

	public static class WAFFERLI_SERVICE {

		public static final String ROUNDING_AMOUNT_1_KD = "1";
		public static final String BRANCH_CODE = "998";
		public static final String CURRENCY_CODE = "1";
		public static final String COMPANY_CODE = "1";
		public static final String TELLER_ID = "99999";
		private static Integer[] MUST_SALARY_ALLOWED_CIF_TYPES = new Integer[] { 1, 3, 5, 30, 31, 32, 61, 64 };
		private static Integer[] MUST_CURRENT_ALLOWED_CIF_TYPES = new Integer[] { 2, 20, 21, 23, 24, 25, 62 };

		public static Integer[] getMUST_SALARY_ALLOWED_CIF_TYPES() {
			return MUST_SALARY_ALLOWED_CIF_TYPES;
		}

		public static Integer[] getMUST_CURRENT_ALLOWED_CIF_TYPES() {
			return MUST_CURRENT_ALLOWED_CIF_TYPES;
		}

		public static final String ERROR_NO_SUB_DATA_FOUND = "99999";

		public static class ACTIONS {
			public static final String SUSPENDED = "S";
			public static final String EDITE = "E";
			public static final String DEACTIVATE = "D";
			public static final String ACTIVATE = "A";
		}

		public static class DURATIONS {
			public static final Integer MONTHS_6 = 6;
			public static final Integer MONTHS_12 = 12;
			public static final Integer MONTHS_18 = 18;
		}

		public static class MAX_SAVED_PER_DAY {
			public static final Integer KWD_1 = 1;
			public static final Integer KWD_5 = 5;
			public static final Integer KWD_10 = 10;
			public static final Integer KWD_15 = 15;
			public static final Integer KWD_20 = 20;
		}

		public static class ROUND_UP_TO {
			public static final Integer KWD_1 = 1;
			public static final Integer KWD_5 = 5;
			public static final Integer KWD_10 = 10;
		}
	}

	public static class PAY_ME {

		public static class URL_TYPE {
			public static final int MOBILE_DEEP_LINK = 1;
			public static final int QUERY_STRING = 2;
		}

		public static final int TRIALS_ALLOWED = 2;

		public static class extraFields {
			public static final Integer CUSTOMER_NAME = 1;
		}

		public static class RETURNED_FIELDS {
			public static final String AMOUNT = "amount";
			public static final String CUSTOMER_NAME = "customerName";
			public static final String OTP = "otp";
			public static final String EXPIRY_DATE = "expiryDate";
			public static final String USER_COMMENTS = "comments";
		}
	}

	public static class TOKEN {

		public static final String TOKEN_DELIMITER = "$";
		public static final String NFC_TOKEN_DELIMITER = "#";
		public static final String LIVE_CHAT_TOKEN_DELIMITER = "#";
		public static final Integer EXPIRY_PERIOD_IN_MINUTES = 5;
		public static final String MOBILE_SCHEMA = "http://bbyn.com/payme?";

		public static class TYPES {

			// public static int COMPLEX_TOKEN = 1;
			public static final int PAY_ME_TOKEN = 2;
			public static final int NFC_DEBIT_PAYMENT = 3;
			public static final int NFC_WALLET_TOKEN = 4;
			public static final int NFC_INFOSYS_TOKEN = 5;
			public static final int EMAIL_VERIFY_TOKEN = 6; // DA-632:Customer Email Updating
			public static final int PAYME_MULTIPLE_PAYMENTS = 7;
			public static final int LIVE_CHAT_TOKEN = 8; // for live chat token type

		}

		public static class WRONG_ATTEMP_ACTIONS {
			public static final int DELETE_TOKEN = 1;
			public static final int DELETE_TOKEN_AND_LOCK_USER = 2;

		}

		public static class FIELDS {
			public static final Integer CREATED_BY_CIF = 1;
			public static final Integer AUTHORIZED_BY_CIF = 2;
			public static final Integer AUTHORIZED_CHANNEL = 3;
			public static final Integer AMOUNT = 4;
			public static final Integer CURRENCY = 5;
			public static final Integer SERVICE_ID = 6;
			public static final Integer TRANSFER_TYPE_ID = 7;
			public static final Integer EXPIRY_DATE = 8;
			public static final Integer TRIALS_ALLOWD = 9;
			public static final Integer WRONG_ATTEMPT_ACTION = 10;
			public static final Integer TRANS_REF_NUMBER = 11;
			public static final Integer LANGUAGE = 12;
			public static final Integer OTP = 13;
			public static final Integer USER_ID = 14;
			public static final Integer CREATION_DATE = 15;
			public static final Integer EXPIRY_PERIOD_IN_MINUTES = 16;
			public static final Integer SEND_SMS_MSG = 17;
			public static final Integer NEW_EMAIL = 18; // DA-632:Customer Email Updating
			public static final Integer OLD_EMAIL = 19; // DA-632:Customer Email Updating
			public static final Integer INSTALLMENT_AMOUNT = 20;
			public static final Integer REMAINING_AMOUNT = 21;
			public static final Integer TOTAL_AMOUNT = 22;

		}
	}

	public static class WS_ERRORS {
		public static final String WU_ERROR = "-40";

	}

	/**
	 * @author Mo Alshamlan
	 * 
	 *         El Booq has its own error codes which conflicts with usman error
	 *         codes. That is why we are using a different namespace that is just
	 *         dedicated to El Booq error codes
	 */
	public static class ELBOOQ {
		// the returned error code form el booq server
		public static class ERROR_CODES {
			public static final String SUCCESS = "1";
			public static final String INVALID_ACCOUNT = "-15";
			public static final String ELBOOQ_SERVER_IS_DOWN = "500";
			public static final String NO_SERVICE_ACCESS = "-30";
			public static final String NOT_AUTHORIZED = "-14";
			public static final String NON_ZERO_BALANCE = "-66";
			public static final String INVALID_NO_DECIMALS = "-64";
		}

		// the returned status code for get booq info
		public static class STATUS_CODES {
			public static final String ACTIVE_ACCOUNT = "1";
			public static final String ELBOOQ_IS_LINKED = "1";
			public static final String ELBOOQ_LINK_IS_PENDING = "2";
		}

		// presentation tier status
		public static class PRESENTATION_TIER_STATUS {
			public static final String ELBOOQ_LINK_IS_NOT_FOUND = "1";
			public static final String ELBOOQ_LINK_IS_STILL_PENDING_usman = "2";
			public static final String ELBOOQ_LINK_IS_STILL_PENDING = "3";
			public static final String ELBOOQ_LINK_IS_ACTIVE = "4";
		}

		// BENEFICIARY status
		public static class BENEFICIARY_STATUS {
			public static final Integer PENDING = 2;
			public static final Integer APPROVED = 3;
		}
	}

	public static class TRANSACTION_STAGE {

		public static final int TRANS_COMMITTED = 1;
		public static final int TRANS_INITIATED = 2;

	}

	public static class LIMIT_CHECKING_FLAGS {
		public static final Integer DISABLE_LIMIT_CHECK = 0;
		public static final Integer ENABLE_LIMIT_CHECK = 1;
	}

	public static class GENDER {
		public static final String MALE = "M";
		public static final String FEMALE = "F";
		public static final String UNKNOWN = "0";
	}

	/**
	 * JIRA: RTLCRPMBDV-441 (DA-550 - Card Issuance CR Changes) Neel: 11-Nov-2016
	 */
	public class MANAGE_CARDS_OPERATION {
		private MANAGE_CARDS_OPERATION() {
		}

		public static final String REPLACE_CARD = "1";
		public static final String RENEW_CARD = "2";
		public static final String ISSUE_CARD = "3";
		public static final String BLOCK_CARD = "4";
		public static final String SET_PIN_CARD = "5";
		public static final String CREDIT_CARD_REQUEST = "6";
	}

	/**
	 * JIRA: RTLCRPMBDV-441 (DA-550 - Card Issuance CR Changes) Neel: 11-Nov-2016
	 */
	public class MANAGE_CARDS_REQUEST_TYPES {
		private MANAGE_CARDS_REQUEST_TYPES() {
		}

		public static final String REPLACE_CARD = "REP";
		public static final String RENEW_CARD = "REN";
		public static final String ISSUE_CARD = "NEW";
	}

	/**
	 * JIRA: RTLCRPMBDV-442 (DA-527 - SMS & PN Enhancement) Neel: 14-Nov-2016 Three
	 * means of notifying a customer for credit card transactions
	 */

	public static class MANAGED_CARD_REASONS {
		private MANAGED_CARD_REASONS() {
		}

		public static class MOBILE_BLOCK_REASONS {
			private MOBILE_BLOCK_REASONS() {
			}

			public static final int LOST = 1;
			public static final int STOLEN = 2;
			public static final int OTHERS = 3;
		}

		public static class IMAL_BLOCK_REASONS {
			private IMAL_BLOCK_REASONS() {
			}

			public static final int STOLEN = 2;
			public static final int LOST = 2;
			public static final int OTHERS = 3;
			public static final int DAMAGE = 1;
		}

		public static class REPLACE_REASONS {
			private REPLACE_REASONS() {
			}

			public static final int DAMAGED = 1;
			public static final int LOST = 3;
			// public static final int STOLEN = 4 ;
			public static final int LOST_OR_STOLEN = 3;
			public static final int OTHERS = 6;
		}

	}

	public static class NFC {
		private NFC() {
		}

		public static class WALLET_ACTIONS {
			private WALLET_ACTIONS() {
			}

			public static final Integer GET_CARDS = 1;
			public static final boolean ENABLE_VTS_DEBIT = true;
			public static final boolean ENABLE_FOO_DEBIT = true;
		}

		public static class DEBIT {
			private DEBIT() {
			}

			public static class PAYMENT_CHANNEL {
				private PAYMENT_CHANNEL() {
				}

				public static final int NONE = 0;
				public static final int POS_ONLY = 1;
				public static final int ATM_ONLY = 2;
				public static final int POS_AND_ATM = 3;
				public static final int DEFAULT_PAYMENT_CHANNEL = 3;
			}

			public static class COUNTRIES {
				private COUNTRIES() {
				}

				public static final String KUWAIT = "0414";
			}

			public static class POS_VALUES {
				private POS_VALUES() {
				}

				public static final String ISSUER_APP_DATA = "06010A03A02000"; // "06010A03000000";// "06010A03A02000" ;
				public static final String TRIPLE_DES_DECRYPTION_KEY = "A3B1F3A060784BEDC3AAEBF5068478D7";
				public static final String SERVICE_CODE = "226";
				public static final String CVV_FLAG = "0";
				public static final String APP_INTERCHANGE_PROFILE = "2040";
				public static final String CARD_TRANSACTION_QUALIFIERS = "8000";
				public static final String FORM_FACTOR_INDICATOR = "238C0000"; // 9F6E

				// hotfix:RTLCRPMBDV-1264: pinless
				public static final String PINLESS_CVM_LIST = "000000000000000002031E031F00";
				public static final String QUALIFIER = "8000";

			}

			private static List<String> eligibleCardsList = new ArrayList<String>() {
				private static final long serialVersionUID = 1L;
				{
					// below 5 card types for UAT only
					add("8");
					add("18");
					add("38");
					add("40");
					add("39");

					add("46"); // Contacless Plat Deb
					add("47"); // Contact Infinite Deb (ID: 47)
					add("48"); // Contactless Gold Debit
					add("52"); // Barwa Infinite Debit
					add("53"); // WOW NFC DEBIT ATM (ID: 53)
					add("54"); // Click Debit Card
					add("58"); // One Debit Card

					// CR:DA-769 : U-TAP Mobile Service Debit Cards Allowed
					add("71");// Platinum � Debit
					add("72");// Private � Debit Card
					add("73");// Normal � Debit Card
					add("74");// New Click Debit Card
					add("76");// One � Debit card

					// RTLIBSUPRT-634 : New Cards for NFC
					add("77");// Mass Debit Card
					add("78");// Alghali Debit Card
				}
			};

			public static List<String> getEligibleCardsList() {
				return eligibleCardsList;
			}

		}

		public static class CREDIT {
			private CREDIT() {
			}

			private static List<Integer> eligibleCreditCardsList = new ArrayList<Integer>(5);

			static {
				eligibleCreditCardsList.add(ELIGIBLE_NFC_CREDIT_CARDS_CODES.CP_VISA_GOLD);
				eligibleCreditCardsList.add(ELIGIBLE_NFC_CREDIT_CARDS_CODES.CP_VISA_SIGNATURE);
				eligibleCreditCardsList.add(ELIGIBLE_NFC_CREDIT_CARDS_CODES.CP_VISA_INFINIT);
				eligibleCreditCardsList.add(ELIGIBLE_NFC_CREDIT_CARDS_CODES.CP_VISA_PREPAID);
			}

			public static List<Integer> getEligibleCreditCardsList() {
				return eligibleCreditCardsList;
			}

			public static class ELIGIBLE_NFC_CREDIT_CARDS_CODES {
				private ELIGIBLE_NFC_CREDIT_CARDS_CODES() {
				}

				public static final Integer CP_VISA_GOLD = 27;
				public static final Integer CP_VISA_SIGNATURE = 30;
				public static final Integer CP_VISA_INFINIT = 31;
				public static final Integer CP_VISA_PREPAID = 34;

			}

			public static class VISA_TOKEN_PROVISIONING_STATUS {
				private VISA_TOKEN_PROVISIONING_STATUS() {
				}

				public static final Integer ACTIVE = 1;
				public static final Integer DISABLED = 2;
				public static final Integer DELETED = 3;
				public static final Integer WAITING_OTP_ACTIVATION = 4;
				public static final Integer WAITING_VISA_STATUS = 5;
			}

			public static class VISA_OPERATION {
				private VISA_OPERATION() {
				}

				public static final String SUSPEND = "suspend";
				public static final String RESUME = "resume";
				public static final String DELETE = "delete";
			}
		}

		public static class STATUS {
			private STATUS() {
			}

			public static final int ALL = -1;
			public static final int NON = 0;
			public static final int ACTIVE = 1;
			public static final int DISABLED = 2;
			public static final int DELETED = 3;
			public static final int OTP_PENDING = 4;
			public static final int VISA_PENDING = 5;
		}
	}

	/**
	 * weblogic and jvm runtime env
	 */
	public static class RUNTIME_ENVIRONMENT {
		private RUNTIME_ENVIRONMENT() {
		}

		public static final Integer DOMAIN_SPECIFIC_VARIABLES = 1;
		public static final Integer DEFAULT_LOG_BATCH_LIMIT = 100;
		public static final Integer RANDOMIZED_DIGITS_TO_THE_SEQUENCE = 5;
	}

	public static class BENEFICIARIES {
		private BENEFICIARIES() {
		}

		public static final String BENF_INQ_SESSION = "noOfBenInquiries";

		public static class SETTINGS_STATUS {
			public static final int INQUIRY_ENABLED = 1;
			public static final int INQUIRY_DISABLED = 0;
			public static final int NOT_SET = 2;
		}

		public static class BBYN_BENEFEFIARY {
			public static final int SEARCH_BY_ACCT_NUMBER = 1;
			public static final int SEARCH_BY_MOBILE_NUMBER = 2;

		}
	}

	public static class EXPAND_COLLAPSE_PRODUCTS {
		private EXPAND_COLLAPSE_PRODUCTS() {
		}

		public static final int COLLAPSED_PRODUCTS = 0;
		public static final int EXPANDED_PRODUCTS = 1;
		public static final int DEFAULT_PRODUCTS = 2; // which means IS_PRODUCTS_EXPANDED column in the Database is null
														// (by default the products will be collapsed)

	}

	/**
	 * verify user email
	 */
	public static class EMAIL_VALIDATOR {
		private EMAIL_VALIDATOR() {
		}

		public static final String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		// using RFC822 compliant regex adapted for Java:

		public static final String EMAIL_RFC822_REGEX = "(?:(?:\\r\\n)?[ \\t])*(?:(?:(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\"(?:[^\\\"\\r\\\\]|\\\\.|(?:(?:\\r\\n)?[ \\t]))*\"(?:(?:\\r\\n)?[ \\t])*)(?:\\.(?:(?:\\r\\n)?[ \\t])*(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\"(?:[^\\\"\\r\\\\]|\\\\.|(?:(?:\\r\\n)?[ \\t]))*\"(?:(?:\\r\\n)?[ \\t])*))*@(?:(?:\\r\\n)?[ \\t])*(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\\[([^\\[\\]\\r\\\\]|\\\\.)*\\](?:(?:\\r\\n)?[ \\t])*)(?:\\.(?:(?:\\r\\n)?[ \\t])*(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\\[([^\\[\\]\\r\\\\]|\\\\.)*\\](?:(?:\\r\\n)?[ \\t])*))*|(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\"(?:[^\\\"\\r\\\\]|\\\\.|(?:(?:\\r\\n)?[ \\t]))*\"(?:(?:\\r\\n)?[ \\t])*)*\\<(?:(?:\\r\\n)?[ \\t])*(?:@(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\\[([^\\[\\]\\r\\\\]|\\\\.)*\\](?:(?:\\r\\n)?[ \\t])*)(?:\\.(?:(?:\\r\\n)?[ \\t])*(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\\[([^\\[\\]\\r\\\\]|\\\\.)*\\](?:(?:\\r\\n)?[ \\t])*))*(?:,@(?:(?:\\r\\n)?[ \\t])*(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\\[([^\\[\\]\\r\\\\]|\\\\.)*\\](?:(?:\\r\\n)?[ \\t])*)(?:\\.(?:(?:\\r\\n)?[ \\t])*(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\\[([^\\[\\]\\r\\\\]|\\\\.)*\\](?:(?:\\r\\n)?[ \\t])*))*)*:(?:(?:\\r\\n)?[ \\t])*)?(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\"(?:[^\\\"\\r\\\\]|\\\\.|(?:(?:\\r\\n)?[ \\t]))*\"(?:(?:\\r\\n)?[ \\t])*)(?:\\.(?:(?:\\r\\n)?[ \\t])*(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\"(?:[^\\\"\\r\\\\]|\\\\.|(?:(?:\\r\\n)?[ \\t]))*\"(?:(?:\\r\\n)?[ \\t])*))*@(?:(?:\\r\\n)?[ \\t])*(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\\[([^\\[\\]\\r\\\\]|\\\\.)*\\](?:(?:\\r\\n)?[ \\t])*)(?:\\.(?:(?:\\r\\n)?[ \\t])*(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\\[([^\\[\\]\\r\\\\]|\\\\.)*\\](?:(?:\\r\\n)?[ \\t])*))*\\>(?:(?:\\r\\n)?[ \\t])*)|(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\"(?:[^\\\"\\r\\\\]|\\\\.|(?:(?:\\r\\n)?[ \\t]))*\"(?:(?:\\r\\n)?[ \\t])*)*:(?:(?:\\r\\n)?[ \\t])*(?:(?:(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\"(?:[^\\\"\\r\\\\]|\\\\.|(?:(?:\\r\\n)?[ \\t]))*\"(?:(?:\\r\\n)?[ \\t])*)(?:\\.(?:(?:\\r\\n)?[ \\t])*(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\"(?:[^\\\"\\r\\\\]|\\\\.|(?:(?:\\r\\n)?[ \\t]))*\"(?:(?:\\r\\n)?[ \\t])*))*@(?:(?:\\r\\n)?[ \\t])*(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\\[([^\\[\\]\\r\\\\]|\\\\.)*\\](?:(?:\\r\\n)?[ \\t])*)(?:\\.(?:(?:\\r\\n)?[ \\t])*(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\\[([^\\[\\]\\r\\\\]|\\\\.)*\\](?:(?:\\r\\n)?[ \\t])*))*|(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\"(?:[^\\\"\\r\\\\]|\\\\.|(?:(?:\\r\\n)?[ \\t]))*\"(?:(?:\\r\\n)?[ \\t])*)*\\<(?:(?:\\r\\n)?[ \\t])*(?:@(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\\[([^\\[\\]\\r\\\\]|\\\\.)*\\](?:(?:\\r\\n)?[ \\t])*)(?:\\.(?:(?:\\r\\n)?[ \\t])*(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\\[([^\\[\\]\\r\\\\]|\\\\.)*\\](?:(?:\\r\\n)?[ \\t])*))*(?:,@(?:(?:\\r\\n)?[ \\t])*(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\\[([^\\[\\]\\r\\\\]|\\\\.)*\\](?:(?:\\r\\n)?[ \\t])*)(?:\\.(?:(?:\\r\\n)?[ \\t])*(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\\[([^\\[\\]\\r\\\\]|\\\\.)*\\](?:(?:\\r\\n)?[ \\t])*))*)*:(?:(?:\\r\\n)?[ \\t])*)?(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\"(?:[^\\\"\\r\\\\]|\\\\.|(?:(?:\\r\\n)?[ \\t]))*\"(?:(?:\\r\\n)?[ \\t])*)(?:\\.(?:(?:\\r\\n)?[ \\t])*(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]]))|\"(?:[^\\\"\\r\\\\]|\\\\.|(?:(?:\\r\\n)?[ \\t]))*\"(?:(?:\\r\\n)?[ \\t])*))*@(?:(?:\\r\\n)?[ \\t])*(?:[^()<>@,;:\\\\\".\\[\\] \\000-\\031]+(?:(?:(?:\\r\\n)?[ \\t])+|\\Z|(?=[\\[\"()<>@,;:\\\\\".\\[\\]])";

	}

	/**
	 * JIRA: RTLCRPMBDV-487 (DA-552 - Cash Back Transactions) Neel: 14-Dec-2016 The
	 * field value to use as description when cashback is requested
	 */
	public static class TRANSACTIONS_HISTORY {
		private TRANSACTIONS_HISTORY() {
		}

		public static final String CASH_BACK_DESCRIPTION = "Cash%Back%";// The value that will be passed to IMAL to
																		// filter in case of debit cards
		public static final String PURCHASE = "PURCHASE";
		public static final String PAYMENT = "PAYMENT";
		public static final String DEBIT = "Dr";
		public static final String CREDIT = "Cr";
		// public static final String CREDIT_CARD_CASH_BACK_DESCR = "Cash Back%";//The
		// value that will be passed to IMAL to filter in case of debit cards

		private static ArrayList<String> excludecashbackListForDebitAccounts = new ArrayList<String>() {
			private static final long serialVersionUID = 1L;
			{
				add("808");// Mobile Cash Back
			}
		};

		public static ArrayList<String> getExcludecashbackListForDebitAccounts() {
			return excludecashbackListForDebitAccounts;
		}

	}

	public static class KNET_SPECIAL_CHAR_REPLACEMENT {
		private KNET_SPECIAL_CHAR_REPLACEMENT() {
		}

		public static final String BACK_SLASH_REPLACEMENT = "WEFRKT";
	}

	/*
	 * JIRA: RTLCRPMBDV-623 (New Murabaha Offers MVP Tasks) [Neel 27-02-2017: Define
	 * the various Murabaha application status]
	 * 
	 */
	public static class MURABAHA_APPLICATION_STATUS {
		private MURABAHA_APPLICATION_STATUS() {
		}

		public static final int NEW = 1;// This will be the default value when the customer hasnt taken an action yet
		public static final int INITIAL_APPLICATION_SUBMITTED = 2;// Application is Submitted and a lead is created
		public static final int REVIEW_DRAFT_CONTRACT = 3;// Draft Contract is ready for review
		public static final int DRAFT_CONTRACT_ACCEPTED = 4;// This is when the reflection period starts
		public static final int REFLECTION_PERIOD_COMPLETE = 5;// Reflection period is already complete
		public static final int REUPLOAD_SALARY_CERTIFICATE = 6;// Salary Certificate needs to be uploaded again
		public static final int CONTRACT_REJECTED_BY_CUSTOMER = 9;// Contract has been rejected by Customer
		public static final int CONTRACT_REJECTED_BY_ADMIN = 10;// Contract has been rejected by Operations Team

	}// MURABAHA_APPLICATION_STATUS

	/*
	 * JIRA: RTLCRPMBDV-623 (New Murabaha Offers MVP Tasks) [Neel 27-02-2017: Define
	 * the various Finance Types]
	 * 
	 */
	public static class MURABAHA_FINANCE_TYPES {
		private MURABAHA_FINANCE_TYPES() {
		}

		public static final int CONSTRUCTION = 1;
		public static final int HOME_RENOVATION = 2;
		public static final int LAND_PURCHASE = 3;

		public static final String CONSTRUCTION_STR = "Construction";
		public static final String HOME_RENOVATION_STR = "Home Renovation";
		public static final String LAND_PURCHASE_STR = "Land Purchase";

	}// MURABAHA_FINANCE_TYPES

	/*
	 * JIRA: RTLCRPMBDV-623 (New Murabaha Offers MVP Tasks) [Neel 27-02-2017: Define
	 * the various Product Class Codes]
	 * 
	 */
	public static class MURABAHA_PRODUCT_CLASS_CODES {
		private MURABAHA_PRODUCT_CLASS_CODES() {
		}

		public static final int CONSTRUCTION_LOW = 120;
		public static final int HOME_RENOVATION_LOW = 107;
		public static final int LAND_PURCHASE_LOW = 121;

		public static final int CONSTRUCTION_HIGH = 117;
		public static final int HOME_RENOVATION_HIGH = 118;
		public static final int LAND_PURCHASE_HIGH = 119;

	}// MURABAHA_PRODUCT_CLASS_CODES

	/*
	 * JIRA: RTLCRPMBDV-623 (New Murabaha Offers MVP Tasks) [Neel 27-02-2017: Define
	 * the various Deal Types]
	 * 
	 */
	public static class MURABAHA_DEAL_TYPES {
		private MURABAHA_DEAL_TYPES() {
		}

		public static final int NEW_MURABAHA = 1;
		public static final int TOPUP_MURABAHA = 2;
	}// MURABAHA_DEAL_TYPES

	/*
	 * JIRA: RTLCRPMBDV-623 (New Murabaha Offers MVP Tasks) [Neel 08-03-2017: Define
	 * the various LMS Lead Status Types]
	 * 
	 */
	public static class LMS_LEAD_STATUS {
		private LMS_LEAD_STATUS() {
		}

		public static final int NEW_LEAD = 1;// Customer submits application request
		public static final int CONTRACT_UPLOADED_FOR_REVIEW = 2;// Operations Approves the Request and uploads contract
																	// for Review
		public static final int CUSTOMER_APPROVES_CONTRACT = 3;// Customer Approves the draft contract
		public static final int CUSTOMER_REJECTED = 4;// Customer rejects the draft contract
		public static final int CUSTOMER_CANCELLED_APPLICATION = 5;// Customer cancels the request after the first
																	// application
		public static final int OPERATIONS_REJECTED_APPLICATION = 6;// Operations review the application and reject the
																	// customer request
		public static final int OPERATIONS_CLOSED = 7;// Operations Closed the Lead
		public static final int SALARY_CERTIFICATE_NEEDED = 8;// Customer needs to re-upload salary certificate
		public static final int SALARY_CERTIFICATE_UPLOADED = 9;// Customer has re-uploaded salary certificate

		// All Possible Closed statuses from LMS
		public static final String LMS_LEAD_CLOSED_STATUS = "Closed-Expired";// This is the lead status received from
																				// LMS inquiry service
		public static final String LMS_LEAD_CLOSED_SALE_STATUS = "Sale";// This is the lead status received from LMS
																		// inquiry service
		public static final String LMS_LEAD_CLOSED_RETURNED_STATUS = "Closed-Returned";// This is the lead status
																						// received from LMS inquiry
																						// service
		public static final String LMS_LEAD_CLOSED_SOLD_STATUS = "Sold - By System";// This is the lead status received
																					// from LMS inquiry service
		public static final String LMS_LEAD_CLOSED_REJECTED_STATUS = "Rejected";// This is the lead status received from
																				// LMS inquiry service

	}// LMS_LEAD_STATUS

	/*
	 * JIRA: RTLCRPMBDV-623 (New Murabaha Offers MVP Tasks) [Neel 08-03-2017: Define
	 * the various Employment Types]
	 * 
	 */
	public static class EMPLOYMENT_TYPES {
		private EMPLOYMENT_TYPES() {
		}

		public static final int EMPLOYED = 1;
		public static final int RETIRED = 2;
	}// EMPLOYMENT_TYPES

	/*
	 * JIRA: RTLCRPMBDV-623 (New Murabaha Offers MVP Tasks) [Neel 08-03-2017: Define
	 * the various Entity Types]
	 * 
	 */
	public static class ENTITY_TYPES {
		private ENTITY_TYPES() {
		}

		public static final int BANK = 1;
		public static final int CREDIT_CARD = 2;
		public static final int OTHERS = 3;
	}// EMPLOYMENT_TYPES

	/*
	 * JIRA: RTLCRPMBDV-623 (New Murabaha Offers MVP Tasks) [Neel 08-03-2017: Define
	 * the various constant values used in Murabaha Deal Services]
	 * 
	 */
	public static class MURABAHA_DEAL_CONSTANTS {
		private MURABAHA_DEAL_CONSTANTS() {
		}

		public static final String CALCULATOR_BRANCH_CODE = "994";// 994 is the Finance Group
		public static final String DEFAULT_UPLOAD_ATTACHMENT_NAME = "Sal";// Lead creation default attachment name. Its
																			// stored as <leadId>-SAL.jpg
		public static final String DEFAULT_CHANNEL_ID = "78";// Will be used in addNewLead Service
		public static final String DEFAULT_PRODUCT_ID = "7";// Will be used in addNewLead Service
		public static final String DEFAULT_PRODUCT_DESC = "MURABAHA";// Will be used for Auditing
		public static final String RETIRED_DESC = "Retired";// Will be used to validate employment type of customer from
															// eligibility

		public static final int RANGE_DIFFERENTIATOR_OVER_50 = 250;// Rage Differentiator for Principal amount over
																	// 50,000
		public static final int RANGE_DIFFERENTIATOR_OVER_15 = 100;// Rage Differentiator for Principal amount over
																	// 15,000
		public static final int RANGE_DIFFERENTIATOR_OVER_MIN = 50;// Rage Differentiator for Principal amount over 1000
		public static final int MAX_ELIGIBLE_AMOUNT = 70000;// Used by Calculator
		public static final int MAX_MONTHS_POSSIBLE = 180;// Allowed maximum months for any finance deal as allowed by
															// CBK
		public static final Double MIN_ELIGIBLE_AMOUNT = 1000.00;// This will be used by Calculator to set min value for
																	// New Finance

		public static final String TRANSACTION_TYPE_NEW = "New Murabaha";// Used by Appointment
		public static final String TRANSACTION_TYPE_TOPUP = "Murabaha re-financing";// Used by Appointment
		public static final String DEFAULT_PRODUCT_CATEGORY_MURABAHA = "1";// Currently only one product category. This
																			// will be used as input for getFiles

	}// MURABAHA_DEAL_CONSTANTS

	/*
	 * JIRA: RTLCRPMBDV-623 (New Murabaha Offers MVP Tasks) [Neel 08-03-2017: Define
	 * the various constant values for File Request Types]
	 * 
	 */
	public static class FILE_REQUEST_TYPES {
		private FILE_REQUEST_TYPES() {
		}

		public static final Integer DRAFT_CONTRACT = 1;// For retrieving only the draft contract available on LMS
		public static final Integer SALARY = 2;// For retrieving the salary certificate
		public static final Integer ALL = 3;// All files

		public static final String DRAFT_CONTRACT_DESC = "Draft Contract";
		public static final String SALARY_DESC = "Salary";// For retrieving the salary certificate
		public static final String ALL_DESC = "All";// All files
	}// FILE_REQUEST_TYPES

	/*
	 * JIRA: RTLCRPMBDV-623 (New Murabaha Offers MVP Tasks) [Neel 08-03-2017: Define
	 * the various constant values for Appointment Types]
	 * 
	 */
	public static class APPOINTMENT_ACTION_TYPES {
		private APPOINTMENT_ACTION_TYPES() {
		}

		public static final Integer BOOK_APPOINTMENT = 1;
		public static final Integer CANCEL_APPOINTMENT = 2;
		public static final Integer REQUEST_RM_FOR_CALL = 3;

		public static final String BOOK_APPOINTMENT_DESC = "Book Appointment";
		public static final String CANCEL_APPOINTMENT_DESC = "Cancel Appointment";
		public static final String REQUEST_RM_FOR_CALL_DESC = "Request RM for Call";
	}// APPOINTMENT_ACTION_TYPES

	/**
	 * it's used to parse an XML document
	 * 
	 * So, after XML normalization, we map XML tags to java constants to facilitate
	 * parsing.
	 */
	public enum XML_TAG_NAMES {
		ENVIRONMENT						("environment"),
		US_PRODUCT_IDS					("US_PRODUCT_IDS"),
		US_PRODUCT_VALUES				("US_PRODUCT_VALUES"),
		UK_PRODUCT_IDS					("UK_PRODUCT_IDS"),
		UK_PRODUCT_VALUES				("UK_PRODUCT_VALUES"),
		GOOGLE_PRODUCT_IDS 				("GOOGLE_PRODUCT_IDS"),
		GOOGLE_PRODUCT_VALUES			("GOOGLE_PRODUCT_VALUES"),
		ACTION	 						("action"),
		NEW_PAYMENT_GATEWAY				("newPaymentGateway"),
		CURRENCY						("currency"),
		ALIAS							("alias"),		
		PAYME_ALIAS						("paymealias"),
		PAYME_IN_APP_AIAS_NEW_PGW		("paymeInAppAliasNewPGW"),
		PAYME_SHARE_AIAS_NEW_PGW		("paymeShareAppAliasNewPGW"),
		RESPONSE_URL 					("responseURL"),
		RESOURCE_PATH 					("resourcePath"),
		KEY_STORE_PATH					("keystorepath"),		
		ERROR_URL 						("errorURL"),
		KNET_RESULT_URL 				("knetResultURL"),
		PAYME_RESULT_URL 				("paymeResultURL"),
		KNET_GL_SUSPENSE_ACCOUNT		("glSuspenseAccount"),
		PAYME_GL_SUSPENSE_ACCOUNT		("paymeglSuspenseAccount"),
		BRANCH_CODE						("branchCode"),
		PAYME_BRANCH_CODE				("paymebranchCode"),
		IMAL_TRX_TYPE					("imalTrxType"),
		PAYME_IMAL_TRX_TYPE				("paymeimalTrxType"),
		ALTERNATIVE_EMAILS				("alternativeEmails"),
		ANDROID_APP_ID					("androidAppId"),
		IPHONE_APP_ID					("iphoneAppId"),
		SHARED_FILESYSTEM				("SHARED_FILESYSTEM"),
		TRIPLE_DES_DECRYPTION_KEY		("TRIPLE_DES_DECRYPTION_KEY"),
		BOOQ_CARDLESS_SUSPENSE_ACCT	 	("BOOQ_CARDLESS_SUSPENSE_ACCT"),
		BOOQ_CARDLESS_IMAL_TRANS_TYPE	("BOOQ_CARDLESS_IMAL_TRANS_TYPE"),
		BOOQ_CARDLESS_IMAL_BRANCH		("BOOQ_CARDLESS_IMAL_BRANCH"),
		BOOQ_TRANSFER_POOL_ACCT			("BOOQ_TRANSFER_POOL_ACCT"),
		BOOQ_TRANSFER_IMAL_TRANS_TYPE	("BOOQ_TRANSFER_IMAL_TRANS_TYPE"),
		BOOQ_TRANSFER_IMAL_BRANCH		("BOOQ_TRANSFER_IMAL_BRANCH"),
		BOOQ_ALLOWD_IP					("BOOQ_ALLOWD_IP"),
		DATA_SOURCE						("DATA_SOURCE"),
		SECURITY_KEY_1					("SECURITY_KEY_1"),
		SECURITY_KEY_2					("SECURITY_KEY_2"),
		BATCH_LIMIT_LOG					("BATCH_LIMIT_LOG"),
		BATCH_LIMIT_WS_LOG				("BATCH_LIMIT_WS_LOG"),
		BATCH_LIMIT_RS_LOG				("BATCH_LIMIT_RS_LOG"),
		BATCH_LIMIT_ECHAT_LOG			("BATCH_LIMIT_ECHAT_LOG"),
		ENABLE_RS_LOG					("ENABLE_RS_LOG"),
		CHAT_ICONS_URL_PATH				("CHAT_ICONS_URL_PATH"),
		MAX_VISIBLE_COMPONENTS			("MAX_VISIBLE_COMPONENTS"),
		NUM_OF_TRANSACTION_IN_BUBBLE	("NUM_OF_TRANSACTION_IN_BUBBLE"),
		CHAT_LAST_NUM_OF_DAYS			("GET_CHAT_HISTORY_NUM_OF_DAYS"),
		ORGANIZATION_SALARY_SOURCE_DATA ("ORGANIZATION_SALARY_SOURCE_DATA_SOA"),
		SESSION_COMPLETION_STAGE_SECONDS ("SESSION_COMPLETION_STAGE_SECONDS"),
		SOA_END_POINT_ADDRESS_PREFIX    ("endPointAddressPrefix"),
		CACHE_METHOD        			("CACHE_METHOD"),
		ENABLE_GENUINE_DEVICE_CHECK_IOS	("ENABLE_GENUINE_DEVICE_CHECK_IOS"),
		ENABLE_GENUINE_DEVICE_CHECK_ANDROID	("ENABLE_GENUINE_DEVICE_CHECK_ANDROID"),
		FORCE_VALIDATE_GENUINE_DEVICE_CHECK_IOS ("FORCE_VALIDATE_GENUINE_DEVICE_CHECK_IOS"),
		FORCE_VALIDATE_GENUINE_DEVICE_CHECK_ANDROID ("FORCE_VALIDATE_GENUINE_DEVICE_CHECK_ANDROID"),
		ENABLE_SILENT_PN ("ENABLE_SILENT_PN"),
		VOUCHER_TRX_TYPES ("VOUCHER_TRX_TYPES"),
		MAX_ALLOWED_SUGGESTION_IN_POPUP ("MAX_ALLOWED_SUGGESTION_IN_POPUP"),
		MAX_ALLOWED_SUGGESTION_MSA3ED ("MAX_ALLOWED_SUGGESTION_MSA3ED"),
		MAX_ALLOWED_SUGGESTION_WHATSAPP ("MAX_ALLOWED_SUGGESTION_WHATSAPP"),
		WHATSAPP_NO ("WHATSAPP_NO"),
		DENIED_IOS_STATUS ("DENIED_IOS_STATUS"),
		MSA3ED_ML_RULE_1 ("MSA3ED_ML_RULE_1"),
		WHATSAPP_NOT_REPLY_MAX_MINUTES ("WHATSAPP_NOT_REPLY_MAX_MINUTES"),
		;/* the end!! */

		/**
		 * below code is allowing enum to support string
		 */
		private final String name;

		private XML_TAG_NAMES(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return name;
		}
	}

	/**
	 * it's used to mask rest sensitive information. Just add the JSON key name
	 * here, and its value will be masked
	 */
	public enum JSON_SENSITIVE_KEY_NAME {
		BASIC_AUTH_USERNAME("basicAuthUsername"), BASIC_AUTH_PASSWORD("basicAuthPassword"),
		QUESTION_TEXT("questionText"), LOGIN_ANSWER("loginAnswer")

		/* the end!! */;

		/**
		 * below code is allowing enum to support string
		 */
		private final String name;

		private JSON_SENSITIVE_KEY_NAME(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return name;
		}
	}

	public static class SITE_KEY_ERROR_TEMPLATE {
		private SITE_KEY_ERROR_TEMPLATE() {
		}

		public static final String CIF_INVALID_PIN = " - CIF:#CIF#";
		public static final String REGISTRATION = "";
		public static final String LOGIN = " - entered username:#username#, entered CivilId:#civilID#";
		public static final String LOGIN_CORRECT_USERNAME = " - correct username:#correctUsername#";
		public static final String CORRECT_CIVILID = " - correct CivilId:#correctCivilID#";
		public static final String LOGIN_ANSWER = " - entered answer:#answer#";
		public static final String FORGET_SKEY_INVALID_CID = " - entered CivilId:#civilID#";
		public static final String FORGET_SKEY_INVALID_ACT = " - entered act number:#actNumber#";
	}

	public static class TRANSFER_LIMIT {
		private TRANSFER_LIMIT() {
		}

		public static class TRANSFER_LIMIT_TYPES {
			private TRANSFER_LIMIT_TYPES() {
			}

			public static final Integer IMAL_LOWER_ID = 7517;
			public static final Integer IMAL_HIGHER_ID = 7518;
			public static final Integer MOBILE_LOWER_ID = 1;
			public static final Integer MOBILE_HIGHER_ID = 2;
			public static final Integer MOBILE_EXCEPTIONAL_ID = 0;
		}
	}

	// Added the below for refractoring
	public static class TRANSFER_TYPE {
		private TRANSFER_TYPE() {
		}

		public static final int SINGLE_TRANSFER = 1;
		public static final int MULTIPLE_TRANSFER = 2;
	}

	public static class TEMPLATES {
		private TEMPLATES() {
		}

		public static final String UPDATE_EMAIL_VERIFY_TEMPLATE = "WEB-INF/templates/mailUpdateTemplate.html";
	}

	public static class APPLICATIONS_VERSIONS {
		private APPLICATIONS_VERSIONS() {
		}

		public static class ANDROID {
			private ANDROID() {
			}

			public static final String R1_RELEASE = "4.3.0";
			public static final String R2_RELEASE = "4.4.0";
			public static final String R1_2018 = "4.6.0";
			public static final String UX_UI_REVAMP = "6.0.0";

		}

		public static class IPHONE {
			private IPHONE() {
			}

			public static final String R1_RELEASE = "4.2.0";
			public static final String R2_RELEASE = "4.3.0";
			public static final String R1_2018 = "4.4.0";
			public static final String UX_UI_REVAMP = "6.0.0";

		}

		public static class SOA_FLAG {
			private SOA_FLAG() {
			}

			public static final boolean SMS_CHARGES_APPLIED = true; // this flag will be removed if SOA deployed SMS
																	// charges C on R3
		}

		public static class ENVIRONMENT {
			private ENVIRONMENT() {
			}

			public static final String UAT = "UAT";
			public static final boolean DISABLE_JSON_ENCRYPTION = false;

		}

	}

	public static class REST_API_GENERIC_CONSTANTS {
		private REST_API_GENERIC_CONSTANTS() {
		}

		public static final Integer ENCRYPTED_REQUEST_MAX_LENGTH = 2500;
		public static final Integer DECRYPTED_REQUEST_MAX_LENGTH = 1500;
	}

	/**
	 * @author Neelkanth Tripathi
	 * @JIRA_Ref: RTLCRPMBDV-1049 (New Cache Design for Performance Improvement)
	 * 
	 *            These constants represent the product types that are returned by
	 *            getCIFLastDetails Service in SOA
	 */
	public static class CUSTOMER_PRODUCT_UPDATE_TYPES {
		private CUSTOMER_PRODUCT_UPDATE_TYPES() {
		}

		public static final String CIF_DETAILS = "CIF_DETAILS";
		public static final String ACC_DETAILS = "ACC_DETAILS";
		public static final String DEAL_DETAILS = "DEAL_DETAILS";
		public static final String FD_DETAILS = "FD_DETAILS";
		public static final String CARDS_DETAILS = "CARDS_DETAILS";
		public static final String TRX_DETAILS = "TRX_DETAILS";
		public static final String CREDITCARDS_DETAILS = "CREDITCARDS_DETAILS";
		public static final String FUND_DETAILS = "FUND_DETAILS";
	}

	/**
	 * @author Neelkanth Tripathi
	 * @JIRA_Ref: RTLCRPMBDV-1049 (New Cache Design for Performance Improvement)
	 * 
	 *            All product categories that we use for caching on login
	 */
	public static enum PRODUCT_CATEGORY_FOR_CACHE {
		ACCOUNT_DETAILS, FINANCE_DETAILS, CARDS_DETAILS, FUND_DETAILS, CIF_DETAILS;
		private PRODUCT_CATEGORY_FOR_CACHE() {
		}
	}

	public static class PORTFOLIO_ROW_TYPES {
		private PORTFOLIO_ROW_TYPES() {
		}

		public static final String CARD = "CARD";
		public static final String FUND = "ASSETS PORTFOLIO";
		public static final String MURABAHA = "DEAL";
	}

	/**
	 * @author Neelkanth Tripathi
	 * @JIRA_Ref: RTLCRPMBDV-1049 (New Cache Design for Performance Improvement)
	 * 
	 *            These constant values are the keys in the DB stored in
	 *            Security_config Table that holds all sensitive values in encrypted
	 *            form
	 */
	public static class SECURITY_CONFIGURATION_KEYS {
		private SECURITY_CONFIGURATION_KEYS() {
		}

		public static final Integer SOA_USER_NAME = 1;
		public static final Integer SOA_PASS_PHRASE = 2;
		public static final Integer KEY_IPHONE_ENCRYPTED_VAL = 3;
		public static final Integer KEY_ANDROID_ENCRYPTED_VAL = 4;
		public static final Integer SUPER_AES_IPHONE_REQUEST_RESPONSE_PAYLOAD_ENCRYPTION_KEY_VAL = 5; // 5000;
		public static final Integer SUPER_AES_ANDROID_REQUEST_RESPONSE_PAYLOAD_ENCRYPTION_KEY_OLD_VAL = 6;
		public static final Integer SUPER_AES_ANDROID_REQUEST_RESPONSE_PAYLOAD_ENCRYPTION_KEY_VAL = 7;
		public static final Integer INFOSYS_ENCRYPTION_KEY_VAL = 8;
		public static final Integer KEY_ENCRYPTED_VAL = 9;
		public static final Integer SUPER_AES_KEY_IPHONE_VAL = 10; // 10000;
		public static final Integer SUPER_AES_KEY_ANDROID_VAL = 11;
		public static final Integer SUPER_AES_KEY_ANDROID_OLD_VAL = 12;
		public static final Integer CARD_PIN_ENCRYPTION_KEY = 13;
		public static final Integer BACK_OFFICE_DOMAIN_CONFIG_PWD = 14;
		public static final Integer BBYN_RELAY_MAIL_AUTH_CONFIG_PWD = 15;
		public static final Integer PAYLOAD_HASHING_KEY = 16;
	}

	public static class BANK_OBJETCS_TYPES {
		private BANK_OBJETCS_TYPES() {
		}

		public static final Integer ALL_TYPES = 0;
		public static final Integer BRANCH = 1;
		public static final Integer usman_DIRECT = 2;
		public static final Integer ATM = 3;
		public static final Integer ATM_SPECIAL_NEEDS = 4;
		public static final Integer CARD_ISSUANCE = 5;
		public static final Integer CORPORATE_BRANCHES = 6;

		public static class HASHMAP_KEYS {
			private HASHMAP_KEYS() {
			}

			public static final String BRACNH = "branch";
			public static final String ATM = "atm";
			public static final String usman_DIRECT = "usmanDirect";
			public static final String CARD_ISSUANCE = "cardIssuance";
			public static final String CORPORATE_BRANCHES = "corporateBranch";
		}

		private static ArrayList<Integer> privateBankingCodes = new ArrayList<Integer>() {
			private static final long serialVersionUID = 1L;
			{
				add(6);
			}
		};

		public static List<Integer> getPrivateBankingCodes() {
			return privateBankingCodes;
		}

	}

	/**
	 * @author Neelkanth Tripathi
	 * @JIRA_Ref: RTLCRPMBDV-1014 (Update Client Profile)
	 * 
	 *            These constant values are the keys that will be used to identify a
	 *            particular field that has been edited on mobile app
	 */
	public static class PROFILE_UPDATE_KEYS {
		private PROFILE_UPDATE_KEYS() {
		}

		public static final Integer MARITAL_STATUS = 1;
		public static final Integer EDUCATION = 2;
		public static final Integer COMMUNICATION_LANGUAGE = 3;
		public static final Integer MOBILE_NUMBER = 4;
		public static final Integer ADDRESS_HOUSE_NUM = 5;
		public static final Integer ADDRESS_BLOCK = 6;
		public static final Integer ADDRESS_STREET = 7;
		public static final Integer ADDRESS_AVENUE = 8;
		public static final Integer ADDRESS_AREA = 9;
		public static final Integer ADDRESS_HOME_ADDRESS = 10;
		public static final Integer ADDRESS_CITY_ADDRESS = 11;
		public static final Integer ADDRESS_PO_BOX = 12;
		public static final Integer ADDRESS_PO_BOX_AREA = 13;
		public static final Integer ADDRESS_POSTAL_CODE = 14;
		public static final Integer ADDRESS_PO_NAME = 15;
		public static final Integer ADDRESS_COUNTRY = 25;
		public static final Integer NEW_MOBILE_NUMBER = 26;

	}

	public static class SYSTEMS {
		private SYSTEMS() {
		}

		public static final String IMAL = "imal";
		public static final String ECORE = "ecore";
		public static final String MOBILE = "mobile";
	}

	/**
	 * @author Neelkanth Tripathi [23-Aug-2017]
	 * @JIRA_Ref: RTLCRPMBDV-1015 (DA-735: Update Client Profile)
	 * 
	 *            All the attribute values that will be used for Profile Update
	 *            along with their error message keys
	 */
	public enum PROFILE_UPDATE_ATTRIBUTES {
		MARITAL_STATUS("profile_update_invalid_marital", PROFILE_UPDATE_KEYS.MARITAL_STATUS,
				"profileUpdate.label.marital_status"),
		EDUCATION("profile_update_invalid_edu", PROFILE_UPDATE_KEYS.EDUCATION, "profileUpdate.label.education"),
		COMMUNICATION_LANG("invalid_mobile_no", PROFILE_UPDATE_KEYS.COMMUNICATION_LANGUAGE,
				"profileUpdate.label.communication_language"),
		MOBILE_NO("error_invalid_mobile_no", PROFILE_UPDATE_KEYS.MOBILE_NUMBER, "rm_mobile_num"),
		HOUSE_NUM("profile_update_invalid_house", PROFILE_UPDATE_KEYS.ADDRESS_HOUSE_NUM,
				"profileUpdate.label.houseNum"),
		BLOCK("profile_update_invalid_block", PROFILE_UPDATE_KEYS.ADDRESS_BLOCK, "profileUpdate.label.block"),
		STREET("profile_update_invalid_street", PROFILE_UPDATE_KEYS.ADDRESS_STREET, "profileUpdate.label.street"),
		AVENUE("profile_update_invalid_avenue", PROFILE_UPDATE_KEYS.ADDRESS_AVENUE, "profileUpdate.label.avenue"),
		AREA("profile_update_invalid_area", PROFILE_UPDATE_KEYS.ADDRESS_AREA, "profileUpdate.label.area"),
		HOME_ADDRESS("profile_update_invalid_address", PROFILE_UPDATE_KEYS.ADDRESS_HOME_ADDRESS,
				"profileUpdate.label.address"),

		CITY_ADDRESS("profile_update_invalid_address", PROFILE_UPDATE_KEYS.ADDRESS_CITY_ADDRESS,
				"profileUpdate.label.address");
		// PO_BOX(BundleConstants.PROFILE_UPDATE_INVALID_FLOOR,
		// PROFILE_UPDATE_KEYS.ADDRESS_PO_BOX,
		// BundleConstants.PROFILEUPDATE_LABEL_FLOOR),
		// PO_BOX_AREA(BundleConstants.PROFILE_UPDATE_INVALID_FLOOR,
		// PROFILE_UPDATE_KEYS.ADDRESS_PO_BOX_AREA,
		// BundleConstants.PROFILEUPDATE_LABEL_FLOOR),
		// POSTAL_CODE(BundleConstants.PROFILE_UPDATE_INVALID_FLOOR,
		// PROFILE_UPDATE_KEYS.ADDRESS_POSTAL_CODE,
		// BundleConstants.PROFILEUPDATE_LABEL_FLOOR),
		// PO_NAME(BundleConstants.PROFILE_UPDATE_INVALID_FLOOR,
		// PROFILE_UPDATE_KEYS.ADDRESS_PO_NAME,
		// BundleConstants.PROFILEUPDATE_LABEL_FLOOR);

		private String errorKey;
		private String labelKey;
		private Integer id;

		private static final Map<Integer, PROFILE_UPDATE_ATTRIBUTES> lookup = new HashMap<Integer, PROFILE_UPDATE_ATTRIBUTES>();

		PROFILE_UPDATE_ATTRIBUTES(String errorKey, Integer id, String labelKey) {
			this.errorKey = errorKey;
			this.id = id;
			this.labelKey = labelKey;
		}

		public String getLabelKey() {
			return labelKey;
		}

		public String getErrorKey() {
			return errorKey;
		}

		public Integer getId() {
			return id;
		}

		public static PROFILE_UPDATE_ATTRIBUTES get(Integer code) {
			return lookup.get(code);
		}

		static {
			for (PROFILE_UPDATE_ATTRIBUTES s : EnumSet.allOf(PROFILE_UPDATE_ATTRIBUTES.class))
				lookup.put(s.getId(), s);
		}
	}

	public static class URL_PATH {
		private URL_PATH() {
		}

		public static final String LOGIN_PATH = "/pages/retail/public/sitekey/check_user.xhtml";
	}// URLs

	public static class REQUEST_ATTRIBUTE_KEYS {
		private REQUEST_ATTRIBUTE_KEYS() {
		}

		public static final String SUCCESS_TITLE = "success.message.title";
		public static final String SUCCESS_MSG = "success.message.body";

		public static final String ERROR_TITLE = "error.message.title";
		public static final String ERROR_MSG = "error.message.body";
	}// REQUEST_ATTRIBUTE_KEYS

	public static class PROFILE_UPDATE_SERVICE_ACCESS {
		private PROFILE_UPDATE_SERVICE_ACCESS() {
		}

		private static Integer[] DENIED_LIST = new Integer[] { 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 61, 63 };

		public static Integer[] getDENIED_LIST() {
			return DENIED_LIST;
		}

	}

	public static class MOBILE_NUM_REQUEST_STATUS {
		private MOBILE_NUM_REQUEST_STATUS() {
		}

		public static final Integer PENDING = 1;
		public static final Integer APPROVED = 2;
		public static final Integer REJECTED = 3;
		public static final Integer ALL = 4;
	}

	public static class MOBILE_NUM_REQUEST_FIELDS {
		private MOBILE_NUM_REQUEST_FIELDS() {
		}

		public static final String CIF = "CIF";
		public static final String CUSTOMER_NAME = "CUSTOMER_NAME";
		public static final String NEW_MOBILE_NUM = "NEW_MOBILE_NUM";
		public static final String CUSTOMER_USERNAME = "CUSTOMER_USERNAME";
		public static final String REQUEST_ID = "REQUEST_ID";
	}

	public static class UPDATE_PROFILE_ITEMS {
		private UPDATE_PROFILE_ITEMS() {
		}

		public static final String MOBILE_NO = "1";
		public static final String MARITAL_STATUS = "2";
		public static final String EDUCATION = "3";
		public static final String COMMUNICATION_LANGUAGE = "4";
		public static final String UPDATE_EMAIL = "5";
		public static final String ADDRESS = "6";
	}

	public static class UPDATE_CATEGORY {
		private UPDATE_CATEGORY() {
		}

		public static final String LANGUAGE = "L";
		public static final String MARITAL_STATUS = "M";
		public static final String EDUCATION = "E";
		public static final String ADDRESS = "A";
	}

	public static class REQUEST_MEDIA_TYPE {
		private REQUEST_MEDIA_TYPE() {
		}

		public static final String JSON = "JSON";
	}

	public static class TRANSFER_PURPOSE {
		private TRANSFER_PURPOSE() {
		}

		public static final String PERSONAL_TRANSFER = "1";
		public static final String OTHERS = "30";

		public static final String OTHERS_COMMENT_PERSONAL = "personal";

	}

	public static class PACI {
		private PACI() {
		}

		public static final String SAML_DATA_SEPERATOR = ";-;";
		public static final String DEFAULT_UPLOAD_ATTACHMENT_NAME = "OnlineCCR";
		public static final String LEAD_CHANNEL_ID = "78";
		public static final String LEAD_PRODUCT_ID = "2";
		public static final String LEAD_ADDIONAL_TYPE = "2";
		public static final String LEAD_ADDIONAL_TYPE_MB = "3";

		public static class API_CONSTANTS {
			private API_CONSTANTS() {
			}

			public static final String SIGNATURE_TYPE = "A";
			public static final String API_CODE = "80";

		}

		public static class STAGE {
			private STAGE() {
			}

			public static final Integer INITIALIZATION = 1;
			public static final Integer REDIRECTED_TO_DOMAIN = 2;
			public static final Integer REDIRECTED_TO_PACI = 3;
			public static final Integer AUTHENTICATED = 4;
		}

		public static final String SUPPORTED_FILE_TYPES = "pdf";
		public static final String SELLER_ID = "IBUSR";

		public static class COLLECTION_CHANNEL {
			private COLLECTION_CHANNEL() {
			}

			public static final int COLLECT_FROM_BRANCH = 1;
			public static final int CARRIER = 2;
		}

		public static class CARD_REQUEST_STATUS {
			private CARD_REQUEST_STATUS() {
			}

			public static final int PENDING = 1;
			public static final int WAITING_APPROVAL = 2;
			public static final int REJECTED = 3;
			public static final int APPROVED = 4;
			public static final int CANCELED = 5;
			public static final int DELETED = 6;
		}

		public static class CC_TYPE_LABELS {
			private CC_TYPE_LABELS() {
			}

			public static final String VISA_SIGNATURE = "Visa Signature";
		}

		public static class LEAD_STATUS_IDs {
			private LEAD_STATUS_IDs() {
			}

			private static Integer[] PENDING = new Integer[] { 1, 2, 3, 4, 5, 6 };
			private static Integer[] APPROVED = new Integer[] { 7, 12 };
			private static Integer[] REJECTED = new Integer[] { 8, 9, 10, 11 };

			public static Integer[] getPENDING() {
				return PENDING;
			}

			public static Integer[] getAPPROVED() {
				return APPROVED;
			}

			public static Integer[] getREJECTED() {
				return REJECTED;
			}

		}

	}

	public static class NAVIGATION {
		private NAVIGATION() {
		}

		public static final String FINAL_PAGE = "final";
		public static final String FINAL_ERROR_PAGE = "finalError";
		public static final String HOME_PAGE = "home";
		public static final String CONFIRMATION_PAGE = "confirm";
		public static final String SETTINGS_PAGE = "settings";
		public static final String FINAL_PAYME = "finalPayMe";
	}

	public static class CHANNEL_MODULE {
		private CHANNEL_MODULE() {
		}

		public static final int DEFAULT = 1;
		public static final int BOT = 2;
	}

	public static class CUSTOMERS_TITLES {
		private CUSTOMERS_TITLES() {
		}

		public static final String MR = "Mr.";
		public static final String MRS = "Mrs.";
		public static final String MS = "Ms.";
		public static final String DR = "Dr.";
	}

	/**
	 * @author Osama Yousuf
	 * 
	 *         All tree structured constants should be declared here
	 *
	 */
	public static final class PRODUCTS_TREE {
		private PRODUCTS_TREE() {
		}

		/**
		 * Tree nodes types are listed here in <Category Id, Category Instance> pairs.
		 */
		// private static Map<Integer, ProductTreeNodeDTO> treeNodesTypes;

		public static final class PRODUCT_CATEGORIES {

			public static final int FIXED_DEPOSIT_CATEGORY = 1;
			public static final int FIXED_DEPOSIT_PRODUCT = 2;

			public static final int ENET_SERVICE = 3;
			public static final int ENET_COUNTRY = 4;
			public static final int ENET_COMPANY = 5;
			public static final int ENET_PRODUCT = 6;
			public static final int ENET_MOBILE_NUMBER = 7;
			public static final int ENET_CARD_NUMBER = 8;

		}

//		static {
//			treeNodesTypes = new HashMap<>();
//			
//			PRODUCTS_TREE.treeNodesTypes.put(PRODUCT_CATEGORIES.FIXED_DEPOSIT_CATEGORY, new FixedDepositCategoryDTO());
//			PRODUCTS_TREE.treeNodesTypes.put(PRODUCT_CATEGORIES.FIXED_DEPOSIT_PRODUCT, new FixedDepositDTO());
//			
//			PRODUCTS_TREE.treeNodesTypes.put(PRODUCT_CATEGORIES.ENET_SERVICE, new BasicTreeNodeDTO());
//			PRODUCTS_TREE.treeNodesTypes.put(PRODUCT_CATEGORIES.ENET_COUNTRY, new BasicTreeNodeDTO());
//			PRODUCTS_TREE.treeNodesTypes.put(PRODUCT_CATEGORIES.ENET_COMPANY, new BasicTreeNodeDTO());
//			PRODUCTS_TREE.treeNodesTypes.put(PRODUCT_CATEGORIES.ENET_PRODUCT, new ENetProductDTO());
//			PRODUCTS_TREE.treeNodesTypes.put(PRODUCT_CATEGORIES.ENET_CARD_NUMBER, new BasicTreeNodeDTO());
//			PRODUCTS_TREE.treeNodesTypes.put(PRODUCT_CATEGORIES.ENET_MOBILE_NUMBER, new BasicTreeNodeDTO());
//			
//		}
		// public static Map<Integer, ProductTreeNodeDTO> getTreeNodesTypes() {return
		// treeNodesTypes;}

		public static class COMPONENT_TYPES {

			public static final Integer DROPDOWN_LIST = 1;
			public static final Integer TEXT_BOX = 2;
			public static final Integer RADIO_BUTTON = 3;
			public static final Integer CHECK_BOX = 4;

			private COMPONENT_TYPES() {
			}
		}

	}

	public enum FIXED_DEPOSITE_OPERATIONS {
		VALIDATE(1), CREATE(2), BREAKE(3);
		private FIXED_DEPOSITE_OPERATIONS(int operationId) {
			this.operationId = operationId;
		}

		private int operationId;

		public int getOperationId() {
			return operationId;
		}

		private static final Map<Integer, FIXED_DEPOSITE_OPERATIONS> lookup = new HashMap<Integer, FIXED_DEPOSITE_OPERATIONS>();
		static {
			for (FIXED_DEPOSITE_OPERATIONS s : EnumSet.allOf(FIXED_DEPOSITE_OPERATIONS.class))
				lookup.put(s.getOperationId(), s);
		}

		public static FIXED_DEPOSITE_OPERATIONS get(Integer id) {
			return lookup.get(id);
		}

		public static final String AUTO_RENEWAL_YES = "y";
		public static final String AUTO_RENEWAL_NO = "n";
		public static final Integer WEKALA_TYPE_ID = 1;
		public static final Integer ALMONA_TYPE_ID = 2;
	}

	public static class ENVELOP_MESSAGES {
		private ENVELOP_MESSAGES() {
		}

		public static final String MESSAGE_HEADER = "messageHeader";
		public static final String SUCCESS_MSG_1 = "successMsg1";
		public static final String SUCCESS_MSG_2 = "successMsg2";
		public static final String EXTRA_DATA = "extraData";
	}

	public static class SERVICE_ACCESS {
		private SERVICE_ACCESS() {
		}

		public static class SERVICE_ACCESS_VARIABLES {
			private SERVICE_ACCESS_VARIABLES() {
			}

			public static final String VISIBLE_SERVICES = "visibleServices";
			public static final String SERVICE_ACCESS_MAP = "serviceAccesMap";
			public static final String FAVORITES_SERVICES = "favoritesServices";
		}

		public static class FAVORITES {
			private FAVORITES() {
			}

			public static class ACTIONS {
				public static final Integer ADD = 1;
				public static final Integer DELETE = 2;
			}
		}
	}

	public static class usman_SELECT {
		public enum usman_SELECT_AIRLINES {

			TURKISH("Turkish Airlines"), ETIHAD("Etihad Airlines"), QATAR("Qatar Airways"), BRITISH("British Airways");

			usman_SELECT_AIRLINES(String airlinekey) {
				this.airlinekey = airlinekey;
			}

			private String airlinekey;

			public String getAirlineKey() {
				return airlinekey;
			}

		}

		public enum usman_SELECT_HOTELS {

			CARLSON("Carlson Hotel"), ACCOR("Accor Hotel");

			usman_SELECT_HOTELS(String hotelkey) {
				this.hotelkey = hotelkey;
			}

			private String hotelkey;

			public String getHotelkeyKey() {
				return hotelkey;
			}

		}

		public static final String ERROR_NO_SUB_DATA_FOUND = "99999";

		// TODO whene go live Remove this variable and all dependences of it
		public static boolean TEST_MODE_ENABLED = false;
		public static Integer SEARCH_PERIOD = 30;

		public static class REDEEM_REWARD_MATRIX_ID {
			// UAT Values
			public static final String UAT_CASH_BACK = "44565";
			/*
			 * public static final String CARLSON = "49207"; public static final String
			 * ROTANA = "49208"; public static final String TURKISH_AIRLINE = "49205";
			 * public static final String ETIHAD_AIRLINE = "44791"; public static final
			 * String QATAR_AIRLINE = "44794"; public static final String ACCOR = "49206";
			 * public static final String BRITISH_AIRLINE = "44787";
			 */

			// Production Values
			public static final String CASH_BACK = "266157";

			// The reward matrix IDs that were used on first launch
			/*
			 * public static final String CARLSON = "293736"; public static final String
			 * TURKISH_AIRLINE = "292318"; public static final String ETIHAD_AIRLINE =
			 * "265995"; public static final String QATAR_AIRLINE = "265996"; public static
			 * final String ACCOR = "293737"; public static final String BRITISH_AIRLINE =
			 * "265994";
			 */
			// public static final String ROTANA = "49208";

			// The new Production values that should be used for fixing the length issue on
			// notes for Mastercard
			public static final String CARLSON = "355036";
			public static final String TURKISH_AIRLINE = "355037";
			public static final String ETIHAD_AIRLINE = "355038";
			public static final String QATAR_AIRLINE = "355039";
			public static final String ACCOR = "355041";
			public static final String BRITISH_AIRLINE = "355040";

		}

		public static class REDEEM_TYPE_ID {
			public static final Integer CASH_BACK = 1;
			public static final Integer AUTO_CASH_BACK = 2;
			public static final Integer HOTELS = 3;
			public static final Integer AIRLINES = 4;
		}

		public static class REDEEM_CASH_BACK_TYPE {
			public static final Integer CARDS = 1;
			public static final Integer ACCOUNTS = 2;
		}

		public static class PACKAGES_EQUIVALENT_AMOUNTS {
			public static final BigDecimal usman_SELECT_HOTEL_PACKAGE_AMOUNT = BigDecimal.valueOf(60); // for example
																											// 60 :
																											// every 60
																											// usman
																											// select
																											// points
																											// equals to
																											// 5000
																											// Hotels
																											// points
			public static final BigDecimal HOTEL_PACKAGE_EQUIVALENT_AMOUNT = BigDecimal.valueOf(5000); // for example
																										// 5000
			public static final BigDecimal usman_SELECT_AIRLINE_PACKAGE_AMOUNT = BigDecimal.valueOf(60); // for
																											// example
																											// 60 :
																											// every 60
																											// usman
																											// select
																											// points
																											// equals to
																											// 5000
																											// AirLines
																											// points
			public static final BigDecimal AIRLINE_PACKAGE_EQUIVALENT_AMOUNT = BigDecimal.valueOf(5000); // for example
																											// 5000
		}

		public static class usman_SELECT_CATEGORIES {
			public static final String CASH_BACK = "1";
			public static final String HOTELS = "2";
			public static final String AIRLINES = "3";
			public static final String STATEMENT = "4";
		}

	}

	public enum Environment {
		UAT, DEV, PRODUCTION;
		private Environment() {
		}
	}

	public static class HTTP_APIS {

		public static class TIME_OUT {

			public static int DEFAULT_READ_TIMEOUT = 15000; // <= 15 seconds
			public static int DEFAULT_CONNECT_TIMEOUT = 10000; // <= 10 secnods

			public static int IOS_QUERY_TWO_BITS_READ_TIMEOUT = 15000;
			public static int IOS_QUERY_TWO_BITS_CONNECT_TIMEOUT = 10000;

			public static int IOS_UPDATE_TWO_BITS_READ_TIMEOUT = 15000;
			public static int IOS_UPDATE_TWO_BITS_CONNECT_TIMEOUT = 10000;

			public static int SILENT_PN_READ_TIMEOUT = 15000;
			public static int SILENT_PN_CONNECT_TIMEOUT = 10000;
		}

		public static class REQUEST_METHOD_TYPE {
			public static String POST = "POST";
		}

		public static class HTTP_HEADERS {

			public static class CUSTOM_HEADERS {
				public static String IOS_DEVICE_CHECK = "ios-device";
				public static String IOS_AUTHORIZATION = "ios-authorization";
				public static String BBYN_CHANNEL_KEY = "bbyn-chkey";
				public static String BBYN_CHANNEL_ID = "bbyn-chid";

			}

			public static class CONTENT_TYPES {
				public static String APPLICATION_JSON = "application/json";
			}

			public static class ACCEPT_ENCODING {
				public static String GZIP_DEFLAT = "gzip,deflate";
			}

			public static class ACCEPT {
				public static String APPLICATION_JSON = "application/json";
			}
		}
	}

	public static class DEVICE_CHECK {

		public static class IOS {
			public static boolean FORCE_DEVICE_CHECK = true;
			public static String MIN_SUPPORTED_APP_VERSION = "6.2.0";
			public static String MIN_SUPPORTED_OS_VERSION = "11.0";
			public static long JWT_EXPIRY_MILLISECONDS = 120000; // 120 seconds
			public static final String TEAM_ID = "6TAC9X92GL";
			public static final String KID = "DX8HS4737K";

			public static class ERROR_MSGS {
				public static final String AUTHORIZATION_TOKEN_ERROR = "Unable to verify authorization token";
				public static final String INCORRECT_DEVICE_TOKEN = "Missing or incorrectly formatted device token payload";
				public static final String SUCCESS_NO_BIT_FOUND_MSG = "Failed to find bit state";
				public static final String SUCCESS_BIT_FOUND = "";
				public static final String AUTHORIZATION_TOKEN_EXPOIRED = "Authorization token has expired";

			}
		}

		public static class ANDROID {
			public static boolean FORCE_DEVICE_CHECK = true;
			public static String MIN_SUPPORTED_APP_VERSION = "6.2.0";
			public static String PACKAGE_NAME = "com.usmanapp.usman.bank";
		}
	}

	public static class EXTERNAL_REST_APIS {
		public static class DEVICE_CHECK {
			public static final String QUERY_BITS = "/DeviceCheckService/IosDeviceCheckPS/IOS";
			public static final String UPDATE_BITS = "/DeviceCheckService/IosUpdateBitsPS/updateBits";
		}

		public static class PUSH_NOTIFICATION {
			public static final String SEND_PN = "/PushNotificationService/SendPushNotificationPS/pushnotification";
		}

	}
}
