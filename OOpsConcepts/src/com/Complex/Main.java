package com.Complex;

public class Main {

	public static void main(String[] args) {
		
		ComplexNumber one=new ComplexNumber(1, 1);
		ComplexNumber two=new ComplexNumber(2, 2);
		one.add(two);
		one.subtract(2,2);
		one.add(2, 2);
		one.subtract(two);

	}

}
