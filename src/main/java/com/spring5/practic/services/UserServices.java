package com.spring5.practic.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring5.practic.model.User;


@Service
public class UserServices {

	private static List<User> users = new ArrayList<User>();
	
	public User creatUser(String name) {
		var user = new User();
		user.setName(name);
		users.add(user);
		return user;
	}
	
	public void removeUserByName(String name) {

		Iterator<User> iterator = users.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getName().equals(name)) {
				iterator.remove();
			}
		}
	}
	
	public void showAll() {
		users.forEach(System.out::print);
	}
	
}
