package net.konic.corejava.Encapsulation;
/*
Q8. AccountNumber Read-Only
Question:
Create an Account class with private accountNumber.
Provide only getter (no setter).
Output:
Account Number: 123456
*/

public class Account {
	private int accountNumber;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public  void accountNumber(int i) {
		accountNumber = i;
		
	}
	
	public static void main(String[] args) {
		Account obj = new Account();
		
		obj.accountNumber(1234);
		
		int accountNumber=obj.getAccountNumber();
		System.out.println("Account Number :"+accountNumber);
	}


	
}
