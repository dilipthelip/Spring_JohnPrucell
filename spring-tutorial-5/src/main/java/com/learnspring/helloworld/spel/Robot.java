package com.learnspring.helloworld.spel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	private String id =" Default Robot";
	private String speech="hello";

	public String getId() {
		return id;
	}

	@Autowired
	public void setId( @Value("#{randomText.getText()?.length()}") String id) {
		this.id = id;
	}

	public String getSpeech() {
		return speech;
	}

	@Autowired
	//public void setSpeech( @Value("#{randomText.getText()}")  String speech) {
	//new java.util.Date().toString()
	public void setSpeech(@Value("#{ T (Math).sin(5) le 1 ? 'Yes' : 'no'}") String speech) { 
	
		this.speech = speech;
		
	}

	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(getId() + " " +getSpeech());
	}


}
