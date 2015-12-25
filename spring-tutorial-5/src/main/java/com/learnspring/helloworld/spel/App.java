package com.learnspring.helloworld.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learnspring.helloworld.spel.Robot;

public class App {

public static void main(String[] args) {
		
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/learnspring/helloworld/beanxmls/beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/learnspring/helloworld/spel/beans.xml");
		
		//Logger logger= (Logger) context.getBean("logger");
		
		Robot robot= (Robot) context.getBean("robot");
		
		//logger.consleWrite();
		//logger.fileWrite();
		robot.speak();
		
		
		((ClassPathXmlApplicationContext) context).close();
		
	}


}
