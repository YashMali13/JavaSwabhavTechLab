package StremOperatio;

import java.time.chrono.MinguoChronology;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Stremdemo1 {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	List<String >listString = Arrays.asList("Yash", "Jay","Aman","Om","Sahil","Ashuu");
	listString.stream().min(Comparator.comparing(String::length)).ifPresent(System.out::println);
	listString.stream().max(Comparator.comparing(String::length)).ifPresent(System.out::println);
//	listString.stream().min(Comparator.comparingDouble(String::compareToIgnoreCase)).ifPresent(System.out::println);
	
	
	
	List<Integer >listNo = Arrays.asList(2,4,6,8,10,756,34,64);
	
	listNo.stream().min(Integer::compareTo).ifPresent(System.out::println);
	listNo.stream().max(Integer::compareTo).ifPresent(System.out::println);
	
	
	
	
	List<Integer >products = Arrays.asList(1223,56564,2345,5666554,3355,334,223,22,55,7678,500,499,334);
//	4. Given a list of products, skip the first 2 products priced above ₹500 and print the rest.
	products.stream().skip(2).forEach(System.out::print);
	scanner.nextLine();
	
//	5. From a list of words, filter words longer than 3 letters and skip the first 3 of them.
	listString.stream().sorted(Comparator.comparing(String::length).reversed()).skip(3).forEach(System.out::print);
	scanner.nextLine();
//	3. From a list of integers, filter even numbers, limit to the first 4 even numbers, and calculate their total.
	//listNo.stream().filter(num-> num%2==0).limit(4).reduce(0,(a,b)->a+b).forEach(System.out::println);
	
//	4. From a list of words, sort by descending length and display only the first 3 longest words
	
	listNo.stream().peek().forEach(n-> System.out.print( n+" , "));
	
	
}

}
