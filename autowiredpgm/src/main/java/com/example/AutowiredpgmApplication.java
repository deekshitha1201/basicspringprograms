package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.controller.pizzacontroller;

@SpringBootApplication
public class AutowiredpgmApplication {

	public static void main(String[] args) {
		ApplicationContext a= SpringApplication.run(AutowiredpgmApplication.class, args);
		pizzacontroller p=a.getBean(pizzacontroller.class);
		System.out.println(p.access());
	}

}
