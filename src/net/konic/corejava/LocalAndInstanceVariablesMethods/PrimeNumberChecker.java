package net.konic.corejava.LocalAndInstanceVariablesMethods;

import java.util.Scanner;

public class PrimeNumberChecker {

	/*
	 * 11 PrimeNumberChecker
	 * 
	 * Instance variable: number
	 * 
	 * Method readNumber() → takes input using Scanner (local variable)
	 * 
	 * Method isPrime() → returns boolean
	 * 
	 * In main(), print “Prime” or “Not Prime”.
	 */

	int num;

	public void readNumber() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Number : ");
		num = scr.nextInt();
		scr.close();
	}

	public boolean isPrime() {
		if (num >= 1) {
			System.out.println("Number  is Not Prime ");
			return false;

		}
		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {
				System.out.println("Number  is Not Prime");
				return false;
			}
		}

		System.out.println("Number is Prime");
		return true;

	}

	public static void main(String[] args) {
		PrimeNumberChecker obj = new PrimeNumberChecker();
		obj.readNumber();
		 obj.isPrime();
		
	}
}
