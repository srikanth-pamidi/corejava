package net.konic.corejava.HashMap_LinkedHashMap;

import java.util.*;


public class Student {

	public static void main(String[] args) {
		
		StudentData obj = new StudentData();
		obj.rollNum = 101;
		obj.marks = 500;
		obj.name = "Srikanth";

		StudentData obj1 = new StudentData();
		obj1.rollNum = 102;
		obj1.marks = 600;
		obj1.name = "Siddiq";

		StudentData obj2 = new StudentData();
		obj2.rollNum = 103;
		obj2.marks = 700;
		obj2.name = "Khan";
		
		Map<Integer, StudentData> map = new HashMap<>();
		map.put(1, obj);
		map.put(2, obj1);
		map.put(3, obj2);
		
		System.out.println("Student Data : "+map);
		System.out.println("Student Data for one Key : "+map.get(1));
		System.out.println("Contains (3) Key : "+map.containsKey(3));
		System.out.println("Contains (Srikanth) value : "+map.containsValue(obj));
		System.out.println("Size : "+map.size());
		
		for (Map.Entry<Integer, StudentData> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }
		map.remove(3);
		System.out.println("After Remove (3) Key : "+map);
		System.out.println("Size : "+map.size());
		for (Map.Entry<Integer, StudentData> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }
		
		
		
		
		
	}

}
