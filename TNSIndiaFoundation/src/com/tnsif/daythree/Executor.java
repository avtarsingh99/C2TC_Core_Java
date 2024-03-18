package com.tnsif.daythree;

import java.util.Scanner;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name,city;
		int id;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Detail");
		System.out.println("Enter Customer Name");
		name= sc.nextLine();
		System.out.println("Enter Customer City");
		city=sc.nextLine();
		System.out.println("Enter Customer Id");
		id=sc.nextInt();
		Customer obj = new Customer();
		obj.setCustomerName(name);
		obj.setCity(city);
		obj.setId(id);;
		System.out.println(obj);
		
		Customer obj1=new Customer(name,city,id);
		System.out.println(obj1);
		
	}

}
