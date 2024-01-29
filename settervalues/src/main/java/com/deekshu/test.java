package com.deekshu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("bean.xml");
	}

}
