package com.PlayingCat;

public class PlayingCat {
	public static boolean isCatPlaying(boolean summer,int temprature)
	{
		if(!summer&&(temprature>=25&&temprature<=35))
		{
			return true;
		}
		else if(summer&&(temprature>=25&&temprature<=45))
		{
			return true;
		}	
		else
		{
			return false;
		}	
	}

}