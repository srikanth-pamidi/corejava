package CollectonsExample;

import java.util.*;

public class ListWithGenericsDemo {
 
    public static void main(String[] args) {
 
        // List with generics (type safe)
        List<String> list = new ArrayList<>();
 
        list.add("Ayaan");
        list.add("Rahim");
        // list.add(10); // Compile-time error
 
        System.out.println("List with generics: " + list);
 
        // No type casting required
        String name = list.get(0);
        System.out.println("First name: " + name);
    }
}