package com.SpeedConverter;

public class SpeedConvertor {
	public static long toMilesPerHour(double kilometersPerHour)
	{
		if(kilometersPerHour>0)
		{
		return Math.round(kilometersPerHour/1.609);
		}
		else
		{
			return -1;
		}
	}
	public static void printConversion(double kilometersPerHour)
	{
		if(kilometersPerHour>=0)
		{
		int miles=(int) Math.round(kilometersPerHour/1.609);
		System.out.println(kilometersPerHour+" km/h = "+miles+" mi/h");
		}
		else
		{
			System.out.println("Invalid Value");
		}
	}
	public static void main(String []args)
	{
		System.out.println(toMilesPerHour(1.5));	
	}

}
