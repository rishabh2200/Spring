package com.springcore.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.JavaConfig")
public class JavaConfig {
	public Student getStudent() {
		Student student = new Student();
		return student;
	}
}
