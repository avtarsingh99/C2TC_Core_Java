package com.tnsif.dayfour;

// is A relationship
public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee("Rahul", 100, "Sales");
		
		Manager m = new Manager("Ankit", 102, "Backend", 5);
		
		System.out.println(e);     
		System.out.println(m);
	}

}
