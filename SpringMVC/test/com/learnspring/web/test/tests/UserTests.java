package com.learnspring.web.test.tests;

import static org.junit.Assert.*;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.learbspringmvc.dao.UsersDao;
import com.learbspringmvc.model.User;
import com.learbspringmvc.model.User1;


@ActiveProfiles("dev")
/*@ContextConfiguration(locations={"classpath:com/learnspring/web/test/config/data.xml","classpath:com/learbspringmvc/configs/security-context.xml",
"classpath:com/learbspringmvc/configs/dao-context.xml", "classpath:com/learbspringmvc/configs/service-context.xml"})
*/
@ContextConfiguration(locations={"classpath:com/learnspring/web/test/config/data.xml","classpath:com/learbspringmvc/configs/security-context.xml",
"classpath:com/learbspringmvc/configs/dao-context.xml", "classpath:com/learbspringmvc/configs/service-context.xml"})

@RunWith(SpringJUnit4ClassRunner.class)
public class UserTests {
	
	private JdbcTemplate jdbcTemplate;
	 
	@Autowired
	private UsersDao dao;
	
	@Autowired
	private DataSource dataSource;
	
	
	
	@Before
	public void init(){
		JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
		jdbcTemplate.execute("delete from users1");
		jdbcTemplate.execute("delete from authorities");
	}

	@Test
	@Ignore
	public void testCreateUser1(){
		
		assertEquals("DummyTest", 1 ,1 );
	}
	
	@Test
	public void testCreateUser(){
		
		User1 user =new User1("DilipTest", "Password", "dilip.bandlasundarraj@delta.com",true) ;
		
		//assertEquals("User Creation should return true",dao.create(user),true);
		
		dao.createHiIbernate(user);
		
		System.out.println("passed the create methos");
		
		List<User1> userList= dao.getAllUsersHibernate();
		
		System.out.println(userList);
		
		//assertEquals("Number of users should be 1 ", 1 , userList.size());
		
	//	assertTrue("user Should exist", dao.exists(user.getUserName()));
		
		//assertno
		
		//ass
		
	}


}
