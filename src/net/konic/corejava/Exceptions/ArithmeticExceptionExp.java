package net.konic.corejava.Exceptions;

public class ArithmeticExceptionExp {
	public static void main(String[] args) {

		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} finally {
			System.out.println("Finally block");
		}
	}

}
