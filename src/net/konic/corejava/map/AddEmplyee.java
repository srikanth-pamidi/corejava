package net.konic.corejava.map;
import java.util.*;

public class AddEmplyee {
	
	Map<Integer,Employees> adddeatils(){
		Employees obj1 = new  Employees();
		obj1.setId(101);
		obj1.setName("Ayaan");
		obj1.setDept("IT");
		
		Employees obj2 = new  Employees();
		obj2.setId(102);
		obj2.setName("Rahim");
		obj2.setDept("HR");
		
		Employees obj3 = new  Employees();
		obj3.setId(103);
		obj3.setName("Sara");
		obj3.setDept("Finance");
		
		Map<Integer,Employees> map = new HashMap<>();
		map.put(101, obj1);
		map.put(102, obj2);
		map.put(103, obj3);
		
		
		return map;
		
	}
	
	
	
public static void main(String[] args) {
	AddEmplyee a = new AddEmplyee();
	Map<Integer,Employees> details = a.adddeatils();
	System.out.println("Employee Details : "+details);
	
}
}
