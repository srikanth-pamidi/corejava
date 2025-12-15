package net.konic.corejava.MethodsParameters;

public class BooleanMethod {

	// Method with int as parameter & boolean return type

	public boolean check(int age) {
		if (age >= 18) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		BooleanMethod b = new BooleanMethod();
		boolean status = b.check(25);
		System.out.println("Eligible for vote ? :: " + status);
	}

}
