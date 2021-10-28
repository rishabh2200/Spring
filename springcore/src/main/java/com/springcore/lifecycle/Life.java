package com.springcore.lifecycle;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Life {
	
	@Value("#{10+3}")
	private Integer bansal;

	@Override
	public String toString() {
		return "Life [bansal=" + bansal + "]";
	}

	public String getBansal() {
		return bansal;
	}

	public void setBansal(String bansal) {
		System.out.println("setter function");
		this.bansal = bansal;
	}
	public void init() {
		System.out.println("intialise");
	}
	public void destroy() {
		System.out.println("destroy");
	}
}
