package com.SumDigit;

public class SumDigit {
	public static int sumDigits(int number)
	{
		
		if(number>=10)
		{
			int sum=0;
			while(number>=1)
			{
			sum=sum+number%10;
			number=number/10;
			}
			return sum;
		}	
		else
		{
			return -1;
		}
	}
	public static void main(String[] args)
	{
		System.out.println(sumDigits(-127875));
	}

}
