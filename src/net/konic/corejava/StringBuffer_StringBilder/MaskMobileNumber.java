package net.konic.corejava.StringBuffer_StringBilder;
/*
Q12. MaskMobileNumber
Input
Mobile: 9876543210
Output
Masked Mobile: 98******10
*/
public class MaskMobileNumber {
	public static void main(String[] args) {
		StringBuffer num = new StringBuffer("7730000103");
		num.replace(2,num.length() -2,"******");
		System.out.println("Masked Mobile: "+num);
	}

}
