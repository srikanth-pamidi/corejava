package net.konic.corejava.StaticNonStatic;

public class Employee {
	/* 3. Create a class Employee
	• static variable companyName
	• instance variables: empId, empName
	• constructor sets instance values
	Task: Call showDetails() and print.
	Input example: 101, "Anees"
	Output: Employee details + company name
*/
	
	static String companyname = "TCS";
	int empId;
	String empName;

	public   Employee(int emp, String empname) {
		empId = emp;
		empName = empname;

	}
	public void details() {
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Name : "+empId);
	}

	public static void name() {
		System.out.println("Company name : " + companyname);

	}

	public static void main(String[] args) {
		Employee obj = new Employee(101,"Anees");
		Employee.name();
		obj.details();
		
		
		
		
	}

}
