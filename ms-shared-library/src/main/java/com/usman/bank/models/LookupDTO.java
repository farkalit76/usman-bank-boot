package com.usman.bank.models;

import java.io.Serializable;

/**
 * Created by Veneesh on 9/8/14.
 */
public class LookupDTO extends CommonDBDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int primaryKey;
	private String nameEn;
	private String nameAr;
	private String longNameEn;
	private String longNameAr;
	private String sqlQuery;

	public LookupDTO() {
		super();
	}

	public String getLongNameAr() {
		return longNameAr;
	}

	public void setLongNameAr(String longNameAr) {
		this.longNameAr = longNameAr;
	}

	public int getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(int primaryKey) {
		this.primaryKey = primaryKey;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getNameAr() {
		return nameAr;
	}

	public void setNameAr(String nameAr) {
		this.nameAr = nameAr;
	}

	public String getLongNameEn() {
		return longNameEn;
	}

	public void setLongNameEn(String longNameEn) {
		this.longNameEn = longNameEn;
	}

	public String getSqlQuery() {
		return sqlQuery;
	}

	public void setSqlQuery(String sqlQuery) {
		this.sqlQuery = sqlQuery;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		LookupDTO lookupDTO = (LookupDTO) o;

		if (primaryKey != lookupDTO.primaryKey)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		return primaryKey;
	}
}
