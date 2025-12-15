package net.konic.corejava.Constructors;

public class LibraryBookIssueCopyConstructor {
	/*
	 * 6.Library Book Issue (Copy Constructor)
	 * 
	 * Input: Book1 → title="Java", author="James"
	 *  Book2 → copy of Book1
	 * 
	 * Output:
	 *  Java - James 
	 *  Java - James (copy)
	 * 
	 * ✳ Task:
	 * 
	 * Create copy constructor (accepts same class object)
	 */

String  Book1;
String author;

public LibraryBookIssueCopyConstructor(String b, String a) {
	Book1 = b;
	author = a;
}
public LibraryBookIssueCopyConstructor(LibraryBookIssueCopyConstructor book) {

	
}
public static void main(String[] args) {
	LibraryBookIssueCopyConstructor book1 = new LibraryBookIssueCopyConstructor("Java","James");
	
}
}
