package com.learbspringmvc.service;

import java.util.List;

import com.learbspringmvc.dao.OffersDAO;
import com.learbspringmvc.model.Offer;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("offerService")
public class OffersService {
	
	
	@Autowired
	private OffersDAO offersDao;
	
	/**
	 * @return the offersDao
	 */
	public OffersDAO getOffersDao() {
		return offersDao;
	}

	/**
	 * @param offersDao the offersDao to set
	 */
	public void setOffersDao(OffersDAO offersDao) {
		this.offersDao = offersDao;
	}

	
	public List<Offer> getcurrent(){
		
		return getOffersDao().getOffers();
	}
	
	public void createOffer(Offer offer){
		
		offersDao.create(offer);
	}
	
	public void throwTestException(){
		
		offersDao.getOffer(9999);
	}

}
