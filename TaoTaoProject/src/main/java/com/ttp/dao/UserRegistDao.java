package com.ttp.dao;

import org.apache.ibatis.annotations.Param;

public interface UserRegistDao {
	//用户注册
	public void userRegist(@Param("tel")String tel,@Param("name")String name,@Param("password")String password);
}
