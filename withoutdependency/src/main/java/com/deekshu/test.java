package com.deekshu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
		amazon m=a.getBean("ama", amazon.class);
		System.out.println(m.pay());
	}

}
