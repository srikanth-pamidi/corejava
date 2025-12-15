package net.konic.corejava.ConditionalOperators;

import java.util.Scanner;

public class WhileLoopOperators {
	
	public static void main(String[] args) {
		
		//5) WHILE Loop:
		//	Print numbers from 10 down to 1 (reverse count).
		System.out.println("Enter the Number : ");
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		
		while(num>=-10) {
			System.out.println(num);
			num--;
		}
		
		scr.close();
		
	}

}
