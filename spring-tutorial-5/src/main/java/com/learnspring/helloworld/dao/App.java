package com.learnspring.helloworld.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.learnspring.helloworld.dao.model.Offer;
import com.learnspring.helloworld.properties.Robot;

public class App {

public static void main(String[] args) {
		
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/learnspring/helloworld/beanxmls/beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/learnspring/helloworld/dao/beans.xml");
		
		//Logger logger= (Logger) context.getBean("logger");
		OffersDAO dao= (OffersDAO) context.getBean("offersDao");	
		List<Offer> list =new ArrayList<Offer>();
		try{
			/*
			
			Offer offer=dao.getOffer(1);
			
			System.out.println(offer);*/
			
			//int deletedRows= dao.delete(1);
			
			//dao.create(new Offer("Dilip", "dilip.thelip@gmail.com", "Dilip Text "));
			//dao.create(new Offer("Dilip1", "dilip.thelip@gmail.com", "Dilip Text1 "));
			//Offer offer = new Offer(2, "MikeUpdated", "emailMikeUpdated", "textMikeUpdated");
			//dao.update(offer);
			
			//System.out.println(deletedRows);
			
			List<Offer> list2=new ArrayList<Offer>();
					Offer offer=new Offer(3,"Dilip4", "dilip.thelip@gmail.com", "Dilip Text ");
			Offer offer2=new Offer(2, "Dilip5", "dilip.thelip@gmail.com1", "Dilip Text1 ");
			
			list2.add(offer);
			list2.add(offer2);
			
			int a[] = dao.createList(list2);
			System.out.println(a.length);
			
			list = dao.getOffers();
			System.out.println("list :"+list);
			
		}catch (DataAccessException e){
			System.out.println("Excepton :"+e.getMessage());
		}
		
		
		//logger.consleWrite();
		//logger.fileWrite();
		//robot.speak();
		//System.out.println("List of offers  : " + );
		
		
		((ClassPathXmlApplicationContext) context).close();
		
	}


}
