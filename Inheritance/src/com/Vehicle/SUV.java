package com.Vehicle;

public class SUV extends Car {
	
	private int roadService;

	public SUV(int currentgear,
			int roadService) {
		super("SUV", "4X4", 4, 4, 4, false, currentgear);
		this.roadService = roadService;
	}
	
	public void accelerate(int rate)
	{
		int newVelocity=getCurrentVelocity()+rate;	
		if(newVelocity==0)
		{
			stop();
		}
		else if(newVelocity>0&&newVelocity<=10)
		{
			setCurrentgear(1);
		}
		else if(newVelocity>10&&newVelocity<=20)
		{
			setCurrentgear(2);
		}
		else if(newVelocity>20&&newVelocity<=30)
		{
			setCurrentgear(3);
		}
		else
		{
			setCurrentgear(4);
		}
		if(newVelocity>0)
		{
			changeVelocity(newVelocity, getCurrentdirection());
			
		}
	}
	
	
	
}
