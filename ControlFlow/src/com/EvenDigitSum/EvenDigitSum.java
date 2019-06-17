package com.EvenDigitSum;

public class EvenDigitSum {
	public static int getEvenDigitSum(int number)
	{
		int sum=0,temp=0;
		if(number>=0)
		{
			while(number>0)
			{
			temp=number%10;
			number=number/10;
			if(temp%2==0)
			{
				sum=sum+temp;
			}
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
		System.out.println(getEvenDigitSum(123456));
	}

}