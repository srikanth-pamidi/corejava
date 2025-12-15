package net.konic.corejava.LocalAndInstanceVariablesMethods;

import java.util.Scanner;

public class CalExp2 {
	/*
	 * 1. Create a class Calculator
	 * num1, num2 → instance variables
	 * Write a method to read input using Scanner (local vars)
	 * Write another method add() that returns the sum
	 * Print result in main.
	 */

	int x;
	int y;

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X value : ");
		x = sc.nextInt();
		System.out.println("Enter X value : ");
		y = sc.nextInt();

		sc.close();
	}

	public int add() {
		return x + y;

	}

	public static void main(String[] args) {
		CalExp2 cal = new CalExp2();
		cal.input();
		int sum = cal.add();
		System.out.println("Sum of X and Y values is : " + sum);

	}

}
