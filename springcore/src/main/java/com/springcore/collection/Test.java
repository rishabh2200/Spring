package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.springcore.Student;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context =
       		 new ClassPathXmlApplicationContext("com/springcore/collection/collectionConfig.xml");
		System.out.println("bansal");
		Employee st = (Employee)context.getBean("Employee");
		System.out.println(st);
		System.out.println(st.getPhone().getClass().getName());
	}
}
