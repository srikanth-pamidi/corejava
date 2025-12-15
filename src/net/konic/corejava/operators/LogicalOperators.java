package net.konic.corejava.operators;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		/*
		 * 5) Logical – Login Check
		 * 
		 * Input: username, password Output: Login Success / Failed
		 */

		System.out.println("Enter Username : ");
		String u = scr.next();

		System.out.print("Enter password: ");
		String p = scr.next();

		if (u.equals("admin") && p.equals("1234")) {
			System.out.println("Login Success");
		} else {
			System.out.println("Login Failed");
		}
		scr.close();

	}
}
