package net.konic.corejava.KeyWordExp;

import java.util.Scanner;

//1) SWITCH – Mobile Recharge
//Input: option = 2
//Output: “SMS Pack Selected”

public class SwitchExpMobileRecharge {

	public static void main(String[] args) {

		System.out.println("Enter Options : ");
		Scanner scr = new Scanner(System.in);

		int options = scr.nextInt();

		switch (options) {
		case 1:
			System.out.println("Data Pack Selected ");
			break;
		case 2:
			System.out.println("SMS  Pack Selected ");
			break;
		case 3:
			System.out.println("Talktime  Pack Selected ");
			break;
		case 4:
			System.out.println("Back to Homepage ");
			break;
		default:
			System.out.println("Invalid Option");
		}

		scr.close();

	}

}
