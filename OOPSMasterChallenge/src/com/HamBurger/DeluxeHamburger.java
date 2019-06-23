package com.HamBurger;

public class DeluxeHamburger extends HamBurger {
	
	private int coke;
	private int chips;
	private double price;
	public DeluxeHamburger(String breadRollType, String meat, double basePrice, String name) 
	{
		super(breadRollType, meat, basePrice, name);
		this.coke = 1;
		this.chips = 1;
	}
	private double getBaseprice()
	{
		price=super.additionPrice();
		return price;
	}
	public double additionPrice()
	{
		price=getBaseprice();
		if(coke>0)
		{
			price=price+1;
		}
		if(chips>0)
		{
			price=price+1;
		}
		return price;
	}
}
