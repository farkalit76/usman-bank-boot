/**
 * @Copyright reserved to  bank
 */
package com.usman.bank.models;

import java.io.Serializable;
import java.sql.Date;

/**
 * Description: This class CustomerProfilesDTO.java
 *
 * @author vXebiau
 * @date Jul 1, 2019
 * @version 1.0
 *
 */

public class CustomerProfilesDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long custId;

	private String nameAr;

	private String nameEn;

	private String userName;

	private Date dob;

	private String mobileNo;

	public CustomerProfilesDTO() {
	}

	public CustomerProfilesDTO(Long custId, String nameAr, String nameEn, String userName, Date dob, String mobileNo) {
		this.custId=custId;
		this.nameAr=nameAr;
		this.nameEn=nameEn;
		this.userName=userName;
		this.dob=dob;
		this.mobileNo=mobileNo;
	}
	
	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getNameAr() {
		return nameAr;
	}

	public void setNameAr(String nameAr) {
		this.nameAr = nameAr;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
