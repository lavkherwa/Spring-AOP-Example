package com.example.aop.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class MyService {

	public String getDataFromMyService() {
		return UUID.randomUUID().toString();
	}

}
