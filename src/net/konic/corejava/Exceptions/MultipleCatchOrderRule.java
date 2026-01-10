package net.konic.corejava.Exceptions;

public class MultipleCatchOrderRule {
	public static void main(String[] args) {
		try {
			 int a = 10 / 0;
			} catch (Exception e) {
			 System.out.println("Parent");
		//	} catch (ArithmeticException e) {
			//	System.out.println("Child");
			}
			 
	}

}
