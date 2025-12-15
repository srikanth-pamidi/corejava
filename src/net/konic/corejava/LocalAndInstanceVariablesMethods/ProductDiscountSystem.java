package net.konic.corejava.LocalAndInstanceVariablesMethods;

import java.util.Scanner;

public class ProductDiscountSystem {
	/*
	 * 8 ProductDiscountSystem
	 * 
	 * Instance variable: price
	 * 
	 * Method readPrice() → local Scanner
	 * 
	 * Method getDiscount() → return discounted price
	 * 
	 * Display final amount.
	 */
	double price;

	public void readPrice() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Product Price : ");
		price = scr.nextInt();
scr.close();
	}

	public double getDiscount() {
		return price - (price * 10 / 100);

	}

	public static void main(String[] args) {

		ProductDiscountSystem obj = new ProductDiscountSystem();
		obj.readPrice();
		obj.getDiscount();
		double total = obj.getDiscount();
		System.out.println("Discount : 10" + "%");
		System.out.println("Final Price = " + total);

	}

}
