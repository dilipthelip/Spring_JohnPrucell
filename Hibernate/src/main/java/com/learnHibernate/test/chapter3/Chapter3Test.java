package com.learnHibernate.test.chapter3;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learnHibernate.model.Book;
import com.learnHibernate.model.Contact;
import com.learnHibernate.model.Customer;
import com.learnHibernate.model.CustomerId;
import com.learnHibernate.model.Orders;

public class Chapter3Test {
	
	public static void main(String[] args) {
		

		Configuration config= new Configuration().configure("com/learnHibernate/configs/hibernate.cfg.xml");

		System.out.println("System configured");


		SessionFactory factory=  config.buildSessionFactory();

		Session session= factory.openSession();


		try {
			/**
			 * 
			 */
			Transaction tx= session.beginTransaction();
			
			Contact weekDayContact = new Contact("Dilip", "6512351130", "Eagan");
			Contact holidayContact = new Contact("Dilip", "XXXXXXXX", "Miami");
			
			Orders order=new Orders();
			
			order.setHolidayContact(holidayContact);
			order.setWeekDayContact(weekDayContact);
			
			session.persist(order);
			tx.commit();	
			
			Transaction tx1 = session.beginTransaction();
			
			long id =3;
			Orders orders = (Orders) session.get(Orders.class , id);
			
			tx1.commit();
			
			System.out.println(orders);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally{
			session.close();
		}
	
		
	}

}
