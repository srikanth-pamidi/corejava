package net.konic.corejava.MethodsParameters;

public class Example7 {

// Method with two int parameters & int return type:
	// Write a simple calculator add() method that returns the sum.

	public int add(int a, int b) {
		int z= a+b;
		System.out.println(z);
		return z;
	}

	public static void main(String[] args) {

		Example7 obj = new Example7();

		int sum = obj.add(1, 2);
		System.out.println("Sum = " + sum);
	}
}
