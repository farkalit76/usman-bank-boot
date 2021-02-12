/**
 * 
 */
package com.usman.bank.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TransferDTO extends BaseDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected List<ConfirmationItemsDTO> confirmationItemsDTOList;

	private AccountDTO fromAccountDTO;

	private AccountDTO toAccountDTO;

	private BeneficiaryDTO beneficiaryDTO;

	private CustomerTransactionDTO customerTransactionDTO;

	private Double transactionAmount;

	private CurrencyConverationDTO currencyConverationDTO;

	private CustomersDTO customerDTO;

	private int serviceTypeID;

	private int clientChannel;

	private Date transDate;

	private String commentConfirmationItems;

	private String recurringInterval;

	private Date soStartingDate;

	private Date soEndinggDate;

	private Integer noOfPayments;

	private Boolean isPerpetual;

	private String soComment;

	private String clientChannelName;

	private String asTransferType;

	private String chargeType;

	private Integer shareAndOur;

	private Double fees;

	private String imalAsCurrency;

	private Integer allowLimitChecking = 1; /*
											 * this flag to enable/disable limit checking for SOA. 0 = disable, 1 =
											 * enable
											 */

	/*
	 * Sami AL-Hawari date: 13/01/2015 the variable feesInLocalCurrency is used only
	 * in International Trannsfer (share & our option). Used only to show the fees
	 * in KWD amount.
	 * 
	 */
	private double feesInLocalCurrency;
	/**
	 * Statement Description
	 */
	private String statementDescription;

	/*
	 * Sami AL-Hawari date: 09/11/2015 adding these variables to use them instead of
	 * the constants for customAccToAccTransfer method. Used only to show the fees
	 * in KWD amount.
	 */
	private String alAPICode;
	private String alBranchCode;
	private String asReference;
	private String alTrxType;
	private String alUseCardAccNo;
	private String asAccount; // suspense account
	private String asDescEn;
	private String asDescAr;
	private String asDesc;
	private String mobileNo; // used for Pay me service
	private String consigneeName;

	private String booqId;
	private String booqTransactionRef;
	private String cardSecureAlias;
	private String un; /* Unpredictable Number used by NFC Debit */
	private String atc; /* Application Transaction Counter used by NFC Debit */
	private String issuerAppData; /* The issuer app data as a string used by NFC Debit */
	private String issuerCountryCode; /* The country code data as a string used by NFC Debit */
	private String amountStr;
	private String paymentSecureToken;

	private Integer serviceId;

	private String otp;

	private boolean otpIsNotReceived;

	private String comment;// In case of local and Int transfer, if purpose selected is "others", then the
							// value entered in the comment field will appear here
	private String purposeId;// The purposeId selected from the transfer purpose dropdown. This is applicable
								// for Local and Int Transfer

	private Integer paymeMethod; // Through app or mpbile

	private String eventName;
	private boolean showRemainingToOthers;
	private FileDTO fileDTO; /* Used by Pay Me Mutiple payments to upload the event picture. */

	private RequestDTO requestDTO;

	public RequestDTO getRequestDTO() {
		return requestDTO;
	}

	public void setRequestDTO(RequestDTO requestDTO) {
		this.requestDTO = requestDTO;
	}

	public String getClientChannelName() {
		return clientChannelName;
	}

	public void setClientChannelName(String clientChannelName) {
		this.clientChannelName = clientChannelName;
	}

	public Boolean getIsPerpetual() {
		return isPerpetual;
	}

	public void setIsPerpetual(Boolean isPerpetual) {
		this.isPerpetual = isPerpetual;
	}

	public String getSoComment() {
		return soComment;
	}

	public void setSoComment(String soComment) {
		this.soComment = soComment;
	}

	public AccountDTO getFromAccountDTO() {
		return fromAccountDTO;
	}

	public void setFromAccountDTO(AccountDTO fromAccountDTO) {
		this.fromAccountDTO = fromAccountDTO;
	}

	public AccountDTO getToAccountDTO() {
		return toAccountDTO;
	}

	public void setToAccountDTO(AccountDTO toAccountDTO) {
		this.toAccountDTO = toAccountDTO;
	}

	public CurrencyConverationDTO getCurrencyConverationDTO() {
		return currencyConverationDTO;
	}

	public void setCurrencyConverationDTO(CurrencyConverationDTO currencyConverationDTO) {
		this.currencyConverationDTO = currencyConverationDTO;
	}

	public CustomersDTO getCustomerDTO() {
		return customerDTO;
	}

	public void setCustomerDTO(CustomersDTO customerDTO) {
		this.customerDTO = customerDTO;
	}

	public int getServiceTypeID() {
		return serviceTypeID;
	}

	public void setServiceTypeID(int serviceTypeID) {
		this.serviceTypeID = serviceTypeID;
	}

	public int getClientChannel() {
		return clientChannel;
	}

	public void setClientChannel(int clientChannel) {
		this.clientChannel = clientChannel;
	}

	public Date getTransDate() {
		return transDate;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getRecurringInterval() {
		return recurringInterval;
	}

	public void setRecurringInterval(String recurringInterval) {
		this.recurringInterval = recurringInterval;
	}

	public Date getSoStartingDate() {
		return soStartingDate;
	}

	public void setSoStartingDate(Date soStartingDate) {
		this.soStartingDate = soStartingDate;
	}

	public Date getSoEndinggDate() {
		return soEndinggDate;
	}

	public void setSoEndinggDate(Date soEndinggDate) {
		this.soEndinggDate = soEndinggDate;
	}

	public Integer getNoOfPayments() {
		return noOfPayments;
	}

	public void setNoOfPayments(Integer noOfPayments) {
		this.noOfPayments = noOfPayments;
	}

	public BeneficiaryDTO getBeneficiaryDTO() {
		return beneficiaryDTO;
	}

	public void setBeneficiaryDTO(BeneficiaryDTO beneficiaryDTO) {
		this.beneficiaryDTO = beneficiaryDTO;
	}

	public CustomerTransactionDTO getCustomerTransactionDTO() {
		return customerTransactionDTO;
	}

	public void setCustomerTransactionDTO(CustomerTransactionDTO customerTransactionDTO) {
		this.customerTransactionDTO = customerTransactionDTO;
	}

	public String getAsTransferType() {
		return asTransferType;
	}

	public void setAsTransferType(String asTransferType) {
		this.asTransferType = asTransferType;
	}

	public String getStatementDescription() {
		return statementDescription;
	}

	public void setStatementDescription(String statementDescription) {
		this.statementDescription = statementDescription;
	}

	public String getChargeType() {
		return chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public void setShareAndOur(Integer shareAndOur) {
		this.shareAndOur = shareAndOur;
	}

	public Integer getShareAndOur() {
		return shareAndOur;
	}

	public void setFees(Double fees) {
		this.fees = fees;
	}

	public Double getFees() {
		return fees;
	}

	public double getFeesInLocalCurrency() {
		return feesInLocalCurrency;
	}

	public void setFeesInLocalCurrency(double feesInLocalCurrency) {
		this.feesInLocalCurrency = feesInLocalCurrency;
	}

	public String getAlAPICode() {
		return alAPICode;
	}

	public void setAlAPICode(String alAPICode) {
		this.alAPICode = alAPICode;
	}

	public String getAlBranchCode() {
		return alBranchCode;
	}

	public void setAlBranchCode(String alBranchCode) {
		this.alBranchCode = alBranchCode;
	}

	public String getAlTrxType() {
		return alTrxType;
	}

	public void setAlTrxType(String alTrxType) {
		this.alTrxType = alTrxType;
	}

	public String getAlUseCardAccNo() {
		return alUseCardAccNo;
	}

	public void setAlUseCardAccNo(String alUseCardAccNo) {
		this.alUseCardAccNo = alUseCardAccNo;
	}

	public String getAsDescEn() {
		return asDescEn;
	}

	public void setAsDescEn(String asDescEn) {
		this.asDescEn = asDescEn;
	}

	public String getAsDescAr() {
		return asDescAr;
	}

	public void setAsDescAr(String asDescAr) {
		this.asDescAr = asDescAr;
	}

	public String getAsDesc() {
		return asDesc;
	}

	public void setAsDesc(String asDesc) {
		this.asDesc = asDesc;
	}

	public String getAsAccount() {
		return asAccount;
	}

	public void setAsAccount(String asAccount) {
		this.asAccount = asAccount;
	}

	public String getAsReference() {
		return asReference;
	}

	public void setAsReference(String asReference) {
		this.asReference = asReference;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getConsigneeName() {
		return consigneeName;
	}

	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}

	public String getImalAsCurrency() {
		return imalAsCurrency;
	}

	public void setImalAsCurrency(String imalAsCurrency) {
		this.imalAsCurrency = imalAsCurrency;
	}

	public String getBooqId() {
		return booqId;
	}

	public void setBooqId(String booqId) {
		this.booqId = booqId;
	}

	public String getBooqTransactionRef() {
		return booqTransactionRef;
	}

	public void setBooqTransactionRef(String booqTransactionRef) {
		this.booqTransactionRef = booqTransactionRef;
	}

	public Integer getAllowLimitChecking() {
		return allowLimitChecking;
	}

	public void setAllowLimitChecking(Integer allowLimitChecking) {
		this.allowLimitChecking = allowLimitChecking;
	}

	public String getCardSecureAlias() {
		return cardSecureAlias;
	}

	public void setCardSecureAlias(String cardSecureAlias) {
		this.cardSecureAlias = cardSecureAlias;
	}

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getAtc() {
		return atc;
	}

	public void setAtc(String atc) {
		this.atc = atc;
	}

	public String getIssuerAppData() {
		return issuerAppData;
	}

	public void setIssuerAppData(String issuerAppData) {
		this.issuerAppData = issuerAppData;
	}

	public String getIssuerCountryCode() {
		return issuerCountryCode;
	}

	public void setIssuerCountryCode(String issuerCountryCode) {
		this.issuerCountryCode = issuerCountryCode;
	}

	public String getAmountStr() {
		return amountStr;
	}

	public void setAmountStr(String amountStr) {
		this.amountStr = amountStr;
	}

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public boolean getOtpIsNotReceived() {
		return otpIsNotReceived;
	}

	public void setOtpIsNotReceived(boolean otpIsNotReceived) {
		this.otpIsNotReceived = otpIsNotReceived;
	}

	public String getCommentConfirmationItems() {
		return commentConfirmationItems;
	}

	public void setCommentConfirmationItems(String commentConfirmationItems) {
		this.commentConfirmationItems = commentConfirmationItems;
	}

	public String getPurposeId() {
		return purposeId;
	}

	public void setPurposeId(String purposeId) {
		this.purposeId = purposeId;
	}

	public Integer getPaymeMethod() {
		return paymeMethod;
	}

	public void setPaymeMethod(Integer paymeMethod) {
		this.paymeMethod = paymeMethod;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public boolean isShowRemainingToOthers() {
		return showRemainingToOthers;
	}

	public void setShowRemainingToOthers(boolean showRemainingToOthers) {
		this.showRemainingToOthers = showRemainingToOthers;
	}

	public FileDTO getFileDTO() {
		return fileDTO;
	}

	public void setFileDTO(FileDTO fileDTO) {
		this.fileDTO = fileDTO;
	}

	public String getPaymentSecureToken() {
		return paymentSecureToken;
	}

	public void setPaymentSecureToken(String paymentSecureToken) {
		this.paymentSecureToken = paymentSecureToken;
	}

	public List<ConfirmationItemsDTO> getConfirmationItemsDTOList() {
		return confirmationItemsDTOList;
	}

	public void setConfirmationItemsDTOList(List<ConfirmationItemsDTO> confirmationItemsDTOList) {
		this.confirmationItemsDTOList = confirmationItemsDTOList;
	}
}
