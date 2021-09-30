package com.userdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.userdata.data.UserData;
import com.userdata.service.UserDataService;

@RestController
public class YourPageController {
	
	@Autowired
	@Qualifier("userDataService")
	private UserDataService userService;
	
	@RequestMapping(method=RequestMethod.POST, value ="/addUser")
	public UserData addUser(@RequestBody UserData userData) {
	boolean status = userService.updateUserData(userData);
	
	if(status)
	return userService.fetchUser(userData.getName());
	
	return null;
	}
	
	@RequestMapping("/fetchUser/{name}")
	public UserData fetchUser(@PathVariable String name) {
		return userService.fetchUser(name);
	}
}
