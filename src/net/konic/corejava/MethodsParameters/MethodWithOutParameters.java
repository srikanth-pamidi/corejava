package net.konic.corejava.MethodsParameters;

public class MethodWithOutParameters {
	
	// Method without parameters & without return type:
	//	 Write a method to print “Welcome to our Application” using no input and no return.
	
	private void display() {
		
		System.out.println("Welcome to our Application");
	}

	public static void main(String[] args) {
		MethodWithOutParameters d = new MethodWithOutParameters();
		d.display();
		
	}

}
