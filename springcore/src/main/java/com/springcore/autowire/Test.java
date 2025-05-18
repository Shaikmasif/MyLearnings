package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/autoconfig.xml");
		Emp e = (Emp)context.getBean("emp1");
		Address a = (Address)context.getBean("address");
		System.out.println(e);
		System.out.println(a);
	}

}
