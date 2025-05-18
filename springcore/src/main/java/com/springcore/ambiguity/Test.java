package com.springcore.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ambiguity/ambiguity.xml");
		Student s = (Student)context.getBean("student1");
		System.out.println(s);
	}
}
