package com.tnsif.dayfour;

// constructors with inheritance
public class Employee {
	
	private String empName;
	private int empId;
	private String empDept;
	
	// constructors
	public Employee(String empName, int empId, String empDept) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empDept = empDept;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	// getters and setters
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empDept=" + empDept + "]";
	}
	
	
	
}
