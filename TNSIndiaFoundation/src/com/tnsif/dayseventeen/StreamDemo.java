package com.tnsif.dayseventeen;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		System.out.println(stream.count()); // will print stream count
		
		// array elements into stream
		Integer[] values = new Integer[] {2,4,6,8,10,12};
		Arrays.stream(values);

	}

}
