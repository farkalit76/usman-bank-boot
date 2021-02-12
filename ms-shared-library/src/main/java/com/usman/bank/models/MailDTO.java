package com.usman.bank.models;

import java.io.Serializable;
import java.util.List;

/**
 * @author ZABIN
 *
 */
public class MailDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String from;
	private String to;
	private String cc;
	private String subject;
	private String body;
	private String attachedFileName;
	
	
	//Added for sending multiple attachments in mail for CR: DA-1019_Digital_Murabaha
	private List<FileDTO> attachedFiles;
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
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
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getCc() {
		return cc;
	}
	public void setAttachedFileName(String attachedFileName) {
		this.attachedFileName = attachedFileName;
	}
	public String getAttachedFileName() {
		return attachedFileName;
	}
	public List<FileDTO> getAttachedFiles() {
		return attachedFiles;
	}
	public void setAttachedFiles(List<FileDTO> attachedFiles) {
		this.attachedFiles = attachedFiles;
	}

}
