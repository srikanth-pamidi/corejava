package net.konic.corejava.operators;

import java.util.Scanner;

public class AssignmentOperators {
	
	public static void main(String [] args) {
		
		Scanner  scr = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int num = scr.nextInt();

		// logic Operations

		num += 5;
		System.out.println(" After += 5 " + num);
		num -= 3;
		System.out.println(" After -= 3 " + num);
		num *= 2;
		System.out.println(" After *= 2 " + num);
		num /= 2;
		System.out.println(" After /= 2 " + num);

		scr.close();
	}
	
	}

