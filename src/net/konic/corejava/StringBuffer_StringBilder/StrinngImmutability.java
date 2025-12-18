package net.konic.corejava.StringBuffer_StringBilder;
/*	Q1. String Immutability (Password)
Input
Password: admin123
Output
Password remains: admin123
*/
public class StrinngImmutability {

	public static void main(String[] args) {
		String password = "admin123";
		password.concat("546");
		System.out.println("Password remains : " + password);
	}

}

