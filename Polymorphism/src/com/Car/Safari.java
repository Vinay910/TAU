package com.Car;

public class Safari extends Car
{
	
	private boolean engineState;;
	public Safari()
	{
		super("Black", "Safari",4);
	}
	
	public boolean startEngine()
	{
		engineState=true;
		System.out.println("Safari Engine Started");
		return engineState;
		
	}
	public boolean stopEngine()
	{
		engineState=false;
		System.out.println("Safari Engine Stoping");
		return engineState;
		
	}
	public void accelarate()
	{
		System.out.println("Safari is accelarating");
	}
	public void brake()
	{
		System.out.println("Safari is de-accelarating");
	}
	
}
