package net.konic.corejava.operators;

import java.util.Scanner;

public class RelationalLogical {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		/*
		 * 3) Relational + Logical – Student Pass/Fail
		 * 
		 * Input: marks Output: Pass / Fail
		 */
		System.out.println("Enter Marks : ");
		int marks = scr.nextInt();

		if (marks > 35) {
			System.out.println("Result : PASS");

		} else {
			System.out.println("Result : FAIL");
		}

		System.out.println("=========***=========");
		/*
		 * 4) Relational – Movie Eligibility
		 * 
		 * Input: age Output: Allowed / Not Allowed
		 * 
		 * 
		 */

		System.out.println("Enter Age : ");
		int age = scr.nextInt();

		if (age > 18) {
			System.out.println("Candidate is allowed. ");
		} else {
			System.out.println("Candidate is not allowed. ");
		}
		System.out.println("=========***=========");

		/*
		 * 5) Logical – Login Check
		 * 
		 * Input: username, password Output: Login Success / Failed
		 */

		System.out.print("Enter username: ");
		String u = scr.next();

		System.out.print("Enter password: ");
		String p = scr.next();

		if (u.equals("admin") && p.equals("1234"))
			System.out.println("Login Success");
		else
			System.out.println("Login Failed");

		System.out.println("=========***=========");
		/*
		 * 6) Assignment Operator Practice Input: number Operations: number += 5, number
		 * -= 3, number *= 2, number /= 2 Output: Updated values after each operation
		 */

		System.out.println("Enter Number : ");
		int num = scr.nextInt();

		// logic Operations

		num += 5;
		System.out.println(" After += 5 " + num);
		num -= 3;
		System.out.println(" After -= 3 " + num);
		num *= 2;
		System.out.println(" After *= 2 " + num);
		num /= 2;
		System.out.println(" After /= 2 " + num);

		scr.close();
	}
 
}
