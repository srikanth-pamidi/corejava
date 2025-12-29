package net.konic.corejava.CollectonsExample;
import java.util.*;
/*
  Q8. UpdatePrice
Question:
Create a method that updates price at index 2.
Output:
After Update: [100, 150, 250, 300, 400]

 */
public class UpdatePrice {

	List <Integer> price = new ArrayList();
	
	List<Integer> inserts() {
		price.add(100);
		price.add(200);
		price.add(300);
		price.add(400);
		price.add(1, 150);
		price.set(2, 250);
		return price;
	
}

public static void main(String[] args) {
	UpdatePrice obj = new UpdatePrice();
	List<Integer> insert = obj.inserts();
	System.out.println("Updated Prices: "+insert);
}
}

