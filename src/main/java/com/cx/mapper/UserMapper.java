package com.cx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.cx.entity.Priv;
import com.cx.entity.User;

public interface UserMapper {

   @Insert("INSERT INTO tb_user(username, password) VALUES(#{username},#{password})")
   public int insertUser(@Param("username") String username, @Param("password")  String password);

/**
* 插入用户，并将主键设置到user中
* 注意：返回的是数据库影响条数，即1
*/
   public int insertUserWithBackId(User user);
   public int login(@Param("username")String username ,@Param("password")String password);
   public List<Priv> findUserPriv(@Param("userid") int username);
}

