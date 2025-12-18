package net.konic.corejava.String;

public class StringMethods {

    public static void main(String[] args) {

        // ================= STRING =================
        System.out.println("===== STRING METHODS =====");

        // String is immutable
        String s = "Java Programming";

        // Returns total number of characters
        System.out.println("length() : " + s.length()); 
        // Output: 16

        // Returns character at given index
        System.out.println("charAt(0) : " + s.charAt(0)); 
        // Output: J

        // Returns substring from index 5
        System.out.println("substring(5) : " + s.substring(5)); 
        // Output: Programming

        // Checks whether string contains given value
        System.out.println("contains(\"Java\") : " + s.contains("Java")); 
        // Output: true

        // Compares content
        System.out.println("equals() : " + s.equals("Java Programming")); 
        // Output: true

        // Ignores case while comparing
        System.out.println("equalsIgnoreCase() : " + s.equalsIgnoreCase("java programming")); 
        // Output: true

        // Converts to uppercase
        System.out.println("toUpperCase() : " + s.toUpperCase()); 
        // Output: JAVA PROGRAMMING

        // Converts to lowercase
        System.out.println("toLowerCase() : " + s.toLowerCase()); 
        // Output: java programming

        // Replaces word (creates new string)
        System.out.println("replace() : " + s.replace("Java", "Core Java")); 
        // Output: Core Java Programming

        // Checks starting word
        System.out.println("startsWith(\"Java\") : " + s.startsWith("Java")); 
        // Output: true

        // Checks ending word
        System.out.println("endsWith(\"Programming\") : " + s.endsWith("Programming")); 
        // Output: true

        // Removes leading and trailing spaces
        System.out.println("trim() : " + "  Java  ".trim()); 
        // Output: Java

        // Splits string and returns array length
        System.out.println("split(\" \").length : " + s.split(" ").length); 
        // Output: 

        // Returns index of character
        System.out.println("indexOf('P') : " + s.indexOf('P')); 
        // Output: 5

        // ================= STRINGBUILDER =================
        System.out.println("\n===== STRINGBUILDER METHODS =====");

        // StringBuilder is mutable
        StringBuilder sb = new StringBuilder("Java");

        // Appends text (same object modified)
        sb.append(" World");
        System.out.println("append() : " + sb); 
        // Output: Java World

        // Inserts text at index
        sb.insert(4, " SE");
        System.out.println("insert() : " + sb); 
        // Output: Java SE World

        // Replaces characters between indexes
        sb.replace(0, 4, "Core");
        System.out.println("replace() : " + sb); 
        // Output: Core SE World

        // Deletes characters between indexes
        sb.delete(4, 7);
        System.out.println("delete() : " + sb); 
        // Output: Core World

        // Reverses the string
        sb.reverse();
        System.out.println("reverse() : " + sb); 
        // Output: dlroW eroC

        // Returns current capacity
        System.out.println("capacity() : " + sb.capacity()); 
        // Output: (depends on JVM, usually 16+)

        // Returns length
        System.out.println("length() : " + sb.length()); 
        // Output: 10

        // ================= STRINGBUFFER =================
        System.out.println("\n===== STRINGBUFFER METHODS =====");

        // StringBuffer is mutable and thread-safe
        StringBuffer sbf = new StringBuffer("Java");

        // Appends text
        sbf.append(" World");
        System.out.println("append() : " + sbf); 
        // Output: Java World

        // Inserts text
        sbf.insert(4, " SE");
        System.out.println("insert() : " + sbf); 
        // Output: Java SE World

        // Replaces text
        sbf.replace(0, 4, "Core");
        System.out.println("replace() : " + sbf); 
        // Output: Core SE World

        // Deletes text
        sbf.delete(4, 7);
        System.out.println("delete() : " + sbf); 
        // Output: Core World

        // Reverses text
        sbf.reverse();
        System.out.println("reverse() : " + sbf); 
        // Output: dlroW eroC

        // Returns length
        System.out.println("length() : " + sbf.length()); 
        // Output: 10
    }
}