package com.MinuterstoYearCalc;

public class MinutesToYearsAndDays {
	
	public static void printyearsAndDays(long minutes)
	{
		if(minutes>=0)
		{
			int yr=(int) minutes/525600;
			int remmin=(int) minutes%525600;
			int days=remmin/1440;
			System.out.println(minutes+" min= "+yr+" y and "+days+" d");
			
		}
		else
		{
			System.out.println("Invalid Value");
		}
	}
	public static void main(String[] args)
	{
		printyearsAndDays(561600);
	}

}