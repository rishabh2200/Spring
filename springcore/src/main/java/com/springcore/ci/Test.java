package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.refrence.A;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ci_config.xml");
		System.out.println("qwert");
		Person q=(Person)context.getBean("person");
		System.out.println(q);
	}
}
