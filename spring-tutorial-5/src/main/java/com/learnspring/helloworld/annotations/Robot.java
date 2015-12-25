package com.learnspring.helloworld.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	
	private int id=0;
	private String speech="hello";
	
	public int getId() {
		return id;
	}
	
	@Autowired
	public void setId(@Value("1138") int id) {
		this.id = id;
	}

	public String getSpeech() {
		return speech;
	}
	
	@Autowired
	public void setSpeech(@Value("I am a Robot" ) String speech) {
		this.speech = speech;
	}

	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(getId() + " " +getSpeech());
	}
	

}
