package Ques_04;

import java.util.ArrayList;
import java.util.Collections;

public class ProductTest {
public static void main(String[] args) {
	ArrayList<Product> pLists = new ArrayList<>();
	pLists.add(new Product("Y","Yash",2000));
	pLists.add(new Product("R","ROHIT",20300));
	pLists.add(new Product("A","Aman",2400));
	pLists.add(new Product("S","Sansii",6400));
	
	System.out.println("Original Product List:");
    for (Product p : pLists) {
        System.out.println(p);
    }
    
    Collections.sort(pLists , new SortByPrice());
    
    System.out.println("\nSort by Category (A-Z), Price (Ascending):");
    for (Product p : pLists) {
        System.out.println(p);
    }
}
}
