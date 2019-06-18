package com.BankAccount;

public class Main {

	public static void main(String[] args) {
		BankAccount bk=new BankAccount(111,100,"Vinayak","v@v.com",123457);
		bk.depositFunds(100);
		bk.withdrawFunds(50);
		bk.withdrawFunds(100);
		bk.withdrawFunds(100);

	}

}
