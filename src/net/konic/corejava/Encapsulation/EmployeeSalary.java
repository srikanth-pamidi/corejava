package net.konic.corejava.Encapsulation;
/*
Q3. EmployeeSalary Protection
Question:
Create an Employee class with private salary.
Salary must be greater than 0.
Input:
Enter Salary: 45000
Output:
Employee Salary: 45000
*/

public class EmployeeSalary {
	private double salary;
	private String name;
	
	public void EmpDteails() {
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary>=0) {
		this.salary = salary;
	}else {
		System.out.println("Invalid Output.");
	}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		EmployeeSalary obj = new EmployeeSalary();
		obj.setName("Srikanth");
		obj.setSalary(45000);
		System.out.println("Name : "+obj.getName());
		System.out.println("Salary : "+obj.getSalary());
	
		
	}

}
