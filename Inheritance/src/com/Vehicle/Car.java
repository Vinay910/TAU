package com.Vehicle;

public class Car extends Vehicle {

	private int wheels;
	private int doors;
	private int gear;
	private boolean isManual;
	private int currentgear;
	public Car(String name, String size, int wheels, int doors, int gear, boolean isManual, int currentgear) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gear = gear;
		this.isManual = isManual;
		this.currentgear = 1;
	}
	public void setCurrentgear(int currentgear) {
		this.currentgear = currentgear;
		System.out.println("Current gear is " +this.currentgear);
	}
	
	public void changeVelocity(int speed,int direction)
	{
		move(speed,direction);
		System.out.println("Car velocity is "+speed+" in "+direction);
	}
	

}
