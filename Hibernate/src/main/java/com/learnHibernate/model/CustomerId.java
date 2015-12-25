package com.learnHibernate.model;

import java.io.Serializable;

public class CustomerId implements Serializable,Cloneable{
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerId [countryCode=" + countryCode + ", idCardNo="
				+ idCardNo + "]";
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1584144911532042940L;
	private String countryCode;
	private String idCardNo;
	/**
	 * @param countryCode
	 * @param idCardNo
	 */
	public CustomerId(String countryCode, String idCardNo) {
		super();
		this.countryCode = countryCode;
		this.idCardNo = idCardNo;
	}
	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}
	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	/**
	 * @return the idCardNo
	 */
	public String getIdCardNo() {
		return idCardNo;
	}
	/**
	 * @param idCardNo the idCardNo to set
	 */
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((countryCode == null) ? 0 : countryCode.hashCode());
		result = prime * result
				+ ((idCardNo == null) ? 0 : idCardNo.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerId other = (CustomerId) obj;
		if (countryCode == null) {
			if (other.countryCode != null)
				return false;
		} else if (!countryCode.equals(other.countryCode))
			return false;
		if (idCardNo == null) {
			if (other.idCardNo != null)
				return false;
		} else if (!idCardNo.equals(other.idCardNo))
			return false;
		return true;
	}
	
	
	
	
	

}
