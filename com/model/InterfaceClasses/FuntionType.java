package com.model.InterfaceClasses;

import java.util.function.Function;

public class FuntionType {
public static void main(String[] args) {
	Function<Integer, Integer> result = (num)-> num*num ;
	System.out.println(result.apply(5));
}
}
