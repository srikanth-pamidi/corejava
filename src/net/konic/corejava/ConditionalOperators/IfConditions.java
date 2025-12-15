package net.konic.corejava.ConditionalOperators;

import java.util.Scanner;

public class IfConditions {

	// 1) IF Condition:
	// Check if a number is Positive or Negative.

	public static void main(String[] arg) {
		Scanner scr = new Scanner(System.in);

		
			System.out.print("Enter Number : ");
			int n = scr.nextInt();

			if (n > 0) {
				System.out.println(" Given num is Positive");
			} else if (n < 0) {
				System.out.println(" Given num is Negative");
			} else {
				System.out.println(" Given num is Zero");
			}
			scr.close();
	}
	
}

		
		
		
	