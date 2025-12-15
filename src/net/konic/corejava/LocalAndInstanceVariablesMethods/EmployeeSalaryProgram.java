package net.konic.corejava.LocalAndInstanceVariablesMethods;

public class EmployeeSalaryProgram {

	/*
	 * 6. Employee Salary Program
	 * 
	 * Instance variables: name, salary
	 * 
	 * Method setDetails(name, salary)
	 * 
	 * Method getYearlySalary() → return type = double
	 * 
	 * Print result in main.
	 */

	String name;
	double salary;

	public void setDetails(String empname, double empsalary) {

		name = empname;
		salary = empsalary;

	}

	public double getYearlySalary() {
		return 12 * salary;

	}

	public static void main(String[] args) {
		EmployeeSalaryProgram esp = new EmployeeSalaryProgram();
		esp.setDetails("Srikanth", 20000);
		esp.getYearlySalary();
	
double total =esp.getYearlySalary();
System.out.println("Employee Name : "+esp.name );

		System.out.println("Total yearly Salary : "+total );

	}

}
