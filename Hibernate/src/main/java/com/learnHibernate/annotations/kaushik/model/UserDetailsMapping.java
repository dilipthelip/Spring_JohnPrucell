package com.learnHibernate.annotations.kaushik.model;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS_MAPPING")
public class UserDetailsMapping {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="userId")
	private int userId;

	@Column(name="USER_NAME")
	private String userName;
	
/*	@OneToOne
	@JoinColumn(name="VEHCILE_ID")
	private Vehicle vehicle;*/
	
	
/*	@JoinTable(name="USER_VEHICLE", joinColumns= @JoinColumn(name="USER_ID") , inverseJoinColumns=@JoinColumn(name="VEHICLE_ID"))*/
	/*@OneToMany(mappedBy = "detailsMapping")*/
	/*@ManyToMany*/
	@OneToMany
	private Collection<Vehicle> vehicles = new ArrayList<Vehicle>(); 

	public UserDetailsMapping(){
		
	}

	public UserDetailsMapping(String userName){
			this.userName = userName;
		}

	
	/**
	 * 
	 * @param userName
	 * @param vehicle
	 * 
	 */

	public UserDetailsMapping(String userName, List<Vehicle> vehicles){
		this.vehicles=vehicles;
		this.userName = userName;
	}
	/**
	 * @param userId
	 * @param userName
	 * @param addressSet
	 */
	public UserDetailsMapping(int userId, String userName
			) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	

	/**
	 * @return the vehicles
	 */
	public Collection<Vehicle> getVehicles() {
		return vehicles;
	}

	/**
	 * @param vehicles the vehicles to set
	 */
	public void setVehicles(Collection<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

/**
	 * @return the vehicle
	 *//*
	public Vehicle getVehicle() {
		return vehicle;
	}

	*//**
	 * @param vehicle the vehicle to set
	 *//*
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

*/	/**
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
		return "UserDetailsCollection [userId=" + userId + ", userName="
				+ userName + "]";
	}
	
	
}
