package net.konic.corejava.CollectonsExample;

import java.util.*;

/*
 * Q5. CreateProductList
Question:
Create a method that adds product prices into ArrayList and returns it.
Expected Output:
Prices: [100, 200, 300, 400]

 */
public class CreateProductList {
	
	List price = new ArrayList();
	
	List addPrice () {
		
	price.add(100);
	price.add(200);
	price.add(300);
	price.add(400);
	
	return price;
	
	}
	public static void main(String[] args) {
		
		CreateProductList obj = new CreateProductList();
		List price = obj.addPrice();
		System.out.println("Price : "+price);
		
		
		
		
	}
}