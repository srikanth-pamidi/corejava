package net.konic.corejava.map;

import java.util.*;

public class EmployeeHashMap {

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<>();

		map.put(1, new Employee(1, "Srikanth", "IT"));
		map.put(2, new Employee(2, "Wasif", "HR"));
		map.put(3, new Employee(3, "Hussain", "Finance"));
		map.put(3, new Employee(3, "Hussain Khan", "Finance"));
		System.out.println(map);
		System.out.println("Employee with ID 1 : " + map.get(1));
		System.out.println("Employee value Exist or Not : " + map.containsValue(new Employee(1, "Srikanth", "IT")));

		if (map.containsKey(1)) {
			System.out.println("Employee Exist");
		} else {
			System.out.println("Employee not Exist");
		}

		for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " | Value " + entry.getValue());
		}

		for (Integer id : map.keySet()) {
			System.out.println(id);
		}

		for (Employee values : map.values()) {

			System.out.println(values);
		}
		map.size();
		System.out.println();
		map.remove(1);
		System.out.println("\nAfter Rmove : " + map);
		map.size();
		System.out.println(map);
		map.clear();
		System.out.println("After Clear :" + map);
		map.size();
		System.out.println(map);

		System.out.println(map.isEmpty());
	}

}
