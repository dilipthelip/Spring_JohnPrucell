package com.learnHibernate.annotations.kaushik.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="USER_DETAILS_COLLECTION")
public class UserDetailsCollection {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="USER_ID")
	private int userId;

	@Column(name="USER_NAME")
	private String userName;

	@ElementCollection
	@JoinTable(name="UserDetails_Address", 
				joinColumns =@JoinColumn(name = "USER_ID") )
	@GenericGenerator(name = "auto", strategy="auto")
	@CollectionId(columns = { @Column(name = "Address_Id") }, generator = "auto", type = @Type(type="long"))
	private List<Address> addressSet = new ArrayList<Address>();
	
	public UserDetailsCollection(){
		
	}

	/**
	 * @param userId
	 * @param userName
	 * @param addressSet
	 */
	public UserDetailsCollection(int userId, String userName,
			List<Address> addressSet) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.addressSet = addressSet;
	}
	
	/**
	 * @param userId
	 * @param userName
	 * @param addressSet
	 */
	public UserDetailsCollection(String userName,
			List<Address> addressSet) {
		super();
		this.userName = userName;
		this.addressSet = addressSet;
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
	 * @return the addressSet
	 */
	public List<Address> getAddressSet() {
		return addressSet;
	}

	/**
	 * @param addressSet the addressSet to set
	 */
	public void setAddressSet(List<Address> addressSet) {
		this.addressSet = addressSet;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserDetailsCollection [userId=" + userId + ", userName="
				+ userName + ", addressSet=" + addressSet + "]";
	}
	
	
}
