package com.ReadNumber;
import java.util.Scanner;
public class ReadNumber {
	
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			System.out.print("Enter number # "+i+"  ");
			boolean flag =s.hasNextInt();
			if(flag)
			{
				int a=s.nextInt();
				sum=sum+a;
			}
		else
			{
			System.out.println("Invalid Value");
			}
		}
		System.out.println("Sum is "+sum);
		s.close();
	}

}