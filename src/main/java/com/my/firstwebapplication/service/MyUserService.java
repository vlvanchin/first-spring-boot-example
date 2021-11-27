package com.my.firstwebapplication.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.my.firstwebapplication.model.User;

public class MyUserService {

	public static MyUserService getInstance() {
		return new MyUserService();
	}

	public Map<String, User> addUser(User user) {
		Objects.nonNull(user.getUserId());
		STORAGE_MAP.put(user.getUserId(), user);
		return STORAGE_MAP;
	}
	
	private static Map<String, User> STORAGE_MAP = new HashMap<String, User>();
}
