package com.arpit.webservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arpit.webservices.DAO.UserDao;
import com.arpit.webservices.POJO.User;

@RestController
public class UserService {
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
	public List<User> getAllUsers(){
		return userDao.getAllUsers();
	}
	
	@RequestMapping(value = "/getAllUsers/{id}")
	public User getUser(@PathVariable int id) {
		return userDao.getUser(id);
	}
	
	@RequestMapping(value = "/getAllUsers", method = RequestMethod.POST)
	public void createUser(@RequestBody User user) {
		User user1= 	userDao.saveUser(user);
	}
	

	@RequestMapping(value = "/getAllUsers/{id}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable int id) {
		userDao.deleteUser(id);
	}
}
