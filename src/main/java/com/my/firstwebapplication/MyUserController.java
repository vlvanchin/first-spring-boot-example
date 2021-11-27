package com.my.firstwebapplication;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.my.firstwebapplication.model.User;
import com.my.firstwebapplication.service.MyUserService;

@RestController
@RequestMapping("/user")
public class MyUserController {

	private final MyUserService service = MyUserService.getInstance();	
	
	@GetMapping("/add")
	public Map<String, Object> addUser(@RequestParam String userId, @RequestParam String userName, @RequestParam String userMobileNo) {
		User user = new User();
		
		user.setUserId(userId);
		user.setUserName(userName);
		user.setUserMobileNo(userMobileNo);
		
		Map<String, User> responseData = service.addUser(user);
		Map<String, Object> response = new HashMap<String, Object>();
		
		response.put("Total Users", responseData);
		
		return response;
		
	}
	
}
