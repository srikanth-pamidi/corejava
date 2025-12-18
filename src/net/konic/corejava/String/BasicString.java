package net.konic.corejava.String;

public class BasicString {
public static void main(String[] args) {
		
		String name="Konic Technologies";
		
		System.out.println("Company Name :"+name);
		System.out.println("Length :"+name.length());
		System.out.println("Uppercase :"+name.toUpperCase());
		System.out.println("LoweCase :"+name.toLowerCase());
		System.out.println("Char at index 9 :"+name.charAt(9));
		System.out.println("Contains Z :"+name.contains("Z"));
	}

}
