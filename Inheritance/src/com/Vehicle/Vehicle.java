package com.Vehicle;

public class Vehicle {
	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getCurrentVelocity() {
		return currentVelocity;
	}

	public void setCurrentVelocity(int currentVelocity) {
		this.currentVelocity = currentVelocity;
	}

	public int getCurrentdirection() {
		return currentdirection;
	}

	public void setCurrentdirection(int currentdirection) {
		this.currentdirection = currentdirection;
	}
	private String size;
	private int currentVelocity;
	private int currentdirection;
	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;
		this.currentdirection=0;
		this.currentVelocity=0;
	}
	
	public void steer(int direction)
	{
		this.currentdirection+=direction;
		System.out.println("Vehical direction is "+currentdirection+" degrees");
	}
	public void move(int velocity,int direction)
	{
		this.currentVelocity=velocity;
		this.currentdirection=direction;
		System.out.println("Vehicle is moving at " +currentVelocity+" in "+this.currentdirection);
		
	}
	public void stop()
	{
		this.currentVelocity=0;
	}

}
