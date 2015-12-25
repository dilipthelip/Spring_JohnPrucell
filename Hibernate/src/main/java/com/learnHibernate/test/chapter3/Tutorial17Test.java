package com.learnHibernate.test.chapter3;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learnHibernate.annotations.kaushik.model.FourWheeler;
import com.learnHibernate.annotations.kaushik.model.TwoWheeler;
import com.learnHibernate.annotations.kaushik.model.UserDetailsMapping;
import com.learnHibernate.annotations.kaushik.model.Vehicle;
import com.learnHibernate.annotations.kaushik.model.VehicleInheritance;

public class Tutorial17Test {
	
	public static void main(String[] args) {
		
		VehicleInheritance vehicle=new VehicleInheritance("Honda");
		
		//VehicleInheritance vehicle1=new VehicleInheritance("Toyota");
		
		TwoWheeler twoWheeler= new TwoWheeler();
		twoWheeler.setVehicleName("Bike");
		twoWheeler.setSteeringHandle("Bike Steering handle");
		
		FourWheeler fourWheeler=new FourWheeler();
		fourWheeler.setVehicleName("Car");
		fourWheeler.setVehicleName("Car Steering Wheel" );
		
		
		 SessionFactory factory= new Configuration().configure("com/learnHibernate/configs/Annotationhibernate.cfg.xml").buildSessionFactory();
		 
		 Session session =  factory.openSession();
		 
		 Transaction tx =  session.beginTransaction();
		 
		 session.save(vehicle);
		 session.save(twoWheeler);
		 session.save(fourWheeler);
		 
		 tx.commit();
		 
		 session.close();
		
		 
		 session =  factory.openSession();
		 
		 vehicle=null;
		 
		 vehicle = (VehicleInheritance) session.get(VehicleInheritance.class, 2);
		 
		 System.out.println("Vechicle : "+ vehicle);
		 
		 tx =  session.beginTransaction();
		 
		 
	}

}



