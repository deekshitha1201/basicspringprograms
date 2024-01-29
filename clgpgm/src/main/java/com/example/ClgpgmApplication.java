package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.controller.university;

@SpringBootApplication
public class ClgpgmApplication {

	public static void main(String[] args) {
		ApplicationContext a= SpringApplication.run(ClgpgmApplication.class, args);
		university v=a.getBean(university.class);
		System.out.println(v.exam());
	}

}
