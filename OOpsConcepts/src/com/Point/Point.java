package com.Point;

public class Point {

	public Point() {

	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double distance()
	{
		return Math.sqrt((x-0)*(x-0)+(y-0)*(y-0));
	}
	public double distance(int x,int y)
	{
		return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
	}
	public double distance(Point p)
	{
		return Math.sqrt((p.x-x)*(p.x-x)+(p.y-y)*(p.y-y));
	}

}
