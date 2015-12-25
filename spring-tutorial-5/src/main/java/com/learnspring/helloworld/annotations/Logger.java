package com.learnspring.helloworld.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Logger {

	//@Autowired
	//@Qualifier("toconsole")
	//@Resource(name="consoleWriter1")
	private ConsoleWriter consoleWriter;

	//@Autowired
	//@Qualifier("fileWriter2")
	//@Resource(name="fileWriter1")
	private FileWriter fileWriter;

	public Logger() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	//@Autowired
	public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
		super();
		this.consoleWriter=consoleWriter;
		this.fileWriter=fileWriter;

	}

	//@Autowired
	public Logger(ConsoleWriter consoleWriter) {
		super();
		this.consoleWriter=consoleWriter;

	}

	//private Logger consoleWriter;

	/**
	 * @return the consoleWriter
	 */
	public ConsoleWriter getConsoleWriter() {
		return consoleWriter;
	}
	/**
	 * @param consoleWriter the consoleWriter to set
	 */
	//@Autowired
	/*@Inject
	@Named(value="consoleWriter1")*/
	@Inject
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	/**
	 * @return the fileWriter
	 */
	public LogWriter getFileWriter() {
		return fileWriter;
	}
	/**
	 * @param fileWriter the fileWriter to set
	 */
	//@Autowired
	//@Inject
	@Inject
	@Named(value="fileWriter")
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void consleWrite(){

		getConsoleWriter().write();
	}

	public void fileWrite(){

		getFileWriter().write();
	}
	
	@PostConstruct
	public void init(){
		System.out.println("INside Init");
	}
	
	@PreDestroy
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Inside Destroy");

	}

}
