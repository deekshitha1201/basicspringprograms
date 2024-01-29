package com.collegeapplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
		university u=a.getBean("uv",university.class );
		System.out.println(u.pass());
	}

}
