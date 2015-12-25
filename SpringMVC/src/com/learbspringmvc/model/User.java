package com.learbspringmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.learbspringmvc.customannotation.ValidEmail;

@Entity
@Table(name="users")
public class User {
	
	@NotBlank(message="UserName cannot be blank")
	/*@Size(min=5,max=8)
	@Pattern(regexp ="^\\w{5,}$", message="User Name should be a ALPHANUMERIC")*/
	@Id
	@Column(name = "username")
	private String userName;
	
	
	@NotBlank
	@Pattern(regexp="^\\S+$", message="Email should not contain white spaces")
	@Size(min=5, max=15 , message="Password must be between 5 and 15 charatcers")
	private String password;
	
	
	
	@ValidEmail(min=5, message="Please enter a valid email")
	@NotNull
	private String email;
	
	private String authority;
	private boolean enabled =  false;
	
	public User(){

	}

	public User(String userName, String password, boolean enabled,
			String authority, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.enabled = enabled;
		this.authority = authority;
		this.email	=	email;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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

	/**
	 * @return the authority
	 */
	public String getAuthority() {
		return authority;
	}

	/**
	 * @param authority the authority to set
	 */
	public void setAuthority(String authority) {
		this.authority = authority;
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
		return "User [userName=" + userName + ", password=" + password
				+ ", enabled=" + enabled + ", email=" + email + ", authority="
				+ authority + "]";
	}

	

}
