package com.usman.bank.models;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * SMS object to hold all SMS details
 * 
 * @author ZABIN
 *
 */
public class MessageDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private boolean allowReply;
	private String cif;
	private int contentTypeId;
	private String createdByUserId;
	private Timestamp dbCreatedDate;
	// private Date dbCreatedDate ;
	private String dbCreatedTime;
	private int deliveryStatusId;
	private String fromDeviceToken;
	private int globalMsgId;
	private boolean isArchived;
	private boolean isScheduled;
	private String leadRefId;
	private String msgBody;
	private long msgId;
	private int msgPriorityId;
	private int msgSecurityLevelId;
	private int msgStatusId;
	private String msgTitle;
	private int msgTypeId;
	private String pnPayload;
	private Timestamp scheduledDateTime;
	private int sentFromChannelId;
	private String toDeviceToken;
	private String username; // will be sent from the mobile when reading specific msg from outside
								// application.
	private String deviceId; // will be sent from the mobile when reading specific msg from outside
								// application.
	private String dbCreatedDateStr;
	private Long msgTimeDifference;
	private String bodyDirection;

	public boolean isAllowReply() {
		return allowReply;
	}

	public void setAllowReply(boolean allowReply) {
		this.allowReply = allowReply;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public int getContentTypeId() {
		return contentTypeId;
	}

	public void setContentTypeId(int contentTypeId) {
		this.contentTypeId = contentTypeId;
	}

	public String getCreatedByUserId() {
		return createdByUserId;
	}

	public void setCreatedByUserId(String createdByUserId) {
		this.createdByUserId = createdByUserId;
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

	public int getDeliveryStatusId() {
		return deliveryStatusId;
	}

	public void setDeliveryStatusId(int deliveryStatusId) {
		this.deliveryStatusId = deliveryStatusId;
	}

	public String getFromDeviceToken() {
		return fromDeviceToken;
	}

	public void setFromDeviceToken(String fromDeviceToken) {
		this.fromDeviceToken = fromDeviceToken;
	}

	public int getGlobalMsgId() {
		return globalMsgId;
	}

	public void setGlobalMsgId(int globalMsgId) {
		this.globalMsgId = globalMsgId;
	}

	public boolean isArchived() {
		return isArchived;
	}

	public void setArchived(boolean isArchived) {
		this.isArchived = isArchived;
	}

	public boolean isScheduled() {
		return isScheduled;
	}

	public void setScheduled(boolean isScheduled) {
		this.isScheduled = isScheduled;
	}

	public String getLeadRefId() {
		return leadRefId;
	}

	public void setLeadRefId(String leadRefId) {
		this.leadRefId = leadRefId;
	}

	public String getMsgBody() {
		return msgBody;
	}

	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}

	public long getMsgId() {
		return msgId;
	}

	public void setMsgId(long msgId) {
		this.msgId = msgId;
	}

	public int getMsgPriorityId() {
		return msgPriorityId;
	}

	public void setMsgPriorityId(int msgPriorityId) {
		this.msgPriorityId = msgPriorityId;
	}

	public int getMsgSecurityLevelId() {
		return msgSecurityLevelId;
	}

	public void setMsgSecurityLevelId(int msgSecurityLevelId) {
		this.msgSecurityLevelId = msgSecurityLevelId;
	}

	public int getMsgStatusId() {
		return msgStatusId;
	}

	public void setMsgStatusId(int msgStatusId) {
		this.msgStatusId = msgStatusId;
	}

	public String getMsgTitle() {
		return msgTitle;
	}

	public void setMsgTitle(String msgTitle) {
		this.msgTitle = msgTitle;
	}

	public int getMsgTypeId() {
		return msgTypeId;
	}

	public void setMsgTypeId(int msgTypeId) {
		this.msgTypeId = msgTypeId;
	}

	public String getPnPayload() {
		return pnPayload;
	}

	public void setPnPayload(String pnPayload) {
		this.pnPayload = pnPayload;
	}

	public Timestamp getScheduledDateTime() {
		return scheduledDateTime;
	}

	public void setScheduledDateTime(Timestamp scheduledDateTime) {
		this.scheduledDateTime = scheduledDateTime;
	}

	public int getSentFromChannelId() {
		return sentFromChannelId;
	}

	public void setSentFromChannelId(int sentFromChannelId) {
		this.sentFromChannelId = sentFromChannelId;
	}

	public String getToDeviceToken() {
		return toDeviceToken;
	}

	public void setToDeviceToken(String toDeviceToken) {
		this.toDeviceToken = toDeviceToken;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDbCreatedDateStr() {
		return dbCreatedDateStr;
	}

	public void setDbCreatedDateStr(String dbCreatedDateStr) {
		this.dbCreatedDateStr = dbCreatedDateStr;
	}

	public Long getMsgTimeDifference() {
		return msgTimeDifference;
	}

	public void setMsgTimeDifference(Long msgTimeDifference) {
		this.msgTimeDifference = msgTimeDifference;
	}

	/*
	 * public Date getDbCreatedDate() { return dbCreatedDate; } public void
	 * setDbCreatedDate(Date dbCreatedDate) { this.dbCreatedDate = dbCreatedDate; }
	 */
	public String getBodyDirection() {
		return bodyDirection;
	}

	public void setBodyDirection(String bodyDirection) {
		this.bodyDirection = bodyDirection;
	}

}
