package com.spring.lw.dao;

import com.spring.lw.vo.User;

public interface IUserDao {
	User getUser(int id);

    int insertUser(User user);
    
    int updateUser(User user);
    
    int deleteUser(int id);
}
