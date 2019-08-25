package com.test.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.UserDao;
import com.test.model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public Session currentSession() {
		return sessionFactory.getCurrentSession();
		
	}

	public void create(User user) {
		// TODO Auto-generated method stub
		currentSession().save(user);		
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		currentSession().update(user);
	}

	public void delete(User user) {
		// TODO Auto-generated method stub
		currentSession().delete(user);
	}

	public User find(int id) {
		// TODO Auto-generated method stub
		return (User) currentSession().get(User.class, id);
	}

	public User edit(int id) {
		// TODO Auto-generated method stub
		return find(id);
	}

	@SuppressWarnings("unchecked")
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return currentSession().createCriteria(User.class).list();
	}

}
