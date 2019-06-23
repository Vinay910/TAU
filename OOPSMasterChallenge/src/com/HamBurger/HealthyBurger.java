package com.HamBurger;

public class HealthyBurger extends HamBurger{
	
	private int kiwi;
	private int pineapple;
	private double price;
	public HealthyBurger(String meat, double basePrice, String name, int kiwi, int pineapple) {
		super("Brown Bread",meat, basePrice, name);
		this.kiwi = kiwi;
		this.pineapple = pineapple;
	}
	private double getBaseprice()
	{
		price=super.additionPrice();
		return price;
	}
	public double additionPrice()
	{
		price=getBaseprice();
		if(pineapple>0)
		{
			price=price+pineapple;
		}
		if(kiwi>0)
		{
			price=price+kiwi;
		}
		return price;
	}
	
 
}

