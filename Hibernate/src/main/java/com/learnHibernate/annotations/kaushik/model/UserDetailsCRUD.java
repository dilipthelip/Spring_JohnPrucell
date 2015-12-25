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
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQuery(name= "UserDetails.byId", query = "from UserDetailsCRUD where userId= ?")
@NamedNativeQuery(name="UserDetails.byIdnative" , query = "Select * from USER_DETAILS_CRUD where user_id = ?",resultClass = UserDetailsCRUD.class)
@org.hibernate.annotations.Entity(selectBeforeUpdate=true)
@Table(name="USER_DETAILS_CRUD")
public class UserDetailsCRUD {
	
	public UserDetailsCRUD(){
		
	}

	/**
	 * @param userName
	 */
	public UserDetailsCRUD(String userName) {
		super();
		this.userName = userName;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="USER_ID")
	private int userId;

	@Column(name="USER_NAME")
	private String userName;

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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserDetailsCRUD [userId=" + userId + ", userName=" + userName
				+ "]";
	}





}
