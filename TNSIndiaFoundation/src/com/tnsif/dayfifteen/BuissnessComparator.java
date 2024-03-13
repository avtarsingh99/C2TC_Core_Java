package com.tnsif.dayfifteen;

import java.util.Comparator;

public  class BuissnessComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		
		return Double.compare(m1.getBuissness(), m2.getBuissness());
	}
	
}
