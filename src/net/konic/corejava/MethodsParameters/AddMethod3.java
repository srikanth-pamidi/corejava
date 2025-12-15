package net.konic.corejava.MethodsParameters;

public class AddMethod3 {

	// Scenario-3: Method with return type & without parameters

	public int add() {

		int a = 10;
		int b = 20;
		int c = a + b;
		return c;

	}

	public static void main(String[] args) {
		AddMethod3 am = new AddMethod3();
		int sum = am.add();
		System.out.println(sum);

	}
}
