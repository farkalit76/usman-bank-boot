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
public class TransferConstants {

	private TransferConstants() {
	}

	public static final String RESOURCE_NAME = "/transfer-mgmt";

	public static final String KNET_INITIATE = "/knet/initiate";
	
	public static final String KNET_VALIDATE = "/knet/validate";
	
	public static final String KNET_PAYMENT_SUBMIT = "/knet/paysubmit";
	
	public static final String KNET_PAYMENT_PAY = "/knet/pay";
	
	public static final String KNET_PAYMENT_CONFIRM = "/knet/confirm";
	
	public static final String KNET_PAYMENT_RESPONSE = "/knet/response";
	
	public static final String KNET_PAYMENT_RESULT = "/knet/result";
	
	public static final String KNET_PAYMENT_ERROR = "/knet/error";
	
	public static final String KNET_SOAP_PAYMENT = "/knet/payment";
	
	public static final String KNET_TRANSFERS_HISTORY = "/knet/history";
	
	public static final String STR_MRS = "Mrs.";

	public static final String STR_MR = "Mr.";

	public static final String STR_NINE = "9";
	
	public static final String KNET_IMAL_TRX_TYPE ="800";
	public static final String KNET_BRANCH_CODE ="998";
	public static final String KNET_GLOB_ACCOUNT ="199201003";
	public static final String KNET_ALIAS ="usman";
	public static final String KNET_PAYME_IMAL_TRX_TYPE ="809";
	public static final String KNET_CURRENCY_CODE ="414";
	public static final String KNET_ALLOW_LIMIT_CHECK = "0";
	public static final String KNET_USE_CARD_ACC_NUM = "0";
	public static final String KNET_LIMIT_CURRENCY_CODE = "1";

	
	/**
	 * 
	 */
	public static final String VALIDATION_CUSTOMER_OR_ACCOUNT_DOES_NOT_EXISTS = "Customer or account does not exists.";

	/**
	 * 
	 */
	public static final String VALIDATION_INPUT_VALIDATION_FAILED = "Input validation failed.";
	
	/**
	 * 
	 */
	public static final String CUSTOMER_ACCOUNT_NOT_FOUND = "Customer Account Not found.";

	/**
	 * 
	 */
	public static final String ALL_ACCOUNTS_LOADED = "All Accounts loaded.";
	/**
	 * 
	 */
	public static final String PAYMENT_CONFIRMATION_FAILED = "Payment confirmation failed.";

	/**
	 * 
	 */
	public static final String PAYMENT_CONFIRMATION_PROCESSED_SUCCESSFULLY = "Payment confirmation processed successfully.";

	/**
	 * 
	 */
	public static final String KNET_PAY_INIT_FAILED = "KNet Pay init failed.";

	/**
	 * 
	 */
	public static final String KNET_PAY_INITIATED_SUCCESSFULLY = "KNet Pay initiated successfully.";

	/**
	 * 
	 */
	public static final String KNET_TRANSFER_ALL_DATA_CREATED_SUCCESSFULLY = "KNet Transfer All Data Created successfully.";

	/**
	 * 
	 */
	public static final String CREATE_MASTER_TRANSACTION_FAILED = "Create Master Transaction failed.";

	/**
	 * 
	 */
	public static final String KNET_TRANSFER_UPDATION_FAILED = "KNet Transfer updation failed.";

	/**
	 * 
	 */
	public static final String NEW_TOKEN_CREATION_FAILED = "New Token Creation failed.";

	/**
	 * 
	 */
	public static final String KNET_TRANSFER_CREATION_FAILED = "KNet Transfer Creation failed.";

	/**
	 * 
	 */
	public static final String VALIDATED_SUCCESSFULLY = "Validated successfully.";
	
}
