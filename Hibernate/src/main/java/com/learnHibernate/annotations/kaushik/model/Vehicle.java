package com.learnHibernate.annotations.kaushik.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int vehicleID;
	
	private String vehicleName;
	
	@ManyToOne
	@JoinColumn(name="userId")
	private UserDetailsMapping detailsMapping;
	/*@ManyToMany(mappedBy="vehicles")
	private Collection<UserDetailsMapping> userList = new ArrayList<UserDetailsMapping>();*/
	

	/**
	 * @return the detailsMapping
	 */
	public UserDetailsMapping getDetailsMapping() {
		return detailsMapping;
	}

	/**
	 * @param detailsMapping the detailsMapping to set
	 */
	public void setDetailsMapping(UserDetailsMapping detailsMapping) {
		this.detailsMapping = detailsMapping;
	}

	public Vehicle(){
		
	}
	
	/**
	 * @param vehicleID
	 * @param vehicleName
	 */
	public Vehicle( String vehicleName) {
		super();
		this.vehicleName = vehicleName;
	}
	
	/**
	 * @param vehicleID
	 * @param vehicleName
	 */
	public Vehicle(int vehicleID, String vehicleName) {
		super();
		this.vehicleID = vehicleID;
		this.vehicleName = vehicleName;
	}
	/**
	 * @return the userList
	 *//*
	public Collection<UserDetailsMapping> getUserList() {
		return userList;
	}

	*//**
	 * @param userList the userList to set
	 *//*
	public void setUserList(Collection<UserDetailsMapping> userList) {
		this.userList = userList;
	}*/

	/**
	 * @return the vehicleID
	 */
	public int getVehicleID() {
		return vehicleID;
	}
	/**
	 * @param vehicleID the vehicleID to set
	 */
	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	/**
	 * @return the vehicleName
	 */
	public String getVehicleName() {
		return vehicleName;
	}
	/**
	 * @param vehicleName the vehicleName to set
	 */
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	
	
}
