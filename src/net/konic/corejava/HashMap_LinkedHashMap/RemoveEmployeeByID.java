package net.konic.corejava.HashMap_LinkedHashMap;

import java.util.*;

public class RemoveEmployeeByID {
	
	Map<Integer, Employees> removeEmp() {
		Employees obj1 = new Employees();
		obj1.setId(101);
		obj1.setName("Ayaan");
		obj1.setDept("IT");

		Employees obj2 = new Employees();
		obj2.setId(102);
		obj2.setName("Rahim");
		obj2.setDept("HR");

		Employees obj3 = new Employees();
		obj3.setId(103);
		obj3.setName("Sara");
		obj3.setDept("Finance");
		
		Map<Integer, Employees> map = new HashMap<>();
		map.put(101, obj1);
		map.put(102, obj2);
		map.put(103, obj3);
		
		
		 map.remove(101);
		 return map;
		

}
	public static void main(String[] args) {
		RemoveEmployeeByID obj = new RemoveEmployeeByID();
		Map<Integer, Employees> remove = obj.removeEmp();
		System.out.println("After Remove 101 Emplye : "+remove);
	}
}