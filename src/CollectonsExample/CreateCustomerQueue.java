package CollectonsExample;
import java.util.*;
/*
Q9. CreateCustomerQueue
Question:
Create a method that adds customers to a LinkedList and returns it.
Output:
Queue: [C1, C2, C3]
*/
public class CreateCustomerQueue {
	List<String> customers = new LinkedList ();
	
	List<String> addCustomers(){
		customers.add("C1");
		customers.add("C2");
		customers.add("C3");
		return customers;
	}
	public static void main(String[] args) {
		CreateCustomerQueue obj = new CreateCustomerQueue();
		List<String> customersname = obj.addCustomers();
		System.out.println("Queue: " +customersname);
	}
	

}
