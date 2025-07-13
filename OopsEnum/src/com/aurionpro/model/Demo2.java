package com.aurionpro.model;

public class Demo2 {
String name ;
static int a=10;
public void add(int a, String name ) {
	//in static method we cannot use this keyword 
	//if use static , i got error  
	this.name =name ;
	this.a= a;
}
}
