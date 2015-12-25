package com.learnHibernate.test.chapter3;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learnHibernate.annotations.kaushik.model.UserDetailsCRUD;

public class TutorialHQLNamedQueryTest {
	
	public static void main(String[] args) {
		
		
		
		 SessionFactory factory= new Configuration().configure("com/learnHibernate/configs/Annotationhibernate.cfg.xml").buildSessionFactory();
		 
		 Session session =  factory.openSession();
		 
		 Transaction tx =  session.beginTransaction();
		 String userId="5";
		 
		 Query query = session.getNamedQuery("UserDetails.byIdnative");
		 //session.getNamedQuery(queryName)
		 query.setInteger(0, 5);
		 
		 System.out.println(query.list());

		 tx.commit();
		 
		 session.close();
		 
		 //System.out.println(" userList :"+ userList);
	//	 System.out.println(" userIdList :"+ userIdList);
		
		 
	}

}




