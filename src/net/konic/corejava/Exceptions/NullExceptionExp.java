package net.konic.corejava.Exceptions;

public class NullExceptionExp {

	public static void main(String[] args) {

		try {
			String name = null;
			System.out.println(name.length());

		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception");
		} finally {
			System.out.println("Fynally Block Executed.");
		}

	}

}
