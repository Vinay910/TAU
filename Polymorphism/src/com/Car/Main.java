package com.Car;

public class Main
{
	public static void main(String args[])
{
	Thar th=new Thar();
	th.accelarate();
	th.brake();
	Car car=new Car("Black","Normal",1);
	car.accelarate();
	car.brake();
	Car carw=new Thar();
	carw.accelarate();
	th.lol2();
	Thar th1=(Thar) new Car("A", "A", 1);
}
}
