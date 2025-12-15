package net.konic.corejava.LocalAndInstanceVariablesMethods;

import java.util.Scanner;

public class FullNameProgram {

	/*
	 * 3 Full Name Program
	 * 
	 * Instance variables: firstName, lastName
	 * 
	 * Method readNames() → takes Scanner input (local variables)
	 * 
	 * Method fullName() → returns full string
	 * 
	 * Print full name in main.
	 */

	String firstName;
	String lastName;

	public void readNames() {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter First Name : ");
		firstName = scr.next();
		System.out.println("Enter Last Name : ");
		lastName = scr.next();

		scr.close();

	}

	public String fullName() {

		return firstName + " " + lastName;

	}

	public static void main(String[] args) {
		FullNameProgram np = new FullNameProgram();
		np.readNames();
		np.fullName();
		String name = np.fullName();
		System.out.println("Full Name : " + name);

	}

}
