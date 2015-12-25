package com.learnHibernate.test.chapter3;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.learnHibernate.annotations.kaushik.model.UserDetailsCRUD;
import com.learnHibernate.annotations.kaushik.model.UserDetailsCriteria;

public class TutorialCriteriaTest {
	
	public static void main(String[] args) {
		
		
		
		 SessionFactory factory= new Configuration().configure("com/learnHibernate/configs/Annotationhibernate.cfg.xml").buildSessionFactory();
		 
		 Session session =  factory.openSession();
		 
		 //Criteria criteria= session.createCriteria( UserDetailsCriteria.class).setProjection(Projections.property("userName"));
		 //Criteria criteria= session.createCriteria( UserDetailsCriteria.class).setProjection(Projections.max("userId"));
		 Criteria criteria= session.createCriteria( UserDetailsCriteria.class).addOrder(Order.desc("userId"));
		 
		 System.out.println(criteria.list());
		 
		 
		 
		// criteria.add(Restrictions.gt("userId", 5)).add(Restrictions.or(Restrictions.like("userName", "%se%"), Restrictions.like("userName", "%ss%")));
		 
		 System.out.println(criteria.list());
		 
		 Transaction tx =  session.beginTransaction();

		 tx.commit();
		 
		 session.close();
		 
	}

}




