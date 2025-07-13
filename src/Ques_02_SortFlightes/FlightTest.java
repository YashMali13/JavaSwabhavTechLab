package Ques_02;

import java.util.ArrayList;
import java.util.Collections;

public class FlightTest {
public static void main(String[] args) {
	ArrayList <Flight> list = new ArrayList<>();
	
	list.add(new Flight("IndiGo", 4500));
    list.add(new Flight("Air India", 6200));
    list.add(new Flight("Vistara", 5100));
    list.add(new Flight("SpiceJet", 3900));
    list.add(new Flight("Akasa Air", 4700));
    
    System.out.println("Original Flight List:");
    System.out.println(list);
    
    Collections.sort(list,new Highestfarefirst());
    System.out.println("\nSorted by Fare (Descending):");
    System.out.println(list);
    
}
}
