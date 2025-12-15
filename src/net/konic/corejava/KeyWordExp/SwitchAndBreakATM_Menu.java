package net.konic.corejava.KeyWordExp;

import java.util.Scanner;

public class SwitchAndBreakATM_Menu {
	public static void main(String[] args) {
		// 9) SWITCH + BREAK – ATM Menu
		// Input: option = 4
		// Output: “Exit… Thank You!”
		// Loop stops (break)

		System.out.println("Enter Options (1-4) : ");
		Scanner scr = new Scanner(System.in);

		int option = scr.nextInt();

		switch (option) {
		case 1:
			System.out.println("Enetr Your Pin Number");
			break;
		case 2:
			System.out.println("Enter Amount ");
			break;
		case 3:
			System.out.println("Collect Your Cash");
			break;

		case 4:
			System.out.println("Exit... Thank You");
			break;
		default:
			System.out.println("Entered Pin is invalid");

		}
		scr.close();
	}

}
