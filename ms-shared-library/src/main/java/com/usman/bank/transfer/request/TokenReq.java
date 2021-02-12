/**
 * 
 */
package com.usman.bank.transfer.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

/**
 * @author vXebiau
 *
 */
public class TokenReq implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	protected String token;
	protected Integer custId;
	protected Integer tokenType;
	protected Integer linkType;
	
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
	@Override
	public String toString() {
		return "TokenReq [token=" + token + ", custId=" + custId + ", tokenType=" + tokenType + ", linkType=" + linkType
				+ "]";
	}
	
}
