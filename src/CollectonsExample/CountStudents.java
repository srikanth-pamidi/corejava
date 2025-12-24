package CollectonsExample;

import java.util.*;
/*
Q3. CountStudents
Question:
Create a method that returns total number of students.
Output:
Total Students: 5
*/

public class CountStudents {
	List<String> students = new ArrayList<>();

	public int total() {
		
    students.add("Ayaan");
    students.add("Rahim");
    students.add("Sara");
    students.add("John");
    students.add("Ali");
	return students.size();

    
}
	public static void main(String[] args) {
		CountStudents obj = new CountStudents();
		
		int total = obj.total();
		System.out.println("Total Student count : "+total);
	}
}
