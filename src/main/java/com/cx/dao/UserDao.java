package com.cx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cx.entity.Priv;
import com.cx.entity.User;
import com.cx.mapper.UserMapper;

@Repository
public class UserDao {
    
    @Autowired
    private UserMapper userMapper;
    
    public int insertUser(String username, String password){
        return userMapper.insertUser(username, password);
    }
    
    public int insertUserWithBackId(User user){    
        return userMapper.insertUserWithBackId(user);
    }
    
    public int login(String username, String password){
    	return userMapper.login(username,  password);
    }

	public List<Priv> priv(String username) {
		return userMapper.findUserPriv(username);
	}
    
}