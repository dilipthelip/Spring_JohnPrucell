package com.learbspringmvc.service;

import java.util.List;

import com.learbspringmvc.dao.OffersDAO;
import com.learbspringmvc.dao.UsersDao;
import com.learbspringmvc.model.Offer;
import com.learbspringmvc.model.User;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
	
	
	@Autowired
	private UsersDao usersDao;

	/**
	 * @return the usersDao
	 */
	public UsersDao getUsersDao() {
		return usersDao;
	}

	/**
	 * @param usersDao the usersDao to set
	 */
	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}
	
	/**
	 * Inserts the data in to the user and authorities table
	 * @param user
	 */
	public void create(User user){
		
		getUsersDao().create(user);
	}
	
	/**
	 * Check whether the user exists in the table.
	 * @param userName
	 * @return
	 */
	public boolean exists(String userName){
		
		return usersDao.exists(userName);
	}
	
	/**
	 * This method returns all the users in the DB
	 * 
	 * @return
	 */
	@Secured("ROLE_ADMIN")
	public List<User> getAllUsers(){
		
		return usersDao.getAllUsers();
	}
	
}
