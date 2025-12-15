package net.konic.corejava.MethodsParameters;

public class AddMethod2 {

	// Scenario-2: Method with parameters & without return type

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("Addition of C = " + c);

	}

	public static  void main(String[] args) {
		
		AddMethod2 am = new AddMethod2();
		am.add(50, 20);
		
	}
	
}
