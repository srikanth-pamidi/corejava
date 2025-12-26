package CollectonsExampleSet;

import java.util.*;

public class GetLastEmployee {

	EmployeeCount getLastEmployee() {

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

		LinkedHashSet<EmployeeCount> set = new LinkedHashSet<>();
		set.add(emp);
		set.add(emp1);
		set.add(emp2);
		return set.getLast();
	}

	public static void main(String[] args) {

		GetLastEmployee obj = new GetLastEmployee();

		EmployeeCount last = obj.getLastEmployee();

		System.out.println("Last Employee: " + last);
	}
}
