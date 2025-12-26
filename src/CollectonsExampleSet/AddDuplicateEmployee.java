package CollectonsExampleSet;

import java.util.*;

public class AddDuplicateEmployee {
	
	
	int addDetails(){
		
		Employee emp = new Employee();
			emp.setName("Ayaan");
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
			
			Employee duplicate = new Employee();
			duplicate.setName("Raheem");
			duplicate.setId(102);
			duplicate.setDept("HR");
			
			Set<Employee> set = new HashSet<> ();
			set.add(emp);
			set.add(emp1);
			set.add(emp2);
			
			
			return set.size();
			
			
	}
	public static void main(String[] args) {
		AddDuplicateEmployee obj = new AddDuplicateEmployee();
		int data = obj.addDetails();
		System.out.println("Total Employees in HashSet: "+data);
	}
}
