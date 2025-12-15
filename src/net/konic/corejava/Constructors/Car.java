package net.konic.corejava.Constructors;

public class Car {

	String name;
	String brand;
	int year;
	String colour;

	 Car(String n, String b, int y, String c) {

		name = n;
		brand = b;
		year = y;
		colour = c;

	}

	public void details() {
		System.out.println("Company Name : " + name);
		System.out.println("Model Name   : " + brand);
		System.out.println("Year         : " + year);
		System.out.println("Colour       : " + colour);
  
	}

	public static void main(String[] args) {
		Car obj = new Car("TATA", "NEXON", 2025, "GREY");
		obj.details();

	}
}
