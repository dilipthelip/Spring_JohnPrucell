package com.learnHibernate.model;

public class Contact {
	
	private long id;
	private String recipient;
	private String phone;
	private String address;
	
	public Contact(){
		
	}
	
	
	/**
	 * @param phone
	 * @param address
	 */
	public Contact(String recipient,String phone, String address) {
		super();
		this.recipient=recipient;
		this.phone = phone;
		this.address = address;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the recipient
	 */
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
		return "Contact [id=" + id + ", recipient=" + recipient + ", phone="
				+ phone + ", address=" + address + "]";
	}
	
	

}
