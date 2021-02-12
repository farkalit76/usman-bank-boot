package com.usman.bank.models;

import java.io.Serializable;

/**
 * @author Neelkanth Tripathi
 * 
 *         store uploaded files such as civil Id
 */
public class FileDTO extends EChatMessagesDTO implements Serializable {
	// implement Serializable
	private static final long serialVersionUID = 1L;
	// store base64 sting
	private String file;
	private String fileExtension;
	private Integer fileID;
	private Integer imageMaxHight;
	private Integer imageMaxWidth;
	// is this file passed the verification tests
	private Boolean certified;
	// Added for MVP - New Murabaha Details
	private String fileName;// This can be Salary, Civil_ID or any name that holds meaning

	private String fileType = "Base64";// TODO: Neel New field added for app. This value could be Base64 or URL. If
										// URL, file field is expected to hold the url
	// private String pdfPreviewImage =
	// "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";
	private String pdfPreviewImage = null;

	// Below field added for attaching multiple files while sending email for
	// DA-1019-Digital_Murabaha

	private byte[] fileBytes;

	private Boolean showSaveOption = Boolean.TRUE;// This is a flag that indicates if the app should allow the image or
													// pdf to be saved or not
	private Boolean showShareOption = Boolean.TRUE;// This is a flag that indicates if the app should allow the image or
													// pdf to be shared or not

	// Contractor
	public FileDTO(String file, String fileExtension) {
		this();
		setFile(file);
		setFileExtension(fileExtension);
	}

	// Contractor
	public FileDTO() {
		// hasn't passed the verification tests yet
		setCertified(false);
	}

	// getters and setters
	public void setFile(String file) {
		this.file = file;
	}

	public String getFile() {
		return file;
	}

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	public String getFileExtension() {
		return fileExtension;
	}

	public void setImageMaxHight(Integer imageMaxHight) {
		this.imageMaxHight = imageMaxHight;
	}

	public Integer getImageMaxHight() {
		return imageMaxHight;
	}

	public void setImageMaxWidth(Integer imageMaxWidth) {
		this.imageMaxWidth = imageMaxWidth;
	}

	public Integer getImageMaxWidth() {
		return imageMaxWidth;
	}

	public void setCertified(Boolean certified) {
		this.certified = certified;
	}

	public Boolean getCertified() {
		return certified;
	}

	public void setFileID(Integer fileID) {
		this.fileID = fileID;
	}

	public Integer getFileID() {
		return fileID;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getPdfPreviewImage() {
		return pdfPreviewImage;
	}

	public void setPdfPreviewImage(String pdfPreviewImage) {
		this.pdfPreviewImage = pdfPreviewImage;
	}

	public Boolean getShowSaveOption() {
		return showSaveOption;
	}

	public void setShowSaveOption(Boolean showSaveOption) {
		this.showSaveOption = showSaveOption;
	}

	public Boolean getShowShareOption() {
		return showShareOption;
	}

	public void setShowShareOption(Boolean showShareOption) {
		this.showShareOption = showShareOption;
	}

	public byte[] getFileBytes() {
		return fileBytes;
	}

	public void setFileBytes(byte[] fileBytes) {
		this.fileBytes = fileBytes;
	}

}