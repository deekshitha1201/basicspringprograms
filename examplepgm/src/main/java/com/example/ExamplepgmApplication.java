package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.controller.amazoncontroller;

@SpringBootApplication
public class ExamplepgmApplication {

	public static void main(String[] args) {
		ApplicationContext c= SpringApplication.run(ExamplepgmApplication.class, args);
		amazoncontroller a=c.getBean(amazoncontroller.class);
		System.out.println(a.get());
	}

}
