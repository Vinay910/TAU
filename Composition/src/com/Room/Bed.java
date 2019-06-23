package com.Room;

public class Bed {
	
	private String color;
	private Dimensions dimensions;
	public Bed(String color, Dimensions dimensions) {
		super();
		this.color = color;
		this.dimensions = dimensions;
	}
	
	public double getDimensions()
	{
		return dimensions.getArea();
	}

}
