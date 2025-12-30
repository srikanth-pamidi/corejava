package net.konic.corejava.CollectonsExample;
import java.util.*;
/*
Q12. RemoveLastCustomer
Question:
Create a method that removes last customer from queue.
Output:
Queue After Removal: [C1, C2]


Q13. CheckQueueSize
Question:
Create a method that returns number of customers in queue.
Output:
Total Customers: 3

 */
public class RemoveLastCustomer {
List<String> customers = new LinkedList ();
List customer = new LinkedList ();

List <String> addCustomers(){
		
	
		customers.add("C1");
		customers.add("C2");
		customers.add("C3");
		customers.remove(2);
		return customers;
		
	}
 int CheckQueueSize() {
	customer.add("C1");
	customer.add("C2");
	customer.add("C3");
	return customer.size();
	
}
	public static void main(String[] args) {
		RemoveLastCustomer obj = new RemoveLastCustomer();
		List <String> customersname = obj.addCustomers();
		int list = obj.CheckQueueSize();
		System.out.println("Queue After Removal: " +customersname);
		System.out.println("Total Customers: " +list);
}
}