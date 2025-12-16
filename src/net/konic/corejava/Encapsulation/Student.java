package net.konic.corejava.Encapsulation;
/*	Q2. Student Marks Validation

Question:
Create a Student class with private marks.
Allow marks only between 0 and 100.

Input:
Enter Marks: 120
Output:
Invalid marks
*/
public class Student {

private int marks;

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	if (marks >=0 && marks <= 100) {
		this.marks = marks;
	} else {
		System.out.println("Invalid Marks.");
	}

}

public static void main(String[] args) {
	Student obj = new Student();
	obj.setMarks(188);
	int marks = obj.getMarks();
	System.out.println("Student Marks: " + marks);

}
}
