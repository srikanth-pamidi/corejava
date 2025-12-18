package net.konic.corejava.StringBuffer_StringBilder;

public class DeleteOTPLastDigit {
	public static void main(String[] args) {
		StringBuilder otp = new StringBuilder("123456");
		otp.deleteCharAt(5);
		System.out.println("Updated OTP: " + otp);
	}

}
