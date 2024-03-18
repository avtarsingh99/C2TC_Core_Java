package com.tnsif.dayeleven;

public abstract class Shape {
	
	float area;
	
	// abstract method
	abstract void calArea();  // abstract methods don't have a body
	
	// Concrete method
	void show() {			// concrete methods always have body
		
		System.out.println("Area of the shape is =  "+ area);
	}

}
