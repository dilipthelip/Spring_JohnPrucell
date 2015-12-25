package com.learnHibernate.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

public class Book {
	
	private long isbn;
	
	private String name;
	
	private String publisher;
	
	private Date publishDate;
	
	private int price;

	/**
	 * @param isbn
	 * @param name
	 * @param publisher
	 * @param publishDate
	 * @param price
	 */
	public Book(long isbn, String name, String publisher, Date publishDate,
			int price) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.publisher = publisher;
		this.publishDate = publishDate;
		this.price = price;
	}
	
	/**
	 * @param name
	 * @param publisher
	 * @param publishDate
	 * @param price
	 */
	public Book(String name, String publisher, Date publishDate,
			int price) {
		super();
		this.name = name;
		this.publisher = publisher;
		this.publishDate = publishDate;
		this.price = price;
	}

	/**
	 * @return the isbn
	 */
	public long getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(long isbn) {
		this.isbn = isbn;
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
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return the publishDate
	 */
	public Date getPublishDate() {
		return publishDate;
	}

	/**
	 * @param publishDate the publishDate to set
	 */
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
