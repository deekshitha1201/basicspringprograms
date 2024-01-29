package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class nonvegpizza implements pizza {

	@Override
	public String getpizza() {
		// TODO Auto-generated method stub
		return "i want nonvegpizza";
	}

}
