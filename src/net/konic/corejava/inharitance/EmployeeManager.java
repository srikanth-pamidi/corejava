package net.konic.corejava.inharitance;

public class EmployeeManager {
	
	 public static void main(String[] args) {
		 
	        Manager m = new Manager();
	        
	        m.name = "Srikanth";
	        m.salary = 50000;
	        m.department = "IT";

	        System.out.println("Name: " + m.name);
	        System.out.println("Salary: " + m.salary);
	        System.out.println("Department: " + m.department);
	    }

}
