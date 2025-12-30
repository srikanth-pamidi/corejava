package net.konic.corejava.HashMap_LinkedHashMap;

import java.util.*;

public class EmployeeLinkedHashMap {

	Map<Integer, Employees> addDeatils() {
		Employees obj1 = new Employees();
		obj1.setId(101);
		obj1.setName("Ayaan");
		obj1.setDept("IT");

		Employees obj2 = new Employees();
		obj2.setId(102);
		obj2.setName("Rahim");
		obj2.setDept("Admin");

		Employees obj3 = new Employees();
		obj3.setId(103);
		obj3.setName("Sara");
		obj3.setDept("Finance");

		Map<Integer, Employees> map = new LinkedHashMap<>();
		map.put(101, obj1);
		map.put(103, obj3);
		map.put(102, obj2);

		return map;

	}

	public static void main(String[] args) {
		EmployeeLinkedHashMap a = new EmployeeLinkedHashMap();
		Map<Integer, Employees> details = a.addDeatils();
		System.out.println("Employee Details : " + details);

	}
}
