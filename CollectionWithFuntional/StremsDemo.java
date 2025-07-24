package CollectionWithFuntional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StremsDemo {
private static final List<Integer> Strem = null;

public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,4,65,4,334,5,77,5,3,4,6,3,5);
	
	
	List<Integer> stremObject =  list.stream().filter(num->num %2==1).collect(Collectors.toList());
	System.out.println(stremObject);
	
//	1. Given a list of integers, filter and print only the even numbers.
	list.stream().filter(num->num%2==0).collect(Collectors.toList()).forEach(ref ->System.out.print(ref + " , ")); 

//	2. Given a list of names, print only those that start with the letter 'A'.
	List<String> listName = Arrays.asList("Aman","amit","Yash","Sujay","AshuuBhai");
	System.out.println(listName);
	List<String>stremName =listName.stream().filter(ele->ele.startsWith("A")||ele.startsWith("a") == true ).collect(Collectors.toList());
	System.out.println(stremName);
 
//	4. Given a list of strings, filter out all empty or blank strings.
	List<String> listEmpty = Arrays.asList("Aman","","Yash",null,"Ashuu","",null);
	System.out.println(listEmpty);
	
	List<String>stremNull=listEmpty.stream().filter(elm->elm!=null &&elm.isBlank()&& elm.isEmpty()).collect(Collectors.toList());
	System.out.println(stremNull);
	
//	6. Select only passed student from a list.
	 
	
	
//	Given a list of strings, convert each to uppercase and print them.
	listName.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(name -> System.out.print(name+" , "));
	
//	2. Given a list of integers, square each number and collect the result into a new list.
	List<Integer>newList=list.stream().map(num-> num*2).collect(Collectors.toList());
	System.out.println(newList);
		
//	4. Given a list of names, prefix each name with "Mr." or "Ms." and print the result.
	listName.stream().map(str -> ("Mr/Miss "+str)).collect(Collectors.toList()).forEach(name->System.out.print(name+" , ") );
	
//	5. Given a list of product prices, apply 10% discount to each and collect the new prices.
	
	long disInt=list.stream().filter(i->i>10).distinct().count(); // use count 
	System.out.println(disInt);
	
//	
//	6.Convert all words to uppercase and count how many start with "A".
	long count =listName.stream().map(name->name.toUpperCase()).filter(name1->name1.startsWith("A")==true).count();
	System.out.println(count);
	
//	7. Given a list of product prices, apply 20% discount and count how many still cost above ₹500.
	
	List<Integer>product= Arrays.asList(1000,64455,24543,767676,63356);
	long total= product.stream().map(p->p*0.20).filter(cost->cost>500).count();
	System.out.println(total);
	
	
	
	Integer[]marks= {45,67,44,34,76,54}; ///apply the strem into the array  
	Arrays.stream(marks);  ///way 1
	
//	Stream s= Stream.of(1,3,2,9,65,"a","yash");
//	List<?> result = (List<?>) s.filter(i-> i<8).collect(Collectors.toList());
//	System.out.println(result);
	
	
	///Sort() method 
	
	list.stream().sorted().forEach(System.out::print);
	System.out.println(list);
	System.out.println("----------------------");
	

	list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
	System.out.println(list);
	
	
	
	
	
}
}
