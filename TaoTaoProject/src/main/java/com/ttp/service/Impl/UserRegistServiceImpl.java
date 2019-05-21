package com.ttp.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttp.dao.UserRegistDao;
import com.ttp.service.UserRegistService;
@Service
public class UserRegistServiceImpl implements UserRegistService{
	@Autowired
	private UserRegistDao dao;
	public void userRegist(String tel,String name,String password) {
		dao.userRegist(tel, name, password);
	}
	
}
