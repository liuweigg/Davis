package com.spring.lw.service;

import com.spring.lw.vo.User;

public interface IUserService {
	User getUser(int id);

    int insertUser(User user);
    
    int updateUser(User user);
    
    int deleteUser(int id);
}
