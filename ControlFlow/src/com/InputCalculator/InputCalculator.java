package com.InputCalculator;
import java.util.Scanner;

public class InputCalculator {
	
	public static void inputThenPrintSumAndAverage()
	{
		Scanner s=new Scanner(System.in);
		int x=0,y=0,count=0;
		boolean flag=true;
		while(flag)
		{
			flag=s.hasNextInt();
			if(flag==false)
			{
				break;
			}
			int a=s.nextInt();
			x=x+a;
			count++;
		}
		double result=(double)x/(double)count;
		y=(int) Math.round(result);
		System.out.println("SUM = "+x+" AVG = "+y);
		s.close();
	}
	
	public static void main(String[] args)
	{
		inputThenPrintSumAndAverage();
	}

}