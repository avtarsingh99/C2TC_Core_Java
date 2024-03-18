package com.tnsif.dayfourteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionDemo {

	public static void main(String[] args) {
		
		
		
		// User defined object ---Generics
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student s1 = new Student(101, "Avtar", 90.87f);
		Student s2 = new Student(102, "Prity", 88.96f);
		Student s3 = new Student(103, "Akaay", 80.83f);
		Student s4 = new Student(104, "Harsh", 45.23f);
		Student s5 = new Student(105, "Anjali", 60.34f);
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		for(Student s: studentList) {
			System.out.println(s);
		}
		
		
		
//		ArrayList<Integer> list = new ArrayList();
//		
//		list.add(99);
//		list.add(80);
//		list.add(23);
//		list.add(49);
//		list.add(90);
//		list.add(90);
//		
//		System.out.print("List before sorting : ");
//		System.out.println(list);
//		System.out.print("List after sorting in Asc order : ");
//		Collections.sort(list);
//		System.out.println(list);
//		System.out.print("List after sorting in Desc order : ");
//		Collections.reverse(list);
//		System.out.println(list);
//		
//		// Lambda expression
//		Comparator<Integer> comp = (n1,n2)-> n2-n1;
//		Collections.sort(list, comp);
//		System.out.print("List after sorting in Desc order with Lambda exp : ");
//		System.out.println(list);
		
		
//		for(int element: list) {
//			System.out.println(element);
//		}
		
		// Generics 
//		ArrayList list = new ArrayList();
//		list.add(100);
//		list.add(110);
//		list.add('a');
//		list.add("Hello everyone");
//		
//		System.out.println(list);
//		list.remove(0);
//		System.out.println(list);

	}

}
