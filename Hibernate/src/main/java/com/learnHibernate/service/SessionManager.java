package com.learnHibernate.service;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class SessionManager {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	/**
	 * @return the sessionfactory
	 */
	public static SessionFactory getSessionfactory() {
		
		if(sessionFactory == null && sessionFactory.isClosed()){
			buildSessionFactory();
		}
		return sessionFactory;
	}

	private static SessionFactory buildSessionFactory(){
		
		 //  Configuration config= new Configuration().configure("com/learnHibernate/configs/hibernate.cfg.xml");
		   
		   SessionFactory factory= new AnnotationConfiguration().configure("com/learnHibernate/configs/hibernate.cfg.xml").buildSessionFactory();
		
		   return factory;
	}

}
