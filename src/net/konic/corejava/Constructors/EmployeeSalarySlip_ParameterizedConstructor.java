package net.konic.corejava.Constructors;

public class EmployeeSalarySlip_ParameterizedConstructor {
	

	/*
	 * 2. Employee Salary Slip (Parameterized Constructor)
	 * 
	 * Input: name=“srikanth”,
	 *  salary=30000 
	 * Output:
	 *  Employee: Srikanth
	 *  Monthly Salary:30000 
	 *  Yearly Salary: 360000
	 * 
	 * ✳ Task:
	 * 
	 * Use parameterized constructor to set name & salary
	 * 
	 * Method yearlySalary() returns yearly salary
	 */
	
	String name;
	int salary;

	public EmployeeSalarySlip_ParameterizedConstructor(String N, int sal) {
		name = N;
		salary = sal;
	}

	public int yearlySalary() {
		return salary * 12;

	}
public static void main(String[] args) {
	EmployeeSalarySlip_ParameterizedConstructor obj = new EmployeeSalarySlip_ParameterizedConstructor("Srikanth",30000);
	obj.yearlySalary();
	System.out.println("Employee Name : "+obj.name);
	System.out.println("Monthly Salary : "+obj.salary);
	System.out.println("Yearly Salary : "+obj.yearlySalary());
}
}
