package net.konic.corejava.arrays;
/*
Q3. Find AverageOfArrayElements

Question:
Calculate average of array elements.
Input
Array: 10 20 30 40
Output
Average = 25
*/

public class AverageOfArrayElements {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40 };
		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];
		}
		int avg = sum / a.length;
		System.out.println("Sum " +sum);
		System.out.println("Total Elements "+a.length);
		System.out.println("Average = " + avg);
	
	}
}
