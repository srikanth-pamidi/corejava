package CollectonsExample;
import java.util.*;

/*
Q6. RetrieveProductPrice
Question:
Create a method that returns price at given index.
Input:
Index: 3
Output:
Price at index 3: 400
 */
public class RetrieveProductPrice {
	List<Integer> price  = new ArrayList ();
	
	public int returnPrice () {
		price.add(100);
		price.add(200);
		price.add(300);
		price.add(400);
		return  price.get(3);
	}
	public static void main(String[] args) {
		RetrieveProductPrice obj = new RetrieveProductPrice();
		
		System.out.println("Price at index 3 : " +obj.returnPrice());
		
	}

}
