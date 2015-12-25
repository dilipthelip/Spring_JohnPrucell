package com.learbspringmvc.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.learbspringmvc.customannotation.ValidEmail;

public class Offer {

	private int id;
	
	
	@Size(min=5, max=100,message="Name must be between 5 and 100 characters")
	private String name;
	
	@NotNull
	//@Pattern(regexp=".*\\@.*\\..*")
	@ValidEmail(min=6,message="This email is not a valid format")
	private String email;
	
	@Size(min=5, max=100,message="Text must be between 5 and 100 characters")
	private String text;
	
	public Offer(){
		
	}
	
	
	public Offer( String name, String email, String text) {
		super();
		this.name = name;
		this.email = email;
		this.text = text;
	}
	
	public Offer( int id ,String name, String email, String text) {
		super();
		this.id=id;
		this.name = name;
		this.email = email;
		this.text = text;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
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
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Offer [id=" + id + ", name=" + name + ", email=" + email
				+ ", text=" + text + "]";
	}



}
