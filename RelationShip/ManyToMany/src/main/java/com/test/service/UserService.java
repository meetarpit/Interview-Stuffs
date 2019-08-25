package com.test.service;

import java.util.List;

import com.test.model.User;

public interface UserService {

	public void create(User user);
	public void update(User user);
	public void delete(User user);
	public User find(int id);
	public User edit(int id);
	public List<User> getAll();
}
