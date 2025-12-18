package net.konic.corejava.StringBuffer_StringBilder;
/*
Q2. String Modification with Reassignment
Input
Message: Hello
Output

Updated Message: Hello World
*/
public class StringReassignment {
	
	public static void main(String[] args) {
		String name = "Hello";
		name.concat("World");
		name = name.concat("World");
		System.out.println("Updated Message:"+name);
	}
	

}
