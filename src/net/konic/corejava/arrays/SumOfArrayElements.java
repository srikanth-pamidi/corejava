package net.konic.corejava.arrays;

/*Find SumOfArrayElements
Question:
Find the sum of all elements in an integer array.
Input
Array: 10 20 30 40
Output
Sum = 100
*/

public class SumOfArrayElements {
	public static void main(String[] args) {
		
	/*	
int[] a=new int [4];
a[0]=10;
a[1]=20;
a[2]=30;
a[3]=40;

		*/
		
		int[] a = {10,20,30,40};
		int total = 0;
		
		for (int i = 0; i < a.length; i++) {
			total = total + a[i];

		}
		System.out.println("Sum = " + total);
	}

}
