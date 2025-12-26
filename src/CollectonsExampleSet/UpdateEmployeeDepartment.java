package CollectonsExampleSet;
import java.util.*;
/*
 * Q4. UpdateEmployeeDepartment

Question:
Create a method that updates department of employee at index 2.

Output:

Updated Employee: 103-Sara-Admin
 */

public class UpdateEmployeeDepartment {
	

	EmployeeSet addDetails(int index){
			
		EmployeeSet emp = new EmployeeSet();
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
				
				List<EmployeeSet> obj = new ArrayList<> ();
				obj.add(emp);
				obj.add(emp1);
				obj.add(emp2);
				
				EmployeeSet e =obj.get(index);
		        e.setDept("Admin");

		        return e;
		    }

		    public static void main(String[] args) {

		        UpdateEmployeeDepartment obj1 = new UpdateEmployeeDepartment();
		       EmployeeSet e =  obj1.addDetails(2);
		       System.out.println("Updated Employee: "+e);
		        
		   
			
			
		}
		}

