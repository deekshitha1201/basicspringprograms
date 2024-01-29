package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.service.vegpizza;

@Component
public class pizzacontroller {
	private vegpizza veg;
    @Autowired
	public pizzacontroller(vegpizza veg) {
		super();
		this.veg = veg;
	}
	public String access()
	{
		return veg.veg();
	}

}
