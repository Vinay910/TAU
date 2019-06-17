package com.PerfectNumber;

public class PerfectNumber {
	
	public static boolean isPerfectNumber(int number)
	{
		int temp=0;
		if(number>=1)
		{
			for(int i=1;i<=number/2;i++)
			{
				if(number%i==0)
				{
					temp=temp+i;
				}
			}
			if(temp==number)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}

}
