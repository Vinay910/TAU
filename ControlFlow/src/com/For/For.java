package com.For;

public class For {
	
public static double calculateInterest(double amount,double interestRate)
{
	return(amount*(interestRate/100));
}

public static void main(String[] args)
{
	
	for(int i=2;i<=8;i++)
	{
		System.out.println((int)calculateInterest(10000,i));		
	}
}
}
