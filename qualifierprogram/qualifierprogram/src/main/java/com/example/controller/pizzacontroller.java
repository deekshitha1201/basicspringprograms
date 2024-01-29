package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.service.pizza;
@Component
public class pizzacontroller {
	private pizza pi;
    @Autowired
	public pizzacontroller(@Qualifier("vegpizza")  pizza pi) {
		super();
		this.pi = pi;
	}
	public String access()
	{
		return pi.getpizza();
	}

}
