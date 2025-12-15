package net.konic.corejava.KeyWordExp;

import java.util.Scanner;

public class ContinueSkipNegativeNumbers {

	// 7) CONTINUE – Skip Negative Numbers
	// Input: [10, -5, 8, -2, 7]
	// Output: 10, 8, 7
	// (negatives skipped)

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter 5 Input Value : ");

		
		
		for (int i = 0; i < 5; i++) {
			int number = scr.nextInt();

			if (number < 0) {
				continue;
			}
			System.out.println(number);
		}
		scr.close();
	
	}
}
