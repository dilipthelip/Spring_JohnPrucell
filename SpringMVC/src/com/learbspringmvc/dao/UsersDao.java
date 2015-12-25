package com.learbspringmvc.dao;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.learbspringmvc.model.User;
import com.learbspringmvc.model.User1;

@Component("usersDao")
@Transactional
public class UsersDao {

	NamedParameterJdbcTemplate jdbcTemplate;
	
/*	@Autowired
	private SessionFactory factory;*/
	
	@Autowired
	private PasswordEncoder encoder;

	public Session session(){
		
		//return factory.getCurrentSession();
		
		return null;
		
	}
	
	@Autowired
	public void setDataSource(DataSource jdbcTemplate) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
	}
	
	/**
	 * Used to insert the Record
	 * @param offer
	 * @return
	 */
	@Transactional
	public boolean create(User user){
			
	//	BeanPropertySqlParameterSource params=new BeanPropertySqlParameterSource(user);
		
		MapSqlParameterSource params=new MapSqlParameterSource();
		params.addValue("userName", user.getUserName());
		params.addValue("password", encoder.encode(user.getUserName()));
		params.addValue("email", user.getEmail());
		params.addValue("enabled", user.isEnabled());
		params.addValue("authority", user.getAuthority());
		
		
		jdbcTemplate.update("insert into users (username, password,email,enabled) values (:userName,:password,:email,:enabled)", params) ;
		
		return jdbcTemplate.update("insert into authorities (username, authority) values (:userName,:authority)", params) == 1;		
		//return true;
	}
	
	/**
	 * This method will be used to insert the data in to the table via Hibernate
	 * @param user
	 */
	public void createHiIbernate(User1 user){
		
			session().save(user);
		}
	

	public boolean exists(String userName){
		
		MapSqlParameterSource paramSource=new MapSqlParameterSource();
		paramSource.addValue("name", userName);
		
		return jdbcTemplate.queryForObject("Select count(*) from users where username = :name",paramSource, Integer.class) > 0  ;
	}
	
	/**
	 * THis method fetches all the users from the table.
	 * @return
	 */
	@SuppressWarnings(value = { "unchecked" })
	public List<User> getAllUsers(){

		return session().createQuery("from User").list();
		
		//return jdbcTemplate.query("select * from users , authorities where users.username=authorities.username", BeanPropertyRowMapper.newInstance(User.class));
		
	
		
		
	}
	
	/**
	 * THis method fetches all the users from the table.
	 * @return
	 */
	@SuppressWarnings(value = { "unchecked" })
	public List<User1> getAllUsersHibernate(){

		return session().createQuery("from User1").list();
		//return jdbcTemplate.query("select * from users , authorities where users.username=authorities.username", BeanPropertyRowMapper.newInstance(User.class));
		
	
		
		
	}

}
