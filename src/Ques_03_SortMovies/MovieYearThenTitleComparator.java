package Ques_03;

import java.util.Comparator;

public class MovieYearThenTitleComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		int yearCompare = Integer.compare(m2.getYear(), m1.getYear());
		if(yearCompare != 0){
			return yearCompare;
		}
		return m1.getName().compareToIgnoreCase(m2.getName());
	}

}
