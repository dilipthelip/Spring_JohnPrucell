package com.learnHibernate.test.chapter3;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.learnHibernate.annotations.kaushik.model.Address;
import com.learnHibernate.annotations.kaushik.model.UserDetails;

public class Tutorial5Test {
	
	public static void main(String[] args) {
		
		UserDetails details = new UserDetails("Dilip",new Date(),new Address("Jan Echo Trl", "Eagan", "MN", "55122"),new Address("Jan Echo Trl", "Eagan", "MN", "55122"), " Welcome to CTS" );
		UserDetails details2 = new UserDetails("Dilip2",new Date(),new Address("Jan Echo Trl", "Eagan", "MN", "55122"), new Address("Jan Echo Trl", "Eagan", "MN", "55122"), " Welcome to CTS2" );
		
		 SessionFactory factory= new Configuration().configure("com/learnHibernate/configs/Annotationhibernate.cfg.xml").buildSessionFactory();
		 
		 Session session =  factory.openSession();
		 
		 Transaction tx =  session.beginTransaction();
		 
		 session.save(details);
		 session.save(details2);
		 
		 tx.commit();
		 
		 session.close();
		
		 details = null;
		 
		 session =  factory.openSession();
		 
		 tx =  session.beginTransaction();
		 
		 details =  (UserDetails) session.get(UserDetails.class, 2);
		 
		 System.out.println(" Details : "+ details);
		 
		 
		 
		 
		 
		 
	}

}



