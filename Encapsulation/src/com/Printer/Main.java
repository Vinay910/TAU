package com.Printer;

public class Main {

	public static void main(String[] args) {
		
		Printer printer=new Printer(200, 2, true);
		printer.pagePrinting();
		printer.fillToner(2);

	}

}
