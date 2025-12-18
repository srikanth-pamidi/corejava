package net.konic.corejava.StringBuffer_StringBilder;
/*
 Q5. OrderIDBuilder (StringBuilder)
Input
Base: ORD
Number: 1001
Output
Order ID: ORD1001
*/

public class OrderIDBuilder {
	public static void main(String[] args) {
		StringBuilder base = new StringBuilder("ORD");

		base.append("1001");

		System.out.println("Order ID: " + base);
	}
}
