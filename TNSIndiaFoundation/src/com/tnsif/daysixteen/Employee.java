package com.tnsif.daysixteen;

public class Employee implements Comparable {
	
	private int ID;
	private String name;
	private float salary;
	
	// getters and setters
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	// constructor
	public Employee(int iD, String name, float salary) {
		super();
		ID = iD;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Object o) {

		Employee s = (Employee) o;
		return this.name.compareTo(s.name);
	}
	
	
	

}
