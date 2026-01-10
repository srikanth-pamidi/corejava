package net.konic.corejava.Exceptions;

public class TryAndFinally {
	public static void main(String[] args) {
		try {
			int a = 10 / 0;

		} finally {
			System.out.println("Final Block");
		}
	}

}


// when we use finally keyword it will executed 1st and after we got exception error.