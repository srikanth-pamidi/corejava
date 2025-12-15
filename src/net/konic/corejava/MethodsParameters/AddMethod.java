package net.konic.corejava.MethodsParameters;

public class AddMethod {
	
	// Method without parameter & without return value type.
	
	
	public void add() {
		int a =10;
		int b=20;
		int c = a+b;
		
		System.out.println("Addition = "+ c);
	}

	public static void main(String[] args) {
		AddMethod addMethod = new AddMethod();
		addMethod.add();
		
	}
}
