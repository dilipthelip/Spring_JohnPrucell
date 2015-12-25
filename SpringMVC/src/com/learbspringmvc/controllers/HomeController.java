package com.learbspringmvc.controllers;

import org.apache.log4j.Logger;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	private static Logger logger = Logger.getLogger(HomeController.class); 
	
	@RequestMapping("/")
	public String showHome(Model model, SecurityContextHolderAwareRequestWrapper request){
		
		logger.debug("Showing Home page");
		return "Home";
	}
	
	

}
