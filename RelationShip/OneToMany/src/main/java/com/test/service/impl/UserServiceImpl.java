package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.UserDao;
import com.test.model.User;
import com.test.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;

	public void create(User user) {
		// TODO Auto-generated method stub
		userDao.create(user);
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		userDao.update(user);
	}

	public void delete(User user) {
		// TODO Auto-generated method stub
	userDao.delete(user);	
	}

	public User find(int id) {
		// TODO Auto-generated method stub
		return userDao.find(id);
	}

	public User edit(int id) {
		// TODO Auto-generated method stub
		return userDao.edit(id);
	}

	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

}
