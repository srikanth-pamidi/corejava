package net.konic.corejava.KeyWordExp;

import java.util.Scanner;

public class SwichExp {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Options(1-4): ");
		
		Scanner scr = new Scanner(System.in);
		
		int option = scr.nextInt();
		switch (option) {
		case 1:
			System.out.println("Data Pack Selected");
			break;
		case 2:
			System.out.println("SMS Pack Selected");
			break;
		case 3:
			System.out.println("Talktime Selected");
			break;
		case 4:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Invalid Option");
		}

		scr.close();
	}
	
	}