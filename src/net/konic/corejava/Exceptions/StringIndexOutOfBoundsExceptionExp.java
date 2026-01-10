package net.konic.corejava.Exceptions;

public class StringIndexOutOfBoundsExceptionExp {
	public static void main(String[] args) {

		try {
			String name = "Hi";
			System.out.println(name.charAt(5));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Index Exception");
		} finally {
			System.out.println("Finally block");
		}
	}
}
