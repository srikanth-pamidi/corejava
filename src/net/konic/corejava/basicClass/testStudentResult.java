package net.konic.corejava.basicClass;

public class testStudentResult {
	
	public static void main(String[] args) {
		
		studentResult s = new studentResult();
		s.name="Srikanth P";
		s.rollNo=1234;
		s.telugu=99;
		s.hindi=98;
		s.english =87;
		s.maths=99;
		s.social=7;
		
        s.printResult();
		System.out.println(s.printGrade());
		
		System.out.println("================");
		
		studentResult s2 = new studentResult();
		s2.name="Asif";
		s2.rollNo=4321;
		s2.telugu=91;
		s2.hindi=98;
		s2.english =97;
		s2.maths=89;
		s2.social=88;
		
		s2.printResult();
		System.out.println(s2.printGrade());
		
		
		
		
		
	}
	

}
