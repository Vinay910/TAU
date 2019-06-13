package com.SecondsAndMinutes;

public class SecondsAndMinute {
	
	public static String getDurationString(int minutes,int seconds)
	{
		if(minutes>=0&&seconds>=0&&seconds<=59)
		{
			int h=minutes/60;
			int m=minutes%60;
			String hr=""+h,mn=""+m,sc=""+seconds;
			if(h<10)
			{
				hr="0"+h;
			}
			if(m<10)
			{
				mn="0"+m;
			}
			if(seconds<10)
			{
				sc="0"+seconds;
			}
			return hr+"h "+mn+"m "+sc+"s";	
		}
		else
		{
			return "Invalid Value";
		}
	}
	public static String getDurationString(int seconds)
	{
		if(seconds>=0)
		{
		 int m=seconds/60;
		int sec=seconds%60;
		return getDurationString(m,sec);
		}
		else
		{
			return "Invalid Value";
		}
		
	}

	public static void main(String []args)
	{
		System.out.println(getDurationString(3945));
		System.out.println(getDurationString(65,45));
	}
}

