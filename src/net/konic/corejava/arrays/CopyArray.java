package net.konic.corejava.arrays;

public class CopyArray {

	public static void main(String[] args) {

        int[] a = {10, 20, 30};
        int[] b = new int[3];

      
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        System.out.print("Copied Array: ");

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
