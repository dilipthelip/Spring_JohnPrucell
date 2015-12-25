package com.learnspring.helloworld.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {


	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/learnspring/helloworld/beanxmls/beans.xml");
		
		MapBean bean= (MapBean) context.getBean("mapbean");
		
		System.out.println(" Map Bean :"+bean);

	}
}
