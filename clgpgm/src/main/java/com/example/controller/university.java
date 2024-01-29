package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.service.college;
@Component
public class university {
	private college clg;
    @Autowired
	public university(college clg) {
		super();
		this.clg = clg;
	}
	public String exam()
	{
		return clg.result();
	}

}
