package net.konic.corejava.AccessModifiers;

public class Cart {
/*	4️.Online Shopping Cart

	Task:
	Class Cart:
	static variable → websiteName
	public constructor → set customerName
	non-static method → addItem(int itemId) using switch
	private constructor → internal logging
	Input: itemId = 1
	Output: Added: Shoes (₹1500)
*/
	
	static String websiteName ="Flipkart";
	String name;
	
	public Cart(String n) {
		name = n;
		
	}
	public void addItem(int itemId){
	 switch (itemId){
	 case 1:
		 System.out.println("Shoes = ₹1500 ");
		 break;
	 case 2:
		 System.out.println("Shirt = ₹1000");
		 break;
	 case 3:
		 System.out.println("Pant = ₹2000");
		 break;
		 default:
			 System.out.println("Invalid Input");
	 }
	 
		 
	 }
	public static void main(String[] args) {
		System.out.println("Website Name : "+websiteName);
		Cart obj = new Cart("Srikanth ");
		System.out.println("Customer Name : "+ obj.name);
		obj.addItem(1);
		
	}

}
