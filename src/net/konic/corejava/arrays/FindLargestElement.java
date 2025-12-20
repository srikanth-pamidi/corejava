package net.konic.corejava.arrays;
/*
Q4. FindLargestElement
Question:
Find the largest number in an array.
Input
Array: 45 22 89 10
Output
Largest Number = 89
*/
public class FindLargestElement {
public static void main(String[] args) {
	int[] a = {45,22,89,10};
	
	int large = a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>large) {
			large = a[i];
        }
	}
	System.out.println("Largest Number is : "+large);
}
}
