package net.konic.corejava.CollectonsExample;
import java.util.*;
/*
  Q11. ServeCustomer
Question:
Create a method that removes and returns first customer.
Output:
Served Customer: VIP
Remaining Queue: [C1, C2, C3]

 */
public class ServeCustomer {
List<String> customers = new LinkedList ();
	
	String  addCustomers(){
		
		customers.add("VIP");
		customers.add("C1");
		customers.add("C2");
		customers.add("C3");
		return customers.remove(0);
	}
	public static void main(String[] args) {
		ServeCustomer obj = new ServeCustomer();
		String customersname = obj.addCustomers();
		 System.out.println("Served Customer: " + customersname);
	        System.out.println("Remaining Queue: " + obj.customers);
	}
	

}
