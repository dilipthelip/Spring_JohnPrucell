package com.learnspring.helloworld.spel;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomText {
	
	private static String texts[]={
		"I will be back", "get Out", "I want your clothes"
	};
	
	public String getText(){
		
		Random random=new Random();
		return texts[random.nextInt(texts.length)];
		//return null;
	}

}
