package com.PoolArea;

public class Rectangle {
	
	private double width,length;
	public Rectangle(double width,double length)
	{
		if(width<0)
		{
			this.width=0;
		}
		else
		{
			this.width=width;
		}
		if(length<0)
		{
			this.length=0;
		}
		else
		{
			this.length=length;
		}
	}
	public double getWidth()
	{
		return width;
	}
	public double getlength()
	{
		return length;
	}
	public double getArea()
	{
		return width*length;
	}

}
