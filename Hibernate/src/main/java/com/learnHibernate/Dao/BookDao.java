package com.learnHibernate.Dao;

import java.util.List;






import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.stat.Statistics;

import com.learnHibernate.annotations.model.Book;
import com.learnHibernate.service.SessionManager;

public class BookDao {


//	private static Session session;
	
	/*private static  Session getSessionObj(){
		
		 session = SessionManager.getSessionfactory().getCurrentSession();

		session.beginTransaction();
		return session;
	}
	
	private static void closeSession(Session session){
		session.getTransaction().commit();
		session.close();
		
	}*/

	/**
	 * THis method gets all the books from the DB
	 * @return
	 */

	public static List<Book> queryAllBooks(){
		
		Session session = SessionManager.getSessionfactory().getCurrentSession();
		session.beginTransaction();

		List<Book> bookList= session.createQuery("FROM Book").list();

		System.out.println("BOOK LIST :" + bookList);

		session.getTransaction().commit();
	//	session.close();

		return bookList;
	}

	/**
	 * THis method is to insert data in to the book table
	 * @param book
	 */

	public static void createBook(Book book){
		
		
		
		Session session = SessionManager.getSessionfactory().getCurrentSession();
		Statistics statistics= (Statistics) SessionManager.getSessionfactory().getStatistics();
		statistics.setStatisticsEnabled(true);
		Transaction tx= session.beginTransaction();

		
		session.persist(book);
		
		tx.commit();
		statistics.getSessionOpenCount();
		//session.close();
	}

}

