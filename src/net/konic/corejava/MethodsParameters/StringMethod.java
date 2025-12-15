package net.konic.corejava.MethodsParameters;

public class StringMethod {
	// Method with String return type & String parameters

	public String print(String a, String b) {
		String c = a + b;

		return c;

	}

	public static void main(String[] args) {
		StringMethod am = new StringMethod();
		String p = am.print("Srikanth", " P");
		System.out.println("Name : " +p);
	}

}
