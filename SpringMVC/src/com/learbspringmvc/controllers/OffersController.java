package com.learbspringmvc.controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpRequest;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import com.learbspringmvc.model.Offer;
import com.learbspringmvc.service.OffersService;

@Controller
public class OffersController {

	/*@RequestMapping("/")
	public ModelAndView showHome(HttpSession session){


		//session.setAttribute("name", "Dilip");

		ModelAndView mv=new ModelAndView("Home");

		Map<String, Object> map = mv.getModel();

		map.put("name", "<b>Dilip</b>");

		return mv;
	}*/
	@Autowired
	private OffersService offersService;


	/**
	 * @return the offersService
	 */
	public OffersService getOffersService() {
		return offersService;
	}


	/**
	 * @param offersService the offersService to set
	 */
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}

	/**
	 * THis method displays all the offers out there in the marker
	 * @param model
	 * @return
	 */
	@RequestMapping("/offers")
	public String showOffers(Model model){

	//	offersService.throwTestException();
		
		List< Offer > offerList =  offersService.getcurrent();
		System.out.println(offerList);
		model.addAttribute("offers", offerList);

		return "Offers";
	}

	@RequestMapping(value = "/test" , method=RequestMethod.GET)
	public String test(Model model, @RequestParam("id") String id){

		System.out.println("Id is : "+id);

		return "Home";
	}


	/**
	 * This mapping is to navigate to the view component of the register Create offer Jsp
	 * @return
	 */
	@RequestMapping("/createOffers")
	public String createOffers(Model model,SecurityContextHolderAwareRequestWrapper request){
		
		model.addAttribute("offer", new Offer());
		return "createOffer";
	}


	/**
	 * This mapping is to get the form values from the create offer page and 
	 * insert the data in to the table. 
	 * @return
	 */
	@RequestMapping(value = "/doCreate", method=RequestMethod.POST)
	public String doCreate(Model model, @Valid Offer offer,BindingResult result ){

		if(result.hasErrors()){
			/*System.out.println("Form has errors");

			List<ObjectError> errors = result.getAllErrors();

			for(ObjectError error : errors){
				System.out.println(error.getDefaultMessage());
			}*/
			return "createOffer";
		}else{
			System.out.println("Form Validated");
			
		}

		System.out.println(" Offer :"+offer);
		
		offersService.createOffer(offer);
		
		return "offerCreated";
	}
	
/*	@ExceptionHandler(DataAccessException.class)
	public String handleDataBaseExceptions(DataAccessException accessException){
		
		return "error";
	}

*/
	
}
