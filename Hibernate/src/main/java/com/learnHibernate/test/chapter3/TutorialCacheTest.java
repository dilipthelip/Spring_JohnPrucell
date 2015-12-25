package com.learnHibernate.test.chapter3;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learnHibernate.annotations.kaushik.model.UserDetailsCache;

public class TutorialCacheTest {

	public static void main(String[] args) {



		SessionFactory factory= new Configuration().configure("com/learnHibernate/configs/Annotationhibernate.cfg.xml").buildSessionFactory();

		Session session =  factory.openSession();

		Transaction tx =  session.beginTransaction();

		UserDetailsCache detailsCache= (UserDetailsCache) session.get(UserDetailsCache.class, 1);
		
		detailsCache.setUserName("Dilip");
		detailsCache.setUserName("Updated Dilip");

//		UserDetailsCache detailsCache1= (UserDetailsCache) session.get(UserDetailsCache.class, 1);
		
		Query query = session.createQuery("from UserDetailsCache");
		query.setCacheable(true);
		System.out.println("user 1 " + query.list());

	//	System.out.println(detailsCache1);
		//System.out.println(detailsCache);


		tx.commit();

		session.close();
		
		tx=null;

		Session session2 =  factory.openSession();

		tx =  session2.beginTransaction();

		Query query1 = session2.createQuery("from UserDetailsCache");
		query1.setCacheable(true);
		
		System.out.println(" user 2  :"+ query1.list());

		tx.commit();

		session2.close();



	}

}




