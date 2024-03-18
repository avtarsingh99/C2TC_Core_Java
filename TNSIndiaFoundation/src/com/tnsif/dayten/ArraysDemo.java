package com.tnsif.dayten;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intArr[] = {10, 43, 23, 53, 24, 33, 443, 334, 224};
		
		System.out.println("Before sorting "+ Arrays.toString(intArr));
		
		Arrays.sort(intArr);
		
		System.out.println("After sorting "+ Arrays.toString(intArr));
		
//		binary search in Arrays
		System.out.println("Element 43 is found at index " + Arrays.binarySearch(intArr, 43));

	}

}
