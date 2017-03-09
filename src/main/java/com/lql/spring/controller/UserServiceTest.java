package com.lql.spring.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lql.spring.entity.User;
import com.lql.spring.service.UserService;

/*@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration({"classpath*:/META-INF/spring-context*.xml"})  */
public class UserServiceTest {
	@Autowired
	private UserService userService;

	@Test
	public void testAddUser() {

		User user = new User("qq", "ll", "123");
		userService.addUser(user);

		/*
		 * ClassPathXmlApplicationContext context = new
		 * ClassPathXmlApplicationContext(
		 * "/META-INF/spring-context-hibernate.xml");
		 * 
		 * context.start();
		 * 
		 * SessionFactory sessionFactory = (SessionFactory)
		 * context.getBean("sessionFactory");
		 * System.out.println(sessionFactory.getCurrentSession());
		 */
	}

}
