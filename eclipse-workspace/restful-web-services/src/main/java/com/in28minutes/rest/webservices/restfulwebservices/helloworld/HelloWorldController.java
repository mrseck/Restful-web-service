package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//REST API
@RestController
public class HelloWorldController {
	
	//@RequestMapping(method = RequestMethod.GET, path= "/hello-world")
	@GetMapping(path="/hello-world")
	public String HelloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean HelloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	

}
