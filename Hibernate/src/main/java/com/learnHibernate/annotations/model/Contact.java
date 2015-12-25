package com.learnHibernate.annotations.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Contact {
	
	private String recipient;
	private String phone;
	private String address;
	
	public Contact(){
		
	}
	
	/**
	 * @param recipient
	 * @param phone
	 * @param address
	 */
	public Contact(String recipient, String phone, String address) {
		super();
		this.recipient = recipient;
		this.phone = phone;
		this.address = address;
	}
	/**
	 * @return the recipient
	 */
	@Column(name="weekday_recipient")
	public String getRecipient() {
		return recipient;
	}
	/**
	 * @param recipient the recipient to set
	 */
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	/**
	 * @return the phone
	 */
	@Column(name="weekday_phone")
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the address
	 */
	@Column(name="weekday_address")
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contact [recipient=" + recipient + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
	
	
	
	

}
