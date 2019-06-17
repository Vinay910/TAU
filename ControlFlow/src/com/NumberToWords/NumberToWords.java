package com.NumberToWords;

public class NumberToWords {
    
	public static void numberToWords(int number1)
	{
		
		int number=reverse(number1);
		int digit_temp=getDigitCount(number);
		int digit_num=getDigitCount(number1);
		int diff=digit_num-digit_temp;
		if(diff>0)
		{
			for(int i=1;i<=diff;i++)
			{
				System.out.println("Zero");
			}
		}
		
		if(number>=0)
		{
			while(number>0)
			{
			int digit=number%10;
			number=number/10;
			switch(digit)
			{
				case 0:
				System.out.println("Zero");
				break;
				case 1:
				System.out.println("One");
				break;
				case 2:
				System.out.println("Two");
				break;
				case 3:
				System.out.println("Three");
				break;
				case 4:
				System.out.println("Four");
				break;
				case 5:
				System.out.println("Five");
				break;
				case 6:
				System.out.println("Six");
				break;
				case 7:
				System.out.println("Seven");
				break;
				case 8:
				System.out.println("Eight");
				break;
				case 9:
				System.out.println("Nine");
				break;
			}
			}
		}
		else
		{
			System.out.println("Invalid Value");
		}
	}
	public static int reverse(int number)
	{
		
		int temp=0,last=0;
		if(Math.abs(number)<=9)
		{
		    return number;
		}
		else
		{
		while(number!=0)
		{
			last=number%10;//2
			temp=temp*10+last;
			number=number/10;
		}
		return temp;
		}
	}
	public static int getDigitCount(int number)
	{
	 int temp=0;
	    if(number==0)
	    {
	        return 1;
	    }
	    if(number>0)
	    {
		while(number>0)
		{
			number=number/10;
			temp++;
		}
		return temp;
	    }
	    else
	    {
	        return -1;
	    }
	  }
	public static void main(String[] args)
	{
		getDigitCount(-222);
	}

}