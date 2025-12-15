package net.konic.corejava.StaticNonStatic;

public class MathUtil {
	/*
	 * 2. Create a class MathUtil
	 *  • static method: add(a,b) 
	 *  • instance method:multiply(a,b)
	 *   Task: Try calling both from main() and 
	 *   observe: 
	 *   ✔ static method works directly 
	 *   ✔ non-static requires object
	 */

	
	int a;
	int b;
	
	public static int add(int a,int b) {
		
		return a+b;
		
	}public  int mul() {
		return a*b;
		
	}
	
	public static void main(String[] args) {
		
		MathUtil obj = new MathUtil();
		MathUtil.add(5, 5);
		int sum = MathUtil.add(5, 5);
		
		
		obj.a = 10;
		obj.b = 10;
		obj.mul();
		int m = obj.mul();
		System.out.println("Sum of A and B : "+sum);
		System.out.println("Multiple of A and B : "+m);
		
	}
}
