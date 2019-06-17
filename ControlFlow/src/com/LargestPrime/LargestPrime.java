package com.LargestPrime;

public class LargestPrime {
	public static int getLargestPrime(int number)
	{
		if(number>1)
		{
			int i=0;
			int copyOfInput=number;
				for (i = 2; i <= copyOfInput; i++) 
				{
					if (copyOfInput % i == 0)
						{ 
						copyOfInput /= i; 
						i--; 
						} 
					}

				return i;
		}
		else
		{
			return -1;
		}
		
		}
		
	public static void main(String[] args)
	{
		System.out.println(getLargestPrime(45));
	}

}

