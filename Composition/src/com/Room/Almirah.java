package com.Room;

public class Almirah {
	
	private String color;
	private Door door;
	private Dimensions dimensions;
	public Almirah(String color, Door door, Dimensions dimensions) {
		this.color = color;
		this.door = door;
		this.dimensions = dimensions;
	}
	public String getColor() {
		return color;
	}
	public Door getDoor() {
		return door;
	}
	public double getDimensions() {
		return dimensions.getArea();
	}
	
	

}
