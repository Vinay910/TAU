package com.Car;

public class Discovery extends Car
{
	private boolean engineState;
	public Discovery()
	{
		super("Black", "XX96",4);
	}
	
	public boolean startEngine()
	{
		engineState=true;
		System.out.println("Discovery Engine Started");
		return engineState;
		
	}
	public boolean stopEngine()
	{
		engineState=false;
		System.out.println("Discovery Engine Stoping");
		return engineState;
		
	}
	public void accelarate()
	{
		System.out.println("Discovery is accelarating");
	}
	public void brake()
	{
		System.out.println("Discovery is de-accelarating");
	}
	
}
