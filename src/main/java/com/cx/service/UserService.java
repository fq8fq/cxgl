package com.cx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cx.dao.UserDao;
import com.cx.entity.Priv;
import com.cx.entity.User;

@Service
public class UserService {
    
    @Autowired
    private UserDao userDao;
    
    public boolean addUser(String username, String password){
        return userDao.insertUser(username, password)==1?true:false;
    }
    
    public User addUserWithBackId(String username, String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userDao.insertUserWithBackId(user);//该方法后，主键已经设置到user中了
        return user;
    }
    
    public boolean login(String username,String password){
    	int ret =  userDao.login(username,password);
    	if(ret==1){
    		return true;
    	}else{
    		return false;
    	}
    }

	public List<Priv> priv(String username) {
		return userDao.priv(username);
		 
	}
    
}