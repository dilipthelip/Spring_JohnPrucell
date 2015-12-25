package com.learnHibernate.annotations.kaushik.model.embedded;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.learnHibernate.annotations.kaushik.model.Address;
import com.learnHibernate.annotations.kaushik.model.UserDetails;
import com.learnHibernate.annotations.kaushik.model.UserDetailsCollection;

public class EmbeddedTest {
	
	public static void main(String[] args) {
		
		
		UserDetailsCompositePK compositePK=new UserDetailsCompositePK();
		compositePK.setName("Dilip");
		
		UserDetailsCompositePK compositePK1=new UserDetailsCompositePK();
		compositePK1.setName("Dilip");
		UserDetailsComposite composite=new UserDetailsComposite();
		//composite.setUserDetailsCompositePK(compositePK);
		composite.setCity("Eagan");
		composite.setState("MN");
		composite.setName("Dilip");
		UserDetailsComposite composite1=new UserDetailsComposite();
		//composite1.setUserDetailsCompositePK(compositePK1);
		composite1.setCity("Eagan");
		composite1.setState("MN");
		composite1.setName("Dilip1");
		
		
		 SessionFactory factory= new Configuration().configure("com/learnHibernate/configs/Annotationhibernate.cfg.xml").buildSessionFactory();
		 
		 Session session =  factory.openSession();
		 
		 Transaction tx =  session.beginTransaction();
		 
		// session.save(details2);
		 
		 Query query = session.createSQLQuery("select cncrrFltCrewSqNb.nextval from dual");
		 
		 int i = query.executeUpdate();
		 
		 session.save(composite);
		 session.save(composite1);

		 
		 
		 tx.commit();
		 
		 session.close();
		 
		
	}

}




