package com.settermethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext a1=new ClassPathXmlApplicationContext("bean.xml");
		amazon m=a1.getBean("amazon", amazon.class);
		System.out.println(m.dopayment());
	}

}
