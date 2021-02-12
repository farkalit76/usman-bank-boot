package com.usman.bank.models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Map;

import com.usman.bank.enums.LanguageEnum;
import com.usman.bank.utils.Utility;

/**
 * Created by Veneesh on 9/8/14.
 */
public class CommonDBDTO implements Serializable {

	/**
	 * 
	 */
	protected static final long serialVersionUID = 1L;
	protected int rowStatusID;
	protected Timestamp dbCreatedDate;
	protected String dbCreatedTime;
	protected Timestamp clientCreatedDate;
	protected String formattedClientCD;
	protected String clientCreatedTime;
	protected String createdByUserId;
	protected String updatedByUserId;
	protected String sessionId;
	protected int organizationID;
	protected String note;
	protected LanguageEnum preferredLanguage;
	protected LookupDTO lookupDTO;
	Map<String, String> confirmationMap;

	public String getCreatedByUserId() {
		return createdByUserId;
	}

	public void setCreatedByUserId(String createdByUserId) {
		this.createdByUserId = createdByUserId;
	}

	public String getUpdatedByUserId() {
		return updatedByUserId;
	}

	public void setUpdatedByUserId(String updatedByUserId) {
		this.updatedByUserId = updatedByUserId;
	}

	public CommonDBDTO() {
		super();
	}

	public int getRowStatusID() {
		return rowStatusID;
	}

	public void setRowStatusID(int rowStatusID) {
		this.rowStatusID = rowStatusID;
	}

	public Timestamp getDbCreatedDate() {
		return dbCreatedDate;
	}

	public void setDbCreatedDate(Timestamp dbCreatedDate) {
		this.dbCreatedDate = dbCreatedDate;
	}

	public String getDbCreatedTime() {
		return dbCreatedTime;
	}

	public void setDbCreatedTime(String dbCreatedTime) {
		this.dbCreatedTime = dbCreatedTime;
	}

	public Timestamp getClientCreatedDate() {
		return clientCreatedDate;
	}

	public void setClientCreatedDate(Timestamp clientCreatedDate) {
		this.clientCreatedDate = clientCreatedDate;
	}

	public String getClientCreatedTime() {
		return clientCreatedTime;
	}

	public void setClientCreatedTime(String clientCreatedTime) {
		this.clientCreatedTime = clientCreatedTime;
	}

	public int getOrganizationID() {
		return organizationID;
	}

	public void setOrganizationID(int organizationID) {
		this.organizationID = organizationID;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getFormattedClientCD() {
		return formattedClientCD;
	}

	public void setFormattedClientCD(String formattedClientCD) {
		this.formattedClientCD = formattedClientCD;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public LanguageEnum getPreferredLanguage() {
		if (Utility.isEmpty(preferredLanguage)) {
			preferredLanguage = LanguageEnum.EN;
		}
		return preferredLanguage;
	}

	public void setPreferredLanguage(LanguageEnum preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	public LookupDTO getLookupDTO() {
		return lookupDTO;
	}

	public void setLookupDTO(LookupDTO lookupDTO) {
		this.lookupDTO = lookupDTO;
	}

	/**
	 * Getter for property 'confirmationMap'.
	 *
	 * @return Value for property 'confirmationMap'.
	 */
	public Map<String, String> getConfirmationMap() {
		return confirmationMap;
	}

	/**
	 * Setter for property 'confirmationMap'.
	 *
	 * @param confirmationMap Value to set for property 'confirmationMap'.
	 */
	public void setConfirmationMap(Map<String, String> confirmationMap) {
		this.confirmationMap = confirmationMap;
	}
}
