package com.learnspring.helloworld.dao.model;

public class Offer {

	private int id;
	private String name;
	private String email;
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
