package com.learnHibernate.annotations.kaushik.model;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="USER_ID")
	private int userId;

	@Column(name="USER_NAME")
	private String userName;

	@Temporal(TemporalType.DATE)
	private Date joinedDate;

	@Embedded
	@AttributeOverrides({@AttributeOverride( name = "street", column = @Column(name= "HOME_STREET_NAME")), 
		@AttributeOverride( name = "city", column = @Column(name= "HOME_CITY_NAME")),
		@AttributeOverride( name = "state", column = @Column(name= "HOME_state_NAME")),
		@AttributeOverride( name = "pincode", column = @Column(name= "HOME_ZIPCODE_NAME"))
	})
	private Address  homeAddress;

	@Embedded
	@AttributeOverrides({@AttributeOverride( name = "street", column = @Column(name= "OFFICE_STREET_NAME")), 
		@AttributeOverride( name = "city", column = @Column(name= "OFFICE_CITY_NAME")),
		@AttributeOverride( name = "state", column = @Column(name= "OFFICE_state_NAME")),
		@AttributeOverride( name = "pincode", column = @Column(name= "OFFICE_ZIPCODE_NAME"))
	})
	private Address officeAddress;

	/**
	 * @return the homeAddress
	 */
	public Address getHomeAddress() {
		return homeAddress;
	}


	/**
	 * @param homeAddress the homeAddress to set
	 */
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}


	/**
	 * @return the officeAddress
	 */
	public Address getOfficeAddress() {
		return officeAddress;
	}


	/**
	 * @param officeAddress the officeAddress to set
	 */
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}




	/**
	 * @param userId
	 * @param userName
	 * @param joinedDate
	 * @param homeAddress
	 * @param officeAddress
	 * @param description
	 */
	public UserDetails(String userName, Date joinedDate,
			Address homeAddress, Address officeAddress, String description) {
		super();
		this.userName = userName;
		this.joinedDate = joinedDate;
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
		this.description = description;
	}




	@Lob
	private String description;

	public UserDetails(){

	}


	/**
	 * @return the joinedDate
	 */
	public Date getJoinedDate() {
		return joinedDate;
	}


	/**
	 * @param joinedDate the joinedDate to set
	 */
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}



	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
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
	 * @return the address
	 */
	public Address getAddress() {
		return homeAddress;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.homeAddress = address;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName
				+ ", joinedDate=" + joinedDate + ", homeAddress=" + homeAddress
				+ ", officeAddress=" + officeAddress + ", description="
				+ description + "]";
	}




}
