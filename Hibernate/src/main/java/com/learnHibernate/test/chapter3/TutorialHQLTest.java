package com.learnHibernate.test.chapter3;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learnHibernate.annotations.kaushik.model.UserDetailsCRUD;

public class TutorialHQLTest {
	
	public static void main(String[] args) {
		
		
		
		 SessionFactory factory= new Configuration().configure("com/learnHibernate/configs/Annotationhibernate.cfg.xml").buildSessionFactory();
		 
		 Session session =  factory.openSession();
		 
		 Transaction tx =  session.beginTransaction();
		 
		 Query query = session.createQuery(" select userId, userName from UserDetailsCRUD ");
		 query.setFirstResult(1);
		 
		 query.setMaxResults(1);
		 
		 
		// List<UserDetailsCRUD> userList = (List<UserDetailsCRUD>) query.list();
		 
		// List<Integer> userIdList = (List<Integer>) query.list().get(0);
		 //List<String> userList = (List<String>) query.list().get(1);
		 Object obj = query.list();
		 
		 List<List> list= (List<List>) obj;
		 
		 System.out.println(obj.getClass());
		 
		 
		 /*for ( Object ob : list){
			 
			 List list1 = (List) obj;
			 
			 System.out.println("list1 " + list1 );
			 
			 Object object = list.get(0);
			 
			 System.out.println(object.getClass());
			 
			 
			 System.out.println( object.toString());
			 
		 }*/
		 			 
		 tx.commit();
		 
		 session.close();
		 
		 //System.out.println(" userList :"+ userList);
	//	 System.out.println(" userIdList :"+ userIdList);
		
		 
	}

}




