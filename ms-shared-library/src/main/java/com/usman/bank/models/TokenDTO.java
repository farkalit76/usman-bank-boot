package com.usman.bank.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashMap;

public class TokenDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	protected String token;
	protected Integer custId;
	protected Timestamp dbCreatedDate;
	protected Timestamp appCreatedDate;
	protected Integer wrongAttempts;
	protected Integer tokenType;
	protected Integer linkType;
	private HashMap<Integer, String> tokenDetails;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public Timestamp getDbCreatedDate() {
		return dbCreatedDate;
	}

	public void setDbCreatedDate(Timestamp dbCreatedDate) {
		this.dbCreatedDate = dbCreatedDate;
	}

	public Timestamp getAppCreatedDate() {
		return appCreatedDate;
	}

	public void setAppCreatedDate(Timestamp appCreatedDate) {
		this.appCreatedDate = appCreatedDate;
	}

	public Integer getWrongAttempts() {
		return wrongAttempts;
	}

	public void setWrongAttempts(Integer wrongAttempts) {
		this.wrongAttempts = wrongAttempts;
	}

	public Integer getTokenType() {
		return tokenType;
	}

	public void setTokenType(Integer tokenType) {
		this.tokenType = tokenType;
	}

	public Integer getLinkType() {
		return linkType;
	}

	public void setLinkType(Integer linkType) {
		this.linkType = linkType;
	}

	public HashMap<Integer, String> getTokenDetails() {
		return tokenDetails;
	}

	public void setTokenDetails(HashMap<Integer, String> tokenDetails) {
		this.tokenDetails = tokenDetails;
	}

	@Override
	public String toString() {
		return "TokenDTO [token=" + token + ", custId=" + custId + ", dbCreatedDate=" + dbCreatedDate
				+ ", appCreatedDate=" + appCreatedDate + ", wrongAttempts=" + wrongAttempts + ", tokenTypeId="
				+ tokenType + ", tokenType=" + linkType + "]";
	}

}
