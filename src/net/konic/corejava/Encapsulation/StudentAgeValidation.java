package net.konic.corejava.Encapsulation;
/*
Question:
Create a StudentProfile class with private age.
Age must be between 5 and 100.
Input:
Enter Age: 3
Output:
Invalid age
*/

public class StudentAgeValidation {
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>=5 && age <=100) {
		this.age = age;
	}else {
		System.out.println("Invalid Age.");
	}
	}

	public static void main(String[] args) {
		StudentAgeValidation obj = new StudentAgeValidation();
		obj.setAge(3);
		int age = obj.getAge();
		
		
	}

}
