package net.konic.corejava.String;

public class IsEqual {
	public static void main(String[] args) {

		String n1 = "Srikanth";
		String n2 = "Srikanth";
		String n3 = "java";
		

		
		String n4=new String("java");
		String n5=new String("Srikanth");
		String n6 = new String("Java");
		
		System.out.println(n1 == n3);
		System.out.println(n3 == n4);
		
		System.out.println(n1 .equals(n5));
		
		

	}
}