package com.MinMax;

import java.util.Scanner;

public class MinMax {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			System.out.println("Enter 1st number: ");
			flag=s.hasNextInt
					();
			if(flag==false)
			{
				System.out.println("Invalid Value");
				break;
			}
			int a=s.nextInt();
			flag=s.hasNext();
			if(flag==false)
			{
				System.out.println("Invalid Value");
				break;
			}
			System.out.println("Enter 2nd number: ");
			int b=s.nextInt();
			if(a>b)
			{
				System.out.println(a+ " is the big number");
				System.out.println(b+ " is the small number");
			}
			else if(a<b)
			{
				System.out.println(b+ " is the big number");
				System.out.println(a+ " is the small number");
			}
			else
			{
				System.out.println("A and B are equal");
			}
		}
		
	}

}
