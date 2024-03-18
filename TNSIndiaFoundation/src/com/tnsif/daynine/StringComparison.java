package com.tnsif.daynine;

public class StringComparison {

	public static void main(String[] args) {
		
		String s1 = "AVTAR";    // string constant pool (no duplication allowed)
		String s2 = "AVTAR";
		
		String s3 = new String("AVTAR");  // heap/string constant pool (duplication allowed)
		String s4 = new String("AVTAR"); 
		
         
//      == equals operator -> reference or address
		
		System.out.println("s1 == s2 "+ s1 == s2); // true
		System.out.println("s1 == s3"+ s1 == s3); // false
		System.out.println("s3 == s4 "+ s3 == s4); // false
		
// 		equal() method  -> content matching
		
		
// 		comapreTo() method  -> lexicographical comparison (Unicode values comparison)
		
		
	}

}
