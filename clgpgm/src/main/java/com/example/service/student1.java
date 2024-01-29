package com.example.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class student1 implements college {

	@Override
	public String result() {
		// TODO Auto-generated method stub
		return "i got pass";
	}

}
