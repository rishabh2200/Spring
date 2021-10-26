package com.springcore.refrence;

public class A {
	private String lastName;
	private B b;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [lastName=" + lastName + ", b=" + b.getName() + "]";
	}
	
}
