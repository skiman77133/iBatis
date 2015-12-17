package com.alex.service;

import java.util.List;

import com.alex.mybatis.model.User;

public interface IUserService {
	
	public List<User> getAllUser();
	
	public User getUser(Long id);

}
