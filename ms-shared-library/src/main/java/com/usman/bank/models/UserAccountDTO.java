package com.usman.bank.models;

import java.io.Serializable;
import java.math.BigDecimal;

import com.usman.bank.enums.AccountTypesEnum;

/**
 * Created by Veneesh on 9/8/14. Reviewed by Waleed Alhasawi
 */
public class UserAccountDTO extends CommonDBDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String accountId;
	private String linkedToAccountId;
	private UserAccountDTO linkedToAccountDTO;

	private int linkedToAccountStatusId;
	private long assignmentId;
	private int assignmentStatusId;
	private LookupDTO assignmentStatusIdLookup;
	private String accountNumber;
	private String formattedAccountNumber;
	private UserDTO owner;
	private int accountCurrencyID;
	private String nickNameEn;
	private String nickNameAr;
	private String nickName;
	// private long assignedToUserId;
	private int statusId;
	private LookupDTO accountStatusLookup;
	private BigDecimal openingBalance;
	private BigDecimal openingPeriodBalance;
	private BigDecimal holdBalance;
	private BigDecimal availableBalance;
	private BigDecimal currentBalance;
	private int accountTypeId;
	private LookupDTO accountTypeLookup;
	private int accountCategoryId;
	private LookupDTO accountCategoryLookup;
	private boolean isDefault;
	// private AccountConfigDTO accountConfig;
	// private LimitUtilizationDTO accountLimitUtilizationDTO;
	// private LimitUtilizationDTO usrLimitUtilizationDTO;
	private UserDTO assignedToUserDTO;
	private String referenceCode;

	public UserAccountDTO() {
	}

	public UserAccountDTO(String accountId, String accountNumber, BigDecimal availableBalance, BigDecimal currentBalance) {
		this.accountId = accountId;
		this.accountNumber = accountNumber;
		this.availableBalance = availableBalance;
		this.currentBalance = currentBalance;
	}

	public UserAccountDTO getLinkedToAccountDTO() {
		return linkedToAccountDTO;
	}

	public void setLinkedToAccountDTO(UserAccountDTO linkedToAccountDTO) {
		this.linkedToAccountDTO = linkedToAccountDTO;
	}

	public LookupDTO getAssignmentStatusIdLookup() {
		return assignmentStatusIdLookup;
	}

	public void setAssignmentStatusIdLookup(LookupDTO assignmentStatusIdLookup) {
		this.assignmentStatusIdLookup = assignmentStatusIdLookup;
	}

	public LookupDTO getAccountCategoryLookup() {
		return accountCategoryLookup;
	}

	public void setAccountCategoryLookup(LookupDTO accountCategoryLookup) {
		this.accountCategoryLookup = accountCategoryLookup;
	}

	public LookupDTO getAccountStatusLookup() {
		return accountStatusLookup;
	}

	public void setAccountStatusLookup(LookupDTO accountStatusLookup) {
		this.accountStatusLookup = accountStatusLookup;
	}

	public LookupDTO getAccountTypeLookup() {
		return accountTypeLookup;
	}

	public void setAccountTypeLookup(LookupDTO accountTypeLookup) {
		this.accountTypeLookup = accountTypeLookup;
	}

	public UserDTO getAssignedToUserDTO() {
		return assignedToUserDTO;
	}

	public void setAssignedToUserDTO(UserDTO assignedToUserDTO) {
		this.assignedToUserDTO = assignedToUserDTO;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

//    public long getUserId() {
//        return userId;
//    }
//
//    public void setUserId(long userId) {
//        this.userId = userId;
//    }

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountCurrencyID() {
		return accountCurrencyID;
	}

	public void setAccountCurrencyID(int accountCurrencyID) {
		this.accountCurrencyID = accountCurrencyID;
	}

	public String getNickNameEn() {
		return nickNameEn;
	}

	public void setNickNameEn(String nickNameEn) {
		this.nickNameEn = nickNameEn;
	}

	public String getNickNameAr() {
		return nickNameAr;
	}

	public void setNickNameAr(String nickNameAr) {
		this.nickNameAr = nickNameAr;
	}

//    public long getAssignedToUserId() {
//        return assignedToUserId;
//    }
//
//    public void setAssignedToUserId(long assignedToUserId) {
//        this.assignedToUserId = assignedToUserId;
//    }

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public BigDecimal getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(BigDecimal openingBalance) {
		this.openingBalance = openingBalance;
	}

	public BigDecimal getOpeningPeriodBalance() {
		return openingPeriodBalance;
	}

	public void setOpeningPeriodBalance(BigDecimal openingPeriodBalance) {
		this.openingPeriodBalance = openingPeriodBalance;
	}

	public BigDecimal getHoldBalance() {
		return holdBalance;
	}

	public void setHoldBalance(BigDecimal holdBalance) {
		this.holdBalance = holdBalance;
	}

	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(BigDecimal availableBalance) {
		this.availableBalance = availableBalance;
	}

	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}

	public int getAccountTypeId() {
		return accountTypeId;
	}

	public void setAccountTypeId(int accountTypeId) {
		this.accountTypeId = accountTypeId;
	}

	public int getAccountCategoryId() {
		return accountCategoryId;
	}

	public void setAccountCategoryId(int accountCategoryId) {
		this.accountCategoryId = accountCategoryId;
	}

	public boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

//    public boolean isDefault() {
//        return isDefault;
//    }

	public String getLinkedToAccountId() {
		return linkedToAccountId;
	}

	public void setLinkedToAccountId(String linkedToAccountId) {
		this.linkedToAccountId = linkedToAccountId;
	}

	public long getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(long assignmentId) {
		this.assignmentId = assignmentId;
	}

	public int getAssignmentStatusId() {
		return assignmentStatusId;
	}

	public void setAssignmentStatusId(int assignmentStatusId) {
		this.assignmentStatusId = assignmentStatusId;
	}

//    public AccountConfigDTO getAccountConfig() {
//        return accountConfig;
//    }
//
//    public void setAccountConfig(AccountConfigDTO accountConfig) {
//        this.accountConfig = accountConfig;
//    }
//
//    public LimitUtilizationDTO getAccountLimitUtilizationDTO() {
//        return accountLimitUtilizationDTO;
//    }
//
//    public void setAccountLimitUtilizationDTO(LimitUtilizationDTO accountLimitUtilizationDTO) {
//        this.accountLimitUtilizationDTO = accountLimitUtilizationDTO;
//    }
//
//    public LimitUtilizationDTO getUsrLimitUtilizationDTO() {
//        return usrLimitUtilizationDTO;
//    }
//
//    public void setUsrLimitUtilizationDTO(LimitUtilizationDTO usrLimitUtilizationDTO) {
//        this.usrLimitUtilizationDTO = usrLimitUtilizationDTO;
//    }

	public UserDTO getOwner() {
		return owner;
	}

	public void setOwner(UserDTO owner) {
		this.owner = owner;
	}

	public String getReferenceCode() {
		return referenceCode;
	}

	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}

	public int getLinkedToAccountStatusId() {
		return linkedToAccountStatusId;
	}

	public void setLinkedToAccountStatusId(int linkedToAccountStatusId) {
		this.linkedToAccountStatusId = linkedToAccountStatusId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getFormattedAccountNumber() {
		if (getAccountTypeId() == AccountTypesEnum.PARTNER_BANK_ACCOUNT.getValue() && getAccountNumber() != null
				&& getAccountNumber().length() > 28)
			formattedAccountNumber = getAccountNumber().substring(20, 28);
		else
			formattedAccountNumber = getAccountNumber();
		return formattedAccountNumber;
	}

	public void setFormattedAccountNumber(String formattedAccountNumber) {
		this.formattedAccountNumber = formattedAccountNumber;
	}

	@Override
	public String toString() {
		return "AccountDTO [accountId=" + accountId + ", linkedToAccountId=" + linkedToAccountId
				+ ", linkedToAccountDTO=" + linkedToAccountDTO + ", linkedToAccountStatusId=" + linkedToAccountStatusId
				+ ", assignmentId=" + assignmentId + ", assignmentStatusId=" + assignmentStatusId
				+ ", assignmentStatusIdLookup=" + assignmentStatusIdLookup + ", accountNumber=" + accountNumber
				+ ", formattedAccountNumber=" + formattedAccountNumber + ", owner=" + owner + ", accountCurrencyID="
				+ accountCurrencyID + ", nickNameEn=" + nickNameEn + ", nickNameAr=" + nickNameAr + ", nickName="
				+ nickName + ", statusId=" + statusId + ", accountStatusLookup=" + accountStatusLookup
				+ ", openingBalance=" + openingBalance + ", openingPeriodBalance=" + openingPeriodBalance
				+ ", holdBalance=" + holdBalance + ", availableBalance=" + availableBalance + ", currentBalance="
				+ currentBalance + ", accountTypeId=" + accountTypeId + ", accountTypeLookup=" + accountTypeLookup
				+ ", accountCategoryId=" + accountCategoryId + ", accountCategoryLookup=" + accountCategoryLookup
				+ ", isDefault=" + isDefault + ", assignedToUserDTO=" + assignedToUserDTO + ", referenceCode="
				+ referenceCode + "]";
	}

}
