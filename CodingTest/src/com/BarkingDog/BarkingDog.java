package com.BarkingDog;

public class BarkingDog {
	public static boolean shouldWakeUp(boolean barking,int hourofDay)
	{
		if((hourofDay<8||hourofDay>22)&&barking==true&&hourofDay>=0&&hourofDay<=23)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		System.out.println(shouldWakeUp(true,-1));
	}

}
