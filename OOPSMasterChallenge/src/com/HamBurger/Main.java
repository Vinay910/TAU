package com.HamBurger;

public class Main {
	
	public static void main(String args[])
	{
		DeluxeHamburger db=new DeluxeHamburger("Oregano", "Chicken", 20, "Deluxe");
		System.out.println(db.additionPrice());
		HealthyBurger hb=new HealthyBurger("Fish", 10, "Health", 3,4);
		System.out.println(hb.additionPrice());
		HamBurger bb=new HamBurger("White", "Pork", 2, "Oridinary");
		bb.setCarrot(4);
		bb.setLettuce(1);
		bb.setPotato(1);
		bb.setTomato(1);
		System.out.println(bb.additionPrice());
	}
	
	

}
