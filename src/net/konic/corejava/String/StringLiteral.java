package net.konic.corejava.String;

public class StringLiteral {
	
	public static void main(String[] args) {
		String name="Srikanth";
		String Surname="Pamidi";
		
		String obj =new String("Pamidi");
		
		System.out.println("name == Surname :"+(name == Surname));
		
		System.out.println("Surname == Object name :"+(Surname == obj));
		
		System.out.println("Surname .equals Object name  :"+(Surname.equals(obj)));
	}


}
