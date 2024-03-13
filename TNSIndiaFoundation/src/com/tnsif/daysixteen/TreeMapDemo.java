package com.tnsif.daysixteen;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> students = new TreeMap<String, Integer>();
		students.put("Avtar", 21);
		students.put("Raj", 23);
		students.put("Anjali", 21);
		students.put("Sita", 22);
		
		System.out.println(students);
		
		TreeMap<Employee, String> empData = new TreeMap<Employee, String>();
		empData.put(new Employee(101, "Rahul", 60000.0f), "Gurugram");
		empData.put(new Employee(105, "Avtar", 65000.0f), "Noida");
		empData.put(new Employee(111, "Virat", 45000.0f), "Mumbai");
		empData.put(new Employee(115, "Laxmi", 70000.0f), "Pune");
		empData.put(new Employee(121, "Ritika", 55000.0f), "Banglore");
		
		System.out.println(empData);

	}

}
