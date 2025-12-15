package net.konic.corejava.ConditionalOperators;

public class NestedIf {

	
	public static void main(String[] args) {
		
		int m1=67;
		int m2=77;
		int m3=86;
		int pm=35;
		int tm=m1+m2+m3;
		float avg=tm/3f;
		

		if( m1 >= pm && m2>= pm && m3>=pm) {
		
		System.out.println("All Pass.");
		
		
		 if(avg>=75) {
			System.out.println("Grade : Distinction");
		}else if (avg>=60){
			System.out.println("Grade : First Class");
			
		}else if (avg>=50){
			System.out.println("Grade : Second Class");
		
	     }else {
		System.out.println("Grade : Third Class");
	     }
		}else {
			System.out.println("Failed.");
	 }
	    

	}
	}

