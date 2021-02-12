package com.usman.bank.models;

import java.io.Serializable;

/**
 * Created by Veneesh on 9/8/14.
 */

public class ContactInfoDTO extends CommonDBDTO implements Serializable{


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String emailAddressOne;
    private String emailAddressTwo;
    private String mobileNoOne;
    private String mobileNoTwo;
    private String addressOne;
    private String addressTwo;


    public ContactInfoDTO() {
        super();
    }

    public String getEmailAddressOne() {
        return emailAddressOne;
    }

    public void setEmailAddressOne(String emailAddressOne) {
        this.emailAddressOne = emailAddressOne;
    }

    public String getEmailAddressTwo() {
        return emailAddressTwo;
    }

    public void setEmailAddressTwo(String emailAddressTwo) {
        this.emailAddressTwo = emailAddressTwo;
    }

    public String getMobileNoOne() {
        return mobileNoOne;
    }

    public void setMobileNoOne(String mobileNoOne) {
        this.mobileNoOne = mobileNoOne;
    }

    public String getMobileNoTwo() {
        return mobileNoTwo;
    }

    public void setMobileNoTwo(String mobileNoTwo) {
        this.mobileNoTwo = mobileNoTwo;
    }

    public String getAddressOne() {
        return addressOne;
    }

    public void setAddressOne(String addressOne) {
        this.addressOne = addressOne;
    }

    public String getAddressTwo() {
        return addressTwo;
    }

    public void setAddressTwo(String addressTwo) {
        this.addressTwo = addressTwo;
    }
}
