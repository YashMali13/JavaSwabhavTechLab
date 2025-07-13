package com.model.InterfaceClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
public static void main(String[] args) {
	Consumer<String> toUpperCase = s->s.toUpperCase();
	toUpperCase.accept("Yash");
	
	Consumer<List<String>> consumer2 = list-> list.forEach(System.out::println);   ///println is pass as a reference  not a funtion forEach pass as sfuntion 
	consumer2.accept(Arrays.asList("Yash","Rohit","Aman","Jyoti"));
	
	
	Consumer<List<Integer>> consumer3 = list-> list.forEach(System.out::println);  
	consumer3.accept(Arrays.asList(1,4,8,9,3,44,688,54,3324567,5));
}
}
