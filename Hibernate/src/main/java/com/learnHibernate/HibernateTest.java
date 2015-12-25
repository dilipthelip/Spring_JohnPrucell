package com.learnHibernate;

import java.util.Date;

import com.learnHibernate.Dao.BookDao;
import com.learnHibernate.annotations.model.Book;

public class HibernateTest {

	
	public static void main(String[] args) {
		
		
		for(int i=0;i<=2;i++){
		
		Book book=new Book("HIbernate " + i , "001", new Date() ,10 );
		
		BookDao.createBook(book);
		}
		
		System.out.println(BookDao.queryAllBooks());
	}
}
