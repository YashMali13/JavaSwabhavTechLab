package Ques_03;

import java.util.ArrayList;
import java.util.Collections;

public class MovieTest {
public static void main(String[] args) {
	ArrayList<Movie> movies = new ArrayList<>();
	
	 movies.add(new Movie("GOT", 2021));
     movies.add(new Movie("Panchayat", 2023));
     movies.add(new Movie("Scam", 2023));
     movies.add(new Movie("Kota Factory", 2020));
     movies.add(new Movie("Mirzapur", 2010));
 
	
     System.out.println(" Movie List: ");
     System.out.println(movies);
     
     Collections.sort(movies , new MovieYearThenTitleComparator());
     System.out.println("\nSorted by Year (Descending), then Title (Ascending):");
     System.out.println(movies);
}
}
