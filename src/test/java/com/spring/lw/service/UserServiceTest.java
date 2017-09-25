package com.spring.lw.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.lw.base.BaseJunit4Test;
import com.spring.lw.vo.User;


public class UserServiceTest extends BaseJunit4Test {
	private static Logger logger = LoggerFactory.getLogger(UserServiceTest.class);
	
	@Autowired
	private IUserService userService ;
	
	@Test
	public void selectUser(){
		User user = userService.getUser(1);
		
		logger.info("User Message is : " + user.toString());
		assertEquals(true, "admin".equals(user.getUsername()));
	}
}
