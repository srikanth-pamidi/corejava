package net.konic.corejava.ConditionalOperators;

import java.util.Scanner;

public class IfconditionVoteExp {

	// 2) IF Condition:
	// Check if a person is eligible for voting (age ≥ 18).

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		System.out.println("Enter Candidate Age : ");
		int n = scr.nextInt();

		if (n >= 18) {
			System.out.println("Candidate eligible for vote. ");
		} else {
			System.out.println("Candidate not eligible for vote. ");
		}

		scr.close();

	}
}
