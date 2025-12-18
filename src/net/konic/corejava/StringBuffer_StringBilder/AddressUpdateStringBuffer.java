package net.konic.corejava.StringBuffer_StringBilder;
/*
 Address Update StringBuffer)
Input
Address: Street 5
City: Hyderabad
Output
Updated Address: Street 5 Hyderabad
 */
public class AddressUpdateStringBuffer {
	public static void main(String[] args) {
		StringBuffer obj = new StringBuffer("Street 5,");
		obj.append("Hyderabad.");
		System.out.println("Updated Address: "+obj);
	}

}
