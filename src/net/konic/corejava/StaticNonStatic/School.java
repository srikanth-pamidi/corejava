package net.konic.corejava.StaticNonStatic;

public class School {
	
/*	5️⃣ Create a class School
	• instance method: printStudent()
	• static method: printSchoolName()
	Task:
	Call static method first (without object),
	then call instance method using object.
*/

static String schoolname = "GVK";
int rollnum;
String name;
int marks;

public static void sclName() {
	System.out.println("School Name : " + schoolname);

}

public void details(int r, String n, int m) {
	rollnum = r;
	name = n;
	marks = m;

	System.out.println("Student Name : " + name);
	System.out.println("Student RollNumber : " + rollnum);
	System.out.println("Student Marks :" + marks);
}

public static void main(String[] args) {
	School.sclName();
	School obj = new School();
	obj.details(1234, "Srikanth", 429);

}

}
