package com.tnsif.daynine;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String("Avtar"); //way 1 heap/string constant pool (duplicate object creation is allowed in heap)
		s.concat("Singh"); // immutable -> can't be modified
		System.out.println(s);
		
//		String s2 = "TNSIndia"; // way 2 string constant pool (no duplicate instance is allowed)
//		System.out.println(s2);
		
		// StringBuffer
//		
//		StringBuffer s2 = new StringBuffer("TNSIndia");
//		s2.append("Foundation");  // mutable -> can be modified 
//		System.out.println(s2);
		
		// string methods
		System.out.println(s.length());  // for length of string
		System.out.println(s.toLowerCase()); // to convert in lower case
		System.out.println(s.toUpperCase()); // to convert in upper case
		
		String s2 = "AVTAR";
		System.out.println(s.equals(s2));  // compare s and s2 without ignoring the case
		System.out.println(s.equalsIgnoreCase(s2)); // compare s and s2 ignoring the case
		

	}

}
