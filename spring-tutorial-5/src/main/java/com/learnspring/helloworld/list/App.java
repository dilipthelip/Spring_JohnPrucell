package com.learnspring.helloworld.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.learnspring.helloworld.list.Fruitbasket;

public class App {

	public static void main(String[] args) {
		
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/learnspring/helloworld/beanxmls/beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/learnspring/helloworld/beanxmls/beans.xml");
		
	//	Person person=(Person) context.getBean("person");
		
		
	//	Address address=(Address) context.getBean("address2");
		
		Jungle jungle=(Jungle) context.getBean("jungle");
		
		System.out.println( " Jungle : " + jungle);
	//	System.out.println("Person Values are : "+person);
		
		
	//	((FileSystemXmlApplicationContext) context).close();
		((ClassPathXmlApplicationContext) context).close();
		
	}

}
