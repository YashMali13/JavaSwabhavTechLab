package Ques_5;

import java.util.ArrayList;

public class TrasactionTest {
public static void main(String[] args) {
	ArrayList<Transaction> tList= new ArrayList<>();
	
	tList.add(new Transaction(1, 10000));
	tList.add(new Transaction(5, 45000));
	tList.add(new Transaction(12, 67000));
	tList.add(new Transaction(18, 246000));
	tList.add(new Transaction(67, 768000));
	tList.add(new Transaction(80, 63000));


     System.out.println("Sorted tList:");
     for (Transaction t : tList) {
         System.out.println(t);
     }
	
	
}
}
