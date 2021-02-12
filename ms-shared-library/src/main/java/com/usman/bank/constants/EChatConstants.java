package com.usman.bank.constants;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * @author Neelkanth Tripathi
 * All constant values used by EChat Module will be defined here
 *
 */
 
public final class EChatConstants {
	
	public static class E_CHAT_RESPONSE_FLAGS{
		private E_CHAT_RESPONSE_FLAGS(){}
		
		public static final Integer DEFAULT = 0 ;
		public static final Integer OPERATION_SUCCESSFUL = 1 ;
		public static final Integer FOLLOW_UP_QUESTON = 2 ;
		public static final Integer OPERATION_ERROR_OCCURRED = 3 ;
		public static final Integer REQUEST_VALIDATION_ERROR = 4 ;
		public static final Integer FINAL_RESPONSE_ERROR = 5 ;
		public static final Integer DID_NOT_UNDERSTAND = 6 ;
		public static final Integer SERVICE_NOT_IN_SCOPE = 7 ;
	}
	
	public static class E_CHAT_GENERIC{
		private E_CHAT_GENERIC(){}
		
		public static final String MENU_PREFIX 									= "OPT_" ;
		public static final String FAQ_PREFIX 									= "FAQ_" ;
		public static final String DELIMITER 									= "<::E-CHAT-DELIMITER::>";
		public static final String SERVICE_REPITION_POSTFIX 					= "_REP";
		public static final String DID_NOT_UNDERSTAND_KNOWLEDGE_ID 				= "BOT_DID_NOT_UNDERSTAND";
		public static final String DID_NOT_UNDERSTAND_FIRST_ATTEMPT 			= "DID_NOT_UNDERSTAND_ATTEMPT_1";
		public static final String DID_NOT_UNDERSTAND_LIVE_CHAT_KNOWLEDGE_ID 	= "LIVE_CHAT_NOT_ACCESS";
		public static final String LIVE_CHAT_URL								= "LIVE_CHAT_URL";
		public static final String WELCOME_SUGGESTION_KNOWLEDGE_ID 				= "WELCOME_SUGGESTION";
		public static final String INTRO_MSG_FOR_COMPETITION 					= "INTRO_MESSAGE_FOR_COMPETITION";
		public static final String INTRO_MSG_FOR_ALL_SERVICE					= "INTRO_MESSAGE_FOR_ALL_SERVICE";	
		public static final String WELCOME_MSG 									= "WELCOME_MSG";
		public static final String WELCOME_MSG_EID 								= "WELCOME_MSG_EID";
		public static final String CIVIL_ID_EXPIRY_MSG 							= "CIVIL_ID_EXPIRING_NOTIFY";
		public static final String MINOR_NOT_ALLOWED 							= "MINOR_NOT_ALLOWED";
		public static final String NEW_LEARNINGS 								= "NEW_LEARNINGS";
		public static final String GREETINGS_EXAMPLE_IOS 						= "GREETINGS_EXAMPLE_IOS";
		public static final String CHARGE_TYPE									= "CHARGE_TYPES_INFO";
		public static final String DASHBOARD 									= "USER_PRODUCTS_DASHBOARD";
		public static final String GREETINGS_EXAMPLE_ANDROID 					= "GREETINGS_EXAMPLE_ANDROID";
		public static final String CARD_USAGE_HTML_TABLE 						= "CARD_USAGE_HTML_TABLE";
		public static final String LOGIN_PROMPT_LINKED_USER 					= "LOGIN_PROMPT_LINKED_USER";
		public static final String LOOKUP_STATEMENT_DURATIONS 					= "LOOKUP_STATEMENT_DURATIONS";
		public static final String BROKERAGE_GENERAL_TEXT 						= "usman_CAPITALS_BROKERAGE";
		public static final String BOT_FILTERED_SERVICES_HEADER					= "BOT_FILTERED_SERVICES_HEADER";
		public static final String REDEEMING_DATES_BBYN_REWARDS					= "REDEEMING_DATES_BBYN_REWARDS";
		public static final String NO_CHILDREN_LINKED							= "NO_CHILDREN_LINKED";
		public static final String CANNOT_ENTER_OWN_CIVIL_ID					= "CANNOT_ENTER_OWN_CIVIL_ID";
		public static final String CIVIL_ID_EXPIRING_NOTIFY						= "CIVIL_ID_EXPIRING_NOTIFY";
		public static final String SERVICE_NOT_ALLOWED							= "SERVICE_NOT_ALLOWED";
		public static final String NEW_LEARNINGS_EMPTY 							= "NONE";
		public static final String GO_TO_APP_REPO 								= "GO_TO_APP";//This will show the customer the message to go to app
		public static final String NOT_ENTITLED_ALL_SERVICE						= "NOT_ENTITLED_ALL_SERVICE";//The common repo message that will be dosplayed when user is not entitled to view a service because its marked as authentication required
		public static final String EXPLORE_MURABAHA_REPO_ID 					= "DO_YOU_OFFER_MURABAHA";//The repo id that prompts to explore the finance eligibility details
		public static final String SKEY_SUCCESS 								= "PWD_SUCCESS";//Password Validation successful
		public static final String COMMON_SEPARATOR 							= "@:@";//A String separator used wherever applicable
		public static final String SERVICE_NOT_IN_SCOPE 						= "SERVICE_NOT_IN_SCOPE";//The key from knowledge repo for indicating that the service is not in the current scope. One has to login to access
		public static final String REPO_SQL_SEPARATOR 							= "<separator>";//A String separator used in sql from repo table
		public static final String SMALL_SEPARATOR 								= "<sp>";//A shorter alternate separator used in knowledge repo resolution in case the above doesnt suffice
		public static final String OTP_AUTO_ANSWER 								= "<::::OTP_AUTO_ANSWERED::::>";//The value to be used when answering otp from code
		public static final String APPROVAL_AUTO_ANSWER_TRUE 					= "true";//The value to be used when Approval and otp required from code
		public static final String APPROVAL_AUTO_ANSWER_FALSE 					= "false";//The value to be used when Approval and otp required from code
		public static final String END_OF_TRIP 									= "END_OF_TRIP";
		public static final String MODIFY_TRIP 									= "MODIFY_TRIP";
		public static final String MODIFY_WAFERLI 								= "MODIFY_WAFERLI";
		public static final String DELETE_WAFERLI 								= "DELETE_WAFERLI";
		public static final String SKIP_ANSWER 									= "000:::SKIP:::000";
		public static final String WAFERLI_AUTO_ANSWER 							= "<::::WAFERLI_AUTO_ANSWER::::>";
		public static final String REMOVE_ANSWER 								= "000:::REMOVE:::000";
		public static final String QUESTION_AUTO_ANSWER 						= "<::::AUTO_ANSWERED::::>";
		public static final String ALREADY_PARTICIPATED_REPO 					= "ALREADY_PARTICIPATED_IN_COMPETITION";
		public static final String ALL_DESELECTED 								= "000:::DESELECTED:::000";
		public static final String CONFIRMATION_TYPE 							= "CONFIRMATION_TYPE_INFO";
		public static final String ESERVICES_AUTO_ANSWER						= "<:::ESERVICES_AUTO_ANSWER:::>";
		public static final String FROM_DATE									= "FROM_DATE";
		public static final String TO_DATE										= "TO_DATE";

		public static final String REPO_SUB_SEPARATOR 							= "<sub-separator>";//A String separator used in splitting values from knowledge repo
		public static final String MSG_SEPARATOR 								= "<msg-separator>";//A String separator used in splitting values from message text. If message text separator found, then app will send a new inquiry text on click of bubble

		public static final String TELLER_ID 									= "99999";
		public static final String USER_NOT_LOCKED 								= "USER_NOT_LOCKED";
		public static final String BLANK_NO_DATA 								= "--BLANK_NO_DATA--";
		public static final String SUGGESTED_SERVICES_TEXT 						= "SUGGESTED_SERVICES_TEXT";//This is shown when a filtered suggestion list is to be displayed 
	}
	
	/**
	 * All displayed Menu Items in eChat home screen
	 *
	 */
	public static class E_CHAT_MENU_ITEMS{
		private E_CHAT_MENU_ITEMS(){}

		public static final String GET_ACC_BALANCE 							= "OPT_1";
		public static final String GET_ACC_STATEMENT 						= "OPT_2";
		public static final String PAY_ME 									= "OPT_3";
		public static final String CREDIT_CARD_PAYMENT 						= "OPT_4";
		public static final String UTILITY_PAYMENT 							= "OPT_5";
		public static final String OWN_ACC_TRANSFER 						= "OPT_6";
		public static final String CARDLESS_WITHDRAWAL 						= "OPT_7";
		public static final String PAY_ME_MULTIPLE 							= "OPT_8";
		public static final String GET_TRANS_HISTORY 						= "OPT_9";
		public static final String GOOGLE_PLAY_CARD 						= "OPT_10";
		public static final String ITUNES_CARD 								= "OPT_11";
		public static final String BLOCK_CARD 								= "OPT_12";
		public static final String usman_TRANSFER 						= "OPT_13";
		public static final String UNLOCK_USER_ON_UAT 						= "OPT_14";
		public static final String CONVERT_CURRENCY 						= "OPT_38";
		public static final String BYE 										= "OPT_41";
		public static final String NEAREST_BRANCH 							= "OPT_43";
		public static final String QUICK_PAY_ME 							= "OPT_44";
		public static final String ACCOUNT_HOLDS 							= "OPT_45";
		public static final String NEXT_SALARY_DATE 						= "OPT_47";
		public static final String QIBLA 									= "OPT_49";
		public static final String DISCOUNTS_PROMOTIONS 					= "OPT_50";
		public static final String PRAYER_TIMES 							= "OPT_51";
		public static final String DEBIT_TRANSACTION_SEARCH 				= "OPT_52";
		public static final String CREDIT_TRANSACTION_SEARCH 				= "OPT_53";
		public static final String CC_DEBIT_TRANSACTION_SEARCH 				= "OPT_54";
		public static final String CC_CREDIT_TRANSACTION_SEARCH 			= "OPT_55";
		public static final String BRANCH_LOCATIONS 						= "OPT_57";
		public static final String HELP 									= "OPT_58";
		public static final String RESEND_OTP 								= "OPT_64";
		public static final String WESTERN_UNION_MTCN 						= "OPT_65";
		public static final String CURRENCY_EXCHANGE_RATE 					= "OPT_414";
		public static final String LOCAL_ACCOUNT_TRANSFER 					= "OPT_634";
		public static final String CHARITY_PAYMENT 							= "OPT_690";
		public static final String TRAVEL_NOTIFICATION 						= "OPT_2090";
		// Add by Surendra for beneficiary 
		public static final String usman_BENEFICIARY 						= "OPT_1310";
		public static final String LOCAL_BENEFICIARY 						= "OPT_1311";
		public static final String ACTIVATE_BENEFICIARY						= "OPT_1851";
		public static final String UPDATE_BENEFICIARY						= "OPT_2870";
		public static final String DELETE_BENEFICIARY 						= "OPT_2150";
		public static final String ADD_WESTERN_UNION_BENEFICIARY_SERVICE	= "OPT_2390";
		public static final String BENEFICIARY_BY_MOBILE					= "OPT_2671";
		
		public static final String OPEN_NEW_ACCOUNT							= "OPT_1330";
		public static final String CHANGE_MOBILE_NUMBER						= "OPT_1451";
		public static final String OPEN_FIXED_DEPOSIT						= "OPT_1530";
		public static final String INTERNATIONAL_TRANSFER					= "OPT_1550";
		public static final String E_VOUCHERS								= "OPT_1852";
		
		public static final String CHEQUE_BOOK_REQUEST						= "OPT_1910";
		public static final String CERTIFICATE_REQUEST_TYPE					= "OPT_1911";
		public static final String FINANCE_SERVICE							= "OPT_1930";
		public static final String WAFERLI_SERVICE							= "OPT_2190";
		
		public static final String WESTERN_UNION_REFUNDS_SERVICE			= "OPT_2410";
		public static final String MANAGE_STANDING_ORDERS_SERVICES			= "OPT_2411";
		public static final String CREDIT_CARD_REQUEST						= "OPT_2550";
		public static final String CREDIT_CARD_REQUEST_HISTORY				= "OPT_2590";
		public static final String ENABLE_DISABLE_TOUCH_ID					= "OPT_2670";		
		public static final String FINANCE_PAYMENT_SCHEDULE					= "OPT_2690";
		public static final String TELEX_VOUCHER							= "OPT_2691";
		public static final String MY_PRODUCTS								= "OPT_2730";		
		public static final String BLOCK_CREDIT_CARD 						= "OPT_2850";		
		public static final String RAMADAN_PDF 								= "OPT_510";
		public static final String FAQ_CREDIT_LIMIT_INQUIRY 				= "OPT_157";
		public static final String FAQ_IBAN_INQUIRY	 						= "OPT_158";
		public static final String FAQ_LATEST_OTP 							= "OPT_162";
		
		public static final String GO_TO_SETTINGS 							= "OPT_1210";
		public static final String GO_TO_TRAVEL_NOTIF 						= "OPT_1230";
		public static final String GO_TO_OPEN_NEW_ACCOUNT 					= "OPT_1231";
		public static final String GO_TO_FIXED_DEPOSIT 						= "OPT_1251";
		public static final String GO_TO_MANAGE_CARDS 						= "OPT_1270";
		public static final String GO_TO_WU_TRANSFER 						= "OPT_1670";
		public static final String GO_TO_INT_BENEF 							= "OPT_1690";
		public static final String GO_TO_UPDATE_CUSTOMER_INFO 				= "OPT_1853";
		public static final String GO_TO_FINANCE_DEAL_ELIGIBILITY 			= "OPT_1870";
		public static final String GO_TO_FINANCE_CALCULATOR 				= "OPT_2450";
		public static final String GO_TO_UNLOCK_USER_PROMPT 				= "OPT_3291";//Unlock User
		public static final String GO_TO_CHANGE_PIN 						= "OPT_4072";//This is for Change PIN redirection
		
		public static final String CLEARED_CHEQUE 							= "OPT_1250";
		public static final String TELECOM_PAYEE 							= "OPT_211";
		public static final String COMPETITION 								= "OPT_1450";
		public static final String CARD_HOLDS_TRANSACTIONS 					= "OPT_1750";
		public static final String CREDIT_CARD_TRANSACTIONS 				= "OPT_1912";
		
		public static final String NONE_OF_THE_ABOVE 						= "OPT_2130";//The service ID to be used to display the none of the above option after filtered service list
		public static final String UPLOAD_CIVIL_ID 							= "OPT_332";//This is to test Upload file functionality 
		public static final String usman_SELECT_REDEMPTION 				= "OPT_2930";
		public static final String CARD_USAGE 								= "OPT_2530";//This is Card Usage
		public static final String LIVE_CHAT 								= "OPT_2890";//Live Chat
		
		public static final String GET_SALARY_CERTIFICATE 					= "OPT_3050";//Get Salary Certificate
		public static final String LINK_ACCOUNTS 							= "OPT_3092";//Link Accounts
		public static final String DELINK_ACCOUNTS 							= "OPT_3093";//De-Link Accounts
		public static final String LOGIN_SERVICE 							= "OPT_3094";//Login Accounts
		public static final String CREATE_VIRTUAL_CARD 						= "OPT_3151";//Create Virtual Card

		public static final String ACTIVATE_CREDIT_CARD 					= "OPT_3230";//Activate Credit Card
		public static final String TRANSFER_EXCESS 							= "OPT_3250";//Transfer Excess Limit
		public static final String SHARE_ACCOUNT_DETAILS 					= "OPT_3330";//Share Account Details
		public static final String CLEARANCE_CERTIFICATE 					= "OPT_3370";
		public static final String usman_CHECKOUT 						= "OPT_3371";
		public static final String TRANSFER_BROKERAGE 						= "OPT_3432";
		public static final String LAST_5_ACCOUNT_TRANSACTIONS 				= "OPT_3572";//The Whatsapp service that shows last 5 account transactions
		public static final String LAST_5_CC_TRANSACTIONS 					= "OPT_3573";//The Whatsapp service that shows last 5 cc transactions
		public static final String UPDATE_PROFILE_PICTURE 					= "OPT_3932";//Update Profile Picture
		public static final String CALL_CUSTOMER_CARE 						= "OPT_3692";//Call Customer Care
		public static final String REMIND_ME 								= "OPT_3992";
	}
	
	/**
	 * All possible response types that eChat may have. This indicates how mobile should render the response
	 *
	 */
	public static class E_CHAT_RESPONSE_TYPES{
		private E_CHAT_RESPONSE_TYPES(){}
		
		public static final Integer DEFAULT = 1 ;
		public static final Integer LIST_OF_ACCOUNTS = 2 ;
		public static final Integer LIST_OF_MENU = 3 ;
		public static final Integer LIST_OF_ACCOUNTS_WITHOUT_BALANCE = 4 ;
		public static final Integer LIST_OF_CARDS = 5 ;
		public static final Integer FILE = 6 ;
		public static final Integer LIST_OF_OPTIONS = 7 ;
		public static final Integer LIST_OF_PAYEE = 8 ;
		public static final Integer PASSWORD = 9 ;
		public static final Integer NEAREST_BRANCH = 10;//This will open the map in app
		public static final Integer LOGOUT = 11;//This will trigger a signout operation from app
		public static final Integer FILTERED_SERVICES = 12;//This will trigger a popup that displays filtered services
		public static final Integer REDIRECT_URL = 13;//Knet redirect URL
		public static final Integer QIBLA_DIRECTION = 14;//Redirect user to the Qibla Screen
		public static final Integer DISCOUNTS = 15;//Redirect user to Discounts Page
		public static final Integer PRAYER_TIMES = 16;//Redirect user to Prayer time page
		public static final Integer MULTI_DATES = 17;//Shows multiple dates on component (Start and EndDate)
		public static final Integer GO_TO_APP = 18;//Takes the user inside the app. If this is being used, app-page attribute should also be set
		public static final Integer FILE_UPLOAD = 19;//Allows the user to upload a file
		public static final Integer CHART = 20;//Displays a pie chart on app
		public static final Integer YOUTUBE_URL = 21;//This is for Youtube video
		public static final Integer SINGLE_DATE = 22;//Shows single date component
		public static final Integer CONTACTS = 23;//Shows contact component
		public static final Integer LIVE_CHAT = 24;//live chat response 
		public static final Integer PASSWORD_PROMPT_LINKED_USER = 25;//Prompts Password for a linked customer to login and continue service usage 
		public static final Integer SINGLE_DATE_TIME = 26;//Component that shows date and time in component

	}
	
	/**
	 * All possible app pages eChat may return. This value is used by mobile to redirect the user to the correct page
	 *
	 */
	public static class E_CHAT_REDIRECT_APP_PAGE{
		private E_CHAT_REDIRECT_APP_PAGE(){}
		
		public static final String SETTINGS = "settings"; 
		public static final String TRAVEL_NOTIFICATION = "travelNotification";
		public static final String OPEN_NEW_ACCOUNT = "openNewAccount";
		public static final String OPEN_FIXED_DEPOSIT = "openFixedDeposit";
		public static final String MANAGE_CARDS = "manageCards";
		public static final String WESTERN_UNION_TRANSFER = "westernUnionTransfer";
		public static final String ADD_INTERNATIONAL_BENEFICIARY = "addInternationalBeneficiary";
		public static final String CUSTOMER_PROFILE_SETTING = "profileUpdateSettings";
		public static final String FINANCE_MURABAHA_DEALS = "financeMurabahaDeals";
		public static final String FINANCE_MURABAHA_CALCULATOR = "financeMurabahaCalculator";
		public static final String UNLOCK_USER = "unlockUser";
		public static final String WEB_CALL = "VOIPAudio";
		public static final String usman_CHECKOUT = "usmanCheckout";
	}
	
	/**
	 * 
	 * @author Neelkanth Tripathi
	 *
	 */
	public static class E_CHAT_DATA_REPOSITORY_KEYS {
		private E_CHAT_DATA_REPOSITORY_KEYS(){}
		public static final String ENTITY_EXPR_REGEX_MAP = "entityExpAndRegexMap";
		public static final String SERVICE_ALIASES = "serviceAliasesMap";
		public static final String SERVICE_REGEX_SET = "serviceRegexSetMap";
	}
	
	/**
	 * Check how the customer has done an input of text in the chat app 
	 * @author Neelkanth Tripathi
	 */
	public static class E_CHAT_CUST_INPUT_TYPE_VALUES {
		private E_CHAT_CUST_INPUT_TYPE_VALUES(){}
		
		public static final Integer CUSTOMER_TYPED = 1;
		public static final Integer CUSTOMER_SELECTED = 2;
	}
	
	/**
	 * Audit how customer has done an input of text in the chat app 
	 * @author Neelkanth Tripathi
	 */
	public static enum E_CHAT_CUST_INPUT_TYPE {
		CUSTOMER_TYPED, CUSTOMER_SELECTED;
	}
	
	/**
	 * This is used to audit the conversation type coming from eChat app
	 */
	public static enum E_CHAT_CONVERSATION_TYPES{
		Request, Response;
	}
	
	/**
	 * This is used to get the transaction types for search
	 */
	public static enum E_CHAT_TRANSACTION_TYPES{
		Debit, Credit;
	}
	
	/**
	 * These are generic questions that will be asked on eChat under More Option
	 */
	public static class E_CHAT_QUESTIONS{
		private E_CHAT_QUESTIONS(){}
		//FAQ Questions
		public static final String GET_CREDIT_CARD_LIMIT 	= "5001";
		public static final String GET_IBAN 			 	= "5002";
		public static final String CREDIT_CARD_RESTAURANT 	= "5003";
		public static final String TOTAL_CREDITED_AMOUNT 	= "5004";
		public static final String TOTAL_DEBITED_AMOUNT 	= "5005";
		public static final String SHOW_LATEST_OTP 			= "5006";
		public static final String NEXT_SALARY_DATE 		= "5007";
		public static final String CREDIT_CARD_POINTS 		= "5008";
		//Questions
		public static final String CIVIL_ID 				= "12";//Since this is a special case, handing it separately
		public static final String DURATION 				= "4";//Select the duration in days
	}
	
	public static enum E_CHAT_ANSWER_TYPES{

		Account, Amount, AccountOrMobile, ActivationCode, Activate, AccountType, AutoRenewal, ApprovalType, ActionType, Airlines,
		Beneficiary, Branch, BeneficiaryName, BranchName, BeneficiaryAccount, Bank, BackImage,
		CreditAccount, CreditCard, Code, CivilId, Confirm, Currency, ConvertCurrencyUnit, Comments, CharityPayee, Country, Company, CardNumber, ChequeBook, ChargeType, ConsentForm, Category, 
		Cashback, Cvv,
		DebitCard, DebitAccount, Duration, Dates,  Default, DepositType, DealNumber, DateTime,
		Email, ExpDate,
		FromAccount, Finance, Files, FirstName, FlyerNumber, FrontImage, 
		GiftCard, Hotels, IBANNumber, KnetPaymentId, 
		LastName, LimitAmount, LoginTouchId, LoyaltyAccountNumber, LinkedAccount,
		Mobile, MinAmount, MobileNumber, 
		Numeric, Name, NickName, Organization, OperationType, Options,
		Password, Payee, Purpose, ProviderType, ProfitAccount, Product, Package, Payments, Points, ProfileDetails, Pin, 
		Reason, Replace, Refunds, Register, Reminders, 
		Store, Score, ServiceType, SavingPurpose, StandingOrder, Swift, Service,
		Text, TransactionType, Tenure, TripModify, Types, TermsAndConditions, TouchId, TransactionTouchId, 
		Waferli;

		public static E_CHAT_ANSWER_TYPES getEnumVal(String answerType) {
			if(DebitAccount.toString().equalsIgnoreCase(answerType)){
				return DebitAccount;
			}else if(CreditAccount.toString().equalsIgnoreCase(answerType)){
				return CreditAccount;
			}else if(Account.toString().equalsIgnoreCase(answerType)){
				return Account;
			}else if(Amount.toString().equalsIgnoreCase(answerType)){
				return Amount;
			}else if(Numeric.toString().equalsIgnoreCase(answerType)){
				return Numeric;
			}else if(Mobile.toString().equalsIgnoreCase(answerType)){
				return Mobile;
			}else if(Password.toString().equalsIgnoreCase(answerType)){
				return Password;
			}else if(Payee.toString().equalsIgnoreCase(answerType)){
				return Payee;
			}else if(CreditCard.toString().equalsIgnoreCase(answerType)){
				return CreditCard;
			}else if(DebitCard.toString().equalsIgnoreCase(answerType)){
				return DebitCard;
			}else if(Code.toString().equalsIgnoreCase(answerType)){
				return Code;
			}else if(Confirm.toString().equalsIgnoreCase(answerType)){
				return Confirm;
			}else if(CivilId.toString().equalsIgnoreCase(answerType)){
				return CivilId;
			}else if(Store.toString().equalsIgnoreCase(answerType)){
				return Store;
			}else if(GiftCard.toString().equalsIgnoreCase(answerType)){
				return GiftCard;
			}else if(Beneficiary.toString().equalsIgnoreCase(answerType)){
				return Beneficiary;
			}else if(Currency.toString().equalsIgnoreCase(answerType)){
				return Currency;
			}else if(ConvertCurrencyUnit.toString().equalsIgnoreCase(answerType)){
				return ConvertCurrencyUnit;
			}else if(Duration.toString().equalsIgnoreCase(answerType)){
				return Duration;
			}else if(Score.toString().equalsIgnoreCase(answerType)){
				return Score;
			}else if(Name.toString().equalsIgnoreCase(answerType)){
				return Name;
			}else if(Comments.toString().equalsIgnoreCase(answerType)){
				return Comments;
			}else if(Reason.toString().equalsIgnoreCase(answerType)){
				return Reason;
			}else if(Replace.toString().equalsIgnoreCase(answerType)){
				return Replace;
			}else if(KnetPaymentId.toString().equalsIgnoreCase(answerType)){
				return KnetPaymentId;
			}else if(Organization.toString().equalsIgnoreCase(answerType)){
				return Organization;
			}else if(Branch.toString().equalsIgnoreCase(answerType)){
				return Branch;
			}else if(Purpose.toString().equalsIgnoreCase(answerType)){
				return Purpose;
			}else if(CharityPayee.toString().equalsIgnoreCase(answerType)){
				return CharityPayee;
			}else if(Dates.toString().equalsIgnoreCase(answerType)){
				return Dates;
			}else if(Country.toString().equalsIgnoreCase(answerType)){
				return Country;
			}else if(AccountOrMobile.toString().equalsIgnoreCase(answerType)){
				return AccountOrMobile;
			}else if(ActivationCode.toString().equalsIgnoreCase(answerType)){
				return ActivationCode;
			}else if(Activate.toString().equalsIgnoreCase(answerType)){
				return Activate;
			}else if(ProviderType.toString().equalsIgnoreCase(answerType)){
				return ProviderType;
			}else if(BeneficiaryName.toString().equalsIgnoreCase(answerType)){
				return BeneficiaryName;
			}else if(IBANNumber.toString().equalsIgnoreCase(answerType)){
				return IBANNumber;
			}else if(BranchName.toString().equalsIgnoreCase(answerType)){
				return BranchName;
			}else if(AccountType.toString().equalsIgnoreCase(answerType)){
				return AccountType;
			}else if(DepositType.toString().equalsIgnoreCase(answerType)){
				return DepositType;
			}else if(Tenure.toString().equalsIgnoreCase(answerType)){
				return Tenure;
			}else if(FromAccount.toString().equalsIgnoreCase(answerType)){
				return FromAccount;
			}else if(ProfitAccount.toString().equalsIgnoreCase(answerType)){
				return ProfitAccount;
			}else if(AutoRenewal.toString().equalsIgnoreCase(answerType)){
				return AutoRenewal;
			}else if(MinAmount.toString().equalsIgnoreCase(answerType)){
				return MinAmount;
			}else if(Types.toString().equalsIgnoreCase(answerType)){
				return Types;
			}else if(TripModify.toString().equalsIgnoreCase(answerType)){
				return TripModify;
			}else if(ApprovalType.toString().equalsIgnoreCase(answerType)){
				return ApprovalType;
			}else if(ServiceType.toString().equalsIgnoreCase(answerType)){
				return ServiceType;
			}else if(Company.toString().equalsIgnoreCase(answerType)){
				return Company;
			}else if(Product.toString().equalsIgnoreCase(answerType)){
				return Product;
			}else if(CardNumber.toString().equalsIgnoreCase(answerType)){
				return CardNumber;
			}else if(Package.toString().equalsIgnoreCase(answerType)){
				return Package;
			}else if(MobileNumber.toString().equalsIgnoreCase(answerType)){
				return MobileNumber;
			}else if(ChequeBook.toString().equalsIgnoreCase(answerType)){
				return ChequeBook;
			}else if(Finance.toString().equalsIgnoreCase(answerType)){
				return Finance;
			}else if(SavingPurpose.toString().equalsIgnoreCase(answerType)){
				return SavingPurpose;
			}else if(Files.toString().equalsIgnoreCase(answerType)){
				return Files;
			}else if(Waferli.toString().equalsIgnoreCase(answerType)){
				return Waferli;
			}else if(FirstName.toString().equalsIgnoreCase(answerType)){
				return FirstName;
			}else if(LastName.toString().equalsIgnoreCase(answerType)){
				return LastName;
			}else if(NickName.toString().equalsIgnoreCase(answerType)){
				return NickName;
			}else if(StandingOrder.toString().equalsIgnoreCase(answerType)){
				return StandingOrder;
			}else if(Refunds.toString().equalsIgnoreCase(answerType)){
				return Refunds;
			}else if(OperationType.toString().equalsIgnoreCase(answerType)){
				return OperationType;
			}else if(Payments.toString().equalsIgnoreCase(answerType)){
				return Payments;
			}else if(ChargeType.toString().equalsIgnoreCase(answerType)){
				return ChargeType;
			}else if(LimitAmount.toString().equalsIgnoreCase(answerType)){
				return LimitAmount;
			}else if(TermsAndConditions.toString().equalsIgnoreCase(answerType)){
				return TermsAndConditions;
			}else if(ConsentForm.toString().equalsIgnoreCase(answerType)){
				return ConsentForm;
			}else if(LoginTouchId.toString().equalsIgnoreCase(answerType)){
				return LoginTouchId;
			}else if(TransactionTouchId.toString().equalsIgnoreCase(answerType)){
				return TransactionTouchId;
			}else if(DealNumber.toString().equalsIgnoreCase(answerType)){
				return DealNumber;
			}else if(Swift.toString().equalsIgnoreCase(answerType)){
				return Swift;
			}else if(BeneficiaryAccount.toString().equalsIgnoreCase(answerType)){
				return BeneficiaryAccount;
			}else if(Category.toString().equalsIgnoreCase(answerType)){
				return Category;
			}else if(Hotels.toString().equalsIgnoreCase(answerType)){
				return Hotels;
			}else if(Airlines.toString().equalsIgnoreCase(answerType)){
				return Airlines;
			}else if(LoyaltyAccountNumber.toString().equalsIgnoreCase(answerType)){
				return LoyaltyAccountNumber;
			}else if(FlyerNumber.toString().equalsIgnoreCase(answerType)){
				return FlyerNumber;
			}else if(Cashback.toString().equalsIgnoreCase(answerType)){
				return Cashback;
			}else if(Points.toString().equalsIgnoreCase(answerType)){
				return Points;
			}else if(Options.toString().equalsIgnoreCase(answerType)){
				return Options;
			}else if(ProfileDetails.toString().equalsIgnoreCase(answerType)){
				return ProfileDetails;
			}else if(Register.toString().equalsIgnoreCase(answerType)){
				return ProfileDetails;
			}else if(Bank.toString().equalsIgnoreCase(answerType)){
				return Bank;
			}else if(Pin.toString().equalsIgnoreCase(answerType)){
				return Pin;
			}else if(LinkedAccount.toString().equalsIgnoreCase(answerType)){
				return LinkedAccount;
			}else if(ActionType.toString().equalsIgnoreCase(answerType)){
				return ActionType;
			}else if(FrontImage.toString().equalsIgnoreCase(answerType)){
				return FrontImage;
			}else if(BackImage.toString().equalsIgnoreCase(answerType)){
				return BackImage;
			}else if(Cvv.toString().equalsIgnoreCase(answerType)){
				return Cvv;
			}else if(ExpDate.toString().equalsIgnoreCase(answerType)){
				return ExpDate;
			}else if(DateTime.toString().equalsIgnoreCase(answerType)){
				return DateTime;
			}else if(Service.toString().equalsIgnoreCase(answerType)){
				return Service;
			}else if(Reminders.toString().equalsIgnoreCase(answerType)){
				return Reminders;
			}else{
				return Text;
			}
		}
		
		public boolean isConsentForm(){
			return this.equals(ConsentForm);
		}
		public boolean isLimitAmount(){
			return this.equals(LimitAmount);
		}
		public boolean isChargeType(){
			return this.equals(ChargeType);
		}
		public boolean isBank(){
			return this.equals(Bank);
		}
		public boolean isBeneficiaryAccount(){
			return this.equals(BeneficiaryAccount);
		}
		public boolean isSwift(){
			return this.equals(Swift);
		}
		public boolean isDealNumber(){
			return this.equals(DealNumber);
		}
		public boolean isTransactionTouchId(){
			return this.equals(TransactionTouchId);
		}
		public boolean isLoginTouchId(){
			return this.equals(LoginTouchId);
		}
		public boolean isPayments(){
			return this.equals(Payments);
		}
		public boolean isOperationType(){
			return this.equals(OperationType);
		}
		public boolean isRefunds(){
			return this.equals(Refunds);
		}
		public boolean isStandingOrder(){
			return this.equals(StandingOrder);
		}
		public boolean isFirstName(){
			return this.equals(FirstName);
		}
		public boolean isLastName(){
			return this.equals(LastName);
		}
		public boolean isNickName(){
			return this.equals(NickName);
		}
		public boolean isWaferli(){
			return this.equals(Waferli);
		}
		public boolean isSavingPurpose(){
			return this.equals(SavingPurpose);
		}
		public boolean isFinance(){
			return this.equals(Finance);
		}		
		public boolean isChequeBook(){
			return this.equals(ChequeBook);
		}
		public boolean isMobileNumber(){
			return this.equals(MobileNumber);
		}
		public boolean isPackage(){
			return this.equals(Package);
		}
		public boolean isCardNumber(){
			return this.equals(CardNumber);
		}
		public boolean isProduct(){
			return this.equals(Product);
		}
		public boolean isCompany(){
			return this.equals(Company);
		}
		public boolean isServiceType(){
			return this.equals(ServiceType);
		}		
		public boolean isApprovalType(){
			return this.equals(ApprovalType);
		}		
		public boolean isTypes(){
			return this.equals(Types);
		}
		public boolean isMinAmount(){
			return this.equals(MinAmount);
		}
		public boolean isAutoRenewal(){
			return this.equals(AutoRenewal);
		}
		public boolean isFromAccount(){
			return this.equals(FromAccount);
		}
		public boolean isProfitAccount(){
			return this.equals(ProfitAccount);
		}
		public boolean isTripModify(){
			return this.equals(TripModify);
		}
		public boolean isCountry(){
			return this.equals(Country);
		}
		public boolean isProviderType(){
			return this.equals(ProviderType);
		}
		public boolean isAccountOrMobile(){
			return this.equals(AccountOrMobile);
		}
		public boolean isActivationCode(){
			return this.equals(ActivationCode);
		}
		public boolean isActivate(){
			return this.equals(Activate);
		}
		public boolean isBeneficiaryName(){
			return this.equals(BeneficiaryName);
		}
		public boolean isIBANNumber(){
			return this.equals(IBANNumber);
		}
		public boolean isBranchName(){
			return this.equals(BranchName);
		}
		public boolean isMobile(){
			return this.equals(Mobile);
		}
		public boolean isAccountType(){
			return this.equals(AccountType);
		}
		public boolean isDepositType(){
			return this.equals(DepositType);
		}
		public boolean isTenure(){
			return this.equals(Tenure);
		}
		public boolean isDates(){
			return this.equals(Dates);
		}
		public boolean isCharityPayee(){
			return this.equals(CharityPayee);
		}
		public boolean isPurpose(){
			return this.equals(Purpose);
		}
		public boolean isBranch(){
			return this.equals(Branch);
		}
		public boolean isOrganization(){
			return this.equals(Organization);
		}
		public boolean isKnetPaymentId(){
			return this.equals(KnetPaymentId);
		}
		public boolean isCreditCard(){
			return this.equals(CreditCard);
		}
		public boolean isReason(){
			return this.equals(Reason);
		}
		public boolean isDebitCard(){
			return this.equals(DebitCard);
		}
		public boolean isAmount(){
			return this.equals(Amount);
		}
		public boolean isAccount(){
			return this.equals(Account);
		}
		public boolean isDebitAccount(){
			return this.equals(DebitAccount);
		}
		public boolean isCreditAccount(){
			return this.equals(CreditAccount);
		}
		public boolean isPassword(){
			return this.equals(Password);
		}
		public boolean isNumeric(){
			return this.equals(Numeric);
		}
		public boolean isText(){
			return this.equals(Text);
		}
		public boolean isPayee(){
			return this.equals(Payee);
		}
		public boolean isCivilId(){
			return this.equals(CivilId);
		}
		public boolean isCode(){
			return this.equals(Code);
		}
		public boolean isGiftCard(){
			return this.equals(GiftCard);
		}
		public boolean isStore(){
			return this.equals(Store);
		}
		public boolean isBeneficiary(){
			return this.equals(Beneficiary);
		}
		public boolean isCurrency(){
			return this.equals(Currency);
		}
		public boolean isConvertCurrencyUnit(){
			return this.equals(ConvertCurrencyUnit);
		}
		public boolean isConfirm(){
			return this.equals(Confirm);
		}
		public boolean isDuration(){
			return this.equals(Duration);
		}
		public boolean isName(){
			return this.equals(Name);
		}
		public boolean isComments(){
			return this.equals(Comments);
		}
		public boolean isReplace(){
			return this.equals(Replace);
		}
		public boolean isFiles(){
			return this.equals(Files);
		}
		public boolean isCategory(){
			return this.equals(Category);
		}
		public boolean isHotels(){
			return this.equals(Hotels);
		}
		public boolean isAirlines(){
			return this.equals(Airlines);
		}
		public boolean isLoyaltyAccountNumber(){
			return this.equals(LoyaltyAccountNumber);
		}
		public boolean isFlyerNumber(){
			return this.equals(FlyerNumber);
		}
		public boolean isEmail(){
			return this.equals(Email);
		}
		public boolean isCashback(){
			return this.equals(Cashback);
		}
		public boolean isPoints(){
			return this.equals(Points);
		}
		public boolean isOptions(){
			return this.equals(Options);
		}
		public boolean isProfileDetails(){
			return this.equals(ProfileDetails);
		}
		public boolean isRegister(){
			return this.equals(Register);
		}
		public boolean isTermsAndConditions(){
			return this.equals(TermsAndConditions);
		}
		public boolean isPin(){
			return this.equals(Pin);
		}
		public boolean isLinkedAccount(){
			return this.equals(LinkedAccount);
		}
		public boolean isActionType(){
			return this.equals(ActionType);
		}
		public boolean isFrontImage(){
			return this.equals(FrontImage);
		}
		public boolean isBackImage(){
			return this.equals(BackImage);
		}
		public boolean isCvv(){
			return this.equals(Cvv);
		}
		public boolean isExpDate(){
			return this.equals(ExpDate);
		}
		public boolean isService(){
			return this.equals(Service);
		}
		public boolean isDateTime(){
			return this.equals(DateTime);
		}
		public boolean isReminders(){
			return this.equals(Reminders);
		}
	}
	
	public static enum E_CHAT_QUESTION_TYPES{
		FIXED, QUERY, STANDARD, LOOKUP, REDIRECTION;
		public static E_CHAT_QUESTION_TYPES getEnumVal(String questionType) {
			if(FIXED.toString().equalsIgnoreCase(questionType)){
				return FIXED;
			}else if(QUERY.toString().equalsIgnoreCase(questionType)){
				return QUERY;
			}else if(LOOKUP.toString().equalsIgnoreCase(questionType)){
				return LOOKUP;
			}else if(REDIRECTION.toString().equalsIgnoreCase(questionType)){
				return REDIRECTION;
			}else {
				return STANDARD;
			}
		}
		public boolean isFixed(){
			return this.equals(FIXED);
		}
		public boolean isQuery(){
			return this.equals(QUERY);
		}
		public boolean isStandard(){
			return this.equals(STANDARD);
		}	
		public boolean isLookup(){
			return this.equals(LOOKUP);
		}
	}
	
	public static class E_CHAT_EMOJI{
		private E_CHAT_EMOJI(){}
		
		public static final String successTick = new String(Character.toChars(0x2705)); //tick emoji
		public static final String crossIcon = new String(Character.toChars(0x274C));//X emoticon
		public static final String sadFace = new String(Character.toChars(0x1F629));// :( emoticon
		public static final String kuwaitFlag = new String(Character.toChars(0x1F1FC));//Kuwait flag
		public static final String exclamation = new String(Character.toChars(0x26A0));//yellow Exclamation Mark
		public static final String mobilePhone = new String(Character.toChars(0x1F4F1));//Mobile Phone Emoji
		public static final String cardEmoji = new String(Character.toChars(0x1F4B3));//Card emoji
		public static final String hourGlassEmoji = new String(Character.toChars(0x23F3));//Hourglass emoji
		public static final String calendarEmoji = new String(Character.toChars(0x1F4C6));//Calendar emoji
		public static final String descriptionEmoji = new String(Character.toChars(0x1F4DD));//Description Emoji
		public static final String stopHandEmoji = new String(Character.toChars(0x1F91A));//Stop Hand Emoji
		public static final String amountEmoji = new String(Character.toChars(0x1F4B0));//Amount ($) emoji
		public static final String infoEmoji = new String(Character.toChars(0x2139));//Info Emoji
		public static final String typesEmoji = new String(Character.toChars(0x1F5C2));//Card Index Divider Emoji
		public static final String accountEmoji = new String(Character.toChars(0x270F));//Pencil Emoji
		public static final String pdfIcon = new String(Character.toChars(0x1F4C3));//page with curl
		public static final String planeIcon = new String(Character.toChars(0x1F6E9));//Plane icon
		public static final String medalIcon = new String(Character.toChars(0x1F3C5));//Medal icon
		public static final String thumbsUpIcon = new String(Character.toChars(0x1F44D));//Thumbs-up icon
		public static final String moneyWingsEmoji = new String(Character.toChars(0x1F4B8));//Money with wings emoji
		public static final String personEmoji = new String(Character.toChars(0x1F464));//person silhouette emoji
		public static final String multiPersonEmoji = new String(Character.toChars(0x1F465));//Multiple people silhouette emoji
		public static final String lockKeyEmoji = new String(Character.toChars(0x1F510));//Lock/Key emoji
		public static final String numbersEmoji = new String(Character.toChars(0x1F522));//Numbers 1234 emoji
		public static final String searchEmoji = new String(Character.toChars(0x1F50D));//Magnifying Glass emoji
		public static final String currencyEmoji = new String(Character.toChars(0x1F4B1));//Magnifying Glass emoji
		public static final String rightArrowEmoji = new String(Character.toChars(0x27A1));//Right Arrow emoji
		public static final String leftArrowEmoji = new String(Character.toChars(0x2B05));//Left Arrow emoji
	}
	
	public static enum E_CHAT_SHORTCUT_TYPES{
		Account, CreditAccount, CreditCard, DebitCard, Mobile;
	}
	
	public static enum E_CHAT_CONFIRMATION_ITEMS{
		Yes, No;
	}
	
	public enum E_CHAT_USER_STAGE implements Serializable{
		READY_TO_SERVE, //This will be the default stage of the customer after final response of a service or during the first login to chat
		BUSY_TO_FULFILL_SERVICE, //This is when a final fulfillment of a request is in process
		BUSY_TO_ANSWER, //Currently, the server is busy to process the answer given by the customer in the middle of a service life cycle
		READY_TO_ANSWER;//Server has asked a question and is waiting for customer to give a response
	}
	
	public static class E_CHAT_ACCOUNT_TYPE_SEARCH {
		private E_CHAT_ACCOUNT_TYPE_SEARCH(){}
		
		public static final String PREMIUM_ACCOUNTS 	= "Premium";
		public static final String CURRENT_ACCOUNT 		= "current";
	    public static final String SALARY_ACCOUNT 		= "salary";
	    public static final String SAVING_ACCOUNT 		= "saving";
	    public static final String PERSONAL_FINANCE_ACCOUNT = "finance";
	    public static final String WOW_ACCOUNTS 		= "wow";
	}
	
	public static class E_CHAT_SUBSTITUTION_VARIABLES {
		private E_CHAT_SUBSTITUTION_VARIABLES(){}
		
		public static final String ACCOUNT 							= "<Account>";
		public static final String AMOUNT 							= "<Amount>";
		public static final String AMOUNT_IN_KWD 					= "<EquivalentAmountInKWD>";
		public static final String ACTION 							= "<Action>";
		public static final String ACCOUNT_TYPE 					= "<AccountType>";
		public static final String ACCOUNT_CURRENCY 				= "<AccountCurrency>";
		public static final String AUTO_RENEWAL 					= "<AutoRenewal>";
		public static final String ACCOUNT_POINT_RATE 				= "<AccountPointRate>";
		public static final String ACCOUNT_MATURITY_DATE 			= "<AccountMaturityDate>";
		public static final String ADDRESS 							= "<Address>";
		public static final String AVAILABLE_BALANCE 				= "<AvailableBalance>";
		public static final String ACTION_TYPE 						= "<ActionType>";
		public static final String AIRLINE_OR_HOTEL 				= "<AirlineOrHotel>";
		
		public static final String BANK_ADDRESS						= "<BankAddress>";
		public static final String BENEFICIARY 						= "<Beneficiary>";
		public static final String BRANCH_NAME 						= "<Branch_Name>";
		public static final String BANK 							= "<Bank>";
		public static final String BALANCE 							= "<Balance>";
		
		public static final String CREDIT_ACCOUNT 					= "<CreditAccount>";
		public static final String CARD 							= "<Card>";
		public static final String CURRENCY_ISO 					= "<Currency>";
		public static final String COMPANY_NAME 					= "<CompanyName>";
		public static final String COMMENTS 						= "<Comments>";
		public static final String CARD_ACTION 						= "<CardAction>";
		public static final String CREDIT_CARD 						= "<CreditCard>";
		public static final String COUNTRIES 						= "<Countries>";
		public static final String CREDIT_AMOUNT 					= "<CreditAmount>";
		public static final String CHARGE_TYPE						= "<ChargesType>";
		public static final String CARD_PIN							= "<CardPin>";
		public static final String CUSTOMER_NAME					= "<CustomerName>";
		public static final String CHEQUE_BOOK						= "<ChequeBook>";
		public static final String CERTIFICATE_TYPE					= "<CertificateType>";
		public static final String CIVIL_ID							= "<CivilID>";
		public static final String CIF								= "<CIF>";
		
		public static final String DEBIT_ACCOUNT 					= "<DebitAccount>";
		public static final String DATE 							= "<Date>";
		public static final String DEBIT_ACCOUNT_AVAILABLE_BALANCE 	= "<AvailableBalance>";
		public static final String DEBIT_CARD 						= "<DebitCard>";
		public static final String DEBIT_AMOUNT 					= "<DebitAmount>";
		public static final String DEBIT_ACCOUNT_CURRENCY			= "<DebitAccountCurrency>";
		public static final String DISCOUNT							= "<Discount>";
		public static final String DURATION							= "<Duration>";
		public static final String MSG_DESCRIPTION					= "<MsgDesc>";
		
		public static final String EXCHANGE_RATE 					= "<ExchangeRate>";
		public static final String EXPECTED_PROFIT_RATE 			= "<ExpectedProfitRate>";
		public static final String EMAIL 							= "<Email>";
		
		public static final String FROM_CURRENCY_ISO 				= "<FromCurrency>";
		public static final String FROM_DATE 						= "<FromDate>";
		public static final String FIXED_DEPOSIT_TYPE 				= "<FixedDepositType>";
		public static final String FROM_ACCOUNT 					= "<FromAccount>";
		public static final String FINANCE							= "<Finance>" ;
		public static final String FIRST_NAME						= "<FirstName>" ;
		public static final String FEES								= "<Fees>" ;
		public static final String FLYER_NUMBER 					= "<FlyerNumber>";
		
		public static final String GIFT_CARD 						= "<GiftCard>";
		public static final String GENERIC_NOTE 					= "<GenericNote>";
		public static final String GENERIC_MESSAGE					= "<GenericMessage>";
		public static final String GENERIC_NUMBER					= "<GenericNumber>" ;
		public static final String GENERIC_LABEL					= "<GenericLabel>" ;
		
		public static final String LAST_NAME						= "<LastName>" ;
		public static final String LAST_TRANSACTION					= "<LastTransaction>" ;
		public static final String LOYALTY_ACCOUNT 					= "<LoyaltyNumber>";
		
		public static final String MOBILE_NUMBER 					= "<MobileNumber>";
		public static final String MOBILE_TYPE 						= "<MobileType>";
		public static final String MONEY_TRANSFER_FEES 				= "<MoneyTransferFees>";
		public static final String MAX_LIMIT						= "<MaxLimit>";
		public static final String MIN_LIMIT						= "<MinLimit>";
		
		public static final String NEW_ACCOUNT_AVAILABLE_BALANCE 	= "<NewAccountAvailableBalance>";		
		public static final String NEW_ACCOUNT_NUMBER 				= "<NewAccountNumber>";
		public static final String NEW_ACCOUNT_CURRENT_BALANCE		= "<NewAccountCurrentBalance>";
		public static final String NAME 							= "<Name>";
		public static final String NICK_NAME 						= "<NickName>";
		
		public static final String ORGANIZATION 					= "<Organization>";
		public static final String OTHER_PURPOSE					= "<OtherPurpose>";
		public static final String OPERATION						= "<Operation>";
		public static final String OTP								= "<OTP>";
		
		public static final String PAYME_URL 						= "<PayMeURL>";
		public static final String PACKAGE							= "<Package>";
		public static final String PAYMENT_REF						= "<paymentRef>";
		public static final String PROFIT_ACCOUNT 					= "<ProfitAccount>";
		public static final String PAYOUT_AMOUNT 					= "<PayoutAmount>";
		public static final String POINTS 							= "<Points>";
		
		public static final String REASON 							= "<Reason>";
		public static final String RESULT 							= "<Result>";
		public static final String RESPONSE 						= "<Response>";
		public static final String RECEIVER_FIRST_NAME 				= "<ReceiverFirstName>";
		public static final String RECEIVER_LAST_NAME 				= "<ReceiverLastName>";
		public static final String RECURRING_INTERVAL				= "<RecurringInterval>";
		
		public static final String STORE 							= "<Store>";
		public static final String STREET 							= "<Street>";
		public static final String SOURCE_CURRENCY 					= "<SourceCurrency>";
		public static final String SWIFT_CODE						= "<BankSwiftCode>";
		public static final String SERVICE_ID						= "<Service>";
		public static final String SERVICE_NAME						= "<ServiceName>";
		public static final String SERVICE_TYPE						= "<ServiceType>";
		public static final String STATUS							= "<Status>";
		public static final String SAVING_PURPOSE					= "<SavingPurpose>";
		public static final String INFO_MESSAGE						= "<Service>";
		
		public static final String TRACKING_NUMBER 					= "<TrackingNumber>";
		public static final String TENURE_TYPE 						= "<Tenure>";		
		public static final String TO_CURRENCY_ISO 					= "<ToCurrency>";
		public static final String TO_DATE						 	= "<ToDate>";
		public static final String TO_ACCOUNT 						= "<ToAccount>";
		public static final String TYPE 							= "<Type>";
		public static final String TRANSACTIONS 					= "<Transactions>";
		public static final String TRANSACTION_ID 					= "<TransactionID>";
		public static final String WORKING_HOURS 					= "<Working_Hours>";		
		public static final String INITIAL_DEPOSIT 					= "<InitialDeposit>";
		public static final String LEAVES_PER_BOOK 					= "<LeavesPerBook>";
		public static final String LANGUAGE 						= "<Language>";
		
		public static final String USER_NAME 						= "<UserName>";
		
		
	}
		
	public static class E_CHAT_DEFAULT_VALUES {
		private E_CHAT_DEFAULT_VALUES(){}
		
		public static final int GENERAL_SERVICE = 517 ;
		public static final String COMPONENT_ID = "20" ;
		public static final String DEFAULT_COMPONENT_ID = "0" ;
		
	}
	
	public static class E_CHAT_MESSAGE_TYPE {
		 private E_CHAT_MESSAGE_TYPE(){}
		
		public static final int DEFAULT_TYPE = 1;
		public static final int HTML_TYPE = 2;
		
	}
	
	public static class E_CHAT_MANAGED_CONVERSATION_STATUS {
		private E_CHAT_MANAGED_CONVERSATION_STATUS(){}
		
		public static final int IGNORED = 0 ;
		public static final int ADD_AS_ALIAS = 1 ;
	}
	
	public static class E_CHAT_ALLOWED_PARAMETERS{

		protected static final ArrayList<String> allowdQueries = new ArrayList<String>() {
			 
			private static final long serialVersionUID = 1L;
			{
			    add("select 'The time right now is '||TO_CHAR(sysdate, 'HH:MI AM') from dual".toLowerCase());
			    add("SELECT 'YOUR LAST LOGIN TIME WAS ON '||TO_CHAR(LAST_LOGIN_DATE, 'DD-MON-YYYY HH:MI:SS PM') RESPONSE FROM CUSTS_PROFILES WHERE CIF=[CUSTOMERDTO.CIFNUMBER]".toLowerCase());
			    add("select 'The time now is '||TO_CHAR(sysdate, 'HH:MI AM') from dual".toLowerCase()) ;
			    add("select 'اختاري 'الساعة '||TO_CHAR(sysdate, 'HH:MI AM') from dual".toLowerCase()) ;
			    add("select 'اختر 'الساعة '||TO_CHAR(sysdate, 'HH:MI AM') from dual".toLowerCase()) ;
			    add("select 'ااخر آخر عملية تسجيل دخول لك كانت في '||TO_CHAR(LAST_LOGIN_DATE, 'DD-MON-YYYY HH:MI:SS PM') RESPONSE FROM CUSTS_PROFILES WHERE CIF=[CUSTOMERDTO.CIFNUMBER]".toLowerCase());
			    add("select 'اختر 'آخر عملية تسجيل دخول لك كانت في '||TO_CHAR(LAST_LOGIN_DATE, 'DD-MON-YYYY HH:MI:SS PM') RESPONSE FROM CUSTS_PROFILES WHERE CIF=[CUSTOMERDTO.CIFNUMBER]".toLowerCase());
			    add("select NVL2(RM_OFFICER_NAME_EN, '<emoji type=\"PERSON\"/>'||RM_OFFICER_NAME_EN, 'You do not have a Relationship Manager') || NVL2(RM_OFFICER_EMAIL, chr(10) || '<emoji type=\"EMAIL\"/>'||RM_OFFICER_EMAIL, '') || NVL2(RM_OFFICER_MOBILE, chr(10) || '<emoji type=\"MOBILE_PHONE\"/>'||RM_OFFICER_MOBILE, '') from custs_profiles where CIF=[customerDTO.cifNumber]".toLowerCase());
			    add("select NVL2(RM_OFFICER_NAME_EN, '<emoji type=\"PERSON\"/>'||RM_OFFICER_NAME_EN, 'لا توجد لديكم مسؤول حسابات العملاء') || NVL2(RM_OFFICER_EMAIL, chr(10) || '<emoji type=\"EMAIL\"/>'||RM_OFFICER_EMAIL, '') || NVL2(RM_OFFICER_MOBILE, chr(10) || '<emoji type=\"MOBILE_PHONE\"/>'||RM_OFFICER_MOBILE, '') from custs_profiles where CIF=[customerDTO.cifNumber]".toLowerCase());
			}		
		};
		
		
		
		protected static final ArrayList<String> allowdSubstitutionVariables = new ArrayList<String>() {
			 
			private static final long serialVersionUID = 1L;
			{
			    add("[customerDTO.camelCaseBotDisplayBriefNameEn]".toLowerCase());
			    add("[customerDTO.camelCaseBotDisplayBriefNameAr]".toLowerCase());
			    add("[CUSTOMERDTO.CIFNUMBER]".toLowerCase());		
			    add("[customerDOBFormatted]".toLowerCase()) ;
			    add("[creditCardsList]".toLowerCase());
			    add("[debitCardsList]".toLowerCase());
			    add("[allCards]".toLowerCase());
			    add("[allFinances]".toLowerCase());
			    add("[totalAccountsBalance]".toLowerCase());
			    add("[totalMurabahaInstallments]".toLowerCase());
			    add("[allAccounts]".toLowerCase());
			    add("[weather]".toLowerCase());
			}	
			
		};
		
		//Added to allow flexibility adding properties without violating security controls
		private static final ArrayList<String> prohibitedSubstitutionVariables = new ArrayList<String>() {
			 
			private static final long serialVersionUID = 1L;
			{
			    add("[pin]".toLowerCase());
			    add("[password]".toLowerCase());
			    add("[answer]".toLowerCase());		
			    add("[touchKey]".toLowerCase());		
			    add("[sessionId]".toLowerCase());	
			    add("[salary]".toLowerCase());	
			    add("[loginPassword]".toLowerCase());	
			    add("[confirmLoginPassword]".toLowerCase());	
			    add("[transactionPassword]".toLowerCase());	
			    add("[confirmTransactionPassword]".toLowerCase());	
			    add("[key]".toLowerCase());	
			    
			}		
		};

		public static ArrayList<String> getProhibitedsubstitutionvariables() {
			return prohibitedSubstitutionVariables;
		}
		
	}
	
	/**
	 * The various display types of a fixed answer retrieved from knowledge repo
	 */
	public static class E_CHAT_ANSWER_DISPLAY_TYPE {
		private E_CHAT_ANSWER_DISPLAY_TYPE(){}
		
		public static final Integer NON_POPUP = 1 ;
		public static final Integer POPUP = 2 ;
	}
	
	/**
	 * The various content type retrieved for a fixed answer from knowledge repo
	 */
	public static class E_CHAT_POPUP_CONTENT_TYPE {
		private E_CHAT_POPUP_CONTENT_TYPE(){}
		
		public static final Integer TEXT = 1 ;
		public static final Integer HTML = 2 ;
		public static final Integer URL = 3 ;
		public static final Integer IMAGE = 4 ;
		public static final Integer PDF = 5 ;
	}
	
	
	public static class E_CHAT_STAGE_ID {
		private E_CHAT_STAGE_ID(){}
		
		public static final Integer FINAL_RESPONSE_ERROR		= 1;//This will be a case when the user exits a service lifeycle without successfully completing
		public static final Integer FINAL_OPERATION_SUCCESSFUL	= 2;//This will be a case when the user exits a service lifeycle by successfully completing
	}
	
	/**
	 * The various possible sizes in which the popup can be shown on the app
	 */
	public static class E_CHAT_POPUP_SIZE {
		private E_CHAT_POPUP_SIZE(){}
		
		public static final String SMALL = "Small" ;
		public static final String MEDIUM = "Medium" ;
		public static final String LARGE = "Browser" ;
	}
	
	public static class E_CHAT_REPO_ANSWER_TYPE {
		private E_CHAT_REPO_ANSWER_TYPE(){}
		
		public static final Integer DEFAULT 		= 1 ;
		public static final Integer URL 			= 2 ;
		public static final Integer IMAGE_URL 		= 3 ;
		public static final Integer SQL_HTML_TABLE 	= 4 ;
		public static final Integer YOUTUBE 		= 5 ;
		public static final Integer HTML_BUBBLE 	= 6 ;
		public static final Integer VOICE 			= 7 ;
		public static final Integer CHART 			= 8 ;
	}
	
	/**
	 * @author 02780 Neelkanth Tripathi
	 * Possible Values for app to understand the keyboard type to show in the bottom by default
	 */
	public static class E_CHAT_KEYBOARD_MODE {
		private E_CHAT_KEYBOARD_MODE(){}
		
		public static final String SHOW_KEYBOARD 		= "keyboard" ;
		public static final String SHOW_ICONS 			= "icons" ;
	}
	
	/**
	 * @author 02780 Neelkanth Tripathi
	 * Possible Values for app to understand what layout to use for custom components
	 */
	public static class E_CHAT_LAYOUT_STYLE {
		private E_CHAT_LAYOUT_STYLE(){}
		
		public static final String NORMAL 					= "Normal" ;//Default
		public static final String LONG 					= "Long" ;//Each Component will be a one line long view
		public static final String CARD_STYLE_1 			= "CardLayout_1" ;//Show 6 cells
		public static final String CARD_STYLE_2 			= "CardLayout_2" ;//Show 3 cells
	}
	
	/**
	 * @author 02780 Neelkanth Tripathi
	 * Possible Values for app to understand how to scroll through custom components when layout style is card view
	 */
	public static class E_CHAT_SCROLL_STYLE {
		private E_CHAT_SCROLL_STYLE(){}
		
		public static final String HORIZONTAL 					= "Horizontal" ;//Swipe right to view next component
		public static final String VERTICAL 					= "Vertical" ;//Swipe down to view next component
	}
	
	/**
	 * @author 02780 Neelkanth Tripathi
	 * Possible Values for Debit Card and Credit Card for Card Usage Service
	 */
	public static class E_CHAT_CARD_TYPE_VALUES {
		private E_CHAT_CARD_TYPE_VALUES(){}
		
		public static final String CREDIT_CARD 		= "CREDIT CARD" ;
		public static final String DEBIT_CARD 		= "DEBIT CARD" ;
	}
	
	/**
	 * @author 02780 Neelkanth Tripathi
	 * Possible Values for Msa3ed access scopes
	 */
	public static class E_CHAT_SCOPE_VALUES {
		private E_CHAT_SCOPE_VALUES(){}
		
		public static final Integer PUBLIC 			= 1 ;
		public static final Integer PROTECTED 		= 2 ;
		public static final Integer PRIVATE 		= 3 ;
		
		public static final String PUBLIC_STR 			= "Public" ;
		public static final String PROTECTED_STR 		= "Protected" ;
		public static final String PRIVATE_STR 			= "Private" ;
	}
	
	/** 
	 * Possible Values for usman Select Redemption Options
	 */
	public static class E_CHAT_usman_SELECT_REDEMPTION_OPTION {
		private E_CHAT_usman_SELECT_REDEMPTION_OPTION(){}
		
		public static final String CARDS 		= "1" ;
		public static final String ACCOUNTS 	= "2" ;
	}
	
	public static class E_CHAT_CONFIRMATION {
		private E_CHAT_CONFIRMATION(){}
		
		public static final String YES 			= "Yes" ;
		public static final String NO 			= "No" ;
	}
	
	public static class SOCIAL_MEDIA { //The various platforms on which msa3ed will be available. This value will also be stored in DB
		private SOCIAL_MEDIA(){}
		
		public static final String WHATSAPP 	= "WHATSAPP";
	}
	
	public static class SOCIAL_MEDIA_GENERIC { //The various platforms on which msa3ed will be available. This value will also be stored in DB
		private SOCIAL_MEDIA_GENERIC(){}
		
		public static final String NOT_AN_MB_USER 					= "SM_NOT_AN_MB_USER";
		public static final String SM_NOT_WHATSAPP_REGISTERED 		= "SM_NOT_WHATSAPP_REGISTERED";
		public static final String SM_ACCOUNT_BALANCE_RESPONSE 		= "SM_ACCOUNT_BALANCE_RESP";
		public static final String SM_LAST_5_ACC_TRANS_NOT_FOUND	= "SM_LAST_5_ACC_TRANS_NOT_FOUND";
		public static final String SM_LAST_5_CC_TRANS_NOT_FOUND 	= "SM_LAST_5_CC_TRANS_NOT_FOUND";
		public static final String SM_LESS_THAN_5_TRANS 			= "SM_LESS_THAN_5_TRANS";
		public static final String SM_5_TRANS_CC_FOOTER				= "SM_5_TRANS_CC_FOOTER";
		public static final String SM_5_TRANS_ACC_FOOTER			= "SM_5_TRANS_ACC_FOOTER";
		public static final String SM_ORGANIZATION_NOT_KNOWN		= "SM_ORGANIZATION_UNKNOWN";
		public static final String SM_VIEW_ALL_ORGANIZATION			= "SM_VIEW_ALL_ORGANIZATION";
		public static final String SM_OFFERED_SERVICES				= "SM_OFFERED_SERVICES";
		public static final String SM_REGISTER_TO_WHATSAPP			= "SM_REGISTER_TO_WHATSAPP";
		public static final String SM_WHATSAPP_SUCCESS_REGISTER		= "SM_WHATSAPP_SUCCESS_REGISTER";
		public static final String SM_OTP_SMS_MSG					= "SM_OTP_SMS_MSG";
		public static final String SM_AUTHENTICATE					= "SM_AUTHENTICATE";
		public static final String SM_WHATSAPP_SUCCESS_UNREGISTER 	= "SM_WHATSAPP_SUCCESS_UNREGISTER";
		public static final String SM_EXCHANGE_RATE_SAMPLE 			= "SM_EXCHANGE_RATE_SAMPLE";
		public static final String SM_NOT_A_BBYN_CUSTOMER			= "SM_NOT_A_BBYN_CUSTOMER";
		public static final String SM_BRANCH_DETAILS 				= "SM_BRANCH_DETAILS";
		public static final String SM_MAP_BRANCHES 					= "SM_MAP_BRANCHES";
		public static final String SM_GENERIC_ERROR					= "SM_GENERIC_ERROR";
	}
	
	public static class HTML_COLOR_CODES{
		private HTML_COLOR_CODES(){}
		
		public static final String BLUE 				= "096EB7";
		public static final String RED 					= "E94F4F";
	}
	
	public static class E_CHAT_VIRTUAL_CARD_MAX_LIMIT {
		private E_CHAT_VIRTUAL_CARD_MAX_LIMIT(){}
				
		public static final double MAXLIMIT 	= 5000.0;	
	}
	
}//class EChatConstants