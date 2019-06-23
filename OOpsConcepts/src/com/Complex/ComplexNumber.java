package com.Complex;

public class ComplexNumber {
	
	private double real;
	private double imaginary;
	
	public ComplexNumber(double real,double imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public double getReal()
	{
		return real;
	}
	public double getImaginary()
	{
		return imaginary;
	}
	public void add(double real,double imaginary)
	{
		this.real=this.real+real;
		this.imaginary=this.imaginary+imaginary;
	}
	public void add(ComplexNumber c)
	{
		real=c.getReal()+real;
		imaginary=c.getImaginary()+imaginary;
	}
		public void subtract(double real,double imaginary)
	{
		this.real=real-this.real;
		this.imaginary=imaginary-this.imaginary;
	}
	public void subtract(ComplexNumber c)
	{
		real=real-c.getReal();
		imaginary=imaginary-c.getImaginary();
	}
}
