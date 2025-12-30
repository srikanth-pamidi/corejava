package net.konic.corejava.CollectonsExampleSet;
import java.util.*;
/*
Q1. AddEmployees

Question:
Create a method that adds 3 employees into a List<Employee> and returns the list.

Output:
[101-Ayaan-IT, 102-Rahim-HR, 103-Sara-Finance]
*/

public class AddEmployees {
	
	List<Employee> addDetails(){
		
		Employee emp = new Employee();
			emp.setName("Ayaan");
			emp.setId(101);
			emp.setDept("IT");
			
			Employee emp1 = new Employee();
			emp1.setName("Raheem");
			emp1.setId(102);
			emp1.setDept("HR");
			
			Employee emp2 = new Employee();
			emp2.setName("Sara");
			emp2.setId(103);
			emp2.setDept("Finance");
			
			List<Employee> obj = new ArrayList<> ();
			obj.add(emp);
			obj.add(emp1);
			obj.add(emp2);
			
			return obj;
			
	
	}
			
	public static void main(String[] args) {

		AddEmployees obj = new AddEmployees();
		
		List<Employee> details =    obj.addDetails();
		
		System.out.println("Employee Details : "+details);
		
		
	}

}
