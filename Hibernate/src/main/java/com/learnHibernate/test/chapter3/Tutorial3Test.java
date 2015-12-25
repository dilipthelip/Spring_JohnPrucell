package com.learnHibernate.test.chapter3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.learnHibernate.annotations.kaushik.model.UserDetails;

public class Tutorial3Test {
	
	public static void main(String[] args) {
		
		UserDetails details = new UserDetails(2, "Dilip2");
		
		 SessionFactory factory= new AnnotationConfiguration().configure("com/learnHibernate/configs/Annotationhibernate.cfg.xml").buildSessionFactory();
		 
		 
		 Session session =  factory.openSession();
		 
		 Transaction tx =  session.beginTransaction();
		 
		 session.save(details);
		 
		 tx.commit();
		
	}

}

