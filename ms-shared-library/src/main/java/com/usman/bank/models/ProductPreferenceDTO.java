/**
 * @Copyright reserved to bank
 */
package com.usman.bank.models;

import java.io.Serializable;
import java.util.Date;

/**
 * Description: This class ProductPreferenceDTO.java
 *
 * @author  vXebiau
 * @date    Jul 9, 2019
 * @version 1.0
 *
 */
public class ProductPreferenceDTO implements Cloneable,Serializable{

	/**
	 * default serial id
	 */
	private static final long serialVersionUID = 1L;

	private Long productId;
	private String nickname;
	private Boolean visible = true;
	private Date createdDate;
	private Integer rowStatus;
	private Integer productTypeId;
	private String cifNumber;
	private String productNumber;

	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Boolean getVisible() {
		return visible;
	}
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Integer getRowStatus() {
		return rowStatus;
	}
	public void setRowStatus(Integer rowStatus) {
		this.rowStatus = rowStatus;
	}
	public String getCifNumber() {
		return cifNumber;
	}
	public void setCifNumber(String cifNumber) {
		this.cifNumber = cifNumber;
	}
	public String getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	
	public Integer getProductTypeId() {
		return productTypeId;
	}
	public void setProductTypeId(Integer productTypeId) {
		this.productTypeId = productTypeId;
	}
	public ProductPreferenceDTO copy(){
		try { 
			// call clone in Object. 
			return (ProductPreferenceDTO) super.clone(); 
		} catch(CloneNotSupportedException e) { 
			return this; 
		}
	}//copy
	
	@Override
	public String toString() {
		return "ProductPreferenceDTO [cifNumber=" + cifNumber
				+ ", createdDate=" + createdDate + ", nickname=" + nickname
				+ ", productId=" + productId + ", productNumber="
				+ productNumber + ", rowStatus=" + rowStatus + ", visible="
				+ visible + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
