package com.example.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.aop.resource.Resource;
import com.example.aop.service.MyService;

@RestController
@RequestMapping("/api")
public class Api {

	@Autowired
	Resource resource;

	@Autowired
	MyService myService;

	@GetMapping("/resource")
	public String getResource(@RequestParam String input) {
		return resource.readResource(input);
	}

	@GetMapping("/service")
	public String getDataFromMyService() {
		return myService.getDataFromMyService();
	}

}
