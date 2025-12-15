package net.konic.corejava.LocalAndInstanceVariablesMethods;

import java.util.Scanner;

public class Calculator {

	/*
	 * 1. Create a class Calculator
	 * num1, num2 → instance variables
	 * Write a method to read input using Scanner (local vars)
	 * Write another method add() that returns the sum
	 * Print result in main.
	 */

	int a;
	int b;

	public void intput() {

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter A Value : ");
		a = scr.nextInt();
		System.out.println("Enter B value");
		b = scr.nextInt();
		
		scr.close();
		
	}

	public int add() {
		return a + b;
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.intput();
		int sum = cal.add();
		System.out.println("Sum = " + sum);

	}
	

}
