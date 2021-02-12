/**
 * @Copyright reserved to bank
 */
package com.usman.bank.utility.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

/**
 * Description: This class EmailReq.java
 *
 * @author vXebiau
 * @date Sep 15, 2019
 * @version 1.0
 *
 */
public class EmailReq implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull
	protected String[] toEmailIds;

	@NotNull
	protected String subject;

	@NotNull
	protected String body;

	protected String attachement;

	public String[] getToEmailIds() {
		return toEmailIds;
	}

	public void setToEmailIds(String[] toEmailIds) {
		this.toEmailIds = toEmailIds;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getAttachement() {
		return attachement;
	}

	public void setAttachement(String attachement) {
		this.attachement = attachement;
	}

	@Override
	public String toString() {
		return "EmailReq [toEmailIds=" + toEmailIds + ", subject=" + subject + ", body=" + body + ", attachement="
				+ attachement + "]";
	}

}
