
package net.konic.corejava.CollectonsExample;
/*
 * Q2. GetStudentbyIndex

Question:
Create a method that returns student name at given index.
Input:
Index: 2
Output:
Student at index 2: Sara
 */
import java.util.*;
public class GetStudentbyIndex {
	 static List<String> addStudents() {

	        List<String> students = new ArrayList<>();

	        students.add("Ayaan");
	        students.add("Rahim");
	        students.add("Sara");
	        students.add("John");
	        students.add("Ali");

	        return students;
	    }

	   
	    static String getStudentByIndex(int index) {

	        List<String> students = addStudents();
	        return students.get(index);
	    }

	    public static void main(String[] args) {

	        int index = 2;
	        String student = getStudentByIndex(index);

	        System.out.println("Student at index " + index + ": " + student);
	    }
	}
	
