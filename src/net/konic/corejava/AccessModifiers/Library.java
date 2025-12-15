package net.konic.corejava.AccessModifiers;

public class Library {
	/* 3️.Library Membership System

	Task:
	Class Library:
    static variable libraryName
	default constructor → sets “Guest Member”
	parameterized constructor → set memberName
	switch method → selectBook(int id)
	Input: id=3
	Output: Selected: Science Book
*/

	static String libraryName = "CENTRAL LIBRARY";
	String name;

	Library() {
		name = "Guest Member";
	}

	public Library(String n) {
		name = n;
	}

	public void bookId(int id) {
		switch (id) {
		case 1:
			System.out.println("Maths Book");
			break;
		case 2:
			System.out.println("Social Book");
			break;
		case 3:
			System.out.println("Science Book");
			break;
		default:
			System.out.println("Invalid ID");
		}
	}

	public static void main(String[] args) {
		System.out.println("Library Name :" + libraryName);
		Library obj = new Library("Srikanth");
		System.out.println("Member Name: " + obj.name);

		obj.bookId(3);

	}

}
