package com.learbspringmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users1")
public class User1 {

	
	@Column(name = "username")
	@Id
	private String username;
	
	
	private String password;
	
	
	
	private String email;
	
	private boolean enabled =  false;

	public User1(String username, String password, String email, boolean enabled) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.enabled = enabled;
	}
	
	public User1(){
		
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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

	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User1 [username=" + username + ", password=" + password
				+ ", email=" + email + ", enabled=" + enabled + "]";
	}
	
	
	
}
