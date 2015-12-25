package com.learnHibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learnHibernate.model.Book;
import com.learnHibernate.model.Customer;
import com.learnHibernate.model.CustomerId;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		Configuration config= new Configuration().configure("com/learnHibernate/configs/hibernate.cfg.xml");

		System.out.println("System configured");


		SessionFactory factory=  config.buildSessionFactory();

		Session session= factory.openSession();


		try {
			/**
			 * 
			 */
			Transaction tx1= session.beginTransaction();
			Book book1=new Book("HIbernate ", "001", new Date() ,10 );
			createBook(book1, session);
			tx1.commit();
			
			/*Book  book = (Book) session.load(Book.class, "PBN456");

			System.out.println("Result is  :" + book);
			Query query	 =session.createQuery("From Book");

			List<Book> list= query.list();

			System.out.println("List : "+list);*/

/*			Book book1 =null;

			for(int i=0;i<=2;i++){

				book1=new Book("HIbernate " + i , "001", new Date() ,10 );

				createBook(book1, session);
			}
*/
			
			
			/**
			 * Composite ID
			 */
			Transaction tx= session.beginTransaction();
			CustomerId customerId =new CustomerId("IN", "123456");
			
			Customer customer= (Customer) session.get(Customer.class, customerId);
			
			//customer.setId(new CustomerId("MN", "23131"));
			
			Customer customer2= new Customer();
			customer2.setAddress("New Address");
			customer2.setEmail("New Address");
			customer2.setFirstName("Dilip First");
			customer2.setLastName("Dilip Last");
			customer2.setId(new CustomerId("MN", "dfsfsd"));
			session.persist(customer2);
			tx.commit();
			System.out.println("customer From DB is "+customer);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally{
			session.close();
		}
	}

	/**
	 * This method is used to insert data in to the table.
	 * @param book
	 */

	public static void createBook(Book book, Session session){

		//Session session = SessionManager.getSessionfactory().getCurrentSession();
		//Statistics statistics= (Statistics) SessionManager.getSessionfactory().getStatistics();
		//statistics.setStatisticsEnabled(true);
		//Transaction tx= session.beginTransaction();


		session.persist(book);

		//tx.commit();
		//statistics.getSessionOpenCount();
		//session.close();
	}
}


