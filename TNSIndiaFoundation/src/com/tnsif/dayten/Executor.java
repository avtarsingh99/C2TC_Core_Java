package com.tnsif.dayten;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student arr[]; // Array Declaration
		arr = new Student[5]; // Array Creation
		
		// Array initialization
		
		arr[0] = new Student(100, "Avtar");
		arr[1] = new Student(101, "Anshika");
		arr[2] = new Student(102, "Chetan");
		arr[3] = new Student(103, "Deepak");
		arr[4] = new Student(104, "Monu");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Array element "+ i + ": "+ arr[i].getRollNo() + " " + arr[i].getName());
		}

	}

}
