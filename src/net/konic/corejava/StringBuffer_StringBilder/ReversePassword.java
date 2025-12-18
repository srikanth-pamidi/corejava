package net.konic.corejava.StringBuffer_StringBilder;
/*
  Q7. ReversePassword

Input

Password: admin

Output

Reversed Password: nimda
 */
public class ReversePassword {

public static void main(String[] args) {
	
	StringBuffer obj = new StringBuffer( "admin");
	obj.reverse();
	System.out.println("Reversed Password: "+obj);
}
}
