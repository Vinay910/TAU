package com.BankAccount;

public class Main {

	public static void main(String[] args) {
		BankAccount bk=new BankAccount();
		bk.depositFunds(100);
		bk.withdrawFunds(50);
		bk.withdrawFunds(100);
		bk.withdrawFunds(100);

	}

}
