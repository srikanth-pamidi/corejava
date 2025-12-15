package net.konic.corejava.LocalAndInstanceVariablesMethods;

public class StudentMarks {
	/*
	 * 2. Create a class StudentMarks
	 * 
	 * Instance variable: marks
	 * 
	 * Method setMarks(int m) → sets instance variable
	 * 
	 * Method checkResult() → returns "Pass" or "Fail"
	 * 
	 * Call both methods from main().
	 */

	int marks;
	

	public void setMarks(int m1) {
		marks=m1;
	}

	public String checkResult() {
		if (marks >= 35) {
			return "pass";
		} else {
			return "fail";
		}

	}

	public static void main(String[] args) {
		StudentMarks cr = new StudentMarks();
		cr.setMarks(90);
		cr.checkResult();
		String result = cr.checkResult();
		System.out.println("Result : " + result);

	}

}
