package com.usman.bank.models;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Veneesh on 9/8/14.
 */
public class CustomerDTO extends CommonDBDTO implements Serializable {

	/**
	 * 
	 */
	protected static final long serialVersionUID = 1L;
	protected String customerID;
	protected String customerCode;
	protected LookupDTO nationality;
	protected LookupDTO lookCountry;
	protected String passportNo;
	protected String nameEn;
	protected String nameAr;
	protected String firstNameEn;
	protected String middleNameEn;
	protected String lastNameEn;
	protected String firstNameAr;
	protected String middleNameAr;
	protected String lastNameAr;
	protected String gender;
	protected ContactInfoDTO contactInfo;

	// These are the two new fields asked immediately after first login
	protected String placeOfWork;
	protected String salaryRange;
	protected int profileStatusId;// This flag helps app know if the place of work and salary needs to be updated

	// KYC Details fetched from Viva on registration
	protected Timestamp dateOfBirth;

	// This is the new value asked during registration
	protected String civilID;
	// The unique contract ID that will be returned by the Viva API
	protected String vivaContractNo;
	protected String civilIDImage;// The civil Id Image received from Viva API
	protected String civilIDFileExtension;// The civil ID file extension received from Viva
	
	protected String cifNumber;

	public CustomerDTO() {
		super();
	}

	public CustomerDTO(String custId, String nameAr, String nameEn, String firstName,  String civilID) {
		this.customerID=custId;
		this.nameAr=nameAr;
		this.nameEn=nameEn;
		this.firstNameEn=firstName;
		this.civilID=civilID;
	}
	
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public LookupDTO getNationality() {
		return nationality;
	}

	public void setNationality(LookupDTO nationality) {
		this.nationality = nationality;
	}

	public LookupDTO getLookCountry() {
		return lookCountry;
	}

	public void setLookCountry(LookupDTO lookCountry) {
		this.lookCountry = lookCountry;
	}

	public String getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getFirstNameEn() {
		return firstNameEn;
	}

	public void setFirstNameEn(String firstNameEn) {
		this.firstNameEn = firstNameEn;
	}

	public String getMiddleNameEn() {
		return middleNameEn;
	}

	public void setMiddleNameEn(String middleNameEn) {
		this.middleNameEn = middleNameEn;
	}

	public String getLastNameEn() {
		return lastNameEn;
	}

	public void setLastNameEn(String lastNameEn) {
		this.lastNameEn = lastNameEn;
	}

	public String getFirstNameAr() {
		return firstNameAr;
	}

	public void setFirstNameAr(String firstNameAr) {
		this.firstNameAr = firstNameAr;
	}

	public String getMiddleNameAr() {
		return middleNameAr;
	}

	public void setMiddleNameAr(String middleNameAr) {
		this.middleNameAr = middleNameAr;
	}

	public String getLastNameAr() {
		return lastNameAr;
	}

	public void setLastNameAr(String lastNameAr) {
		this.lastNameAr = lastNameAr;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public ContactInfoDTO getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfoDTO contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getNameEn() {
		nameEn = firstNameEn + " ".concat(middleNameEn + " ").concat(lastNameEn + "");
		return nameEn.replaceAll("null", "");
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getNameAr() {
		nameAr = firstNameAr + " ".concat(middleNameAr + " ").concat(lastNameAr + "");
		return nameAr.replaceAll("null", "");
	}

	public void setNameAr(String nameAr) {
		this.nameAr = nameAr;
	}

	public String getPlaceOfWork() {
		return placeOfWork;
	}

	public void setPlaceOfWork(String placeOfWork) {
		this.placeOfWork = placeOfWork;
	}

	public String getSalaryRange() {
		return salaryRange;
	}

	public void setSalaryRange(String salaryRange) {
		this.salaryRange = salaryRange;
	}

	public Timestamp getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Timestamp dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getProfileStatusId() {
		return profileStatusId;
	}

	public void setProfileStatusId(int profileStatusId) {
		this.profileStatusId = profileStatusId;
	}

	public String getCivilID() {
		return civilID;
	}

	public void setCivilID(String civilID) {
		this.civilID = civilID;
	}

	public String getVivaContractNo() {
		return vivaContractNo;
	}

	public void setVivaContractNo(String vivaContractNo) {
		this.vivaContractNo = vivaContractNo;
	}

	public String getCivilIDImage() {
		return civilIDImage;
	}

	public void setCivilIDImage(String civilIDImage) {
		this.civilIDImage = civilIDImage;
	}

	public String getCivilIDFileExtension() {
		return civilIDFileExtension;
	}

	public void setCivilIDFileExtension(String civilIDFileExtension) {
		this.civilIDFileExtension = civilIDFileExtension;
	}

	//
	public String getCifNumber() {
		return cifNumber;
	}

	public void setCifNumber(String cifNumber) {
		this.cifNumber = cifNumber;
	}

}
