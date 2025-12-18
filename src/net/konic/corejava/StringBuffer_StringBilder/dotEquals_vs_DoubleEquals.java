package net.konic.corejava.StringBuffer_StringBilder;
/*
input
username1 = "admin"
username2 = new String("admin")

Output

== result: false
equals result: true
*/
public class dotEquals_vs_DoubleEquals {
	public static void main(String[] args) {
		String username1 = "admin";
		String username2 = new String("admin");
		System.out.println("== is : "+(username1 == username2) );
		System.out.println(".Equals is : "+(username1) .equals(username2));
	}

}
