package com.in28minutes.rest.webservices.restfulwebservices.versionning;


public class PersonV1 {
	
	private String name;

	public PersonV1(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	
	
	

}
