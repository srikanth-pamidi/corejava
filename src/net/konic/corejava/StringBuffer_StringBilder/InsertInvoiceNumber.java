package net.konic.corejava.StringBuffer_StringBilder;
/*Q9. InsertInvoiceNumber
Input
Message: Invoice Generated
Number: 101
Output
Invoice 101 Generated
*/
public class InsertInvoiceNumber {
	
public static void main(String[] args) {
	StringBuilder obj = new StringBuilder ("Invoice Generated");
	obj.insert(7," 101");
	System.out.println(obj);
}
}
