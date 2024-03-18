package com.tnsif.dayeleven;

public class Square extends Shape {
	
	float side;
	
	// constructor
	public Square(float side) {
		super();
		this.side = side;
	}

	public Square() {
		super();
		side = 2.0f;
	}

	@Override
	void calArea() {
		area = side * side;
		
	}

}
