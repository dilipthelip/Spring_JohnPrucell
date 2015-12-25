package com.learnHibernate.annotations.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.learnHibernate.annotations.model.Contact;

@Entity
@org.hibernate.annotations.Entity(dynamicInsert=true , dynamicUpdate=true)
@Table(name="Orders")
public class Orders {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
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
	@Embedded
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
	@Embedded
	@AttributeOverrides({	@AttributeOverride(name="recipient", column=@Column (name="holiday_recipient")),
							@AttributeOverride(name="phone", column=@Column (name="holiday_phone")),
							@AttributeOverride(name="address", column=@Column (name="holiday_address"))}
			)
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
