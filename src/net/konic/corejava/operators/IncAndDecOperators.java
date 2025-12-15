package net.konic.corejava.operators;

import java.util.Scanner;

public class IncAndDecOperators {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int people = 10;

		System.out.print("Enter number of people entered: ");
		int PeopleEntered = sc.nextInt();

		System.out.print("Enter number of people left: ");
		int PeopleLeft = sc.nextInt();

		for (int i = 0; i < PeopleEntered; i++) {
			people++;
		}

		for (int i = 0; i < PeopleLeft; i++) {
			people--;
		}

		System.out.println("Final count: " + people);

		sc.close();
	}

}
