package com.spring.lw.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.lw.base.BaseJunit4Test;
import com.spring.lw.vo.User;

public class UserServiceTest extends BaseJunit4Test {
	@Autowired
	private IUserService userService ;
	
	@Test
	public void selectUser(){
		User user = userService.getUser(1);
		assertEquals(true, "admin".equals(user.getUsername()));
	}
}
