package net.konic.corejava.Exceptions;

public class ArrayIndexException {

	public static void main(String[] args) {
		
		try {
			int[] a= {1,2,3};
			System.out.println(a[2]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception");
			
		}finally {
			System.out.println("Fynally Block Executed.");
		}
		
	}
}
