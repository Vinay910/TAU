package com.VipCustomer;

public class Main {

	public static void main(String[] args) {
	VipCustomer vp=new VipCustomer();
	System.out.println(vp.getName());
	System.out.println(vp.getEmail());
	System.out.println(vp.getCreditLimit());
	
	VipCustomer vp1=new VipCustomer(100,"a@A");
	System.out.println(vp1.getName());
	System.out.println(vp1.getEmail());
	System.out.println(vp1.getCreditLimit());

	VipCustomer vp2=new VipCustomer("Arzoo",100,"a@A");
	System.out.println(vp2.getName());
	System.out.println(vp2.getEmail());
	System.out.println(vp2.getCreditLimit());
	}

}
