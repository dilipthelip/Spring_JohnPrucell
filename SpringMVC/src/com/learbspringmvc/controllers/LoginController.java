package com.learbspringmvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learbspringmvc.dao.UsersDao;
import com.learbspringmvc.model.User;
import com.learbspringmvc.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService service;
	
	@Autowired
	ResourceBundleMessageSource messageSource;
	
	@Autowired
	private Environment environment;
	
	@Value("${Passwords.match}")
	private String value;
	
	/**
	 * @return the service
	 */
	public UserService getService() {
		return service;
	}


	/**
	 * @param service the service to set
	 */
	public void setService(UserService service) {
		this.service = service;
	}

	
	/**
	 * This navigates the request to the admin page.
	 * @param model
	 * @return
	 */
	@RequestMapping("/admin")
	public String showAdmin(Model model){
		
		List<User> users = service.getAllUsers();
		model.addAttribute("users", users);
		return "admin";
	}

	/**
	 * THis is the page where the spring security custom login page is wired
	 * @return
	 */
	@RequestMapping("/customlogin")
	public String showLogin(){
		
		System.out.println(value);
		return "login";
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/logout")
	public String showLogout(){
	
		return "logout";
	}
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/loggedout")
	public String showLoggedout(){
	
		return "loggedout";
	}
	
	/**
	 * THis mapping will be invoked when the user tries to access a URL to which he does not have access to.
	 * @return
	 */
	@RequestMapping("/denied")
	public String denied(){
		 
		 return "denied";
	 }
	

	/**
	 * This one is navigates the request to the newaccount.jsp page.
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/newAccount")
	public String showLogin(Model model ){
	
		model.addAttribute("user", new User());
		return "newaccount";
	}
	
	
	
	/**
	 * 
	 * This one is used to create a new account in the DB.
	 * THis inserts the data in to the users and authorities table.
	 * @param model
	 * @param user
	 * @param result
	 * @return
	 */
	@RequestMapping("/createAccount")
	public String createAccount(Model model,@Valid User user, BindingResult result ){
		
		if(result.hasErrors()){
			
			return "newaccount";
		}
		
		user.setEnabled(true);
		user.setAuthority("ROLE_USER");
		
		if(service.exists(user.getUserName())){
			result.rejectValue("userName", "Duplicatekey.user.userName" );
			return "newaccount";
		}
		
		try{
		service.create(user);
		}catch(DuplicateKeyException e){
			/*result.rejectValue("userName", "Duplicatekey.user.userName","User Name already exist in the system" );
			return "newaccount";*/
		}
		
		return "accountcreated";
	}
	
	

}
