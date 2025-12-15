package net.konic.corejava.LocalAndInstanceVariablesMethods;

import java.util.Scanner;

public class CheckNameLength {
	/*
	 * 10 CheckNameLength
	 * 
	 * Instance variable: fullName
	 * 
	 * Method readFullName() → local Scanner
	 * 
	 * Method isLongName() → return boolean (true if > 10 chars)
	 * 
	 * Print output in main.
	 */

	String name;

	public void readFullName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Full Name: ");
		name = sc.nextLine();
		sc.close();
	}

	public boolean isLongName() {

		if (name.length() < 10) {

			return true;
		} else {

			return false;
		}
	}

	public static void main(String[] args) {

		CheckNameLength obj = new CheckNameLength();
		
		obj.readFullName();
		obj.isLongName();
		boolean result = obj.isLongName();
		System.out.println(result);
		

	}
}
