package net.konic.corejava.Exceptions;

public class Case3 {
	
	// when we given wrong exception name in catchblock.

	public static void main(String[] args) {

		try {
			System.out.println(1);
			System.out.println(10 / 0);
			System.out.println(3);
			try {
				System.out.println(4);
				System.out.println(5);
				System.out.println(6);
			} catch (Exception e) {
				System.out.println(7);
			} finally {
				System.out.println(8);
			}
			System.out.println(9);
		} catch (NullPointerException e) {
			System.out.println(10);
		} finally {
			System.out.println(11);
		}
		System.out.println(12);
	}
}
