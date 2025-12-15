package net.konic.corejava.polymorphism;

public class StudentRegistration {
/*	
	QUESTION:
		Overload register() to accept 1, 2, or 3 parameters.

		INPUT:
		register("Rahul")
		register("Rahul", 20)
		register("Rahul", 20, "Hyderabad")

		OUTPUT:
		Registered: Rahul
		Registered: Rahul, Age: 20
		Registered: Rahul, Age: 20, City: Hyderabad
*/
	void register(String n) {
		System.out.println("Registered: "+n);
	}
	void register (String n,int a) {
		System.out.println("Registered: "+n+", Age: "+a);
	}
	void register(String n,int a,String b) {
		System.out.println("Registered: "+n+", Age: "+a+", City: "+b);
	}
	public static void main(String[] args) {
		StudentRegistration obj = new StudentRegistration();
		obj.register("Rahul");
		obj.register("Rahul", 20);
		obj.register("Rahul", 20, "Hyderabad");
	}
}
