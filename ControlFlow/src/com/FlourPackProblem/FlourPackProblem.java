package com.FlourPackProblem;

public class FlourPackProblem {
	
	public static boolean canPack(int bigCount,int smallCount,int goal)
	{
		
		if(bigCount>=0&&smallCount>=0&&goal>=0)
		{
			int count=0;
			while(count<=bigCount)
			{
				int temp=count*5;
				for(int i=0;i<=smallCount;i++)
				{
				if(temp+i==goal)
				{
					return true;
				}
				}
				count++;
			}
			return false;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		System.out.println(canPack(0, 5	, 4));
	}

}
