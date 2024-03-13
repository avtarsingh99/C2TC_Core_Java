package com.tnsif.dayfifteen;

public class Movie implements Comparable<Movie> {
	
	private String name;
	private float rating;
	private int year;
	private double buissness;
	
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getBuissness() {
		return buissness;
	}
	public void setBuissness(double buissness) {
		this.buissness = buissness;
	}
	
	// constructor
	public Movie(String name, float rating, int year, double buissness) {
		super();
		this.name = name;
		this.rating = rating;
		this.year = year;
		this.buissness = buissness;
	}
	
	// toString  method
	@Override
	public String toString() {
		return "Movie [name=" + name + ", rating=" + rating + ", year=" + year + ", buissness=" + buissness + "]";
	}
	
	@Override
	public int compareTo(Movie newMovie) {
		
		return Integer.compare(this.year, newMovie.year);
	}
	
	
	
}
