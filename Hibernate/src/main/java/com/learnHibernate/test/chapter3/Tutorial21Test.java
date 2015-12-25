package com.learnHibernate.test.chapter3;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learnHibernate.annotations.kaushik.model.FourWheeler;
import com.learnHibernate.annotations.kaushik.model.TwoWheeler;
import com.learnHibernate.annotations.kaushik.model.UserDetailsCRUD;
import com.learnHibernate.annotations.kaushik.model.UserDetailsMapping;
import com.learnHibernate.annotations.kaushik.model.Vehicle;
import com.learnHibernate.annotations.kaushik.model.VehicleInheritance;

public class Tutorial21Test {
	
	public static void main(String[] args) {
		
		
		
		 SessionFactory factory= new Configuration().configure("com/learnHibernate/configs/Annotationhibernate.cfg.xml").buildSessionFactory();
		 
		 Session session =  factory.openSession();
		 
		 Transaction tx =  session.beginTransaction();
		 
		/* UserDetailsCRUD detailsCRUD=new UserDetailsCRUD("Dilip");
		 UserDetailsCRUD detailsCRUD1=new UserDetailsCRUD("Dilip1");
		 UserDetailsCRUD detailsCRUD2=new UserDetailsCRUD("Dilip2");
		 
		 session.save(detailsCRUD);
		 session.save(detailsCRUD1);
		 session.save(detailsCRUD2);*/
		 
		 UserDetailsCRUD crud = (UserDetailsCRUD) session.get(UserDetailsCRUD.class, 3);
	//	 System.out.println(" Crud Object : "+ crud);
		 
		// crud.setUserName("Updated Dilipasdas");
		 
		 //session.delete(crud);
		// session.update(crud);
		 
		 //crud.setUserName("Updated Dilip1	q Updayed2");
		 //crud.setUserName("Updated Dilip1	q Updayed1");
		 
		 UserDetailsCRUD detailsCRUD2=new UserDetailsCRUD("Dilip2");
		 
		 session.persist(detailsCRUD2);
		 
		 detailsCRUD2.setUserName("Dilip 10");
		 detailsCRUD2.setUserName("Dilip 11");
		
		tx.commit();
		 
		 session.close();
		
		 System.out.println(" Crud Object : "+ crud);
		 
		 session=null;
		 
		 session =  factory.openSession();
		 
		 
		 
		 tx =  session.beginTransaction();
		 
		
		 
		 session.update(crud);
		 tx.commit();
		 
		 session.close();
		 
	}

}



