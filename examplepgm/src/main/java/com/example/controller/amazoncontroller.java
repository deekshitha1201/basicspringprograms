package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.service.amazon;

@Component
public class amazoncontroller {
	
	private amazon ama;
@Autowired
	public void setAma(@Qualifier("product") amazon ama) {
		this.ama = ama;
	}

	public String get()
	{
		return ama.buy();	
	}

}
