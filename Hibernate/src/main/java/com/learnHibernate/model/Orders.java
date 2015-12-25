package com.learnHibernate.model;

public class Orders {

	
	private long id;
	
	private Contact weekDayContact;
	private Contact holidayContact;
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
	 * @return the weekDayContact
	 */
	public Contact getWeekDayContact() {
		return weekDayContact;
	}
	/**
	 * @param weekDayContact the weekDayContact to set
	 */
	public void setWeekDayContact(Contact weekDayContact) {
		this.weekDayContact = weekDayContact;
	}
	/**
	 * @return the holidayContact
	 */
	public Contact getHolidayContact() {
		return holidayContact;
	}
	/**
	 * @param holidayContact the holidayContact to set
	 */
	public void setHolidayContact(Contact holidayContact) {
		this.holidayContact = holidayContact;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Orders [id=" + id + ", weekDayContact=" + weekDayContact
				+ ", holidayContact=" + holidayContact + "]";
	}
	
}
