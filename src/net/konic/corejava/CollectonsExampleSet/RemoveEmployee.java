package net.konic.corejava.CollectonsExampleSet;
import java.util.*;
public class RemoveEmployee {
	

    Set<EmployeeLinkedHashSet> removeEmployeeById() {

    	EmployeeLinkedHashSet e1 = new EmployeeLinkedHashSet();
        e1.setId(101);
        e1.setName("Ayaan");
        e1.setDept("IT");

        EmployeeLinkedHashSet e2 = new EmployeeLinkedHashSet();
        e2.setId(102);
        e2.setName("Rahim");
        e2.setDept("HR");

        EmployeeLinkedHashSet e3 = new EmployeeLinkedHashSet();
        e3.setId(103);
        e3.setName("Sara");
        e3.setDept("Finance");

        Set<EmployeeLinkedHashSet> set = new LinkedHashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);

       
        set.remove(e1);

        return set;  
    }

    public static void main(String[] args) {

        RemoveEmployee obj = new RemoveEmployee();

        Set<EmployeeLinkedHashSet> result = obj.removeEmployeeById();

        System.out.println("Remaining Employees: " + result);
    }
}


