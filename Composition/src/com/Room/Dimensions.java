package com.Room;

public class Dimensions {
	
	private int width;
	private int height;
	public Dimensions(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public int getArea()
	{
		return width*height;
	}

}
