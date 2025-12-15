package net.konic.corejava.MethodsParameters;

public class Example4 {

	// Method with String return type & String parameter:
	// Write a method that takes a name and returns a greeting message.

	public String message(String name) {
		return name + " is Good.";
	}

	public static void main(String[] args) {

		Example4 obj = new Example4();
		String name = obj.message("Srikanth");
		System.out.println(name);

	}

}
