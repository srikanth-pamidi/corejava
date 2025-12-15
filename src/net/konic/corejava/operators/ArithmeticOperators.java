package net.konic.corejava.operators;

import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("Enter the First Number : "); int a = sc.nextInt();
		 * 
		 * System.out.println("Enter the Second Number : "); int b = sc.nextInt();
		 * 
		 * int sum = a + b; System.out.println("Sum : " + sum); sc.close();
		 * 
		 * }
		 */

		// 1) Arithmetic Operators

// Input: itemPrice, quantity
// Output: totalPrice, tax, finalBill

		System.out.println("Enter Item Price : ");
		int itemPrice = sc.nextInt();

		System.out.println("Quantity : ");
		float quantity = sc.nextInt();
		
		//logic
		float totalPrice = itemPrice*quantity;
		float tax = totalPrice*(float)9/100;
	    float finalbill= totalPrice+tax;
	    

		System.out.println("Total Price : " + totalPrice);
		System.out.println("GST 9% : " + tax);
		System.out.println("Final Bill : " + finalbill);
		sc.close();

	}
}
