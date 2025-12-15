package net.konic.corejava.KeyWordExp;

public class ContinueSkipNumber5 {
	public static void main(String[] args) {

		// 8) CONTINUE – Skip 5
		// Input: print 1 to 10
		// Output: 1 2 3 4 6 7 8 9 10
		// (5 skipped)

		for (int i = 0; i <= 10; i++) {

			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}

	}

}
