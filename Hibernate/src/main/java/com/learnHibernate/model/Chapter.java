package com.learnHibernate.model;

public class Chapter {
	
	private int index;
	private String title;
	private int noOfPages;
	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}
	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the noOfPages
	 */
	public int getNoOfPages() {
		return noOfPages;
	}
	/**
	 * @param noOfPages the noOfPages to set
	 */
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Chapter [index=" + index + ", title=" + title + ", noOfPages="
				+ noOfPages + "]";
	}
	
	

}
