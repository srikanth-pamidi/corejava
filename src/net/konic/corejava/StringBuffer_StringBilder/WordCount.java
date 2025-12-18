package net.konic.corejava.StringBuffer_StringBilder;
/*
 Q15. WordCount

Input
Sentence: Welcome to Konic Technologies
Output
Word Count: 4
 */
public class WordCount {
	public static void main(String[] args) {
		String name = "Welcome to Konic Technologies";
		System.out.println("Word Count: " + name.split(" ").length);
		
	}

}
