package com.LastDigitChecker;

public class LastDigitChecker {
	
	public static boolean hasSameLastDigit(int a,int b,int c)
	{
		if(a>=10&&a<=1000&&b>=10&&b<=1000&&c>=10&&c<=1000)
		{
			int a_l,b_l,c_l;
			a_l=a%10;
			b_l=b%10;
			c_l=c%10;
			if(a_l==b_l||b_l==c_l||c_l==a_l)
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
	public static boolean isValid(int a)
	{
		if(a>=10&&a<=1000)
		{
			return true;
		}
		return false;
	}

}
