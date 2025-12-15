package net.konic.corejava.LocalAndInstanceVariablesMethods;

public class BankAccountExample {

	/*
	 * 5. BankAccountExample
	 * 
	 * Instance variables: balance
	 * 
	 * Method deposit(int amount) → uses local variable
	 * 
	 * Method getBalance() → returns balance
	 * 
	 * Call both from main.
	 */

	int balance = 1000;

	public void deposit(int amount) {

		balance = balance + amount;

	}

	public int getBalance() {
		return balance;

	}

	public static void main(String[] args) {
		BankAccountExample bae = new BankAccountExample();
		bae.deposit(500);
		int currentBalance = bae.getBalance();
		System.out.println("Current Balance : " + currentBalance);

	}
}
