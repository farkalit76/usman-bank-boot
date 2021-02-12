
package com.usman.bank.constants;

/**
 * This class contains business constants that defined for the bank.
 * 
 * @author Joe Math
 * @version 1.0
 * @since  29-Sep-2011	
 */

public final class UsmanBusinessConstants {
	private UsmanBusinessConstants(){};
	public static final String BANK = "usman Bank";
	public static final Integer BANK_ID = 1;
	public static final String BASE_CURRENCY_CODE = "KWD";
	public static final String LOCAL_COUNTRY_CODE = "1";
	public static final String LOCAL_CURRENCY_CODE = "1";
	public static final String COMPANY_CODE = "1";
	public static final String LOCAL_TRX_TYPE = "L";
	public static final String TRANSACTION_BR_CODE = "998";
	public static final String INTL_TRX_TYPE = "I";
	public static final String BBYN_TRX_TYPE = "B";
	public static final String OWN_TRX_TYPE = "O";

	public static final int RECORD_STATUS_IS_ACTIVE = 1;
	public static final String USA_COUNTRY_CODE = "227";
	public static final String usman_BIC = "BBYNKWKW";//usman Bank Swift Code
	/**
	 * For Application type definition. All E-Services type are defined here. 
	 * 
	 * @category <hr>Application Types </hr>
	 *
	 */
	
	public static class APPLICATION_TYPES{
		private APPLICATION_TYPES(){};
		public static final Integer CHEQUE_BOOK_ID = 182;
		public static final String CHEQUE_BOOK = "Cheque Book Request";
		public static final Integer CERTIFICATE_ID = 183;
		public static final String CERTIFICATE = "Balance/Liability Certificate";
		public static final Integer BANK_ACCOUNT_ID = 1002;
		public static final String BANK_ACCOUNT = "New Bank Account";
		public static final Integer TRANSFER_LIMIT_ID = 184;
		public static final String TRANSFER_LIMIT = "Change Transfer Limit";
		public static final Integer LINK_DELINK_ID = 185;
		public static final String LINK_DELINK = "Link/Delink Accounts";
		public static final Integer BLOCK_ATM_ID = 186;
		public static final String BLOCK_ATM = "Block ATM Card";	
		// Certificate Types
		public static final Integer CERTIFICATE_BALANCE_ID = 100;
		public static final String CERTIFICATE_BALANCE = "Balance Certificate";
		public static final Integer CERTIFICATE_LIABILITY_ID = 101;
		public static final String CERTIFICATE_LIABILITY = "No Liability Certificate";
		public static final Integer CERTIFICATE_REQUEST_STANDARD_CHARGES = 5;
		
		
		//Application Status
		public static final int NEW = 1;
		public static final int OPEN = 2;
		public static final int RESOLVED = 3;
		public static final int DELETED = 4;
	}
	
	public static class PAYMENTS {
		private PAYMENTS(){};
		public static final String PAYMENTS = "Payments";
		public static final String BILL_PAYMENTS = "Bill Payments";
		public static final String BILL_PAYMENT_PAYEE = "Bill Payment Payee";
		public static final String CHARITY_PAYMENTS = "Charity Payments";
		public static final String CREDIT_CARD_PAYMENTS = "Credit Card Payments";
		public static final String FINANCE_PAYMENTS = "Finance Payments";
		
		//For Global Payee and Payee.
		public static final String GLOBAL_PAYEE = "Global Payee";
		public static final String ADD_PAYEE = "Add Payee";
		public static final String EDIT_PAYEE = "Edit Payee";
		public static final int PAYEE_STATUS_ACTIVE = 100;
		public static final int PAYEE_STATUS_INACTIVE = 101;
		public static final int PAYEE_STATUS_DELETED = 102;	
		
		public static final int ALL_PAYEE_TYPES = -1;
		public static final int UTILITY_PAYEE_TYPE = 1;
		public static final int PAYMENT_PAYEE_TYPE = 2;
		public static final int CHARITY_PAYEE_TYPE = 3;
		public static final int SCHOOL_PAYEE_TYPE = 4;
		
		
	}
	
	public static class PAYME_MTHOD {
		private PAYME_MTHOD(){};
		public static final int APP = 1;
		public static final int MOBILE = 2;
	}
	
	public static class DUAL_CONTROL{
		private DUAL_CONTROL(){};
		public static final int APPROVED_STATUS = 1;
		public static final int PENDING_STATUS = 2;
		public static final int REJECTED_STATUS = 3;
		public static final int CANCELLED_STATUS = 4;
		public static final int IN_PROGRESS_STATUS = 5;
		public static final int PARTIAL_EXECUTION = 6;
		public static final int PURGED = 7;
		
		public static final int NEW_OPERATION = 1;
		public static final int EDIT_OPERATION = 2;
		public static final int DELETE_OPERATION = 3;
		
		public static final int WORKING_STORAGE = 1;
		public static final int HISTORY_STORAGE = 2;
		public static final int MASTER_STORAGE = 3;
	}
	
	public static class BENEFICIARIES_CHANNELS{
		private BENEFICIARIES_CHANNELS(){};
		public static final String IB = "IB";
		public static final String E_BANKING = "eBanking";
		public static final String MODULE = "1";

		public static final String MB = "MB";
		public static final String MB_E_BANKING = "eBanking";
		public static final String MB_MODULE = "3";
	}
	
	public static class UTILITY_PAYMENTS_CHANNELS{
		private UTILITY_PAYMENTS_CHANNELS(){};
		public static final String IB = "IB";
		public static final String MB = "MB";
		public static final String IB_TELLER_CODE = "99999";

        public static final String MB_TELLER_CODE = "90219";
        public static final String IB_USERID = "IBUSR";
        public static final String MB_USERID = "MBUSR";

	}	
	
	public static class CHANNELS{
		private CHANNELS(){};
		public static final int CHANNEL_IB_ID = 1;
		public static final String CHANNEL_IB = "Internet Banking";
		public static final int CHANNEL_MB_ID = 2;
		public static final String CHANNEL_MB = "Mobile Banking";
		public static final int CHANNEL_IVR_ID =3;
		public static final String CHANNEL_IVR = "IVR";
	}
	
	public static class APIS_CONSTANTS{
		private APIS_CONSTANTS(){};
		public static final String IB_TERMINAL = "IB";
		public static final String IB_CREATED_BY = "eBanking";
		public static final String IB_AUTHORIZED_BY = "1";
		public static final String IB_TRANSACTION_ORGIN = "E";
		public static final String IB_USER_ID = "IBUSR";
		public static final String IB_TELLER_ID = "IBUSR";

		
		public static final String MB_TERMINAL = "MB";
		public static final String MB_CREATED_BY = "MBUSR";
		public static final String MB_AUTHORIZED_BY = "MBUSR";
		public static final String MB_TRANSACTION_ORGIN = "H";
		public static final String MB_USER_ID = "MBUSR";
		public static final String MB_TELLER_ID = "MBUSR";
		public static final String CUSTOMER_SECURITY_CODE = "1111" ;

	}
	
	//CR 419 IFSC Ahamed Fozil 27.9.2012
	public static class INTERNATIONAL_TRANSFER{
		private INTERNATIONAL_TRANSFER(){};
		public static final String IFSC_INR_ISO = "356";
		public static final String IFSC_INR_IMAL = "64";
		public static final String IFSC_REQ = "Y";
		public static final String IFSC_NOT_REQ = "N";
		public static final Integer USD_CURRENCY_CODE = 840;
	}
}



