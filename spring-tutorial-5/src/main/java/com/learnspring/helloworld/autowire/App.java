package com.learnspring.helloworld.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.learnspring.helloworld.list.Fruitbasket;

public class App {

	public static void main(String[] args) {
		
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/learnspring/helloworld/beanxmls/beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/learnspring/helloworld/autowire/beans.xml");
		
		Logger logger= (Logger) context.getBean("logger");
		
		logger.consleWrite();
		logger.fileWrite();
		
		
		((ClassPathXmlApplicationContext) context).close();
		
	}

}
