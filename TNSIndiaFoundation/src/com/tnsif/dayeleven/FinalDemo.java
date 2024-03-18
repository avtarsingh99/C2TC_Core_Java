package com.tnsif.dayeleven;

public class FinalDemo {

	public static void main(String[] args) {
		
		// final keyword with variable
		
		final int age = 22;  
//		age = 24;       // value of final variable can't be reassigned
		
	}

}

// final keyword with class
final class Sports {  
	
	void prize() {
		System.out.print("The prize is sport itself");
	}
}

//class Cricket extends Sports{  // can't perform inheritance on final class
//	
//}

// final keyword with methods

class Alphabet{
	
	final void profit() {           
		System.out.println("The profit for FY23 is 1.4b INR");
	}
}

class Google extends Alphabet{
	
//	void profit() {  // can't override the final method
//		
//	}
}













