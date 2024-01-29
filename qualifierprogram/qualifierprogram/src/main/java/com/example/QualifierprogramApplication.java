package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.controller.pizzacontroller;

@SpringBootApplication
public class QualifierprogramApplication {

	public static void main(String[] args) {
		ApplicationContext c= SpringApplication.run(QualifierprogramApplication.class, args);
		pizzacontroller p=c.getBean(pizzacontroller.class);
		System.out.println(p.access());
	}

}
