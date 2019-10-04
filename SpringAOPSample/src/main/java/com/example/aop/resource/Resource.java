package com.example.aop.resource;

import org.springframework.stereotype.Component;

import com.example.aop.annotations.Loggable;

@Component
public class Resource {

	@Loggable
	public String readResource(String input) {
		return "final response for given input " + input;
	}

}
