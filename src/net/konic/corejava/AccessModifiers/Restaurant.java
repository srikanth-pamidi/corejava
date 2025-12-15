package net.konic.corejava.AccessModifiers;

public class Restaurant {
/*	1.Restaurant Ordering System
Task:
Create a class Restaurant with:
public constructor → sets customer name
static variable → restaurantName
non-static method → orderFood(int choice) using switch
default constructor → sets "Walk-in Customer"
private constructor → internal use only
    Input: choice = 1 (Pizza)
	Output: Added: Pizza (₹200)
*/
	
	static String restaurentName = "KFC";
	String name;
	
	
	public  Restaurant (String n ) {
		name = n;
		System.out.println("customer Name : "+name);
	}
	
	
	
	public void orderFood(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Added         : Pizza (₹200)");
                break;
            case 2:
            	System.out.println("Invalid Option.");
        }
	}
	
	public static void main(String[] args) {
		Restaurant obj = new Restaurant("Srikanth");
		obj.orderFood(1);
	}
}
