package com.Car;

public class Car {
	
	private int wheels;
	private int doors;
	private String color;
	private String modal;
	private int cylinder;
	private boolean engine;
	public Car(String color,String modal,int cylinder)
	{
		engine=true;
		this.wheels=4;
		this.color=color;
		this.doors=4;
		this.modal=modal;
		this.cylinder=cylinder;
	}
	
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setModal(String modal) {
		this.modal = modal;
	}

	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}

	public void setEngine(boolean engine) {
		this.engine = engine;
	}

	public int getWheels() {
		return wheels;
	}
	public int getDoors() {
		return doors;
	}
	public String getColor() {
		return color;
	}
	public String getModal() {
		return modal;
	}
	public int getCylinder() {
		return cylinder;
	}
	public boolean isEngine() {
		return engine;
	}
	public boolean startEngine()
	{
		engine=true;
		System.out.println("Car Engine Started");
		return engine;
		
	}
	public boolean stopEngine()
	{
		engine=false;
		System.out.println("Car Engine Stoping");
		return engine;
		
	}
	public void accelarate()
	{
		System.out.println("Car is accelarating");
	}
	public void brake()
	{
		System.out.println("Car is de-accelarating");
	}
	private void lol()
	{
		
	}
	public void lol2()
	{
		
	}
}	

