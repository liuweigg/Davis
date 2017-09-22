package com.spring.lw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.lw.dao.IUserDao;
import com.spring.lw.service.IUserService;
import com.spring.lw.vo.User;

@Service("userServiceImpl")
public class UserServiceImpl implements IUserService {

	@Autowired
    private IUserDao userDao;
	
	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return userDao.getUser(id);
	}

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userDao.insertUser(user);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}

	@Override
	public int deleteUser(int id) {
		// TODO Auto-generated method stub
		return userDao.deleteUser(id);
	}

}
