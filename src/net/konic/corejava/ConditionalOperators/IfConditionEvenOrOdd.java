package net.konic.corejava.ConditionalOperators;

import java.util.Scanner;

public class IfConditionEvenOrOdd {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		// 3) EVEN / ODD:
		// Take a number and check if it is Even or Odd.

		System.out.println("Enter Number : ");
		int num = scr.nextInt();

		if (num % 2 == 0) {
			System.out.println("The given number is Even");
		} else {

			System.out.println("The given number is Odd");
		}
		scr.close();
	}
}
