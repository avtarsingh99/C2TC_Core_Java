package com.tnsif.dayfifteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie("Avengers", 9.5f, 2014, 400000.0));
		movies.add(new Movie("Bahubali", 9.3f, 2017, 500000.0));
		movies.add(new Movie("Pushpa", 8.8f, 2022, 200000.0));
		movies.add(new Movie("Avatar", 9.9f, 2010, 900000.0));
		movies.add(new Movie("Tiger", 7.5f, 2016, 100000.0));
		
		System.out.println("Original list : ");
		movies.forEach(System.out::println);
		System.out.println();
		
		Collections.sort(movies);
		
		System.out.println("After sorting on basis of year : ");
		movies.forEach(System.out::println);
		System.out.println();
		
		Collections.sort(movies, new BuissnessComparator());
		System.out.println("After sorting on basis of buissness : ");
		movies.forEach(System.out::println);
		System.out.println();
		
		Collections.sort(movies, new RatingComparator());
		System.out.println("After sorting on basis of rating : ");
		movies.forEach(System.out::println);
		System.out.println();
		
		Collections.sort(movies, new NameComparator());
		System.out.println("After sorting on basis of name : ");
		movies.forEach(System.out::println);
		System.out.println();
		

	}

}
