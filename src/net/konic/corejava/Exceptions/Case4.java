package net.konic.corejava.Exceptions;

public class Case4 {
	// when we // when we got exception in 5th Statement
	
	// there is no exception in 1st try block so followed catchblock 10 is not executed.
	
		public static void main(String[] args) {

			try {
				System.out.println(1);
				System.out.println(2);
				System.out.println(3);
				try {
					System.out.println(4);
					System.out.println(10/0);
					System.out.println(6);
				} catch (ArithmeticException e) {
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

