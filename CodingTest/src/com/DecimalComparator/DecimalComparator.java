package com.DecimalComparator;

public class DecimalComparator{
	   public static boolean areEqualByThreeDecimalPlaces(double one,double two)
		{
		    double scale = 1000;
			int round_one= (int)(one*scale);
			int round_two= (int)(two*scale);
			if(round_one==round_two)
			return true;
			else
			return false;
		}
}
	 
	