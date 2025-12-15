package net.konic.corejava.MethodsParameters;

public class Example3 {

	// Method with return type & without parameters:
	// Write a method that returns the default country name (like “India”).

	public String name() {

		return "INDIA";

	}

	public static void main(String[] args) {
		Example3 obj = new Example3();
		String CountryName = obj.name();
		System.out.println("Country Name : " + CountryName);

	}

}
