package com.SharedDigit;

public class SharedDigit {
	
	public static boolean hasSharedDigit(int a,int b)
	{
			if(a>=10&&a<=99&&b>=10&&b<=99)
			{
				int a_1,a_2,b_1,b_2=0;
				a_1=a%10;
				a_2=a/10;
				b_1=b%10;
				b_2=b/10;
				if(a_1==b_1||a_1==b_2||a_2==b_1||a_2==b_2)
				{
					return true;
				}
				return false;
			}
			else
			{
				return false;
			}
	}

}
