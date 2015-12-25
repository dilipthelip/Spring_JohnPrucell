package com.learnspring.helloworld.annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("fileWriter")
//@Qualifier(value="fileWriter2")
public class FileWriter implements LogWriter{

	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Write method of FileWriter class");
	}
}
