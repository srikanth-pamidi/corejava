package net.konic.corejava.polymorphism;

public class ATM_WithdrawalOverloading {
	
/*	
	Create overloaded withdraw() methods and show outputs.

	INPUT:
	withdraw(500)
	withdraw(500.75)
	withdraw(1000, "Current")

	OUTPUT:
	Withdrawn ₹500
	Withdrawn ₹500.75
	Withdrawn ₹1000 from Current Account
	*/

void withdraw(int x) {
	System.out.println("Withdrawn ₹"+x);

}

void withdraw(float y) {
	System.out.println("Withdrawn ₹"+y);

}

void withdraw(int x, String y) {
	System.out.println("Withdrawn ₹"+x + y);

}

public static void main(String[] args) {
	ATM_WithdrawalOverloading obj = new ATM_WithdrawalOverloading();
	obj.withdraw(500);
	obj.withdraw(500.75f);
	obj.withdraw(1000, " From Current Account. ");

}

}
