package com.Printer;

public class Printer {

	private int tonerLevel=100,pagesPrinted;
	private boolean duplex;
	public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
		if(tonerLevel>0&&tonerLevel<100)
		{
		this.tonerLevel = tonerLevel;
		}
		this.pagesPrinted = pagesPrinted;
		this.duplex = duplex;
	}
	
	public void fillToner(int toner)
	{
		if(toner>0&&toner<100&&this.tonerLevel+toner<=100)
		{
		this.tonerLevel=this.tonerLevel+toner;
		System.out.println("New Toner Level is "+this.tonerLevel );
		}
		else
		{
			System.out.println("You can't fill toner more than 100%. Current value is "+this.tonerLevel);
		}
	}
	public void pagePrinting()
	{
		if(this.tonerLevel>0)
		{
			System.out.println("Page is printed");
			if(this.duplex=true&&this.tonerLevel>1)
			{
				this.pagesPrinted=this.pagesPrinted+2;
				this.tonerLevel=this.tonerLevel-2;
				System.out.println("Total Page printed is = "+this.pagesPrinted);
				System.out.println("Toner left for usage is = "+this.tonerLevel);
			}
			else
			{
				this.pagesPrinted=+1;
				this.tonerLevel=-1;
			}
		}
	}
	
}
