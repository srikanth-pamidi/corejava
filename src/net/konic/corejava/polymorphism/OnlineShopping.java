package net.konic.corejava.polymorphism;

public class OnlineShopping {
/*	
	QUESTION:

		Create an overloaded addToCart() method for item ID, item ID & quantity, and item name.

		INPUT:
		addToCart(101)
		addToCart(101, 3)
		addToCart("Earphones")

		OUTPUT:
		Product 101 added to cart
		Product 101 added with quantity 3
		Earphones added to cart

*/
	void addToCart(int id) {
		System.out.println("Product "+id+" added to cart");
		
	}
	void addToCart(int id , int quantity) {
		System.out.println("Product "+id+" added with quantity "+quantity );
	}
	void addToCart(String name) {
		System.out.println(name+ "added to cart");
		
	}
	public static void main(String[] args) {
		OnlineShopping obj = new OnlineShopping();
		obj.addToCart(101);
		obj.addToCart(101, 3);
		obj.addToCart("Earphones");
		
	}
	
}