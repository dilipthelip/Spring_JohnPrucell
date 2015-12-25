package com.learnspring.helloworld.annotations;

import org.springframework.stereotype.Component;

@Component("consoleWriter")
public class ConsoleWriter implements LogWriter {

	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Write method of Console Writer class");

	}
}
