package net.konic.corejava.ConditionalOperators;

import java.util.Scanner;

public class ForLoopOperators {
	
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		// 4) FOR Loop:
		// Print the multiplication table of any number

		System.out.println("Enter Table Name : ");
		int num = scr.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + "=" + num * i);
		}
		scr.close();

	}
}
