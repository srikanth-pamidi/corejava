package CollectonsExampleSet;


import java.util.*;

public class GetEmployeebyIndex {
	Employee addDetails(int index){
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
			
	
			return obj.get(index);
}

public static void main(String[] args) {
	GetEmployeebyIndex obj = new GetEmployeebyIndex();
	Employee details = obj.addDetails(1);
	System.out.println("Employee: "+details);
	
}
}
