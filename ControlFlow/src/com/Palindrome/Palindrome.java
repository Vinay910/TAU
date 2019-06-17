package com.Palindrome;

public class Palindrome {
	
	public static boolean isPalindrome(int number)
	{
		number=Math.abs(number);
		int reverse=0,last=0,temp=number;
		
		while(number>0)
		{
			last=number%10;
			reverse=reverse*10;
			reverse=reverse+last;
			number=number/10;
		}
		if(temp==reverse)
		{
			return true;
		}
		return false;
	}

	
	public static void main(String[] args)
	{
		isPalindrome(12121);
	}

}
