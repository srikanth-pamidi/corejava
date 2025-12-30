package net.konic.corejava.CollectonsExampleSet;
import java.util.*;
public class CheckEmployeeExists {
	
	    boolean checkEmployee(int empId) {

	        EmployeeSet emp = new EmployeeSet();
	        emp.setId(101);
	        emp.setName("Ayaan");
	        emp.setDept("IT");

	        EmployeeSet emp1 = new EmployeeSet();
	        emp1.setId(102);
	        emp1.setName("Raheem");
	        emp1.setDept("HR");

	        EmployeeSet emp2 = new EmployeeSet();
	        emp2.setId(103);
	        emp2.setName("Sara");
	        emp2.setDept("Finance");

	        Set<EmployeeSet> set = new HashSet<>();
	        set.add(emp);
	        set.add(emp1);
	        set.add(emp2);

	        
	        EmployeeSet search = new EmployeeSet();
	        search.setId(empId);

	        return set.contains(search);
	    }

	    public static void main(String[] args) {

	        CheckEmployeeExists obj = new CheckEmployeeExists();

	        boolean found = obj.checkEmployee(101);

	        if (found) {
	            System.out.println("Employee Found");
	        } else {
	            System.out.println("Employee Not Found");
	        }
	    }
	}



