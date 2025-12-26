package CollectonsExampleSet;


import java.util.*;

public class StoresEmployeesData {
	
	
	
	
	Set<EmployeeSet> addDetails(){
		EmployeeSet emp = new EmployeeSet();
			emp.setName("Ayaan");
			emp.setName("Ayaan");
			emp.setId(101);
			emp.setDept("IT");
			
			EmployeeSet emp1 = new EmployeeSet();
			emp1.setName("Raheem");
			emp1.setId(102);
			emp1.setDept("HR");
			
			EmployeeSet emp2 = new EmployeeSet();
			emp2.setName("Sara");
			emp2.setId(103);
			emp2.setDept("Finance");
			
			Set<EmployeeSet> set = new HashSet<> ();
			set.add(emp);
			set.add(emp1);
			set.add(emp2);
			
			return set;
			
			
	}
	public static void main(String[] args) {
	StoresEmployeesData obj = new StoresEmployeesData();
	Set<EmployeeSet> data = obj.addDetails();
	System.out.println("Employee Data :"+data);
	
	Set<String> set1 = new HashSet<> ();
	set1.add("Ayaan");
	set1.add(null);
	set1.add(null);
	set1.add("Ayaan");
	System.out.println(set1);
	
	}
			

}

