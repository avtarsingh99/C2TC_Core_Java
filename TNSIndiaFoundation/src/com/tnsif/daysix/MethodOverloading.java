package com.tnsif.daysix;

public class MethodOverloading {
	
	int addition(int a, int b) {
		 return a+b;
	 }
	 int addition(int a,float b) {
		 return (int)(a+b) ;
	 }
	 float addition(float a, float b)
	 {
		 return a+b;
	 }
	 float addition(float a, int b)
	 {
		 return (a+b);
	 }
	
}
