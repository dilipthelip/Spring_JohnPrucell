package com.learnHibernate.annotations.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOOK")
public class Book {
	
	@Id
	@Column(name="isbn")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long isbn;
	
	@Column(name="book_name")
	private String name;
	
	@Column(name="publisher_code")
	private String publisher;
	
	@Column(name="publish_date")
	private Date publishDate;
	
	@Column(name="price")
	private int price;
	
	
	public Book(){
		
	}
	
	
	public Book(long isbn, String name, String publisher, Date publishDate,
			int price) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.publisher = publisher;
		this.publishDate = publishDate;
		this.price = price;
	}
	
	public Book(String name, String publisher, Date publishDate,
			int price) {
		super();
	//	this.isbn = isbn;
		this.name = name;
		this.publisher = publisher;
		this.publishDate = publishDate;
		this.price = price;
	}


	/*private List<Chapter> Chapters;*/
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
/*	*//**
	 * @return the chapters
	 *//*
	public List<Chapter> getChapters() {
		return Chapters;
	}
	*//**
	 * @param chapters the chapters to set
	 *//*
	public void setChapters(List<Chapter> chapters) {
		Chapters = chapters;
	}*/
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", publisher="
				+ publisher + ", publishDate=" + publishDate + ", price="
				+ price + ", Chapters=" + "]";
	}

}
