package com.tnsif.dayfour;

// inheriting Employee class objects
public class Manager extends Employee {
	
	private int teamSize;

	// constructors
	public Manager(String empName, int empId, String empDept, int teamSize) {
		super(empName, empId, empDept);
		this.teamSize = teamSize;
	}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String empName, int empId, String empDept) {
		super(empName, empId, empDept);
		// TODO Auto-generated constructor stub
	}

	// getters and setters
	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + ", getEmpName()=" + getEmpName() + ", getEmpId()=" + getEmpId()
				+ ", getEmpDept()=" + getEmpDept();
	}

	

	
	
	

}
