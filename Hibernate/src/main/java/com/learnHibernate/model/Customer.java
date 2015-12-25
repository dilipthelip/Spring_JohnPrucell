/**
 * 
 */
package com.learnHibernate.model;

import java.io.Serializable;

/**
 * @author 961853
 *
 */
public class Customer implements Serializable,Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3627635556503693265L;

	private CustomerId id;
	
	//private String idCardNo;
	
	private String firstName;
	
	private String lastName;
	
	private String address;
	
	private String email;

	/**
	 * @return the id
	 */
	public CustomerId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(CustomerId id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", address=" + address
				+ ", email=" + email + "]";
	}
	
	
	

		
}
