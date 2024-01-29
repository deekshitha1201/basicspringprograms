package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class vegpizza implements pizza {

	@Override
	public String getpizza() {
		// TODO Auto-generated method stub
		return "by using qualifier annotation";
	}

}
