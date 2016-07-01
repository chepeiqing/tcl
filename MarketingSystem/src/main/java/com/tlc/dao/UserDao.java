package com.tlc.dao;

import com.tlc.domain.User;

public interface UserDao {
	 
    /**
     * @param userId
     * @return User
     */
    public User selectUserById(Integer userId);  
 
}
