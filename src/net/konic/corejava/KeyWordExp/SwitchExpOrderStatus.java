package net.konic.corejava.KeyWordExp;

import java.util.Scanner;

public class SwitchExpOrderStatus {

	// SWITCH – Order Status
	// Input: “SHIPPED”
	// Output: “Your order is on the way”

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		System.out.println("Input : ");

		String Input = scr.next();

		switch (Input) {
		case "Placed":
			System.out.println("Order is Placed.");
			break;
		case "Transist":
			System.out.println("Order is in Transist.");
			break;
		case "Shipped":
			System.out.println("Order is on the way.");
			break;
		case "Cancelled":
			System.out.println("Order is cancelled.");
			break;

		default:
			System.out.println("Inalid Input");

		}
		scr.close();
	}
}
