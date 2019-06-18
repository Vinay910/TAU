package com.VipCustomer;

public class VipCustomer {

	private String name;
	private int creditLimit;
	private String email;
	public String getName() {
		return name;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	public String getEmail() {
		return email;
	}
	public VipCustomer(String name, int creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	public VipCustomer(int creditLimit, String email) {
		this("Vinayak",creditLimit,email);
	}
	public VipCustomer() {
		this("Vinayak",100000,"v@v.com");
	}
	
}
