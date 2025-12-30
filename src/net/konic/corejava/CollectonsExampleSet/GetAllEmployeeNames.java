package net.konic.corejava.CollectonsExampleSet;
import java.util.*;
public class GetAllEmployeeNames {


	    List<String> getEmployeeNames() {

	    	EmployeeCount emp = new EmployeeCount();
	        emp.setId(101);
	        emp.setName("Ayaan");
	        emp.setDept("IT");

	        EmployeeCount emp1 = new EmployeeCount();
	        emp1.setId(102);
	        emp1.setName("Rahim");
	        emp1.setDept("HR");

	        EmployeeCount emp2 = new EmployeeCount();
	        emp2.setId(103);
	        emp2.setName("Sara");
	        emp2.setDept("Finance");

	      
	        List<String> names = new ArrayList<>();
	        names.add(emp.getName());
	        names.add(emp1.getName());
	        names.add(emp2.getName());

	        return names;
	    }

	    public static void main(String[] args) {

	        GetAllEmployeeNames obj = new GetAllEmployeeNames();

	        List<String> result = obj.getEmployeeNames();

	        System.out.println(result);
	    }
	}



