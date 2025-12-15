package net.konic.corejava.Constructors;

public class OnlineCoursEnrollmentAllConcepts {
	
	/*
	 * 10. Online Cours Enrollment All Concepts)
	 * 
	 * Input: Student="Akila", Course="Java", Fee=15000
	 * 
	 * Output: Akila Enrolled Course: Java Fee: 15000 Platform: Udemy
	 * 
	 * ✳ Task:
	 * 
	 * Constructor: set student name
	 * 
	 * Parameterized constructor for course details
	 * 
	 * Static variable platformName
	 * 
	 * Static method changePlatform()
	 */

	String student;
	String course;
	int fee;

	static String platformName = " Udemy";

	public OnlineCoursEnrollmentAllConcepts(String name, String coursename, int a) {
		student = name;
		course = coursename;
		fee = a;
	}

	public static void changePlatform(String newPlatform) {
		platformName = newPlatform;

	}
	
	public static void main(String[] args) {
		OnlineCoursEnrollmentAllConcepts obj = new OnlineCoursEnrollmentAllConcepts("Akhila ","Java",15000);
		
		System.out.println("Student Name : "+obj.student);
		System.out.println("Course Name : "+obj.course);
		System.out.println("Course Fee : "+obj.fee);
		
		
		
		
		
		
		
	}

}
