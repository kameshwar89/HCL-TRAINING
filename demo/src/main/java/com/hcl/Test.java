package com.hcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Course course1 = context.getBean("course1", Course.class);
		Course course2 = context.getBean("course2", Course.class);
		Course course3 = context.getBean("course3", Course.class);
		CourseList courselist = new CourseList();

		courselist.insert(course1);
		courselist.insert(course2);
		courselist.insert(course3);
		courselist.revenue();
		((ClassPathXmlApplicationContext)context).close();
		
		
		
		
		
		
		
		
	}

}
