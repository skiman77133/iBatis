package com.alex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alex.mybatis.mapper.UserDAOImpl;
import com.alex.mybatis.model.User;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserDAOImpl userDAO;

	@Override
	public List<User> getAllUser() {
		return userDAO.selectByExample(null);
	}

	@Override
	public User getUser(Long id){
		return userDAO.selectByPrimaryKey(id);
	}

}
