package net.konic.corejava.StringBuffer_StringBilder;

public class StringSession {

	
	 
	    public static void main(String[] args) {
	 
	        System.out.println("---- BASIC STRING OPERATIONS ----");
	        String name = "Konic";
	 
	        System.out.println("Original String: " + name);
	        System.out.println("Length: " + name.length());
	        System.out.println("Uppercase: " + name.toUpperCase());
	        System.out.println("Lowercase: " + name.toLowerCase());
	        System.out.println("Char at index 1: " + name.charAt(1));
	        System.out.println("Contains 'on': " + name.contains("on"));
	 
	        System.out.println("\n---- == VS equals() ----");
	        String s1 = "Java";
	        String s2 = "Java";
	        String s3 = new String("Java");
	 
	        // == checks reference (memory)
	        System.out.println("s1 == s2 : " + (s1 == s2));
	        System.out.println("s1 == s3 : " + (s1 == s3));
	 
	        // equals() checks content
	        System.out.println("s1.equals(s3): " + s1.equals(s3));
	 
	        System.out.println("\n---- STRING IMMUTABILITY PROOF ----");
	        String msg = "Hello";
	 
	        // Trying to modify string
	        msg.concat(" World");
	 
	        // Original string not changed
	        System.out.println("After concat without reassignment: " + msg);
	 
	        // Correct way (new object created)
	        msg = msg.concat(" World");
	        System.out.println("After reassignment: " + msg);
	 
	        System.out.println("\n---- STRING CONSTANT POOL (SCP) ----");
	        String a = "Hotel";
	        String b = "Hotel";
	 
	        // Both refer to same SCP object
	        System.out.println("a == b : " + (a == b)); // true
	 
	        System.out.println("\n---- STRING LITERAL VS new STRING ----");
	        String x = "Room";
	        String y = "Room";
	        String z = new String("Room");
	 
	        System.out.println("x == y : " + (x == y));
	        System.out.println("x == z : " + (x == z));
	        System.out.println("x.equals(z): " + x.equals(z)); // true
	 
	        System.out.println("\n---- REAL-TIME SECURITY EXAMPLE ----");
	        String password = "admin123";
	 
	        // Attempt to change password
	        password.concat("hack");
	 
	        // Password remains unchanged (immutability)
	        System.out.println("Password after hack attempt: " + password);
	 
	        System.out.println("\n---- PROGRAM END ----");
	    }
	}


