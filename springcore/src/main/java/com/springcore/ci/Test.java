package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
 public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
	Certificate c = (Certificate)context.getBean("certificate1");
	System.out.println(c);
	Student s = (Student)context.getBean("student1");
	System.out.println(s);
}
}
