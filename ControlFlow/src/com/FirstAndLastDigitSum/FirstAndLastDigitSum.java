package com.FirstAndLastDigitSum;

public class FirstAndLastDigitSum {
	
	    
	    public static int sumFirstAndLastDigit(int number)
		{
			if(number>=0)
			{
				if(number<10)
				{
					return number+number;
				}
				int first=0,last=0,temp=0,count=0;
				while(number>0)
				{
				    if(count<1)
				    {
					temp=number%10;
					count++;
				    }
				    if(count>1)
				    {
				       last=number%10;
				    }
					number=number/10;
				    
					if(number<10)
					{
						first=number;
						break;
					}
				}
				return temp+first;
			}
			else
			{
				return -1;
			}
			
		}
	    
	
	public static void main(String[] args)
	{
		System.out.println(sumFirstAndLastDigit(11));
	}
	}
	


