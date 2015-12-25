package com.learnspring.helloworld.autowire;

public class Logger {
	
	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;
	
	public Logger() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 */
	/*public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
		super();
		this.consoleWriter=consoleWriter;
		this.fileWriter=fileWriter;
		
	}*/
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
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	/**
	 * @return the fileWriter
	 */
	public FileWriter getFileWriter() {
		return fileWriter;
	}
	/**
	 * @param fileWriter the fileWriter to set
	 */
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void consleWrite(){
		
		getConsoleWriter().write();
	}
	
public void fileWrite(){
		
		getFileWriter().write();
	}

}
