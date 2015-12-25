package com.learnHibernate.test.annotations.chapter3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.learnHibernate.annotations.model.Contact;
import com.learnHibernate.annotations.model.Orders;


public class Chapter3AnnotationTest {
	
	public static void main(String[] args) {
		

		  SessionFactory factory= new AnnotationConfiguration().configure("com/learnHibernate/configs/Annotationhibernate.cfg.xml").buildSessionFactory();

		System.out.println("System configured");


		//SessionFactory factory=  config.buildSessionFactory();

		Session session= factory.openSession();


		try {
			/**
			 * 
			 */
			Transaction tx= session.beginTransaction();
			
			Contact weekDayContact = new Contact("Dilip", "6512351130", "Eagan111");
			Contact holidayContact = new Contact("Dilip", "XXXXXXXX", "Miami11");
			
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
