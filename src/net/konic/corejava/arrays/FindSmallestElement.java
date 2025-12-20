package net.konic.corejava.arrays;
/*
Q5. FindSmallestElement
Question:
Find the smallest number in an array.
Input
Array: 45 22 89 10
Output
Smallest Number = 10
*/
public class FindSmallestElement {
	public static void main(String[] args) {
		int[] a = {45,22,89,10};
		
		int small = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<small) {
				small = a[i];
			}
		}
		System.out.println("Small Number : "+small);
	}

}
