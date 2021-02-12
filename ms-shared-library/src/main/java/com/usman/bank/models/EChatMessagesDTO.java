package com.usman.bank.models;

import java.io.Serializable;
import java.util.List;

import com.usman.bank.constants.EChatConstants.E_CHAT_POPUP_SIZE;
import com.usman.bank.utils.UtilityClass;

/**
 * @author Neelkanth Tripathi
 * @version 1.0
 * @created 15-Jan-2017
 * @see This DTO is used to transfer values of messages in response for the
 *      Customer Chat Service
 *
 */
public class EChatMessagesDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	public EChatMessagesDTO(String questionId, Integer responseFlag, String responseMessage) {
		this.questionId = questionId;
		this.responseFlag = responseFlag;
		setResponseMessage(responseMessage);
	}

	public EChatMessagesDTO(String questionId, Integer responseFlag, String responseMessage, String popupContentData,
			boolean isPopupContentURL) {
		this.questionId = questionId;
		this.responseFlag = responseFlag;
		this.popupContentData = popupContentData;
		this.popupContentURL = isPopupContentURL;

		// TODO: These should be removed in new version
		// this.htmlContent = popupContentData;
		// this.htmlContentURL = isPopupContentURL;

		setResponseMessage(responseMessage);
	}

	public EChatMessagesDTO() {
		// Default constructor
	}

	// Values sent in Response
	private String questionId;
	private Integer responseFlag;// 0 - Its a Success Response and Operation completed, 1 - Its a follow-up
									// question, 2 - There's an error
	private String responseMessage;// This can be a success message or an error message or a follow-up question
	private String popupContentData;// This could either be an html string or a url
	private boolean popupContentURL;// A flag that indicates if the popupContentData is a url that needs to be
									// loaded by the app and displayed in a popup
	// @Deprecated
	// private String htmlContent;//The flag is replaced by popupContentData. Needs
	// to be deleted after the new version is launched
	// @Deprecated
	// private boolean htmlContentURL;//The flag is replaced by isPopupContentURL.
	// Needs to be deleted after the new version is launched

	private String displayType = "Normal";// TODO: Neel - This will just set the display type for this message. Possible
											// values could be Popup, Normal or Full View
	private String popupSize = E_CHAT_POPUP_SIZE.MEDIUM;// Default this to medium
	private List<FileDTO> files;// These will be the files associated with each messageDTO. The fileDTO on the
								// echatDTO object will be used only for upload
	private boolean displayPopupByDefault = false;// Display a popup by default without click of the user if this is
													// marked as true
	private boolean popup;// This indicates if the message has an associated popup or not
	private String sendTextAsIs;// If this attribute is not null, app will send a text request on click of the
								// bubble with the value set in this attribute

	private boolean canSkip;// This will be the flag that will inform the app that the question can be
							// skipped
	private String skipValue;// The value that will be submitted when user clicks on skip
	private String skipLabel;// The display label of the button that is displayed to the user when eligible
								// for skip
	private String skipDisplayText;// On skip, the display text that should be shown to the user on app

	private Boolean openPopOnClick = false; // use for popup is with message or not
	private Boolean openCameraOnClick = false; // This will be used for upload feature
	private Boolean clientSideOperation = false; // This will only be used when its only the mobile device that has to
													// make changes and nothing to be submitted to server side
	private boolean messageHasURL;// This flag indicates if the message text has any http/https url or not. This
									// helps the app render a preview against msa3ed bubbles

	public boolean isCanSkip() {
		return canSkip;
	}

	public void setCanSkip(boolean canSkip) {
		this.canSkip = canSkip;
	}

	public String getSkipValue() {
		return skipValue;
	}

	public void setSkipValue(String skipValue) {
		this.skipValue = skipValue;
	}

	public String getSkipLabel() {
		return skipLabel;
	}

	public void setSkipLabel(String skipLabel) {
		this.skipLabel = skipLabel;
	}

	public String getSkipDisplayText() {
		return skipDisplayText;
	}

	public void setSkipDisplayText(String skipDisplayText) {
		this.skipDisplayText = skipDisplayText;
	}

	public Boolean getOpenPopOnClick() {
		return openPopOnClick;
	}

	public void setOpenPopOnClick(Boolean openPopOnClick) {
		this.openPopOnClick = openPopOnClick;
	}

	public List<FileDTO> getFiles() {
		return files;
	}

	public void setFiles(List<FileDTO> files) {
		this.files = files;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public Integer getResponseFlag() {
		return responseFlag;
	}

	public void setResponseFlag(Integer responseFlag) {
		this.responseFlag = responseFlag;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		try {
			this.responseMessage = UtilityClass.replaceEmojiTagsWithEmoji(responseMessage);
		} catch (Exception ex) {
			this.responseMessage = responseMessage;
		}
	}

	public String getPopupContentData() {
		return popupContentData;
	}

	public void setPopupContentData(String popupContentData) {
		// TODO: These should be removed in new version
		// this.htmlContent = popupContentData;
		this.popupContentData = popupContentData;
	}

	public boolean isPopupContentURL() {
		return popupContentURL;
	}

	public void setPopupContentURL(boolean popupContentURL) {
		// TODO: These should be removed in new version
		// this.htmlContentURL = popupContentURL;
		this.popupContentURL = popupContentURL;
	}

	public String getDisplayType() {
		return displayType;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	public String getPopupSize() {
		return popupSize;
	}

	public void setPopupSize(String popupSize) {
		this.popupSize = popupSize;
	}

	public boolean isDisplayPopupByDefault() {
		return displayPopupByDefault;
	}

	public void setDisplayPopupByDefault(boolean displayPopupByDefault) {
		this.displayPopupByDefault = displayPopupByDefault;
	}

	public boolean isPopup() {
		if (UtilityClass.isEmpty(this.popupContentData)) {
			popup = false;
		} else {
			popup = true;
		}
		return popup;
	}

	public void setPopup(boolean popup) {
		this.popup = popup;
	}

	public String getSendTextAsIs() {
		return sendTextAsIs;
	}

	public void setSendTextAsIs(String sendTextAsIs) {
		this.sendTextAsIs = sendTextAsIs;
	}

	public Boolean getOpenCameraOnClick() {
		return openCameraOnClick;
	}

	public void setOpenCameraOnClick(Boolean openCameraOnClick) {
		this.openCameraOnClick = openCameraOnClick;
	}

	@Override
	public String toString() {
		return responseMessage;
	}

	public Boolean getClientSideOperation() {
		return clientSideOperation;
	}

	public void setClientSideOperation(Boolean clientSideOperation) {
		this.clientSideOperation = clientSideOperation;
	}

	public boolean isMessageHasURL() {
		if (responseMessage != null && !UtilityClass.extractUrls(responseMessage).isEmpty()) {
			messageHasURL = true;
		}
		return messageHasURL;
	}

	public void setMessageHasURL(boolean messageHasURL) {
		this.messageHasURL = messageHasURL;
	}

}
