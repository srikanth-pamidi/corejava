package net.konic.corejava.KeyWordExp;

import java.util.Scanner;

public class ContinueSkipInvalidEmail {

	// 6) CONTINUE – Skip Invalid Email
	// Input: ["a@gmail.com", "abc", "test@yahoo.com"]
	// Output: “a@gmail.com”, “test@yahoo.com”
	// (“abc” skipped)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3 Mails Please");
		for (int i = 0; i <= 3; i++) {
			String email = sc.nextLine();
			if (!email.contains("@"))
				continue;
			System.out.println(email);
		}

		sc.close();
	}

}
