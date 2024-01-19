package com.in28minutes.rest.webservices.restfulwebservices.User;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	private UserDaoService service;
	
	public UserResource (UserDaoService service) {
		this.service = service;
	}
	
	@GetMapping("/users")
	public List<User> RetrieveAllUsers(){
		return service.findAll();
	}

}
