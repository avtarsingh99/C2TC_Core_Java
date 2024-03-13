package com.tnsif.daysixteen;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		
		TreeSet<String> courses = new TreeSet<String>();
		courses.add("C++");
		courses.add("JAVA");
		courses.add("Python");
		courses.add("JavaScript");
		
		System.out.println(courses);
		
		// TreeSet holding user defined objects
		TreeSet<Employee> company = new TreeSet<Employee>();
		company.add(new Employee(123, "Rahul", 50000.0f));
		company.add(new Employee(223, "Aakash", 60000.0f));
		company.add(new Employee(333, "Mohit", 40000.0f));
		company.add(new Employee(433, "Deepak", 70000.0f));
		company.add(new Employee(523, "Sahil", 65000.0f));
		
		company.forEach(System.out::println);

	}

}
