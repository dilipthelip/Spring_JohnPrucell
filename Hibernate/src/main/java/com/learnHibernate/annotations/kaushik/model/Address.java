package com.learnHibernate.annotations.kaushik.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;



@Embeddable
public class Address {

		
	@Column(name="Street_NAME")
	private String street;
	@Column(name="City_NAME")
	private String city;
	@Column(name="State_NAME")
	private String state;
	@Column(name="Pincode_NAME")
	private String pincode;
	
	public Address(){
		
	}
	/**
	 * @param street
	 * @param city
	 * @param state
	 * @param pincode
	 */
	public Address(String street, String city, String state, String pincode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
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
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}
	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + "]";
	}
	
	
}
