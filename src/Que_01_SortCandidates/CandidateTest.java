package Que_01;
import java.util.*;

public class CandidateTest {
	 public static void main(String[] args) {
	        ArrayList<Candidate> list = new ArrayList<>();

	  
	        list.add(new Candidate("Yash", 24));
	        list.add(new Candidate("Ashwini", 30));
	        list.add(new Candidate("Jay", 20));
	        list.add(new Candidate("Durgesh", 25));
	        list.add(new Candidate("Jayesh", 22));
	        list.add(new Candidate("Ashwini", 28));

	        System.out.println("Original List:");
	        System.out.println(list);

	        System.out.println("\nSorted by Name, then Age:");
	        Collections.sort(list, new sortNameThenAge());
	        System.out.println(list);
	    }
}




