package net.konic.corejava.MethodsParameters;

public class Example6 {


	// Method with int parameter & boolean return type (real-time):
	//Write a method that checks if a number is even or odd and returns true if even
	
	
	    boolean isEven(int num) {
	        return num % 2 == 0;  
	    }

	    public static void main(String[] args) {

	    	Example6 obj = new Example6();

	        boolean result = obj.isEven(11); 
	        
	        System.out.println("Is Even? " + result);
	    }
	}



