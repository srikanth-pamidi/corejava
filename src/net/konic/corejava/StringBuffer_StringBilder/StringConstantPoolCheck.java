package net.konic.corejava.StringBuffer_StringBilder;
/*
Q4. StringConstantPoolCheck
Input
String a = "Hotel"
String b = "Hotel"
Output
Same memory location
*/
public class StringConstantPoolCheck {

public static void main(String[] args) {
	String a = "Hotel";
	String b = "Hotel";
		if(a==b) {
			System.out.println("Same memory location");
		}else {
			System.out.println("Different memory location");
		}
}
}
