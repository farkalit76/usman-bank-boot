package com.usman.bank.models;


public class BeneficiaryDTO extends BaseDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Added for getPayeeListBATransfer
	private String slNo;
	private String cif;
	private String beneficiaryName;

	private String beneficiaryAccount;
    private String beneficiaryBank;
    private String beneficiaryBankLogo;
    private String beneficiaryBankName;
	private String status;
	private String trsAccNo;
	private String lastModifiedByDateTime;
	private String lastModifiedUser;
	private String addedUser;
	private String remarks;
	private String statusDesc;
	private Boolean otpStatus = false;
	private String actionReason;
	private String actionUser;
	private Boolean canEdit = false;
	private Boolean canDelete  = false;
	private Boolean canActivate  = false;
	private Integer currencyCode ;
	private String currencyIsoCode  ;
	private PresentationDTO presentationDTO ;	
	private boolean isOTPRequired;
	private String mobileNumber;
	private CurrencyDTO currencyDTO ;

	/* below fields defined for WU beneficiary to be used by the mobile */
	private String firstName;
	private String lastName;
	private String nickName;
	private String transferCountry;			
	private String countryISOCode;
	
	/* ************* */
	
	private String beneficiarySWIFT;
	private String beneficiaryBankAddress;
	private String beneficiaryBranch;
	private String routingNumber;
	private String isIfscReq;
    private String ifsc;
    private String transferCountryCode;
    private String transferCountryName;
	
	
	public boolean getIsOTPRequired() {
		return isOTPRequired;
	}
	public void setIsOTPRequired(boolean isOTPRequired) {
		this.isOTPRequired = isOTPRequired;
	}
	public Boolean getCanEdit() {
		return canEdit;
	}
	public void setCanEdit(Boolean canEdit) {
		this.canEdit = canEdit;
	}
	public Boolean getCanDelete() {
		return canDelete;
	}
	public void setCanDelete(Boolean canDelete) {
		this.canDelete = canDelete;
	}
	public Boolean getCanActivate() {
		return canActivate;
	}
	public void setCanActivate(Boolean canActivate) {
		this.canActivate = canActivate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getLastModifiedUser() {
		return lastModifiedUser;
	}
	public void setLastModifiedUser(String lastModifiedUser) {
		this.lastModifiedUser = lastModifiedUser;
	}
	public String getAddedUser() {
		return addedUser;
	}
	public void setAddedUser(String addedUser) {
		this.addedUser = addedUser;
	}
	public String getLastModifiedByDateTime() {
		return lastModifiedByDateTime;
	}
	public void setLastModifiedByDateTime(String lastModifiedByDateTime) {
		this.lastModifiedByDateTime = lastModifiedByDateTime;
	}
	
	public String getTrsAccNo() {
		return trsAccNo;
	}
	public void setTrsAccNo(String trsAccNo) {
		this.trsAccNo = trsAccNo;
	}
	//Added for getPayeeListBATransfer
	public String getSlNo() {
		return slNo;
	}
	public void setSlNo(String slNo) {
		this.slNo = slNo;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	public String getBeneficiaryBankLogo() {
		return beneficiaryBankLogo;
	}
	public String getBeneficiaryAccount() {
		return beneficiaryAccount;
	}
	public void setBeneficiaryAccount(String beneficiaryAccount) {
		this.beneficiaryAccount = beneficiaryAccount;
	}
	public String getBeneficiaryBank() {
		return beneficiaryBank;
	}
	public void setBeneficiaryBank(String beneficiaryBank) {
		this.beneficiaryBank = beneficiaryBank;
		if (beneficiaryBank!=null) this.beneficiaryBankLogo = beneficiaryBank.substring(0, 4);
	}
	public String getBeneficiaryBankName() {
		return beneficiaryBankName;
	}
	public void setBeneficiaryBankName(String beneficiaryBankName) {
		this.beneficiaryBankName = beneficiaryBankName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setOtpStatus(Boolean otpStatus) {
		this.otpStatus = otpStatus;
	}
	public Boolean getOtpStatus() {
		return otpStatus;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	public String getStatusDesc() {
		return statusDesc;
	}
	public void setActionReason(String actionReason) {
		this.actionReason = actionReason;
	}
	public String getActionReason() {
		return actionReason;
	}
	public void setActionUser(String actionUser) {
		this.actionUser = actionUser;
	}
	public String getActionUser() {
		return actionUser;
	}
	public void setBeneficiaryBankLogo(String beneficiaryBankLogo) {
		this.beneficiaryBankLogo = beneficiaryBankLogo;
	}
	public Integer getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(Integer currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getCurrencyIsoCode() {
		return currencyIsoCode;
	}
	public void setCurrencyIsoCode(String currencyIsoCode) {
		this.currencyIsoCode = currencyIsoCode;
	}
	public PresentationDTO getPresentationDTO() {
		return presentationDTO;
	}
	public void setPresentationDTO(PresentationDTO presentationDTO) {
		this.presentationDTO = presentationDTO;
	}
	
	public CurrencyDTO getCurrencyDTO() {
		return currencyDTO;
	}
	public void setCurrencyDTO(CurrencyDTO currencyDTO) {
		this.currencyDTO = currencyDTO;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getTransferCountry() {
		return transferCountry;
	}
	public void setTransferCountry(String transferCountry) {
		this.transferCountry = transferCountry;
	}
	public String getCountryISOCode() {
		return countryISOCode;
	}
	public void setCountryISOCode(String countryISOCode) {
		this.countryISOCode = countryISOCode;
	}
	public String getBeneficiarySWIFT() {
		return beneficiarySWIFT;
	}
	public void setBeneficiarySWIFT(String beneficiarySWIFT) {
		this.beneficiarySWIFT = beneficiarySWIFT;
	}
	public String getBeneficiaryBankAddress() {
		return beneficiaryBankAddress;
	}
	public void setBeneficiaryBankAddress(String beneficiaryBankAddress) {
		this.beneficiaryBankAddress = beneficiaryBankAddress;
	}
	public String getBeneficiaryBranch() {
		return beneficiaryBranch;
	}
	public void setBeneficiaryBranch(String beneficiaryBranch) {
		this.beneficiaryBranch = beneficiaryBranch;
	}
	public String getRoutingNumber() {
		return routingNumber;
	}
	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}
	public String getIsIfscReq() {
		return isIfscReq;
	}
	public void setIsIfscReq(String isIfscReq) {
		this.isIfscReq = isIfscReq;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getTransferCountryCode() {
		return transferCountryCode;
	}
	public void setTransferCountryCode(String transferCountryCode) {
		this.transferCountryCode = transferCountryCode;
	}
	public String getTransferCountryName() {
		return transferCountryName;
	}
	public void setTransferCountryName(String transferCountryName) {
		this.transferCountryName = transferCountryName;
	}
	

	
	
}
