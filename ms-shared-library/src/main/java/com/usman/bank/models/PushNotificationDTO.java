/**
 * 
 */
package com.usman.bank.models;

import java.io.Serializable;


/**
 * @author 01610
 *
 */
public class PushNotificationDTO extends SMSDTO implements Serializable {

	/**
	 * serial version ID
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean allowFailover;
    private String keyValue;
    private String notificationId;
    private int pushType;
    private String trxId;
    private MessageDTO messageDTO;
    private int badge;
    
    
	public int getBadge() {
		return badge;
	}
	public void setBadge(int badge) {
		this.badge = badge;
	}
	public MessageDTO getMessageDTO() {
		return messageDTO;
	}
	public void setMessageDTO(MessageDTO messageDTO) {
		this.messageDTO = messageDTO;
	}
	public boolean isAllowFailover() {
		return allowFailover;
	}
	public void setAllowFailover(boolean allowFailover) {
		this.allowFailover = allowFailover;
	}
	
	public String getKeyValue() {
		return keyValue;
	}
	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}
	public String getNotificationId() {
		return notificationId;
	}
	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}
	
	public int getPushType() {
		return pushType;
	}
	public void setPushType(int pushType) {
		this.pushType = pushType;
	}
	
	public String getTrxId() {
		return trxId;
	}
	public void setTrxId(String trxId) {
		this.trxId = trxId;
	}
	
    
    
}
