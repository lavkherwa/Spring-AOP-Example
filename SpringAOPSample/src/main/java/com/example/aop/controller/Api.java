package com.example.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.aop.resource.Resource;

@RestController
@RequestMapping("/api")
public class Api {

	@Autowired
	Resource resource;

	@GetMapping
	public String getResource(@RequestParam String input) {
		return resource.readResource(input);
	}

}
