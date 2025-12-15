package net.konic.corejava.MethodsParameters;

public class WithParametersWithOutReturnType {

//	 Method with parameters & without return type:
//	Write a method that takes first name + last name as parameters and prints the full name.

	public void name(String a, String b) {

		System.out.println("Full Name : " + a + " " + b);

	}

	public static void main(String[] args) {

		WithParametersWithOutReturnType wp = new WithParametersWithOutReturnType();
		wp.name("Srikanth", "Pamidi");
	}

}
