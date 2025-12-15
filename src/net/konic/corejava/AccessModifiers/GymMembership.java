package net.konic.corejava.AccessModifiers;

public class GymMembership {
/*	7️.Fitness Gym Membership

	Task:
	Class Gym:

	static variable gymName

	public constructor → name, age

	switch → choose membership type

	private constructor → not allowed externally


	Input: choice=1
	Output: Selected: Monthly Plan (₹500)
*/
	
	static String gymName = "FITNESS GYM WORLD";
	
	int age;
	String name;
	
	public   GymMembership (int a, String n) {
		age = a;
		name = n;
		
	}
	
	public void membership(int menu) {
		switch (menu) {
		case 1:
			System.out.println("Monthly Plan (₹500)");
			break;
		case 2:
		System.out.println("Monthly Plan (₹1000)");
		break;
		case 3:
			System.out.println("Monthly Plan (₹2000)");
			break;
			default:
				System.out.println("Invalid Plan");
			
		}
	}
			
	public static void main(String[] args) {
		System.out.println("Gym Name : "+gymName);
		GymMembership obj = new GymMembership(25,"Srikanth");
		System.out.println("Customer Name : "+obj.name);
		System.out.println("Customer Age : "+obj.age);
		obj.membership(1);
	}
}
