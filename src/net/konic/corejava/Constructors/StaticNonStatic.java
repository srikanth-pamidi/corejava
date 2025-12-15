package net.konic.corejava.Constructors;

public class StaticNonStatic {

	static String schoolname = "GVK";
	int rollnum;
	String name;

	public void details() {

		System.out.println("Student Name : " + name);
		System.out.println("Roll Number  : " + rollnum);
		StaticNonStatic.data();
		
	}

	public static void data() {

		System.out.println("School name : " + schoolname);
	
	}

	public static void main(String[] args) {
		StaticNonStatic.data();
		StaticNonStatic obj = new StaticNonStatic();
		obj.name = "Srikanth";
		obj.rollnum = 123;
		obj.details();

	}

}
