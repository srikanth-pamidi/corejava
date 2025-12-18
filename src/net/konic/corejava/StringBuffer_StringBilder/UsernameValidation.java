package net.konic.corejava.StringBuffer_StringBilder;
/*
Q11. UsernameValidation
Input
Username: adminUser01
Output
Valid admin user
*/

public class UsernameValidation {
	
public static void main(String[] args) {
	String username = "adminUser01";

	if (username.equals("adminUser01")) {
		System.out.println("Valid User");
	}else {
		System.out.println("Inalid User");
	}
}
}
