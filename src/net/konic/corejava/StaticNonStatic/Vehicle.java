package net.konic.corejava.StaticNonStatic;

public class Vehicle {
	

/* 6️. Create a class Vehicle
• static variable: wheels = 4
• instance variable: brand
Task:
Print wheels using class name
Print brand using object
*/
	
	static int wheels = 4;
	String brand;
	
	public static void wheelDetails() {
		System.out.println("Number of Wheels : "+wheels);
		
	}
	
	public void brandDetails() {
		System.out.println("Brand Name : "+brand);
	}
	
	public static void main(String[] args) {
		Vehicle.wheelDetails();
		Vehicle obj = new Vehicle();
		obj.brand = "TATA";
		obj.brandDetails();
	}
	
}
