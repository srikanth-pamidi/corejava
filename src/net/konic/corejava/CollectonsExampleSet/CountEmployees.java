package net.konic.corejava.CollectonsExampleSet;
import java.util.*;
public class CountEmployees {

		int addDetails(){
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
				
		
				return obj.size();
	}

		public static void main(String[] args) {
			CountEmployees obj = new CountEmployees();
			int count = obj.addDetails();
			System.out.println("Employee Count : "+count);
			
			
		}
		}

		
		
		
		
		


