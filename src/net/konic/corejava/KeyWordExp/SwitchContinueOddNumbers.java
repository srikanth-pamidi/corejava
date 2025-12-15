package net.konic.corejava.KeyWordExp;

public class SwitchContinueOddNumbers {

	/*
	 * 10) SwitchContinueOddNumbers 
	 * Input: print 1 to 10
	 *  Output: 1 → ONE
	 *   3 → THREE 
	 *   5→ FIVE 
	 *   7 → ODD NUMBER 
	 *   9 → ODD NUMBER (Even numbers skipped)
	 */
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (!(i % 2 == 0)) {
				System.out.println(i+" is Odd NUmber");
			}

			
		}
	}
}