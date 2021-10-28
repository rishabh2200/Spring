package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Student {
	@Value("Rishabh")
	private String bansal;

	public String getBansal() {
		return bansal;
	}

	public void setBansal(String bansal) {
		this.bansal = bansal;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [bansal=" + bansal + "]";
	}
	
}
