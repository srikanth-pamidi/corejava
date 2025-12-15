package net.konic.corejava.basicClass;



public class studentResult {

	public String name;
	public int rollNo;
	public int telugu;
	public int hindi;
	public int english;
	public int maths;
	public int social;

	public int totalMarks() {
		return telugu + hindi + english + maths + social;
	}

	public float avg() {
		return (float) totalMarks() / 5;

	}

	public boolean isPassed() {
		if (telugu >= 35 && hindi >= 35 && english >= 35 && maths >= 35 && social >= 35) {
			return true;

		} else {
			return false;
		}
		
	}

	public char printGrade() {

		 if (!isPassed()) {
			 
	            return 'F';
			
		}else if(avg() >= 75) {

		//	return "Grade : Student Passed in Distinction";
			return 'A';

		} else if (avg() >= 60) {
			//return "Grade : Student Passed in First Class";
			return 'B';

		} else if (avg() >= 50) {
			//return "Grade : Student Passed in Second  Class" ;
			return 'C';

		} else {
			return 'D';
		}
	}

	public void printResult() {
		
		    System.out.println("Student Name : " + name);
		    System.out.println("Roll Number : "+ rollNo);
	        System.out.println("Telugu : "+telugu );
			System.out.println("English : "+english );
			System.out.println("Hindi : "+hindi );
			System.out.println("Maths : "+maths);
			System.out.println("Social : "+social);
			System.out.println("Total Marks : " + totalMarks());
			
			if (isPassed()) {
			System.out.println("Student Passed in All Subjects.");
		} else {
			System.out.println("Student Failed in one or more Subjects.");
		}

	}

}
