package com.learnHibernate.test.chapter3;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learnHibernate.annotations.kaushik.model.UserDetailsMapping;
import com.learnHibernate.annotations.kaushik.model.Vehicle;

public class Tutorial13Test {
	
	public static void main(String[] args) {
		
		
		
		Vehicle vehicle=new Vehicle("Camry");
		Vehicle vehicle2=new Vehicle("Accord");
		
		List<Vehicle> vehicles=new ArrayList<Vehicle>();
		vehicles.add(vehicle);
		vehicles.add(vehicle2);
		
		UserDetailsMapping details=new UserDetailsMapping("Dilip", vehicles);
		//vehicle.getUserList().add(details);	
		//vehicle2.getUserList().add(details);
		 SessionFactory factory= new Configuration().configure("com/learnHibernate/configs/Annotationhibernate.cfg.xml").buildSessionFactory();
		 
		 Session session =  factory.openSession();
		 
		 Transaction tx =  session.beginTransaction();
		 
		 session.save(details);
		 session.save(vehicle);
		 session.save(vehicle2);
		 
		 tx.commit();
		 
		 session.close();
		
		 details = null;
		 
		 session =  factory.openSession();
		 
		 tx =  session.beginTransaction();
		 
		// details = (UserDetailsCollection) session.get(UserDetailsCollection.class, 1);	 
		 
		 System.out.println(" User Details : "+ details);
	}

}



