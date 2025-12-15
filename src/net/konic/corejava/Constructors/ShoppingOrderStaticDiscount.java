package net.konic.corejava.Constructors;

public class ShoppingOrderStaticDiscount {
	
	/*
	 * 7.Shopping Order Static Discount
	 * 
	 * Input: price=1000, static discount=10% 
	 * Output: Final Price: 900
	 * 
	 * ✳ Task:
	 * 
	 * Static variable discount
	 * 
	 * Method applyDiscount() returns discounted price
	 * 
	 * Constructor sets price
	 */

int price;
static int discount = 10;

public ShoppingOrderStaticDiscount(int p) {
	price = p;
	
}
public int applyDiscount () {
	int dis =price * 10 / 100;
	 return price - dis;
	
}
public static void main(String[] args) {
	ShoppingOrderStaticDiscount obj = new ShoppingOrderStaticDiscount(1000);
	obj.applyDiscount();
	System.out.println("Price : "+obj.price);
	System.out.println("Discount : " +obj.discount);
	System.out.println("Total Price : "+obj.applyDiscount());
	
	
}

}
