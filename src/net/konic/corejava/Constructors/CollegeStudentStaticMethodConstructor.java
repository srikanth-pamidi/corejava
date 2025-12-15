package net.konic.corejava.Constructors;

public class CollegeStudentStaticMethodConstructor {
	/*
	 * 3.College Student (StaticMethod Constructor)
	 * 
	 * Input: collegeName=“IIT Delhi”, student=("Zara",12) 
	 * Output: College Name: IIT Delhi Student: Zara Roll No: 12
	 * 
	 * ✳ Task:
	 * 
	 * Static method changeCollege()
	 * 
	 * Constructor sets name & rollNo
	 */
	static String collagename = "IIT Delhi.";
	String studentname;
	int rollnum;

	public CollegeStudentStaticMethodConstructor(String stname, int rnum) {

		studentname = stname;
		rollnum = rnum;

	}

	public static void changeCollege(String name) {

		collagename = name;

	}
	
	public static void main(String[] args) {
		CollegeStudentStaticMethodConstructor obj = new CollegeStudentStaticMethodConstructor("Srikanth",1);
		System.out.println("College Name: "+CollegeStudentStaticMethodConstructor.collagename);
		System.out.println("Student name : "+obj.studentname);
		System.out.println("Roll Number : "+obj.rollnum);
		
	}
	
	
	
	
	
	
	
}
