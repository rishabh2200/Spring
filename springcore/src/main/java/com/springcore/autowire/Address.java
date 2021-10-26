package com.springcore.autowire;

public class Address {
	private String houseNo;
	private String street;
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + "]";
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
