package CollectonsExample;

import java.util.*;

/*
 * Q7. InsertPriceinMiddle
Question:
Create a method that inserts a price at index 1 and returns updated list.
Output:
Updated Prices: [100, 150, 200, 300, 400]
 */
public class InsertPriceinMiddle {

	
	List<Integer> price = new LinkedList();
	
	List<Integer> inserts() {
		price.add(100);
		price.add(200);
		price.add(300);
		price.add(400);
		price.add(1, 150);
		return price;
	}
	public static void main(String[] args) {
		InsertPriceinMiddle obj = new InsertPriceinMiddle();
		List<Integer> insert = obj.inserts();
		System.out.println("Updated Prices: "+insert);
	}
}
