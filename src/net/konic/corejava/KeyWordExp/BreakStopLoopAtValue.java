package net.konic.corejava.KeyWordExp;

public class BreakStopLoopAtValue {
	// 4) BREAK – Stop Loop at Value
	// Input: (print 1 to 10)
	// Break when number = 5
	// Output: 1 2 3 4

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}

	}
}
