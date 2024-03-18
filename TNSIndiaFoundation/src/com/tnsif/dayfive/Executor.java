package com.tnsif.dayfive;

// has A relationship
public class Executor {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("Avtar");
		Address addOne = new Address("L10", "Gurugram", "Haryana", "122017");
		Address addTwo = new Address("CyberHub", "Gurugram", "Haryana", "122035");
		p1.setAdd(addOne);
		
		Person p2 = new Person("Raj", addTwo);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAdd());
		
		System.out.println(p2.getName());
		System.out.println(p2.getAdd());

	}

	
}
