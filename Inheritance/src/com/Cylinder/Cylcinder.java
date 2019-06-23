package com.Cylinder;

public class Cylcinder extends Circle{
	
	private double height;
	public Cylcinder(double radius,double height)
	{
		super(radius);
		if(height<0)
		{
			this.height=0;
		}
		else
		{
			this.height=height;	
		}
		
	}
	public double getHeight()
	{
		return height;
	}
	public double getVolume()
	{
		return getArea()*height;
	}

}
