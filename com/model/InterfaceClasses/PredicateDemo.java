package com.model.InterfaceClasses;

import java.util.function.Predicate;

public class PredicateDemo {
public static void main(String[] args) {
	Predicate<Integer> isEvenNumber = number -> number % 2 == 0;   //boolean return String ...always check the Condition
	System.out.println(isEvenNumber.test(10));
	 
	}
}
