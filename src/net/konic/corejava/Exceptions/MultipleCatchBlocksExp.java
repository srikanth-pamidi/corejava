package net.konic.corejava.Exceptions;

public class MultipleCatchBlocksExp {
	public static void main(String[] args) {
		try {
			int a = 10 / 0;
			System.out.println(a);

		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} catch (Exception e) {
			System.out.println("Multiple Excetption");
		} finally {

			System.out.println("Final Block");

		}

	}

}
