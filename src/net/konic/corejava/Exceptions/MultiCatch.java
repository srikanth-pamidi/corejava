package net.konic.corejava.Exceptions;

public class MultiCatch {
	public static void main(String[] args) {
		try {
			int a = 10 / 0;
			System.out.println(a);
		} catch (ArithmeticException | NullPointerException e) {

			System.out.println("ArithmeticException");
		}

	}

}
