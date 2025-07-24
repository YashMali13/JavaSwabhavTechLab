package com.model.InterfaceClasses;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierDemo {
public static void main(String[] args) {
	Supplier<Double> random= ()-> Math.random();
	System.out.println(random.get());
	
	Supplier<LocalDate> cuurectDate= ()->LocalDate.now();
	System.out.println(cuurectDate.get());
	
	
	Supplier<LocalTime> currentTime= ()->LocalTime.now();
	System.out.println(currentTime.get());
	
//	Consumer<List<String>> consumer2 = list-> list.forEach(System.out::println);   
//	consumer2.accept(Arrays.asList("User","Admin","Main"));
	
	
	  List<String> roles = Arrays.asList("User", "Admin", "Main");
      
      Supplier<String> randomRole = () -> {
          Random random1 = new Random();
          return roles.get(random1.nextInt(roles.size()));
      };

      System.out.println(randomRole.get()); 


	
	
}
}
