package com.learnHibernate.annotations.kaushik.model.embedded;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;


@Entity
@IdClass(UserDetailsCompositePK.class)
@NamedNativeQuery(name="sequence", query="Select cncrrFltCrewSqNb.nextval from dual", resultClass=Long.class)
@Table(name="USER_DETAILS_COMPOSITE")
public class UserDetailsComposite implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8148169636415942940L;
	
	private String city;
	private String state;
	
	@Id @Generated(GenerationTime.INSERT)
	private long id;
	@Id private String name;
	
	
	/*private UserDetailsCompositePK userDetailsCompositePK;
	*//**
	 * @return the userDetailsCompositePK
	 *//*
	@EmbeddedId
	public UserDetailsCompositePK getUserDetailsCompositePK() {
		return userDetailsCompositePK;
	}
	*//**
	 * @param userDetailsCompositePK the userDetailsCompositePK to set
	 *//*
	public void setUserDetailsCompositePK(
			UserDetailsCompositePK userDetailsCompositePK) {
		this.userDetailsCompositePK = userDetailsCompositePK;
	}*/
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

}