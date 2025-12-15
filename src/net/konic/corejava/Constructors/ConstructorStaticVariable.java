package net.konic.corejava.Constructors;

public class ConstructorStaticVariable {

	/*
	 * 1. Bank Account (Constructor + Static Variable)
	 * 
	 * Input: accountNo=101, name=“Rahul”, deposit=5000
	 * Output: 
	 * Bank: SBI Account
	 * No: 101 
	 * Customer: Rahul 
	 * Balance: 5000
	 * 
	 * ✳ Task:
	 * 
	 * Use constructor to set accountNo & name
	 * 
	 * Use static variable for bankName
	 * 
	 * deposit() method updates balance
	 */

	static String bankName = "SBI";
	int accountNo;
	String name;
	int deposit;
	int balance = 1000;

	public ConstructorStaticVariable(int i, String Name) {
		accountNo = i;
		name = Name;

	}

	public void deposit(int amount) {
		balance = amount + balance;

	}

	public static void main(String[] args) {
		ConstructorStaticVariable obj = new ConstructorStaticVariable(101, "Rahul");
		obj.deposit(5000);
		System.out.println("Bank Name : " + bankName);
		System.out.println("Customer Name : " + obj.name);
		System.out.println("Balance : " + obj.balance);

	}

}


