package net.konic.corejava.Exceptions;

public class FinallyWithoutException {
	public static void main(String[] args) {
		try {
			int a = 10 / 2;
			System.out.println(a);

		} catch (ArithmeticException e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Final Block");
		}

	}
}
