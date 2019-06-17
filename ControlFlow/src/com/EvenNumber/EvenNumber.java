package com.EvenNumber;

public class EvenNumber {
	
	public static boolean isEvenNumber(int a)
	{
		if(a%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		int start=4;
		int end=20;
		int sum=0,count=0;
		while(start<=end)
		{
			
			if(isEvenNumber(start))
			{
				System.out.println(start);
				sum=sum+start;
				count++;
				if(count==5)
				{
					break;
				}
			}
			start++;
		}
		System.out.println("Sum is "+sum);
	}

}