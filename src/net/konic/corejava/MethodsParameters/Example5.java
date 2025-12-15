package net.konic.corejava.MethodsParameters;

public class Example5 {
	// Method with int parameter & boolean return type:
	// Write a method to check if a person is eligible for voting (age ≥ 18).

	public boolean age(int age) {
		if (age >= 18) {
			System.out.println("Person is eligible for voting");

			return true;

		} else {
			System.out.println("Person is not eligible for voting");
			return false;
		}

	}

	public static void main(String[] args) {
		Example5 obj = new Example5();
		boolean age = obj.age(15);
		System.out.println(age);
	}
}
