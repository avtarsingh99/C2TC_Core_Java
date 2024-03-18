package com.tnsif.daytwelve;

public class Outerclass {
	
	static int data = 150;
	
	class Inner{
		
		void msg() {
			System.out.print("The data is : " + data);
		}
	}

	public static void main(String[] args) {
		
//		  TestOuter1.Inner obj=new TestOuter1.Inner();  
//		  obj.msg();
		  
		  Outerclass obj = new Outerclass();
//		  obj.msg();

	}

}
