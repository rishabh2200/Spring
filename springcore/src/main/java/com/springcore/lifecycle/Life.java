package com.springcore.lifecycle;

import javax.management.loading.PrivateClassLoader;

public class Life {
	private String bansal;

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
