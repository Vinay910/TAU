package com.GretestCommonDivisor;

public class GretestCommonDivisor {
	
	public static int getGreatestCommonDivisor(int first, int second)
	{
		int min,max,divisor = 0;
		if(first<10||second<10)
		{
			return -1;
		}
		else
		{
			if(first>=second)
			{
				min=second;
				max=first;
			}
			else
			{
				min=first;
				max=second;
			}
			for(int i=1;i<=min;i++)
			{
				if(min%i==0)
				{
					if(max%i==0)
					{
						divisor=i;
					}
				}
			}
			return divisor;
		}
	}
	public static void main(String[] args)
	{
		System.out.println(getGreatestCommonDivisor(10, 20));
	}

}