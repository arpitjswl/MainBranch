package com.arpit.webservices.DAO;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.arpit.webservices.POJO.User;

@Component
public class UserDao {
	private static List<User> list = new ArrayList<>();	
	private static int count = 3;
	static {
		list.add(new User(101, "Arpit", new Date()));
		list.add(new User(102, "Anuj", new Date()));
		list.add(new User(103, "Anshul", new Date()));
	}
	
	public List<User> getAllUsers(){
		return list;
	}
	
	
	public User saveUser(User user) {
		
		if (user.getId() == null) {
			user.setId(++count);
			list.add(user);
		}
		else {
			list.add(user);
		}
		
		return user;
	}
	

	
	public User getUser(int id) {
		
		Iterator<User> itr = list.iterator();
		
		while (itr.hasNext()) {
			User user = itr.next();
			if  (user.getId().equals(id)) 
				return user;
		}
		return null;
	}

	public void deleteUser(int id) {
		Iterator<User> itr = list.iterator();
		
		while (itr.hasNext()) {
			User user = itr.next();
			if  (user.getId().equals(id)) {
				itr.remove();
			}
				//return user;
		}
		
	}
	
}
	

