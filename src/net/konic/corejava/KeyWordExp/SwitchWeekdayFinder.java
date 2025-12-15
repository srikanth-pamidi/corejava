package net.konic.corejava.KeyWordExp;

import java.util.Scanner;

public class SwitchWeekdayFinder {

	// 2) SWITCH – Weekday Finder
	// Input: 4
	// Output: “Wednesday”

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println(" Enter the Option Number (1-7):");

		int option = scr.nextInt();

		switch (option) {

		case 1:
			System.out.println("Today is Sunday.");
			break;
		case 2:
			System.out.println("Today is Monday.");
			break;
		case 3:
			System.out.println("Today is Teusday.");
			break;
		case 4:
			System.out.println("Today is Wednesday. ");
			break;
		case 5:
			System.out.println("Today is Thursday. ");
			break;
		case 6:
			System.out.println("Today is Friday. ");
			break;
		case 7:
			System.out.println("Today is Saturday. ");
			break;
		default:
			System.out.println("Inalid Option. ");

		}
		scr.close();
	}

}
