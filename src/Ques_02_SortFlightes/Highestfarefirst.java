package Ques_02;

import java.util.*;

public class Highestfarefirst implements Comparator<Flight> {

	@Override
	public int compare(Flight f1, Flight f2) {
		// TODO Auto-generated method stub
		return Double.compare(f2.getFare(), f1.getFare());
	}

}
