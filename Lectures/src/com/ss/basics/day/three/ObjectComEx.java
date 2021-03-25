/**
 * 
 */
package com.ss.basics.day.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Hassankh
 *
 */
public class ObjectComEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m2 = new Movie("Age of Ultron", 2019, 7.5F);
		Movie m1 = new Movie("Avengers", 2013, 9.5F);
		Movie m4 = new Movie("Endgame", 2019, 4.5F);
		Movie m3 = new Movie("Infinity War", 2015, 9.5F);
		
		List<Movie> avengers = new ArrayList<>();
		avengers.add(m2);
		avengers.add(m4);
		avengers.add(m1);
		avengers.add(m3);
		
		for(Movie m: avengers) {
			System.out.println(m.toString());
		}
		Collections.sort(avengers);
		System.out.println("---------------------------------");
		for(Movie m: avengers) {
			System.out.println(m.toString());
		}
	}

}
