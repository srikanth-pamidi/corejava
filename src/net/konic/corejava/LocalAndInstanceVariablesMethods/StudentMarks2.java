package net.konic.corejava.LocalAndInstanceVariablesMethods;

public class StudentMarks2 {
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

	public void setMarks(int m) {

		marks = m;

	}

	public String checkResult() {
		if (marks >= 35) {
			return "Pass";
		} else {
			return "Fail";
		}
	}

	public static void main(String[] args) {
		StudentMarks2 sm = new StudentMarks2();
		sm.setMarks(30);
		sm.checkResult();
		String reuslt = sm.checkResult();
		System.out.println("Result : " + reuslt);

	}

}
