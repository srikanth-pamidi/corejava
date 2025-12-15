package net.konic.corejava.LocalAndInstanceVariablesMethods;

public class EvenOddChecker {
	/*
	 * 4 Even/Odd Checker
	 * 
	 * Instance variable: number
	 * 
	 * Method readNumber() → reads input (local var)
	 * 
	 * Method isEven() → returns boolean
	 * 
	 * Use returned value in main to print EVEN/ODD.
	 */

	int num;

	public void readNumber() {
		num = 20;
	}

	public boolean isEven() {
		if (num % 2 == 0) {
			System.out.println("Number is : Even");
			return true;

		} else {
			System.out.println("Number is : Odd");
			return false;

		}
	}

	public static void main(String[] args) {
		EvenOddChecker eoc = new EvenOddChecker();
		eoc.readNumber();
		eoc.isEven();


	}

}
