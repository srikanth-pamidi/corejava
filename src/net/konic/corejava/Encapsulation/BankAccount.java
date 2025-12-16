package net.konic.corejava.Encapsulation;
/*
Q1. Bank Account Balance

Question:
Create a BankAccount class with private balance.
Allow setting balance only if value ≥ 0.
Input:
Enter Balance: 5000
Output:
Balance is: 5000

*/

public class BankAccount {
	
	private int balance;
	
public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		
		if(balance>=0) {
			this.balance = balance;
		}else {
			System.out.println("Invalid Balance.");
		}
	}

public static void main(String[] args) {
	BankAccount obj = new BankAccount();
	obj.setBalance(5000);
	int balance = obj.getBalance();
	System.out.println("Balance :"+balance);
}
}
