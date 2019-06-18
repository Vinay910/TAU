package com.PaintJob;

public class PaintJob {
	
	public static int getBucketCount(double width,double height, double arePerBucket, int extrabucket)
	{
		if(width>0&&height>0&&arePerBucket>0&&extrabucket>=0)
		{
			int count=1;
			double calc;
			boolean flag=true;
			double wall_area=width*height;
			while(flag)
			{
				calc=arePerBucket*count;
				if(calc>wall_area)
				{
					return count-extrabucket;
				}
				count++;
			}
		}
		else
		{
			return -1;
		}
		return extrabucket;
	}
	public static int getBucketCount(double width,double height, double arePerBucket)
	{
		if(width>0&&height>0&&arePerBucket>0)
		{
			int count=1;
			double calc;
			boolean flag=true;
			double wall_area=width*height;
			while(flag)
			{
				calc=arePerBucket*count;
				if(calc>wall_area)
				{
					return (int)count;
				}
				count++;
			}
		}
		else
		{
			return -1;
		}
		return 0;
	}
	public static int getBucketCount(double area,double arePerBucket)
	{
		if(area>0&&arePerBucket>0)
		{
			int count=1;
			double calc;
			boolean flag=true;
			while(flag)
			{
				calc=arePerBucket*count;
				if(calc>area)
				{
					return (int) count;
				}
				count++;
			}
		}
		else
		{
			return -1;
		}
		return 0;
	}
}
