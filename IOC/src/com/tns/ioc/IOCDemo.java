package com.tns.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCDemo {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext con=new ClassPathXmlApplicationContext();
		Phone p1=con.getBean("phone",Phone.class);
		
		p1.calling();
		p1.internet();
	}
}
