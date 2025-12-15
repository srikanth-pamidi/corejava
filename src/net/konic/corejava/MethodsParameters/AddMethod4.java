package net.konic.corejava.MethodsParameters;

public class AddMethod4 {
	//Scenario-4 Method with return type & with parameters
	
	public int add(int a, int b) {
		int c = a + b;
		return c;

	}

	public static void main(String[] args) {
		AddMethod4 am = new AddMethod4();
		int sum = am.add(10,20);
		System.out.println(sum);
	}
	
}
