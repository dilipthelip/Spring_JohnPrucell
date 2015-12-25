package com.learnHibernate.annotations.kaushik.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE_INHERITANCE")
/*@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)*/
@Inheritance(strategy=InheritanceType.JOINED)
/*@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Vehicle_Type",
discriminatorType= DiscriminatorType.STRING
		)
*/public class VehicleInheritance {
	
	@Id
	//@GeneratedValue(strategy= GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vehicleID;
	
	private String vehicleName;
	

	public VehicleInheritance(){
		
	}
	
	/**
	 * @param vehicleID
	 * @param vehicleName
	 */
	public VehicleInheritance( String vehicleName) {
		super();
		this.vehicleName = vehicleName;
	}
	
	/**
	 * @param vehicleID
	 * @param vehicleName
	 */
	public VehicleInheritance(int vehicleID, String vehicleName) {
		super();
		this.vehicleID = vehicleID;
		this.vehicleName = vehicleName;
	}
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "VehicleInheritance [vehicleID=" + vehicleID + ", vehicleName="
				+ vehicleName + "]";
	}
	
	
	
	
}
