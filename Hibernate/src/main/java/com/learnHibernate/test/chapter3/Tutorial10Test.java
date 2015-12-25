package com.learnHibernate.test.chapter3;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.learnHibernate.annotations.kaushik.model.Address;
import com.learnHibernate.annotations.kaushik.model.UserDetails;
import com.learnHibernate.annotations.kaushik.model.UserDetailsCollection;

public class Tutorial10Test {
	
	public static void main(String[] args) {
		
		
		List<Address> addressSet = new ArrayList<Address>();
		
		addressSet.add(new Address("4414 Jan Echo Trail", "Eagan", "MN", "55122"));
		addressSet.add(new Address("4414 Jan Echo Trail1", "Eagan1", "MN1", "551221"));
		UserDetailsCollection details=new UserDetailsCollection("Dilip", addressSet) ;
		//UserDetailsCollection details2=new UserDetailsCollection("Dilip1", addressSet) ;
				
				
		
		 SessionFactory factory= new Configuration().configure("com/learnHibernate/configs/Annotationhibernate.cfg.xml").buildSessionFactory();
		 
		 Session session =  factory.openSession();
		 
		 Transaction tx =  session.beginTransaction();
		 
		 session.save(details);
		// session.save(details2);
		 
		 tx.commit();
		 
		 session.close();
		
		 details = null;
		 
		 session =  factory.openSession();
		 
		 tx =  session.beginTransaction();
		 
		 details = (UserDetailsCollection) session.get(UserDetailsCollection.class, 1);	 
		 
		 System.out.println(" User Details : "+ details);
	}

}



